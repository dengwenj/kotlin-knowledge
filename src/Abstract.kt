fun main() {
    val aChild = AChild()
    aChild.eat()

    BParent.QianTao().test()

    CParent().CChild().test()
}

abstract class AParent {
    abstract fun eat();
}

class AChild : AParent() {
    override fun eat() {
        println("AChild is eat")
    }
}

// 嵌套的
class BParent {
    val str: String = "hh"
    class QianTao {
        fun test() {
            println(BParent().str)
        }
    }
}

// 内部类
class CParent {
    val str = "呜呜呜"

    inner class CChild {
        fun test() {
            println(this@CParent.str)
        }
    }
}