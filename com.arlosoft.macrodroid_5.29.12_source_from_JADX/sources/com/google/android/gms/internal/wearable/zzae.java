package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzae {
    /* renamed from: a */
    static /* synthetic */ int m64022a(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static List m64023b(long... jArr) {
        int length = jArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new zzad(jArr, 0, length);
    }
}
