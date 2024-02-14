package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.common.zzd;
import org.apache.commons.cli.HelpFormatter;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GoogleApiAvailabilityLight {
    @KeepForSdk

    /* renamed from: a */
    public static final int f3062a = GooglePlayServicesUtilLight.f3065a;

    /* renamed from: b */
    private static final GoogleApiAvailabilityLight f3063b = new GoogleApiAvailabilityLight();

    @KeepForSdk
    GoogleApiAvailabilityLight() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public static GoogleApiAvailabilityLight m3542h() {
        return f3063b;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo21170a(@NonNull Context context) {
        GooglePlayServicesUtilLight.m3560a(context);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public int mo21171b(@NonNull Context context) {
        return GooglePlayServicesUtilLight.m3562c(context);
    }

    @ShowFirstParty
    @Nullable
    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public Intent mo21172c(int i) {
        return mo21153d((Context) null, i, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public Intent mo21153d(@Nullable Context context, int i, @Nullable String str) {
        if (i == 1 || i == 2) {
            if (context != null && DeviceProperties.m4881g(context)) {
                return zzt.m4714a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f3062a);
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
            if (context != null) {
                try {
                    sb.append(Wrappers.m4929a(context).mo21963f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return zzt.m4715b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return zzt.m4716c("com.google.android.gms");
        }
    }

    @KeepForSdk
    @Nullable
    /* renamed from: e */
    public PendingIntent mo21154e(@NonNull Context context, int i, int i2) {
        return mo21173f(context, i, i2, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    @Nullable
    /* renamed from: f */
    public PendingIntent mo21173f(@NonNull Context context, int i, int i2, @Nullable String str) {
        Intent d = mo21153d(context, i, str);
        if (d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, d, zzd.f39293a | 134217728);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public String mo21155g(int i) {
        return GooglePlayServicesUtilLight.m3563d(i);
    }

    @KeepForSdk
    @HideFirstParty
    /* renamed from: i */
    public int mo21156i(@NonNull Context context) {
        return mo21157j(context, f3062a);
    }

    @KeepForSdk
    /* renamed from: j */
    public int mo21157j(@NonNull Context context, int i) {
        int h = GooglePlayServicesUtilLight.m3567h(context, i);
        if (GooglePlayServicesUtilLight.m3568i(context, h)) {
            return 18;
        }
        return h;
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: k */
    public boolean mo21174k(@NonNull Context context, int i) {
        return GooglePlayServicesUtilLight.m3568i(context, i);
    }

    @KeepForSdk
    /* renamed from: l */
    public boolean mo21175l(@NonNull Context context, @NonNull String str) {
        return GooglePlayServicesUtilLight.m3572m(context, str);
    }

    @KeepForSdk
    /* renamed from: m */
    public boolean mo21158m(int i) {
        return GooglePlayServicesUtilLight.m3570k(i);
    }

    @KeepForSdk
    /* renamed from: n */
    public void mo21176n(@NonNull Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.m3561b(context, i);
    }
}
