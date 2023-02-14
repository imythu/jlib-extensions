package com.github.imythu.jlib.extensions.java.lang.Boolean;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

/**
 * @author imythu
 */
@Extension
public class BooleanExt {

    /**
     * notnull and is true<br/> Avoid NPE
     *
     * @return boolean
     */
    public static boolean isTrue(@This Boolean nullableThis) {
        return nullableThis != null && nullableThis;
    }

    /**
     * null or false<br/> Avoid NPE
     *
     * @return boolean
     */
    public static boolean isNullOrFalse(@This Boolean nullableThis) {
        return nullableThis == null || !nullableThis;
    }

    /**
     * notnull and is false<br/> Avoid NPE
     *
     * @return boolean
     */
    public static boolean isFalse(@This Boolean nullableThis) {
        return nullableThis != null && !nullableThis;
    }
}
