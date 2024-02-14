package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcdw {

    /* renamed from: a */
    private final Clock f28272a;

    /* renamed from: b */
    private final zzcdu f28273b;

    zzcdw(Clock clock, zzcdu zzcdu) {
        this.f28272a = clock;
        this.f28273b = zzcdu;
    }

    /* renamed from: a */
    public static zzcdw m44993a(Context context) {
        return zzcev.m45054d(context).mo43419b();
    }

    /* renamed from: b */
    public final void mo43408b(int i, long j) {
        this.f28273b.mo43407b(i, j);
    }

    /* renamed from: c */
    public final void mo43409c() {
        this.f28273b.mo43406a();
    }

    /* renamed from: d */
    public final void mo43410d(zzez zzez) {
        this.f28273b.mo43407b(-1, this.f28272a.mo21950a());
    }

    /* renamed from: e */
    public final void mo43411e() {
        this.f28273b.mo43407b(-1, this.f28272a.mo21950a());
    }
}
