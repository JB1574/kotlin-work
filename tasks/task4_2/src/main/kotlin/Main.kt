// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("Pizza Menu")
    println(" ")
    println("(a) Margherita")
    println("(b) Meat feast")
    println("(c) Pepperoni")
    println("(d) Hawaiian")
    println(" ")
    
    print("Choose your pizza (a-d): ")
    val order = readln().lowercase()
    
    if (order.length == 1 && order[0] in 'a'..'d') {
        println("Order accepted")
    }
    else {
        println("Invalid choice") // test
}

}
