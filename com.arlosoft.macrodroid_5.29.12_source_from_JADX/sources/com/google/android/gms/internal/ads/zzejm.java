package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzejm implements zzehj {

    /* renamed from: a */
    private final Context f34200a;

    /* renamed from: b */
    private final zzdmh f34201b;

    public zzejm(Context context, zzdmh zzdmh) {
        this.f34200a = context;
        this.f34201b = zzdmh;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45309a(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek, zzekr {
        zzejg zzejg = new zzejg(zzfdk, (zzbxd) zzehf.f34016b, false);
        zzdlh c = this.f34201b.mo44335c(new zzczt(zzfdw, zzfdk, zzehf.f34015a), new zzdlk(zzejg, (zzcmp) null));
        zzejg.mo45335b(c.mo44255b());
        ((zzeix) zzehf.f34017c).mo45330Kb(c.mo44278f());
        return c.mo44326i();
    }

    /* renamed from: b */
    public final void mo45310b(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek {
        try {
            ((zzbxd) zzehf.f34016b).mo43176a0(zzfdk.f35520a0);
            ((zzbxd) zzehf.f34016b).mo43182t2(zzfdk.f35514V, zzfdk.f35557w.toString(), zzfdw.f35589a.f35583a.f35629d, ObjectWrapper.m5051g8(this.f34200a), new zzejl(this, zzehf, (zzejk) null), (zzbvq) zzehf.f34017c);
        } catch (RemoteException e) {
            throw new zzfek(e);
        }
    }
}
