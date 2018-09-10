package com.nicholasworkshop.timeunit.unit

import java.util.concurrent.TimeUnit

data class Nanosecond(
        private val nanosecond: Long) {

    fun toMillisecond(): Long {
        return TimeUnit.NANOSECONDS.toMillis(nanosecond)
    }

    fun toMicrosecond(): Long {
        return TimeUnit.NANOSECONDS.toMicros(nanosecond)
    }

    fun toSecond(): Long {
        return TimeUnit.NANOSECONDS.toSeconds(nanosecond)
    }

    fun toMinute(): Long {
        return TimeUnit.NANOSECONDS.toMinutes(nanosecond)
    }

    fun toHour(): Long {
        return TimeUnit.NANOSECONDS.toHours(nanosecond)
    }

    fun toDay(): Long {
        return TimeUnit.NANOSECONDS.toDays(nanosecond)
    }
}