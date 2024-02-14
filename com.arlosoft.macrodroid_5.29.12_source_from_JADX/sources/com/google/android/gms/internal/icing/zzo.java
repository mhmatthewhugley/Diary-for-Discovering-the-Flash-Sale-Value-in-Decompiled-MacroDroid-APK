package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzo extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: a */
    public Status f41035a;
    @SafeParcelable.Field

    /* renamed from: c */
    public List<zzx> f41036c;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: d */
    public String[] f41037d;

    public zzo() {
    }

    public final Status getStatus() {
        return this.f41035a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f41035a, i, false);
        SafeParcelWriter.m4558B(parcel, 2, this.f41036c, false);
        SafeParcelWriter.m4587y(parcel, 3, this.f41037d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param Status status, @SafeParcelable.Param List<zzx> list, @SafeParcelable.Param String[] strArr) {
        this.f41035a = status;
        this.f41036c = list;
        this.f41037d = strArr;
    }
}
