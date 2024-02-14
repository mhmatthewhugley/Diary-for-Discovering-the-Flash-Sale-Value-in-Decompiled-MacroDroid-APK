package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcwd {

    /* renamed from: a */
    private final zzfir f31730a;

    /* renamed from: b */
    private final zzdxq f31731b;

    /* renamed from: c */
    private final zzfdw f31732c;

    public zzcwd(zzdxq zzdxq, zzfdw zzfdw, zzfir zzfir) {
        this.f31730a = zzfir;
        this.f31731b = zzdxq;
        this.f31732c = zzfdw;
    }

    /* renamed from: b */
    private static String m46909b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    /* renamed from: a */
    public final void mo44426a(long j, int i) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27249s7)).booleanValue()) {
            zzfir zzfir = this.f31730a;
            zzfiq b = zzfiq.m50227b("ad_closed");
            b.mo45778g(this.f31732c.f35590b.f35587b);
            b.mo45774a("show_time", String.valueOf(j));
            b.mo45774a("ad_format", "app_open_ad");
            b.mo45774a("acr", m46909b(i));
            zzfir.mo45782a(b);
            return;
        }
        zzdxp a = this.f31731b.mo45050a();
        a.mo45044e(this.f31732c.f35590b.f35587b);
        a.mo45041b("action", "ad_closed");
        a.mo45041b("show_time", String.valueOf(j));
        a.mo45041b("ad_format", "app_open_ad");
        a.mo45041b("acr", m46909b(i));
        a.mo45046g();
    }
}
