package com.google.android.gms.internal.ads;

import android.location.Location;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbwc implements MediationAdRequest {

    /* renamed from: a */
    private final Date f27861a;

    /* renamed from: b */
    private final int f27862b;

    /* renamed from: c */
    private final Set f27863c;

    /* renamed from: d */
    private final boolean f27864d;

    /* renamed from: e */
    private final Location f27865e;

    /* renamed from: f */
    private final int f27866f;

    /* renamed from: g */
    private final boolean f27867g;

    /* renamed from: h */
    private final String f27868h;

    public zzbwc(@Nullable Date date, int i, @Nullable Set set, @Nullable Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f27861a = date;
        this.f27862b = i;
        this.f27863c = set;
        this.f27865e = location;
        this.f27864d = z;
        this.f27866f = i2;
        this.f27867g = z2;
        this.f27868h = str;
    }

    /* renamed from: b */
    public final int mo20476b() {
        return this.f27866f;
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo20477c() {
        return this.f27867g;
    }

    @Deprecated
    /* renamed from: d */
    public final Date mo20478d() {
        return this.f27861a;
    }

    /* renamed from: e */
    public final boolean mo20479e() {
        return this.f27864d;
    }

    @Deprecated
    /* renamed from: g */
    public final int mo20480g() {
        return this.f27862b;
    }

    /* renamed from: i */
    public final Set<String> mo20481i() {
        return this.f27863c;
    }
}
