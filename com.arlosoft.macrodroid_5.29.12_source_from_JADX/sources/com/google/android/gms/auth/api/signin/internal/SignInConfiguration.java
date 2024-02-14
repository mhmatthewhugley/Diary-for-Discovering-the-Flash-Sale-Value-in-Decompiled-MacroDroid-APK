package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zzx();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f2916a;
    @SafeParcelable.Field

    /* renamed from: c */
    private GoogleSignInOptions f2917c;

    @SafeParcelable.Constructor
    public SignInConfiguration(@SafeParcelable.Param String str, @SafeParcelable.Param GoogleSignInOptions googleSignInOptions) {
        this.f2916a = Preconditions.m4484g(str);
        this.f2917c = googleSignInOptions;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f2916a.equals(signInConfiguration.f2916a)) {
            GoogleSignInOptions googleSignInOptions = this.f2917c;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f2917c == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f2917c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new HashAccumulator().mo21005a(this.f2916a).mo21005a(this.f2917c).mo21006b();
    }

    /* renamed from: l2 */
    public final GoogleSignInOptions mo21010l2() {
        return this.f2917c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f2916a, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f2917c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
