fun main() {
    /**
     * 所有数据类型都是对象
     */
    println("Hello World!")

    // 自动推到
    var a = 1;

    // 常量
    val b = 2;

    var string = "你好";
    // 添加
    var plus = string.plus("世界")
    println(string) // 你好
    println(plus) // 你好世界

    val str1 = "${string}${a}"
    println(str1) // 你好1

    var str2 = """
        朴睦
        你好
        $b
    """.trimIndent()
    println(str2)
}