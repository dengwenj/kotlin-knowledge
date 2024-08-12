fun main() {
    val d1 = D1("未知")
    println(d1) // D1@2a84aee7
    println(d1.sex)

    println("----------华丽的分割线----------")

    val d = D("朴睦", 24)
    println(d) // D(name=朴睦, age=24)
    val dCopy = d.copy(name = "李雷")
    println(dCopy) // D(name=李雷, age=24)

    println(D2.a)
    println(D2.b)
    println(D2.c)
    D2.test("vn")

    val tesT1 = D3.TEST1
    println(tesT1)
}

class D1(val sex: String = "男") {
    var name: String? = null
    val age: Int

    init {
        name = "朴睦"
        age = 24
    }
}

// 数据类
// 特点：主构造函数里必须要有成员变量
// 主要用于 model
data class D(
    val name: String,
    val age: Int
)

// 伴生类，Kotlin 里没有静态的概念
class D2 {
    // 伴生类，也是类，支持继承，接口
    companion object {
        // 一般 @JvmStatic 放在函数上面，@JvmField 放在成员变量上面
        @JvmStatic
        val a = 100

        @JvmField
        val b = 200

        const val c = 200

        @JvmStatic
        fun test(name: String) {
            println(name)
        }
    }
}

enum class D3(val bbww: String = "ww") {
    TEST1("test1"),
    TEST2("test2")
}