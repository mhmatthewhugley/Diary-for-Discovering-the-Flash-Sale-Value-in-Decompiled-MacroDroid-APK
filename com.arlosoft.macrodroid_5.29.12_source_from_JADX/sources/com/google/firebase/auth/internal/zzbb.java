package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List f4634a;

    @SafeParcelable.Constructor
    zzbb(@SafeParcelable.Param List list) {
        this.f4634a = list == null ? new ArrayList() : list;
    }

    /* renamed from: l2 */
    public final List mo22756l2() {
        ArrayList arrayList = new ArrayList();
        for (PhoneMultiFactorInfo add : this.f4634a) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, this.f4634a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
