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
public final class zzku extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzku> CREATOR = new zzkv();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44836a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f44837c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private byte[] f44838d;

    private zzku() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzku) {
            zzku zzku = (zzku) obj;
            return Objects.m4470a(this.f44836a, zzku.f44836a) && Objects.m4470a(this.f44837c, zzku.f44837c) && Arrays.equals(this.f44838d, zzku.f44838d);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44836a, this.f44837c, Integer.valueOf(Arrays.hashCode(this.f44838d)));
    }

    /* renamed from: l2 */
    public final String mo52818l2() {
        return this.f44837c;
    }

    @Nullable
    /* renamed from: m2 */
    public final byte[] mo52819m2() {
        return this.f44838d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44836a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f44837c, false);
        SafeParcelWriter.m4569g(parcel, 3, this.f44838d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f44836a;
    }

    @SafeParcelable.Constructor
    zzku(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param @Nullable byte[] bArr) {
        this.f44836a = str;
        this.f44837c = str2;
        this.f44838d = bArr;
    }
}
