package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f3992a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f3993c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f3994d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final Context f3995f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f3996g;

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param String str, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z3) {
        this.f3992a = str;
        this.f3993c = z;
        this.f3994d = z2;
        this.f3995f = (Context) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder));
        this.f3996g = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f3992a, false);
        SafeParcelWriter.m4565c(parcel, 2, this.f3993c);
        SafeParcelWriter.m4565c(parcel, 3, this.f3994d);
        SafeParcelWriter.m4575m(parcel, 4, ObjectWrapper.m5051g8(this.f3995f), false);
        SafeParcelWriter.m4565c(parcel, 5, this.f3996g);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
