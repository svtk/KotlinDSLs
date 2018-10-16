package _1_lambda_with_receiver

import java.lang.StringBuilder

fun main(args: Array<String>) {
    val s = buildString {
        appendln("Alphabet:")
        for (ch in 'a'..'z') {
            append(ch)
        }
    }
    println(s)
}

fun buildString1(builderAction: (StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun buildString2(builderAction: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

fun buildString3(builderAction: StringBuilder.() -> Unit): String {
    return StringBuilder().apply(builderAction).toString()
}