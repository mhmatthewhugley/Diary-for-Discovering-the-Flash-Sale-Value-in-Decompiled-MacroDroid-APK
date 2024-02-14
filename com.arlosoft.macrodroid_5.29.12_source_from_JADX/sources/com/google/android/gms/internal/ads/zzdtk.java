package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdtk implements Callable {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final zzfkm f33050A;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zza f33051a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzcnb f33052c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f33053d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzdxq f33054f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzfir f33055g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final zzego f33056o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Executor f33057p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final zzape f33058s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final zzcgv f33059z;

    public zzdtk(Context context, Executor executor, zzape zzape, zzcgv zzcgv, zza zza, zzcnb zzcnb, zzego zzego, zzfkm zzfkm, zzdxq zzdxq, zzfir zzfir) {
        this.f33053d = context;
        this.f33057p = executor;
        this.f33058s = zzape;
        this.f33059z = zzcgv;
        this.f33051a = zza;
        this.f33052c = zzcnb;
        this.f33056o = zzego;
        this.f33050A = zzfkm;
        this.f33054f = zzdxq;
        this.f33055g = zzfir;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdtn zzdtn = new zzdtn(this);
        zzdtn.mo44979h();
        return zzdtn;
    }
}
