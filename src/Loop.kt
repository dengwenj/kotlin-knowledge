fun main() {
    // 循环必须要有迭代器才可以循环
    val list = ('a'..'z').toList()
    // (index, item) 解构
    for ((index, item) in list.withIndex()) {
        println("$index: $item")
    }

    list.forEach(::println)

    list.forEachIndexed{ index, element -> println("$index: $element") }
}