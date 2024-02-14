package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdzs {

    /* renamed from: a */
    private boolean f33458a = false;

    /* renamed from: b */
    private boolean f33459b = false;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: c */
    public boolean f33460c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final long f33461d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzchh f33462e = new zzchh();

    /* renamed from: f */
    private final Context f33463f;

    /* renamed from: g */
    private final WeakReference f33464g;

    /* renamed from: h */
    private final zzdvl f33465h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Executor f33466i;

    /* renamed from: j */
    private final Executor f33467j;

    /* renamed from: k */
    private final ScheduledExecutorService f33468k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final zzdxz f33469l;

    /* renamed from: m */
    private final zzcgv f33470m;

    /* renamed from: n */
    private final Map f33471n = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final zzdjr f33472o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final zzfjw f33473p;

    /* renamed from: q */
    private boolean f33474q = true;

    public zzdzs(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdvl zzdvl, ScheduledExecutorService scheduledExecutorService, zzdxz zzdxz, zzcgv zzcgv, zzdjr zzdjr, zzfjw zzfjw) {
        this.f33465h = zzdvl;
        this.f33463f = context;
        this.f33464g = weakReference;
        this.f33466i = executor2;
        this.f33468k = scheduledExecutorService;
        this.f33467j = executor;
        this.f33469l = zzdxz;
        this.f33470m = zzcgv;
        this.f33472o = zzdjr;
        this.f33473p = zzfjw;
        this.f33461d = zzt.m2889b().mo21952c();
        m48462v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* renamed from: j */
    static /* bridge */ /* synthetic */ void m48459j(zzdzs zzdzs, String str) {
        zzdzs zzdzs2 = zzdzs;
        int i = 5;
        zzfjj a = zzfji.m50258a(zzdzs2.f33463f, 5);
        a.mo45794c();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzfjj a2 = zzfji.m50258a(zzdzs2.f33463f, i);
                a2.mo45794c();
                a2.mo45797f0(next);
                Object obj = new Object();
                zzchh zzchh = new zzchh();
                zzfzp o = zzfzg.m51420o(zzchh, ((Long) zzay.m1924c().mo42663b(zzbjc.f26818B1)).longValue(), TimeUnit.SECONDS, zzdzs2.f33468k);
                zzdzs2.f33469l.mo45059c(next);
                zzdzs2.f33472o.mo44673f0(next);
                long c = zzt.m2889b().mo21952c();
                zzdzj zzdzj = r1;
                zzfzp zzfzp = o;
                zzdzj zzdzj2 = new zzdzj(zzdzs, obj, zzchh, next, c, a2);
                zzfzp.mo43580q(zzdzj, zzdzs2.f33466i);
                arrayList.add(zzfzp);
                zzdzr zzdzr = new zzdzr(zzdzs, obj, next, c, a2, zzchh);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbsa(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdzs2.m48462v(next, false, "", 0);
                try {
                    zzdzs2.f33467j.execute(new zzdzn(zzdzs, zzdzs2.f33465h.mo45017c(next, new JSONObject()), zzdzr, arrayList2, next));
                } catch (zzfek unused2) {
                    try {
                        zzdzr.mo42933z("Failed to create Adapter.");
                    } catch (RemoteException e) {
                        zzcgp.m45227e("", e);
                    }
                }
                i = 5;
            }
            zzfzg.m51406a(arrayList).mo46623a(new zzdzk(zzdzs2, a), zzdzs2.f33466i);
        } catch (JSONException e2) {
            zze.m2646l("Malformed CLD response", e2);
            zzdzs2.f33472o.mo44675o("MalformedJson");
            zzdzs2.f33469l.mo45057a("MalformedJson");
            zzdzs2.f33462e.mo43575d(e2);
            zzt.m2904q().mo43503t(e2, "AdapterInitializer.updateAdapterStatus");
            zzfjw zzfjw = zzdzs2.f33473p;
            a.mo45801o0(false);
            zzfjw.mo45831b(a.mo45799h());
        }
    }

    /* renamed from: u */
    private final synchronized zzfzp m48461u() {
        String c = zzt.m2904q().mo43494h().mo20365e().mo43478c();
        if (!TextUtils.isEmpty(c)) {
            return zzfzg.m51414i(c);
        }
        zzchh zzchh = new zzchh();
        zzt.m2904q().mo43494h().mo20368f0(new zzdzo(this, zzchh));
        return zzchh;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m48462v(String str, boolean z, String str2, int i) {
        this.f33471n.put(str, new zzbrq(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Object mo45096f(zzfjj zzfjj) throws Exception {
        this.f33462e.mo43574c(Boolean.TRUE);
        zzfjw zzfjw = this.f33473p;
        zzfjj.mo45801o0(true);
        zzfjw.mo45831b(zzfjj.mo45799h());
        return null;
    }

    /* renamed from: g */
    public final List mo45097g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f33471n.keySet()) {
            zzbrq zzbrq = (zzbrq) this.f33471n.get(str);
            arrayList.add(new zzbrq(str, zzbrq.f27691c, zzbrq.f27692d, zzbrq.f27693f));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void mo45098l() {
        this.f33474q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo45099m() {
        synchronized (this) {
            if (!this.f33460c) {
                m48462v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.m2889b().mo21952c() - this.f33461d));
                this.f33469l.mo45058b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f33472o.mo44676q("com.google.android.gms.ads.MobileAds", "timeout");
                this.f33462e.mo43575d(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        com.google.android.gms.internal.ads.zzcgp.m45227e("", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.mo42933z("Failed to initialize adapter. " + r5 + " does not implement the initialize() method.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo45100n(com.google.android.gms.internal.ads.zzffa r2, com.google.android.gms.internal.ads.zzbru r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f33464g     // Catch:{ zzfek -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ zzfek -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ zzfek -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.f33463f     // Catch:{ zzfek -> 0x0011 }
        L_0x000d:
            r2.mo45656l(r0, r3, r4)     // Catch:{ zzfek -> 0x0011 }
            return
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x002b }
            r2.<init>()     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = "Failed to initialize adapter. "
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            r2.append(r5)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = " does not implement the initialize() method."
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r2 = r2.toString()     // Catch:{ RemoteException -> 0x002b }
            r3.mo42933z(r2)     // Catch:{ RemoteException -> 0x002b }
            return
        L_0x002b:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.zzcgp.m45227e(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzs.mo45100n(com.google.android.gms.internal.ads.zzffa, com.google.android.gms.internal.ads.zzbru, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo45101o(zzchh zzchh) {
        this.f33466i.execute(new zzdzh(this, zzchh));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo45102p() {
        this.f33469l.mo45061e();
        this.f33472o.mo44671b();
        this.f33459b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo45103q(Object obj, zzchh zzchh, String str, long j, zzfjj zzfjj) {
        synchronized (obj) {
            if (!zzchh.isDone()) {
                m48462v(str, false, "Timeout.", (int) (zzt.m2889b().mo21952c() - j));
                this.f33469l.mo45058b(str, "timeout");
                this.f33472o.mo44676q(str, "timeout");
                zzfjw zzfjw = this.f33473p;
                zzfjj.mo45801o0(false);
                zzfjw.mo45831b(zzfjj.mo45799h());
                zzchh.mo43574c(Boolean.FALSE);
            }
        }
    }

    /* renamed from: r */
    public final void mo45104r() {
        if (!((Boolean) zzbkx.f27472a.mo42728e()).booleanValue()) {
            if (this.f33470m.f28448d >= ((Integer) zzay.m1924c().mo42663b(zzbjc.f26808A1)).intValue() && this.f33474q) {
                if (!this.f33458a) {
                    synchronized (this) {
                        if (!this.f33458a) {
                            this.f33469l.mo45062f();
                            this.f33472o.mo44672c();
                            this.f33462e.mo43580q(new zzdzi(this), this.f33466i);
                            this.f33458a = true;
                            zzfzp u = m48461u();
                            this.f33468k.schedule(new zzdzl(this), ((Long) zzay.m1924c().mo42663b(zzbjc.f26828C1)).longValue(), TimeUnit.SECONDS);
                            zzfzg.m51423r(u, new zzdzq(this), this.f33466i);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.f33458a) {
            m48462v("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.f33462e.mo43574c(Boolean.FALSE);
            this.f33458a = true;
            this.f33459b = true;
        }
    }

    /* renamed from: s */
    public final void mo45105s(zzbrx zzbrx) {
        this.f33462e.mo43580q(new zzdzm(this, zzbrx), this.f33467j);
    }

    /* renamed from: t */
    public final boolean mo45106t() {
        return this.f33459b;
    }
}
