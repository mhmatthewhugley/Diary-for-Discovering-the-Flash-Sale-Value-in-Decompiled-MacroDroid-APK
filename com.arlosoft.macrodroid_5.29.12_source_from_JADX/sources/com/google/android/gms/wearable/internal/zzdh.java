package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdh implements DataItem {

    /* renamed from: a */
    private final Uri f48243a;
    @Nullable

    /* renamed from: c */
    private final byte[] f48244c;

    /* renamed from: d */
    private final Map f48245d;

    public final String toString() {
        Object obj;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        sb.append("uri=".concat(String.valueOf(this.f48243a)));
        byte[] bArr = this.f48244c;
        if (bArr == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(bArr.length);
        }
        sb.append(", dataSz=".concat(obj.toString()));
        int size = this.f48245d.size();
        sb.append(", numAssets=" + size);
        if (isLoggable && !this.f48245d.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : this.f48245d.entrySet()) {
                String id = ((DataItemAsset) entry.getValue()).getId();
                sb.append(str + ((String) entry.getKey()) + ": " + id);
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
