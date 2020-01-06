package hm.binkley

import hm.binkley.math.Rational
import hm.binkley.math.Rational.Companion.NEGATIVE_INFINITY
import hm.binkley.math.Rational.Companion.NaN
import hm.binkley.math.Rational.Companion.ONE
import hm.binkley.math.Rational.Companion.POSITIVE_INFINITY
import hm.binkley.math.Rational.Companion.ZERO
import hm.binkley.math.downTo
import hm.binkley.math.over
import lombok.Generated

@Generated // Lie to JaCoCo
fun main() {
    println("ZERO is $ZERO")
    println("NaN is $NaN")
    println("POSITIVE_INFINITY is $POSITIVE_INFINITY")
    println("NEGATIVE_INFINITY is $NEGATIVE_INFINITY")
    println("1 is ${Rational.new(1)}")
    println("4/10 is ${4 over 10}")
    println("4/2 is ${4 over 2}")
    println("0/0 is ${0 over 0}")
    println("NaN is a unique object is ${NaN === 0 over 0}")
    println("But no NaN is equal is ${NaN != 0 over 0}")
    println("4/0 is ${4 over 0}")
    println("-4/0 is ${-4 over 0}")
    println("-4/-4 is ${-4 over -4}")

    val ratA = 3 over 5
    val ratB = 2 over 3
    println("$ratA ÷ $ratB is ${ratA / ratB}")

    val ratC = ZERO
    val ratD = Rational.new(7, 3)
    val ratE = Rational.new(1, 2)
    print("Progression from $ratC to $ratD incrementing by $ratE:")
    for (r in ratC..ratD step ratE) print(" $r")
    println()
    print("Progression from $ratD to $ratC decrementing by $ONE:")
    for (r in ratD downTo ratC) print(" $r")
    println()

    try {
        @Suppress("ControlFlowWithEmptyBody")
        for (r in POSITIVE_INFINITY..NaN);
    } catch (e: IllegalStateException) {
        println("Expected error for progression containing $NaN: $e")
    }

    println("$POSITIVE_INFINITY greater than $ZERO is ${POSITIVE_INFINITY > ZERO}")
    println("$NEGATIVE_INFINITY less than $ZERO is ${NEGATIVE_INFINITY < ZERO}")

    val toSort = listOf(
        POSITIVE_INFINITY,
        NaN,
        ZERO,
        POSITIVE_INFINITY,
        NaN,
        NEGATIVE_INFINITY,
        ZERO,
        NEGATIVE_INFINITY
    )
    println("$toSort sorted is ${toSort.sorted()}")
}
