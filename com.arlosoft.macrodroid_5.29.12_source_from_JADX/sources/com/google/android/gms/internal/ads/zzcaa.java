package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcaa> CREATOR = new zzcab();
    @SafeParcelable.Field

    /* renamed from: a */
    public final View f28039a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final Map f28040c;

    @SafeParcelable.Constructor
    public zzcaa(@SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2) {
        this.f28039a = (View) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder));
        this.f28040c = (Map) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4575m(parcel, 1, ObjectWrapper.m5051g8(this.f28039a).asBinder(), false);
        SafeParcelWriter.m4575m(parcel, 2, ObjectWrapper.m5051g8(this.f28040c).asBinder(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
