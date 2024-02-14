package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqu extends zzarq {

    /* renamed from: A */
    private static final Object f25352A = new Object();

    /* renamed from: z */
    private static volatile Long f25353z;

    public zzaqu(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2) {
        super(zzaqe, "XFxH1z0dBuMDP7aWA+P/3WKwW9qr8sC2ASjEfciaKHfSLryjCNl4cmJgfsh2Tylb", "r0MNv9zqwvoUwASL1pBJjOA1OkDa8Kcs5NaA6VOkJEI=", zzamk, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        if (f25353z == null) {
            synchronized (f25352A) {
                if (f25353z == null) {
                    f25353z = (Long) this.f25388o.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f25387g) {
            this.f25387g.mo41706x0(f25353z.longValue());
        }
    }
}
