package _4_Breakfast_menu

fun main(args: Array<String>) {
    val bm = breakfastMenu {
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
    println(bm)
}

fun breakfastMenu(
        init: BreakfastMenuBuilder.() -> Unit
) = BreakfastMenuBuilder().apply(init).build()

class BreakfastMenuBuilder {
    val items = mutableListOf<BreakfastMenuItem>()
    fun build() = BreakfastMenu(items)

    fun item(name: String, price: Double, calories: Int, description: String) {
        items += BreakfastMenuItem(name, description, price, calories)
    }
}

data class BreakfastMenu(val items: List<BreakfastMenuItem>)

data class BreakfastMenuItem(
        val name: String,
        val description: String,
        val price: Double,
        val calories: Int
)