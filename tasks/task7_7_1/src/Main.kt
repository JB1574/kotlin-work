// Task 7.7.1: program to compute stats for a numeric dataset

fun main(args: Array<String>) {
    require(args.isNotEmpty()) {
        "Please provide a data filename"
    }

    val numbers = readData(args[0])
    displayStats(numbers)
}
