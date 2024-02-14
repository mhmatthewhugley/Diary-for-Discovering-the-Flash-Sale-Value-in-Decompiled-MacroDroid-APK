package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzbeg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzbej f26690a;

    /* renamed from: c */
    public final /* synthetic */ zzbea f26691c;

    /* renamed from: d */
    public final /* synthetic */ zzbeb f26692d;

    /* renamed from: f */
    public final /* synthetic */ zzchh f26693f;

    public /* synthetic */ zzbeg(zzbej zzbej, zzbea zzbea, zzbeb zzbeb, zzchh zzchh) {
        this.f26690a = zzbej;
        this.f26691c = zzbea;
        this.f26692d = zzbeb;
        this.f26693f = zzchh;
    }

    public final void run() {
        zzbdy zzbdy;
        zzbej zzbej = this.f26690a;
        zzbea zzbea = this.f26691c;
        zzbeb zzbeb = this.f26692d;
        zzchh zzchh = this.f26693f;
        try {
            zzbed p0 = zzbea.mo42532p0();
            if (zzbea.mo42531o0()) {
                zzbdy = p0.mo42538sb(zzbeb);
            } else {
                zzbdy = p0.mo42537ia(zzbeb);
            }
            if (!zzbdy.mo42523p2()) {
                zzchh.mo43575d(new RuntimeException("No entry contents."));
                zzbel.m43230e(zzbej.f26699d);
                return;
            }
            zzbei zzbei = new zzbei(zzbej, zzbdy.mo42521n2(), 1);
            int read = zzbei.read();
            if (read != -1) {
                zzbei.unread(read);
                zzchh.mo43574c(zzben.m43234b(zzbei, zzbdy.mo42522o2(), zzbdy.mo42525r2(), zzbdy.mo42519l2(), zzbdy.mo42524q2()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            zzcgp.m45227e("Unable to obtain a cache service instance.", e);
            zzchh.mo43575d(e);
            zzbel.m43230e(zzbej.f26699d);
        }
    }
}
