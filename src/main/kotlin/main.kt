import java.io.FileReader
import kotlin.system.exitProcess

/**
 * The *man* program on linux looks for manual pages of a program in _/usr/man_
 * directory. So, you should copy your man files in there at installation time.
 *
 * [Here](https://askubuntu.com/a/345150), [here](https://stackoverflow.com/q/5570795),
 * [here](https://stackoverflow.com/q/5255372), and [here](https://stackoverflow.com/q/12595270)
 * show how shell autocompletes arguments for a command when pressing <kbd>Tab</kbd>
 * (called *programmable completion*).
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
