package com.google.android.gms.internal.p204firebaseauthapi;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaft */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaft implements PrivilegedExceptionAction {
    zzaft() {
    }

    /* renamed from: a */
    public static final Unsafe m56798a() throws Exception {
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
        return m56798a();
    }
}
