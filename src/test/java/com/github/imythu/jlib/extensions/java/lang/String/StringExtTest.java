package com.github.imythu.jlib.extensions.java.lang.String;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author imythu
 */
public class StringExtTest {

    @Test
    public void testHasText() {
        Assert.assertFalse("          ".hasText());
        Assert.assertFalse("".hasText());
        Assert.assertFalse(((String) null).hasText());
        Assert.assertTrue("t".hasText());
    }

    @Test
    public void testHasLength() {
        Assert.assertTrue("          ".hasLength());
        Assert.assertFalse("".hasLength());
        Assert.assertFalse(((String) null).hasLength());
        Assert.assertTrue("t".hasLength());
    }
}
