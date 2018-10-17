package _0_intro

fun examples() {
    // infix functions
    val pair = 1.to("abc")

    // extension functions
    // StringUtil.capitalize("abc") // "ABC"

    // operator overloading
    val point1 = Point(1, 2)
    val point2 = Point(3, 4)
    point1.plus(point2)  // Point(4, 6)
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) =
            Point(x + other.x, y + other.y)
}