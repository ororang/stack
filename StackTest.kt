package com.study

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StackTest {
    val stack = Stack()
    @Test
    fun push( ) {
        stack.push("1st")
        stack.push("2nd")
        stack.push("3rd")
        stack.push("4th")
        stack.push("5th")
        assertEquals("5th,4th,3rd,2nd,1st", stack.toString())
    }

    @Test
    fun popping() {
        push()
        stack.popping()
        assertEquals("4th", stack.popping())
        stack.popping()
        stack.popping()
        stack.popping()
        assertEquals(null, stack.popping())
    }
}