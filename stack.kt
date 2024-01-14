package com.study

class Stack {
    val stackSize = 50
    var stacked = arrayOfNulls<String>(stackSize)
    var top = 0

    fun isFull(): Boolean {
        return top == stackSize
    }

    fun push(data: String) {
        if (!isFull()) {
            stacked[top] = data
            top++
        } else {
            println("범위를 넘었잖아")
        }
    }
    fun popping(){
        if (!isFull()) {
            var data = stacked[top-1]
            stacked[top-1] = null
            println(data)
        } else {
            println("범위를 넘었잖아")
        }
    }
    override fun toString(): String {
        return stacked.contentToString()
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
