fun main() {
    handler(Demo1())
    handler(Demo2)

    h(Seal2.Login("朴睦"))
    h(Seal2.Logout)
}

// 密封类，可以认为是枚举和抽象的结合
sealed class Seal {
    abstract fun test();
}

class Demo1 : Seal() {
    val name: String = "demo1"

    override fun test() {
        println("Demo1 test")
    }
}

object Demo2 : Seal() {
    override fun test() {
        println("Demo2 test")
    }
}

fun handler(s: Seal) {
    when (s) {
        is Demo1 -> {
            s.test()
            println(s.name)
        }
        Demo2 -> {
            s.test()
        }
    }
}

sealed class Seal2 {
    data class Login(val name: String) : Seal2()
    object Logout : Seal2()
}

fun h(s: Seal2) {
    when (s) {
        is Seal2.Login -> {
            println(s.name + "登录成功")
        }
        Seal2.Logout -> {
            println("退出成功")
        }
    }
}