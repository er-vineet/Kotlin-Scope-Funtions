// public inline fun <T> T.also(block: (T) -> Unit): T {
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    block(this)
//    return this
// }


fun main() {

    /**
     *  ALSO SCOPE FUNCTION (Extension Function)
     *  Argument: it
     *  Returns: returns this
     *  */

    val movie = Movie()

    val returnValue1: Movie = movie.also {
        it.name = "Interstellar"
        it.rating = 9
    }

    println("Movie: $movie")
    movie.name = "Dark Knight"
    movie.rating = 10

    println("\nReturn Value 1: $returnValue1")

    val returnValue2: Movie = movie.also {
        println("\nMovie: ${it.name}")
        println("Rating: ${it.rating}")
    }

    movie.name = "Batman"
    movie.rating = 8
    println("\nReturn Value 2: $returnValue2")

}

//--------------- OUTPUT ---------------------------

// Movie: Movie(name='Interstellar', rating=9)

// Return Value 1: Movie(name='Dark Knight', rating=10)

// Movie: Dark Knight
// Rating: 10

// Return Value 2: Movie(name='Batman', rating=8)