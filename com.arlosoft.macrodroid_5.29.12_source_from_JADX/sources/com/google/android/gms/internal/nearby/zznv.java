package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

@RequiresApi(26)
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznv> CREATOR = new zznw();
    @SafeParcelable.Field

    /* renamed from: A */
    private final int f44979A;
    @SafeParcelable.Field

    /* renamed from: a */
    private final long f44980a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f44981c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f44982d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final String f44983f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final long f44984g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final String f44985o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final byte[] f44986p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    private final byte[] f44987s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final List f44988z;

    @SafeParcelable.Constructor
    zznv(@SafeParcelable.Param long j, @SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param long j2, @SafeParcelable.Param String str3, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param @Nullable byte[] bArr2, @SafeParcelable.Param List list, @SafeParcelable.Param int i2) {
        this.f44980a = j;
        this.f44981c = str;
        this.f44982d = i;
        this.f44983f = str2;
        this.f44984g = j2;
        this.f44985o = str3;
        this.f44986p = bArr;
        this.f44987s = bArr2;
        this.f44988z = list;
        this.f44979A = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zznv) {
            zznv zznv = (zznv) obj;
            if (!Objects.m4470a(Long.valueOf(this.f44980a), Long.valueOf(zznv.f44980a)) || !Objects.m4470a(this.f44981c, zznv.f44981c) || !Objects.m4470a(Integer.valueOf(this.f44982d), Integer.valueOf(zznv.f44982d)) || !Objects.m4470a(this.f44983f, zznv.f44983f) || !Objects.m4470a(this.f44985o, zznv.f44985o) || !Arrays.equals(this.f44986p, zznv.f44986p) || !Arrays.equals(this.f44987s, zznv.f44987s) || !Objects.m4470a(this.f44988z, zznv.f44988z) || !Objects.m4470a(Integer.valueOf(this.f44979A), Integer.valueOf(zznv.f44979A))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(Long.valueOf(this.f44980a), this.f44981c, Integer.valueOf(this.f44982d), this.f44983f, this.f44985o, Integer.valueOf(Arrays.hashCode(this.f44986p)), Integer.valueOf(Arrays.hashCode(this.f44987s)), this.f44988z, Integer.valueOf(this.f44979A));
    }

    @Nullable
    /* renamed from: l2 */
    public final byte[] mo53047l2() {
        byte[] bArr = this.f44987s;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Nullable
    /* renamed from: m2 */
    public final byte[] mo53048m2() {
        byte[] bArr = this.f44986p;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[10];
        objArr[0] = Long.valueOf(this.f44980a);
        objArr[1] = this.f44981c;
        objArr[2] = Integer.valueOf(this.f44982d);
        objArr[3] = this.f44983f;
        objArr[4] = Long.valueOf(this.f44984g);
        objArr[5] = this.f44985o;
        byte[] bArr = this.f44986p;
        Integer num = null;
        if (bArr == null) {
            str = null;
        } else {
            str = Arrays.toString(bArr);
        }
        objArr[6] = str;
        byte[] bArr2 = this.f44987s;
        if (bArr2 != null) {
            num = Integer.valueOf(Arrays.hashCode(bArr2));
        }
        objArr[7] = num;
        objArr[8] = this.f44988z;
        objArr[9] = Integer.valueOf(this.f44979A);
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s>", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4581s(parcel, 1, this.f44980a);
        SafeParcelWriter.m4586x(parcel, 2, this.f44981c, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f44982d);
        SafeParcelWriter.m4586x(parcel, 4, this.f44983f, false);
        SafeParcelWriter.m4581s(parcel, 5, this.f44984g);
        SafeParcelWriter.m4586x(parcel, 6, this.f44985o, false);
        SafeParcelWriter.m4569g(parcel, 7, mo53048m2(), false);
        SafeParcelWriter.m4569g(parcel, 8, mo53047l2(), false);
        List list = this.f44988z;
        SafeParcelWriter.m4558B(parcel, 9, list == null ? zzsq.m63014q() : zzsq.m63013p(list), false);
        SafeParcelWriter.m4576n(parcel, 10, this.f44979A);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
