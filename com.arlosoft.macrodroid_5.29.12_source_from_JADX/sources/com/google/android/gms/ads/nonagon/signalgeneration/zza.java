package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdxl;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zza implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzc f2466a;

    /* renamed from: c */
    public final /* synthetic */ zzdxl f2467c;

    /* renamed from: d */
    public final /* synthetic */ ArrayDeque f2468d;

    /* renamed from: f */
    public final /* synthetic */ ArrayDeque f2469f;

    public /* synthetic */ zza(zzc zzc, zzdxl zzdxl, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.f2466a = zzc;
        this.f2467c = zzdxl;
        this.f2468d = arrayDeque;
        this.f2469f = arrayDeque2;
    }

    public final void run() {
        this.f2466a.mo20683e(this.f2467c, this.f2468d, this.f2469f);
    }
}
