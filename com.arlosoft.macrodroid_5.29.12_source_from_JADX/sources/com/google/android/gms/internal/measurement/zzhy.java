package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzhy {

    /* renamed from: a */
    final String f41497a;

    /* renamed from: b */
    final Uri f41498b;

    /* renamed from: c */
    final String f41499c;

    /* renamed from: d */
    final String f41500d;

    /* renamed from: e */
    final boolean f41501e;

    /* renamed from: f */
    final boolean f41502f;

    /* renamed from: g */
    final boolean f41503g;

    /* renamed from: h */
    final boolean f41504h;

    /* renamed from: i */
    final zzif f41505i;

    public zzhy(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (zzif) null);
    }

    private zzhy(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, zzif zzif) {
        this.f41497a = null;
        this.f41498b = uri;
        this.f41499c = "";
        this.f41500d = "";
        this.f41501e = z;
        this.f41502f = false;
        this.f41503g = z3;
        this.f41504h = false;
        this.f41505i = null;
    }

    /* renamed from: a */
    public final zzhy mo51277a() {
        return new zzhy((String) null, this.f41498b, this.f41499c, this.f41500d, this.f41501e, false, true, false, (zzif) null);
    }

    /* renamed from: b */
    public final zzhy mo51278b() {
        if (this.f41499c.isEmpty()) {
            return new zzhy((String) null, this.f41498b, this.f41499c, this.f41500d, true, false, this.f41503g, false, (zzif) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final zzib mo51279c(String str, double d) {
        return new zzhw(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final zzib mo51280d(String str, long j) {
        return new zzhu(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final zzib mo51281e(String str, String str2) {
        return new zzhx(this, str, str2, true);
    }

    /* renamed from: f */
    public final zzib mo51282f(String str, boolean z) {
        return new zzhv(this, str, Boolean.valueOf(z), true);
    }
}
