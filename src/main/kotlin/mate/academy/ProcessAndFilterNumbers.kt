package mate.academy

/**
 * Transform each number: if even -> half, if odd -> doubled, then return only values > 25.
 * Implemented using a Sequence to avoid creating intermediate lists for large inputs.
 */
const val THRESHOLD = 25
const val EVEN_DIVISOR = 2
const val ODD_MULTIPLIER = 2
fun processAndFilterNumbers(numbers: List<Int>): List<Int> =
    numbers.asSequence()
        .map { if (it % 2 == 0) it / EVEN_DIVISOR else it * ODD_MULTIPLIER }
        .filter { it > THRESHOLD }
        .toList()

