package com.github.imythu.jlib.extensions.java.lang.String;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

/**
 * from Spring StringUtils
 * @author imythu
 */
@Extension
public class StringExt {

    /**
     * Check whether the given {@code String} contains actual <em>text</em>.
     *
     * <p>More specifically, this method returns {@code true} if the {@code String} is not {@code
     * null}, its length is greater than 0, and it contains at least one non-whitespace character.
     *
     * @param str the {@code String} to check (may be {@code null})
     * @return {@code true} if the {@code String} is not {@code null}, its length is greater than 0,
     *     and it does not contain whitespace only
     * @see #hasLength(String)
     * @see Character#isWhitespace
     */
    public static boolean hasText(@This String str) {
        return (str != null && !str.isEmpty() && containsText(str));
    }

    /**
     * Check that the given {@code String} is neither {@code null} nor of length 0.
     * <p>Note: this method returns {@code true} for a {@code String} that
     * purely consists of whitespace.
     * @param str the {@code String} to check (may be {@code null})
     * @return {@code true} if the {@code String} is not {@code null} and has length
     * @see #hasText(String)
     */
    public static boolean hasLength(@This String str) {
        return (str != null && !str.isEmpty());
    }

    private static boolean containsText(CharSequence str) {
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
