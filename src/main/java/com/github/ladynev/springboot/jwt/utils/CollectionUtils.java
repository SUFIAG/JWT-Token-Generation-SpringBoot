package com.github.ladynev.springboot.jwt.utils;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * @author V.Ladynev
 */
public final class CollectionUtils {

    private CollectionUtils() {

    }

    public static <T> Stream<T> stream(Collection<T> collection) {
        return collection == null ? Stream.empty() : collection.stream();
    }

}
