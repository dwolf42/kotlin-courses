fun main() {
    val name: String = "Kotlin"

    val nonNullable: String? = null
    // if left is not null, use left, else use right
    val x = nonNullable ?: "hello"
    println(x)

    if (nonNullable != null) {
        val x: String = nonNullable
    }

    // 'length' method on string
    println("Hello, ${name.length}!")

    // for loop
    for (i in 0..5) {
        print(i)
    }
    println()

    listStuff()

    ternaryStuff()

    classStuff()
}

fun listStuff() {
    // create new mutable list (per default, lists are immutable)
    val numberList = mutableListOf(1, 2, 3)

    print("numberList: $numberList")
    println()

    // 'map' is as collection transformation function, that creates a new collection by applying a given function to each
    // element of the original collection
    val newList = numberList.map {
        2 * it
    }

    println("newList: $newList")

}

fun ternaryStuff() {
    val a: String = if (5 > 6) {
        "yes"
    } else "no"

    println(a)
}

fun classStuff() {
    // default, parameterless constructor
    val newUser1 = User1()
    newUser1.firstName = "Ben"
    newUser1.lastName = "Blue"
    println(newUser1.lastName)

    // parameterized constructor, and default value for variable
    val newUser2 = User2("Alex", "Miller")
    println(newUser2.lastName)
    val newUser3 = User2("Bog", "Carl")
    println(newUser3.lastName)

    // multiple constructors
    val user = User3("Tim", "Burton", true)
//    val friend = User3("Jane", "Doe")
    val cousin = User3("Albedo")

   // init-block
    val fairytale = User4("Cauteleya")
}