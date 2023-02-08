package com.github.imythu.jlib.extensions.java.lang.Object;

import java.util.Objects;
import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

/**
 * @author zhuhf
 */
@Extension
public class ObjectExt {

    /**
     * Avoid NPE
     * @see Object#equals(Object)
     */
    public static boolean safeEquals(@This Object a, Object b) {
        return Objects.equals(a, b);
    }
}
