package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.Method;

public final class RouteException extends Exception {

    /* renamed from: a */
    private static final Method f57605a;
    private IOException lastException;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        f57605a = method;
    }
}
