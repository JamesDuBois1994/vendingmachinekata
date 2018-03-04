# VendingMachineKata

# How to Setup Project / How to run tests

#Option 1 Terminal:
```
Fast Video Demo on installing Maven and Homebrew 
    - https://www.youtube.com/watch?v=xTzLGcqUf8k
1) Now that you have Maven installed 
    a) Clone the repo
    b) Navigate to the solution through the terminal
    c) Once you are in the project the directory type "mvn clean install"
    d) Once the build is successful scroll up until you see "T E S T S" section
    e) You should see "Tests run: 33, Failures: 0, Errors: 0, Skipped: 0"
    f) To run the tests again type "mvn clean test"
    IF YOU DONT SEE STEP E RESULTS
    1) Once the build is successful type "mvn clean test"
    2) You should see "Tests run: 33, Failures: 0, Errors: 0, Skipped: 0"
IF YOU FOLLOWED THE VIDEO INSTRUCTIONS THEN DONT LOOK AT THESE BELOW - TEXT VERSION LISTED BELOW
1) Install Homebrew - https://brew.sh/
    a) Once homebrew is installed open up a new terminal and type "brew doctor" this verifies your brew installation
    - As long as you don't have failures you're good to go, warnings are okay
2) Install Maven
    a) Assuming brew is installed correctly type "brew install maven"
    b) Type "mvn -version" to verify that maven has installed correctly - might need to restart terminal
3) Clone the Repo
4) Run the tests
    a) Navigate to the solution through the terminal
    b) Once you are the project directory type "mvn clean install"
    c) Once the build is successful scroll up until you see "T E S T S" section
    d) You should see "Tests run: 33, Failures: 0, Errors: 0, Skipped: 0"
    e) To run the tests again type "mvn clean test"
    IF YOU DONT SEE STEP D RESULTS
    1) Once the build is successful type "mvn clean test"
    2) You should see "Tests run: 33, Failures: 0, Errors: 0, Skipped: 0"
 
```

#Option 2 IDE:
``` 
1) Ideally, download IntelliJ Idea - it has a free 30-day evaluation phase. All default install settings are fine.
2) Clone Repo
3) Configure Your JDK if you haven't for IntelliJ, in this project I used JDK 9 but I think any recent JDK should be fine.
4) Open the project in IntelliJ
    - Once the project is opened, IntelliJ should do all the work.
    - If that is not the case, there should be a message that pops up at the bottom of the screen. saying Import Changes or it gives you the option Enable Auto Import, either will work.
    - Give IntelliJ some time to load/index and pull in dependencies, it really depends on how fast your pc setup is.
5) Navigate to "VendingMachineTest" class, right click on it and click Run 'VendingMachineTest'
    - You should see the success message saying "Tests Passed: 33 passed".
```

# Optional Plugin

```
The plugin below is helpful for reading the tests, it converts your tests to a sentance wich you can view.
Enso - https://plugins.jetbrains.com/plugin/6403-enso
```
