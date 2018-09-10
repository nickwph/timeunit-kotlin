package com.nicholasworkshop.timeunit.unit

import java.util.concurrent.TimeUnit

data class Hour(
        private val hour: Long) {

    fun toNanosecond(): Long {
        return TimeUnit.HOURS.toNanos(hour)
    }

    fun toMillisecond(): Long {
        return TimeUnit.HOURS.toMillis(hour)
    }

    fun toMicrosecond(): Long {
        return TimeUnit.HOURS.toMicros(hour)
    }

    fun toSecond(): Long {
        return TimeUnit.HOURS.toSeconds(hour)
    }

    fun toMinute(): Long {
        return TimeUnit.HOURS.toMinutes(hour)
    }

    fun toDay(): Long {
        return TimeUnit.HOURS.toDays(hour)
    }
}