package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdValue {

    /* renamed from: a */
    private final int f1694a;

    /* renamed from: b */
    private final String f1695b;

    /* renamed from: c */
    private final long f1696c;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface PrecisionType {
    }

    private AdValue(int i, String str, long j) {
        this.f1694a = i;
        this.f1695b = str;
        this.f1696c = j;
    }

    @NonNull
    /* renamed from: a */
    public static AdValue m1714a(int i, @NonNull String str, long j) {
        return new AdValue(i, str, j);
    }
}
