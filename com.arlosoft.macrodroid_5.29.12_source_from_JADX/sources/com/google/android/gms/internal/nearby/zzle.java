package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
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
public final class zzle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzle> CREATOR = new zzlf();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44855a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f44856c;
    @SafeParcelable.Field

    /* renamed from: d */
    private String f44857d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private BluetoothDevice f44858f;
    @SafeParcelable.Field

    /* renamed from: g */
    private byte[] f44859g;

    private zzle() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzle) {
            zzle zzle = (zzle) obj;
            return Objects.m4470a(this.f44855a, zzle.f44855a) && Objects.m4470a(this.f44856c, zzle.f44856c) && Objects.m4470a(this.f44857d, zzle.f44857d) && Objects.m4470a(this.f44858f, zzle.f44858f) && Arrays.equals(this.f44859g, zzle.f44859g);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44855a, this.f44856c, this.f44857d, this.f44858f, Integer.valueOf(Arrays.hashCode(this.f44859g)));
    }

    @Nullable
    /* renamed from: l2 */
    public final BluetoothDevice mo52855l2() {
        return this.f44858f;
    }

    /* renamed from: m2 */
    public final String mo52856m2() {
        return this.f44855a;
    }

    /* renamed from: n2 */
    public final String mo52857n2() {
        return this.f44857d;
    }

    /* renamed from: o2 */
    public final String mo52858o2() {
        return this.f44856c;
    }

    /* renamed from: p2 */
    public final byte[] mo52859p2() {
        return this.f44859g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44855a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f44856c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f44857d, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f44858f, i, false);
        SafeParcelWriter.m4569g(parcel, 5, this.f44859g, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzle(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param @Nullable BluetoothDevice bluetoothDevice, @SafeParcelable.Param byte[] bArr) {
        this.f44855a = str;
        this.f44856c = str2;
        this.f44857d = str3;
        this.f44858f = bluetoothDevice;
        this.f44859g = bArr;
    }
}
