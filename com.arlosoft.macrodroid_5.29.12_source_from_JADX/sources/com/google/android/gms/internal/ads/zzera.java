package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzera implements zzeve {

    /* renamed from: h */
    private static final Object f34750h = new Object();

    /* renamed from: a */
    private final String f34751a;

    /* renamed from: b */
    private final String f34752b;

    /* renamed from: c */
    private final zzdar f34753c;

    /* renamed from: d */
    private final zzffk f34754d;

    /* renamed from: e */
    private final zzfef f34755e;

    /* renamed from: f */
    private final zzg f34756f = zzt.m2904q().mo43494h();

    /* renamed from: g */
    private final zzdxl f34757g;

    public zzera(String str, String str2, zzdar zzdar, zzffk zzffk, zzfef zzfef, zzdxl zzdxl) {
        this.f34751a = str;
        this.f34752b = str2;
        this.f34753c = zzdar;
        this.f34754d = zzffk;
        this.f34755e = zzfef;
        this.f34757g = zzdxl;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo45440a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26881H4)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26871G4)).booleanValue()) {
                synchronized (f34750h) {
                    this.f34753c.mo44538b(this.f34755e.f35629d);
                    bundle2.putBundle("quality_signals", this.f34754d.mo45675a());
                }
            } else {
                this.f34753c.mo44538b(this.f34755e.f35629d);
                bundle2.putBundle("quality_signals", this.f34754d.mo45675a());
            }
        }
        bundle2.putString("seq_num", this.f34751a);
        if (!this.f34756f.mo20366e0()) {
            bundle2.putString("session_id", this.f34752b);
        }
    }

    public final int zza() {
        return 12;
    }

    public final zzfzp zzb() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26843D6)).booleanValue()) {
            this.f34757g.mo45036a().put("seq_num", this.f34751a);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26881H4)).booleanValue()) {
            this.f34753c.mo44538b(this.f34755e.f35629d);
            bundle.putAll(this.f34754d.mo45675a());
        }
        return zzfzg.m51414i(new zzeqz(this, bundle));
    }
}
