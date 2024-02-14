package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzh implements zzj {

    /* renamed from: a */
    final /* synthetic */ Set f51775a;

    /* renamed from: b */
    final /* synthetic */ zzs f51776b;

    /* renamed from: c */
    final /* synthetic */ zzm f51777c;

    zzh(zzm zzm, Set set, zzs zzs) {
        this.f51777c = zzm;
        this.f51775a = set;
        this.f51776b = zzs;
    }

    /* renamed from: a */
    public final void mo59955a(ZipFile zipFile, Set set) throws IOException {
        this.f51775a.addAll(zzm.m71099a(this.f51777c, set, this.f51776b, zipFile));
    }
}
