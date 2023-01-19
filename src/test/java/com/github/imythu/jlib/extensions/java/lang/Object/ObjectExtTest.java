package com.github.imythu.jlib.extensions.java.lang.Object;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhuhf
 */class ObjectExtTest {

    @Test
    void testSafeEquals() {
        Assertions.assertFalse(new Object().safeEquals(""));
        Object obj = null;
        Assertions.assertFalse(obj.safeEquals(new Object()));
        Assertions.assertTrue(obj.safeEquals(null));
    }
}
