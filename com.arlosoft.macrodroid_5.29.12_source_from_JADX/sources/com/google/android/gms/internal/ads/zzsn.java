package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzsn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzsr f38428a;

    /* renamed from: c */
    public final /* synthetic */ zzss f38429c;

    /* renamed from: d */
    public final /* synthetic */ zzrz f38430d;

    /* renamed from: f */
    public final /* synthetic */ zzse f38431f;

    /* renamed from: g */
    public final /* synthetic */ IOException f38432g;

    /* renamed from: o */
    public final /* synthetic */ boolean f38433o;

    public /* synthetic */ zzsn(zzsr zzsr, zzss zzss, zzrz zzrz, zzse zzse, IOException iOException, boolean z) {
        this.f38428a = zzsr;
        this.f38429c = zzss;
        this.f38430d = zzrz;
        this.f38431f = zzse;
        this.f38432g = iOException;
        this.f38433o = z;
    }

    public final void run() {
        zzsr zzsr = this.f38428a;
        this.f38429c.mo47731o(zzsr.f38444a, zzsr.f38445b, this.f38430d, this.f38431f, this.f38432g, this.f38433o);
    }
}
