package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeuq implements zzevd {

    /* renamed from: a */
    public final String f34965a;

    /* renamed from: b */
    public final String f34966b;

    /* renamed from: c */
    public final String f34967c;

    /* renamed from: d */
    public final String f34968d;

    /* renamed from: e */
    public final Long f34969e;

    public zzeuq(String str, String str2, String str3, String str4, Long l) {
        this.f34965a = str;
        this.f34966b = str2;
        this.f34967c = str3;
        this.f34968d = str4;
        this.f34969e = l;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfeq.m50022c(bundle, "gmp_app_id", this.f34965a);
        zzfeq.m50022c(bundle, "fbs_aiid", this.f34966b);
        zzfeq.m50022c(bundle, "fbs_aeid", this.f34967c);
        zzfeq.m50022c(bundle, "apm_id_origin", this.f34968d);
        Long l = this.f34969e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
