📝 *Selenide TodoMVC Automation*

This project is a learning exercise in automated UI testing. It uses the Page Object Model (POM) to test the TodoMVC application, ensuring that tasks can be added, tracked, and managed effectively.

🛠 *Tools Used*

Kotlin: The programming language used for writing the tests.
Selenide: The automation framework used to interact with the browser. It provides "smart waiting" and clear assertions without using complex symbols.
Maven: The build tool that manages project dependencies (via the pom.xml file).
TestNG: The testing framework that organizes and runs the test cases.

🏗 *Project Method: Page Object Model (POM)*

This project follows the Page Object Model. This means the code is split into two clear parts:
Pages: These files contain the "Selectors" (locators) and the actions you can take on a page (like addTodo or deleteTodo).
Tests: These files contain the actual test scenarios. They call the methods from the Page files to perform actions and verify results..

*How to Run the Project*

You can run the tests in two ways:
Using your IDE (IntelliJ IDEA)
Navigate to the src/test/kotlin/tests folder.
Right-click on TodoTest.kt.
Select Run 'TodoTest'.

*Viewing Results*

Console: After the run, check the terminal or the IDE console to see if the tests passed (Green) or failed (Red).
