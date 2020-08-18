
fun main(){
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }
    numbers.map { it.length }.filter { it > 3 }.let(::println)
    val str2: String? = "Hello"
//    processNonNullString(str2)       // compilation error: str can be null
    val length = str2?.let {
        println("let() called on $it")
        processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
        it.length
    }
    println(length)

    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.toUpperCase()
    println("First item after modifications: '$modifiedFirstItem'")
}