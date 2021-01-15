class Vector <E> {
    private val minCapacityIncrement = 12
    var elements: Array <Any?>
    private var size = 0

    constructor() {
        this.elements = arrayOf()
    }

    constructor(initialCapacity: Int) {
        if (initialCapacity > 0) {
            this.elements = Array(initialCapacity) {
                    i -> null
            }
        } else if (initialCapacity == 0) {
            this.elements = emptyArray()
        } else {
            throw IllegalArgumentException("Illegal Capacity: $initialCapacity")
        }
    }

    fun add(element: E): Boolean {
        var a = elements
        val s = size
        if (s == a.size) {
            val newArray = arrayOfNulls<Any> (s +
                    if (s < minCapacityIncrement / 2)
                        minCapacityIncrement
                    else
                        s shr 1)
            System.arraycopy(a, 0, newArray, 0, s)
            a = newArray
            elements = a
        }
        a[s] = element
        size = s + 1
        return true
    }

    fun add(index: Int, element: E) {
        // check below for implementation detail
    }

    fun get(index: Int): E {
        // check below for implementation detail
    }

    fun set(index: Int, element: E): E {
        // check below for implementation detail
    }

    fun remove(index: Int): E {
        // check below for implementation detail
    }

    fun remove(element: E): Boolean {
        // check below for implementation detail
    }

    // This method is called by other public APIs explained below
    private fun newCapacity(currentCapacity: Int): Int {
        val increment =
            if (currentCapacity < minCapacityIncrement / 2)
                minCapacityIncrement
            else
                currentCapacity shr 1
        return currentCapacity + increment
    }

    private fun throwIndexOutOfBoundsException(index: Int, size: Int):
            IndexOutOfBoundsException {
        throw IndexOutOfBoundsException("Invalid index $index, size is $size")
    }
}