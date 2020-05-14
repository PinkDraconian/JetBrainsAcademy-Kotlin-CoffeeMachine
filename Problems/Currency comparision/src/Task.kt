import java.util.Scanner

enum class CountryCurrency(val countryName: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar"),
    NULL("", "");

    companion object {
        fun findByName(countryName: String): CountryCurrency {
            for (enum in values()) {
                if (countryName == enum.countryName) return enum
            }
            return NULL
        }
    }
}

fun main() {
    val input = Scanner(System.`in`)
    // put your code here

    val country1 = input.next()
    val country2 = input.next()

    val currency1 = CountryCurrency.findByName(country1).currency
    val currency2 = CountryCurrency.findByName(country2).currency

    println(currency1 == currency2)
}