package com.wheel.labsv2.utils;

import org.apache.logging.log4j.util.Strings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;

public class StringUtils {

    public static @NotNull String escapeCSVItem(@Nullable final String s) {
        if (s == null) {
            return "";
        }

        String escaped = s.replace(
            "\"",
            "\"\""
        );
        if ((escaped.indexOf(',') >= 0) || (escaped.indexOf('\n') >= 0)) {
            escaped = "\"" + escaped + "\"";
        }
        return escaped;
    }

    public static boolean isNullOrWhitespace(final String s) {
        return((s == null)
            || (s.trim()
                .length() == 0));
    }

    public static boolean isNullOrWhitespace(final UpperString s) {
        if (s == null) {
            return true;
        }
        return isNullOrWhitespace(s.toString());
    }

    public static boolean isValidUrl(final String s) {
        if (isNullOrWhitespace(s)) {
            return false;
        }

        try {
            new URL(s);
            return true;
        } catch(MalformedURLException e) {
            return false;
        }
    }

    public static @Nullable String join(
        @Nullable final Collection<String> collection,
        final char splitChar
    ) {
        if (collection == null) {
            return null;
        }
        return Strings.join(
            collection.iterator(),
            splitChar
        );
    }

    public static int safeStringLength(@Nullable final String s) {
        return s != null ? s.length() : 0;
    }

    public static boolean safeStringsEquals(
        final String a,
        final String b
    ) {
        return ((a != null) || (b == null)) && ((a == null) || (b != null)) && ((a == null) || a.equals(b));
    }

    public static @Nullable String upperTrim(@Nullable String s) {
        if (s == null) {
            return null;
        }
        return s.trim()
            .toUpperCase();
    }
}
