package com.wheel.labsv2.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Objects;

public class UpperString implements Serializable, Comparable<UpperString> {

    private final @NotNull String _source;

    private UpperString(@NotNull final String source) {
        _source = source;
    }

    public static @Nullable UpperString build(@Nullable final String source) {
        if (source == null) {
            return null;
        }
        return new UpperString(StringUtils.upperTrim(source));
    }

    @Override
    public int compareTo(@NotNull final UpperString other) {
        return _source.compareTo(other._source);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final UpperString that = (UpperString)o;
        return _source.equals(that._source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_source);
    }

    @Override
    public @NotNull String toString() {
        return _source;
    }
}
