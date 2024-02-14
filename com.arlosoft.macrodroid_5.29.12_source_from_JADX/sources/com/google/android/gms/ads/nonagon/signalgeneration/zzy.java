package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfzc;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzy implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzbzr f2583a;

    /* renamed from: b */
    final /* synthetic */ boolean f2584b;

    /* renamed from: c */
    final /* synthetic */ zzaa f2585c;

    zzy(zzaa zzaa, zzbzr zzbzr, boolean z) {
        this.f2585c = zzaa;
        this.f2583a = zzbzr;
        this.f2584b = z;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        try {
            zzbzr zzbzr = this.f2583a;
            String message = th.getMessage();
            zzbzr.mo43233z("Internal error: " + message);
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        List<Uri> list = (List) obj;
        try {
            zzaa.m2994Pb(this.f2585c, list);
            this.f2583a.mo43232y2(list);
            if (this.f2585c.f2481G || this.f2584b) {
                for (Uri uri : list) {
                    if (this.f2585c.mo20657Xb(uri)) {
                        zzaa zzaa = this.f2585c;
                        this.f2585c.f2479E.mo45862c(zzaa.m3007gc(uri, zzaa.f2489O, "1").toString(), (zzfju) null);
                    } else {
                        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26823B6)).booleanValue()) {
                            this.f2585c.f2479E.mo45862c(uri.toString(), (zzfju) null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
