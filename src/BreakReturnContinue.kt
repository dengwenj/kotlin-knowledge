fun main() {
    one@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                break@one
            }
            println("$i $j")
        }
    }

    ('a'..'z').forEach {
        if (it == 'd') {
            return@forEach
        }
        println("$it ")
    }

    run {
        ('a'..'z').forEach {
            if (it == 'd') {
                return@run
            }
            println("$it ")
        }
    }
}