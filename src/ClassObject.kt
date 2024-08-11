fun main() {
    val a = A("你好")
    a.str = "薯片"
    a.eat()

    val a1 = A()
    a1.eat()

    var js = E.JS
    if (js == E.JS) {
        println(js)
    }
}

// 默认是不可以被继承的，默认是 public final
// internal 只能同模块访问
internal class A constructor(test: String, test2: String? = null) {
    private var hello: String = test

    constructor() : this("hello", "哈哈哈哈哈哈哈")

    init {
        println(test2 + "ww")
        hello = "$test，世界"
        println(hello)
    }

    var str = "饼干"
        get() = field
        set(value) {
            val formatVal = value + "哈哈哈"
            field = formatVal
        }

    var str1: String? = null

    // 稍后初始化
    lateinit var str2: String

    fun eat() {
        println("在吃$str")

        println(str1?.length)
    }
}

// 枚举
@MyAnnotation("你好")
enum class E {
    Node, JS, Java, Kotlin
}

// 注解
annotation class MyAnnotation(val p: String)