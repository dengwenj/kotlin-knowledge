fun main() {
    // 1 到 10 这个区间
    val intRange = 1..10
    val toList = intRange.toMutableList()
    toList.add(0)
    toList.forEach {
        println("$it")
    }

    100..<1000

    (1..10 step 2).forEach {
        println("$it 好腻害")
    }

    for (c in 'a'..'z' step 2) {
        println(c)
    }

    println(1.2f in 1f..10f) // true
}