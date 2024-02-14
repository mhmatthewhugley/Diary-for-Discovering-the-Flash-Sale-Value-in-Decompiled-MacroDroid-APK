package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzcc implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f2240a;

    public /* synthetic */ zzcc(Context context) {
        this.f2240a = context;
    }

    public final Object call() {
        Context context = this.f2240a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zze.m2645k("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            SharedPreferencesUtils.m4910a(context, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        zze.m2645k("User agent is already initialized on Google Play Services.");
        return string;
    }
}
