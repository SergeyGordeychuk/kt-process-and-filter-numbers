package mate.academy

/**
 * Transform each number: if even -> half, if odd -> doubled, then return only values > 25.
 * Implemented using a Sequence to avoid creating intermediate lists for large inputs.
 */
fun processAndFilterNumbers(numbers: List<Int>): List<Int> =
    numbers.asSequence()
        .map { if (it % 2 == 0) it / 2 else it * 2 }
        .filter { it > 25 }
        .toList()

