package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzag extends zzgk {

    /* renamed from: b */
    private Boolean f46420b;

    /* renamed from: c */
    private zzaf f46421c = zzae.f46419a;

    /* renamed from: d */
    private Boolean f46422d;

    zzag(zzfr zzfr) {
        super(zzfr);
    }

    /* renamed from: I */
    public static final long m65356I() {
        return ((Long) zzdu.f46604e.mo55037a((Object) null)).longValue();
    }

    /* renamed from: f */
    public static final long m65357f() {
        return ((Long) zzdu.f46574E.mo55037a((Object) null)).longValue();
    }

    /* renamed from: g */
    private final String m65358g(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            Preconditions.m4488k(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f46899a.mo55221z().mo55098p().mo55092b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    @WorkerThread
    /* renamed from: A */
    public final boolean mo54919A(String str, zzdt zzdt) {
        if (str == null) {
            return ((Boolean) zzdt.mo55037a((Object) null)).booleanValue();
        }
        String b = this.f46421c.mo54918b(str, zzdt.mo55038b());
        if (TextUtils.isEmpty(b)) {
            return ((Boolean) zzdt.mo55037a((Object) null)).booleanValue();
        }
        return ((Boolean) zzdt.mo55037a(Boolean.valueOf("1".equals(b)))).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo54920C(String str) {
        return "1".equals(this.f46421c.mo54918b(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo54921D() {
        Boolean r = mo54935r("google_analytics_automatic_screen_reporting_enabled");
        return r == null || r.booleanValue();
    }

    /* renamed from: E */
    public final boolean mo54922E() {
        this.f46899a.mo55207h();
        Boolean r = mo54935r("firebase_analytics_collection_deactivated");
        return r != null && r.booleanValue();
    }

    /* renamed from: F */
    public final boolean mo54923F(String str) {
        return "1".equals(this.f46421c.mo54918b(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: G */
    public final boolean mo54924G() {
        if (this.f46420b == null) {
            Boolean r = mo54935r("app_measurement_lite");
            this.f46420b = r;
            if (r == null) {
                this.f46420b = Boolean.FALSE;
            }
        }
        return this.f46420b.booleanValue() || !this.f46899a.mo55216q();
    }

    /* renamed from: H */
    public final boolean mo54925H() {
        if (this.f46422d == null) {
            synchronized (this) {
                if (this.f46422d == null) {
                    ApplicationInfo applicationInfo = this.f46899a.mo55202c().getApplicationInfo();
                    String a = ProcessUtils.m4909a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f46422d = Boolean.valueOf(z);
                    }
                    if (this.f46422d == null) {
                        this.f46422d = Boolean.TRUE;
                        this.f46899a.mo55221z().mo55098p().mo55091a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f46422d.booleanValue();
    }

    @WorkerThread
    /* renamed from: i */
    public final double mo54926i(String str, zzdt zzdt) {
        if (str == null) {
            return ((Double) zzdt.mo55037a((Object) null)).doubleValue();
        }
        String b = this.f46421c.mo54918b(str, zzdt.mo55038b());
        if (TextUtils.isEmpty(b)) {
            return ((Double) zzdt.mo55037a((Object) null)).doubleValue();
        }
        try {
            return ((Double) zzdt.mo55037a(Double.valueOf(Double.parseDouble(b)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzdt.mo55037a((Object) null)).doubleValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo54927j(@Size(min = 1) String str) {
        return mo54931n(str, zzdu.f46578I, 500, 2000);
    }

    /* renamed from: k */
    public final int mo54928k() {
        zzlb N = this.f46899a.mo55196N();
        Boolean J = N.f46899a.mo55194L().mo55444J();
        if (N.mo55604o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: l */
    public final int mo54929l(@Size(min = 1) String str) {
        return mo54931n(str, zzdu.f46579J, 25, 100);
    }

    @WorkerThread
    /* renamed from: m */
    public final int mo54930m(String str, zzdt zzdt) {
        if (str == null) {
            return ((Integer) zzdt.mo55037a((Object) null)).intValue();
        }
        String b = this.f46421c.mo54918b(str, zzdt.mo55038b());
        if (TextUtils.isEmpty(b)) {
            return ((Integer) zzdt.mo55037a((Object) null)).intValue();
        }
        try {
            return ((Integer) zzdt.mo55037a(Integer.valueOf(Integer.parseInt(b)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzdt.mo55037a((Object) null)).intValue();
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final int mo54931n(String str, zzdt zzdt, int i, int i2) {
        return Math.max(Math.min(mo54930m(str, zzdt), i2), i);
    }

    /* renamed from: o */
    public final long mo54932o() {
        this.f46899a.mo55207h();
        return 74029;
    }

    @WorkerThread
    /* renamed from: p */
    public final long mo54933p(String str, zzdt zzdt) {
        if (str == null) {
            return ((Long) zzdt.mo55037a((Object) null)).longValue();
        }
        String b = this.f46421c.mo54918b(str, zzdt.mo55038b());
        if (TextUtils.isEmpty(b)) {
            return ((Long) zzdt.mo55037a((Object) null)).longValue();
        }
        try {
            return ((Long) zzdt.mo55037a(Long.valueOf(Long.parseLong(b)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzdt.mo55037a((Object) null)).longValue();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: q */
    public final Bundle mo54934q() {
        try {
            if (this.f46899a.mo55202c().getPackageManager() == null) {
                this.f46899a.mo55221z().mo55098p().mo55091a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = Wrappers.m4929a(this.f46899a.mo55202c()).mo21960c(this.f46899a.mo55202c().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            this.f46899a.mo55221z().mo55098p().mo55091a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: r */
    public final Boolean mo54935r(@Size(min = 1) String str) {
        Preconditions.m4484g(str);
        Bundle q = mo54934q();
        if (q == null) {
            this.f46899a.mo55221z().mo55098p().mo55091a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!q.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(q.getBoolean(str));
        }
    }

    /* renamed from: s */
    public final String mo54936s() {
        return m65358g("debug.firebase.analytics.app", "");
    }

    /* renamed from: t */
    public final String mo54937t() {
        return m65358g("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final String mo54938u() {
        this.f46899a.mo55207h();
        return "FA";
    }

    @WorkerThread
    /* renamed from: v */
    public final String mo54939v(String str, zzdt zzdt) {
        if (str == null) {
            return (String) zzdt.mo55037a((Object) null);
        }
        return (String) zzdt.mo55037a(this.f46421c.mo54918b(str, zzdt.mo55038b()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo54940w(@androidx.annotation.Size(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.m4484g(r4)
            android.os.Bundle r0 = r3.mo54934q()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.zzfr r4 = r3.f46899a
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55098p()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo55091a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.zzfr r0 = r3.f46899a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo55202c()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzfr r0 = r3.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55098p()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo55092b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.mo54940w(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo54941x(zzaf zzaf) {
        this.f46421c = zzaf;
    }

    /* renamed from: y */
    public final boolean mo54942y() {
        Boolean r = mo54935r("google_analytics_adid_collection_enabled");
        return r == null || r.booleanValue();
    }
}
