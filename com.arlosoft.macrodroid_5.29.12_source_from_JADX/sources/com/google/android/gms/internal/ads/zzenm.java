package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzenm extends zzbr implements zzdfq {

    /* renamed from: a */
    private final Context f34551a;

    /* renamed from: c */
    private final zzezu f34552c;

    /* renamed from: d */
    private final String f34553d;

    /* renamed from: f */
    private final zzeof f34554f;

    /* renamed from: g */
    private zzq f34555g;

    /* renamed from: o */
    private final zzfed f34556o;

    /* renamed from: p */
    private final zzcgv f34557p;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: s */
    public zzcxc f34558s;

    public zzenm(Context context, zzq zzq, String str, zzezu zzezu, zzeof zzeof, zzcgv zzcgv) {
        this.f34551a = context;
        this.f34552c = zzezu;
        this.f34555g = zzq;
        this.f34553d = str;
        this.f34554f = zzeof;
        this.f34556o = zzezu.mo45540h();
        this.f34557p = zzcgv;
        zzezu.mo45544o(this);
    }

    /* renamed from: Mb */
    private final synchronized void m49268Mb(zzq zzq) {
        this.f34556o.mo45605I(zzq);
        this.f34556o.mo45610N(this.f34555g.f2023E);
    }

    /* renamed from: Nb */
    private final synchronized boolean m49269Nb(zzl zzl) throws RemoteException {
        if (m49270Ob()) {
            Preconditions.m4483f("loadAd must be called on the main UI thread.");
        }
        zzt.m2905r();
        if (!zzs.m2753d(this.f34551a) || zzl.f1991J != null) {
            zzfez.m50041a(this.f34551a, zzl.f2002o);
            return this.f34552c.mo45412a(zzl, this.f34553d, (zzeot) null, new zzenl(this));
        }
        zzcgp.m45226d("Failed to load the ad because app ID is missing.");
        zzeof zzeof = this.f34554f;
        if (zzeof != null) {
            zzeof.mo44382r(zzffe.m50085d(4, (String) null, (zze) null));
        }
        return false;
    }

    /* renamed from: Ob */
    private final boolean m49270Ob() {
        boolean z;
        if (((Boolean) zzbkq.f27445f.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue()) {
                z = true;
                return this.f34557p.f28448d >= ((Integer) zzay.m1924c().mo42663b(zzbjc.f26945N8)).intValue() || !z;
            }
        }
        z = false;
        if (this.f34557p.f28448d >= ((Integer) zzay.m1924c().mo42663b(zzbjc.f26945N8)).intValue()) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.f34557p.f28448d < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzay.m1924c().mo42663b(com.google.android.gms.internal.ads.zzbjc.f26955O8)).intValue()) goto L_0x0037;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19922D() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbke r0 = com.google.android.gms.internal.ads.zzbkq.f27444e     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.mo42728e()     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26905J8     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzcgv r0 = r3.f34557p     // Catch:{ all -> 0x0047 }
            int r0 = r0.f28448d     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26955O8     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0047 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0047 }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m4483f(r0)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcxc r0 = r3.f34558s     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            r0.mo44439a()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0045:
            monitor-exit(r3)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenm.mo19922D():void");
    }

    /* renamed from: D0 */
    public final void mo19946D0() {
    }

    /* renamed from: Eb */
    public final synchronized void mo19923Eb(boolean z) {
        if (m49270Ob()) {
            Preconditions.m4483f("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.f34556o.mo45612P(z);
    }

    /* renamed from: F */
    public final synchronized void mo19947F() {
        Preconditions.m4483f("recordManualImpression must be called on the main UI thread.");
        zzcxc zzcxc = this.f34558s;
        if (zzcxc != null) {
            zzcxc.mo44458m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.f34557p.f28448d < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzay.m1924c().mo42663b(com.google.android.gms.internal.ads.zzbjc.f26955O8)).intValue()) goto L_0x0037;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19924I() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbke r0 = com.google.android.gms.internal.ads.zzbkq.f27446g     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.mo42728e()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26915K8     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzcgv r0 = r3.f34557p     // Catch:{ all -> 0x004c }
            int r0 = r0.f28448d     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26955O8     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m4483f(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcxc r0 = r3.f34558s     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzddz r0 = r0.mo44497d()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.mo44584W0(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenm.mo19924I():void");
    }

    /* renamed from: J6 */
    public final void mo19948J6(zzbzl zzbzl) {
    }

    /* renamed from: M4 */
    public final void mo19925M4(zzw zzw) {
    }

    /* renamed from: M7 */
    public final void mo19949M7(zzcby zzcby) {
    }

    /* renamed from: N3 */
    public final void mo19926N3(zzbc zzbc) {
        if (m49270Ob()) {
            Preconditions.m4483f("setAdListener must be called on the main UI thread.");
        }
        this.f34552c.mo45543n(zzbc);
    }

    /* renamed from: Q5 */
    public final synchronized boolean mo19950Q5() {
        return this.f34552c.zza();
    }

    /* renamed from: T8 */
    public final synchronized void mo19951T8(zzbjx zzbjx) {
        Preconditions.m4483f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f34552c.mo45545p(zzbjx);
    }

    /* renamed from: U6 */
    public final void mo19952U6(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.f34557p.f28448d < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzay.m1924c().mo42663b(com.google.android.gms.internal.ads.zzbjc.f26955O8)).intValue()) goto L_0x0037;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19927V() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbke r0 = com.google.android.gms.internal.ads.zzbkq.f27447h     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.mo42728e()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26895I8     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzcgv r0 = r3.f34557p     // Catch:{ all -> 0x004c }
            int r0 = r0.f28448d     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26955O8     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m4483f(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcxc r0 = r3.f34558s     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzddz r0 = r0.mo44497d()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.mo44585Y0(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenm.mo19927V():void");
    }

    /* renamed from: a1 */
    public final boolean mo19953a1() {
        return false;
    }

    /* renamed from: ab */
    public final void mo19954ab(zzbw zzbw) {
        Preconditions.m4483f("setAdMetadataListener must be called on the main UI thread.");
    }

    /* renamed from: c3 */
    public final void mo19928c3(zzl zzl, zzbi zzbi) {
    }

    /* renamed from: d */
    public final Bundle mo19955d() {
        Preconditions.m4483f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    /* renamed from: f */
    public final synchronized zzq mo19929f() {
        Preconditions.m4483f("getAdSize must be called on the main UI thread.");
        zzcxc zzcxc = this.f34558s;
        if (zzcxc != null) {
            return zzfej.m50010a(this.f34551a, Collections.singletonList(zzcxc.mo44456k()));
        }
        return this.f34556o.mo45625x();
    }

    /* renamed from: g */
    public final zzbf mo19930g() {
        return this.f34554f.mo45395b();
    }

    /* renamed from: h */
    public final zzbz mo19931h() {
        return this.f34554f.mo45396c();
    }

    /* renamed from: h6 */
    public final synchronized boolean mo19932h6(zzl zzl) throws RemoteException {
        m49268Mb(this.f34555g);
        return m49269Nb(zzl);
    }

    @Nullable
    /* renamed from: i */
    public final synchronized zzdh mo19933i() {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26972Q5)).booleanValue()) {
            return null;
        }
        zzcxc zzcxc = this.f34558s;
        if (zzcxc == null) {
            return null;
        }
        return zzcxc.mo44496c();
    }

    @Nullable
    /* renamed from: j */
    public final synchronized zzdk mo19934j() {
        Preconditions.m4483f("getVideoController must be called from the main thread.");
        zzcxc zzcxc = this.f34558s;
        if (zzcxc == null) {
            return null;
        }
        return zzcxc.mo44455j();
    }

    /* renamed from: l6 */
    public final synchronized void mo19956l6(zzcd zzcd) {
        Preconditions.m4483f("setCorrelationIdProvider must be called on the main UI thread");
        this.f34556o.mo45623q(zzcd);
    }

    /* renamed from: l9 */
    public final void mo19935l9(zzde zzde) {
        if (m49270Ob()) {
            Preconditions.m4483f("setPaidEventListener must be called on the main UI thread.");
        }
        this.f34554f.mo45399o(zzde);
    }

    /* renamed from: m8 */
    public final void mo19936m8(zzcg zzcg) {
    }

    /* renamed from: n */
    public final IObjectWrapper mo19937n() {
        if (m49270Ob()) {
            Preconditions.m4483f("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.m5051g8(this.f34552c.mo45539c());
    }

    /* renamed from: o7 */
    public final void mo19938o7(zzbz zzbz) {
        if (m49270Ob()) {
            Preconditions.m4483f("setAppEventListener must be called on the main UI thread.");
        }
        this.f34554f.mo45400y(zzbz);
    }

    /* renamed from: oa */
    public final synchronized void mo19939oa(zzq zzq) {
        Preconditions.m4483f("setAdSize must be called on the main UI thread.");
        this.f34556o.mo45605I(zzq);
        this.f34555g = zzq;
        zzcxc zzcxc = this.f34558s;
        if (zzcxc != null) {
            zzcxc.mo44459n(this.f34552c.mo45539c(), zzq);
        }
    }

    @Nullable
    /* renamed from: p */
    public final synchronized String mo19957p() {
        zzcxc zzcxc = this.f34558s;
        if (zzcxc == null || zzcxc.mo44496c() == null) {
            return null;
        }
        return zzcxc.mo44496c().mo19995f();
    }

    /* renamed from: q */
    public final synchronized String mo19940q() {
        return this.f34553d;
    }

    /* renamed from: q9 */
    public final void mo19941q9(zzbdm zzbdm) {
    }

    @Nullable
    /* renamed from: r */
    public final synchronized String mo19958r() {
        zzcxc zzcxc = this.f34558s;
        if (zzcxc == null || zzcxc.mo44496c() == null) {
            return null;
        }
        return zzcxc.mo44496c().mo19995f();
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
        if (m49270Ob()) {
            Preconditions.m4483f("setAdListener must be called on the main UI thread.");
        }
        this.f34554f.mo45397e(zzbf);
    }

    /* renamed from: y9 */
    public final synchronized void mo19944y9(zzff zzff) {
        if (m49270Ob()) {
            Preconditions.m4483f("setVideoOptions must be called on the main UI thread.");
        }
        this.f34556o.mo45619f(zzff);
    }

    /* renamed from: ya */
    public final void mo19945ya(boolean z) {
    }

    public final synchronized void zza() {
        if (this.f34552c.mo45546q()) {
            zzq x = this.f34556o.mo45625x();
            zzcxc zzcxc = this.f34558s;
            if (!(zzcxc == null || zzcxc.mo44457l() == null || !this.f34556o.mo45622o())) {
                x = zzfej.m50010a(this.f34551a, Collections.singletonList(this.f34558s.mo44457l()));
            }
            m49268Mb(x);
            try {
                m49269Nb(this.f34556o.mo45624v());
            } catch (RemoteException unused) {
                zzcgp.m45229g("Failed to refresh the banner ad.");
            }
        } else {
            this.f34552c.mo45542m();
        }
    }
}
