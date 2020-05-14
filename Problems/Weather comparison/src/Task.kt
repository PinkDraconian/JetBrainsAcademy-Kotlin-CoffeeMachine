data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            val border = value.coerceAtLeast(-92).coerceAtMost(57)
            field = if (border == value) {
                value
            } else {
                when (name) {
                    "Moscow" -> {
                        5
                    }
                    "Hanoi" -> {
                        20
                    }
                    "Dubai" -> {
                        30
                    }
                    else -> value
                }
            }
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    // implement comparing here
    if (firstCity.degrees < secondCity.degrees) {
        when {
            firstCity.degrees < thirdCity.degrees -> {
                println(firstCity.name)
            }
            firstCity.degrees == thirdCity.degrees -> {
                println("neither")
            }
            else -> {
                println(thirdCity.degrees)
            }
        }
    } else {
        when {
            secondCity.degrees < thirdCity.degrees -> {
                println(secondCity.name)
            }
            secondCity.degrees == thirdCity.degrees -> {
                println("neither")
            }
            else -> {
                println(thirdCity.name)
            }
        }
    }
}
