fun main() {
    intro()
    challengeOne()
}

fun intro(){
    println("Ha ha, i've captured you! Lets play a game.");
    Thread.sleep(4000)
    println("If you can solve these 5 challenges, you live.")
    Thread.sleep(4000)
    println("Otherwise you die! Lets begin!")
}

fun gameOver(){
    println("game over!")
}

fun textOne(){
    println("First challenge: a riddle!")
    Thread.sleep(2000)
    println("It can be cracked,")
    Thread.sleep(2000)
    println("It can be made,")
    Thread.sleep(2000)
    println("It can be told,")
    Thread.sleep(2000)
    println("It can be played.")
    Thread.sleep(2000)
    println("What is it?")
}

fun challengeOne() {
    textOne();
    val options = setOf("a joke", "een mop", "une blague")

    val userChoice = readLine()
    val winMessage = "You.. live!"

    if (options.contains(userChoice)){
        println(winMessage)
        challengeTwo();
    }else{
        gameOver();
    }
}

fun challengeTwo() {
    println("challenge two.. did the dice roll a low number or a high number?")
    val diceResult = (1..6).random()
    val userChoice = readLine()
    val winMessage = "you won again!"

    if (userChoice == "low" && (1..3).contains(diceResult)) {
        println(winMessage)
        challengeThree()
    }else if (userChoice == "high" && (4..6).contains(diceResult)){
        println(winMessage)
        challengeThree()
    } else {
            gameOver()
    }
}

fun challengeThree(){
    val weapons = setOf("gun","grenade","knife")
    println("choose a weapon to rob a bank, theres only one correct choice!")
    println(weapons)
    val userChoice = readLine()

    if (userChoice == "gun" && weapons.contains("gun")) {
        println("that's the correct choice!")
       // challengeFour()
    }else if (userChoice == "grenade" && weapons.contains("grenade")){
        println("wrong! back to challenge two!")
        challengeTwo()
    } else if (userChoice == "knife" && weapons.contains("knife")) {

        gameOver()
    }

}
