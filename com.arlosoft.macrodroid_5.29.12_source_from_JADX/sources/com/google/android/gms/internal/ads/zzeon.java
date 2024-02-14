package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
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
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeon extends zzbr {

    /* renamed from: a */
    private final zzq f34594a;

    /* renamed from: c */
    private final Context f34595c;

    /* renamed from: d */
    private final zzfbn f34596d;

    /* renamed from: f */
    private final String f34597f;

    /* renamed from: g */
    private final zzcgv f34598g;

    /* renamed from: o */
    private final zzeof f34599o;

    /* renamed from: p */
    private final zzfcn f34600p;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: s */
    public zzdlg f34601s;

    /* renamed from: z */
    private boolean f34602z = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26807A0)).booleanValue();

    public zzeon(Context context, zzq zzq, String str, zzfbn zzfbn, zzeof zzeof, zzfcn zzfcn, zzcgv zzcgv) {
        this.f34594a = zzq;
        this.f34597f = str;
        this.f34595c = context;
        this.f34596d = zzfbn;
        this.f34599o = zzeof;
        this.f34600p = zzfcn;
        this.f34598g = zzcgv;
    }

    /* renamed from: Mb */
    private final synchronized boolean m49365Mb() {
        zzdlg zzdlg;
        zzdlg = this.f34601s;
        return zzdlg != null && !zzdlg.mo44694h();
    }

    /* renamed from: D */
    public final synchronized void mo19922D() {
        Preconditions.m4483f("destroy must be called on the main UI thread.");
        zzdlg zzdlg = this.f34601s;
        if (zzdlg != null) {
            zzdlg.mo44497d().mo44583M0((Context) null);
        }
    }

    /* renamed from: D0 */
    public final synchronized void mo19946D0() {
        Preconditions.m4483f("showInterstitial must be called on the main UI thread.");
        zzdlg zzdlg = this.f34601s;
        if (zzdlg == null) {
            zzcgp.m45229g("Interstitial can not be shown before loaded.");
            this.f34599o.mo44388M0(zzffe.m50085d(9, (String) null, (zze) null));
            return;
        }
        zzdlg.mo44695i(this.f34602z, (Activity) null);
    }

    /* renamed from: Eb */
    public final void mo19923Eb(boolean z) {
    }

    /* renamed from: F */
    public final void mo19947F() {
    }

    /* renamed from: I */
    public final synchronized void mo19924I() {
        Preconditions.m4483f("pause must be called on the main UI thread.");
        zzdlg zzdlg = this.f34601s;
        if (zzdlg != null) {
            zzdlg.mo44497d().mo44584W0((Context) null);
        }
    }

    /* renamed from: J6 */
    public final void mo19948J6(zzbzl zzbzl) {
    }

    /* renamed from: M4 */
    public final void mo19925M4(zzw zzw) {
    }

    /* renamed from: M7 */
    public final void mo19949M7(zzcby zzcby) {
        this.f34600p.mo45585W(zzcby);
    }

    /* renamed from: N3 */
    public final void mo19926N3(zzbc zzbc) {
    }

    /* renamed from: Q5 */
    public final synchronized boolean mo19950Q5() {
        return this.f34596d.zza();
    }

    /* renamed from: T8 */
    public final synchronized void mo19951T8(zzbjx zzbjx) {
        Preconditions.m4483f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f34596d.mo45581h(zzbjx);
    }

    /* renamed from: U6 */
    public final void mo19952U6(String str) {
    }

    /* renamed from: V */
    public final synchronized void mo19927V() {
        Preconditions.m4483f("resume must be called on the main UI thread.");
        zzdlg zzdlg = this.f34601s;
        if (zzdlg != null) {
            zzdlg.mo44497d().mo44585Y0((Context) null);
        }
    }

    /* renamed from: a1 */
    public final synchronized boolean mo19953a1() {
        Preconditions.m4483f("isLoaded must be called on the main UI thread.");
        return m49365Mb();
    }

    /* renamed from: ab */
    public final void mo19954ab(zzbw zzbw) {
        Preconditions.m4483f("setAdMetadataListener must be called on the main UI thread.");
    }

    /* renamed from: c3 */
    public final void mo19928c3(zzl zzl, zzbi zzbi) {
        this.f34599o.mo45398f(zzbi);
        mo19932h6(zzl);
    }

    /* renamed from: d */
    public final Bundle mo19955d() {
        Preconditions.m4483f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    /* renamed from: f */
    public final zzq mo19929f() {
        return null;
    }

    /* renamed from: g */
    public final zzbf mo19930g() {
        return this.f34599o.mo45395b();
    }

    /* renamed from: h */
    public final zzbz mo19931h() {
        return this.f34599o.mo45396c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065 A[SYNTHETIC, Splitter:B:21:0x0065] */
    /* renamed from: h6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo19932h6(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbke r0 = com.google.android.gms.internal.ads.zzbkq.f27448i     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.mo42728e()     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26935M8     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r2.mo42663b(r0)     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzcgv r2 = r5.f34598g     // Catch:{ all -> 0x008c }
            int r2 = r2.f28448d     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f26945N8     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r4.mo42663b(r3)     // Catch:{ all -> 0x008c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x008c }
            int r3 = r3.intValue()     // Catch:{ all -> 0x008c }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m4483f(r0)     // Catch:{ all -> 0x008c }
        L_0x0042:
            com.google.android.gms.ads.internal.zzt.m2905r()     // Catch:{ all -> 0x008c }
            android.content.Context r0 = r5.f34595c     // Catch:{ all -> 0x008c }
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.m2753d(r0)     // Catch:{ all -> 0x008c }
            r2 = 0
            if (r0 == 0) goto L_0x0065
            com.google.android.gms.ads.internal.client.zzc r0 = r6.f1991J     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0065
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcgp.m45226d(r6)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzeof r6 = r5.f34599o     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0063
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzffe.m50085d(r0, r2, r2)     // Catch:{ all -> 0x008c }
            r6.mo44382r(r0)     // Catch:{ all -> 0x008c }
        L_0x0063:
            monitor-exit(r5)
            return r1
        L_0x0065:
            boolean r0 = r5.m49365Mb()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            monitor-exit(r5)
            return r1
        L_0x006d:
            android.content.Context r0 = r5.f34595c     // Catch:{ all -> 0x008c }
            boolean r1 = r6.f2002o     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzfez.m50041a(r0, r1)     // Catch:{ all -> 0x008c }
            r5.f34601s = r2     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzfbn r0 = r5.f34596d     // Catch:{ all -> 0x008c }
            java.lang.String r1 = r5.f34597f     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzfbg r2 = new com.google.android.gms.internal.ads.zzfbg     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.internal.client.zzq r3 = r5.f34594a     // Catch:{ all -> 0x008c }
            r2.<init>(r3)     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.ads.zzeom r3 = new com.google.android.gms.internal.ads.zzeom     // Catch:{ all -> 0x008c }
            r3.<init>(r5)     // Catch:{ all -> 0x008c }
            boolean r6 = r0.mo45412a(r6, r1, r2, r3)     // Catch:{ all -> 0x008c }
            monitor-exit(r5)
            return r6
        L_0x008c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeon.mo19932h6(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Nullable
    /* renamed from: i */
    public final synchronized zzdh mo19933i() {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26972Q5)).booleanValue()) {
            return null;
        }
        zzdlg zzdlg = this.f34601s;
        if (zzdlg == null) {
            return null;
        }
        return zzdlg.mo44496c();
    }

    /* renamed from: j */
    public final zzdk mo19934j() {
        return null;
    }

    /* renamed from: l6 */
    public final void mo19956l6(zzcd zzcd) {
    }

    /* renamed from: l9 */
    public final void mo19935l9(zzde zzde) {
        Preconditions.m4483f("setPaidEventListener must be called on the main UI thread.");
        this.f34599o.mo45399o(zzde);
    }

    /* renamed from: m8 */
    public final void mo19936m8(zzcg zzcg) {
        this.f34599o.mo45394K(zzcg);
    }

    /* renamed from: n */
    public final IObjectWrapper mo19937n() {
        return null;
    }

    /* renamed from: o7 */
    public final void mo19938o7(zzbz zzbz) {
        Preconditions.m4483f("setAppEventListener must be called on the main UI thread.");
        this.f34599o.mo45400y(zzbz);
    }

    /* renamed from: oa */
    public final void mo19939oa(zzq zzq) {
    }

    @Nullable
    /* renamed from: p */
    public final synchronized String mo19957p() {
        zzdlg zzdlg = this.f34601s;
        if (zzdlg == null || zzdlg.mo44496c() == null) {
            return null;
        }
        return zzdlg.mo44496c().mo19995f();
    }

    /* renamed from: q */
    public final synchronized String mo19940q() {
        return this.f34597f;
    }

    /* renamed from: q9 */
    public final void mo19941q9(zzbdm zzbdm) {
    }

    @Nullable
    /* renamed from: r */
    public final synchronized String mo19958r() {
        zzdlg zzdlg = this.f34601s;
        if (zzdlg == null || zzdlg.mo44496c() == null) {
            return null;
        }
        return zzdlg.mo44496c().mo19995f();
    }

    /* renamed from: s7 */
    public final void mo19959s7(zzbzo zzbzo, String str) {
    }

    /* renamed from: t8 */
    public final synchronized void mo19942t8(IObjectWrapper iObjectWrapper) {
        if (this.f34601s == null) {
            zzcgp.m45229g("Interstitial can not be shown before loaded.");
            this.f34599o.mo44388M0(zzffe.m50085d(9, (String) null, (zze) null));
            return;
        }
        this.f34601s.mo44695i(this.f34602z, (Activity) ObjectWrapper.m5050A1(iObjectWrapper));
    }

    /* renamed from: v8 */
    public final void mo19960v8(String str) {
    }

    /* renamed from: w4 */
    public final void mo19961w4(zzdo zzdo) {
    }

    /* renamed from: xa */
    public final void mo19943xa(zzbf zzbf) {
        Preconditions.m4483f("setAdListener must be called on the main UI thread.");
        this.f34599o.mo45397e(zzbf);
    }

    /* renamed from: y9 */
    public final void mo19944y9(zzff zzff) {
    }

    /* renamed from: ya */
    public final synchronized void mo19945ya(boolean z) {
        Preconditions.m4483f("setImmersiveMode must be called on the main UI thread.");
        this.f34602z = z;
    }
}
