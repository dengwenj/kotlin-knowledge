fun main() {
    val d1 = D1("未知")
    println(d1) // D1@2a84aee7
    println(d1.sex)

    println("----------华丽的分割线----------")

    val d = D("朴睦", 24)
    println(d) // D(name=朴睦, age=24)
    val dCopy = d.copy(name = "李雷")
    println(dCopy) // D(name=李雷, age=24)
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
