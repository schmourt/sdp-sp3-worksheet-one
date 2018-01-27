class Deque<T> {
    private var head: Element<T>? = null

    fun push(value: T) {
        var node : Element<T>? = Element(value)
        if (head != null){
            head = node
        }
        else{
            head = Element(value, null,null)
        }
    }

    fun pop(): T? {
        var value = head?.value
        var getValue : Element<T>? = head
        while (getValue?.next != null){
            getValue = getValue.next
        }
        value = getValue?.value
        getValue?.prev?.next = null
        return value
    }

    fun unshift(value: T) {
        val oldHead = head
        val newHead = Element(value, null, oldHead)
        oldHead?.prev = newHead
        head = newHead
    }

    fun shift(): T? {
        val value = head?.value
        head = head?.next
        return value
    }

    private data class Element<T>(val value: T, var prev: Element<T>? = null, var next: Element<T>? = null)
}
