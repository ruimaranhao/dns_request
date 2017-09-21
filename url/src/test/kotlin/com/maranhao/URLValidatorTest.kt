package com.maranhao


import com.ruimaranhao.URLValidtor
import org.junit.Test
import java.io.IOException
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class URLValidatorTest {

    @Test
    @Throws(IOException::class)
    fun validURL() {
        assertTrue(URLValidtor.isURL("abc.com"))

    }

    @Test
    @Throws(IOException::class)
    fun invalidURL() {
        assertFalse(URLValidtor.isURL("what"))

    }
}
