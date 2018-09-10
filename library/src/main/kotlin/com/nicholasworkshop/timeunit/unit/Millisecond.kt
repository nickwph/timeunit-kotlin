package com.nicholasworkshop.timeunit.unit

import java.util.concurrent.TimeUnit

data class Millisecond(
        private val millisecond: Long) {

    fun toNanosecond(): Long {
        return TimeUnit.MILLISECONDS.toNanos(millisecond)
    }

    fun toMicrosecond(): Long {
        return TimeUnit.MILLISECONDS.toMicros(millisecond)
    }

    fun toSecond(): Long {
        return TimeUnit.MILLISECONDS.toSeconds(millisecond)
    }

    fun toMinute(): Long {
        return TimeUnit.MILLISECONDS.toMinutes(millisecond)
    }

    fun toHour(): Long {
        return TimeUnit.MILLISECONDS.toHours(millisecond)
    }

    fun toDay(): Long {
        return TimeUnit.MILLISECONDS.toDays(millisecond)
    }
}