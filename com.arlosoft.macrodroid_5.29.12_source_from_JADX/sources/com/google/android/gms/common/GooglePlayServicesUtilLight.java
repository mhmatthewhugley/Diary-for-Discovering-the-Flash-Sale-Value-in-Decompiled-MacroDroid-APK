package com.google.android.gms.common;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GooglePlayServicesUtilLight {
    @KeepForSdk
    @Deprecated

    /* renamed from: a */
    public static final int f3065a = 12451000;
    @KeepForSdk
    @VisibleForTesting

    /* renamed from: b */
    static final AtomicBoolean f3066b = new AtomicBoolean();

    /* renamed from: c */
    private static boolean f3067c = false;
    @VisibleForTesting

    /* renamed from: d */
    static boolean f3068d = false;

    /* renamed from: e */
    private static final AtomicBoolean f3069e = new AtomicBoolean();

    @KeepForSdk
    GooglePlayServicesUtilLight() {
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static void m3560a(@NonNull Context context) {
        if (!f3066b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: b */
    public static void m3561b(@NonNull Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int j = GoogleApiAvailabilityLight.m3542h().mo21157j(context, i);
        if (j != 0) {
            Intent d = GoogleApiAvailabilityLight.m3542h().mo21153d(context, j, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + j);
            if (d == null) {
                throw new GooglePlayServicesNotAvailableException(j);
            }
            throw new GooglePlayServicesRepairableException(j, "Google Play Services not available", d);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public static int m3562c(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    @VisibleForTesting
    /* renamed from: d */
    public static String m3563d(int i) {
        return ConnectionResult.m3512r2(i);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: e */
    public static Context m3564e(@NonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @KeepForSdk
    @Nullable
    /* renamed from: f */
    public static Resources m3565f(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: g */
    public static boolean m3566g(@NonNull Context context) {
        if (!f3068d) {
            try {
                PackageInfo f = Wrappers.m4929a(context).mo21963f("com.google.android.gms", 64);
                GoogleSignatureVerifier.m3573a(context);
                if (f == null || GoogleSignatureVerifier.m3575e(f, false) || !GoogleSignatureVerifier.m3575e(f, true)) {
                    f3067c = false;
                } else {
                    f3067c = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                f3068d = true;
            }
        }
        return f3067c || !DeviceProperties.m4879e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m3567h(@androidx.annotation.NonNull android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = com.google.android.gms.common.C1738R.string.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f3069e
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = com.google.android.gms.common.internal.zzag.m4676a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f3065a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = com.google.android.gms.common.util.DeviceProperties.m4881g(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = com.google.android.gms.common.util.DeviceProperties.m4883i(r10)
            if (r1 != 0) goto L_0x004d
            r1 = 1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            com.google.android.gms.common.internal.Preconditions.m4478a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007c
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007d
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0078:
            r3 = 9
            goto L_0x0133
        L_0x007c:
            r8 = 0
        L_0x007d:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0126 }
            com.google.android.gms.common.GoogleSignatureVerifier.m3573a(r10)
            boolean r10 = com.google.android.gms.common.GoogleSignatureVerifier.m3575e(r9, r3)
            if (r10 != 0) goto L_0x009a
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x009a:
            if (r1 == 0) goto L_0x00b3
            com.google.android.gms.common.internal.Preconditions.m4488k(r8)
            boolean r10 = com.google.android.gms.common.GoogleSignatureVerifier.m3575e(r8, r3)
            if (r10 != 0) goto L_0x00b3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00b3:
            if (r1 == 0) goto L_0x00d3
            if (r8 == 0) goto L_0x00d3
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00d3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00d3:
            int r10 = r9.versionCode
            int r10 = com.google.android.gms.common.util.zza.m4918a(r10)
            int r1 = com.google.android.gms.common.util.zza.m4918a(r11)
            if (r10 >= r1) goto L_0x0107
            int r10 = r9.versionCode
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google Play services out of date for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ".  Requires "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " but found "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x0133
        L_0x0107:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x011f
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0110 }
            goto L_0x011f
        L_0x0110:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x0133
        L_0x011f:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0125
            r3 = 3
            goto L_0x0133
        L_0x0125:
            return r4
        L_0x0126:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0133:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtilLight.m3567h(android.content.Context, int):int");
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    /* renamed from: i */
    public static boolean m3568i(@NonNull Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m3572m(context, "com.google.android.gms");
        }
        return false;
    }

    @KeepForSdk
    /* renamed from: j */
    public static boolean m3569j(@NonNull Context context) {
        if (!PlatformVersion.m4898c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        Preconditions.m4488k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: k */
    public static boolean m3570k(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: l */
    public static boolean m3571l(@NonNull Context context, int i, @NonNull String str) {
        return UidVerifier.m4914b(context, i, str);
    }

    /* renamed from: m */
    static boolean m3572m(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (PlatformVersion.m4901f()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !m3569j(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
