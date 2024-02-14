package com.google.api.client.http;

public class HttpStatusCodes {
    /* renamed from: a */
    public static boolean m72124a(int i) {
        if (i == 307) {
            return true;
        }
        switch (i) {
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m72125b(int i) {
        return i >= 200 && i < 300;
    }
}
