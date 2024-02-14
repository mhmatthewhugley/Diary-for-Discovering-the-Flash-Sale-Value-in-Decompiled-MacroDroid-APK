package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdk extends DataBufferRef implements DataItem {

    /* renamed from: f */
    private final int f48249f;

    public zzdk(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f48249f = i2;
    }

    /* renamed from: h */
    public final Map<String, DataItemAsset> mo56353h() {
        HashMap hashMap = new HashMap(this.f48249f);
        for (int i = 0; i < this.f48249f; i++) {
            zzdg zzdg = new zzdg(this.f3516a, this.f3517c + i);
            if (zzdg.mo21557d("asset_key") != null) {
                hashMap.put(zzdg.mo21557d("asset_key"), zzdg);
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    public final Uri mo56354i() {
        return Uri.parse(mo21557d(ClientCookie.PATH_ATTR));
    }

    public final String toString() {
        Object obj;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] a = mo21554a(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        Map<String, DataItemAsset> h = mo56353h();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(mo56354i())));
        if (a == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(a.length);
        }
        sb.append(", dataSz=".concat(obj.toString()));
        int size = h.size();
        sb.append(", numAssets=" + size);
        if (isLoggable && !h.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry next : h.entrySet()) {
                String id = ((DataItemAsset) next.getValue()).getId();
                sb.append(str + ((String) next.getKey()) + ": " + id);
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
