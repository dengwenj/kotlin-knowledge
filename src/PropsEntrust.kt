import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    // 属性的委托监听
    var p1: String by Delegates.observable("你好") { _, old, new ->
        println("$old -> $new")
    }
    p1 = "世界"

    /**
     * 自己实现
     */
    var p2: String by MyProps("自己") {oldVal, newVal ->
        println("$oldVal -> $newVal")
    }
    p2 = "实现"
    println(p2)
}

class MyProps(private var init: String = "", var onChange: (oldVal: String, newVal: String) -> Unit)
    : ReadWriteProperty<Any?, String>
{
    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$init..."
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        if (init == value) {
            return
        }
        onChange(init, value)
        init = value
    }

}
