package com.nicholasworkshop.timeunit

import com.nicholasworkshop.timeunit.unit.*


object TimeUnit {

    fun nanosecond(nanosecond: Long): Nanosecond {
        return Nanosecond(nanosecond)
    }

    fun microsecond(microsecond: Long): Microsecond {
        return Microsecond(microsecond)
    }

    fun millisecond(millisecond: Long): Millisecond {
        return Millisecond(millisecond)
    }

    fun second(second: Long): Second {
        return Second(second)
    }

    fun minute(minute: Long): Minute {
        return Minute(minute)
    }

    fun hour(hour: Long): Hour {
        return Hour(hour)
    }

    fun day(day: Long): Day {
        return Day(day)
    }
}