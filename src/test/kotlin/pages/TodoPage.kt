package pages
import com.codeborne.selenide.Selenide.*
import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.CollectionCondition.size
import com.codeborne.selenide.CollectionCondition.sizeGreaterThan
import com.codeborne.selenide.CollectionCondition.texts
import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.ElementsCollection
import org.openqa.selenium.By

class TodoPage {

    private val todoInput = element("input[data-testid='text-input']")
    private val allFilter = element("a[href='#/']")
    private val activeFilter = element("a[href='#/active']")
    private val completedFilter = element("a[href='#/completed']")
    private val clearCompletedBtn = element(".clear-completed")
    private val todoItems: ElementsCollection = elements(".todo-list li")
    private val checkBoxes = elements("input[data-testid='todo-item-toggle']")
    private val completedItems =elements("li.completed")

    private val addedTodos = mutableListOf<String>()


    fun clickReactOption() {
        open("https://todomvc.com/examples/react/dist/")
    }

    fun addMultipleTodos(todoList: List<String>) {
        todoList.forEach { item ->
            todoInput.setValue(item).pressEnter()
            addedTodos.add(item)
        }
    }

    fun verifyTodosAreVisible(addedTodos: List<String>) {
        // Compare the UI list against your stored list
        todoItems.shouldHave(texts(addedTodos))
    }

    fun checkRandomAndReturnName(): String {
        val total = todoItems.size()
        val randomIndex = (0 until total).random()
        val todoName = todoItems[randomIndex].text()

        checkBoxes[randomIndex].click()
        return todoName.trim()
    }

    fun clickCompletedOption() = completedFilter.click()

    fun verifyCompletedDeleted() {
        // This will wait automatically if the deletion is in progress
        completedItems.shouldBe(CollectionCondition.empty)
    }
    fun clickActiveOption() = activeFilter.click()

    fun verifyActiveContent() {
        todoItems.shouldHave(sizeGreaterThan(0))


    }
    fun clickAllOption() = allFilter.click()
    fun clickClearCompleted() = clearCompletedBtn.click()

    fun verifyCompletedNameVisible(name: String) {
        completedItems.find(text(name)).shouldBe(visible)
    }

    fun verifyRemainingCount(expectedCount: Int) {
        // Compare the collection size against the expected integer
        todoItems.shouldHave(size(expectedCount))
    }
}


