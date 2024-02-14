package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzti */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzti extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzti> CREATOR = new zztj();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40426a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f40427c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final ActionCodeSettings f40428d;

    @SafeParcelable.Constructor
    public zzti(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param ActionCodeSettings actionCodeSettings) {
        this.f40426a = str;
        this.f40427c = str2;
        this.f40428d = actionCodeSettings;
    }

    /* renamed from: l2 */
    public final ActionCodeSettings mo49891l2() {
        return this.f40428d;
    }

    /* renamed from: m2 */
    public final String mo49892m2() {
        return this.f40426a;
    }

    /* renamed from: n2 */
    public final String mo49893n2() {
        return this.f40427c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40426a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f40427c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f40428d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
