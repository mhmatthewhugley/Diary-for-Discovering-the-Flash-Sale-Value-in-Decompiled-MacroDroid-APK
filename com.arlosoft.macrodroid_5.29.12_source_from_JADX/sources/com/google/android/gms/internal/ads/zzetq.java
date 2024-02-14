package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzetq implements zzeve, zzevd {

    /* renamed from: a */
    private final ApplicationInfo f34895a;

    /* renamed from: b */
    private final PackageInfo f34896b;

    zzetq(ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo) {
        this.f34895a = applicationInfo;
        this.f34896b = packageInfo;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Integer num;
        Bundle bundle = (Bundle) obj;
        String str = this.f34895a.packageName;
        PackageInfo packageInfo = this.f34896b;
        String str2 = null;
        if (packageInfo == null) {
            num = null;
        } else {
            num = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        PackageInfo packageInfo2 = this.f34896b;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }

    public final int zza() {
        return 29;
    }

    public final zzfzp zzb() {
        return zzfzg.m51414i(this);
    }
}
