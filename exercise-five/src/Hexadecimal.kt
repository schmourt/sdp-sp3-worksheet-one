object Hexadecimal {

    fun toDecimal(s: String): Int {
        val hexMap = hashMapOf(
                "0" to 0,
                "1" to 1, "2" to 2, "3" to 3, "4" to 4, "5" to 5,
                "6" to 6, "7" to 7, "8" to 8, "9" to 9, "a" to 10,
                "b" to 11, "c" to 12, "d" to 13, "e" to 14, "f" to 15)

        var result = 0
        var index = 0
        for (char in s.toLowerCase().toCharArray().reversed()) {
            val dec = (if (char.isDigit()) char.toString().toInt() else hexMap[char]) ?: return 0
            result += dec.toDouble() * (Math.pow(16, index))
            index= index+1
        }
        return result
    }
}
