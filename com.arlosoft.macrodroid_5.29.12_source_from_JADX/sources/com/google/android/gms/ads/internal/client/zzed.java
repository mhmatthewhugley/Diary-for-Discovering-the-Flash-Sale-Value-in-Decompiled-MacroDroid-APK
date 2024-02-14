package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzcgp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzed {

    /* renamed from: i */
    private static zzed f1940i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f1941a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ArrayList f1942b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f1943c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f1944d = false;

    /* renamed from: e */
    private final Object f1945e = new Object();

    /* renamed from: f */
    private zzcm f1946f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public OnAdInspectorClosedListener f1947g = null;
    @NonNull

    /* renamed from: h */
    private RequestConfiguration f1948h = new RequestConfiguration.Builder().mo19741a();

    private zzed() {
    }

    /* renamed from: e */
    public static zzed m2259e() {
        zzed zzed;
        synchronized (zzed.class) {
            if (f1940i == null) {
                f1940i = new zzed();
            }
            zzed = f1940i;
        }
        return zzed;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static InitializationStatus m2264m(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbrq zzbrq = (zzbrq) it.next();
            hashMap.put(zzbrq.f27690a, new zzbry(zzbrq.f27691c ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbrq.f27693f, zzbrq.f27692d));
        }
        return new zzbrz(hashMap);
    }

    /* renamed from: n */
    private final void m2265n(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        try {
            zzbvd.m44190a().mo43027b(context, (String) null);
            this.f1946f.mo19970h();
            this.f1946f.mo19966F4((String) null, ObjectWrapper.m5051g8(null));
        } catch (RemoteException e) {
            zzcgp.m45230h("MobileAdsSettingManager initialization failed", e);
        }
    }

    /* renamed from: o */
    private final void m2266o(Context context) {
        if (this.f1946f == null) {
            this.f1946f = (zzcm) new zzao(zzaw.m1916a(), context).mo19884d(context, false);
        }
    }

    /* renamed from: p */
    private final void m2267p(@NonNull RequestConfiguration requestConfiguration) {
        try {
            this.f1946f.mo19967Z7(new zzez(requestConfiguration));
        } catch (RemoteException e) {
            zzcgp.m45227e("Unable to set request configuration parcel.", e);
        }
    }

    @NonNull
    /* renamed from: b */
    public final RequestConfiguration mo20077b() {
        return this.f1948h;
    }

    /* renamed from: d */
    public final InitializationStatus mo20078d() {
        InitializationStatus m;
        synchronized (this.f1945e) {
            Preconditions.m4494q(this.f1946f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                m = m2264m(this.f1946f.mo19968f());
            } catch (RemoteException unused) {
                zzcgp.m45226d("Unable to get Initialization status.");
                return new zzdv(this);
            }
        }
        return m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r4 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r5 = r3.f1945e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        m2266o(r4);
        r3.f1946f.mo19971k3(new com.google.android.gms.ads.internal.client.zzec(r3, (com.google.android.gms.ads.internal.client.zzeb) null));
        r3.f1946f.mo19969ga(new com.google.android.gms.internal.ads.zzbvh());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r3.f1948h.mo19738b() != -1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r3.f1948h.mo19739c() == -1) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        m2267p(r3.f1948h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        com.google.android.gms.internal.ads.zzcgp.m45230h("MobileAdsSettingManager initialization failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        throw new java.lang.IllegalArgumentException("Context cannot be null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20079j(android.content.Context r4, java.lang.String r5, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r6) {
        /*
            r3 = this;
            java.lang.Object r5 = r3.f1941a
            monitor-enter(r5)
            boolean r0 = r3.f1943c     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0010
            if (r6 == 0) goto L_0x000e
            java.util.ArrayList r4 = r3.f1942b     // Catch:{ all -> 0x00d8 }
            r4.add(r6)     // Catch:{ all -> 0x00d8 }
        L_0x000e:
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            return
        L_0x0010:
            boolean r0 = r3.f1944d     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x001f
            if (r6 == 0) goto L_0x001d
            com.google.android.gms.ads.initialization.InitializationStatus r4 = r3.mo20078d()     // Catch:{ all -> 0x00d8 }
            r6.mo19853a(r4)     // Catch:{ all -> 0x00d8 }
        L_0x001d:
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            return
        L_0x001f:
            r0 = 1
            r3.f1943c = r0     // Catch:{ all -> 0x00d8 }
            if (r6 == 0) goto L_0x0029
            java.util.ArrayList r0 = r3.f1942b     // Catch:{ all -> 0x00d8 }
            r0.add(r6)     // Catch:{ all -> 0x00d8 }
        L_0x0029:
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x00d0
            java.lang.Object r5 = r3.f1945e
            monitor-enter(r5)
            r0 = 0
            r3.m2266o(r4)     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.ads.internal.client.zzcm r1 = r3.f1946f     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.ads.internal.client.zzec r2 = new com.google.android.gms.ads.internal.client.zzec     // Catch:{ RemoteException -> 0x0060 }
            r2.<init>(r3, r0)     // Catch:{ RemoteException -> 0x0060 }
            r1.mo19971k3(r2)     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.ads.internal.client.zzcm r1 = r3.f1946f     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.internal.ads.zzbvh r2 = new com.google.android.gms.internal.ads.zzbvh     // Catch:{ RemoteException -> 0x0060 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0060 }
            r1.mo19969ga(r2)     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.ads.RequestConfiguration r1 = r3.f1948h     // Catch:{ RemoteException -> 0x0060 }
            int r1 = r1.mo19738b()     // Catch:{ RemoteException -> 0x0060 }
            r2 = -1
            if (r1 != r2) goto L_0x0058
            com.google.android.gms.ads.RequestConfiguration r1 = r3.f1948h     // Catch:{ RemoteException -> 0x0060 }
            int r1 = r1.mo19739c()     // Catch:{ RemoteException -> 0x0060 }
            if (r1 == r2) goto L_0x0066
        L_0x0058:
            com.google.android.gms.ads.RequestConfiguration r1 = r3.f1948h     // Catch:{ RemoteException -> 0x0060 }
            r3.m2267p(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0066
        L_0x005e:
            r4 = move-exception
            goto L_0x00ce
        L_0x0060:
            r1 = move-exception
            java.lang.String r2 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.internal.ads.zzcgp.m45230h(r2, r1)     // Catch:{ all -> 0x005e }
        L_0x0066:
            com.google.android.gms.internal.ads.zzbjc.m43542c(r4)     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzbke r1 = com.google.android.gms.internal.ads.zzbkq.f27440a     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r1.mo42728e()     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26925L8     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = "Initializing on bg thread"
            com.google.android.gms.internal.ads.zzcgp.m45224b(r1)     // Catch:{ all -> 0x005e }
            java.util.concurrent.ThreadPoolExecutor r1 = com.google.android.gms.internal.ads.zzcge.f28417a     // Catch:{ all -> 0x005e }
            com.google.android.gms.ads.internal.client.zzdw r2 = new com.google.android.gms.ads.internal.client.zzdw     // Catch:{ all -> 0x005e }
            r2.<init>(r3, r4, r0, r6)     // Catch:{ all -> 0x005e }
            r1.execute(r2)     // Catch:{ all -> 0x005e }
            goto L_0x00cc
        L_0x0099:
            com.google.android.gms.internal.ads.zzbke r1 = com.google.android.gms.internal.ads.zzbkq.f27441b     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r1.mo42728e()     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26925L8     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x00c4
            java.util.concurrent.ExecutorService r1 = com.google.android.gms.internal.ads.zzcge.f28418b     // Catch:{ all -> 0x005e }
            com.google.android.gms.ads.internal.client.zzdx r2 = new com.google.android.gms.ads.internal.client.zzdx     // Catch:{ all -> 0x005e }
            r2.<init>(r3, r4, r0, r6)     // Catch:{ all -> 0x005e }
            r1.execute(r2)     // Catch:{ all -> 0x005e }
            goto L_0x00cc
        L_0x00c4:
            java.lang.String r1 = "Initializing on calling thread"
            com.google.android.gms.internal.ads.zzcgp.m45224b(r1)     // Catch:{ all -> 0x005e }
            r3.m2265n(r4, r0, r6)     // Catch:{ all -> 0x005e }
        L_0x00cc:
            monitor-exit(r5)     // Catch:{ all -> 0x005e }
            return
        L_0x00ce:
            monitor-exit(r5)     // Catch:{ all -> 0x005e }
            throw r4
        L_0x00d0:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Context cannot be null."
            r4.<init>(r5)
            throw r4
        L_0x00d8:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzed.mo20079j(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo20080k(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.f1945e) {
            m2265n(context, (String) null, onInitializationCompleteListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo20081l(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.f1945e) {
            m2265n(context, (String) null, onInitializationCompleteListener);
        }
    }
}
