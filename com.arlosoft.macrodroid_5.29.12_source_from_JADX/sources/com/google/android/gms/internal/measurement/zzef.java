package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public final class zzef {

    /* renamed from: j */
    private static volatile zzef f41426j;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f41427a;

    /* renamed from: b */
    protected final Clock f41428b;

    /* renamed from: c */
    protected final ExecutorService f41429c;

    /* renamed from: d */
    private final AppMeasurementSdk f41430d;
    @GuardedBy("listenerList")

    /* renamed from: e */
    private final List f41431e;

    /* renamed from: f */
    private int f41432f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f41433g;

    /* renamed from: h */
    private final String f41434h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile zzcc f41435i;

    protected zzef(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m59628n(str2, str3)) {
            this.f41427a = "FA";
        } else {
            this.f41427a = str;
        }
        this.f41428b = DefaultClock.m4871d();
        zzbx.m59541a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzdi(this));
        boolean z = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f41429c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f41430d = new AppMeasurementSdk(this);
        this.f41431e = new ArrayList();
        try {
            if (zzid.m65899c(context, "google_app_id", zzfj.m65653a(context)) != null && !mo50867j()) {
                this.f41434h = null;
                this.f41433g = true;
                Log.w(this.f41427a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m59628n(str2, str3)) {
            this.f41434h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.f41427a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.f41434h = str2;
        }
        m59627m(new zzcx(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f41427a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzee(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m59625k(Exception exc, boolean z, boolean z2) {
        this.f41433g |= z;
        if (z) {
            Log.w(this.f41427a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo50860a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f41427a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: l */
    private final void m59626l(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m59627m(new zzds(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m59627m(zzdu zzdu) {
        this.f41429c.execute(zzdu);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m59628n(String str, String str2) {
        return (str2 == null || str == null || mo50867j()) ? false : true;
    }

    /* renamed from: u */
    public static zzef m59630u(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.m4488k(context);
        if (f41426j == null) {
            synchronized (zzef.class) {
                if (f41426j == null) {
                    f41426j = new zzef(context, str, str2, str3, bundle);
                }
            }
        }
        return f41426j;
    }

    /* renamed from: A */
    public final String mo50850A() {
        zzbz zzbz = new zzbz();
        m59627m(new zzde(this, zzbz));
        return zzbz.mo50778g8(500);
    }

    /* renamed from: B */
    public final String mo50851B() {
        zzbz zzbz = new zzbz();
        m59627m(new zzdd(this, zzbz));
        return zzbz.mo50778g8(500);
    }

    /* renamed from: C */
    public final String mo50852C() {
        zzbz zzbz = new zzbz();
        m59627m(new zzda(this, zzbz));
        return zzbz.mo50778g8(500);
    }

    /* renamed from: D */
    public final List mo50853D(String str, String str2) {
        zzbz zzbz = new zzbz();
        m59627m(new zzcp(this, str, str2, zzbz));
        List list = (List) zzbz.m59542Z8(zzbz.mo50780t1(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: E */
    public final Map mo50854E(String str, String str2, boolean z) {
        zzbz zzbz = new zzbz();
        m59627m(new zzdf(this, str, str2, z, zzbz));
        Bundle t1 = zzbz.mo50780t1(5000);
        if (t1 == null || t1.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(t1.size());
        for (String str3 : t1.keySet()) {
            Object obj = t1.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: I */
    public final void mo50855I(String str) {
        m59627m(new zzcy(this, str));
    }

    /* renamed from: J */
    public final void mo50856J(String str, String str2, Bundle bundle) {
        m59627m(new zzco(this, str, str2, bundle));
    }

    /* renamed from: K */
    public final void mo50857K(String str) {
        m59627m(new zzcz(this, str));
    }

    /* renamed from: L */
    public final void mo50858L(@NonNull String str, Bundle bundle) {
        m59626l((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: M */
    public final void mo50859M(String str, String str2, Bundle bundle) {
        m59626l(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    public final void mo50860a(int i, String str, Object obj, Object obj2, Object obj3) {
        m59627m(new zzdg(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r4.f41435i == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.f41435i.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        android.util.Log.w(r4.f41427a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        m59627m(new com.google.android.gms.internal.measurement.zzdq(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50861b(com.google.android.gms.measurement.internal.zzgs r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.m4488k(r5)
            java.util.List r0 = r4.f41431e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r4.f41431e     // Catch:{ all -> 0x0055 }
            int r2 = r2.size()     // Catch:{ all -> 0x0055 }
            if (r1 >= r2) goto L_0x002b
            java.util.List r2 = r4.f41431e     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0055 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0055 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0028
            java.lang.String r5 = r4.f41427a     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            com.google.android.gms.internal.measurement.zzdw r1 = new com.google.android.gms.internal.measurement.zzdw     // Catch:{ all -> 0x0055 }
            r1.<init>(r5)     // Catch:{ all -> 0x0055 }
            java.util.List r2 = r4.f41431e     // Catch:{ all -> 0x0055 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0055 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0055 }
            r2.add(r3)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            com.google.android.gms.internal.measurement.zzcc r5 = r4.f41435i
            if (r5 == 0) goto L_0x004c
            com.google.android.gms.internal.measurement.zzcc r5 = r4.f41435i     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            return
        L_0x0045:
            java.lang.String r5 = r4.f41427a
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r5, r0)
        L_0x004c:
            com.google.android.gms.internal.measurement.zzdq r5 = new com.google.android.gms.internal.measurement.zzdq
            r5.<init>(r4, r1)
            r4.m59627m(r5)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzef.mo50861b(com.google.android.gms.measurement.internal.zzgs):void");
    }

    /* renamed from: c */
    public final void mo50862c(Bundle bundle) {
        m59627m(new zzcn(this, bundle));
    }

    /* renamed from: d */
    public final void mo50863d(Bundle bundle) {
        m59627m(new zzct(this, bundle));
    }

    /* renamed from: e */
    public final void mo50864e(Activity activity, String str, String str2) {
        m59627m(new zzcr(this, activity, str, str2));
    }

    /* renamed from: f */
    public final void mo50865f(boolean z) {
        m59627m(new zzdn(this, z));
    }

    /* renamed from: g */
    public final void mo50866g(String str, String str2, Object obj, boolean z) {
        m59627m(new zzdt(this, str, str2, obj, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo50867j() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzef.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public final int mo50868o(String str) {
        zzbz zzbz = new zzbz();
        m59627m(new zzdj(this, str, zzbz));
        Integer num = (Integer) zzbz.m59542Z8(zzbz.mo50780t1(WorkRequest.MIN_BACKOFF_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: p */
    public final long mo50869p() {
        zzbz zzbz = new zzbz();
        m59627m(new zzdc(this, zzbz));
        Long A1 = zzbz.mo50777A1(500);
        if (A1 != null) {
            return A1.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f41428b.mo21950a()).nextLong();
        int i = this.f41432f + 1;
        this.f41432f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: q */
    public final Bundle mo50870q(Bundle bundle, boolean z) {
        zzbz zzbz = new zzbz();
        m59627m(new zzdh(this, bundle, zzbz));
        if (z) {
            return zzbz.mo50780t1(5000);
        }
        return null;
    }

    /* renamed from: r */
    public final AppMeasurementSdk mo50871r() {
        return this.f41430d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final zzcc mo50872t(Context context, boolean z) {
        try {
            return zzcb.asInterface(DynamiteModule.m5096e(context, DynamiteModule.f4043e, ModuleDescriptor.MODULE_ID).mo22054d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m59625k(e, true, false);
            return null;
        }
    }

    @WorkerThread
    /* renamed from: v */
    public final Long mo50873v() {
        zzbz zzbz = new zzbz();
        m59627m(new zzdl(this, zzbz));
        return zzbz.mo50777A1(120000);
    }

    /* renamed from: x */
    public final String mo50874x() {
        return this.f41434h;
    }

    @WorkerThread
    /* renamed from: y */
    public final String mo50875y() {
        zzbz zzbz = new zzbz();
        m59627m(new zzdk(this, zzbz));
        return zzbz.mo50778g8(120000);
    }

    /* renamed from: z */
    public final String mo50876z() {
        zzbz zzbz = new zzbz();
        m59627m(new zzdb(this, zzbz));
        return zzbz.mo50778g8(50);
    }
}
