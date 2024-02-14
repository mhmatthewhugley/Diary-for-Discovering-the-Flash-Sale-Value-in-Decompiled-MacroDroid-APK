package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzemi implements zzehc {

    /* renamed from: a */
    private final Context f34463a;

    /* renamed from: b */
    private final zzcxz f34464b;
    @Nullable

    /* renamed from: c */
    private final zzbjx f34465c;

    /* renamed from: d */
    private final zzfzq f34466d;

    /* renamed from: e */
    private final zzfih f34467e;

    public zzemi(Context context, zzcxz zzcxz, zzfih zzfih, zzfzq zzfzq, @Nullable zzbjx zzbjx) {
        this.f34463a = context;
        this.f34464b = zzcxz;
        this.f34467e = zzfih;
        this.f34466d = zzfzq;
        this.f34465c = zzbjx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f35554t;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45298a(com.google.android.gms.internal.ads.zzfdw r1, com.google.android.gms.internal.ads.zzfdk r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbjx r1 = r0.f34465c
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzfdp r1 = r2.f35554t
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.f35577a
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemi.mo45298a(com.google.android.gms.internal.ads.zzfdw, com.google.android.gms.internal.ads.zzfdk):boolean");
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        zzcxd a = this.f34464b.mo44291a(new zzczt(zzfdw, zzfdk, (String) null), new zzemg(this, new View(this.f34463a), (zzcmp) null, zzeme.f34454a, (zzfdl) zzfdk.f35556v.get(0)));
        zzemh k = a.mo44283k();
        zzfdp zzfdp = zzfdk.f35554t;
        zzbjs zzbjs = new zzbjs(k, zzfdp.f35578b, zzfdp.f35577a);
        zzfih zzfih = this.f34467e;
        return zzfhr.m50182d(new zzemf(this, zzbjs), this.f34466d, zzfib.CUSTOM_RENDER_SYN, zzfih).mo45743b(zzfib.CUSTOM_RENDER_ACK).mo45745d(zzfzg.m51414i(a.mo44280h())).mo45742a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo45372c(zzbjs zzbjs) throws Exception {
        this.f34465c.mo42697L7(zzbjs);
    }
}
