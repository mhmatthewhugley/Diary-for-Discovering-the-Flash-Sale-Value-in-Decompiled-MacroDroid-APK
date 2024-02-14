package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzng;
import com.google.android.gms.internal.nearby.zznh;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Update> CREATOR = new zzci();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47699a;
    @SafeParcelable.Field

    /* renamed from: c */
    final int f47700c;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: d */
    public final Message f47701d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public final zze f47702f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    public final zza f47703g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public final zznh f47704o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public final byte[] f47705p;

    @SafeParcelable.Constructor
    Update(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param Message message, @SafeParcelable.Param @Nullable zze zze, @SafeParcelable.Param @Nullable zza zza, @SafeParcelable.Param @Nullable zznh zznh, @SafeParcelable.Param @Nullable byte[] bArr) {
        this.f47699a = i;
        boolean m2 = m66437m2(i2, 2);
        bArr = true == m2 ? null : bArr;
        zznh = true == m2 ? null : zznh;
        zza = true == m2 ? null : zza;
        zze = true == m2 ? null : zze;
        this.f47700c = true == m2 ? 2 : i2;
        this.f47701d = message;
        this.f47702f = zze;
        this.f47703g = zza;
        this.f47704o = zznh;
        this.f47705p = bArr;
    }

    /* renamed from: m2 */
    public static boolean m66437m2(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.f47700c == update.f47700c && Objects.m4470a(this.f47701d, update.f47701d) && Objects.m4470a(this.f47702f, update.f47702f) && Objects.m4470a(this.f47703g, update.f47703g) && Objects.m4470a(this.f47704o, update.f47704o) && Arrays.equals(this.f47705p, update.f47705p);
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47700c), this.f47701d, this.f47702f, this.f47703g, this.f47704o, this.f47705p);
    }

    /* renamed from: l2 */
    public final boolean mo55925l2(int i) {
        return m66437m2(this.f47700c, i);
    }

    @NonNull
    public final String toString() {
        ArraySet arraySet = new ArraySet();
        if (m66437m2(this.f47700c, 1)) {
            arraySet.add("FOUND");
        }
        if (m66437m2(this.f47700c, 2)) {
            arraySet.add("LOST");
        }
        if (m66437m2(this.f47700c, 4)) {
            arraySet.add("DISTANCE");
        }
        if (m66437m2(this.f47700c, 8)) {
            arraySet.add("BLE_SIGNAL");
        }
        if (m66437m2(this.f47700c, 16)) {
            arraySet.add("DEVICE");
        }
        if (m66437m2(this.f47700c, 32)) {
            arraySet.add("BLE_RECORD");
        }
        String obj = arraySet.toString();
        String valueOf = String.valueOf(this.f47701d);
        String valueOf2 = String.valueOf(this.f47702f);
        String valueOf3 = String.valueOf(this.f47703g);
        String valueOf4 = String.valueOf(this.f47704o);
        String valueOf5 = String.valueOf(zzng.m62816a(this.f47705p));
        return "Update{types=" + obj + ", message=" + valueOf + ", distance=" + valueOf2 + ", bleSignal=" + valueOf3 + ", device=" + valueOf4 + ", bleRecord=" + valueOf5 + "}";
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47699a);
        SafeParcelWriter.m4576n(parcel, 2, this.f47700c);
        SafeParcelWriter.m4584v(parcel, 3, this.f47701d, i, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f47702f, i, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f47703g, i, false);
        SafeParcelWriter.m4584v(parcel, 6, this.f47704o, i, false);
        SafeParcelWriter.m4569g(parcel, 7, this.f47705p, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
