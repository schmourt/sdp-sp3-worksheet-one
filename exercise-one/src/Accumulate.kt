object Accumulate {
    fun <T, R> accumulate(collection: List<T>, function: (T) -> R): List<R> {
        val resultList = arrayListOf<R>()
        for (x in collection) { resultList.add(function(x)) }
        return resultList
    }
}
