package tests
import TestBase
import com.codeborne.selenide.WebDriverRunner
import com.codeborne.selenide.WebDriverRunner.driver
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import pages.TodoPage

class TodoTest : TestBase() {

    //private val todoPage = TodoPage()

    @Test
    fun completeTodoWorkflow() {
        val myTodos = listOf("Buy Groceries", "Walk the Dog", "Finish Automation")

        // 1. Navigate to the specific React implementation
        TodoPage().clickReactOption()

        // 2. Add multiple items abd verifying it added or nott
        TodoPage().addMultipleTodos(myTodos)
        TodoPage().verifyTodosAreVisible(myTodos)

        // 4. Complete a random item and capture its name
        val completedName = TodoPage().checkRandomAndReturnName()

        // 5. Navigate to 'Completed' filters and verifying complete action
        TodoPage().clickCompletedOption()
        TodoPage().verifyCompletedNameVisible(completedName)

        // 6. Navigate to 'ClearCompleted' filters and verifying the clearcompleted action
        TodoPage().clickClearCompleted()
        TodoPage().verifyCompletedDeleted()

        // 7. Navigate to 'active' filters and verifying the active content
        TodoPage().clickActiveOption()
        TodoPage().verifyActiveContent()

        // 8. Navigate to 'All' filters and verifying the remaong count
        TodoPage().clickAllOption()
        val remainingCount = myTodos.size - 1
        TodoPage().verifyRemainingCount(remainingCount)
    }
}