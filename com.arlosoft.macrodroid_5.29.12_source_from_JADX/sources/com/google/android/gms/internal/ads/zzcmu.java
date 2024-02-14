package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcmu implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ List f29006a;

    /* renamed from: b */
    final /* synthetic */ String f29007b;

    /* renamed from: c */
    final /* synthetic */ Uri f29008c;

    /* renamed from: d */
    final /* synthetic */ zzcmw f29009d;

    zzcmu(zzcmw zzcmw, List list, String str, Uri uri) {
        this.f29009d = zzcmw;
        this.f29006a = list;
        this.f29007b = str;
        this.f29008c = uri;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        zzcgp.m45229g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f29008c)));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        this.f29009d.m45884o((Map) obj, this.f29006a, this.f29007b);
    }
}
