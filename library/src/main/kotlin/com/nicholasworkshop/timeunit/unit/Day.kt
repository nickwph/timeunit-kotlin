package com.nicholasworkshop.timeunit.unit

import java.util.concurrent.TimeUnit

data class Day(
        private val day: Long) {

    fun toNanosecond(): Long {
        return TimeUnit.DAYS.toNanos(day)
    }

    fun toMillisecond(): Long {
        return TimeUnit.DAYS.toMillis(day)
    }

    fun toMicrosecond(): Long {
        return TimeUnit.DAYS.toMicros(day)
    }

    fun toSecond(): Long {
        return TimeUnit.DAYS.toSeconds(day)
    }

    fun toMinute(): Long {
        return TimeUnit.DAYS.toMinutes(day)
    }

    fun toHour(): Long {
        return TimeUnit.DAYS.toHours(day)
    }
}