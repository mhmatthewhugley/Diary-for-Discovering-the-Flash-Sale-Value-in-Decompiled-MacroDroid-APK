package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdzb implements zzdyp {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f33421a;

    /* renamed from: b */
    private final zzeon f33422b;

    zzdzb(long j, Context context, zzdyu zzdyu, zzcom zzcom, String str) {
        this.f33421a = j;
        zzfbp w = zzcom.mo44213w();
        w.mo44338b(context);
        w.mo44337a(new zzq());
        w.mo44340t(str);
        zzeon zza = w.mo44339d().zza();
        this.f33422b = zza;
        zza.mo19943xa(new zzdza(this, zzdyu));
    }

    /* renamed from: a */
    public final void mo45064a() {
        this.f33422b.mo19942t8(ObjectWrapper.m5051g8(null));
    }

    /* renamed from: b */
    public final void mo45065b(zzl zzl) {
        this.f33422b.mo19932h6(zzl);
    }

    public final void zza() {
        this.f33422b.mo19922D();
    }
}
