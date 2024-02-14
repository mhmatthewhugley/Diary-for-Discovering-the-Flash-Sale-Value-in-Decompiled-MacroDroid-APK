package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzckt extends zzb {

    /* renamed from: c */
    final zzciy f28785c;

    /* renamed from: d */
    final zzclb f28786d;

    /* renamed from: e */
    private final String f28787e;

    /* renamed from: f */
    private final String[] f28788f;

    zzckt(zzciy zzciy, zzclb zzclb, String str, String[] strArr) {
        this.f28785c = zzciy;
        this.f28786d = zzclb;
        this.f28787e = str;
        this.f28788f = strArr;
        zzt.m2886A().mo43884d(this);
    }

    /* renamed from: a */
    public final void mo20184a() {
        try {
            this.f28786d.mo43905t(this.f28787e, this.f28788f);
        } finally {
            zzs.f2304i.post(new zzcks(this));
        }
    }

    /* renamed from: b */
    public final zzfzp mo20314b() {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26908K1)).booleanValue() || !(this.f28786d instanceof zzclk)) {
            return super.mo20314b();
        }
        return zzchc.f28460e.mo46579F(new zzckr(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Boolean mo43881d() throws Exception {
        return Boolean.valueOf(this.f28786d.mo43906u(this.f28787e, this.f28788f, this));
    }

    /* renamed from: e */
    public final String mo43882e() {
        return this.f28787e;
    }
}
