package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class PackageManagerWrapper {
    @NonNull

    /* renamed from: a */
    protected final Context f3967a;

    public PackageManagerWrapper(@NonNull Context context) {
        this.f3967a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public int mo21958a(@NonNull String str) {
        return this.f3967a.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    /* renamed from: b */
    public int mo21959b(@NonNull String str, @NonNull String str2) {
        return this.f3967a.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public ApplicationInfo mo21960c(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f3967a.getPackageManager().getApplicationInfo(str, i);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public CharSequence mo21961d(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.f3967a.getPackageManager().getApplicationLabel(this.f3967a.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public Pair<CharSequence, Drawable> mo21962e(@NonNull String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f3967a.getPackageManager().getApplicationInfo(str, 0);
        return Pair.create(this.f3967a.getPackageManager().getApplicationLabel(applicationInfo), this.f3967a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: f */
    public PackageInfo mo21963f(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f3967a.getPackageManager().getPackageInfo(str, i);
    }

    @KeepForSdk
    /* renamed from: g */
    public boolean mo21964g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.m4920a(this.f3967a);
        }
        if (!PlatformVersion.m4904i() || (nameForUid = this.f3967a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f3967a.getPackageManager().isInstantApp(nameForUid);
    }

    /* renamed from: h */
    public final boolean mo21965h(int i, @NonNull String str) {
        if (PlatformVersion.m4899d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f3967a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f3967a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
