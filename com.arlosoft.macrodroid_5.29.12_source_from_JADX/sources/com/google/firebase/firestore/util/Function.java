package com.google.firebase.firestore.util;

public interface Function<F, T> {
    T apply(F f);
}
