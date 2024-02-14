package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcwv extends zzcze {
    @Nullable

    /* renamed from: i */
    private final zzcmp f31746i;

    /* renamed from: j */
    private final int f31747j;

    /* renamed from: k */
    private final Context f31748k;

    /* renamed from: l */
    private final zzcwd f31749l;

    /* renamed from: m */
    private final zzdmp f31750m;

    /* renamed from: n */
    private final zzdjw f31751n;

    /* renamed from: o */
    private final zzddn f31752o;

    /* renamed from: p */
    private final boolean f31753p;

    /* renamed from: q */
    private boolean f31754q = false;

    zzcwv(zzczd zzczd, Context context, @Nullable zzcmp zzcmp, int i, zzcwd zzcwd, zzdmp zzdmp, zzdjw zzdjw, zzddn zzddn) {
        super(zzczd);
        this.f31746i = zzcmp;
        this.f31748k = context;
        this.f31747j = i;
        this.f31749l = zzcwd;
        this.f31750m = zzdmp;
        this.f31751n = zzdjw;
        this.f31752o = zzddn;
        this.f31753p = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27256t4)).booleanValue();
    }

    /* renamed from: a */
    public final void mo44439a() {
        super.mo44439a();
        zzcmp zzcmp = this.f31746i;
        if (zzcmp != null) {
            zzcmp.destroy();
        }
    }

    /* renamed from: h */
    public final int mo44440h() {
        return this.f31747j;
    }

    /* renamed from: i */
    public final void mo44441i(zzbdd zzbdd) {
        zzcmp zzcmp = this.f31746i;
        if (zzcmp != null) {
            zzcmp.mo44034U0(zzbdd);
        }
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [android.content.Context] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44442j(android.app.Activity r3, com.google.android.gms.internal.ads.zzbdq r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            android.content.Context r3 = r2.f31748k
        L_0x0004:
            boolean r4 = r2.f31753p
            if (r4 == 0) goto L_0x000d
            com.google.android.gms.internal.ads.zzdjw r4 = r2.f31751n
            r4.zzb()
        L_0x000d:
            com.google.android.gms.internal.ads.zzbiu r4 = com.google.android.gms.internal.ads.zzbjc.f27302y0
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r4 = r0.mo42663b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0061
            com.google.android.gms.ads.internal.zzt.m2905r()
            boolean r4 = com.google.android.gms.ads.internal.util.zzs.m2752c(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzcgp.m45229g(r4)
            com.google.android.gms.internal.ads.zzddn r4 = r2.f31752o
            r4.zzb()
            com.google.android.gms.internal.ads.zzbiu r4 = com.google.android.gms.internal.ads.zzbjc.f27312z0
            com.google.android.gms.internal.ads.zzbja r5 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r4 = r5.mo42663b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.zzfni r4 = new com.google.android.gms.internal.ads.zzfni
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbv r5 = com.google.android.gms.ads.internal.zzt.m2909v()
            android.os.Looper r5 = r5.mo20334b()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfdw r3 = r2.f31895a
            com.google.android.gms.internal.ads.zzfdv r3 = r3.f35590b
            com.google.android.gms.internal.ads.zzfdn r3 = r3.f35587b
            java.lang.String r3 = r3.f35566b
            r4.mo46006a(r3)
            return
        L_0x0061:
            boolean r4 = r2.f31754q
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.zzcgp.m45229g(r4)
            com.google.android.gms.internal.ads.zzddn r4 = r2.f31752o
            r0 = 10
            r1 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzffe.m50085d(r0, r1, r1)
            r4.mo44574r(r0)
        L_0x0076:
            boolean r4 = r2.f31754q
            if (r4 != 0) goto L_0x0094
            com.google.android.gms.internal.ads.zzdmp r4 = r2.f31750m     // Catch:{ zzdmo -> 0x008e }
            com.google.android.gms.internal.ads.zzddn r0 = r2.f31752o     // Catch:{ zzdmo -> 0x008e }
            r4.mo44707a(r5, r3, r0)     // Catch:{ zzdmo -> 0x008e }
            boolean r3 = r2.f31753p     // Catch:{ zzdmo -> 0x008e }
            if (r3 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzdjw r3 = r2.f31751n     // Catch:{ zzdmo -> 0x008e }
            r3.zza()     // Catch:{ zzdmo -> 0x008e }
        L_0x008a:
            r3 = 1
            r2.f31754q = r3
            return
        L_0x008e:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzddn r4 = r2.f31752o
            r4.mo44575y0(r3)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcwv.mo44442j(android.app.Activity, com.google.android.gms.internal.ads.zzbdq, boolean):void");
    }

    /* renamed from: k */
    public final void mo44443k(long j, int i) {
        this.f31749l.mo44426a(j, i);
    }
}
