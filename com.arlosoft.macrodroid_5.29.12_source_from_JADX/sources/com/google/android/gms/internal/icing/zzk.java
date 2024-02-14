package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();

    /* renamed from: g */
    public static final int f41027g = Integer.parseInt("-1");

    /* renamed from: o */
    private static final zzs f41028o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public final String f41029a;
    @SafeParcelable.Field

    /* renamed from: c */
    final zzs f41030c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f41031d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public final byte[] f41032f;

    static {
        zzr zzr = new zzr("SsbContext");
        zzr.mo50475b(true);
        zzr.mo50474a("blob");
        f41028o = zzr.mo50476c();
    }

    @SafeParcelable.Constructor
    zzk(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param zzs zzs, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable byte[] bArr) {
        int i2 = f41027g;
        boolean z = true;
        if (i != i2 && zzq.m59120a(i) == null) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        Preconditions.m4479b(z, sb.toString());
        this.f41029a = str;
        this.f41030c = zzs;
        this.f41031d = i;
        this.f41032f = bArr;
        String str2 = null;
        if (i != i2 && zzq.m59120a(i) == null) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid section type ");
            sb2.append(i);
            str2 = sb2.toString();
        } else if (!(str == null || bArr == null)) {
            str2 = "Both content and blobContent set";
        }
        if (str2 != null) {
            throw new IllegalArgumentException(str2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f41029a, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f41030c, i, false);
        SafeParcelWriter.m4576n(parcel, 4, this.f41031d);
        SafeParcelWriter.m4569g(parcel, 5, this.f41032f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
