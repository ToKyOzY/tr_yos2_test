# tr_yos team2 test project


<h1 align="center">
  <img src="https://raw.githubusercontent.com/cucumber/cucumber-js/4c80df1a25c3bb25dc57d65ab8e5ee842a469826/docs/images/logo.svg" alt="">
  <br>
  Cucumber
</h1>


In this project, IntelliJ is used as IDE, Used Maven repo to configure the project, the coding language in which the project is written is Java, the `Cucumber BDD` Framework was used, and the `POM` (Page Object Model) design model was used in accordance with the `OOP` (Object Oriented Programming) concept in the Cucumber Framework.

* Created test cases, and test scenarios according to acceptance criteria.
* Used `excel` for test cases, test scenarios, and following test steps.
* This link is Excel sheets https://docs.google.com/spreadsheets/d/1TQgBvSY5eYa79novi0Cy7IItOibDo5_wHw5BAELUunA/edit?usp=sharing
 <hr>
<img src="https://github.com/ToKyOzY/tr_yos2_test/blob/master/Screenshot_3.png" alt="">
<hr>
  
* Used `maven` as project configuration tool.
* In the UI, `Selenium Webdriver` was used.
<hr>
<img src="https://github.com/ToKyOzY/tr_yos2_test/blob/master/Screenshot_2.png" alt="">
<hr>
 
# Description of Project Structure
* The POM structure you see below was used;

<hr>
<img src="https://github.com/ToKyOzY/tr_yos2_test/blob/master/Screenshot_1.png" alt="">
<hr>

* Data Driven feature has been added to our Behavior Driven Development Framework by using Scenario Outline in feature files. 
Because we can develop this Test Case by sending as much Data as we want to Scenario Outline and we will gain a Data-oriented feature.

* `Data Driven Framework` is a method of separating datasets from test case. Once the datasets leave the test case, they can be easily modified for specific functionality without changing the code. It is used to fetch test cases and packages from external files such as Excel, .csv, .xml or some database tables.

* `Hybrid Framework` is a concept where we take advantage of both Keyword driven framework and Data Driven Framework. It is an easy-to-use framework that allows manual testers to create test cases just by looking at keywords, test data, and object storage without coding in the framework.

# Runner File
* Thanks to the notations used in the 'Runner' class, both the reports of the feature files that we can run here and the creation of the desired methods can be provided.
* Runs from runner by adding tags to scenarios.

# Pretty Report 

<hr>
<img src="https://github.com/ToKyOzY/tr_yos2_test/blob/master/Screenshot_4.png" alt="">
<hr>

# Resources
* Resources is the file containing the feature files, where the feature is created using `BDD` (Behavior Driven Development) and using `Gherking` language. Generated steps
  It provides the opportunity to create it as a direct method, thus making it more understandable for people who have nothing to do with java language or software.

# pom.xml
* Thanks to `Pom`, we can place the library of the codes we actually want to use in the dependencies tag in this file, which contains the information of all our works and codes, and we can keep the updated information constantly. Thanks to this place, we can provide access to all codes.

### pages package <br/>
In this package, there are classes where we locate the web elements that we have tested. We created the PageFactory class, called the driver and used this key. We created our locates with FindBy notation to call our locations.

### utils package <br/>
This package contains our classes and methods that we constantly need.
Driver,ConfigReader,ReusableMethods,etc...

### configuration.properties <br/>
In this properties file, there are variables that we use constantly. In order to be able to call the variables that we have created as key=value in this file to other classes, we call the class we want the information to, thanks to the method in the ConfigReader class from the utilities package.

