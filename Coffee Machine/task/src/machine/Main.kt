package machine

import java.util.*

enum class CoffeeMachineState {
    REFILL_VALUE_WATER,
    REFILL_VALUE_MILK,
    REFILL_VALUE_COFFEE,
    REFILL_VALUE_CUPS,
    COFFEE_CHOICE,
    AWAITING_COMMAND
}

class CoffeeMachine(var money: Int = 550, var water: Int = 400, var milk: Int = 540, var coffee: Int = 120, var cups: Int = 9) {

    var state = CoffeeMachineState.AWAITING_COMMAND

    var refillWater = 0
    var refillMilk = 0
    var refillCoffee = 0
    var refillCups = 0

    private fun printState() {
        println("The coffee machine has:\n" +
                "$water of water\n" +
                "$milk of milk\n" +
                "$coffee of coffee beans\n" +
                "$cups of disposable cups\n" +
                "$money of money")
    }

    private fun canMakeCoffee(waterRequired: Int, coffeeRequired: Int, milkRequired: Int = 0, cupsRequired: Int = 1): Boolean {
        return water - waterRequired >= 0 && coffee - coffeeRequired >= 0
                && milk - milkRequired >= 0 && cups - cupsRequired >= 0
    }

    private fun findInsufficientResource(waterRequired: Int, coffeeRequired: Int, milkRequired: Int = 0, cupsRequired: Int = 1): String {
        return when {
            water - waterRequired < 0 -> "water"
            milk - milkRequired < 0 -> "milk"
            coffee - coffeeRequired < 0 -> "coffee"
            else -> "cups"
        }
    }

    private fun brew(waterRequired: Int, coffeeRequired: Int, moneyEarned: Int, milkRequired: Int = 0, cupsRequired: Int = 1) {
        if (canMakeCoffee(waterRequired, coffeeRequired, milkRequired, cupsRequired)) {
            println("I have enough resources, making you a coffee!")
            money += moneyEarned
            water -= waterRequired
            coffee -= coffeeRequired
            cups -= cupsRequired
            milk -= milkRequired
        } else {
            println("Sorry, not enough ${
                findInsufficientResource(waterRequired, coffeeRequired,
                        milkRequired, cupsRequired)
            }!")
        }
    }

    private fun buy(coffeeType: String) {
        when (coffeeType) {
            "1", "espresso" -> brew(250, 16, 4)
            "2", "latte" -> brew(350, 20, 7, 75)
            "3", "cappuccino" -> brew(200, 12, 6, 100)
        }
    }

    private fun take() {
        println("I gave you $money")
        money = 0
    }

    private fun fill(water: Int, milk: Int, coffee: Int, cups: Int) {
        this.water += water
        this.milk += milk
        this.coffee += coffee
        this.cups += cups
    }

    fun interpretInput(input: String) {
        if (input == "exit") return
        when (state) {
            CoffeeMachineState.AWAITING_COMMAND -> {
                when (input) {
                    "buy" -> {
                        state = CoffeeMachineState.COFFEE_CHOICE
                        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                    }
                    "fill" -> {
                        state = CoffeeMachineState.REFILL_VALUE_WATER
                        print("Write how many ml of water do you want to add:")
                    }
                    "take" -> take()
                    "remaining" -> printState()
                }
            }
            CoffeeMachineState.REFILL_VALUE_WATER -> {
                refillWater = input.toInt()
                state = CoffeeMachineState.REFILL_VALUE_MILK
                print("Write how many ml of milk do you want to add:")
            }
            CoffeeMachineState.REFILL_VALUE_MILK -> {
                refillMilk = input.toInt()
                state = CoffeeMachineState.REFILL_VALUE_COFFEE
                print("Write how many grams of coffee beans do you want to add:")
            }
            CoffeeMachineState.REFILL_VALUE_COFFEE -> {
                refillCoffee = input.toInt()
                state = CoffeeMachineState.REFILL_VALUE_CUPS
                print("Write how many disposable cups of coffee do you want to add:")
            }
            CoffeeMachineState.REFILL_VALUE_CUPS -> {
                refillCups = input.toInt()
                fill(refillWater, refillMilk, refillCoffee, refillCups)
                state = CoffeeMachineState.AWAITING_COMMAND
            }
            CoffeeMachineState.COFFEE_CHOICE -> {
                buy(input)
                state = CoffeeMachineState.AWAITING_COMMAND
            }
        }

        if (state == CoffeeMachineState.AWAITING_COMMAND) print("\nWrite action (buy, fill, take, remaining, exit):")
    }

    init {
        print("Write action (buy, fill, take, remaining, exit):")
    }
}


fun main() {
    val scanner = Scanner(System.`in`)
    val coffeeMachine = CoffeeMachine()

    do {
        val action = scanner.next()
        coffeeMachine.interpretInput(action)
    } while (action != "exit")
}
