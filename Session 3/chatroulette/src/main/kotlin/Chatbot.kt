class Chatbot(val name: String): ChatPartner {
    override fun introduce(){
        println("Hi! I'm useless")
    }

    override fun talk(){
        println("blablabla")
    }
}