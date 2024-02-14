package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcsw extends zzcl {

    /* renamed from: A */
    private final zzbll f31486A;

    /* renamed from: B */
    private final zzfjw f31487B;

    /* renamed from: C */
    private final zzfey f31488C;

    /* renamed from: D */
    private boolean f31489D = false;

    /* renamed from: a */
    private final Context f31490a;

    /* renamed from: c */
    private final zzcgv f31491c;

    /* renamed from: d */
    private final zzdvl f31492d;

    /* renamed from: f */
    private final zzehe f31493f;

    /* renamed from: g */
    private final zzenc f31494g;

    /* renamed from: o */
    private final zzdzs f31495o;

    /* renamed from: p */
    private final zzceu f31496p;

    /* renamed from: s */
    private final zzdvq f31497s;

    /* renamed from: z */
    private final zzeak f31498z;

    zzcsw(Context context, zzcgv zzcgv, zzdvl zzdvl, zzehe zzehe, zzenc zzenc, zzdzs zzdzs, zzceu zzceu, zzdvq zzdvq, zzeak zzeak, zzbll zzbll, zzfjw zzfjw, zzfey zzfey) {
        this.f31490a = context;
        this.f31491c = zzcgv;
        this.f31492d = zzdvl;
        this.f31493f = zzehe;
        this.f31494g = zzenc;
        this.f31495o = zzdzs;
        this.f31496p = zzceu;
        this.f31497s = zzdvq;
        this.f31498z = zzeak;
        this.f31486A = zzbll;
        this.f31487B = zzfjw;
        this.f31488C = zzfey;
    }

    /* renamed from: C1 */
    public final synchronized void mo19972C1(boolean z) {
        zzt.m2907t().mo20257c(z);
    }

    /* renamed from: F4 */
    public final void mo19966F4(@Nullable String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzcsu zzcsu;
        zzbjc.m43542c(this.f31490a);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27135h3)).booleanValue()) {
            zzt.m2905r();
            str2 = zzs.m2738L(this.f31490a);
        } else {
            str2 = "";
        }
        boolean z = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (!TextUtils.isEmpty(str3)) {
            boolean booleanValue = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27105e3)).booleanValue();
            zzbiu zzbiu = zzbjc.f26907K0;
            boolean booleanValue2 = booleanValue | ((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue();
            if (((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
                zzcsu = new zzcsu(this, (Runnable) ObjectWrapper.m5050A1(iObjectWrapper));
            } else {
                zzcsu = null;
                z = booleanValue2;
            }
            zzcsu zzcsu2 = zzcsu;
            if (z) {
                zzt.m2890c().mo20418a(this.f31490a, this.f31491c, str3, zzcsu2, this.f31487B);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: Jb */
    public final void mo44365Jb(Runnable runnable) {
        Preconditions.m4483f("Adapters must be initialized on the main thread.");
        Map e = zzt.m2904q().mo43494h().mo20365e().mo43480e();
        if (!e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzcgp.m45230h("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.f31492d.mo45018d()) {
                HashMap hashMap = new HashMap();
                for (zzbvf zzbvf : e.values()) {
                    for (zzbve zzbve : zzbvf.f27849a) {
                        String str = zzbve.f27837k;
                        for (String str2 : zzbve.f27829c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzehf a = this.f31493f.mo45300a(str3, jSONObject);
                        if (a != null) {
                            zzffa zzffa = (zzffa) a.f34016b;
                            if (!zzffa.mo45645a() && zzffa.mo45644C()) {
                                zzffa.mo45657m(this.f31490a, (zzeiy) a.f34017c, (List) entry.getValue());
                                zzcgp.m45224b("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzfek e2) {
                        zzcgp.m45230h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e2);
                    }
                }
            }
        }
    }

    /* renamed from: Ya */
    public final synchronized void mo19973Ya(float f) {
        zzt.m2907t().mo20258d(f);
    }

    /* renamed from: Z7 */
    public final void mo19967Z7(zzez zzez) throws RemoteException {
        this.f31496p.mo43445v(this.f31490a, zzez);
    }

    /* renamed from: b */
    public final synchronized float mo19974b() {
        return zzt.m2907t().mo20256a();
    }

    /* renamed from: c */
    public final String mo19975c() {
        return this.f31491c.f28446a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo44366d() {
        zzffh.m50087b(this.f31490a, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        return;
     */
    /* renamed from: e6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19976e6(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = r7.f31490a     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbjc.m43542c(r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27105e3     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0031 }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.ads.internal.zze r1 = com.google.android.gms.ads.internal.zzt.m2890c()     // Catch:{ all -> 0x0031 }
            android.content.Context r2 = r7.f31490a     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzcgv r3 = r7.f31491c     // Catch:{ all -> 0x0031 }
            r5 = 0
            com.google.android.gms.internal.ads.zzfjw r6 = r7.f31487B     // Catch:{ all -> 0x0031 }
            r4 = r8
            r1.mo20418a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0031 }
            monitor-exit(r7)
            return
        L_0x002f:
            monitor-exit(r7)
            return
        L_0x0031:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcsw.mo19976e6(java.lang.String):void");
    }

    /* renamed from: f */
    public final List mo19968f() throws RemoteException {
        return this.f31495o.mo45097g();
    }

    /* renamed from: g */
    public final void mo19977g() {
        this.f31495o.mo45098l();
    }

    /* renamed from: ga */
    public final void mo19969ga(zzbvk zzbvk) throws RemoteException {
        this.f31488C.mo45635e(zzbvk);
    }

    /* renamed from: h */
    public final synchronized void mo19970h() {
        if (this.f31489D) {
            zzcgp.m45229g("Mobile ads is initialized already.");
            return;
        }
        zzbjc.m43542c(this.f31490a);
        zzt.m2904q().mo43501r(this.f31490a, this.f31491c);
        zzt.m2892e().mo42517i(this.f31490a);
        this.f31489D = true;
        this.f31495o.mo45104r();
        this.f31494g.mo45386d();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27115f3)).booleanValue()) {
            this.f31497s.mo45024c();
        }
        this.f31498z.mo45128g();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27004T7)).booleanValue()) {
            zzchc.f28456a.execute(new zzcss(this));
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26825B8)).booleanValue()) {
            zzchc.f28456a.execute(new zzcsr(this));
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27224q2)).booleanValue()) {
            zzchc.f28456a.execute(new zzcst(this));
        }
    }

    /* renamed from: i9 */
    public final void mo19978i9(zzcy zzcy) throws RemoteException {
        this.f31498z.mo45129h(zzcy, zzeaj.API);
    }

    /* renamed from: k3 */
    public final void mo19971k3(zzbrx zzbrx) throws RemoteException {
        this.f31495o.mo45105s(zzbrx);
    }

    /* renamed from: la */
    public final void mo19979la(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzcgp.m45226d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        if (context == null) {
            zzcgp.m45226d("Context is null. Failed to open debug menu.");
            return;
        }
        zzas zzas = new zzas(context);
        zzas.mo20289n(str);
        zzas.mo20290o(this.f31491c.f28446a);
        zzas.mo20293r();
    }

    /* renamed from: r */
    public final synchronized boolean mo19980r() {
        return zzt.m2907t().mo20259e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo44367u() {
        this.f31486A.mo42730a(new zzcak());
    }

    /* renamed from: w0 */
    public final void mo19981w0(String str) {
        this.f31494g.mo45388f(str);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzb() {
        if (zzt.m2904q().mo43494h().mo20358a0()) {
            if (!zzt.m2908u().mo20306j(this.f31490a, zzt.m2904q().mo43494h().mo20375j(), this.f31491c.f28446a)) {
                zzt.m2904q().mo43494h().mo20362c0(false);
                zzt.m2904q().mo43494h().mo20364d0("");
            }
        }
    }
}
