import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod

open class TestBase {

    @BeforeMethod
    fun setup() {
        // Selenide will automatically find, download, and setup the correct
        // ChromeDriver version that matches your Chrome 143 browser.
        com.codeborne.selenide.Configuration.browser = "chrome"
        com.codeborne.selenide.Configuration.baseUrl = "https://todomvc.com"

        // This opens the browser and manages the session for you
        com.codeborne.selenide.Selenide.open("/")
    }

    @AfterMethod
    fun tearDown() {
        // Selenide handles closing the browser automatically,
        // but you can force it if you prefer:
        com.codeborne.selenide.Selenide.closeWebDriver()
    }
}