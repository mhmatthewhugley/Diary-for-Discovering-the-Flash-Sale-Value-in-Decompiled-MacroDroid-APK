package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new zzg();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f2816a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f2817c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private String f2818d;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
    }

    @SafeParcelable.Constructor
    GetSignInIntentRequest(@SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable String str3) {
        Preconditions.m4488k(str);
        this.f2816a = str;
        this.f2817c = str2;
        this.f2818d = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        if (!Objects.m4470a(this.f2816a, getSignInIntentRequest.f2816a) || !Objects.m4470a(this.f2817c, getSignInIntentRequest.f2817c) || !Objects.m4470a(this.f2818d, getSignInIntentRequest.f2818d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m4471b(this.f2816a, this.f2817c, this.f2818d);
    }

    @Nullable
    /* renamed from: l2 */
    public String mo20900l2() {
        return this.f2817c;
    }

    /* renamed from: m2 */
    public String mo20901m2() {
        return this.f2816a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, mo20901m2(), false);
        SafeParcelWriter.m4586x(parcel, 2, mo20900l2(), false);
        SafeParcelWriter.m4586x(parcel, 3, this.f2818d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
