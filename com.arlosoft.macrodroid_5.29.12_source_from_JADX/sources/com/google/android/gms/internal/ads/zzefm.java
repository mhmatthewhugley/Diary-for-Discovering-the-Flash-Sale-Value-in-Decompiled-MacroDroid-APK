package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzefm implements zzdeo, zzddd {

    /* renamed from: d */
    private static final Object f33891d = new Object();

    /* renamed from: f */
    private static int f33892f;

    /* renamed from: a */
    private final zzg f33893a;

    /* renamed from: c */
    private final zzefw f33894c;

    public zzefm(zzefw zzefw, zzg zzg) {
        this.f33894c = zzefw;
        this.f33893a = zzg;
    }

    /* renamed from: a */
    private final void m48747a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27187m5)).booleanValue() && !this.f33893a.mo20366e0()) {
            Object obj = f33891d;
            synchronized (obj) {
                i = f33892f;
                intValue = ((Integer) zzay.m1924c().mo42663b(zzbjc.f27197n5)).intValue();
            }
            if (i < intValue) {
                this.f33894c.mo45269e(z);
                synchronized (obj) {
                    f33892f++;
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo44393n() {
        m48747a(true);
    }

    /* renamed from: r */
    public final void mo44382r(zze zze) {
        m48747a(false);
    }
}
