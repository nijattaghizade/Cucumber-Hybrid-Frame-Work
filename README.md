# CUCUMBER-HYBRID-FRAME-WORK

FRAMEWORK
Data Driven Framework
a framework where tests are executed based on set of data, framework is designed to read data from outside sources like
excel and run tests based on the data. In data driven framework we can execute the same test multiple times against
different sets of data.

Page Object Model Framework
uses the page object design pattern according to which we create a separate java class for each page of the application
Behavior Driven Framework
Keyword Driven Framework
In KDF we use keywords in outside source (excel. csv) to run our tests. Framework is designed to read the data and steps
from excel and execute actions based on it.
Once KDF is set up even non-technical testers can write and execute automated tests.
Hybrid Framework
hybrid framework is a framework uses at least two of the types given above

TOOLS
Java: My framework is written using Java language
Maven: My framework created as a maven project, maven is used to manage dependencies and also run our tests as mvn
goals from terminal
Selenium WebDriver: a library/tool/api which is used to automate the browser, it interacts with the browser.
TestNG: used to group tests using xml files, do soft and hard assertions, create test methods, run in certain order
Extent: my framework generates detailed HTML reports with is easy to read and understand to non-technical team
members. My reports have details test steps and screenshots for any failures that may occur. It can also do metrics on what
percentage is passing, failing, skipped etc.
IDE: I use IntelliJ in my current framework, but I am also quite comfortable with Eclipse with I used previously

DESIGN
Page Object model: my framework used page object model according to which I created a separate class for the pages of
my application.
PageFactory design: a design which makes it easy to access the page object class.
Below not Page factory design. it is class which has the same name as the PageFactory design:
PageFactory.initElements(driver, this)
Singleton Driver: My frameworks uses a singleton pattern to share the webdriver instance between different classes
TestBase: My framework has a testbase class which my tests extent. testbase class has the common steps for all my tests.
Configuration.feature file: used to store the important test data
Utilities: have reusable utilities which can be used across different classes of my framework

Benefits:
Easy to maintain:
• My framework uses page object model which makes it easy to maintain. for example, if I have to update any
locator, I only need to do one code change.
• I try to make my tests independent from each other. this mean if I update one test, it will not affect others and
also if one fails, others will not be affected.
Easy to extend:
• it is easy to add new test cases to my framework.
Easy to reuse:
• I have page object model, utilities which I can reuse for any tests.
Multi browser testing: My framework can run the same tests against different browsers with minimal code change. Junit,
TestNG are have their methods for multi-browser testing. Except them we use Selenium Grid
Types of tests: My framework can test the UI, database and API of the application.
Packaging: I have create different packages for different types of classes and logic. Each page package only contains classes
with same functionality.
Naming conventions: in my team we pay a lot of attention to coding standards, especially naming conventions. Classes,
methods variable are named on based on what they do and follow a standard
Page object class:
homepage, loginpage
variable:
loginButton, signOutLink
methods:
login(): these methods only used to login, not for other functionality.
