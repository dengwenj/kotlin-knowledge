fun main() {
    Demo().aa()
}

class Demo : B, C {
    override var ww: String = "你好"

    override fun aa() {
        println("我是接口 interface")
    }
}

interface B {
    // 属性重写
    var ww: String

    fun aa()
}

interface C {
    fun aa()
}