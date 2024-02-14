package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@ShowFirstParty
@KeepForSdk
@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GoogleSignatureVerifier {

    /* renamed from: c */
    private static GoogleSignatureVerifier f3070c;

    /* renamed from: a */
    private final Context f3071a;

    /* renamed from: b */
    private volatile String f3072b;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.f3071a = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static GoogleSignatureVerifier m3573a(@NonNull Context context) {
        Preconditions.m4488k(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (f3070c == null) {
                zzn.m4948d(context);
                f3070c = new GoogleSignatureVerifier(context);
            }
        }
        return f3070c;
    }

    /* renamed from: d */
    static final zzj m3574d(PackageInfo packageInfo, zzj... zzjArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzk zzk = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzjArr.length; i++) {
            if (zzjArr[i].equals(zzk)) {
                return zzjArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m3575e(@NonNull PackageInfo packageInfo, boolean z) {
        zzj zzj;
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                zzj = m3574d(packageInfo, zzm.f3984a);
            } else {
                zzj = m3574d(packageInfo, zzm.f3984a[0]);
            }
            if (zzj != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r8 = r8.applicationInfo;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.common.zzx m3576f(java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L_0x0009
            com.google.android.gms.common.zzx r6 = com.google.android.gms.common.zzx.m4958c(r7)
            return r6
        L_0x0009:
            java.lang.String r8 = r5.f3072b
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0090
            boolean r8 = com.google.android.gms.common.zzn.m4949e()
            r0 = 0
            if (r8 == 0) goto L_0x0023
            android.content.Context r7 = r5.f3071a
            boolean r7 = com.google.android.gms.common.GooglePlayServicesUtilLight.m3566g(r7)
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzn.m4946b(r6, r7, r0, r0)
            goto L_0x007d
        L_0x0023:
            android.content.Context r8 = r5.f3071a     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0084 }
            r1 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r1)     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r1 = r5.f3071a
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.m3566g(r1)
            if (r8 != 0) goto L_0x003c
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.m4958c(r7)
            goto L_0x007d
        L_0x003c:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto L_0x0077
            int r7 = r7.length
            r2 = 1
            if (r7 == r2) goto L_0x0045
            goto L_0x0077
        L_0x0045:
            com.google.android.gms.common.zzk r7 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r3 = r8.signatures
            r3 = r3[r0]
            byte[] r3 = r3.toByteArray()
            r7.<init>(r3)
            java.lang.String r3 = r8.packageName
            com.google.android.gms.common.zzx r1 = com.google.android.gms.common.zzn.m4945a(r3, r7, r1, r0)
            boolean r4 = r1.f4007a
            if (r4 == 0) goto L_0x0075
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto L_0x0075
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0075
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzn.m4945a(r3, r7, r0, r2)
            boolean r7 = r7.f4007a
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = "debuggable release cert app rejected"
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.m4958c(r7)
            goto L_0x007d
        L_0x0075:
            r7 = r1
            goto L_0x007d
        L_0x0077:
            java.lang.String r7 = "single cert required"
            com.google.android.gms.common.zzx r7 = com.google.android.gms.common.zzx.m4958c(r7)
        L_0x007d:
            boolean r8 = r7.f4007a
            if (r8 == 0) goto L_0x0083
            r5.f3072b = r6
        L_0x0083:
            return r7
        L_0x0084:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            java.lang.String r6 = r8.concat(r6)
            com.google.android.gms.common.zzx r6 = com.google.android.gms.common.zzx.m4959d(r6, r7)
            return r6
        L_0x0090:
            com.google.android.gms.common.zzx r6 = com.google.android.gms.common.zzx.m4957b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.m3576f(java.lang.String, boolean, boolean):com.google.android.gms.common.zzx");
    }

    @KeepForSdk
    /* renamed from: b */
    public boolean mo21178b(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m3575e(packageInfo, false)) {
            return true;
        }
        if (m3575e(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.m3566g(this.f3071a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: c */
    public boolean mo21179c(int i) {
        zzx zzx;
        int length;
        String[] packagesForUid = this.f3071a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzx = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Preconditions.m4488k(zzx);
                    break;
                }
                zzx = m3576f(packagesForUid[i2], false, false);
                if (zzx.f4007a) {
                    break;
                }
                i2++;
            }
        } else {
            zzx = zzx.m4958c("no pkgs");
        }
        zzx.mo21991e();
        return zzx.f4007a;
    }
}
