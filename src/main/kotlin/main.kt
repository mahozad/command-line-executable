import java.io.FileReader
import kotlin.system.exitProcess

/**
 * TODO: Convert this to a script (.kts) and get arguments with the implicit `args` variable.
 *  See [scripts repository](https://github.com/mahozad/scripts) for more information.
 */
fun main(args: Array<String>) {
    if ("--help" in args) {
        println("This is the help to show to users.")
        exitProcess(0)
    } else if ("--version" in args) {
        println("v1.0.0")
        exitProcess(0)
    }

    val input = if ("--input" in args) {
        FileReader("file name argument after --input").buffered()
    } else {
        // Get input from standard input
        System.`in`.bufferedReader()
    }

    input.close()
}
