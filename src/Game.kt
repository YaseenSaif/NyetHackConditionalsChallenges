import kotlin.math.pow

fun main() {
    var healthPoints: Int =100;
    val karma = (Math.pow(Math.random(),(110 - healthPoints) / 100.0) *20).toInt();
    var auroColor :String = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> ""
    }


    println("auroColor:$auroColor");
}