fun main() {

    val str: String = readln()
    val list: List<String> = str.split(" ")
    val numbers: Array<Int> = Array(list.size, {0})

    var i: Int = 0
    for(el in list) {
        numbers[i] = el.toInt()
        i += 1
    }

    var flag: Int = numbers[0]
    var count: Int = 1
    for(i in 1..<numbers.size) {
        if (numbers[i] != flag)
        {
            count += 1
            flag = numbers[i]
        }
    }
    println(count)
}