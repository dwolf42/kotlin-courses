// default, parameterless constructor
class User1() {
    var firstName: String = ""
    var lastName: String = ""
}

// parameterized constructor, and default value for variable
class User2(var firstName: String, var lastName: String = "Firebird") {

}

// multiple constructors
class User3(var firstName: String, var lastName: String, var isPlatinum: Boolean) {

    constructor(firstName: String, lastName: String) : this(firstName, lastName, false) {
        println("2nd")
    }

    // 'this' keyword always calls the previous constructor before running the code inside the body!
    // but if I put a 3rd parameter into the constructor, the 2nd will be omitted
    constructor(firstName: String) : this(firstName, "Unknown", true) {
        println("3rd")
    }
}

// init-block
// first, the 2nd constructor is called, which calls the default constructor, but the print-statement
// of the 2nd constructor is executed AFTER the init-blocks of the main constructor
class User4(var firstName: String, var lastName: String) {
    var Int = 7
    constructor(firstName: String) : this(firstName, "Rotkäppchen") {
        println("Second Ctor is called")
    }

    init {
        println("Hellow 1")
    }

    init {
        println("Hello 2")
    }
}