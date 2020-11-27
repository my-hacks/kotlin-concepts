@file:Suppress("DEPRECATED_IDENTITY_EQUALS")


//fun main() {
//    // arithmeticOperations()
//    // comparationsOperators()
//    //ifElse()
//    // nullishValues()
//    //lists()
//    //funcExample()
//    val x = isEven(5)
//    println(x)
//    val z = isOdd()
//    println(z)
//    // in this case i pass a parameter with a set value
//    val y = isOdd(number = 10)
//    println(y)
//    val impar = 10
//    println(impar.isOddWithoutParameter())
//}

//instance of Classes
//fun main() {
//    val dog = Dog()
//    dog.makeSound()
//    val cat = Cat()
//    cat.makeSound()
//}

//anonimous functions : No Kotlin é possivel criar objetos do tipo de classes abstratas e usar funcoes que foram declaradas nelas
//fun main() {
//    val bear = object :Animal("ursao") {
//        override fun makeSound() {
//            println("Rugido de urso")
//        }
//    }
//    bear.makeSound()
//}

// EXCEPTIONS

//fun main() {
//    val inputNumber = readLine() ?: "0"
//    val parsedNumber = try {
//        inputNumber.toInt()
//    } catch (e: Exception) {
//        0
//    }
//    println(parsedNumber)
//}

//LAMBDAS
//Expressoes lambdas sao funcoes que recebem outras funcoes no Kotlin, a ultima linha declarada, sempre vai ser o retorno dessa lambda
fun main() {
    val list = listOf("Emerson", "Jairo", "Jean")
    val count = list.count{ currentValue ->
        currentValue.length === 7
    }
    println(count)
}

fun arithmeticOperations() {
    //    we use var to variables that can change on future
    val x = 3
    println("The value of x is $x")
    //  we use val to enable variables that not mutable on future
    val decimalNumber = 3.33f
    println("Variable with val $decimalNumber")
//  arithmetic values
    val y = 3 * 4
    println("the result is $y")
    val z = 3 + 4
    println("the result is $z")
//    in this case we use f on final cause result is type float
    val w = 3 / 4f
    println("the result is $w")

    val w2 = 10 % 3
    println("the result is $w2")
}

fun comparationsOperators() {
    val amIAnAdult = true
    val amIAProgrammer = true
    val amIAnAdultProgrammer = amIAnAdult && amIAProgrammer
    val amIAnAdultOrProgrammer = amIAnAdult || amIAProgrammer
    val compare = (amIAnAdult != amIAProgrammer)
    println("$amIAnAdultProgrammer, $amIAnAdultOrProgrammer, $compare")
}

fun ifElse() {
    val x = 1 + 4

    if(x == 2) {
        println(" x is equal 2")
    } else if( x == 3 ) {
        println("x is equal 3")
    } else {
        println("x is not 2 or 3")
    }
    
    val y = if(x == 2) 2 else 3

//    in kotlin we have the when operator, its similar to switch case
    when(3) {
        in 1..2 -> println("valor is between 1 and 2")
        in 3..10 -> println("valor is between 3 and 10")
        else -> {
        println("valor is not in the range 1 to 5")
        }
    }
}

fun nullishValues() {
    // in kotlin we can declare variables with null value
    val x: Int? = 3
    // in this case when value is not null declare another value in initiation of variable
    val n1 = readLine() ?: "0"
    val n2 = readLine() ?: "0"
    // when use !! we declare for kotlin trust that number is not null
    // val result = n1!!.toInt() + n2!!.toInt()
    val result  = n1 + n2
    println(result)
}

fun lists() {
    // in kotlin we can works with mutableLists and immutableLists
    val shoppinglist = mutableListOf<String>("Lamborguini", "Penthouse", "Ferrari")
    shoppinglist.add("Camaro")
    var counter = 0
    while(counter < shoppinglist.size) {
        println(shoppinglist[counter])
        counter++
    }
    for(shoppingItem in shoppinglist) {
        println(shoppingItem)
    }
}

//in kotlin we can use default parameters in case value of param is not passed

fun isOdd(number: Int = 5): Boolean {
    return number % 2 === 1
}

fun isEven(number: Int): Boolean {
    return number % 2 === 0
}

fun funcExample() {
    for(i in 1..10) {
        println(i)
    }
}

// in kotlin its possible use a declared function with type of parameter instead to pass a parameter

fun Int.isOddWithoutParameter(): Boolean {
    return this % 2 == 1
}




