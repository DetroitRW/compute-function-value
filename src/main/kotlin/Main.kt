import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите число: ")
    val x = reader.nextInt()

    val y = if (x > 0) {
         2 * x - 10
    } else if (x == 0) {
         0
    } else {
         2 * abs(x) - 1
    }
    print(y)
}