package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzemb implements zzehc {

    /* renamed from: a */
    private final zzehe f34436a;

    /* renamed from: b */
    private final zzehj f34437b;

    /* renamed from: c */
    private final zzfih f34438c;

    /* renamed from: d */
    private final zzfzq f34439d;

    public zzemb(zzfih zzfih, zzfzq zzfzq, zzehe zzehe, zzehj zzehj) {
        this.f34438c = zzfih;
        this.f34439d = zzfzq;
        this.f34437b = zzehj;
        this.f34436a = zzehe;
    }

    @VisibleForTesting
    /* renamed from: e */
    static final String m49071e(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        return !zzfdk.f35555u.isEmpty();
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        zzehf zzehf;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator it = zzfdk.f35555u.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzehf = null;
                break;
            }
            try {
                zzehf = this.f34436a.mo45300a((String) it.next(), zzfdk.f35557w);
                break;
            } catch (zzfek unused) {
            }
        }
        if (zzehf == null) {
            return zzfzg.m51413h(new zzekd("Unable to instantiate mediation adapter class."));
        }
        zzchh zzchh = new zzchh();
        zzehf.f34017c.mo44598ia(new zzema(this, zzehf, zzchh));
        if (zzfdk.f35506N) {
            Bundle bundle = zzfdw.f35589a.f35583a.f35629d.f1985D;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfih zzfih = this.f34438c;
        return zzfhr.m50182d(new zzely(this, zzfdw, zzfdk, zzehf), this.f34439d, zzfib.ADAPTER_LOAD_AD_SYN, zzfih).mo45743b(zzfib.ADAPTER_LOAD_AD_ACK).mo45745d(zzchh).mo45743b(zzfib.ADAPTER_WRAP_ADAPTER).mo45746e(new zzelz(this, zzfdw, zzfdk, zzehf)).mo45742a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo45369c(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf, Void voidR) throws Exception {
        return this.f34437b.mo45309a(zzfdw, zzfdk, zzehf);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo45370d(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws Exception {
        this.f34437b.mo45310b(zzfdw, zzfdk, zzehf);
    }
}
