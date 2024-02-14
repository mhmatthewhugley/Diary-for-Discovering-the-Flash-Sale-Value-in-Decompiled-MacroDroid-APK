package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzbu();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f45864a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f45865c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f45866d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f45867f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f45868g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final int f45869o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final int f45870p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final boolean f45871s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final int f45872z;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepClassifyEvent(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4, @SafeParcelable.Param int i5, @SafeParcelable.Param int i6, @SafeParcelable.Param int i7, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i8) {
        this.f45864a = i;
        this.f45865c = i2;
        this.f45866d = i3;
        this.f45867f = i4;
        this.f45868g = i5;
        this.f45869o = i6;
        this.f45870p = i7;
        this.f45871s = z;
        this.f45872z = i8;
    }

    @NonNull
    /* renamed from: l2 */
    public static List<SleepClassifyEvent> m64691l2(@NonNull Intent intent) {
        Preconditions.m4488k(intent);
        if (!m64692p2(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            Preconditions.m4488k(bArr);
            arrayList2.add((SleepClassifyEvent) SafeParcelableSerializer.m4589a(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: p2 */
    public static boolean m64692p2(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.f45864a == sleepClassifyEvent.f45864a && this.f45865c == sleepClassifyEvent.f45865c;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45864a), Integer.valueOf(this.f45865c));
    }

    /* renamed from: m2 */
    public int mo54209m2() {
        return this.f45865c;
    }

    /* renamed from: n2 */
    public int mo54210n2() {
        return this.f45867f;
    }

    /* renamed from: o2 */
    public int mo54211o2() {
        return this.f45866d;
    }

    @NonNull
    public String toString() {
        int i = this.f45864a;
        int i2 = this.f45865c;
        int i3 = this.f45866d;
        int i4 = this.f45867f;
        StringBuilder sb = new StringBuilder(65);
        sb.append(i);
        sb.append(" Conf:");
        sb.append(i2);
        sb.append(" Motion:");
        sb.append(i3);
        sb.append(" Light:");
        sb.append(i4);
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45864a);
        SafeParcelWriter.m4576n(parcel, 2, mo54209m2());
        SafeParcelWriter.m4576n(parcel, 3, mo54211o2());
        SafeParcelWriter.m4576n(parcel, 4, mo54210n2());
        SafeParcelWriter.m4576n(parcel, 5, this.f45868g);
        SafeParcelWriter.m4576n(parcel, 6, this.f45869o);
        SafeParcelWriter.m4576n(parcel, 7, this.f45870p);
        SafeParcelWriter.m4565c(parcel, 8, this.f45871s);
        SafeParcelWriter.m4576n(parcel, 9, this.f45872z);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
