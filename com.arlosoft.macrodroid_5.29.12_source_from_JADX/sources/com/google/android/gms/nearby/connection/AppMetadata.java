package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class AppMetadata extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<AppMetadata> CREATOR = new zzd();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List f47400a;

    @SafeParcelable.Constructor
    public AppMetadata(@SafeParcelable.Param @NonNull List<AppIdentifier> list) {
        this.f47400a = (List) Preconditions.m4489l(list, "Must specify application identifiers");
        Preconditions.m4491n(list.size(), "Application identifiers cannot be empty");
    }

    @NonNull
    /* renamed from: l2 */
    public List<AppIdentifier> mo55649l2() {
        return this.f47400a;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, mo55649l2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
