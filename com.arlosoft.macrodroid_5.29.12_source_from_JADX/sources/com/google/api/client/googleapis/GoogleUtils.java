package com.google.api.client.googleapis;

public final class GoogleUtils {

    /* renamed from: a */
    public static final Integer f52229a = 1;

    /* renamed from: b */
    public static final Integer f52230b = 23;

    /* renamed from: c */
    public static final Integer f52231c = 0;

    /* renamed from: d */
    public static final String f52232d;

    static {
        String valueOf = String.valueOf(1);
        String valueOf2 = String.valueOf(23);
        String valueOf3 = String.valueOf(0);
        StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length() + valueOf3.length());
        sb.append(valueOf);
        sb.append(".");
        sb.append(valueOf2);
        sb.append(".");
        sb.append(valueOf3);
        f52232d = sb.toString().toString();
    }

    private GoogleUtils() {
    }
}
