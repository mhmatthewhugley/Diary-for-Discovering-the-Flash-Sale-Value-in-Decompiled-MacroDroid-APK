package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzarh extends zzarq {

    /* renamed from: z */
    private final boolean f25369z;

    public zzarh(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2) {
        super(zzaqe, "RjfRn/7K/Mx2/M8Fl6a7u1D5niklht4X0VG1cOixOa4SuaPG6Qd7la4v6f0IM/MO", "cZ2qwY2ZIJRch325gepGJtH7dQ9IcqmfWvaHdfiFi6Y=", zzamk, i, 61);
        this.f25369z = zzaqe.mo41820s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f25388o.invoke((Object) null, new Object[]{this.f25384c.mo41806b(), Boolean.valueOf(this.f25369z)})).longValue();
        synchronized (this.f25387g) {
            this.f25387g.mo41705x(longValue);
        }
    }
}
