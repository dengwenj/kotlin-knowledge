fun main() {
    val child = Child("朴睦")
    println(child.name)
    println(child.age)

    child.test1()
    child.test2()
}

open class Parent(var name: String, var age: Int) {
    constructor(name: String) : this(name, 18)

    // 允许子类重写
    open fun test1() {
        println("parent test1")
    }

    open fun test2() {
        println("parent test2")
    }
}

class Child : Parent {
    constructor(name: String) : super(name)

    override fun test1() {
        println("child test1")
    }

    override fun test2() {
        println("child test2")
    }
}
