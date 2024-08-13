fun main() {
    G1<Float>(1.2F).test(1.2f)
    G1<Int>(1).test(1)

    1.g4(2)

    // * 可以当做 Any?
    var list: List<*> = listOf("1", 1, true)

    val g5 = G5<G6>()
    g5.t(G6())
}

// 泛型 不确定的类型，一般传递进去，然后返回出来

// 约束下这个泛型，要是 Number 类型的子类 或实现类，传入其他不行，类似 java extends
class G1<T : Number>(override val a: T) : G2<T>(), G3<T> {
    override fun test(param1: T) {
        println(param1)
    }

}

abstract class G2<T> {
    abstract fun test(param1: T);
}

// out 关键字，可以转为父类的
interface G3<out T> {
    val a: T
}

interface Read<out T> {
    fun read(): T
}

interface Write<in T> {
    fun write(t: T)
}

fun <T> T.g4(param1: T) {
    println(param1)
}

class G6 : A1, A2, A3 {
    override fun a1() {
        println("a1")
    }
}
// where 多个约束条件
interface A1 {
    fun a1();
}
interface A2
interface A3
// 有多个约束条件
class G5<T> where T : A1, T : A2, T : A3 {
    fun t(p: T) {
        p.a1()
    }
}