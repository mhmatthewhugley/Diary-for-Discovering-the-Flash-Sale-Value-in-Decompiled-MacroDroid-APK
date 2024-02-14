package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzcd implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f2241a;

    /* renamed from: c */
    public final /* synthetic */ Context f2242c;

    public /* synthetic */ zzcd(Context context, Context context2) {
        this.f2241a = context;
        this.f2242c = context2;
    }

    public final Object call() {
        SharedPreferences sharedPreferences;
        Context context = this.f2241a;
        Context context2 = this.f2242c;
        boolean z = false;
        if (context != null) {
            zze.m2645k("Attempting to read user agent from Google Play Services.");
            sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        } else {
            zze.m2645k("Attempting to read user agent from local cache.");
            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zze.m2645k("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(context2);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zze.m2645k("Persisting user agent.");
            }
        }
        return string;
    }
}
