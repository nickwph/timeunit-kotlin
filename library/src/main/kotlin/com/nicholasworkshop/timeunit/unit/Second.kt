package com.nicholasworkshop.timeunit.unit

import java.util.concurrent.TimeUnit

data class Second(
        private val second: Long) {

    fun toNanosecond(): Long {
        return TimeUnit.SECONDS.toNanos(second)
    }

    fun toMicrosecond(): Long {
        return TimeUnit.SECONDS.toMicros(second)
    }

    fun toMillisecond(): Long {
        return TimeUnit.SECONDS.toMillis(second)
    }

    fun toMinute(): Long {
        return TimeUnit.SECONDS.toMinutes(second)
    }

    fun toHour(): Long {
        return TimeUnit.SECONDS.toHours(second)
    }

    fun toDay(): Long {
        return TimeUnit.SECONDS.toDays(second)
    }
}