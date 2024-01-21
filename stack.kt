package com.study

class Stack {
    val stackSize = 50
    var stacked = arrayOfNulls<String>(stackSize)
    var top = 0

    fun isFull() = top == stackSize
    fun isEmpty()=top == 0
    fun push(data: String) =
        if (!isFull()) {
            stacked[top] = data
            top++
            true
        } else {
            println("범위를 넘었잖아")
            false
        }

    fun popping() = if( isEmpty())  null else {
            top--
            stacked[top]
        }
    override fun toString(): String {
        return stacked.slice(0 until top).reversed().joinToString(",")
    }
}

fun main() {
    val stack = Stack()
    for(i in 1..20){
        stack.push(i.toString())
    }
    stack.popping()
    print(stack)
}
