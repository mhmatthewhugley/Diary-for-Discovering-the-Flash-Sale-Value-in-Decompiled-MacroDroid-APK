package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new zzjm();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public String f44808a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f44809c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private zznv f44810d;

    private zzjl() {
        this.f44809c = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjl) {
            zzjl zzjl = (zzjl) obj;
            return Objects.m4470a(this.f44808a, zzjl.f44808a) && Objects.m4470a(Integer.valueOf(this.f44809c), Integer.valueOf(zzjl.f44809c)) && Objects.m4470a(this.f44810d, zzjl.f44810d);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44808a, Integer.valueOf(this.f44809c), this.f44810d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44808a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f44809c);
        SafeParcelWriter.m4584v(parcel, 3, this.f44810d, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* synthetic */ zzjl(zzjk zzjk) {
        this.f44809c = 0;
    }

    @SafeParcelable.Constructor
    zzjl(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable zznv zznv) {
        this.f44808a = str;
        this.f44809c = i;
        this.f44810d = zznv;
    }
}
