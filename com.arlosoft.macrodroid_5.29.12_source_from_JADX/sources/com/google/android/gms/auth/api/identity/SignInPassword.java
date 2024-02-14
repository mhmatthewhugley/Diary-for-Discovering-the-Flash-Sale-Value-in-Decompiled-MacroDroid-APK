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
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new zzo();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f2829a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f2830c;

    @SafeParcelable.Constructor
    public SignInPassword(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f2829a = Preconditions.m4485h(((String) Preconditions.m4489l(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f2830c = Preconditions.m4484g(str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        if (!Objects.m4470a(this.f2829a, signInPassword.f2829a) || !Objects.m4470a(this.f2830c, signInPassword.f2830c)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f2829a;
    }

    public int hashCode() {
        return Objects.m4471b(this.f2829a, this.f2830c);
    }

    /* renamed from: l2 */
    public String mo20924l2() {
        return this.f2830c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, getId(), false);
        SafeParcelWriter.m4586x(parcel, 2, mo20924l2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
