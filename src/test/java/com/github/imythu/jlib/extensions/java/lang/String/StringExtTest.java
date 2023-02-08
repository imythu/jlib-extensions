package com.github.imythu.jlib.extensions.java.lang.String;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhuhf
 */
class StringExtTest {

    @Test
    void testHasText() {
        Assertions.assertFalse("          ".hasText());
        Assertions.assertFalse("".hasText());
        Assertions.assertFalse(((String) null).hasText());
        Assertions.assertTrue("t".hasText());
    }

    @Test
    void testHasLength() {
        Assertions.assertTrue("          ".hasLength());
        Assertions.assertFalse("".hasLength());
        Assertions.assertFalse(((String) null).hasLength());
        Assertions.assertTrue("t".hasLength());
    }
}
