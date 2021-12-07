fun main() {
    var names = arrayOf("Quinn","Geert", "Kurt", "Bart", "Piet")
    for (name in names) {
        greet(name)
    }
}

fun greet(name: String){
    println("Hello $name")
}