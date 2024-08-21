package tasks

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LineNumbersTest {

    private val lineNumbers = LineNumbers()

    @Test
    fun test01True() {
        val exception = true
        val listNumbers = intArrayOf(2, 4, 5, 6, 2)
        assertEquals(exception, lineNumbers.someMethod(listNumbers))
    }

    @Test
    fun test02True() {
        val exception = true
        val listNumbers = intArrayOf(0, 22, 23, 24, 29)
        assertEquals(exception, lineNumbers.someMethod(listNumbers))
    }

    @Test
    fun test03True() {
        val exception = true
        val listNumbers = intArrayOf(1, 2, 3, 4)
        assertEquals(exception, lineNumbers.someMethod(listNumbers))
    }

    @Test
    fun test04False() {
        val exception = false
        val listNumbers = intArrayOf(1, 2, 4)
        assertEquals(exception, lineNumbers.someMethod(listNumbers))
    }

    @Test
    fun test05True() {
        val exception = false
        val listNumbers = intArrayOf(23, 29, 28, 27, 11)
        assertEquals(exception, lineNumbers.someMethod(listNumbers))
    }

    @Test
    fun test06False() {
        val exception = false
        val listNumbers = intArrayOf(23, 29, 28, 24, 11)
        assertEquals(exception, lineNumbers.someMethod(listNumbers))
    }

    @Test
    fun test07True() {
        val exception = true
        val listNumbers = intArrayOf(23, 29, 28, 24, 11)
        assertEquals(exception, lineNumbers.someMethod(listNumbers))
    }

}