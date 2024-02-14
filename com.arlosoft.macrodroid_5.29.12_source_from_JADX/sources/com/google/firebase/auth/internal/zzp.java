package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzp implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f4678a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f4679c;

    /* renamed from: d */
    private final Map f4680d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f4681f;

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        this.f4678a = str;
        this.f4679c = str2;
        this.f4680d = zzaz.m6197c(str2);
        this.f4681f = z;
    }

    public zzp(boolean z) {
        this.f4681f = z;
        this.f4679c = null;
        this.f4678a = null;
        this.f4680d = null;
    }

    /* renamed from: R0 */
    public final boolean mo22575R0() {
        return this.f4681f;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4678a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f4679c, false);
        SafeParcelWriter.m4565c(parcel, 3, this.f4681f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
