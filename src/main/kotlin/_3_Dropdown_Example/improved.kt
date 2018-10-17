package improved

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun DIV.dropdownMenu(block: UL.() -> Unit) =
    ul("dropdown-menu", block)

fun DIV.dropdownButton(block: BUTTON.() -> Unit) =
    button(classes = "btn dropdown-toggle") {
        block()
        span(classes = "caret")
    }

fun UL.divider() =
    li { role = "separator"; classes = setOf("divider") }

fun UL.dropdownHeader(text: String) =
    li { classes = setOf("dropdown-header"); +text }

fun UL.item(url: String, name: String) =
    li { a(url) { +name } }

fun TagConsumer<String>.dropdown(
    block: DIV.() -> Unit
): String = div("dropdown", block)

fun dropdownExample() = createHTML().dropdown {
    dropdownButton { +"Dropdown" }
    dropdownMenu {
        item("#", "Action")
        item("#", "Another action")
        divider()
        dropdownHeader("Header")
        item("#", "Separated link")
    }
}

fun main(args: Array<String>) {
    println(dropdownExample())
}