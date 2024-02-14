package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzela implements zzehj {

    /* renamed from: a */
    private final Context f34345a;

    /* renamed from: b */
    private final zzduh f34346b;

    public zzela(Context context, zzduh zzduh) {
        this.f34345a = context;
        this.f34346b = zzduh;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45309a(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek, zzekr {
        zzejg zzejg = new zzejg(zzfdk, (zzbxd) zzehf.f34016b, true);
        zzdud d = this.f34346b.mo44359d(new zzczt(zzfdw, zzfdk, zzehf.f34015a), new zzdue(zzejg));
        zzejg.mo45335b(d.mo44255b());
        ((zzeix) zzehf.f34017c).mo45330Kb(d.mo44354n());
        return d.mo44351k();
    }

    /* renamed from: b */
    public final void mo45310b(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek {
        try {
            ((zzbxd) zzehf.f34016b).mo43176a0(zzfdk.f35520a0);
            if (zzfdw.f35589a.f35583a.f35640o.f35582a == 3) {
                ((zzbxd) zzehf.f34016b).mo43171D5(zzfdk.f35514V, zzfdk.f35557w.toString(), zzfdw.f35589a.f35583a.f35629d, ObjectWrapper.m5051g8(this.f34345a), new zzekz(this, zzehf, (zzeky) null), (zzbvq) zzehf.f34017c);
            } else {
                ((zzbxd) zzehf.f34016b).mo43174V4(zzfdk.f35514V, zzfdk.f35557w.toString(), zzfdw.f35589a.f35583a.f35629d, ObjectWrapper.m5051g8(this.f34345a), new zzekz(this, zzehf, (zzeky) null), (zzbvq) zzehf.f34017c);
            }
        } catch (RemoteException e) {
            zze.m2646l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
