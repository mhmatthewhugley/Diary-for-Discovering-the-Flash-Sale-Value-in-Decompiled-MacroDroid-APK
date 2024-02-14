package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqv extends zzarq {

    /* renamed from: z */
    private final long f25354z;

    public zzaqv(zzaqe zzaqe, String str, String str2, zzamk zzamk, long j, int i, int i2) {
        super(zzaqe, "zwwnNjW/9dn+p0q/2u+mmA6XQB8+gtknmtJMKP3tBmoncBehPCILsKxRnck9yFjA", "vpqgk7W2OO4+emKKnTSxckIsP1c64LGVSWcdsnDvr3w=", zzamk, i, 25);
        this.f25354z = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f25388o.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f25387g) {
            this.f25387g.mo41658D0(longValue);
            long j = this.f25354z;
            if (j != 0) {
                this.f25387g.mo41674P(longValue - j);
                this.f25387g.mo41675R(this.f25354z);
            }
        }
    }
}
