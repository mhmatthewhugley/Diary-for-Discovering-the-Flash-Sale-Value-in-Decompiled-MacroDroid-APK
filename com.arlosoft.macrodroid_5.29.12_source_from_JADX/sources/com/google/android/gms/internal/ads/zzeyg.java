package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
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
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeyg extends zzbr implements zzad, zzbdd, zzdez {
    @Nullable

    /* renamed from: A */
    private zzcvw f35180A;
    @Nullable

    /* renamed from: B */
    protected zzcwl f35181B;

    /* renamed from: a */
    private final zzcom f35182a;

    /* renamed from: c */
    private final Context f35183c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ViewGroup f35184d;

    /* renamed from: f */
    private AtomicBoolean f35185f = new AtomicBoolean();

    /* renamed from: g */
    private final String f35186g;

    /* renamed from: o */
    private final zzeya f35187o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final zzezg f35188p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final zzcgv f35189s;

    /* renamed from: z */
    private long f35190z = -1;

    public zzeyg(zzcom zzcom, Context context, String str, zzeya zzeya, zzezg zzezg, zzcgv zzcgv) {
        this.f35184d = new FrameLayout(context);
        this.f35182a = zzcom;
        this.f35183c = context;
        this.f35186g = str;
        this.f35187o = zzeya;
        this.f35188p = zzezg;
        zzezg.mo45527n(this);
        this.f35189s = zzcgv;
    }

    /* renamed from: Mb */
    static /* bridge */ /* synthetic */ zzr m49584Mb(zzeyg zzeyg, zzcwl zzcwl) {
        boolean o = zzcwl.mo44434o();
        int intValue = ((Integer) zzay.m1924c().mo42663b(zzbjc.f27056Z3)).intValue();
        zzq zzq = new zzq();
        zzq.f2123d = 50;
        int i = 0;
        zzq.f2120a = true != o ? 0 : intValue;
        if (true != o) {
            i = intValue;
        }
        zzq.f2121b = i;
        zzq.f2122c = intValue;
        return new zzr(zzeyg.f35183c, zzq, zzeyg);
    }

    /* renamed from: Pb */
    private final synchronized void m49587Pb(int i) {
        if (this.f35185f.compareAndSet(false, true)) {
            zzcwl zzcwl = this.f35181B;
            if (!(zzcwl == null || zzcwl.mo44436q() == null)) {
                this.f35188p.mo45523E(zzcwl.mo44436q());
            }
            this.f35188p.mo45526h();
            this.f35184d.removeAllViews();
            zzcvw zzcvw = this.f35180A;
            if (zzcvw != null) {
                zzt.m2891d().mo42464e(zzcvw);
            }
            if (this.f35181B != null) {
                long j = -1;
                if (this.f35190z != -1) {
                    j = zzt.m2889b().mo21952c() - this.f35190z;
                }
                this.f35181B.mo44435p(j, i);
            }
            mo19922D();
        }
    }

    /* renamed from: A1 */
    public final void mo20176A1() {
        m49587Pb(4);
    }

    /* renamed from: D */
    public final synchronized void mo19922D() {
        Preconditions.m4483f("destroy must be called on the main UI thread.");
        zzcwl zzcwl = this.f35181B;
        if (zzcwl != null) {
            zzcwl.mo44439a();
        }
    }

    /* renamed from: D0 */
    public final void mo19946D0() {
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
        this.f35187o.mo45522k(zzw);
    }

    /* renamed from: M7 */
    public final void mo19949M7(zzcby zzcby) {
    }

    /* renamed from: N3 */
    public final void mo19926N3(zzbc zzbc) {
    }

    /* renamed from: Q5 */
    public final synchronized boolean mo19950Q5() {
        return this.f35187o.zza();
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

    /* renamed from: a1 */
    public final boolean mo19953a1() {
        return false;
    }

    /* renamed from: ab */
    public final void mo19954ab(zzbw zzbw) {
    }

    /* renamed from: c3 */
    public final void mo19928c3(zzl zzl, zzbi zzbi) {
    }

    /* renamed from: d */
    public final Bundle mo19955d() {
        return new Bundle();
    }

    /* renamed from: e */
    public final void mo44603e() {
        if (this.f35181B != null) {
            this.f35190z = zzt.m2889b().mo21952c();
            int h = this.f35181B.mo44427h();
            if (h > 0) {
                zzcvw zzcvw = new zzcvw(this.f35182a.mo44195c(), zzt.m2889b());
                this.f35180A = zzcvw;
                zzcvw.mo44419c(h, new zzeyd(this));
            }
        }
    }

    @Nullable
    /* renamed from: f */
    public final synchronized com.google.android.gms.ads.internal.client.zzq mo19929f() {
        Preconditions.m4483f("getAdSize must be called on the main UI thread.");
        zzcwl zzcwl = this.f35181B;
        if (zzcwl == null) {
            return null;
        }
        return zzfej.m50010a(this.f35183c, Collections.singletonList(zzcwl.mo44429j()));
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
            com.google.android.gms.internal.ads.zzcgv r2 = r5.f35189s     // Catch:{ all -> 0x0087 }
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
            android.content.Context r0 = r5.f35183c     // Catch:{ all -> 0x0087 }
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.m2753d(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.client.zzc r0 = r6.f1991J     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcgp.m45226d(r6)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzezg r6 = r5.f35188p     // Catch:{ all -> 0x0087 }
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
            r5.f35185f = r0     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeye r0 = new com.google.android.gms.internal.ads.zzeye     // Catch:{ all -> 0x0087 }
            r0.<init>(r5)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeya r1 = r5.f35187o     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r5.f35186g     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzeyf r3 = new com.google.android.gms.internal.ads.zzeyf     // Catch:{ all -> 0x0087 }
            r3.<init>(r5)     // Catch:{ all -> 0x0087 }
            boolean r6 = r1.mo45412a(r6, r2, r0, r3)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r6
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyg.mo19932h6(com.google.android.gms.ads.internal.client.zzl):boolean");
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
    /* renamed from: l */
    public final /* synthetic */ void mo45516l() {
        m49587Pb(5);
    }

    /* renamed from: l6 */
    public final synchronized void mo19956l6(zzcd zzcd) {
    }

    /* renamed from: l9 */
    public final void mo19935l9(zzde zzde) {
    }

    @VisibleForTesting
    /* renamed from: m */
    public final void mo45517m() {
        zzaw.m1917b();
        if (zzcgi.m45184t()) {
            m49587Pb(5);
        } else {
            this.f35182a.mo44194b().execute(new zzeyc(this));
        }
    }

    /* renamed from: m8 */
    public final void mo19936m8(zzcg zzcg) {
    }

    /* renamed from: n */
    public final IObjectWrapper mo19937n() {
        Preconditions.m4483f("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.m5051g8(this.f35184d);
    }

    /* renamed from: o7 */
    public final void mo19938o7(zzbz zzbz) {
    }

    /* renamed from: oa */
    public final synchronized void mo19939oa(com.google.android.gms.ads.internal.client.zzq zzq) {
        Preconditions.m4483f("setAdSize must be called on the main UI thread.");
    }

    /* renamed from: p */
    public final synchronized String mo19957p() {
        return null;
    }

    /* renamed from: q */
    public final synchronized String mo19940q() {
        return this.f35186g;
    }

    /* renamed from: q9 */
    public final void mo19941q9(zzbdm zzbdm) {
        this.f35188p.mo45530u(zzbdm);
    }

    /* renamed from: r */
    public final synchronized String mo19958r() {
        return null;
    }

    /* renamed from: s7 */
    public final void mo19959s7(zzbzo zzbzo, String str) {
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

    /* renamed from: y9 */
    public final synchronized void mo19944y9(zzff zzff) {
    }

    /* renamed from: ya */
    public final void mo19945ya(boolean z) {
    }

    public final void zza() {
        m49587Pb(3);
    }
}
