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
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zzj();
    @SafeParcelable.Field

    /* renamed from: a */
    private final SignInPassword f2819a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f2820c;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
    }

    @SafeParcelable.Constructor
    SavePasswordRequest(@SafeParcelable.Param SignInPassword signInPassword, @SafeParcelable.Param @Nullable String str) {
        this.f2819a = (SignInPassword) Preconditions.m4488k(signInPassword);
        this.f2820c = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!Objects.m4470a(this.f2819a, savePasswordRequest.f2819a) || !Objects.m4470a(this.f2820c, savePasswordRequest.f2820c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m4471b(this.f2819a, this.f2820c);
    }

    /* renamed from: l2 */
    public SignInPassword mo20905l2() {
        return this.f2819a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, mo20905l2(), i, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f2820c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
