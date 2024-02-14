package com.google.android.gms.internal.mlkit_common;

import java.util.Objects;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzaf {
    /* renamed from: a */
    static void m61142a(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
