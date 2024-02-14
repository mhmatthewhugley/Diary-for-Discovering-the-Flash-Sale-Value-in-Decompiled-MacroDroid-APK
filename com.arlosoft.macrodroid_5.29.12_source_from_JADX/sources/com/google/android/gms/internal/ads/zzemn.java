package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzemn implements zzehc {
    @Nullable

    /* renamed from: a */
    private final zzbjx f34480a;

    /* renamed from: b */
    private final zzfzq f34481b;

    /* renamed from: c */
    private final zzfih f34482c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzemw f34483d;

    public zzemn(zzfih zzfih, zzfzq zzfzq, @Nullable zzbjx zzbjx, zzemw zzemw, byte[] bArr) {
        this.f34482c = zzfih;
        this.f34481b = zzfzq;
        this.f34480a = zzbjx;
        this.f34483d = zzemw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f35554t;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45298a(com.google.android.gms.internal.ads.zzfdw r1, com.google.android.gms.internal.ads.zzfdk r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbjx r1 = r0.f34480a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemn.mo45298a(com.google.android.gms.internal.ads.zzfdw, com.google.android.gms.internal.ads.zzfdk):boolean");
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        zzchh zzchh = new zzchh();
        zzems zzems = new zzems();
        zzems.mo45377c(new zzemm(this, zzchh, zzfdw, zzfdk, zzems));
        zzfdp zzfdp = zzfdk.f35554t;
        zzbjs zzbjs = new zzbjs(zzems, zzfdp.f35578b, zzfdp.f35577a);
        zzfih zzfih = this.f34482c;
        return zzfhr.m50182d(new zzeml(this, zzbjs), this.f34481b, zzfib.CUSTOM_RENDER_SYN, zzfih).mo45743b(zzfib.CUSTOM_RENDER_ACK).mo45745d(zzchh).mo45742a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo45373c(zzbjs zzbjs) throws Exception {
        this.f34480a.mo42697L7(zzbjs);
    }
}
