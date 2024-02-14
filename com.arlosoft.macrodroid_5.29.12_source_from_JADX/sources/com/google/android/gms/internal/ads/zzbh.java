package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbh {

    /* renamed from: a */
    private static final HashSet f26772a = new HashSet();

    /* renamed from: b */
    private static String f26773b = "media3.common";

    /* renamed from: a */
    public static synchronized String m43424a() {
        String str;
        synchronized (zzbh.class) {
            str = f26773b;
        }
        return str;
    }

    /* renamed from: b */
    public static synchronized void m43425b(String str) {
        synchronized (zzbh.class) {
            if (f26772a.add(str)) {
                String str2 = f26773b;
                f26773b = str2 + ", " + str;
            }
        }
    }
}
