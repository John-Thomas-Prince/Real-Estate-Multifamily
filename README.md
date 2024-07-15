# Simple CRUD System(React + Java Spring Boot)
## Evironment Setup
1. Java Development Kit (JDK)

   Download and install the latest JDK from the Oracle website(https://www.oracle.com/java/technologies/downloads/?er=221886) or use OpenJDK.
   Set the JAVA_HOME environment variable.
   After install, Go to Edit System Environment Variables in Control Panel Window and in the system section, add this url(C:\Program Files\Java\jdk-17\bin) in the path variable. 
   ```sh
   java -version
3. Node.js and npm

   Download and install the latest LTS version of Node.js from the official website.
   npm is included with Node.js.
   ```sh
   node -v
   npm -v
4. Maven

   Download and install Maven from the Apache Maven website(https://maven.apache.org/download.cgi).
   Set the MAVEN_HOME environment variable.
   After install, Go to Edit System Environment Variables in Control Panel Window and in the system section, add this url(C:\Program Files\Apache\Maven\bin) in the path variable 
   ```sh
   mvn -v

## Project Setup

### Frontend

1. **Navigate to the Frontend Directory**

   In frontend directory, install node package and run React UI.
    ```sh
   cd frontend 
   npm install
   npm start
3. **Navigate to the Backend Directory**
   
   In backend directory, install Java spring boot package and run server.
   ```sh
   cd backend
   mvn spring-boot:run
