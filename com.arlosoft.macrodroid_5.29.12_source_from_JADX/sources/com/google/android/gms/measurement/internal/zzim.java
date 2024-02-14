package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzim extends zzf {

    /* renamed from: c */
    private volatile zzie f47080c;

    /* renamed from: d */
    private volatile zzie f47081d;
    @VisibleForTesting

    /* renamed from: e */
    protected zzie f47082e;

    /* renamed from: f */
    private final Map f47083f = new ConcurrentHashMap();
    @GuardedBy("activityLock")

    /* renamed from: g */
    private Activity f47084g;
    @GuardedBy("activityLock")

    /* renamed from: h */
    private volatile boolean f47085h;

    /* renamed from: i */
    private volatile zzie f47086i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public zzie f47087j;
    @GuardedBy("activityLock")

    /* renamed from: k */
    private boolean f47088k;

    /* renamed from: l */
    private final Object f47089l = new Object();

    public zzim(zzfr zzfr) {
        super(zzfr);
    }

    @MainThread
    /* renamed from: F */
    private final zzie m65901F(@NonNull Activity activity) {
        Preconditions.m4488k(activity);
        zzie zzie = (zzie) this.f47083f.get(activity);
        if (zzie == null) {
            zzie zzie2 = new zzie((String) null, mo55411r(activity.getClass(), "Activity"), this.f46899a.mo55196N().mo55608r0());
            this.f47083f.put(activity, zzie2);
            zzie = zzie2;
        }
        return this.f47086i != null ? this.f47086i : zzie;
    }

    @MainThread
    /* renamed from: G */
    private final void m65902G(Activity activity, zzie zzie, boolean z) {
        zzie zzie2;
        zzie zzie3;
        zzie zzie4 = zzie;
        if (this.f47080c == null) {
            zzie2 = this.f47081d;
        } else {
            zzie2 = this.f47080c;
        }
        zzie zzie5 = zzie2;
        if (zzie4.f47058b == null) {
            zzie3 = new zzie(zzie4.f47057a, activity != null ? mo55411r(activity.getClass(), "Activity") : null, zzie4.f47059c, zzie4.f47061e, zzie4.f47062f);
        } else {
            zzie3 = zzie4;
        }
        this.f47081d = this.f47080c;
        this.f47080c = zzie3;
        this.f46899a.mo55185B().mo55181x(new zzih(this, zzie3, zzie5, this.f46899a.mo55201a().mo21952c(), z));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: m */
    public final void m65903m(zzie zzie, zzie zzie2, long j, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j2;
        long j3;
        zzie zzie3 = zzie;
        zzie zzie4 = zzie2;
        long j4 = j;
        Bundle bundle3 = bundle;
        mo55073e();
        boolean z2 = false;
        boolean z3 = zzie4 == null || zzie4.f47059c != zzie3.f47059c || !zzif.m65900a(zzie4.f47058b, zzie3.f47058b) || !zzif.m65900a(zzie4.f47057a, zzie3.f47057a);
        if (z && this.f47082e != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            zzlb.m66134w(zzie3, bundle4, true);
            if (zzie4 != null) {
                String str = zzie4.f47057a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = zzie4.f47058b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", zzie4.f47059c);
            }
            if (z2) {
                zzka zzka = this.f46899a.mo55195M().f47219e;
                long j5 = j4 - zzka.f47213b;
                zzka.f47213b = j4;
                if (j5 > 0) {
                    this.f46899a.mo55196N().mo55612u(bundle4, j5);
                }
            }
            if (!this.f46899a.mo55219x().mo54921D()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = true != zzie3.f47061e ? "auto" : "app";
            long a = this.f46899a.mo55201a().mo21950a();
            if (zzie3.f47061e) {
                j3 = a;
                long j6 = zzie3.f47062f;
                if (j6 != 0) {
                    j2 = j6;
                    this.f46899a.mo55191I().mo55376t(str3, "_vs", j2, bundle4);
                }
            } else {
                j3 = a;
            }
            j2 = j3;
            this.f46899a.mo55191I().mo55376t(str3, "_vs", j2, bundle4);
        }
        if (z2) {
            m65904n(this.f47082e, true, j4);
        }
        this.f47082e = zzie3;
        if (zzie3.f47061e) {
            this.f47087j = zzie3;
        }
        this.f46899a.mo55194L().mo55461s(zzie3);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: n */
    public final void m65904n(zzie zzie, boolean z, long j) {
        this.f46899a.mo55218w().mo55036l(this.f46899a.mo55201a().mo21952c());
        if (this.f46899a.mo55195M().f47219e.mo55494d(zzie != null && zzie.f47060d, z, j) && zzie != null) {
            zzie.f47060d = false;
        }
    }

    /* renamed from: u */
    static /* bridge */ /* synthetic */ void m65908u(zzim zzim, Bundle bundle, zzie zzie, zzie zzie2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzim.m65903m(zzie, zzie2, j, true, zzim.f46899a.mo55196N().mo55615v0((String) null, "screen_view", bundle, (List) null, false));
    }

    @MainThread
    /* renamed from: A */
    public final void mo55405A(Activity activity) {
        synchronized (this.f47089l) {
            this.f47088k = true;
            if (activity != this.f47084g) {
                synchronized (this.f47089l) {
                    this.f47084g = activity;
                    this.f47085h = false;
                }
                if (this.f46899a.mo55219x().mo54921D()) {
                    this.f47086i = null;
                    this.f46899a.mo55185B().mo55181x(new zzil(this));
                }
            }
        }
        if (!this.f46899a.mo55219x().mo54921D()) {
            this.f47080c = this.f47086i;
            this.f46899a.mo55185B().mo55181x(new zzii(this));
            return;
        }
        m65902G(activity, m65901F(activity), false);
        zzd w = this.f46899a.mo55218w();
        w.f46899a.mo55185B().mo55181x(new zzc(w, w.f46899a.mo55201a().mo21952c()));
    }

    @MainThread
    /* renamed from: C */
    public final void mo55406C(Activity activity, Bundle bundle) {
        zzie zzie;
        if (this.f46899a.mo55219x().mo54921D() && bundle != null && (zzie = (zzie) this.f47083f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", zzie.f47059c);
            bundle2.putString("name", zzie.f47057a);
            bundle2.putString("referrer_name", zzie.f47058b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r5.length() <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r6.length() <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55407D(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r5, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzfr r0 = r3.f46899a
            com.google.android.gms.measurement.internal.zzag r0 = r0.mo55219x()
            boolean r0 = r0.mo54921D()
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.measurement.internal.zzfr r4 = r3.f46899a
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55104v()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo55091a(r5)
            return
        L_0x001c:
            com.google.android.gms.measurement.internal.zzie r0 = r3.f47080c
            if (r0 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.zzfr r4 = r3.f46899a
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55104v()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo55091a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f47083f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.measurement.internal.zzfr r4 = r3.f46899a
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55104v()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo55091a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo55411r(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f47058b
            boolean r1 = com.google.android.gms.measurement.internal.zzif.m65900a(r1, r6)
            java.lang.String r0 = r0.f47057a
            boolean r0 = com.google.android.gms.measurement.internal.zzif.m65900a(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.google.android.gms.measurement.internal.zzfr r4 = r3.f46899a
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55104v()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo55091a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            com.google.android.gms.measurement.internal.zzfr r1 = r3.f46899a
            r1.mo55219x()
            int r1 = r5.length()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.measurement.internal.zzfr r4 = r3.f46899a
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55104v()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.mo55092b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            com.google.android.gms.measurement.internal.zzfr r1 = r3.f46899a
            r1.mo55219x()
            int r1 = r6.length()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.google.android.gms.measurement.internal.zzfr r4 = r3.f46899a
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55104v()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.mo55092b(r6, r5)
            return
        L_0x00cf:
            com.google.android.gms.measurement.internal.zzfr r0 = r3.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55102t()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo55093c(r2, r1, r6)
            com.google.android.gms.measurement.internal.zzie r0 = new com.google.android.gms.measurement.internal.zzie
            com.google.android.gms.measurement.internal.zzfr r1 = r3.f46899a
            com.google.android.gms.measurement.internal.zzlb r1 = r1.mo55196N()
            long r1 = r1.mo55608r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f47083f
            r5.put(r4, r0)
            r5 = 1
            r3.m65902G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzim.mo55407D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f46899a.mo55221z().mo55102t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo55093c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f47080c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f47081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f47080c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.google.android.gms.measurement.internal.zzie(r3, r4, r12.f46899a.mo55196N().mo55608r0(), true, r14);
        r12.f47080c = r2;
        r12.f47081d = r0;
        r12.f47086i = r2;
        r12.f46899a.mo55185B().mo55181x(new com.google.android.gms.measurement.internal.zzig(r12, r13, r2, r0, r12.f46899a.mo55201a().mo21952c()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55408E(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f47089l
            monitor-enter(r0)
            boolean r1 = r12.f47088k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.zzfr r13 = r12.f46899a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzeh r13 = r13.mo55221z()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzef r13 = r13.mo55104v()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo55091a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzfr r4 = r12.f46899a     // Catch:{ all -> 0x011b }
            r4.mo55219x()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.google.android.gms.measurement.internal.zzfr r13 = r12.f46899a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzeh r13 = r13.mo55221z()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzef r13 = r13.mo55104v()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo55092b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzfr r5 = r12.f46899a     // Catch:{ all -> 0x011b }
            r5.mo55219x()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.google.android.gms.measurement.internal.zzfr r13 = r12.f46899a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzeh r13 = r13.mo55221z()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzef r13 = r13.mo55104v()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo55092b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f47084g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo55411r(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.google.android.gms.measurement.internal.zzie r1 = r12.f47080c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f47085h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f47085h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f47058b     // Catch:{ all -> 0x011b }
            boolean r2 = com.google.android.gms.measurement.internal.zzif.m65900a(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f47057a     // Catch:{ all -> 0x011b }
            boolean r1 = com.google.android.gms.measurement.internal.zzif.m65900a(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.zzfr r13 = r12.f46899a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzeh r13 = r13.mo55221z()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzef r13 = r13.mo55104v()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo55091a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.zzfr r0 = r12.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55102t()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo55093c(r5, r1, r2)
            com.google.android.gms.measurement.internal.zzie r0 = r12.f47080c
            if (r0 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.zzie r0 = r12.f47081d
            goto L_0x00e5
        L_0x00e3:
            com.google.android.gms.measurement.internal.zzie r0 = r12.f47080c
        L_0x00e5:
            com.google.android.gms.measurement.internal.zzie r1 = new com.google.android.gms.measurement.internal.zzie
            com.google.android.gms.measurement.internal.zzfr r2 = r12.f46899a
            com.google.android.gms.measurement.internal.zzlb r2 = r2.mo55196N()
            long r5 = r2.mo55608r0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f47080c = r1
            r12.f47081d = r0
            r12.f47086i = r1
            com.google.android.gms.measurement.internal.zzfr r14 = r12.f46899a
            com.google.android.gms.common.util.Clock r14 = r14.mo55201a()
            long r10 = r14.mo21952c()
            com.google.android.gms.measurement.internal.zzfr r14 = r12.f46899a
            com.google.android.gms.measurement.internal.zzfo r14 = r14.mo55185B()
            com.google.android.gms.measurement.internal.zzig r15 = new com.google.android.gms.measurement.internal.zzig
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo55181x(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzim.mo55408E(android.os.Bundle, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo55058l() {
        return false;
    }

    /* renamed from: p */
    public final zzie mo55409p() {
        return this.f47080c;
    }

    @WorkerThread
    /* renamed from: q */
    public final zzie mo55410q(boolean z) {
        mo55140f();
        mo55073e();
        if (!z) {
            return this.f47082e;
        }
        zzie zzie = this.f47082e;
        return zzie != null ? zzie : this.f47087j;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: r */
    public final String mo55411r(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f46899a.mo55219x();
        if (length2 <= 100) {
            return str2;
        }
        this.f46899a.mo55219x();
        return str2.substring(0, 100);
    }

    @MainThread
    /* renamed from: w */
    public final void mo55412w(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f46899a.mo55219x().mo54921D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f47083f.put(activity, new zzie(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @MainThread
    /* renamed from: x */
    public final void mo55413x(Activity activity) {
        synchronized (this.f47089l) {
            if (activity == this.f47084g) {
                this.f47084g = null;
            }
        }
        if (this.f46899a.mo55219x().mo54921D()) {
            this.f47083f.remove(activity);
        }
    }

    @MainThread
    /* renamed from: y */
    public final void mo55414y(Activity activity) {
        synchronized (this.f47089l) {
            this.f47088k = false;
            this.f47085h = true;
        }
        long c = this.f46899a.mo55201a().mo21952c();
        if (!this.f46899a.mo55219x().mo54921D()) {
            this.f47080c = null;
            this.f46899a.mo55185B().mo55181x(new zzij(this, c));
            return;
        }
        zzie F = m65901F(activity);
        this.f47081d = this.f47080c;
        this.f47080c = null;
        this.f46899a.mo55185B().mo55181x(new zzik(this, F, c));
    }
}
