class Duolingo(
    val roundSize: Int = 5,
    val language: String = "English"
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
        EnglishWord("fork","vork")
    )

    //Na initialisatie, iets doen (init)
    init{
        words = words.filter { it.language == language }.toMutableSet()
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

