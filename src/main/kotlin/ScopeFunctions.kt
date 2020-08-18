import kotlin.random.Random

fun writeToLog(message: String) {
    println("INFO: $message")
}

data class Person(var name: String, var age: Int = 0, var city: String = "") {
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
}

fun processNonNullString(str: String) {}

fun main(){
    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }

    val alice = Person("Alice", 20, "Amsterdam")
    println(alice)
    alice.moveTo("London")
    alice.incrementAge()
    println(alice)
    val str = "Hello"
    // this
    str.run {
        println("The receiver string length: $length")
        println("The receiver string length: ${this.length}") // does the same
    }

    // it
    str.let {
        println("The receiver string's length is ${it.length}")
    }

    val adam = Person("Adam").apply {
        age = 20                       // same as this.age = 20 or adam.age = 20
        city = "London"
    }
    println(adam)

    fun getRandomInt(): Int {
        return Random.nextInt(100).also {
            writeToLog("getRandomInt() generated value $it")
        }
    }

    val i = getRandomInt()

    // context object
    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()
    println(numberList)
    //Lambda result
    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("There are $countEndsWithE elements that end with e.")

    with(numbers) {
        val firstItem = first()
        val lastItem = last()
        println("First item: $firstItem, last item: $lastItem")
    }
}