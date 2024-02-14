package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

@SafeParcelable.Class
@SafeParcelable.Reserved
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdi extends AbstractSafeParcelable implements DataItem {
    public static final Parcelable.Creator<zzdi> CREATOR = new zzdj();
    @SafeParcelable.Field

    /* renamed from: a */
    private final Uri f48246a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final Map f48247c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private byte[] f48248d;

    @SafeParcelable.Constructor
    zzdi(@SafeParcelable.Param Uri uri, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param @Nullable byte[] bArr) {
        this.f48246a = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader((ClassLoader) Preconditions.m4488k(DataItemAssetParcelable.class.getClassLoader()));
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) Preconditions.m4488k(bundle.getParcelable(str)));
        }
        this.f48247c = hashMap;
        this.f48248d = bArr;
    }

    public final String toString() {
        Object obj;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f48248d;
        if (bArr == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(bArr.length);
        }
        sb.append(",dataSz=".concat(obj.toString()));
        int size = this.f48247c.size();
        sb.append(", numAssets=" + size);
        sb.append(", uri=".concat(String.valueOf(this.f48246a)));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.f48247c.keySet()) {
            String valueOf = String.valueOf(this.f48247c.get(str));
            sb.append("\n    " + str + ": " + valueOf);
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f48246a, i, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader((ClassLoader) Preconditions.m4488k(DataItemAssetParcelable.class.getClassLoader()));
        for (Map.Entry entry : this.f48247c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAsset) entry.getValue()));
        }
        SafeParcelWriter.m4567e(parcel, 4, bundle, false);
        SafeParcelWriter.m4569g(parcel, 5, this.f48248d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
