package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzy();
    @SafeParcelable.Field

    /* renamed from: a */
    private int f53847a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f53848c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f53849d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f53850f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final byte[] f53851g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final boolean f53852o;

    @SafeParcelable.Constructor
    zzb(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param boolean z2) {
        this.f53847a = i;
        this.f53848c = z;
        this.f53849d = str;
        this.f53850f = str2;
        this.f53851g = bArr;
        this.f53852o = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MetadataImpl { { eventStatus: '");
        sb.append(this.f53847a);
        sb.append("' } { uploadable: '");
        sb.append(this.f53848c);
        sb.append("' } ");
        if (this.f53849d != null) {
            sb.append("{ completionToken: '");
            sb.append(this.f53849d);
            sb.append("' } ");
        }
        if (this.f53850f != null) {
            sb.append("{ accountName: '");
            sb.append(this.f53850f);
            sb.append("' } ");
        }
        if (this.f53851g != null) {
            sb.append("{ ssbContext: [ ");
            for (byte hexString : this.f53851g) {
                sb.append("0x");
                sb.append(Integer.toHexString(hexString));
                sb.append(" ");
            }
            sb.append("] } ");
        }
        sb.append("{ contextOnly: '");
        sb.append(this.f53852o);
        sb.append("' } }");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f53847a);
        SafeParcelWriter.m4565c(parcel, 2, this.f53848c);
        SafeParcelWriter.m4586x(parcel, 3, this.f53849d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f53850f, false);
        SafeParcelWriter.m4569g(parcel, 5, this.f53851g, false);
        SafeParcelWriter.m4565c(parcel, 6, this.f53852o);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
