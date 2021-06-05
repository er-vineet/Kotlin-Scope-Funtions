// public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    return receiver.block()
// }

fun main() {

    /**
     *  WITH SCOPE FUNCTION
     *  Argument: this (Extension Function)
     *  Returns: last statement of WITH block
     *  */

    val movie = Movie()

    val returnValue1: Unit = with(movie) {
        name = "Interstellar"
        rating = 9
    }

    println("Return Value 1: $returnValue1")

    val returnValue2: String = with(movie) {
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