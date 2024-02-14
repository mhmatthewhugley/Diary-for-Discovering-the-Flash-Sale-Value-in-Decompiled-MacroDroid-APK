package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcvk implements zzbbq, zzddv, zzo, zzddu {

    /* renamed from: A */
    private WeakReference f31665A = new WeakReference(this);

    /* renamed from: a */
    private final zzcvf f31666a;

    /* renamed from: c */
    private final zzcvg f31667c;

    /* renamed from: d */
    private final Set f31668d = new HashSet();

    /* renamed from: f */
    private final zzbuw f31669f;

    /* renamed from: g */
    private final Executor f31670g;

    /* renamed from: o */
    private final Clock f31671o;

    /* renamed from: p */
    private final AtomicBoolean f31672p = new AtomicBoolean(false);

    /* renamed from: s */
    private final zzcvj f31673s = new zzcvj();

    /* renamed from: z */
    private boolean f31674z = false;

    public zzcvk(zzbut zzbut, zzcvg zzcvg, Executor executor, zzcvf zzcvf, Clock clock) {
        this.f31666a = zzcvf;
        zzbue zzbue = zzbuh.f27784b;
        this.f31669f = zzbut.mo43002a("google.afma.activeView.handleUpdate", zzbue, zzbue);
        this.f31667c = zzcvg;
        this.f31670g = executor;
        this.f31671o = clock;
    }

    /* renamed from: g */
    private final void m46875g() {
        for (zzcmp f : this.f31668d) {
            this.f31666a.mo44404f(f);
        }
        this.f31666a.mo44403e();
    }

    /* renamed from: O0 */
    public final synchronized void mo42396O0(zzbbp zzbbp) {
        zzcvj zzcvj = this.f31673s;
        zzcvj.f31659a = zzbbp.f26529j;
        zzcvj.f31664f = zzbbp;
        mo44407a();
    }

    /* renamed from: Z8 */
    public final synchronized void mo20216Z8() {
        this.f31673s.f31660b = true;
        mo44407a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44407a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference r0 = r5.f31665A     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r5.f31674z     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f31672p     // Catch:{ all -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.zzcvj r0 = r5.f31673s     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.common.util.Clock r1 = r5.f31671o     // Catch:{ Exception -> 0x0051 }
            long r1 = r1.mo21952c()     // Catch:{ Exception -> 0x0051 }
            r0.f31662d = r1     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcvg r0 = r5.f31667c     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcvj r1 = r5.f31673s     // Catch:{ Exception -> 0x0051 }
            org.json.JSONObject r0 = r0.mo42999c(r1)     // Catch:{ Exception -> 0x0051 }
            java.util.Set r1 = r5.f31668d     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcmp r2 = (com.google.android.gms.internal.ads.zzcmp) r2     // Catch:{ Exception -> 0x0051 }
            java.util.concurrent.Executor r3 = r5.f31670g     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcvi r4 = new com.google.android.gms.internal.ads.zzcvi     // Catch:{ Exception -> 0x0051 }
            r4.<init>(r2, r0)     // Catch:{ Exception -> 0x0051 }
            r3.execute(r4)     // Catch:{ Exception -> 0x0051 }
            goto L_0x002d
        L_0x0044:
            com.google.android.gms.internal.ads.zzbuw r1 = r5.f31669f     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzfzp r0 = r1.mo43006c(r0)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            com.google.android.gms.internal.ads.zzchf.m45245b(r0, r1)     // Catch:{ Exception -> 0x0051 }
            monitor-exit(r5)
            return
        L_0x0051:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            com.google.android.gms.ads.internal.util.zze.m2646l(r1, r0)     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0059:
            monitor-exit(r5)
            return
        L_0x005b:
            r5.mo44410e()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcvk.mo44407a():void");
    }

    /* renamed from: b */
    public final void mo20217b() {
    }

    /* renamed from: c */
    public final synchronized void mo44408c(zzcmp zzcmp) {
        this.f31668d.add(zzcmp);
        this.f31666a.mo44402d(zzcmp);
    }

    /* renamed from: d */
    public final void mo44409d(Object obj) {
        this.f31665A = new WeakReference(obj);
    }

    /* renamed from: e */
    public final synchronized void mo44410e() {
        m46875g();
        this.f31674z = true;
    }

    /* renamed from: f */
    public final synchronized void mo44379f(@Nullable Context context) {
        this.f31673s.f31660b = true;
        mo44407a();
    }

    /* renamed from: j */
    public final synchronized void mo44390j() {
        if (this.f31672p.compareAndSet(false, true)) {
            this.f31666a.mo44401c(this);
            mo44407a();
        }
    }

    /* renamed from: o */
    public final synchronized void mo44380o(@Nullable Context context) {
        this.f31673s.f31663e = "u";
        mo44407a();
        m46875g();
        this.f31674z = true;
    }

    /* renamed from: s */
    public final synchronized void mo44381s(@Nullable Context context) {
        this.f31673s.f31660b = false;
        mo44407a();
    }

    /* renamed from: sb */
    public final void mo20218sb() {
    }

    /* renamed from: t1 */
    public final synchronized void mo20219t1() {
        this.f31673s.f31660b = false;
        mo44407a();
    }

    /* renamed from: y */
    public final void mo20220y(int i) {
    }

    public final void zzb() {
    }
}
