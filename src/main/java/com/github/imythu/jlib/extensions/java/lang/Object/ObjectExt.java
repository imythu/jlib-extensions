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
     * Returns {@code true} if the arguments are equal to each other
     * and {@code false} otherwise.
     * Consequently, if both arguments are {@code null}, {@code true}
     * is returned and if exactly one argument is {@code null}, {@code
     * false} is returned.  Otherwise, equality is determined by using
     * the {@link Object#equals equals} method of the first
     * argument.
     *
     * @param a an object
     * @param b an object to be compared with {@code a} for equality
     * @return {@code true} if the arguments are equal to each other
     * and {@code false} otherwise
     * @see Object#equals(Object)
     */
    public static boolean safeEquals(@This Object a, Object b) {
        return Objects.equals(a, b);
    }
}
