package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzdy extends zzf {

    /* renamed from: c */
    private String f46645c;

    /* renamed from: d */
    private String f46646d;

    /* renamed from: e */
    private int f46647e;

    /* renamed from: f */
    private String f46648f;

    /* renamed from: g */
    private String f46649g;

    /* renamed from: h */
    private long f46650h;

    /* renamed from: i */
    private final long f46651i;

    /* renamed from: j */
    private List f46652j;

    /* renamed from: k */
    private String f46653k;

    /* renamed from: l */
    private int f46654l;

    /* renamed from: m */
    private String f46655m;

    /* renamed from: n */
    private String f46656n;

    /* renamed from: o */
    private String f46657o;

    /* renamed from: p */
    private long f46658p = 0;

    /* renamed from: q */
    private String f46659q = null;

    zzdy(zzfr zzfr, long j) {
        super(zzfr);
        this.f46651i = j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018b A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0194 A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bc A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x024c  */
    @androidx.annotation.WorkerThread
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55057j() {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.zzfr r0 = r11.f46899a
            android.content.Context r0 = r0.mo55202c()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.zzfr r1 = r11.f46899a
            android.content.Context r1 = r1.mo55202c()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55098p()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeh.m65566x(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo55092b(r9, r8)
        L_0x0032:
            r8 = r2
            goto L_0x009b
        L_0x0035:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55098p()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeh.m65566x(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo55092b(r9, r8)
        L_0x004d:
            if (r6 != 0) goto L_0x0052
            java.lang.String r6 = "manual_install"
            goto L_0x005b
        L_0x0052:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005b
            r6 = r4
        L_0x005b:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.mo55202c()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007d
        L_0x007c:
            r8 = r2
        L_0x007d:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0082 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x009b
        L_0x0082:
            r7 = r2
            r2 = r8
            goto L_0x0086
        L_0x0085:
            r7 = r2
        L_0x0086:
            com.google.android.gms.measurement.internal.zzfr r8 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r8 = r8.mo55221z()
            com.google.android.gms.measurement.internal.zzef r8 = r8.mo55098p()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeh.m65566x(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo55093c(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x009b:
            r11.f46645c = r0
            r11.f46648f = r6
            r11.f46646d = r2
            r11.f46647e = r3
            r11.f46649g = r8
            r2 = 0
            r11.f46650h = r2
            com.google.android.gms.measurement.internal.zzfr r2 = r11.f46899a
            java.lang.String r2 = r2.mo55197O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.zzfr r2 = r11.f46899a
            java.lang.String r2 = r2.mo55198P()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c6
            r2 = 1
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            com.google.android.gms.measurement.internal.zzfr r6 = r11.f46899a
            int r6 = r6.mo55217v()
            switch(r6) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0141;
                case 2: goto L_0x0131;
                case 3: goto L_0x0121;
                case 4: goto L_0x0111;
                case 5: goto L_0x0101;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00e1;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55101s()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.mo55091a(r8)
            goto L_0x0160
        L_0x00e1:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55101s()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.mo55091a(r8)
            goto L_0x0160
        L_0x00f1:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55104v()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.mo55091a(r8)
            goto L_0x0160
        L_0x0101:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55102t()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.mo55091a(r8)
            goto L_0x0160
        L_0x0111:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55101s()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.mo55091a(r8)
            goto L_0x0160
        L_0x0121:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55101s()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.mo55091a(r8)
            goto L_0x0160
        L_0x0131:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55102t()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.mo55091a(r8)
            goto L_0x0160
        L_0x0141:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55101s()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.mo55091a(r8)
            goto L_0x0160
        L_0x0151:
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r7 = r7.mo55221z()
            com.google.android.gms.measurement.internal.zzef r7 = r7.mo55102t()
            java.lang.String r8 = "App measurement collection enabled"
            r7.mo55091a(r8)
        L_0x0160:
            r11.f46655m = r4
            r11.f46656n = r4
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a
            r7.mo55207h()
            if (r2 == 0) goto L_0x0173
            com.google.android.gms.measurement.internal.zzfr r2 = r11.f46899a
            java.lang.String r2 = r2.mo55197O()
            r11.f46656n = r2
        L_0x0173:
            com.google.android.gms.measurement.internal.zzfr r2 = r11.f46899a     // Catch:{ IllegalStateException -> 0x01db }
            android.content.Context r2 = r2.mo55202c()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.zzfr r7 = r11.f46899a     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r7 = r7.mo55200R()     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r8 = "google_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.zzid.m65899c(r2, r8, r7)     // Catch:{ IllegalStateException -> 0x01db }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01db }
            if (r3 == r7) goto L_0x018c
            r4 = r2
        L_0x018c:
            r11.f46655m = r4     // Catch:{ IllegalStateException -> 0x01db }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01db }
            if (r2 != 0) goto L_0x01ba
            com.google.android.gms.measurement.internal.zzfr r2 = r11.f46899a     // Catch:{ IllegalStateException -> 0x01db }
            android.content.Context r2 = r2.mo55202c()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.zzfr r3 = r11.f46899a     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r3 = r3.mo55200R()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.common.internal.Preconditions.m4488k(r2)     // Catch:{ IllegalStateException -> 0x01db }
            android.content.res.Resources r4 = r2.getResources()     // Catch:{ IllegalStateException -> 0x01db }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x01db }
            if (r7 != 0) goto L_0x01ae
            goto L_0x01b2
        L_0x01ae:
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzfj.m65653a(r2)     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01b2:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.zzfj.m65654b(r2, r4, r3)     // Catch:{ IllegalStateException -> 0x01db }
            r11.f46656n = r2     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01ba:
            if (r6 != 0) goto L_0x01ef
            com.google.android.gms.measurement.internal.zzfr r2 = r11.f46899a     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55102t()     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r11.f46645c     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r6 = r11.f46655m     // Catch:{ IllegalStateException -> 0x01db }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01db }
            if (r6 == 0) goto L_0x01d5
            java.lang.String r6 = r11.f46656n     // Catch:{ IllegalStateException -> 0x01db }
            goto L_0x01d7
        L_0x01d5:
            java.lang.String r6 = r11.f46655m     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01d7:
            r2.mo55093c(r3, r4, r6)     // Catch:{ IllegalStateException -> 0x01db }
            goto L_0x01ef
        L_0x01db:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r3 = r3.mo55221z()
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55098p()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzeh.m65566x(r0)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.mo55093c(r4, r0, r2)
        L_0x01ef:
            r0 = 0
            r11.f46652j = r0
            com.google.android.gms.measurement.internal.zzfr r0 = r11.f46899a
            r0.mo55207h()
            com.google.android.gms.measurement.internal.zzfr r0 = r11.f46899a
            com.google.android.gms.measurement.internal.zzag r0 = r0.mo55219x()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo54940w(r2)
            if (r0 != 0) goto L_0x0206
            goto L_0x023b
        L_0x0206:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x021c
            com.google.android.gms.measurement.internal.zzfr r0 = r11.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55104v()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo55091a(r2)
            goto L_0x023d
        L_0x021c:
            java.util.Iterator r2 = r0.iterator()
        L_0x0220:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x023b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.zzfr r4 = r11.f46899a
            com.google.android.gms.measurement.internal.zzlb r4 = r4.mo55196N()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.mo55588Q(r6, r3)
            if (r3 != 0) goto L_0x0220
            goto L_0x023d
        L_0x023b:
            r11.f46652j = r0
        L_0x023d:
            if (r1 == 0) goto L_0x024c
            com.google.android.gms.measurement.internal.zzfr r0 = r11.f46899a
            android.content.Context r0 = r0.mo55202c()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.m4920a(r0)
            r11.f46654l = r0
            return
        L_0x024c:
            r11.f46654l = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdy.mo55057j():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo55058l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: m */
    public final int mo55059m() {
        mo55140f();
        return this.f46654l;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: n */
    public final int mo55060n() {
        mo55140f();
        return this.f46647e;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x026e  */
    @androidx.annotation.WorkerThread
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzq mo55061o(java.lang.String r37) {
        /*
            r36 = this;
            r1 = r36
            r36.mo55073e()
            com.google.android.gms.measurement.internal.zzq r33 = new com.google.android.gms.measurement.internal.zzq
            java.lang.String r3 = r36.mo55063q()
            java.lang.String r4 = r36.mo55064r()
            r36.mo55140f()
            java.lang.String r5 = r1.f46646d
            r36.mo55140f()
            int r0 = r1.f46647e
            long r6 = (long) r0
            r36.mo55140f()
            java.lang.String r0 = r1.f46648f
            com.google.android.gms.common.internal.Preconditions.m4488k(r0)
            java.lang.String r8 = r1.f46648f
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f46899a
            com.google.android.gms.measurement.internal.zzag r0 = r0.mo55219x()
            r0.mo54932o()
            r36.mo55140f()
            r36.mo55073e()
            long r9 = r1.f46650h
            r2 = 0
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f46899a
            com.google.android.gms.measurement.internal.zzlb r9 = r0.mo55196N()
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f46899a
            android.content.Context r0 = r0.mo55202c()
            com.google.android.gms.measurement.internal.zzfr r10 = r1.f46899a
            android.content.Context r10 = r10.mo55202c()
            java.lang.String r10 = r10.getPackageName()
            r9.mo55073e()
            com.google.android.gms.common.internal.Preconditions.m4488k(r0)
            com.google.android.gms.common.internal.Preconditions.m4484g(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.zzlb.m66132r()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.zzfr r0 = r9.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55098p()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo55091a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00ce
        L_0x0078:
            if (r13 == 0) goto L_0x00cd
            boolean r10 = r9.mo55593V(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 != 0) goto L_0x00bb
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.m4929a(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.zzfr r10 = r9.f46899a     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.Context r10 = r10.mo55202c()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bd }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.mo21963f(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 <= 0) goto L_0x00ab
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            long r9 = com.google.android.gms.measurement.internal.zzlb.m66131q0(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            r15 = r9
            goto L_0x0076
        L_0x00ab:
            com.google.android.gms.measurement.internal.zzfr r0 = r9.f46899a     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55103u()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = "Could not get signatures"
            r0.mo55091a(r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0076
        L_0x00bb:
            r15 = r11
            goto L_0x0076
        L_0x00bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r9 = r9.f46899a
            com.google.android.gms.measurement.internal.zzeh r9 = r9.mo55221z()
            com.google.android.gms.measurement.internal.zzef r9 = r9.mo55098p()
            java.lang.String r10 = "Package name not found"
            r9.mo55092b(r10, r0)
        L_0x00cd:
            r9 = r11
        L_0x00ce:
            r1.f46650h = r9
        L_0x00d0:
            r13 = r9
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f46899a
            boolean r0 = r0.mo55212m()
            com.google.android.gms.measurement.internal.zzfr r9 = r1.f46899a
            com.google.android.gms.measurement.internal.zzew r9 = r9.mo55189F()
            boolean r9 = r9.f46750q
            r10 = 1
            r15 = r9 ^ 1
            r36.mo55073e()
            com.google.android.gms.measurement.internal.zzfr r9 = r1.f46899a
            boolean r9 = r9.mo55212m()
            r11 = 0
            if (r9 != 0) goto L_0x00f2
        L_0x00ee:
            r20 = r11
            goto L_0x0178
        L_0x00f2:
            com.google.android.gms.internal.measurement.zzpj.m61111b()
            com.google.android.gms.measurement.internal.zzfr r9 = r1.f46899a
            com.google.android.gms.measurement.internal.zzag r9 = r9.mo55219x()
            com.google.android.gms.measurement.internal.zzdt r12 = com.google.android.gms.measurement.internal.zzdu.f46601c0
            boolean r9 = r9.mo54919A(r11, r12)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.zzfr r9 = r1.f46899a
            com.google.android.gms.measurement.internal.zzeh r9 = r9.mo55221z()
            com.google.android.gms.measurement.internal.zzef r9 = r9.mo55102t()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo55091a(r12)
            goto L_0x00ee
        L_0x0113:
            com.google.android.gms.measurement.internal.zzfr r9 = r1.f46899a     // Catch:{ ClassNotFoundException -> 0x0176 }
            android.content.Context r9 = r9.mo55202c()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0176 }
            if (r9 != 0) goto L_0x0126
            goto L_0x00ee
        L_0x0126:
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0167 }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r12[r2] = r18     // Catch:{ Exception -> 0x0167 }
            java.lang.String r11 = "getInstance"
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0167 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0167 }
            com.google.android.gms.measurement.internal.zzfr r10 = r1.f46899a     // Catch:{ Exception -> 0x0167 }
            android.content.Context r10 = r10.mo55202c()     // Catch:{ Exception -> 0x0167 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0167 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0167 }
            if (r11 != 0) goto L_0x0144
            goto L_0x0176
        L_0x0144:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0157 }
            r20 = r9
            goto L_0x0178
        L_0x0157:
            com.google.android.gms.measurement.internal.zzfr r9 = r1.f46899a
            com.google.android.gms.measurement.internal.zzeh r9 = r9.mo55221z()
            com.google.android.gms.measurement.internal.zzef r9 = r9.mo55104v()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            r9.mo55091a(r10)
            goto L_0x0176
        L_0x0167:
            com.google.android.gms.measurement.internal.zzfr r9 = r1.f46899a
            com.google.android.gms.measurement.internal.zzeh r9 = r9.mo55221z()
            com.google.android.gms.measurement.internal.zzef r9 = r9.mo55105w()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
            r9.mo55091a(r10)
        L_0x0176:
            r20 = 0
        L_0x0178:
            com.google.android.gms.measurement.internal.zzfr r9 = r1.f46899a
            com.google.android.gms.measurement.internal.zzew r10 = r9.mo55189F()
            com.google.android.gms.measurement.internal.zzes r10 = r10.f46738e
            long r10 = r10.mo55120a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0190
            long r9 = r9.f46818G
            r12 = r3
            r22 = r9
            goto L_0x0199
        L_0x0190:
            r12 = r3
            long r2 = r9.f46818G
            long r2 = java.lang.Math.min(r2, r10)
            r22 = r2
        L_0x0199:
            r36.mo55140f()
            int r11 = r1.f46654l
            com.google.android.gms.measurement.internal.zzfr r2 = r1.f46899a
            com.google.android.gms.measurement.internal.zzag r2 = r2.mo55219x()
            boolean r24 = r2.mo54942y()
            com.google.android.gms.measurement.internal.zzfr r2 = r1.f46899a
            com.google.android.gms.measurement.internal.zzew r2 = r2.mo55189F()
            r2.mo55073e()
            android.content.SharedPreferences r2 = r2.mo55127m()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r25 = r2.getBoolean(r3, r9)
            r36.mo55140f()
            java.lang.String r3 = r1.f46656n
            com.google.android.gms.measurement.internal.zzfr r2 = r1.f46899a
            com.google.android.gms.measurement.internal.zzag r2 = r2.mo55219x()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo54935r(r9)
            if (r2 != 0) goto L_0x01d2
            r26 = 0
            goto L_0x01de
        L_0x01d2:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r26 = r2
        L_0x01de:
            long r9 = r1.f46651i
            java.util.List r2 = r1.f46652j
            r19 = r2
            com.google.android.gms.measurement.internal.zzfr r2 = r1.f46899a
            com.google.android.gms.measurement.internal.zzew r2 = r2.mo55189F()
            com.google.android.gms.measurement.internal.zzai r2 = r2.mo55129o()
            java.lang.String r30 = r2.mo54948h()
            java.lang.String r2 = r1.f46653k
            if (r2 != 0) goto L_0x021b
            com.google.android.gms.measurement.internal.zzfr r2 = r1.f46899a
            com.google.android.gms.measurement.internal.zzag r2 = r2.mo55219x()
            r21 = r3
            com.google.android.gms.measurement.internal.zzdt r3 = com.google.android.gms.measurement.internal.zzdu.f46631r0
            r27 = r9
            r9 = 0
            boolean r2 = r2.mo54919A(r9, r3)
            if (r2 == 0) goto L_0x0216
            com.google.android.gms.measurement.internal.zzfr r2 = r1.f46899a
            com.google.android.gms.measurement.internal.zzlb r2 = r2.mo55196N()
            java.lang.String r2 = r2.mo55603o()
            r1.f46653k = r2
            goto L_0x021f
        L_0x0216:
            java.lang.String r2 = ""
            r1.f46653k = r2
            goto L_0x021f
        L_0x021b:
            r21 = r3
            r27 = r9
        L_0x021f:
            java.lang.String r3 = r1.f46653k
            com.google.android.gms.internal.measurement.zzpd.m61097b()
            com.google.android.gms.measurement.internal.zzfr r2 = r1.f46899a
            com.google.android.gms.measurement.internal.zzag r2 = r2.mo55219x()
            com.google.android.gms.measurement.internal.zzdt r9 = com.google.android.gms.measurement.internal.zzdu.f46625o0
            r10 = 0
            boolean r2 = r2.mo54919A(r10, r9)
            if (r2 == 0) goto L_0x026e
            r36.mo55073e()
            long r9 = r1.f46658p
            r16 = 0
            int r2 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0241
            r16 = r3
            goto L_0x0262
        L_0x0241:
            com.google.android.gms.measurement.internal.zzfr r2 = r1.f46899a
            com.google.android.gms.common.util.Clock r2 = r2.mo55201a()
            long r9 = r2.mo21950a()
            r16 = r3
            long r2 = r1.f46658p
            long r9 = r9 - r2
            java.lang.String r2 = r1.f46657o
            if (r2 == 0) goto L_0x0262
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r17 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r17 <= 0) goto L_0x0262
            java.lang.String r2 = r1.f46659q
            if (r2 != 0) goto L_0x0262
            r36.mo55066t()
        L_0x0262:
            java.lang.String r2 = r1.f46657o
            if (r2 != 0) goto L_0x0269
            r36.mo55066t()
        L_0x0269:
            java.lang.String r2 = r1.f46657o
            r32 = r2
            goto L_0x0272
        L_0x026e:
            r16 = r3
            r32 = r10
        L_0x0272:
            r9 = 74029(0x1212d, double:3.6575E-319)
            r17 = 0
            r29 = 0
            r31 = r19
            r2 = r33
            r35 = r16
            r34 = r21
            r3 = r12
            r21 = r11
            r11 = r13
            r13 = r37
            r14 = r0
            r16 = r20
            r19 = r22
            r22 = r24
            r23 = r25
            r24 = r34
            r25 = r26
            r26 = r27
            r28 = r31
            r31 = r35
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdy.mo55061o(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final String mo55062p() {
        mo55140f();
        return this.f46656n;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: q */
    public final String mo55063q() {
        mo55140f();
        Preconditions.m4488k(this.f46645c);
        return this.f46645c;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final String mo55064r() {
        mo55073e();
        mo55140f();
        Preconditions.m4488k(this.f46655m);
        return this.f46655m;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final List mo55065s() {
        return this.f46652j;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final void mo55066t() {
        String str;
        mo55073e();
        if (!this.f46899a.mo55189F().mo55129o().mo54950i(zzah.ANALYTICS_STORAGE)) {
            this.f46899a.mo55221z().mo55097o().mo55091a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.f46899a.mo55196N().mo55609s().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        zzef o = this.f46899a.mo55221z().mo55097o();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        o.mo55091a(String.format("Resetting session stitching token to %s", objArr));
        this.f46657o = str;
        this.f46658p = this.f46899a.mo55201a().mo21950a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo55067u(String str) {
        String str2 = this.f46659q;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f46659q = str;
        return z;
    }
}
