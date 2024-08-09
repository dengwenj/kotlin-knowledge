package datatype

fun main(args: Array<String>) {
    // 不可以变的 list
    var list1 = listOf<String>("朴睦")
    if (list1.isEmpty()) {
        println("空")
    } else {
        println("不为空")
    }

    // 可变的 list
    val mutableList = mutableListOf<String>()
    mutableList.add("李雷")
    mutableList.add("韩梅梅")
    println(mutableList) // [李雷, 韩梅梅]

    // set 不可重复
    // 不可变的 set， 去重，唯一的
    var set = setOf(1, 2, 3, 2)
    println(set) // [1, 2, 3]

    // 可变的 set
    var mutableSetOf = mutableSetOf<String>()
    mutableSetOf.add("哈哈哈")
    mutableSetOf.add("嘻嘻嘻")
    mutableSetOf.add("哈哈哈")
    println(mutableSetOf) // [哈哈哈, 嘻嘻嘻]

    // 不可变的 map
    val map = mapOf(1 to "朴睦", 2 to "韩梅梅")
    println(map) // {1=朴睦, 2=韩梅梅}

    // 可变的 map
    var mutableMapOf = mutableMapOf("key1" to "value1", "key2" to "value2")
    var string = "key3"
    mutableMapOf[string] = "value3"
    println(mutableMapOf) // {key1=value1, key2=value2, key3=value3}

    // 二元组
    var pair = Pair(1, "朴睦")
    println(pair.first) // 1
    println(pair.second) // 朴睦

    // 三元组
    var triple = Triple(2, "韩梅梅", true)
    println(triple) // (2, 韩梅梅, true)

    // ? ，可能为空，所以在后面加个 ?
    var n: Int? = 1;
    n?.plus(2)
    n!!.plus(3)
}