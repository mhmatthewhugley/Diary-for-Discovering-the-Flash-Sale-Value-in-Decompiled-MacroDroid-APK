package com.google.android.gms.appset;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public class AppSetIdInfo {
    @NonNull

    /* renamed from: a */
    private final String f2631a;

    /* renamed from: b */
    private final int f2632b;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
    public @interface Scope {
    }

    public AppSetIdInfo(@NonNull String str, int i) {
        this.f2631a = str;
        this.f2632b = i;
    }

    @NonNull
    /* renamed from: a */
    public String mo20737a() {
        return this.f2631a;
    }

    /* renamed from: b */
    public int mo20738b() {
        return this.f2632b;
    }
}
