package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public final Bundle f46478a;

    @SafeParcelable.Constructor
    zzau(@SafeParcelable.Param Bundle bundle) {
        this.f46478a = bundle;
    }

    public final Iterator iterator() {
        return new zzat(this);
    }

    /* renamed from: m2 */
    public final Bundle mo55016m2() {
        return new Bundle(this.f46478a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n2 */
    public final Double mo55017n2(String str) {
        return Double.valueOf(this.f46478a.getDouble("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o2 */
    public final Long mo55018o2(String str) {
        return Long.valueOf(this.f46478a.getLong("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p2 */
    public final Object mo55019p2(String str) {
        return this.f46478a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public final String mo55020q2(String str) {
        return this.f46478a.getString(str);
    }

    public final String toString() {
        return this.f46478a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4567e(parcel, 2, mo55016m2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f46478a.size();
    }
}
