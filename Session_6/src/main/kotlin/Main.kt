import java.sql.*
import java.util.*

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()
    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password

    // Create the connection: this will allow us to run queries on it later
    val connection = DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps
    )

    println("Geeky Travel, at your service!")
    Thread.sleep(1000)
    println("What's calling your name?")
    println("Harry potter, Lord of the rings or Star wars")
    val userAnswer = readLine()

    if (userAnswer == "Star wars") {
        Thread.sleep(1000)
        println("Will you join the dark side?")
        Thread.sleep(1000)
        println("Light or Dark")
        val userAnswer = readLine()
        if (userAnswer == "Light") {
            val statement = connection.prepareStatement("SELECT * FROM Star_wars WHERE tags = 'Light'")
            val result = statement.executeQuery()
            while (result.next()) {
                println(result.getString("destination"))
                println(result.getString("info"))
                println(result.getString("price"))
                println("next? --> yes")
                val userAnswer = readLine()
                if (userAnswer == "yes") {
                    result.next()
                    println(result.getString("destination"))
                    println(result.getString("info"))
                    println(result.getString("price"))
                }
            }
        } else if (userAnswer == "Dark") {
            val statement = connection.prepareStatement("SELECT * FROM Star_wars WHERE tags = 'Dark' ")
            val result = statement.executeQuery()
            while (result.next()) {
                println(result.getString("destination"))
                println(result.getString("info"))
                println(result.getString("price"))
                println("next? --> yes")
                val userAnswer = readLine()
                if (userAnswer == "yes") {
                    result.next()
                    println(result.getString("destination"))
                    println(result.getString("info"))
                    println(result.getString("price"))
                }
            }
        }
    } else if (userAnswer == "Lord of the rings") {
        Thread.sleep(1000)
        println("Join elves or humans?")
        Thread.sleep(1000)
        println("Elves or Humans")
        val userAnswer = readLine()
        if (userAnswer == "Elves") {
            val statement = connection.prepareStatement("SELECT * FROM Lord_of_the_rings WHERE tags = 'Nature' ")
            val result = statement.executeQuery()
            while (result.next()) {
                println(result.getString("destination"))
                println(result.getString("info"))
                println(result.getString("price"))
                println("next? --> yes")
                val userAnswer = readLine()
                if (userAnswer == "yes") {
                    result.next()
                    println(result.getString("destination"))
                    println(result.getString("info"))
                    println(result.getString("price"))
                }
            }

        } else if (userAnswer == "Bricks") {
            val statement = connection.prepareStatement("SELECT * FROM Lord_of_the_rings WHERE tags = 'Bricks' ")
            val result = statement.executeQuery()
            while (result.next()) {
                println(result.getString("destination"))
                println(result.getString("info"))
                println(result.getString("price"))
                println("next? --> yes")
                val userAnswer = readLine()
                if (userAnswer == "yes") {
                    result.next()
                    println(result.getString("destination"))
                    println(result.getString("info"))
                    println(result.getString("price"))
                }
            }
        }
    } else if (userAnswer == "Harry potter") {
        Thread.sleep(1000)
        println("Leviosa or leviowsa?")
        Thread.sleep(1000)
        println("Leviosa or Leviowsa")
        val userAnswer = readLine()
        if (userAnswer == "Leviosa") {
            val statement = connection.prepareStatement("SELECT * FROM Harry_potter WHERE tags = 'Location' ")
            val result = statement.executeQuery()
            while (result.next()) {
                println(result.getString("destination"))
                println(result.getString("info"))
                println(result.getString("price"))
                println("next? --> yes")
                val userAnswer = readLine()
                if (userAnswer == "yes") {
                    result.next()
                    println(result.getString("destination"))
                    println(result.getString("info"))
                    println(result.getString("price"))
                }
            }

        } else if (userAnswer == "Leviowsa") {
            val statement = connection.prepareStatement("SELECT * FROM Harry_potter WHERE tags = 'Building' ")
            val result = statement.executeQuery()
            while (result.next()) {
                println(result.getString("destination"))
                println(result.getString("info"))
                println(result.getString("price"))
                println("next? --> yes")
                val userAnswer = readLine()
                if (userAnswer == "yes") {
                    result.next()
                    println(result.getString("destination"))
                    println(result.getString("info"))
                    println(result.getString("price"))
                }
            }
        }
    }
}

