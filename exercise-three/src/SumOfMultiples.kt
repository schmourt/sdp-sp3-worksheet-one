Object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        var sumofNum: Int = 0
        for (num in 1 until limit) {
            for (x in factors) {
                if (num % x == 0) {
                    sumOfNum += num
                    break
                }
            }
        }
        return sumofNum
    }
}
