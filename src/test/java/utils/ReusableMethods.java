package utils;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TestPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static org.junit.Assert.assertTrue;

public class ReusableMethods {
    static Faker faker;
    static Actions actions;

    static Select select;


    //====== Actions ======//
    public static Actions getActions() { //getActions method
        return actions = new Actions(Driver.getDriver());
    }

    //====== Select ======//
    public static Select select(WebElement ddm) {
        return select = new Select(ddm);
    }

    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }

    public static void clickElement(WebElement element) {
        waitForVisibility(element, 9);
        element.click();

    }

    public static void isElementPresent(WebElement element) {
        waitForVisibility(element, 9);
        assertTrue(element.isDisplayed());
    }

    public static void enterKeys(WebElement element, String keys) {
        waitForVisibility(element, 9);
        element.sendKeys(keys);
    }

    public static void enterKeys(WebElement element, String keys, Boolean clear) {
        waitForVisibility(element, 9);
        if (clear) {
            element.clear();
        }
        element.sendKeys(keys);
    }

    public static Faker getFaker() { // getFaker method
        return faker = new Faker();
    }
    public static void jsclick(WebElement webElement){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        try {
            webElement.click();
        } catch (Exception e) {
            js.executeScript("arguments[0].scrollIntoView(true);", webElement);
            js.executeScript("arguments[0].click()", webElement);

        }
    }
    public static String  getValueWithJs(String elementId){
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        String value=js.executeScript("return document.getElementById('"+elementId+"').value").toString();
        return value;
    }
    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    //========ScreenShot Web Element(Bir webelementin resmini alma)=====//
    public static String getScreenshotWebElement(String name,WebElement element) throws IOException {
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        File source = element.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String wElementSS = System.getProperty("user.dir") + "/target/WElementScreenshots/" + name + date + ".png";
        File finalDestination = new File(wElementSS);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return  wElementSS;
    }
    public void clickIfItIsNotChecked(WebElement webElement){
        waitForVisibility(webElement,9);
        if(!webElement.isSelected()){
            jsclick(webElement);
        }
    }
    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickIfItIsChecked(WebElement webElement){
        waitForVisibility(webElement,9);
        if(webElement.isSelected()){
            jsclick(webElement);
        }
    }

    public boolean isNumberIsBiggerThanTheNumber(WebElement element,int numb){
        return Integer.parseInt(element.getText())>numb;
    }
    public boolean isNumberIsBiggerThanTheNumber(WebElement element,double numb){
        return Double.parseDouble(element.getText())>numb;
    }
    public static void setValueByJS(WebElement element, String key, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('" + key + "','" + text + "')", element);
    }
    //========Scroll Into View=====//
    public static void scrollIntoView(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //========ScrollBy=====//
    public static void scrollBy(long scrollY) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("window.scrollBy(0," + scrollY + ")", "");
    }
    //====== JS Scroll ====//
    public static void jsScroll(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }


}
