package _4_Breakfast_menu.start

fun main(args: Array<String>) {
/*
    val bm = breakfastMenu {
        item(
                name = "Belgian Waffles",
                price = 5.95,
                calories = 650,
                description = "Two of our famous Belgian Waffles with plenty of real maple syrup")
    }
    println(bm)
*/
}

data class BreakfastMenu(val items: List<BreakfastMenuItem>)

data class BreakfastMenuItem(
    val name: String,
    val description: String,
    val price: Double,
    val calories: Int
)