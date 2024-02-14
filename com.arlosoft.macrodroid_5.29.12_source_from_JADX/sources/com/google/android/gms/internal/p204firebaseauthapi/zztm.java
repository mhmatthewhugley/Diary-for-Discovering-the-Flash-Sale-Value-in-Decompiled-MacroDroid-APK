package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.internal.zzba;
import com.google.firebase.auth.zze;
import java.util.List;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zztm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztm> CREATOR = new zztn();
    @SafeParcelable.Field

    /* renamed from: a */
    final String f40433a;
    @SafeParcelable.Field

    /* renamed from: c */
    final List f40434c;
    @SafeParcelable.Field

    /* renamed from: d */
    final zze f40435d;

    @SafeParcelable.Constructor
    public zztm(@SafeParcelable.Param String str, @SafeParcelable.Param List list, @SafeParcelable.Param @Nullable zze zze) {
        this.f40433a = str;
        this.f40434c = list;
        this.f40435d = zze;
    }

    /* renamed from: l2 */
    public final zze mo49904l2() {
        return this.f40435d;
    }

    /* renamed from: m2 */
    public final String mo49905m2() {
        return this.f40433a;
    }

    /* renamed from: n2 */
    public final List mo49906n2() {
        return zzba.m6201b(this.f40434c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f40433a, false);
        SafeParcelWriter.m4558B(parcel, 2, this.f40434c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f40435d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
