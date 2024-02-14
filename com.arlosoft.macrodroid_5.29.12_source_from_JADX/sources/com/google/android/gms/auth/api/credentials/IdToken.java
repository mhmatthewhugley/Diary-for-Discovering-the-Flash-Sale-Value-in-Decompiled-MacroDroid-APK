package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new zzk();
    @SafeParcelable.Field
    @NonNull

    /* renamed from: a */
    private final String f2793a;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: c */
    private final String f2794c;

    @SafeParcelable.Constructor
    public IdToken(@SafeParcelable.Param @NonNull String str, @SafeParcelable.Param @NonNull String str2) {
        Preconditions.m4479b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        Preconditions.m4479b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f2793a = str;
        this.f2794c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return Objects.m4470a(this.f2793a, idToken.f2793a) && Objects.m4470a(this.f2794c, idToken.f2794c);
    }

    @NonNull
    /* renamed from: l2 */
    public final String mo20862l2() {
        return this.f2793a;
    }

    @NonNull
    /* renamed from: m2 */
    public final String mo20863m2() {
        return this.f2794c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, mo20862l2(), false);
        SafeParcelWriter.m4586x(parcel, 2, mo20863m2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
