package tasks

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DayReleaseTest {

    private val dayRelease = DayRelease()

    @Test
    fun testTwoHoliday() {

        val lengthHoliday = 2
        val array = intArrayOf(0, 0, 1, 0, 0)

        val expectedHoliday = 2
        assertEquals(expectedHoliday, dayRelease.findDayoffs(lengthHoliday, array))
    }

    @Test
    fun testOneHoliday() {
        val lengthHoliday = 1
        val array = intArrayOf(0, 0, 1, 0)

        val expectedHoliday = 4
        assertEquals(expectedHoliday, dayRelease.findDayoffs(lengthHoliday, array))
    }

    @Test
    fun testThreeHoliday() {
        val lengthHoliday = 3
        val array = intArrayOf(0, 0, 1, 0, 0)

        val expectedHoliday = 0
        assertEquals(expectedHoliday, dayRelease.findDayoffs(lengthHoliday, array))
    }

    @Test
    fun testOneTwoHoliday() {
        val lengthHoliday = 1
        val array = intArrayOf(0, 0, 1, 0, 0, 0)

        val expectedHoliday = 9
        assertEquals(expectedHoliday, dayRelease.findDayoffs(lengthHoliday, array))
    }

    @Test
    fun testOneDaysCount9Version() {
        val lengthHoliday = 1
        val array = intArrayOf(0, 0, 1, 0, 0)

        val expectedHoliday = 6
        assertEquals(expectedHoliday, dayRelease.findDayoffs(lengthHoliday, array))
    }
}