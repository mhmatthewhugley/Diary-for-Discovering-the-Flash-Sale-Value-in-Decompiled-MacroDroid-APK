package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeup implements zzeve {

    /* renamed from: a */
    private final zzceu f34962a;

    /* renamed from: b */
    private final zzfzq f34963b;

    /* renamed from: c */
    private final Context f34964c;

    public zzeup(zzceu zzceu, zzfzq zzfzq, Context context) {
        this.f34962a = zzceu;
        this.f34963b = zzfzq;
        this.f34964c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzeuq mo45474a() throws Exception {
        String str;
        String str2;
        String str3;
        if (!this.f34962a.mo43449z(this.f34964c)) {
            return new zzeuq((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String j = this.f34962a.mo43433j(this.f34964c);
        String str4 = j == null ? "" : j;
        String h = this.f34962a.mo43431h(this.f34964c);
        if (h == null) {
            str = "";
        } else {
            str = h;
        }
        String f = this.f34962a.mo43429f(this.f34964c);
        if (f == null) {
            str2 = "";
        } else {
            str2 = f;
        }
        String g = this.f34962a.mo43430g(this.f34964c);
        if (g == null) {
            str3 = "";
        } else {
            str3 = g;
        }
        return new zzeuq(str4, str, str2, str3, "TIME_OUT".equals(str) ? (Long) zzay.m1924c().mo42663b(zzbjc.f27092d0) : null);
    }

    public final int zza() {
        return 34;
    }

    public final zzfzp zzb() {
        return this.f34963b.mo46579F(new zzeuo(this));
    }
}
