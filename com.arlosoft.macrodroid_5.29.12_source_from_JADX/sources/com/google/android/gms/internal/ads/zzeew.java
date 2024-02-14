package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeew implements zzdjt {
    @GuardedBy("this")

    /* renamed from: a */
    private boolean f33859a = false;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f33860c = false;

    /* renamed from: d */
    private final String f33861d;

    /* renamed from: f */
    private final zzfir f33862f;

    /* renamed from: g */
    private final zzg f33863g;

    public zzeew(String str, zzfir zzfir) {
        this.f33861d = str;
        this.f33862f = zzfir;
        this.f33863g = zzt.m2904q().mo43494h();
    }

    /* renamed from: a */
    private final zzfiq m48692a(String str) {
        String str2;
        if (this.f33863g.mo20366e0()) {
            str2 = "";
        } else {
            str2 = this.f33861d;
        }
        zzfiq b = zzfiq.m50227b(str);
        b.mo45774a("tms", Long.toString(zzt.m2889b().mo21952c(), 10));
        b.mo45774a("tid", str2);
        return b;
    }

    /* renamed from: b */
    public final synchronized void mo44671b() {
        if (!this.f33860c) {
            this.f33862f.mo45782a(m48692a("init_finished"));
            this.f33860c = true;
        }
    }

    /* renamed from: c */
    public final synchronized void mo44672c() {
        if (!this.f33859a) {
            this.f33862f.mo45782a(m48692a("init_started"));
            this.f33859a = true;
        }
    }

    /* renamed from: f0 */
    public final void mo44673f0(String str) {
        zzfir zzfir = this.f33862f;
        zzfiq a = m48692a("adapter_init_started");
        a.mo45774a("ancn", str);
        zzfir.mo45782a(a);
    }

    /* renamed from: h0 */
    public final void mo44674h0(String str) {
        zzfir zzfir = this.f33862f;
        zzfiq a = m48692a("adapter_init_finished");
        a.mo45774a("ancn", str);
        zzfir.mo45782a(a);
    }

    /* renamed from: o */
    public final void mo44675o(String str) {
        zzfir zzfir = this.f33862f;
        zzfiq a = m48692a("aaia");
        a.mo45774a("aair", "MalformedJson");
        zzfir.mo45782a(a);
    }

    /* renamed from: q */
    public final void mo44676q(String str, String str2) {
        zzfir zzfir = this.f33862f;
        zzfiq a = m48692a("adapter_init_finished");
        a.mo45774a("ancn", str);
        a.mo45774a("rqe", str2);
        zzfir.mo45782a(a);
    }
}
