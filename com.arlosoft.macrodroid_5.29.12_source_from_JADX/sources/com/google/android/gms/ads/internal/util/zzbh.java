package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzakh;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzcgp;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbh implements zzakh {

    /* renamed from: a */
    final /* synthetic */ String f2215a;

    /* renamed from: b */
    final /* synthetic */ zzbl f2216b;

    zzbh(zzbo zzbo, String str, zzbl zzbl) {
        this.f2215a = str;
        this.f2216b = zzbl;
    }

    /* renamed from: a */
    public final void mo20324a(zzakm zzakm) {
        String str = this.f2215a;
        String exc = zzakm.toString();
        zzcgp.m45229g("Failed to load URL: " + str + IOUtils.LINE_SEPARATOR_UNIX + exc);
        this.f2216b.mo20329a((Object) null);
    }
}
