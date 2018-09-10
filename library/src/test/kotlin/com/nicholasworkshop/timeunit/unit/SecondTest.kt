package com.nicholasworkshop.timeunit.unit

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class SecondTest {

    lateinit var second: Second

    @BeforeEach
    internal fun setUp() {
        second = Second(1324876970)
    }

    @Test
    fun toNanosecond() {
        assertThat(second.toNanosecond()).isEqualTo(1324876970000000000)
    }

    @Test
    fun toMicrosecond() {
        assertThat(second.toMicrosecond()).isEqualTo(1324876970000000)
    }

    @Test
    fun toMillisecond() {
        assertThat(second.toMillisecond()).isEqualTo(1324876970000)
    }

    @Test
    fun toMinute() {
        assertThat(second.toMinute()).isEqualTo(22081282)
    }

    @Test
    fun toHour() {
        assertThat(second.toHour()).isEqualTo(368021)
    }

    @Test
    fun toDay() {
        assertThat(second.toDay()).isEqualTo(15334)
    }
}