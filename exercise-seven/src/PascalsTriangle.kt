object PascalsTriangle {
    private fun factorial(x : Int): Int{
        return if (x < 0) - 1 else (if (x == 1 || x == 0) 1 else x * factorial(x-1))
    }

    fun computeTriangle(rows: Int): List<List<Int>> {
        val outside = mutableListOf<List<Int>>()
        for (i in 1..rows) {
            for (j in 1..i) {
                val value = factorial(i) / (factorial(j) * factorial(i - j))

            }
            return outside
        }

    }
}

