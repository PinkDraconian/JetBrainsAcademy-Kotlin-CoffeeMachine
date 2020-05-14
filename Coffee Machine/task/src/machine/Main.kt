package machine

import java.util.*


fun printMenu(moneyAvailable: Int, waterAvailable: Int, milkAvailable: Int,
              coffeeBeansAvailable: Int, cupsAvailable: Int) {
    println("The coffee machine has:")
    println("$waterAvailable of water")
    println("$milkAvailable of milk")
    println("$coffeeBeansAvailable of coffee beans")
    println("$cupsAvailable of disponsable cups")
    println("\$$moneyAvailable of money")
    println()
}


fun main() {
    val scanner = Scanner(System.`in`)

    var moneyAvailable = 550
    var waterAvailable = 400
    var milkAvailable = 540
    var coffeeBeansAvailable = 120
    var cupsAvailable = 9

    var exit = false
    while (!exit) {
        println("Write action (buy, fill, take): ")
        when (scanner.next()) {
            "buy" -> {
                println("What do you want to buy? " +
                        "1 - espresso, 2 - latte, 3 - cappuccino: ")
                when (scanner.next()) {
                    "1" -> {
                        when {
                            waterAvailable < 250 -> {
                                println("Sorry, not enough water!")
                            }
                            coffeeBeansAvailable < 16 -> {
                                println("Sorry, not enough coffee beans!")
                            }
                            cupsAvailable < 1 -> {
                                println("Sorry, not enough disposable cups!")
                            }
                            else -> {
                                waterAvailable -= 250
                                coffeeBeansAvailable -= 16
                                moneyAvailable += 4
                                cupsAvailable -= 1
                                println("I have enough resources, making you a coffee!")
                            }
                        }
                    }
                    "2" -> {
                        when {
                            waterAvailable < 350 -> {
                                println("Sorry, not enough water!")
                            }
                            milkAvailable < 75 -> {
                                println("Sorry, not enough milk!")
                            }
                            coffeeBeansAvailable < 20 -> {
                                println("Sorry, not enough coffee beans!")
                            }
                            cupsAvailable < 1 -> {
                                println("Sorry, not enough disposable cups!")
                            }
                            else -> {
                                waterAvailable -= 350
                                milkAvailable -= 75
                                coffeeBeansAvailable -= 20
                                moneyAvailable += 7
                                cupsAvailable -= 1
                                println("I have enough resources, making you a coffee!")
                            }
                        }
                    }
                    "3" -> {
                        when {
                            waterAvailable < 200 -> {
                                println("Sorry, not enough water!")
                            }
                            milkAvailable < 100 -> {
                                println("Sorry, not enough milk!")
                            }
                            coffeeBeansAvailable < 12 -> {
                                println("Sorry, not enough coffee beans!")
                            }
                            cupsAvailable < 1 -> {
                                println("Sorry, not enough disposable cups!")
                            }
                            else -> {
                                waterAvailable -= 200
                                milkAvailable -= 100
                                coffeeBeansAvailable -= 12
                                moneyAvailable += 6
                                cupsAvailable -= 1
                                println("I have enough resources, making you a coffee!")
                            }
                        }
                    }
                }
            }
            "fill" -> {
                println("Write how many ml of water do you want to add: ")
                val waterToAdd = scanner.nextInt()
                println("Write how many ml of milk do you want to add: ")
                val milkToAdd = scanner.nextInt()
                println("Write how many grams of coffee beans do you want to add: ")
                val coffeeBeansToAdd = scanner.nextInt()
                println("Write how many disposable cups of coffee do you want to add: ")
                val cupsToAdd = scanner.nextInt()

                waterAvailable += waterToAdd
                milkAvailable += milkToAdd
                coffeeBeansAvailable += coffeeBeansToAdd
                cupsAvailable += cupsToAdd
            }
            "take" -> {
                println("I gave you \$$moneyAvailable")
                moneyAvailable = 0
            }
            "remaining" -> {
                printMenu(moneyAvailable, waterAvailable, milkAvailable, coffeeBeansAvailable, cupsAvailable)
            }
            "exit" -> {
                exit = true
            }
        }
    }
}
