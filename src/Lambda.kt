fun main() {
    val foo: (Int, Int) -> Int = { x, y ->
        x + 1
        // 最后一行为返回值
        x + y
    }
    println(foo(1, 2))

    // 函数参数只有一个，不用写参数和箭头
    val bar: (Int) -> Int = {
        it + 2
    }
    println(bar(100))

    // 没有传参的没有返回值的
    val foo1 = {
        println("没有传参的没有返回值的")
    }
    println(foo1())

    // 当函数的参数最后一个是 lambda 表达式可以把括号写在外面
    test {
        println("test")
    }

    1.foo3 {
        println(this) // 1
    }

    foo4(4) {
        println(this) // 4
    }

    val fn = count()
    repeat(10) {
        println(fn())
    }
}

fun test(call: () -> Unit) {
    call()
}

fun <T> T.foo3(call: T.() -> Unit) {
    this.call()
}

fun <T> foo4(res: T, call: T.() -> Unit) {
    res.call()
}

fun count(): () -> Int {
    var a = 0
    return fun (): Int {
        a++
        return a
    }
}