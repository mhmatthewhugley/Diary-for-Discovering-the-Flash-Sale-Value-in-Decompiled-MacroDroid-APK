package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzevz implements zzeve {

    /* renamed from: a */
    private final Executor f35061a;

    /* renamed from: b */
    private final String f35062b;
    @Nullable

    /* renamed from: c */
    private final PackageInfo f35063c;

    /* renamed from: d */
    private final zzcfp f35064d;

    public zzevz(zzcfp zzcfp, Executor executor, String str, @Nullable PackageInfo packageInfo, int i, byte[] bArr) {
        this.f35064d = zzcfp;
        this.f35061a = executor;
        this.f35062b = str;
        this.f35063c = packageInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzfzp mo45490a(Throwable th) throws Exception {
        return zzfzg.m51414i(new zzewa(this.f35062b));
    }

    public final int zza() {
        return 41;
    }

    public final zzfzp zzb() {
        return zzfzg.m51412g(zzfzg.m51418m(zzfzg.m51414i(this.f35062b), zzevx.f35059a, this.f35061a), Throwable.class, new zzevy(this), this.f35061a);
    }
}
