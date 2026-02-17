

## 📌 Project Overview
An automated testing suite for the [TodoMVC](https://todomvc.com/) web application using **Selenide** and **Java/Kotlin**. This project demonstrates the implementation of the **Page Object Model (POM)** and automated verification of core task management features (Create, Edit, Delete, Filter).

## 🚀 Technical Stack
* **Language:** Java / Kotlin
* **Framework:** Selenide (built on top of Selenium WebDriver)
* **Test Runner:** JUnit 5 / TestNG
* **Build Tool:** Maven / Gradle
* **Architecture:** Page Object Model (POM)

## 🛠️ Features Tested
- [x] **Task Creation:** Adding new todo items.
- [x] **Task Completion:** Marking items as completed and toggling status.
- [x] **Editing:** Modifying existing task text.
- [x] **Deletion:** Removing tasks from the list.
- [x] **Filtering:** Verifying 'All', 'Active', and 'Completed' filters.
- [x] **Counter:** Ensuring the "items left" counter updates correctly.

## 📂 Project Structure
```text
src/
├── main/java/pages/ # Page Objects (Elements & Selectors)
└── test/java/tests/ # Test Suites (Assertions & Scenarios)

⚙️ Prerequisites

• Java JDK 11 or higher
• Maven or Gradle
• Chrome/Firefox Browser
🏃 How to Run

1. Clone the repository:
git clone https://github.com/blessybabu-qa/selenide-todomvc.git

2. Run tests via Maven:
mvn test

Tests run in headless mode by default.

💡 Why Selenide?

I chose Selenide for this project because of its:

• Concise Syntax: Significantly less boilerplate code compared to standard Selenium.
• Smart Waits: Automatic handling of dynamic content and timing issues.
• Ajax Support: Native handling of asynchronous JavaScript actions.
• Readability: Tests are written in a human-readable format, making collaboration easier.

Author: Blessy Babu
Role: QA Engineer (Automation Growth)
Location: Munich, Germany
