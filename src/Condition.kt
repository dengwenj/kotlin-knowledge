fun main() {
    var a = 1;

    val str = if (a == 1) {
        val s = "if"
        println("进 if 了")
        s
    } else if (a == 2) {
        println("进 else if 了")
        "else if"
    } else {
        println("进 else 了")
        "else"
    }
    println(str)

    // -------------

    var num: Any = 10
    // 类似 switch，不用写 break
    when (num) {
        // 区间，10 到 100 之间
        in 10..100 -> {
            println(1)
        }

        is String -> {
            println(10)
        }

        100 -> {
            println(100)
        }
        // 相当与 default
        else -> {
            println("else")
        }
    }
    // 这可以有返回值
    var result = when (num) {
        in 10..100 -> {
            "返回值"
        }
        20 -> "20"
        else -> {
            "else"
        }
    }
    println(result)

    // 类似三元表达式
    var ss = if (num == 1) "你好" else "世界"
    println(ss)
}