package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzeyq implements zzeov {

    /* renamed from: a */
    private final Context f35207a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f35208b;

    /* renamed from: c */
    protected final zzcom f35209c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzezg f35210d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzfaz f35211e;

    /* renamed from: f */
    private final zzcgv f35212f;

    /* renamed from: g */
    private final ViewGroup f35213g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final zzfjw f35214h;

    /* renamed from: i */
    private final zzfed f35215i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public zzfzp f35216j;

    protected zzeyq(Context context, Executor executor, zzcom zzcom, zzfaz zzfaz, zzezg zzezg, zzfed zzfed, zzcgv zzcgv) {
        this.f35207a = context;
        this.f35208b = executor;
        this.f35209c = zzcom;
        this.f35211e = zzfaz;
        this.f35210d = zzezg;
        this.f35215i = zzfed;
        this.f35212f = zzcgv;
        this.f35213g = new FrameLayout(context);
        this.f35214h = zzcom.mo44191B();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final synchronized zzdci m49645l(zzfax zzfax) {
        zzeyp zzeyp = (zzeyp) zzfax;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27059Z6)).booleanValue()) {
            zzcwz zzcwz = new zzcwz(this.f35213g);
            zzdck zzdck = new zzdck();
            zzdck.mo44554c(this.f35207a);
            zzdck.mo44557f(zzeyp.f35206a);
            zzdcm g = zzdck.mo44558g();
            zzdik zzdik = new zzdik();
            zzdik.mo44635f(this.f35210d, this.f35208b);
            zzdik.mo44644o(this.f35210d, this.f35208b);
            return mo45513b(zzcwz, g, zzdik.mo44646q());
        }
        zzezg f = zzezg.m49666f(this.f35210d);
        zzdik zzdik2 = new zzdik();
        zzdik2.mo44634e(f, this.f35208b);
        zzdik2.mo44639j(f, this.f35208b);
        zzdik2.mo44640k(f, this.f35208b);
        zzdik2.mo44641l(f, this.f35208b);
        zzdik2.mo44635f(f, this.f35208b);
        zzdik2.mo44644o(f, this.f35208b);
        zzdik2.mo44645p(f);
        zzcwz zzcwz2 = new zzcwz(this.f35213g);
        zzdck zzdck2 = new zzdck();
        zzdck2.mo44554c(this.f35207a);
        zzdck2.mo44557f(zzeyp.f35206a);
        return mo45513b(zzcwz2, zzdck2.mo44558g(), zzdik2.mo44646q());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC, Splitter:B:16:0x0056] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo45412a(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzeot r10, com.google.android.gms.internal.ads.zzeou r11) throws android.os.RemoteException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.zzbke r10 = com.google.android.gms.internal.ads.zzbkq.f27443d     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.mo42728e()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.zzbiu r10 = com.google.android.gms.internal.ads.zzbjc.f26935M8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r2.mo42663b(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x0025
            r10 = 1
            goto L_0x0026
        L_0x0025:
            r10 = 0
        L_0x0026:
            com.google.android.gms.internal.ads.zzcgv r2 = r7.f35212f     // Catch:{ all -> 0x00f4 }
            int r2 = r2.f28448d     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f26945N8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r4.mo42663b(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00f4 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00f4 }
            if (r2 < r3) goto L_0x003e
            if (r10 != 0) goto L_0x0043
        L_0x003e:
            java.lang.String r10 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m4483f(r10)     // Catch:{ all -> 0x00f4 }
        L_0x0043:
            if (r9 != 0) goto L_0x0056
            java.lang.String r8 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.internal.ads.zzcgp.m45226d(r8)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r8 = r7.f35208b     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzeyk r9 = new com.google.android.gms.internal.ads.zzeyk     // Catch:{ all -> 0x00f4 }
            r9.<init>(r7)     // Catch:{ all -> 0x00f4 }
            r8.execute(r9)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.zzfzp r10 = r7.f35216j     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x005c
            monitor-exit(r7)
            return r1
        L_0x005c:
            com.google.android.gms.internal.ads.zzbke r10 = com.google.android.gms.internal.ads.zzbkl.f27408c     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.mo42728e()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r1 = 7
            r2 = 0
            if (r10 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzfaz r10 = r7.f35211e     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r10.mo45555d()     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x0088
            java.lang.Object r10 = r10.mo45555d()     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzcwk r10 = (com.google.android.gms.internal.ads.zzcwk) r10     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfju r10 = r10.mo44266e()     // Catch:{ all -> 0x00f4 }
            r10.mo45829h(r1)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = r8.f1988G     // Catch:{ all -> 0x00f4 }
            r10.mo45823b(r3)     // Catch:{ all -> 0x00f4 }
            r4 = r10
            goto L_0x0089
        L_0x0088:
            r4 = r2
        L_0x0089:
            android.content.Context r10 = r7.f35207a     // Catch:{ all -> 0x00f4 }
            boolean r3 = r8.f2002o     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfez.m50041a(r10, r3)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbiu r10 = com.google.android.gms.internal.ads.zzbjc.f26854E7     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r3.mo42663b(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            boolean r10 = r8.f2002o     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzcom r10 = r7.f35209c     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzeak r10 = r10.mo44205o()     // Catch:{ all -> 0x00f4 }
            r10.mo45134m(r0)     // Catch:{ all -> 0x00f4 }
        L_0x00af:
            com.google.android.gms.internal.ads.zzfed r10 = r7.f35215i     // Catch:{ all -> 0x00f4 }
            r10.mo45606J(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.ads.internal.client.zzq r9 = com.google.android.gms.ads.internal.client.zzq.m2418m2()     // Catch:{ all -> 0x00f4 }
            r10.mo45605I(r9)     // Catch:{ all -> 0x00f4 }
            r10.mo45618e(r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfef r9 = r10.mo45620g()     // Catch:{ all -> 0x00f4 }
            android.content.Context r10 = r7.f35207a     // Catch:{ all -> 0x00f4 }
            int r3 = com.google.android.gms.internal.ads.zzfjt.m50323f(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfjj r5 = com.google.android.gms.internal.ads.zzfji.m50259b(r10, r3, r1, r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzeyp r6 = new com.google.android.gms.internal.ads.zzeyp     // Catch:{ all -> 0x00f4 }
            r6.<init>(r2)     // Catch:{ all -> 0x00f4 }
            r6.f35206a = r9     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfaz r8 = r7.f35211e     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfba r9 = new com.google.android.gms.internal.ads.zzfba     // Catch:{ all -> 0x00f4 }
            r9.<init>(r6, r2)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzeyl r10 = new com.google.android.gms.internal.ads.zzeyl     // Catch:{ all -> 0x00f4 }
            r10.<init>(r7)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfzp r8 = r8.mo45552a(r9, r10, r2)     // Catch:{ all -> 0x00f4 }
            r7.f35216j = r8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzeyn r9 = new com.google.android.gms.internal.ads.zzeyn     // Catch:{ all -> 0x00f4 }
            r1 = r9
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r10 = r7.f35208b     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfzg.m51423r(r8, r9, r10)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r0
        L_0x00f4:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyq.mo45412a(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzeot, com.google.android.gms.internal.ads.zzeou):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract zzdci mo45513b(zzcwz zzcwz, zzdcm zzdcm, zzdim zzdim);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo45521j() {
        this.f35210d.mo44382r(zzffe.m50085d(6, (String) null, (zze) null));
    }

    /* renamed from: k */
    public final void mo45522k(zzw zzw) {
        this.f35215i.mo45607K(zzw);
    }

    public final boolean zza() {
        zzfzp zzfzp = this.f35216j;
        return zzfzp != null && !zzfzp.isDone();
    }
}
