package _4_Breakfast_menu

fun main(args: Array<String>) {
    breakfastMenu {
        item(
            name = "Belgian Waffles",
            price = 5.95,
            calories = 650,
            description = "Two of our famous Belgian Waffles with plenty of real maple syrup")
        item(
            name = "Strawberry Belgian Waffles",
            price = 7.95,
            description = "Light Belgian waffles covered with strawberries and whipped cream",
            calories = 900)
        item(
            name = "Berry-Berry Belgian Waffles",
            price = 8.95,
            description = "Light Belgian waffles covered with an assortment of fresh berries and whipped cream",
            calories = 900)
        item(
            name = "French Toast",
            price = 4.5,
            description = "Thick slices made from our homemade sourdough bread",
            calories = 600)
        item(
            name = "Homestyle Breakfast",
            price = 6.95,
            description = "Two eggs, bacon or sausage, toast, and our ever-popular hash browns",
            calories = 950)
    }
}

class BreakfastMenuItem(
        val name: String,
        val description: String,
        val price: Double,
        val calories: Int
)

class BreakfastMenu {
    val items = mutableListOf<BreakfastMenuItem>()

    fun item(
            name: String,
            description: String,
            price: Double,
            calories: Int
    ) {
        items += BreakfastMenuItem(name, description, price, calories)
    }
}

fun breakfastMenu(init: BreakfastMenu.() -> Unit): BreakfastMenu {
    return BreakfastMenu().apply(init)
}
