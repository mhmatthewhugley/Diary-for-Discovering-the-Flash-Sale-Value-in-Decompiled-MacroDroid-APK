package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();

    /* renamed from: f */
    private static final String f46228f = Cap.class.getSimpleName();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f46229a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final BitmapDescriptor f46230c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final Float f46231d;

    private Cap(int i, @Nullable BitmapDescriptor bitmapDescriptor, @Nullable Float f) {
        Preconditions.m4479b(i != 3 || (bitmapDescriptor != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), bitmapDescriptor, f}));
        this.f46229a = i;
        this.f46230c = bitmapDescriptor;
        this.f46231d = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f46229a == cap.f46229a && Objects.m4470a(this.f46230c, cap.f46230c) && Objects.m4470a(this.f46231d, cap.f46231d);
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f46229a), this.f46230c, this.f46231d);
    }

    public String toString() {
        int i = this.f46229a;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f46229a);
        BitmapDescriptor bitmapDescriptor = this.f46230c;
        if (bitmapDescriptor == null) {
            iBinder = null;
        } else {
            iBinder = bitmapDescriptor.mo54669a().asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 3, iBinder, false);
        SafeParcelWriter.m4574l(parcel, 4, this.f46231d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Cap(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param @androidx.annotation.Nullable java.lang.Float r4) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x000e
        L_0x0004:
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m5043t1(r3)
            com.google.android.gms.maps.model.BitmapDescriptor r0 = new com.google.android.gms.maps.model.BitmapDescriptor
            r0.<init>(r3)
            r3 = r0
        L_0x000e:
            r1.<init>((int) r2, (com.google.android.gms.maps.model.BitmapDescriptor) r3, (java.lang.Float) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Cap.<init>(int, android.os.IBinder, java.lang.Float):void");
    }

    protected Cap(int i) {
        this(i, (BitmapDescriptor) null, (Float) null);
    }
}
