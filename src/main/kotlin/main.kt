import java.io.FileReader
import kotlin.system.exitProcess

/**
 * The *man* program on linux looks for manual pages of a program in _/usr/man_
 * directory. So, you should copy your man files in there at installation time.
 */
fun main(args: Array<String>) {
    if (args.contains("--help")) {
        println("This is the help to show to users.")
        exitProcess(0)
    } else if (args.contains("--version")) {
        println("v1.0.0")
        exitProcess(0)
    }

    val input = if (args.contains("--input")) {
        FileReader("file name argument after --input").buffered()
    } else {
        System.`in`.bufferedReader()
    }

    input.close()
}
