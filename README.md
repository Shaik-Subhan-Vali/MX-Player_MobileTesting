![MX_Player_Logo](https://github.com/user-attachments/assets/cb8eee16-42b1-4817-ba58-3d6aa2c0aa40)

# Appium - Automated Mobile App Testing

Appium is an open-source tool used for automating mobile applications. This project focuses on understanding and implementing automated testing for mobile apps using Java and Appium.

## Objective

To perform automated mobile app testing on the MX Player application using Java and Appium, and to ensure the application performs expected functionalities effectively. The project includes launching the app, performing various actions, and generating reports.

## Tech Stack Used in This Project

<img alt="Java" src="https://img.shields.io/badge/Java-007396?logo=java&logoColor=white&style=flat" />
<img alt="JavaScript" src="https://img.shields.io/badge/JavaScript-F7DF1E?logo=javascript&logoColor=white&style=flat" />
<img alt="Appium" src="https://img.shields.io/badge/Appium-472E7C?logo=appium&logoColor=white&style=flat" />
<img alt="Maven" src="https://img.shields.io/badge/Maven-C71A36?logo=apache-maven&logoColor=white&style=flat" />
<img alt="Android" src="https://img.shields.io/badge/Android-3DDC84?logo=android&logoColor=white&style=flat" />

**Version Control and Testing tools used:**

<img alt="Git" src="https://img.shields.io/badge/Git-F05032?logo=git&logoColor=white&style=flat" />
<img alt="GitHub" src="https://img.shields.io/badge/GitHub-181717?logo=github&logoColor=white&style=flat" />
<img alt="Visual Studio Code" src="https://img.shields.io/badge/Visual%20Studio%20Code-007ACC?logo=visual-studio-code&logoColor=white&style=flat" />

**Operating System and Emulators Used:**

<img alt="Windows" src="https://img.shields.io/badge/Windows-00ADEF?logo=windows&logoColor=white&style=flat" />
<img alt="Android Emulator" src="https://img.shields.io/badge/Android%20Emulator-3DDC84?logo=android&logoColor=white&style=flat" />

## Directory Structure
Appium-Java-Assignment/
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  ├─ com/
│  │  │  │  ├─ example/
│  │  │  │  │  ├─ tests/
│  │  │  │  │  │  ├─ MXPlayerTest.java
├─ pom.xml
├─ README.md

## Application Under Test 

AUT APK: [MX Player APK](https://apkpure.com/mx-player/com.mxtech.videoplayer.ad)

## Scope 
<details>
<summary><strong>Features to be Tested</strong></summary>

- Launch Application
- Perform Touch Actions
- Tap and Click Actions
- Scroll Actions
- Drag and Drop Actions
- Send Keys
- Open Notifications
- Click on Battery Saver
- Enable and Disable Battery Saver
- Switch to Another Application
- Copy Text from Another App
- Return to MX Player App
- Navigate to Home Screen

</details>

<details>
<summary><strong>Testing Types</strong></summary>

- Functional Testing
- Usability Testing
- Compatibility Testing

</details>

<details>
<summary><strong>Testing Methodologies</strong></summary>

- Black-box Testing
- Exploratory Testing
- Integration Testing
- End-to-End Testing

</details>

## Credentials
- For testing purposes, no specific credentials are required.

## Setup & Installation

### Prerequisites

Ensure that you have the following installed on your system:
- **Java Development Kit (JDK)**
- **Appium**: Follow the [Appium Installation Guide](http://appium.io/docs/en/about-appium/intro/) for installation instructions.
- **Maven**: Install Maven from the [official site](https://maven.apache.org/download.cgi).
- **Android SDK and ADB**: Install the Android SDK and ensure `adb` is configured.

### Installation Steps

1. **Install Your IDE**
   - Download and install [Eclipse](https://www.eclipse.org/downloads/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/).

2. **Set Up Maven Project**
   - Create a new Maven project in your IDE.
   - Add Appium and Selenium dependencies in your `pom.xml`:
     ```xml
     <dependency>
         <groupId>io.appium</groupId>
         <artifactId>java-client</artifactId>
         <version>8.3.0</version>
     </dependency>
     <dependency>
         <groupId>org.seleniumhq.selenium</groupId>
         <artifactId>selenium-java</artifactId>
         <version>4.2.2</version>
     </dependency>
     ```

3. **Download the Project**
   - Clone the project repository or download the required files.

4. **Install the App on Emulator**
   - Use the `adb` command to install the APK on your emulator:
     ```bash
     adb install path/to/mx-player.apk
     ```

5. **Run Your Tests**
   - Use Maven to build and run your test scripts:
     ```bash
     mvn clean test
     ```

6. **Generate Reports**
   - Use Maven plugins or additional tools to generate and view test reports.

## Attachments


## 🚀 About Me

I'm an ISTQB Certified Tester with expertise in Appium, Selenium, Java, Python, and MySQL. I focus on delivering high-quality solutions through automation and meticulous testing practices.

## Feedback

If you have any feedback or need further assistance, please reach out to me at [your-email@example.com](mailto:your-email@example.com).
