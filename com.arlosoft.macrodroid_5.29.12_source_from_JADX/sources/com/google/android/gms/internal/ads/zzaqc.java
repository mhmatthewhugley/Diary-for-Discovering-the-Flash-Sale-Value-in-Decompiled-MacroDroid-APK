package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaqc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f25287a;

    /* renamed from: c */
    final /* synthetic */ zzaqe f25288c;

    zzaqc(zzaqe zzaqe, int i, boolean z) {
        this.f25288c = zzaqe;
        this.f25287a = i;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzaqe r0 = r5.f25288c
            int r1 = r5.f25287a
            if (r1 <= 0) goto L_0x000c
            int r1 = r1 * 1000
            long r1 = (long) r1
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x000c }
        L_0x000c:
            android.content.Context r1 = r0.f25290a     // Catch:{ all -> 0x002e }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x002e }
            android.content.Context r2 = r0.f25290a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x002e }
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ all -> 0x002e }
            android.content.Context r0 = r0.f25290a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ all -> 0x002e }
            int r1 = r1.versionCode     // Catch:{ all -> 0x002e }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzana r0 = com.google.android.gms.internal.ads.zzfnf.m50612a(r0, r2, r1)     // Catch:{ all -> 0x002e }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.zzaqe r1 = r5.f25288c
            r1.f25299j = r0
            int r1 = r5.f25287a
            r2 = 4
            if (r1 >= r2) goto L_0x0076
            if (r0 != 0) goto L_0x003c
            goto L_0x006d
        L_0x003c:
            boolean r1 = r0.mo41740p0()
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = r0.mo41738D0()
            java.lang.String r2 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006d
            boolean r1 = r0.mo41741q0()
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzanj r1 = r0.mo41736B0()
            boolean r1 = r1.mo41752I()
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzanj r0 = r0.mo41736B0()
            long r0 = r0.mo41751F()
            r2 = -2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006d
            goto L_0x0076
        L_0x006d:
            com.google.android.gms.internal.ads.zzaqe r0 = r5.f25288c
            int r1 = r5.f25287a
            r2 = 1
            int r1 = r1 + r2
            r0.mo41816o(r1, r2)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqc.run():void");
    }
}
