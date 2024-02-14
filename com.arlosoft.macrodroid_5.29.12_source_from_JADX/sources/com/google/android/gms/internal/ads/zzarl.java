package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzarl extends zzarq {

    /* renamed from: A */
    private static final Object f25373A = new Object();

    /* renamed from: z */
    private static volatile Long f25374z;

    public zzarl(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2) {
        super(zzaqe, "5BhEc19mhLCb3gixLpO/usqpdcrz8iDHUvKRNr8tUAX9rUzF0wog6vEOJrftvcpW", "yZHUQ89G8fTgEsMNs0hBrXwZIrb4VL1iE12C/t/Y3UE=", zzamk, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        if (f25374z == null) {
            synchronized (f25373A) {
                if (f25374z == null) {
                    f25374z = (Long) this.f25388o.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f25387g) {
            this.f25387g.mo41676S(f25374z.longValue());
        }
    }
}
