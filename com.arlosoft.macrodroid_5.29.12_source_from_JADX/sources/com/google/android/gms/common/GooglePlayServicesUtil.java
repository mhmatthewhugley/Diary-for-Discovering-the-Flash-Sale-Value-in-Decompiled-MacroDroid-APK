package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    @Deprecated

    /* renamed from: f */
    public static final int f3064f = GooglePlayServicesUtilLight.f3065a;

    private GooglePlayServicesUtil() {
    }

    @NonNull
    /* renamed from: e */
    public static Context m3557e(@NonNull Context context) {
        return GooglePlayServicesUtilLight.m3564e(context);
    }

    @NonNull
    /* renamed from: f */
    public static Resources m3558f(@NonNull Context context) {
        return GooglePlayServicesUtilLight.m3565f(context);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: h */
    public static int m3559h(@NonNull Context context, int i) {
        return GooglePlayServicesUtilLight.m3567h(context, i);
    }
}
