package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeim implements zzehj {

    /* renamed from: a */
    private final Context f34109a;

    /* renamed from: b */
    private final zzcxz f34110b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f34111c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzbvt f34112d;

    public zzeim(Context context, zzcxz zzcxz) {
        this.f34109a = context;
        this.f34110b = zzcxz;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45309a(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek, zzekr {
        View view;
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26903J6)).booleanValue() || !zzfdk.f35536i0) {
            view = this.f34111c;
        } else {
            try {
                view = (View) ObjectWrapper.m5050A1(this.f34112d.mo43089b());
                boolean c = this.f34112d.mo43090c();
                if (view == null) {
                    throw new zzfek(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (c) {
                    try {
                        view = (View) zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzeii(this, view, zzfdk), zzchc.f28460e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfek(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfek(e2);
            }
        }
        zzcxd a = this.f34110b.mo44291a(new zzczt(zzfdw, zzfdk, zzehf.f34015a), new zzcxj(view, (zzcmp) null, new zzeij(zzehf), (zzfdl) zzfdk.f35556v.get(0)));
        a.mo44281i().mo44684M0(view);
        ((zzeix) zzehf.f34017c).mo45330Kb(a.mo44278f());
        return a.mo44280h();
    }

    /* renamed from: b */
    public final void mo45310b(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek {
        try {
            ((zzbxd) zzehf.f34016b).mo43176a0(zzfdk.f35520a0);
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26903J6)).booleanValue() || !zzfdk.f35536i0) {
                ((zzbxd) zzehf.f34016b).mo43175X1(zzfdk.f35514V, zzfdk.f35557w.toString(), zzfdw.f35589a.f35583a.f35629d, ObjectWrapper.m5051g8(this.f34109a), new zzeil(this, zzehf, (zzeik) null), (zzbvq) zzehf.f34017c, zzfdw.f35589a.f35583a.f35630e);
            } else {
                ((zzbxd) zzehf.f34016b).mo43172M2(zzfdk.f35514V, zzfdk.f35557w.toString(), zzfdw.f35589a.f35583a.f35629d, ObjectWrapper.m5051g8(this.f34109a), new zzeil(this, zzehf, (zzeik) null), (zzbvq) zzehf.f34017c, zzfdw.f35589a.f35583a.f35630e);
            }
        } catch (RemoteException e) {
            throw new zzfek(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45322c(View view, zzfdk zzfdk, Object obj) throws Exception {
        return zzfzg.m51414i(zzcyq.m47038a(this.f34109a, view, zzfdk));
    }
}
