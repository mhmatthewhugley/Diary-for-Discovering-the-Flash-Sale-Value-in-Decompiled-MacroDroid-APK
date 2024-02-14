package com.google.android.gms.maps.internal;

public final class zza {
    /* renamed from: a */
    public static byte m65067a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }

    /* renamed from: b */
    public static Boolean m65068b(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
