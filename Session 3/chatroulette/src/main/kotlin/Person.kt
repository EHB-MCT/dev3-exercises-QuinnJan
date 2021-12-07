open class Person(open val name: String) {
    open fun talk() {

    }
    fun introduce() {
        println("Hi! I'm $name!")
    }
}