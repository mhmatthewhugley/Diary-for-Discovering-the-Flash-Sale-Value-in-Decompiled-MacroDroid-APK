package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzto implements zzsu {

    /* renamed from: a */
    private final zzew f38545a;

    /* renamed from: b */
    private int f38546b = 1048576;

    /* renamed from: c */
    private final zztn f38547c;

    /* renamed from: d */
    private final zzwm f38548d;

    /* renamed from: e */
    private final zzph f38549e;

    public zzto(zzew zzew, zztn zztn, byte[] bArr) {
        zzph zzph = new zzph();
        zzwm zzwm = new zzwm(-1);
        this.f38545a = zzew;
        this.f38547c = zztn;
        this.f38549e = zzph;
        this.f38548d = zzwm;
    }

    /* renamed from: a */
    public final zzto mo48215a(int i) {
        this.f38546b = i;
        return this;
    }

    /* renamed from: b */
    public final zztq mo48216b(zzbg zzbg) {
        Objects.requireNonNull(zzbg.f26759b);
        return new zztq(zzbg, this.f38545a, this.f38547c, zzpq.f38192a, this.f38548d, this.f38546b, (zztp) null, (byte[]) null);
    }
}
