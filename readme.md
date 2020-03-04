##Prerequisites
You are required to have few tools before you start with using the source code.<br>
- JDK 1.8
- Maven
- Tomcat 8.5
- IDE (Recommended - Spring Tool Suite)
- Git


##To run this project follow these steps.

[STEP 1]: Download the source code to your computer.
```javascript 1.5
git clone https://github.com/mayankraghuwanshi/weatherReportSpringMVC
```
[STEP 2]: After clone run following command to download all dependencies
```java
mvn clean install
```
It will create a war file in target folder.<BR>
[STEP 3]:copy that war file to apache-tomcat/webapp folder and then run
```
catalina.sh start
```
This will host this project to localhost:8080

SCREENCHOTS-<br>
![](src/screenshots/Screenshot%20(53).png)
<br>
![](src/screenshots/Screenshot%20(54).png)
<br>
![](src/screenshots/Screenshot%20(55).png)