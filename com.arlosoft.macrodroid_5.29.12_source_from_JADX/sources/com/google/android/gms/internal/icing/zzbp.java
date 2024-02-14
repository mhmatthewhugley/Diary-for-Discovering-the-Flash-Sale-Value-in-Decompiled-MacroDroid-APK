package com.google.android.gms.internal.icing;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzbp {
    /* renamed from: a */
    public static <T> T m58638a(@NullableDecl T t) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new zzbq(sb.toString());
    }
}
