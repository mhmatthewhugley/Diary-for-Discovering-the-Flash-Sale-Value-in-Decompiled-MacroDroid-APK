package com.google.firebase.firestore.util;

public class Assert {
    /* renamed from: a */
    public static AssertionError m76440a(String str, Object... objArr) {
        throw new AssertionError(m76442c(str, objArr));
    }

    /* renamed from: b */
    public static AssertionError m76441b(Throwable th, String str, Object... objArr) {
        throw ApiUtil.m76439a(m76442c(str, objArr), th);
    }

    /* renamed from: c */
    private static String m76442c(String str, Object... objArr) {
        return "INTERNAL ASSERTION FAILED: " + String.format(str, objArr);
    }

    /* renamed from: d */
    public static void m76443d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw m76440a(str, objArr);
        }
    }
}
