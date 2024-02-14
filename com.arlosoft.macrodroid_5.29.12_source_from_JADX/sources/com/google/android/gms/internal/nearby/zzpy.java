package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzpy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpy> CREATOR = new zzpz();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public int f45015a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public int f45016c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: d */
    public byte[] f45017d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: f */
    public zzqv f45018f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: g */
    public int f45019g;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: o */
    public zzrv[] f45020o;

    private zzpy() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpy) {
            zzpy zzpy = (zzpy) obj;
            return Objects.m4470a(Integer.valueOf(this.f45015a), Integer.valueOf(zzpy.f45015a)) && Objects.m4470a(Integer.valueOf(this.f45016c), Integer.valueOf(zzpy.f45016c)) && Arrays.equals(this.f45017d, zzpy.f45017d) && Objects.m4470a(this.f45018f, zzpy.f45018f) && Objects.m4470a(Integer.valueOf(this.f45019g), Integer.valueOf(zzpy.f45019g)) && Arrays.equals(this.f45020o, zzpy.f45020o);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45015a), Integer.valueOf(this.f45016c), Integer.valueOf(Arrays.hashCode(this.f45017d)), this.f45018f, Integer.valueOf(this.f45019g), Integer.valueOf(Arrays.hashCode(this.f45020o)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45015a);
        SafeParcelWriter.m4576n(parcel, 2, this.f45016c);
        SafeParcelWriter.m4569g(parcel, 3, this.f45017d, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f45018f, i, false);
        SafeParcelWriter.m4576n(parcel, 5, this.f45019g);
        SafeParcelWriter.m4557A(parcel, 6, this.f45020o, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzpy(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param zzqv zzqv, @SafeParcelable.Param int i3, @SafeParcelable.Param zzrv[] zzrvArr) {
        this.f45015a = i;
        this.f45016c = i2;
        this.f45017d = bArr;
        this.f45018f = zzqv;
        this.f45019g = i3;
        this.f45020o = zzrvArr;
    }

    /* synthetic */ zzpy(zzpx zzpx) {
    }
}
