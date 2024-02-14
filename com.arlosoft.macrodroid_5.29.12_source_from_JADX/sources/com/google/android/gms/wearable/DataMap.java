package com.google.android.gms.wearable;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class DataMap {

    /* renamed from: a */
    private final HashMap f48081a = new HashMap();

    @Nullable
    /* renamed from: a */
    public <T> T mo56200a(@NonNull String str) {
        return this.f48081a.get(str);
    }

    @NonNull
    /* renamed from: b */
    public Set<String> mo56201b() {
        return this.f48081a.keySet();
    }

    /* renamed from: c */
    public void mo56202c(@NonNull DataMap dataMap) {
        for (String next : dataMap.mo56201b()) {
            this.f48081a.put(next, dataMap.mo56200a(next));
        }
    }

    /* renamed from: d */
    public void mo56203d(@NonNull String str, boolean z) {
        this.f48081a.put(str, Boolean.valueOf(z));
    }

    /* renamed from: e */
    public void mo56204e(@NonNull String str, @NonNull String[] strArr) {
        this.f48081a.put(str, strArr);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (!(obj instanceof DataMap)) {
            return false;
        }
        DataMap dataMap = (DataMap) obj;
        if (mo56206f() != dataMap.mo56206f()) {
            return false;
        }
        for (String next : mo56201b()) {
            Object a = mo56200a(next);
            Object a2 = dataMap.mo56200a(next);
            if (a instanceof Asset) {
                if (!(a2 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) a;
                Asset asset2 = (Asset) a2;
                if (asset != null && asset2 != null) {
                    if (!TextUtils.isEmpty(asset.mo56168n2())) {
                        z = ((String) Preconditions.m4488k(asset.mo56168n2())).equals(asset2.mo56168n2());
                    } else {
                        z = Arrays.equals(asset.mo56171q2(), asset2.mo56171q2());
                    }
                    if (!z) {
                        return false;
                    }
                } else if (asset != asset2) {
                    return false;
                }
            } else if (a instanceof String[]) {
                if (!(a2 instanceof String[]) || !Arrays.equals((String[]) a, (String[]) a2)) {
                    return false;
                }
            } else if (a instanceof long[]) {
                if (!(a2 instanceof long[]) || !Arrays.equals((long[]) a, (long[]) a2)) {
                    return false;
                }
            } else if (a instanceof float[]) {
                if (!(a2 instanceof float[]) || !Arrays.equals((float[]) a, (float[]) a2)) {
                    return false;
                }
            } else if (a instanceof byte[]) {
                if (!(a2 instanceof byte[]) || !Arrays.equals((byte[]) a, (byte[]) a2)) {
                    return false;
                }
            } else if (!Objects.m4470a(a, a2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public int mo56206f() {
        return this.f48081a.size();
    }

    public int hashCode() {
        return this.f48081a.hashCode() * 29;
    }

    @NonNull
    public String toString() {
        return this.f48081a.toString();
    }
}
