package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcfq {

    /* renamed from: a */
    private long f28353a = -1;

    /* renamed from: b */
    private long f28354b = -1;

    /* renamed from: c */
    final /* synthetic */ zzcfr f28355c;

    public zzcfq(zzcfr zzcfr) {
        this.f28355c = zzcfr;
    }

    /* renamed from: a */
    public final long mo43462a() {
        return this.f28354b;
    }

    /* renamed from: b */
    public final Bundle mo43463b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f28353a);
        bundle.putLong("tclose", this.f28354b);
        return bundle;
    }

    /* renamed from: c */
    public final void mo43464c() {
        this.f28354b = this.f28355c.f28356a.mo21952c();
    }

    /* renamed from: d */
    public final void mo43465d() {
        this.f28353a = this.f28355c.f28356a.mo21952c();
    }
}
