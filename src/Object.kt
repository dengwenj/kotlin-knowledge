import Test.Call

fun main() {
    O.test()
    O.pumu()
    println(O.a)
    println(O.b)

    val call = object : Req {
        override fun loading() {
            println("loading...")
        }
    }
    request(call)

    request2(object : Call {
        override fun loading() {}
    })
    request2 {
        println("这里可以变成 lambda 表达式")
    }

    eee("你好") { l ->
        println(l)
        println("launched")
    }
}

// 单例
// object 本身也是一个类，也可以继承，接口
object O : OTest {
    const val a = 1

    @JvmField
    val b = 2

    fun test() {
        println("test")
    }

    override fun pumu() {
        println("pumu")
    }
}

interface OTest {
    fun pumu()
}

// 对象表达式
fun request(call: Req) {
    call.loading()
}

interface Req {
    fun loading();
}

fun request2(call: Call) {
    call.loading();
}

fun eee(name: String, fn: (length: Int) -> Unit) {
    fn.invoke(name.length)
}

