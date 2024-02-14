package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzfj implements PrivilegedExceptionAction<Unsafe> {
    zzfj() {
    }

    /* renamed from: a */
    public static final Unsafe m59033a() throws Exception {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() throws Exception {
        return m59033a();
    }
}
