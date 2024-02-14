package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzceu {

    /* renamed from: a */
    private final AtomicReference f28314a = new AtomicReference((Object) null);

    /* renamed from: b */
    private final Object f28315b = new Object();
    @Nullable

    /* renamed from: c */
    private String f28316c = null;
    @Nullable

    /* renamed from: d */
    private String f28317d = null;
    @VisibleForTesting

    /* renamed from: e */
    final AtomicBoolean f28318e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicInteger f28319f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference f28320g = new AtomicReference((Object) null);

    /* renamed from: h */
    private final AtomicReference f28321h = new AtomicReference((Object) null);

    /* renamed from: i */
    private final ConcurrentMap f28322i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference f28323j = new AtomicReference((Object) null);

    /* renamed from: k */
    private final BlockingQueue f28324k = new ArrayBlockingQueue(20);

    /* renamed from: l */
    private final Object f28325l = new Object();

    @VisibleForTesting
    /* renamed from: A */
    static final boolean m45023A(Context context) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27112f0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m5094a(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzay.m1924c().mo42663b(zzbjc.f27122g0)).intValue()) {
            return false;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27132h0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* renamed from: B */
    private final Object m45024B(String str, @Nullable Object obj, zzces zzces) {
        synchronized (this.f28323j) {
            if (((zzcog) this.f28323j.get()) != null) {
                try {
                    Object a = zzces.mo43424a((zzcog) this.f28323j.get());
                    return a;
                } catch (Exception unused) {
                    m45030c(str, false);
                    return obj;
                }
            }
        }
    }

    @Nullable
    /* renamed from: C */
    private final Object m45025C(String str, Context context) {
        if (!m45032e(context, "com.google.android.gms.measurement.AppMeasurement", this.f28320g, true)) {
            return null;
        }
        try {
            return m45026D(context, str).invoke(this.f28320g.get(), new Object[0]);
        } catch (Exception unused) {
            m45030c(str, true);
            return null;
        }
    }

    @Nullable
    /* renamed from: D */
    private final Method m45026D(Context context, String str) {
        Method method = (Method) this.f28322i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f28322i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m45030c(str, false);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService m45027E() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r9.f28314a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0065
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.m4857a()
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzfpv r0 = com.google.android.gms.internal.ads.zzfpy.m50764a()
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f27102e0
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r1 = r2.mo42663b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.android.gms.internal.ads.zzcer r2 = new com.google.android.gms.internal.ads.zzcer
            r2.<init>(r9)
            r3 = 2
            java.util.concurrent.ExecutorService r0 = r0.mo46075b(r1, r2, r3)
            goto L_0x005f
        L_0x002d:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f27102e0
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r2 = r2.mo42663b(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r1 = r3.mo42663b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            com.google.android.gms.internal.ads.zzcer r8 = new com.google.android.gms.internal.ads.zzcer
            r8.<init>(r9)
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x005f:
            java.util.concurrent.atomic.AtomicReference r1 = r9.f28314a
            r2 = 0
            com.google.android.gms.internal.ads.zzced.m45010a(r1, r2, r0)
        L_0x0065:
            java.util.concurrent.atomic.AtomicReference r0 = r9.f28314a
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceu.m45027E():java.util.concurrent.ExecutorService");
    }

    /* renamed from: a */
    private final void m45028a(Context context, String str, String str2) {
        if (m45032e(context, "com.google.android.gms.measurement.AppMeasurement", this.f28320g, true)) {
            Method method = (Method) this.f28322i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, new Class[]{String.class});
                    this.f28322i.put(str2, method);
                } catch (Exception unused) {
                    m45030c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f28320g.get(), new Object[]{str});
                zze.m2645k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                m45030c(str2, false);
            }
        }
    }

    /* renamed from: b */
    private final void m45029b(Context context, String str, String str2, @Nullable Bundle bundle) {
        Class<String> cls = String.class;
        if (mo43449z(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                zzcgp.m45227e("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m45023A(context)) {
                m45031d("logEventInternal", new zzceg(str, bundle2));
            } else if (m45032e(context, "com.google.android.gms.measurement.AppMeasurement", this.f28320g, true)) {
                Method method = (Method) this.f28322i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{cls, cls, Bundle.class});
                        this.f28322i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        m45030c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f28320g.get(), new Object[]{"am", str, bundle2});
                } catch (Exception unused2) {
                    m45030c("logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m45030c(String str, boolean z) {
        if (!this.f28318e.get()) {
            zzcgp.m45229g("Invoke Firebase method " + str + " error.");
            if (z) {
                zzcgp.m45229g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f28318e.set(true);
            }
        }
    }

    /* renamed from: d */
    private final void m45031d(String str, zzcet zzcet) {
        synchronized (this.f28323j) {
            FutureTask futureTask = new FutureTask(new zzceh(this, zzcet, str), (Object) null);
            if (this.f28323j.get() != null) {
                futureTask.run();
            } else {
                this.f28324k.offer(futureTask);
            }
        }
    }

    /* renamed from: e */
    private final boolean m45032e(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                zzced.m45010a(atomicReference, (Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception unused) {
                m45030c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: f */
    public final String mo43429f(Context context) {
        if (!mo43449z(context)) {
            return null;
        }
        if (m45023A(context)) {
            Long l = (Long) m45024B("getAdEventId", (Object) null, zzcei.f28302a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object C = m45025C("generateEventId", context);
        if (C != null) {
            return C.toString();
        }
        return null;
    }

    @Nullable
    /* renamed from: g */
    public final String mo43430g(Context context) {
        if (!mo43449z(context)) {
            return null;
        }
        synchronized (this.f28315b) {
            String str = this.f28317d;
            if (str != null) {
                return str;
            }
            if (m45023A(context)) {
                this.f28317d = (String) m45024B("getAppIdOrigin", this.f28317d, zzcem.f28307a);
            } else {
                this.f28317d = "fa";
            }
            String str2 = this.f28317d;
            return str2;
        }
    }

    @Nullable
    /* renamed from: h */
    public final String mo43431h(Context context) {
        if (!mo43449z(context)) {
            return null;
        }
        long longValue = ((Long) zzay.m1924c().mo42663b(zzbjc.f27092d0)).longValue();
        if (m45023A(context)) {
            if (longValue >= 0) {
                return (String) m45027E().submit(new zzceo(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) m45024B("getAppInstanceId", (Object) null, zzcen.f28308a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) m45025C("getAppInstanceId", context);
        } else {
            try {
                return (String) m45027E().submit(new zzcep(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo43432i(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.mo43449z(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = m45023A(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzcej r7 = com.google.android.gms.internal.ads.zzcej.f28303a
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.m45024B(r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference r1 = r6.f28320g
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.m45032e(r7, r4, r1, r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.m45026D(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference r4 = r6.f28320g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.m45026D(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference r3 = r6.f28320g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r6.m45030c(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceu.mo43432i(android.content.Context):java.lang.String");
    }

    @Nullable
    /* renamed from: j */
    public final String mo43433j(Context context) {
        if (!mo43449z(context)) {
            return null;
        }
        synchronized (this.f28315b) {
            String str = this.f28316c;
            if (str != null) {
                return str;
            }
            if (m45023A(context)) {
                this.f28316c = (String) m45024B("getGmpAppId", this.f28316c, zzcef.f28296a);
            } else {
                this.f28316c = (String) m45025C("getGmpAppId", context);
            }
            String str2 = this.f28316c;
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ String mo43434k() throws Exception {
        return (String) m45024B("getAppInstanceId", (Object) null, zzcen.f28308a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ String mo43435l(Context context) throws Exception {
        return (String) m45025C("getAppInstanceId", context);
    }

    /* renamed from: m */
    public final void mo43436m(Context context, String str) {
        if (mo43449z(context)) {
            if (m45023A(context)) {
                m45031d("beginAdUnitExposure", new zzcee(str));
            } else {
                m45028a(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: n */
    public final void mo43437n(Context context, String str) {
        if (mo43449z(context)) {
            if (m45023A(context)) {
                m45031d("endAdUnitExposure", new zzcel(str));
            } else {
                m45028a(context, str, "endAdUnitExposure");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo43438o(zzcet zzcet, String str) {
        if (((zzcog) this.f28323j.get()) != null) {
            try {
                zzcet.mo43423a((zzcog) this.f28323j.get());
            } catch (Exception unused) {
                m45030c(str, false);
            }
        }
    }

    /* renamed from: p */
    public final void mo43439p(Context context, String str) {
        m45029b(context, "_aa", str, (Bundle) null);
    }

    /* renamed from: q */
    public final void mo43440q(Context context, String str) {
        m45029b(context, "_aq", str, (Bundle) null);
    }

    /* renamed from: r */
    public final void mo43441r(Context context, String str) {
        m45029b(context, "_ac", str, (Bundle) null);
    }

    /* renamed from: s */
    public final void mo43442s(Context context, String str) {
        m45029b(context, "_ai", str, (Bundle) null);
    }

    /* renamed from: t */
    public final void mo43443t(Context context, String str, String str2, String str3, int i) {
        if (mo43449z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            m45029b(context, "_ar", str, bundle);
            zze.m2645k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    /* renamed from: u */
    public final void mo43444u(Context context, zzl zzl) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27162k0)).booleanValue() && mo43449z(context) && m45023A(context)) {
            synchronized (this.f28325l) {
            }
        }
    }

    /* renamed from: v */
    public final void mo43445v(Context context, zzez zzez) {
        zzcev.m45054d(context).mo43419b().mo43410d(zzez);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27162k0)).booleanValue() && mo43449z(context) && m45023A(context)) {
            synchronized (this.f28325l) {
            }
        }
    }

    /* renamed from: w */
    public final void mo43446w(Bundle bundle) {
        m45031d("setConsent", new zzceq(bundle));
    }

    @Deprecated
    /* renamed from: x */
    public final void mo43447x(Context context, String str) {
        Class<String> cls = String.class;
        if (!mo43449z(context) || !(context instanceof Activity)) {
            return;
        }
        if (m45023A(context)) {
            m45031d("setScreenName", new zzcek(context, str));
        } else if (m45032e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f28321h, false)) {
            Method method = (Method) this.f28322i.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, cls, cls});
                    this.f28322i.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    m45030c("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f28321h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception unused2) {
                m45030c("setCurrentScreen", false);
            }
        }
    }

    /* renamed from: y */
    public final boolean mo43448y() {
        synchronized (this.f28325l) {
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo43449z(Context context) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27043Y)).booleanValue() && !this.f28318e.get()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27142i0)).booleanValue()) {
                return true;
            }
            if (this.f28319f.get() == -1) {
                zzaw.m1917b();
                if (!zzcgi.m45182r(context, GooglePlayServicesUtilLight.f3065a)) {
                    zzaw.m1917b();
                    if (zzcgi.m45183s(context)) {
                        zzcgp.m45229g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f28319f.set(0);
                    }
                }
                this.f28319f.set(1);
            }
            if (this.f28319f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
