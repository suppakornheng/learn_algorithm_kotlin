import java.lang.IndexOutOfBoundsException
import java.lang.RuntimeException

class FixedStacke<E> (capacity:Int){
    private val elements: Array<Any?> = arrayOfNulls(capacity)
    private var size =0

    fun push(element: E){
        if(size == elements.size){
            throw StackOverflowException()
        }
        elements[size++]= element
    }


    fun pop():E{
        if(size==0) throw StackUnderflowException()
        val index = --size
        val obj = elements[index]
        elements[index]=null
        return obj as E
    }

    fun peek()=try{
        elements[size-1] as E
    } catch (e:IndexOutOfBoundsException){
        throw  StackUnderflowException();
    }

    fun isEmpty() = size==0
    fun isFull() = size==elements.size
}

class StackOverflowException : RuntimeException() {

}

class StackUnderflowException : RuntimeException() {

}
