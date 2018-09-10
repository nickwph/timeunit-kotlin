package com.nicholasworkshop.timeunit.unit

import java.util.concurrent.TimeUnit

data class Microsecond(
        private val microsecond: Long) {

    fun toNanosecond(): Long {
        return TimeUnit.MICROSECONDS.toNanos(microsecond)
    }

    fun toMillisecond(): Long {
        return TimeUnit.MICROSECONDS.toMillis(microsecond)
    }

    fun toSecond(): Long {
        return TimeUnit.MICROSECONDS.toSeconds(microsecond)
    }

    fun toMinute(): Long {
        return TimeUnit.MICROSECONDS.toMinutes(microsecond)
    }

    fun toHour(): Long {
        return TimeUnit.MICROSECONDS.toHours(microsecond)
    }

    fun toDay(): Long {
        return TimeUnit.MICROSECONDS.toDays(microsecond)
    }
}