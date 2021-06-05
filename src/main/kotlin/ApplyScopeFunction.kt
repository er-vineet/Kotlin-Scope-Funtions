// public inline fun <T> T.apply(block: T.() -> Unit): T {
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    block()
//    return this
// }

fun main() {

    /**
     *  APPLY SCOPE FUNCTION (Extension Function)
     *  Argument: this (Extension Function)
     *  Returns: returns this
     *  */

    val movie = Movie()

    val returnValue1: Movie = movie.apply {
        name = "Interstellar"
        rating = 9
    }

    println("Return Value 1: $returnValue1")

    val returnValue2: Movie = movie.apply {
        println("\nMovie: $name")
        println("Rating: $rating")
        rating = 10
    }

    println("\nReturn Value 2: $returnValue2")
    movie.rating = 11
    println("\nReturn Value 2: $returnValue2")

}

//--------------- OUTPUT ---------------------------

// Return Value 1: Movie(name='Interstellar', rating=9)

// Movie: Interstellar
// Rating: 9

// Return Value 2: Movie(name='Interstellar', rating=10)

// Return Value 2: Movie(name='Interstellar', rating=11)