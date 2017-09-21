package com.ruimaranhao;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class URLValidtorTest {

    @Test
    public void validURL() throws IOException {
        assertTrue(URLValidtor.isURL("abc.com"));

    }

    @Test
    public void invalidURL() throws IOException {
        assertFalse(URLValidtor.isURL("what"));

    }
}
