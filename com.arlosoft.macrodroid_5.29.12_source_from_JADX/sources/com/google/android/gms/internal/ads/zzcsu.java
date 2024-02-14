package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzcsu implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcsw f31482a;

    /* renamed from: c */
    public final /* synthetic */ Runnable f31483c;

    public /* synthetic */ zzcsu(zzcsw zzcsw, Runnable runnable) {
        this.f31482a = zzcsw;
        this.f31483c = runnable;
    }

    public final void run() {
        zzchc.f28460e.execute(new zzcsv(this.f31482a, this.f31483c));
    }
}
