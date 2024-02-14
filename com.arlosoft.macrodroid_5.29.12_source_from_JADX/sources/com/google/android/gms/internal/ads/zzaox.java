package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzay;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaox implements zzapa {
    @Nullable

    /* renamed from: G */
    private static zzaox f25194G;

    /* renamed from: A */
    private final zzaqn f25195A;
    @VisibleForTesting

    /* renamed from: B */
    volatile long f25196B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final Object f25197C = new Object();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public volatile boolean f25198D;

    /* renamed from: E */
    private volatile boolean f25199E = false;

    /* renamed from: F */
    private final int f25200F;

    /* renamed from: a */
    private final Context f25201a;

    /* renamed from: c */
    private final zzfom f25202c;

    /* renamed from: d */
    private final zzfot f25203d;

    /* renamed from: f */
    private final zzfov f25204f;

    /* renamed from: g */
    private final zzapy f25205g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final zzfmx f25206o;

    /* renamed from: p */
    private final Executor f25207p;

    /* renamed from: s */
    private final zzfos f25208s;

    /* renamed from: z */
    private final CountDownLatch f25209z;

    @VisibleForTesting
    zzaox(@NonNull Context context, @NonNull zzfmx zzfmx, @NonNull zzfom zzfom, @NonNull zzfot zzfot, @NonNull zzfov zzfov, @NonNull zzapy zzapy, @NonNull Executor executor, @NonNull zzfms zzfms, int i, @Nullable zzaqn zzaqn) {
        this.f25201a = context;
        this.f25206o = zzfmx;
        this.f25202c = zzfom;
        this.f25203d = zzfot;
        this.f25204f = zzfov;
        this.f25205g = zzapy;
        this.f25207p = executor;
        this.f25200F = i;
        this.f25195A = zzaqn;
        this.f25209z = new CountDownLatch(1);
        this.f25208s = new zzaov(this, zzfms);
    }

    /* renamed from: h */
    public static synchronized zzaox m42007h(@NonNull String str, @NonNull Context context, boolean z, boolean z2) {
        zzaox i;
        synchronized (zzaox.class) {
            i = m42008i(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return i;
    }

    @Deprecated
    /* renamed from: i */
    public static synchronized zzaox m42008i(@NonNull String str, @NonNull Context context, @NonNull Executor executor, boolean z, boolean z2) {
        zzaox zzaox;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (zzaox.class) {
            if (f25194G == null) {
                zzfmy a = zzfmz.m50586a();
                a.mo45986a(str);
                a.mo45988c(z);
                zzfmz d = a.mo45989d();
                zzfmx a2 = zzfmx.m50574a(context2, executor2, z2);
                zzapi c = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26819B2)).booleanValue() ? zzapi.m42077c(context) : null;
                zzaqn d2 = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26829C2)).booleanValue() ? zzaqn.m42148d(context, executor) : null;
                zzfnq e = zzfnq.m50629e(context2, executor2, a2, d);
                zzapx zzapx = new zzapx(context2);
                zzapy zzapy = new zzapy(d, e, new zzaql(context2, zzapx), zzapx, c, d2);
                int b = zzfnz.m50656b(context2, a2);
                zzfms zzfms = new zzfms();
                zzaox zzaox2 = new zzaox(context, a2, new zzfom(context2, b), new zzfot(context2, b, new zzaou(a2), ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26988S1)).booleanValue()), new zzfov(context2, zzapy, a2, zzfms), zzapy, executor, zzfms, b, d2);
                f25194G = zzaox2;
                zzaox2.mo41762n();
                f25194G.mo41763o();
            }
            zzaox = f25194G;
        }
        return zzaox;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.mo41852H().mo41863N().equals(r5.mo41863N()) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.f25206o.mo45983d(2030, java.lang.System.currentTimeMillis() - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        r12 = r12.f25209z;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010a */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m42012m(com.google.android.gms.internal.ads.zzaox r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.zzfol r3 = r12.m42015s(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzary r4 = r3.mo46039a()
            java.lang.String r4 = r4.mo41864O()
            com.google.android.gms.internal.ads.zzary r3 = r3.mo46039a()
            java.lang.String r3 = r3.mo41863N()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001f:
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.f25201a     // Catch:{ zzgrq -> 0x012a }
            r6 = 1
            int r7 = r12.f25200F     // Catch:{ zzgrq -> 0x012a }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.zzfmx r11 = r12.f25206o     // Catch:{ zzgrq -> 0x012a }
            com.google.android.gms.internal.ads.zzfoq r3 = com.google.android.gms.internal.ads.zzfnh.m50621a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ zzgrq -> 0x012a }
            byte[] r4 = r3.f36212c     // Catch:{ zzgrq -> 0x012a }
            if (r4 == 0) goto L_0x0119
            int r5 = r4.length     // Catch:{ zzgrq -> 0x012a }
            if (r5 != 0) goto L_0x0037
            goto L_0x0119
        L_0x0037:
            com.google.android.gms.internal.ads.zzgpw r4 = com.google.android.gms.internal.ads.zzgpw.m52564R(r4)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzgqq r5 = com.google.android.gms.internal.ads.zzgqq.m52900a()     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzarv r4 = com.google.android.gms.internal.ads.zzarv.m42192G(r4, r5)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzary r5 = r4.mo41852H()     // Catch:{ zzgrq -> 0x012a }
            java.lang.String r5 = r5.mo41864O()     // Catch:{ zzgrq -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgrq -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzary r5 = r4.mo41852H()     // Catch:{ zzgrq -> 0x012a }
            java.lang.String r5 = r5.mo41863N()     // Catch:{ zzgrq -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgrq -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzgpw r5 = r4.mo41853I()     // Catch:{ zzgrq -> 0x012a }
            byte[] r5 = r5.mo47109i()     // Catch:{ zzgrq -> 0x012a }
            int r5 = r5.length     // Catch:{ zzgrq -> 0x012a }
            if (r5 != 0) goto L_0x006c
            goto L_0x00fb
        L_0x006c:
            com.google.android.gms.internal.ads.zzfol r5 = r12.m42015s(r2)     // Catch:{ zzgrq -> 0x012a }
            if (r5 != 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.ads.zzary r5 = r5.mo46039a()     // Catch:{ zzgrq -> 0x012a }
            com.google.android.gms.internal.ads.zzary r6 = r4.mo41852H()     // Catch:{ zzgrq -> 0x012a }
            java.lang.String r6 = r6.mo41864O()     // Catch:{ zzgrq -> 0x012a }
            java.lang.String r7 = r5.mo41864O()     // Catch:{ zzgrq -> 0x012a }
            boolean r6 = r6.equals(r7)     // Catch:{ zzgrq -> 0x012a }
            if (r6 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzary r6 = r4.mo41852H()     // Catch:{ zzgrq -> 0x012a }
            java.lang.String r6 = r6.mo41863N()     // Catch:{ zzgrq -> 0x012a }
            java.lang.String r5 = r5.mo41863N()     // Catch:{ zzgrq -> 0x012a }
            boolean r5 = r6.equals(r5)     // Catch:{ zzgrq -> 0x012a }
            if (r5 != 0) goto L_0x00fb
        L_0x009b:
            com.google.android.gms.internal.ads.zzfos r5 = r12.f25208s     // Catch:{ zzgrq -> 0x012a }
            int r3 = r3.f36213d     // Catch:{ zzgrq -> 0x012a }
            com.google.android.gms.internal.ads.zzbiu r6 = com.google.android.gms.internal.ads.zzbjc.f26968Q1     // Catch:{ zzgrq -> 0x012a }
            com.google.android.gms.internal.ads.zzbja r7 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ zzgrq -> 0x012a }
            java.lang.Object r6 = r7.mo42663b(r6)     // Catch:{ zzgrq -> 0x012a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ zzgrq -> 0x012a }
            boolean r6 = r6.booleanValue()     // Catch:{ zzgrq -> 0x012a }
            if (r6 == 0) goto L_0x00c5
            r6 = 3
            if (r3 != r6) goto L_0x00bb
            com.google.android.gms.internal.ads.zzfot r3 = r12.f25203d     // Catch:{ zzgrq -> 0x012a }
            boolean r3 = r3.mo46053a(r4)     // Catch:{ zzgrq -> 0x012a }
            goto L_0x00cb
        L_0x00bb:
            r6 = 4
            if (r3 != r6) goto L_0x00cd
            com.google.android.gms.internal.ads.zzfot r3 = r12.f25203d     // Catch:{ zzgrq -> 0x012a }
            boolean r3 = r3.mo46054b(r4, r5)     // Catch:{ zzgrq -> 0x012a }
            goto L_0x00cb
        L_0x00c5:
            com.google.android.gms.internal.ads.zzfom r3 = r12.f25202c     // Catch:{ zzgrq -> 0x012a }
            boolean r3 = r3.mo46044b(r4, r5)     // Catch:{ zzgrq -> 0x012a }
        L_0x00cb:
            if (r3 != 0) goto L_0x00df
        L_0x00cd:
            com.google.android.gms.internal.ads.zzfmx r2 = r12.f25206o     // Catch:{ zzgrq -> 0x012a }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgrq -> 0x012a }
            long r4 = r4 - r0
            r2.mo45983d(r3, r4)     // Catch:{ zzgrq -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f25209z
        L_0x00db:
            r12.countDown()
            return
        L_0x00df:
            com.google.android.gms.internal.ads.zzfol r3 = r12.m42015s(r2)     // Catch:{ zzgrq -> 0x012a }
            if (r3 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.zzfov r4 = r12.f25204f     // Catch:{ zzgrq -> 0x012a }
            boolean r3 = r4.mo46060c(r3)     // Catch:{ zzgrq -> 0x012a }
            if (r3 == 0) goto L_0x00ef
            r12.f25199E = r2     // Catch:{ zzgrq -> 0x012a }
        L_0x00ef:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ zzgrq -> 0x012a }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.f25196B = r2     // Catch:{ zzgrq -> 0x012a }
        L_0x00f8:
            java.util.concurrent.CountDownLatch r12 = r12.f25209z
            goto L_0x00db
        L_0x00fb:
            com.google.android.gms.internal.ads.zzfmx r2 = r12.f25206o     // Catch:{ zzgrq -> 0x012a }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgrq -> 0x012a }
            long r4 = r4 - r0
            r2.mo45983d(r3, r4)     // Catch:{ zzgrq -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f25209z
            goto L_0x00db
        L_0x010a:
            com.google.android.gms.internal.ads.zzfmx r2 = r12.f25206o     // Catch:{ zzgrq -> 0x012a }
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgrq -> 0x012a }
            long r4 = r4 - r0
            r2.mo45983d(r3, r4)     // Catch:{ zzgrq -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f25209z
            goto L_0x00db
        L_0x0119:
            com.google.android.gms.internal.ads.zzfmx r2 = r12.f25206o     // Catch:{ zzgrq -> 0x012a }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgrq -> 0x012a }
            long r4 = r4 - r0
            r2.mo45983d(r3, r4)     // Catch:{ zzgrq -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f25209z
            goto L_0x00db
        L_0x0128:
            r0 = move-exception
            goto L_0x013a
        L_0x012a:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfmx r3 = r12.f25206o     // Catch:{ all -> 0x0128 }
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0128 }
            long r5 = r5 - r0
            r3.mo45982c(r4, r5, r2)     // Catch:{ all -> 0x0128 }
            java.util.concurrent.CountDownLatch r12 = r12.f25209z
            goto L_0x00db
        L_0x013a:
            java.util.concurrent.CountDownLatch r12 = r12.f25209z
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaox.m42012m(com.google.android.gms.internal.ads.zzaox):void");
    }

    /* renamed from: r */
    private final void m42014r() {
        zzaqn zzaqn = this.f25195A;
        if (zzaqn != null) {
            zzaqn.mo41842h();
        }
    }

    /* renamed from: s */
    private final zzfol m42015s(int i) {
        if (!zzfnz.m50655a(this.f25200F)) {
            return null;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26968Q1)).booleanValue()) {
            return this.f25203d.mo46055c(1);
        }
        return this.f25202c.mo46046d(1);
    }

    /* renamed from: a */
    public final void mo20427a(View view) {
        this.f25205g.mo41798b(view);
    }

    /* renamed from: b */
    public final String mo20428b(Context context) {
        m42014r();
        mo41763o();
        zzfna a = this.f25204f.mo46058a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c = a.mo45995c(context, (String) null);
        this.f25206o.mo45985f(5001, System.currentTimeMillis() - currentTimeMillis, c, (Map) null);
        return c;
    }

    /* renamed from: c */
    public final void mo20429c(int i, int i2, int i3) {
    }

    /* renamed from: d */
    public final void mo20430d(MotionEvent motionEvent) {
        zzfna a = this.f25204f.mo46058a();
        if (a != null) {
            try {
                a.mo45993a((String) null, motionEvent);
            } catch (zzfou e) {
                this.f25206o.mo45982c(e.mo46057a(), -1, e);
            }
        }
    }

    /* renamed from: e */
    public final String mo20431e(Context context, String str, View view) {
        return mo20432f(context, str, view, (Activity) null);
    }

    /* renamed from: f */
    public final String mo20432f(Context context, String str, View view, Activity activity) {
        m42014r();
        mo41763o();
        zzfna a = this.f25204f.mo46058a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d = a.mo45996d(context, (String) null, str, view, activity);
        this.f25206o.mo45985f(SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY, System.currentTimeMillis() - currentTimeMillis, d, (Map) null);
        return d;
    }

    /* renamed from: g */
    public final String mo20433g(Context context, View view, Activity activity) {
        m42014r();
        mo41763o();
        zzfna a = this.f25204f.mo46058a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String b = a.mo45994b(context, (String) null, view, activity);
        this.f25206o.mo45985f(5002, System.currentTimeMillis() - currentTimeMillis, b, (Map) null);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final synchronized void mo41762n() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfol s = m42015s(1);
        if (s == null) {
            this.f25206o.mo45983d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f25204f.mo46060c(s)) {
            this.f25199E = true;
            this.f25209z.countDown();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41763o() {
        /*
            r6 = this;
            boolean r0 = r6.f25198D
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r6.f25197C
            monitor-enter(r0)
            boolean r1 = r6.f25198D     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.f25196B     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzfov r1 = r6.f25204f     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzfol r1 = r1.mo46059b()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.mo46042d(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r6.f25200F     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.zzfnz.m50655a(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.f25207p     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzaow r2 = new com.google.android.gms.internal.ads.zzaow     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaox.mo41763o():void");
    }

    /* renamed from: q */
    public final synchronized boolean mo41764q() {
        return this.f25199E;
    }
}
