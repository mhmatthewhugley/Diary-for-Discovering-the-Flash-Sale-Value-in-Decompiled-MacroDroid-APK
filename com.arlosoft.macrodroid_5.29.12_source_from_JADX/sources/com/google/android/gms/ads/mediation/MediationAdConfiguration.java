package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class MediationAdConfiguration {

    /* renamed from: a */
    private final String f2405a;

    /* renamed from: b */
    private final Bundle f2406b;

    /* renamed from: c */
    private final Bundle f2407c;

    /* renamed from: d */
    private final Context f2408d;

    /* renamed from: e */
    private final boolean f2409e;
    @Nullable

    /* renamed from: f */
    private final Location f2410f;

    /* renamed from: g */
    private final int f2411g;

    /* renamed from: h */
    private final int f2412h;
    @Nullable

    /* renamed from: i */
    private final String f2413i;

    /* renamed from: j */
    private final String f2414j;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle, @NonNull Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @Nullable String str2, @NonNull String str3) {
        this.f2405a = str;
        this.f2406b = bundle;
        this.f2407c = bundle2;
        this.f2408d = context;
        this.f2409e = z;
        this.f2410f = location;
        this.f2411g = i;
        this.f2412h = i2;
        this.f2413i = str2;
        this.f2414j = str3;
    }
}
