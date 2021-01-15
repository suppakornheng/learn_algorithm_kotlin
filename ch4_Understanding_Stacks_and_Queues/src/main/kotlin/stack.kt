class stack<E> {
    private val minCapacityIncrement = 12

    private lateinit var elements: Array<Any?>
    private var size =0

    constructor(){
        this.elements = arrayOfNulls()
    }

    constructor(initialCapacity: Int){
        this.elements = arrayOfNulls(initialCapacity)
    }

    fun pusj

}