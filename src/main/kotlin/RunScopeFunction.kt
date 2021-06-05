// public inline fun <T, R> T.run(block: T.() -> R): R {
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    return block()
// }

fun main() {

    /**
     *  RUN SCOPE FUNCTION (Extension Function)
     *  Argument: this (Extension Function)
     *  Returns: last statement of RUN block
     *  */

    val movie = Movie()

    val returnValue1: Unit = movie.run {
        name = "Interstellar"
        rating = 9
    }

    println("Return Value 1: $returnValue1")

    val returnValue2: String = movie.run {
        println("\nMovie: $name")
        println("Rating: $rating")
        "Code by Vineet"
    }

    println("\nReturn Value 2: $returnValue2")

}

//--------------- OUTPUT ---------------------------

// Return Value 1: kotlin.Unit

// Movie: Interstellar
// Rating: 9

// Return Value 2: Code by Vineet