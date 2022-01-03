# Log4J
## Purpose:
This example displays log4j usage and configurations.
## Topics:
* Log4J
* org.apache.log4j.Logger
* log4j configuration
* .log files
* log to html configuration
## Resources:
[LoggingExamples](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/java/com/revature/log4j/LoggingExamples.java) `com.revature.log4j.LoggingExamples.java`

[log4j.properties](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/java/src/main/resources/log4j.properties) `src/main/resources/log4j.properties`
## Teaching Notes:
### Step 1
Add the log4j dependency to the pom.xml and create the log4j.properties configuration file in src/main/resources.
### Step 2
Walk through the configurations with the associates and give a high level overview of how the logger will use each configuration in the file.
### Step 3
Create the `LoggerExample` class, create the logger and build the main method. Explain the different logging levels and the configuration on the minimal level to log.
### Step 4
Open the corresponding folder in the system to show that there are no logs. Run the main method and show the logger log to the console and create the log files.
### Step 5
Open the text file in a file editor and the html file in the browser to show the log was successful.
### Step 6
Change some of the log messages to show the content in the file changes. 