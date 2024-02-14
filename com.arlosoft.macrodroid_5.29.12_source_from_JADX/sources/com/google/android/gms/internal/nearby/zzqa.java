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
public final class zzqa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqa> CREATOR = new zzqb();
    @SafeParcelable.Field

    /* renamed from: a */
    private zzpu f45022a;
    @SafeParcelable.Field

    /* renamed from: c */
    private zzpu f45023c;
    @SafeParcelable.Field

    /* renamed from: d */
    private zzpu f45024d;
    @SafeParcelable.Field

    /* renamed from: f */
    private long f45025f;

    private zzqa() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqa) {
            zzqa zzqa = (zzqa) obj;
            return Objects.m4470a(this.f45022a, zzqa.f45022a) && Objects.m4470a(this.f45023c, zzqa.f45023c) && Objects.m4470a(this.f45024d, zzqa.f45024d) && Objects.m4470a(Long.valueOf(this.f45025f), Long.valueOf(zzqa.f45025f));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45022a, this.f45023c, this.f45024d, Long.valueOf(this.f45025f));
    }

    /* renamed from: l2 */
    public final long mo53161l2() {
        return this.f45025f;
    }

    /* renamed from: m2 */
    public final zzpu mo53162m2() {
        return this.f45023c;
    }

    /* renamed from: n2 */
    public final zzpu mo53163n2() {
        return this.f45022a;
    }

    /* renamed from: o2 */
    public final zzpu mo53164o2() {
        return this.f45024d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f45022a, i, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f45023c, i, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f45024d, i, false);
        SafeParcelWriter.m4581s(parcel, 4, this.f45025f);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzqa(@SafeParcelable.Param zzpu zzpu, @SafeParcelable.Param zzpu zzpu2, @SafeParcelable.Param zzpu zzpu3, @SafeParcelable.Param long j) {
        this.f45022a = zzpu;
        this.f45023c = zzpu2;
        this.f45024d = zzpu3;
        this.f45025f = j;
    }
}
