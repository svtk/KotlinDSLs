package first

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun buildDropdown() = createHTML().div(classes = "dropdown") {
    button(classes = "btn dropdown-toggle") {
        +"Dropdown"
        span(classes = "caret")
    }
    ul(classes = "dropdown-menu") {
        item("#", "Action")
        li { a("#") { +"Another action" } }
        li { role = "separator"; classes = setOf("divider") }
        li { classes = setOf("dropdown-header"); +"Header" }
        li { a("#") { +"Separated link" } }
    }
}

fun UL.item(url: String, name: String) =
        li { a(url) { +name } }

fun main(args: Array<String>) {
    println(buildDropdown())
}