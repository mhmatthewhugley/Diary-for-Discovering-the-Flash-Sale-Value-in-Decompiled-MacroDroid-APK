package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class WakeLockEvent extends StatsEvent {
    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.Field

    /* renamed from: A */
    private final long f3913A;
    @SafeParcelable.Field

    /* renamed from: B */
    private int f3914B;
    @SafeParcelable.Field

    /* renamed from: C */
    private final String f3915C;
    @SafeParcelable.Field

    /* renamed from: D */
    private final float f3916D;
    @SafeParcelable.Field

    /* renamed from: E */
    private final long f3917E;
    @SafeParcelable.Field

    /* renamed from: F */
    private final boolean f3918F;

    /* renamed from: G */
    private long f3919G = -1;
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3920a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final long f3921c;
    @SafeParcelable.Field

    /* renamed from: d */
    private int f3922d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f3923f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f3924g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final String f3925o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final int f3926p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final List f3927s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final String f3928z;

    @SafeParcelable.Constructor
    WakeLockEvent(@SafeParcelable.Param int i, @SafeParcelable.Param long j, @SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param int i3, @SafeParcelable.Param List list, @SafeParcelable.Param String str2, @SafeParcelable.Param long j2, @SafeParcelable.Param int i4, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param float f, @SafeParcelable.Param long j3, @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z) {
        this.f3920a = i;
        this.f3921c = j;
        this.f3922d = i2;
        this.f3923f = str;
        this.f3924g = str3;
        this.f3925o = str5;
        this.f3926p = i3;
        this.f3927s = list;
        this.f3928z = str2;
        this.f3913A = j2;
        this.f3914B = i4;
        this.f3915C = str4;
        this.f3916D = f;
        this.f3917E = j3;
        this.f3918F = z;
    }

    /* renamed from: a */
    public final long mo21941a() {
        return this.f3921c;
    }

    @NonNull
    /* renamed from: l2 */
    public final String mo21942l2() {
        String str;
        List list = this.f3927s;
        String str2 = this.f3923f;
        int i = this.f3926p;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f3914B;
        String str4 = this.f3924g;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f3915C;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f3916D;
        String str6 = this.f3925o;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f3918F;
        return "\t" + str2 + "\t" + i + "\t" + str + "\t" + i2 + "\t" + str4 + "\t" + str5 + "\t" + f + "\t" + str3 + "\t" + z;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3920a);
        SafeParcelWriter.m4581s(parcel, 2, this.f3921c);
        SafeParcelWriter.m4586x(parcel, 4, this.f3923f, false);
        SafeParcelWriter.m4576n(parcel, 5, this.f3926p);
        SafeParcelWriter.m4588z(parcel, 6, this.f3927s, false);
        SafeParcelWriter.m4581s(parcel, 8, this.f3913A);
        SafeParcelWriter.m4586x(parcel, 10, this.f3924g, false);
        SafeParcelWriter.m4576n(parcel, 11, this.f3922d);
        SafeParcelWriter.m4586x(parcel, 12, this.f3928z, false);
        SafeParcelWriter.m4586x(parcel, 13, this.f3915C, false);
        SafeParcelWriter.m4576n(parcel, 14, this.f3914B);
        SafeParcelWriter.m4573k(parcel, 15, this.f3916D);
        SafeParcelWriter.m4581s(parcel, 16, this.f3917E);
        SafeParcelWriter.m4586x(parcel, 17, this.f3925o, false);
        SafeParcelWriter.m4565c(parcel, 18, this.f3918F);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f3922d;
    }

    public final long zzb() {
        return this.f3919G;
    }
}
