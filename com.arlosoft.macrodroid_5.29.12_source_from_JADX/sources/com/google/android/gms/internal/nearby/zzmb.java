package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
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
public final class zzmb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmb> CREATOR = new zzmc();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: A */
    public boolean f44888A;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: B */
    public zzlx f44889B;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: C */
    public long f44890C;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: D */
    public String f44891D;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: E */
    public String f44892E;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public long f44893a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public int f44894c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public byte[] f44895d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public ParcelFileDescriptor f44896f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    public String f44897g;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: o */
    public long f44898o;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public ParcelFileDescriptor f44899p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    private Uri f44900s;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: z */
    public long f44901z;

    private zzmb() {
        this.f44898o = -1;
        this.f44901z = 0;
        this.f44888A = false;
        this.f44890C = 0;
    }

    @Nullable
    /* renamed from: D2 */
    public final byte[] mo52928D2() {
        return this.f44895d;
    }

    /* renamed from: a */
    public final long mo52929a() {
        return this.f44898o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmb) {
            zzmb zzmb = (zzmb) obj;
            return Objects.m4470a(Long.valueOf(this.f44893a), Long.valueOf(zzmb.f44893a)) && Objects.m4470a(Integer.valueOf(this.f44894c), Integer.valueOf(zzmb.f44894c)) && Arrays.equals(this.f44895d, zzmb.f44895d) && Objects.m4470a(this.f44896f, zzmb.f44896f) && Objects.m4470a(this.f44897g, zzmb.f44897g) && Objects.m4470a(Long.valueOf(this.f44898o), Long.valueOf(zzmb.f44898o)) && Objects.m4470a(this.f44899p, zzmb.f44899p) && Objects.m4470a(this.f44900s, zzmb.f44900s) && Objects.m4470a(Long.valueOf(this.f44901z), Long.valueOf(zzmb.f44901z)) && Objects.m4470a(Boolean.valueOf(this.f44888A), Boolean.valueOf(zzmb.f44888A)) && Objects.m4470a(this.f44889B, zzmb.f44889B) && Objects.m4470a(Long.valueOf(this.f44890C), Long.valueOf(zzmb.f44890C)) && Objects.m4470a(this.f44891D, zzmb.f44891D) && Objects.m4470a(this.f44892E, zzmb.f44892E);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Long.valueOf(this.f44893a), Integer.valueOf(this.f44894c), Integer.valueOf(Arrays.hashCode(this.f44895d)), this.f44896f, this.f44897g, Long.valueOf(this.f44898o), this.f44899p, this.f44900s, Long.valueOf(this.f44901z), Boolean.valueOf(this.f44888A), this.f44889B, Long.valueOf(this.f44890C), this.f44891D, this.f44892E);
    }

    @Nullable
    /* renamed from: l2 */
    public final Uri mo52932l2() {
        return this.f44900s;
    }

    @Nullable
    /* renamed from: m2 */
    public final ParcelFileDescriptor mo52933m2() {
        return this.f44896f;
    }

    @Nullable
    /* renamed from: n2 */
    public final ParcelFileDescriptor mo52934n2() {
        return this.f44899p;
    }

    @Nullable
    /* renamed from: o2 */
    public final zzlx mo52935o2() {
        return this.f44889B;
    }

    @Nullable
    /* renamed from: p2 */
    public final String mo52936p2() {
        return this.f44897g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4581s(parcel, 1, this.f44893a);
        SafeParcelWriter.m4576n(parcel, 2, this.f44894c);
        SafeParcelWriter.m4569g(parcel, 3, this.f44895d, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f44896f, i, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f44897g, false);
        SafeParcelWriter.m4581s(parcel, 6, this.f44898o);
        SafeParcelWriter.m4584v(parcel, 7, this.f44899p, i, false);
        SafeParcelWriter.m4584v(parcel, 8, this.f44900s, i, false);
        SafeParcelWriter.m4581s(parcel, 9, this.f44901z);
        SafeParcelWriter.m4565c(parcel, 10, this.f44888A);
        SafeParcelWriter.m4584v(parcel, 11, this.f44889B, i, false);
        SafeParcelWriter.m4581s(parcel, 12, this.f44890C);
        SafeParcelWriter.m4586x(parcel, 13, this.f44891D, false);
        SafeParcelWriter.m4586x(parcel, 14, this.f44892E, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f44894c;
    }

    public final long zzb() {
        return this.f44893a;
    }

    @SafeParcelable.Constructor
    zzmb(@SafeParcelable.Param long j, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param @Nullable ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param long j2, @SafeParcelable.Param @Nullable ParcelFileDescriptor parcelFileDescriptor2, @SafeParcelable.Param @Nullable Uri uri, @SafeParcelable.Param long j3, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable zzlx zzlx, @SafeParcelable.Param long j4, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable String str3) {
        this.f44893a = j;
        this.f44894c = i;
        this.f44895d = bArr;
        this.f44896f = parcelFileDescriptor;
        this.f44897g = str;
        this.f44898o = j2;
        this.f44899p = parcelFileDescriptor2;
        this.f44900s = uri;
        this.f44901z = j3;
        this.f44888A = z;
        this.f44889B = zzlx;
        this.f44890C = j4;
        this.f44891D = str2;
        this.f44892E = str3;
    }

    /* synthetic */ zzmb(zzma zzma) {
        this.f44898o = -1;
        this.f44901z = 0;
        this.f44888A = false;
        this.f44890C = 0;
    }
}
