package com.github.imythu.jlib.extensions.java.lang.Object;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author imythu
 */
public class ObjectExtTest {

    @Test
    public void testSafeEquals() {
        Assert.assertFalse(new Object().safeEquals(""));
        Object obj = null;
        Assert.assertFalse(obj.safeEquals(new Object()));
        Assert.assertFalse(((String) null).safeEquals(""));
        Assert.assertTrue(((String) null).safeEquals(null));
        Assert.assertTrue(obj.safeEquals(null));
    }
}
