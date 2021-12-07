fun main() {
    val persons = arrayOf(Comedian("Bart"), Teacher("Tim"), Student("Bob"),Chatbot("Clingey"))

    val chatPartner = persons.random()
    chatPartner.introduce()
    chatPartner.talk()
}