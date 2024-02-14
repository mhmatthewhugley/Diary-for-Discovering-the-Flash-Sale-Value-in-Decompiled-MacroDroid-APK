package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzk();
    @SafeParcelable.VersionField

    /* renamed from: a */
    private final int f2653a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f2654c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final Long f2655d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f2656f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f2657g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final List<String> f2658o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final String f2659p;

    @SafeParcelable.Constructor
    TokenData(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param Long l, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param List<String> list, @SafeParcelable.Param String str2) {
        this.f2653a = i;
        this.f2654c = Preconditions.m4484g(str);
        this.f2655d = l;
        this.f2656f = z;
        this.f2657g = z2;
        this.f2658o = list;
        this.f2659p = str2;
    }

    @Nullable
    /* renamed from: l2 */
    public static TokenData m3119l2(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f2654c, tokenData.f2654c) || !Objects.m4470a(this.f2655d, tokenData.f2655d) || this.f2656f != tokenData.f2656f || this.f2657g != tokenData.f2657g || !Objects.m4470a(this.f2658o, tokenData.f2658o) || !Objects.m4470a(this.f2659p, tokenData.f2659p)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m4471b(this.f2654c, this.f2655d, Boolean.valueOf(this.f2656f), Boolean.valueOf(this.f2657g), this.f2658o, this.f2659p);
    }

    /* renamed from: m2 */
    public final String mo20758m2() {
        return this.f2654c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2653a);
        SafeParcelWriter.m4586x(parcel, 2, this.f2654c, false);
        SafeParcelWriter.m4582t(parcel, 3, this.f2655d, false);
        SafeParcelWriter.m4565c(parcel, 4, this.f2656f);
        SafeParcelWriter.m4565c(parcel, 5, this.f2657g);
        SafeParcelWriter.m4588z(parcel, 6, this.f2658o, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f2659p, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
