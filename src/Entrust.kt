fun main() {
    val en1 = En1(EDemoImpl(), EDemo1Impl())
    println(en1.getByIds()) // [1, 2, 3]
    println(en1.getList()) // [a, b, c]
}

interface EDemo {
    fun getByIds(): List<Int>
}

interface EDemo1 {
    fun getList(): List<String>
}

class EDemoImpl : EDemo {
    override fun getByIds(): List<Int> {
        return mutableListOf(1, 2, 3)
    }
}

class EDemo1Impl : EDemo1 {
    override fun getList(): List<String> {
        return mutableListOf("a", "b", "c")
    }
}

// 接口的委托：有实现过的不用再写
class En1(eDemoImpl: EDemo, eDemo1Impl: EDemo1Impl) : EDemo by eDemoImpl, EDemo1 by eDemo1Impl {
    fun test() {
        println("test()")
    }
}