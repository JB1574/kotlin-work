// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

// three side lengths as command line arguments
// floating point numbers as input validate the input is a float
// fewer than three arguments println("Error: values for a, b, c required on command line")
// print Area as "Area = $Area (to 5 dp)"
//

fun main(args: Array<String>){
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()
    
    val perimiter =(a+b+c)
    val s = perimiter / 2
    val sa = s-a
    val sb = s-b
    val sc = s-c
    
    val sqrt_part = s*sa*sb*sc // the part that is inside of the square root function
    val Area = Math.sqrt(sqrt_part.toDouble())
    
    println("Area = %.5f".format(Area))
    
    
}

