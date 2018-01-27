object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        val result = mutableListOf<Int>()

        for (i in (2..int)) {
            var t = true
            s@ for (j in 2..i - 1) {
                if (i % j == 0) {
                    t = false
                    break@s
                }
            }
            if (t) result.add(i)
        }
        return result
    }

    fun primeFactors(long: Long): List<Long> {
        val result = mutableListOf<Long>()

        for (i in (2L..long)) {
            var t = true
            s@ for (j in 2L until long) {
                if (long % j == 0L) {
                    t = false
                    break@s
                }
            }
            if (t) result.add(i)
        }
        return result
    }
}
