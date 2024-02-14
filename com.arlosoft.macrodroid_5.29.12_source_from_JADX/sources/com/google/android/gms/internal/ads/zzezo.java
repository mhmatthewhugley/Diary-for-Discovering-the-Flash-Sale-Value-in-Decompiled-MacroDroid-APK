package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzezo extends zzbr implements zzo, zzbdd {
    @Nullable

    /* renamed from: A */
    protected zzcwv f35251A;

    /* renamed from: a */
    private final zzcom f35252a;

    /* renamed from: c */
    private final Context f35253c;

    /* renamed from: d */
    private AtomicBoolean f35254d = new AtomicBoolean();

    /* renamed from: f */
    private final String f35255f;

    /* renamed from: g */
    private final zzezi f35256g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final zzezg f35257o;

    /* renamed from: p */
    private final zzcgv f35258p;

    /* renamed from: s */
    private long f35259s = -1;
    @Nullable

    /* renamed from: z */
    private zzcvw f35260z;

    public zzezo(zzcom zzcom, Context context, String str, zzezi zzezi, zzezg zzezg, zzcgv zzcgv) {
        this.f35252a = zzcom;
        this.f35253c = context;
        this.f35255f = str;
        this.f35256g = zzezi;
        this.f35257o = zzezg;
        this.f35258p = zzcgv;
        zzezg.mo45528o(this);
    }

    /* renamed from: Lb */
    private final synchronized void m49689Lb(int i) {
        if (this.f35254d.compareAndSet(false, true)) {
            this.f35257o.mo45526h();
            zzcvw zzcvw = this.f35260z;
            if (zzcvw != null) {
                zzt.m2891d().mo42464e(zzcvw);
            }
            if (this.f35251A != null) {
                long j = -1;
                if (this.f35259s != -1) {
                    j = zzt.m2889b().mo21952c() - this.f35259s;
                }
                this.f35251A.mo44443k(j, i);
            }
            mo19922D();
        }
    }

    /* renamed from: D */
    public final synchronized void mo19922D() {
        Preconditions.m4483f("destroy must be called on the main UI thread.");
        zzcwv zzcwv = this.f35251A;
        if (zzcwv != null) {
            zzcwv.mo44439a();
        }
    }

    /* renamed from: D0 */
    public final synchronized void mo19946D0() {
    }

    /* renamed from: Eb */
    public final synchronized void mo19923Eb(boolean z) {
    }

    /* renamed from: F */
    public final synchronized void mo19947F() {
    }

    /* renamed from: I */
    public final synchronized void mo19924I() {
        Preconditions.m4483f("pause must be called on the main UI thread.");
    }

    /* renamed from: J6 */
    public final void mo19948J6(zzbzl zzbzl) {
    }

    /* renamed from: M4 */
    public final void mo19925M4(zzw zzw) {
        this.f35256g.mo45522k(zzw);
    }

    /* renamed from: M7 */
    public final void mo19949M7(zzcby zzcby) {
    }

    /* renamed from: N3 */
    public final void mo19926N3(zzbc zzbc) {
    }

    /* renamed from: Q5 */
    public final synchronized boolean mo19950Q5() {
        return this.f35256g.zza();
    }

    /* renamed from: T8 */
    public final synchronized void mo19951T8(zzbjx zzbjx) {
    }

    /* renamed from: U6 */
    public final void mo19952U6(String str) {
    }

    /* renamed from: V */
    public final synchronized void mo19927V() {
        Preconditions.m4483f("resume must be called on the main UI thread.");
    }

    /* renamed from: Z8 */
    public final void mo20216Z8() {
    }

    /* renamed from: a1 */
    public final boolean mo19953a1() {
        return false;
    }

    /* renamed from: ab */
    public final void mo19954ab(zzbw zzbw) {
    }

    /* renamed from: b */
    public final synchronized void mo20217b() {
        zzcwv zzcwv = this.f35251A;
        if (zzcwv != null) {
            zzcwv.mo44443k(zzt.m2889b().mo21952c() - this.f35259s, 1);
        }
    }

    /* renamed from: c3 */
    public final void mo19928c3(zzl zzl, zzbi zzbi) {
    }

    /* renamed from: d */
    public final Bundle mo19955d() {
        return new Bundle();
    }

    /* renamed from: f */
    public final synchronized zzq mo19929f() {
        return null;
    }

    /* renamed from: g */
    public final zzbf mo19930g() {
        return null;
    }

    /* renamed from: h */
    public final zzbz mo19931h() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC, Splitter:B:25:0x006c] */
    /* renamed from: h6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo19932h6(com.google.android.gms.ads.internal.client.zzl r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbke r0 = com.google.android.gms.internal.ads.zzbkq.f27443d     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.mo42728e()     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26935M8     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r2.mo42663b(r0)     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzcgv r2 = r5.f35258p     // Catch:{ all -> 0x0087 }
            int r2 = r2.f28448d     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f26945N8     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0087 }
            java.lang.Object r3 = r4.mo42663b(r3)     // Catch:{ all -> 0x0087 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0087 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0087 }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m4483f(r0)     // Catch:{ all -> 0x0087 }
        L_0x0042:
            com.google.android.gms.ads.internal.zzt.m2905r()     // Catch:{ all -> 0x0087 }
            android.content.Context r0 = r5.f35253c     // Catch:{ all -> 0x0087 }
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.m2753d(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.client.zzc r0 = r6.f1991J     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcgp.m45226d(r6)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzezg r6 = r5.f35257o     // Catch:{ all -> 0x0087 }
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzffe.m50085d(r0, r2, r2)     // Catch:{ all -> 0x0087 }
            r6.mo44382r(r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            boolean r0 = r5.mo19950Q5()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006c
            monitor-exit(r5)
            return r1
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0087 }
            r0.<init>()     // Catch:{ all -> 0x0087 }
            r5.f35254d = r0     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzezm r0 = new com.google.android.gms.internal.ads.zzezm     // Catch:{ all -> 0x0087 }
            r0.<init>(r5)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzezi r1 = r5.f35256g     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r5.f35255f     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzezn r3 = new com.google.android.gms.internal.ads.zzezn     // Catch:{ all -> 0x0087 }
            r3.<init>(r5)     // Catch:{ all -> 0x0087 }
            boolean r6 = r1.mo45412a(r6, r2, r0, r3)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r6
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzezo.mo19932h6(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    /* renamed from: i */
    public final synchronized zzdh mo19933i() {
        return null;
    }

    /* renamed from: j */
    public final synchronized zzdk mo19934j() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo45534k() {
        m49689Lb(5);
    }

    @VisibleForTesting
    /* renamed from: l */
    public final void mo45535l() {
        this.f35252a.mo44194b().execute(new zzezk(this));
    }

    /* renamed from: l6 */
    public final synchronized void mo19956l6(zzcd zzcd) {
    }

    /* renamed from: l9 */
    public final void mo19935l9(zzde zzde) {
    }

    /* renamed from: m8 */
    public final void mo19936m8(zzcg zzcg) {
    }

    /* renamed from: n */
    public final IObjectWrapper mo19937n() {
        return null;
    }

    /* renamed from: o7 */
    public final void mo19938o7(zzbz zzbz) {
    }

    /* renamed from: oa */
    public final synchronized void mo19939oa(zzq zzq) {
        Preconditions.m4483f("setAdSize must be called on the main UI thread.");
    }

    /* renamed from: p */
    public final synchronized String mo19957p() {
        return null;
    }

    /* renamed from: q */
    public final synchronized String mo19940q() {
        return this.f35255f;
    }

    /* renamed from: q9 */
    public final void mo19941q9(zzbdm zzbdm) {
        this.f35257o.mo45530u(zzbdm);
    }

    /* renamed from: r */
    public final synchronized String mo19958r() {
        return null;
    }

    /* renamed from: s7 */
    public final void mo19959s7(zzbzo zzbzo, String str) {
    }

    /* renamed from: sb */
    public final void mo20218sb() {
    }

    /* renamed from: t1 */
    public final void mo20219t1() {
    }

    /* renamed from: t8 */
    public final void mo19942t8(IObjectWrapper iObjectWrapper) {
    }

    /* renamed from: v8 */
    public final void mo19960v8(String str) {
    }

    /* renamed from: w4 */
    public final void mo19961w4(zzdo zzdo) {
    }

    /* renamed from: xa */
    public final void mo19943xa(zzbf zzbf) {
    }

    /* renamed from: y */
    public final void mo20220y(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            m49689Lb(2);
        } else if (i2 == 1) {
            m49689Lb(4);
        } else if (i2 == 2) {
            m49689Lb(3);
        } else if (i2 == 3) {
            m49689Lb(6);
        }
    }

    /* renamed from: y9 */
    public final synchronized void mo19944y9(zzff zzff) {
    }

    /* renamed from: ya */
    public final void mo19945ya(boolean z) {
    }

    public final void zza() {
        m49689Lb(3);
    }

    public final synchronized void zzb() {
        if (this.f35251A != null) {
            this.f35259s = zzt.m2889b().mo21952c();
            int h = this.f35251A.mo44440h();
            if (h > 0) {
                zzcvw zzcvw = new zzcvw(this.f35252a.mo44195c(), zzt.m2889b());
                this.f35260z = zzcvw;
                zzcvw.mo44419c(h, new zzezl(this));
            }
        }
    }
}
