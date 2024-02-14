package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItemAsset;

@KeepName
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements DataItemAsset, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new zzdf();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f48115a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f48116c;

    public DataItemAssetParcelable(@NonNull DataItemAsset dataItemAsset) {
        this.f48115a = (String) Preconditions.m4488k(dataItemAsset.getId());
        this.f48116c = (String) Preconditions.m4488k(dataItemAsset.mo56198S());
    }

    @NonNull
    /* renamed from: S */
    public final String mo56198S() {
        return this.f48116c;
    }

    @NonNull
    public final String getId() {
        return this.f48115a;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f48115a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f48115a);
        }
        sb.append(", key=");
        sb.append(this.f48116c);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f48115a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f48116c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    DataItemAssetParcelable(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f48115a = str;
        this.f48116c = str2;
    }
}
