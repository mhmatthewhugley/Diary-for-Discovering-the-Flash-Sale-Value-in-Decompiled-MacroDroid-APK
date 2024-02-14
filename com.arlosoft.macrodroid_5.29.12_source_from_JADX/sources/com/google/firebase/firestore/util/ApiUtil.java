package com.google.firebase.firestore.util;

public class ApiUtil {
    /* renamed from: a */
    public static AssertionError m76439a(String str, Throwable th) {
        AssertionError assertionError = new AssertionError(str);
        assertionError.initCause(th);
        return assertionError;
    }
}
