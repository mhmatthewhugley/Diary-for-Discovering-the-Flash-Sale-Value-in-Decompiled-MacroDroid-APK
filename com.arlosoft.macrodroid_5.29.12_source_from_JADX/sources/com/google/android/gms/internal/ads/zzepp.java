package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepp implements zzeve {

    /* renamed from: a */
    private final zzfzq f34661a;

    /* renamed from: b */
    private final zzfef f34662b;

    /* renamed from: c */
    private final zzfer f34663c;

    zzepp(zzfzq zzfzq, zzfef zzfef, zzfer zzfer) {
        this.f34661a = zzfzq;
        this.f34662b = zzfef;
        this.f34663c = zzfer;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzepq mo45428a() throws Exception {
        String str = null;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27198n6)).booleanValue() && "requester_type_2".equals(zzf.m3061b(this.f34662b.f35629d))) {
            str = zzfer.m50027a();
        }
        return new zzepq(str);
    }

    public final int zza() {
        return 5;
    }

    public final zzfzp zzb() {
        return this.f34661a.mo46579F(new zzepo(this));
    }
}
