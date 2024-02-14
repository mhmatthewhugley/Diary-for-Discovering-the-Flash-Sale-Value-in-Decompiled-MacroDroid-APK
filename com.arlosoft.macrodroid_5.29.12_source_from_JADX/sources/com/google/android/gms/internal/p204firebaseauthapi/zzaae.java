package com.google.android.gms.internal.p204firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaae */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaae> CREATOR = new zzaaf();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f39470a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f39471c;
    @SafeParcelable.Field

    /* renamed from: d */
    private String f39472d;
    @SafeParcelable.Field

    /* renamed from: f */
    private String f39473f;
    @SafeParcelable.Field

    /* renamed from: g */
    private String f39474g;
    @SafeParcelable.Field

    /* renamed from: o */
    private String f39475o;
    @SafeParcelable.Field

    /* renamed from: p */
    private String f39476p;

    public zzaae() {
    }

    @Nullable
    /* renamed from: l2 */
    public final Uri mo48740l2() {
        if (!TextUtils.isEmpty(this.f39472d)) {
            return Uri.parse(this.f39472d);
        }
        return null;
    }

    @Nullable
    /* renamed from: m2 */
    public final String mo48741m2() {
        return this.f39471c;
    }

    @Nullable
    /* renamed from: n2 */
    public final String mo48742n2() {
        return this.f39476p;
    }

    /* renamed from: o2 */
    public final String mo48743o2() {
        return this.f39470a;
    }

    /* renamed from: p2 */
    public final String mo48744p2() {
        return this.f39475o;
    }

    /* renamed from: q2 */
    public final String mo48745q2() {
        return this.f39473f;
    }

    @Nullable
    /* renamed from: r2 */
    public final String mo48746r2() {
        return this.f39474g;
    }

    /* renamed from: s2 */
    public final void mo48747s2(String str) {
        this.f39474g = str;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f39470a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f39471c, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f39472d, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f39473f, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f39474g, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f39475o, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f39476p, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzaae(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7) {
        this.f39470a = str;
        this.f39471c = str2;
        this.f39472d = str3;
        this.f39473f = str4;
        this.f39474g = str5;
        this.f39475o = str6;
        this.f39476p = str7;
    }
}
