// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle

    return a > 0.0 &&
        b > 0.0 &&
        c > 0.0 &&
        a < b + c &&
        b < a + c &&
        c < a + b
}

fun triangleArea(triangle: Triangle): Double {
    require(isValidTriangle(triangle)) { "Invalid triangle" }

    val (a, b, c) = triangle
    val semiPerimeter = (a + b + c) / 2.0

    return sqrt(
        semiPerimeter *
            (semiPerimeter - a) *
            (semiPerimeter - b) *
            (semiPerimeter - c)
    )
}
