package com.google.android.gms.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzed;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class MobileAds {
    private MobileAds() {
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public static void m1728a(@NonNull Context context) {
        zzed.m2259e().mo20079j(context, (String) null, (OnInitializationCompleteListener) null);
    }
}
