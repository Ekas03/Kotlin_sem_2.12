fun main() {
    print("Введите строку: ")
    val string = readLine()
    val words = string?.split(" ")
    println(string)

    repeat(3) {
        val lastWord = words?.last()
        println(lastWord)
    }
}