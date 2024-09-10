fun main() {

    println(divideIfWhole(100,11))
    var result = divideIfWhole(100,10) ?: 0
    println(result)
}

fun divideIfWhole(value: Int, divisor: Int): Int?{
    return if (value % divisor == 0) {
        value / divisor
    } else {
        null
    }

}