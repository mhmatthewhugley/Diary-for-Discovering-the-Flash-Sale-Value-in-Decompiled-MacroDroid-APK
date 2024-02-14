package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzari extends zzarq {

    /* renamed from: z */
    private final StackTraceElement[] f25370z;

    public zzari(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzaqe, "d2tnKFzXPwiZyQGi+81r0jKuUmc/wF2bs8mf3rZLUgisIeswnimQDm/skPYjpEo4", "e/DvqiTz4SkFtBEBn/3V8Pr2h2slHO4xuLOBAItCJ4w=", zzamk, i, 45);
        this.f25370z = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f25370z;
        if (obj != null) {
            int i = 1;
            zzapw zzapw = new zzapw((String) this.f25388o.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f25387g) {
                this.f25387g.mo41707y(zzapw.f25272a.longValue());
                if (zzapw.f25273b.booleanValue()) {
                    zzamk zzamk = this.f25387g;
                    if (true != zzapw.f25274c.booleanValue()) {
                        i = 2;
                    }
                    zzamk.mo41684b0(i);
                } else {
                    this.f25387g.mo41684b0(3);
                }
            }
        }
    }
}
