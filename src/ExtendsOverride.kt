fun main() {
    val child = Child("朴睦")
    println(child.name)
    println(child.age)
}

open class Parent(var name: String, var age: Int) {
    constructor(name: String) : this(name, 18)
}

class Child : Parent {
    constructor(name: String) : super(name)
}
