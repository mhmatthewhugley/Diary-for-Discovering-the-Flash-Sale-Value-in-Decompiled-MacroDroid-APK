package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzg implements zzj {

    /* renamed from: a */
    final /* synthetic */ zzs f51771a;

    /* renamed from: b */
    final /* synthetic */ Set f51772b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f51773c;

    /* renamed from: d */
    final /* synthetic */ zzm f51774d;

    zzg(zzm zzm, zzs zzs, Set set, AtomicBoolean atomicBoolean) {
        this.f51774d = zzm;
        this.f51771a = zzs;
        this.f51772b = set;
        this.f51773c = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo59955a(ZipFile zipFile, Set set) throws IOException {
        this.f51774d.m71102f(this.f51771a, set, new zzf(this));
    }
}
