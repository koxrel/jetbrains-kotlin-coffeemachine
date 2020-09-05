data class City(val name: String, private val defaultTemperature: Int) {
    var degrees: Int = defaultTemperature
        set(value) {
            field = if (value < -92 || value > 57) defaultTemperature else value
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai", 30)
    firstCity.degrees = first
    val secondCity = City("Moscow", 5)
    secondCity.degrees = second
    val thirdCity = City("Hanoi", 20)
    thirdCity.degrees = third

    // implement comparing here
    val cities = listOf<City>(firstCity, secondCity, thirdCity)
    val minTemperature = cities.minBy { c -> c.degrees }!!.degrees
    val citiesMinimalTemp = cities.filter { c -> c.degrees == minTemperature }
    print(if (citiesMinimalTemp.size > 1) "neither" else citiesMinimalTemp.first().name)
}