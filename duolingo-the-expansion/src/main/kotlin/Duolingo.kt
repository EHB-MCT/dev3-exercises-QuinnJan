import java.lang.Exception

class Duolingo(
    var roundSize: Int = 5,
    val language: String = "English",
) {

    var words = mutableSetOf<Word> (
        FrenchWord("vache", "koe"),
        EnglishWord("elephant", "olifant"),
        FrenchWord("canard", "eend"),
        FrenchWord("bonjour", "hallo"),
        EnglishWord("table", "tafel"),
        EnglishWord("dolphin", "dolfijn"),
        EnglishWord("grandpa","opa"),
        FrenchWord("chien","hond"),
        FrenchWord("chat","kat"),
        EnglishWord("daddy","papa"),
        EnglishWord("mommy","mama"),
        FrenchWord("café","koffie"),
        FrenchWord("lait","melk")
    )

    //Na initialisatie, iets doen (init)
    init{
        words = words.filter { it.language == language }.toMutableSet()
    }

    init {
        println("Pick a difficulty: 'Easy', 'Hard'")
        val userAnswer = readLine()
        if (userAnswer == "Easy") run {
            roundSize = 3
        } else if (userAnswer == "Hard") run {
            roundSize = 6
        } else {
            throw Exception("You have to choose!")
        }
    }

    fun play() {
        val selectedWords =  words.shuffled().take(roundSize).toMutableSet() //= maakt het aanpasbaar (mutableset)
        while (selectedWords.count() > 0) {  //zolang er nog woorden zijn
            while (selectedWords.isNotEmpty()) { //blijven vragen tot het goede antwoord komt
                val selectedWord = selectedWords.random()
                println(selectedWord.original)
                val userAnswer = readLine()
                if (userAnswer == selectedWord.translated) {
                    //good
                    selectedWords.remove(selectedWord)
                    println("Good job")
                } else {
                    //bad
                    println(selectedWord.translated)
                    println("wrong answer")
                }
                println(selectedWords.count()) //hoeveel woorden er nog overblijven
            }
        }
    }
}
