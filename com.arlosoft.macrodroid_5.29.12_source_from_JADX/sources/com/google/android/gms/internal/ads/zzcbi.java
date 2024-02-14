package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcbi implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f28190a;

    /* renamed from: c */
    final /* synthetic */ zzcbk f28191c;

    zzcbi(zzcbk zzcbk, Context context) {
        this.f28191c = zzcbk;
        this.f28190a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcbh zzcbh;
        zzcbj zzcbj = (zzcbj) this.f28191c.f28194a.get(this.f28190a);
        if (zzcbj == null || zzcbj.f28192a + ((Long) zzbki.f27394a.mo42728e()).longValue() < zzt.m2889b().mo21950a()) {
            zzcbh = new zzcbg(this.f28190a).mo43286a();
        } else {
            zzcbh = new zzcbg(this.f28190a, zzcbj.f28193b).mo43286a();
        }
        zzcbk zzcbk = this.f28191c;
        zzcbk.f28194a.put(this.f28190a, new zzcbj(zzcbk, zzcbh));
        return zzcbh;
    }
}
