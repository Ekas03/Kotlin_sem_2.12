fun main() {
    var str: String = readln()
    var N: Int = str.toInt()

    var array: Array<Array<Int>> = Array(N, { Array(N, {0}) })
    for(i in 0..<N) {
        for(j in 0..<N) {
            str = readln()
            array[i][j] = str.toInt()
        }
    }

    for(i in 0..<N) {
        for(j in 0..<N) {
            print(array[i][j])
            print(" ")
        }
        println()
    }

    var sum: Int = 0
    for(i in N-1 downTo 1) {
        for(j in N - i..< N) {
            sum += array[i][j]
        }
    }
    println(sum)
}