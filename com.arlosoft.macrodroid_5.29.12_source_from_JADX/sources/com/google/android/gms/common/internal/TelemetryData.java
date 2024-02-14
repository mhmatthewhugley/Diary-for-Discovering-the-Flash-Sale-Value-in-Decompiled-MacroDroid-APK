package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class TelemetryData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f3681a;
    @SafeParcelable.Field

    /* renamed from: c */
    private List f3682c;

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param int i, @SafeParcelable.Param List list) {
        this.f3681a = i;
        this.f3682c = list;
    }

    /* renamed from: l2 */
    public final int mo21731l2() {
        return this.f3681a;
    }

    @Nullable
    /* renamed from: m2 */
    public final List mo21732m2() {
        return this.f3682c;
    }

    /* renamed from: n2 */
    public final void mo21733n2(@NonNull MethodInvocation methodInvocation) {
        if (this.f3682c == null) {
            this.f3682c = new ArrayList();
        }
        this.f3682c.add(methodInvocation);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3681a);
        SafeParcelWriter.m4558B(parcel, 2, this.f3682c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
