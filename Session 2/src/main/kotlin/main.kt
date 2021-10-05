fun main() {
    val options = arrayOf("rock", "paper", "scissor")
    val computerChoice = options.random()

    println("Your choice: ")
    val userChoice = readLine()!!
    determineWinner(computerChoice, userChoice)
    println("computer choice was: $computerChoice")
}
fun determineWinner(computerChoice: String, userChoice: String?){
    if(computerChoice == userChoice){
        println("its a draw")
        return
    }
    val winMessage = "you've won"
    val loseMessage = "you've lost"

    when (computerChoice){
        "rock" -> if(userChoice == "paper") println(winMessage) else println(loseMessage)
        "paper" -> if(userChoice == "scissor") println(winMessage) else println(loseMessage)
        "scissor" -> if(userChoice == "rock") println(winMessage) else println(loseMessage)
    }
}