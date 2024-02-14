package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfzc;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzx implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzbzr f2580a;

    /* renamed from: b */
    final /* synthetic */ boolean f2581b;

    /* renamed from: c */
    final /* synthetic */ zzaa f2582c;

    zzx(zzaa zzaa, zzbzr zzbzr, boolean z) {
        this.f2582c = zzaa;
        this.f2580a = zzbzr;
        this.f2581b = z;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        try {
            zzbzr zzbzr = this.f2580a;
            String message = th.getMessage();
            zzbzr.mo43233z("Internal error: " + message);
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f2580a.mo43232y2(arrayList);
            if (this.f2582c.f2480F || this.f2581b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.f2582c.mo20658Yb(uri)) {
                        zzaa zzaa = this.f2582c;
                        this.f2582c.f2479E.mo45862c(zzaa.m3007gc(uri, zzaa.f2489O, "1").toString(), (zzfju) null);
                    } else {
                        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26823B6)).booleanValue()) {
                            this.f2582c.f2479E.mo45862c(uri.toString(), (zzfju) null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }
}
