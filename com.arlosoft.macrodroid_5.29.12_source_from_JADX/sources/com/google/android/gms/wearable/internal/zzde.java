package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzde implements DataItemAsset {

    /* renamed from: a */
    private final String f48241a;

    /* renamed from: c */
    private final String f48242c;

    /* renamed from: S */
    public final String mo56198S() {
        return this.f48242c;
    }

    public final String getId() {
        return this.f48241a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f48241a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f48241a);
        }
        sb.append(", key=");
        sb.append(this.f48242c);
        sb.append("]");
        return sb.toString();
    }
}
