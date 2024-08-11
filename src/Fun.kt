fun main() {
    println(sum(1, 2)) // 3
    println(sum2(1, 2)) // 3

    println(10 sum3 20) // 30

    sum4(100, 200, {
        println(it)
    })

    sum4(100, 200) {
        println(it) // 300
    }

    // 参数只有一个的话可以省略()， {} 这是个函数
    sum5() {
        println(it) // 5
    }
    // 例如
    run {

    }

    test("1", "2", "3", "4", "5")

    val arr = arrayOf("1", "2", "3")
    test(*arr)
    test(list = arr)

    test2(bb = "你好", list = arr)
}

// 这两个是一样的
fun sum(a: Int, b: Int): Int {
    return a + b
}
fun sum2(a: Int, b: Int) = a + b

infix fun Int.sum3(a: Int) = this + a

fun sum4(a: Int, b: Int, c: (d: Int) -> Unit) {
     c(a + b)
}

fun sum5(a: (Int) -> Unit) {
    a.invoke(5)
}

// 多参
fun test(vararg list: String) {
    list.forEach {
        println(it)
    }
}

fun test2(bb: String, vararg list: String) {
    list.forEach {
        println(it + bb)
    }
}