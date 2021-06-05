// public inline fun <T, R> T.let(block: (T) -> R): R {
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    return block(this)
// }

fun main() {

    /**
     *  LET SCOPE FUNCTION (Extension Function)
     *  Argument: it
     *  Returns: last statement of LET block
     *  */

    val movie = Movie()

    val returnValue1: Unit = movie.let {
        it.name = "Interstellar"
        it.rating = 9
    }

    println("Return Value 1: $returnValue1")

    val returnValue2: String = movie.let {
        println("\nMovie: ${it.name}")
        println("Rating: ${it.rating}")
        "Code by Vineet"
    }

    println("\nReturn Value 2: $returnValue2")

}

//--------------- OUTPUT ---------------------------

// Return Value 1: kotlin.Unit

// Movie: Interstellar
// Rating: 9

// Return Value 2: Code by Vineet