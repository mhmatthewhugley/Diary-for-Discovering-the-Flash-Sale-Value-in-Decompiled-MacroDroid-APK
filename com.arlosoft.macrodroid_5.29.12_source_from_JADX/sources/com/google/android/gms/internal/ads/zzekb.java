package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzekb implements zzehj {

    /* renamed from: a */
    private final Context f34241a;

    /* renamed from: b */
    private final zzdnd f34242b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzbvz f34243c;

    /* renamed from: d */
    private final zzcgv f34244d;

    public zzekb(Context context, zzdnd zzdnd, zzcgv zzcgv) {
        this.f34241a = context;
        this.f34242b = zzdnd;
        this.f34244d = zzcgv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45309a(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek, zzekr {
        if (zzfdw.f35589a.f35583a.f35632g.contains(Integer.toString(6))) {
            zzdoq a0 = zzdoq.m47718a0(this.f34243c);
            if (zzfdw.f35589a.f35583a.f35632g.contains(Integer.toString(a0.mo44798K()))) {
                zzdos d = this.f34242b.mo44249d(new zzczt(zzfdw, zzfdk, zzehf.f34015a), new zzdpc(a0), new zzdqq((zzbvw) null, (zzbvv) null, this.f34243c, (byte[]) null));
                ((zzeix) zzehf.f34017c).mo45330Kb(d.mo44278f());
                return d.mo44308h();
            }
            throw new zzekr(1, "No corresponding native ad listener");
        }
        throw new zzekr(2, "Unified must be used for RTB.");
    }

    /* renamed from: b */
    public final void mo45310b(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek {
        try {
            ((zzbxd) zzehf.f34016b).mo43176a0(zzfdk.f35520a0);
            if (this.f34244d.f28448d < ((Integer) zzay.m1924c().mo42663b(zzbjc.f27273v1)).intValue()) {
                ((zzbxd) zzehf.f34016b).mo43170C7(zzfdk.f35514V, zzfdk.f35557w.toString(), zzfdw.f35589a.f35583a.f35629d, ObjectWrapper.m5051g8(this.f34241a), new zzeka(this, zzehf, (zzejz) null), (zzbvq) zzehf.f34017c);
            } else {
                ((zzbxd) zzehf.f34016b).mo43183v4(zzfdk.f35514V, zzfdk.f35557w.toString(), zzfdw.f35589a.f35583a.f35629d, ObjectWrapper.m5051g8(this.f34241a), new zzeka(this, zzehf, (zzejz) null), (zzbvq) zzehf.f34017c, zzfdw.f35589a.f35583a.f35634i);
            }
        } catch (RemoteException e) {
            throw new zzfek(e);
        }
    }
}
