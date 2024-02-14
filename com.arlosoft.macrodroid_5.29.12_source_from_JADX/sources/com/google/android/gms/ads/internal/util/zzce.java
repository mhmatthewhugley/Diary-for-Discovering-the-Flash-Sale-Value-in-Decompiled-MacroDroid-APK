package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzce {

    /* renamed from: b */
    private static zzce f2243b;

    /* renamed from: a */
    String f2244a;

    private zzce() {
    }

    /* renamed from: a */
    public static zzce m2627a() {
        if (f2243b == null) {
            f2243b = new zzce();
        }
        return f2243b;
    }

    /* renamed from: b */
    public final void mo20342b(Context context) {
        zze.m2645k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f2244a)) {
            Context e = GooglePlayServicesUtilLight.m3564e(context);
            if (!ClientLibraryUtils.m4857a()) {
                if (e == null) {
                    e = null;
                }
                this.f2244a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (e == null) {
                putString.apply();
            } else {
                SharedPreferencesUtils.m4910a(context, putString, "admob_user_agent");
            }
            this.f2244a = defaultUserAgent;
        }
        zze.m2645k("User agent is updated.");
    }
}
