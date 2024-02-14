package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzecf;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzp;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzak implements zzfyn {

    /* renamed from: a */
    private final Executor f2521a;

    /* renamed from: b */
    private final zzecf f2522b;

    public zzak(Executor executor, zzecf zzecf) {
        this.f2521a = executor;
        this.f2522b = zzecf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzfzp mo20417a(Object obj) throws Exception {
        zzcbc zzcbc = (zzcbc) obj;
        return zzfzg.m51419n(this.f2522b.mo45165b(zzcbc), new zzaj(zzcbc), this.f2521a);
    }
}
