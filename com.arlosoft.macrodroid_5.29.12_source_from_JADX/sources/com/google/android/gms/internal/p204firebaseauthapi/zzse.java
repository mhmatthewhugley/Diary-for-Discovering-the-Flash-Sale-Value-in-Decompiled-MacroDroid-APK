package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzse */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzse> CREATOR = new zzsf();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f40386a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final ActionCodeSettings f40387c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f40388d;

    @SafeParcelable.Constructor
    public zzse(@SafeParcelable.Param String str, @SafeParcelable.Param ActionCodeSettings actionCodeSettings, @SafeParcelable.Param @Nullable String str2) {
        this.f40386a = str;
        this.f40387c = actionCodeSettings;
        this.f40388d = str2;
    }

    /* renamed from: l2 */
    public final ActionCodeSettings mo49808l2() {
        return this.f40387c;
    }

    /* renamed from: m2 */
    public final String mo49809m2() {
        return this.f40386a;
    }

    /* renamed from: n2 */
    public final String mo49810n2() {
        return this.f40388d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40386a, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f40387c, i, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f40388d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
