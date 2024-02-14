package com.google.android.gms.wearable;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.wearable.zzk;
import com.google.android.gms.internal.wearable.zzl;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class PutDataMapRequest {

    /* renamed from: a */
    private final PutDataRequest f48083a;

    /* renamed from: b */
    private final DataMap f48084b;

    private PutDataMapRequest(PutDataRequest putDataRequest, @Nullable DataMap dataMap) {
        this.f48083a = putDataRequest;
        DataMap dataMap2 = new DataMap();
        this.f48084b = dataMap2;
        if (dataMap != null) {
            dataMap2.mo56202c(dataMap);
        }
    }

    @NonNull
    /* renamed from: b */
    public static PutDataMapRequest m66808b(@NonNull String str) {
        Asserts.m4344d(str, "path must not be null");
        return new PutDataMapRequest(PutDataRequest.m66811l2(str), (DataMap) null);
    }

    @NonNull
    /* renamed from: a */
    public PutDataRequest mo56226a() {
        zzk a = zzl.m64564a(this.f48084b);
        this.f48083a.mo56233q2(a.f45776a.mo53801e());
        int size = a.f45777b.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = (Asset) a.f45777b.get(i);
            if (num == null) {
                throw new IllegalStateException("asset key cannot be null: ".concat(String.valueOf(asset)));
            } else if (asset != null) {
                if (Log.isLoggable("DataMap", 3)) {
                    String obj = asset.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("asPutDataRequest: adding asset: ");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(obj);
                }
                this.f48083a.mo56232p2(num, asset);
                i++;
            } else {
                throw new IllegalStateException("asset cannot be null: key=".concat(num));
            }
        }
        return this.f48083a;
    }

    @NonNull
    /* renamed from: c */
    public DataMap mo56227c() {
        return this.f48084b;
    }
}
