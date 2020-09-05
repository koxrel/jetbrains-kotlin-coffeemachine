import java.util.Scanner

enum class Country(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    Unknown("");

    companion object {
        fun getCurrency(country: String): String {
            for (c in Country.values()) if (c.name == country) return c.currency
            return ""
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val firstCountry = input.next()
    val secondCountry = input.next()

    print(Country.getCurrency(firstCountry) == Country.getCurrency(secondCountry))
}