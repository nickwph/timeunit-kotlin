package com.nicholasworkshop.timeunit.unit

import java.util.concurrent.TimeUnit

data class Minute(
        private val minute: Long) {

    fun toNanosecond(): Long {
        return TimeUnit.MINUTES.toNanos(minute)
    }

    fun toMillisecond(): Long {
        return TimeUnit.MINUTES.toMillis(minute)
    }

    fun toMicrosecond(): Long {
        return TimeUnit.MINUTES.toMicros(minute)
    }

    fun toSecond(): Long {
        return TimeUnit.MINUTES.toSeconds(minute)
    }

    fun toHour(): Long {
        return TimeUnit.MINUTES.toHours(minute)
    }

    fun toDay(): Long {
        return TimeUnit.MINUTES.toDays(minute)
    }
}