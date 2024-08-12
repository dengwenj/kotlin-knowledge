fun main() {
    val demo = ::dc1
    dc2(::dc1)
    dc2(demo)

    val D = ::DC
    D().test()

//    DC::class
}

fun dc1() {
    println("dc 1")
}

fun dc2(callback: () -> Unit) {
    callback()
}

class DC {
    fun test() {
        println("dc")
    }
}