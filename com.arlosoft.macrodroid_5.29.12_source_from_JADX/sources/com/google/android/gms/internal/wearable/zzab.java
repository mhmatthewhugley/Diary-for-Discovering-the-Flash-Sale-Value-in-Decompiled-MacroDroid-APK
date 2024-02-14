package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzab extends zzac {
    /* renamed from: a */
    static /* synthetic */ int m64020a(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static List m64021b(float... fArr) {
        int length = fArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new zzaa(fArr, 0, length);
    }
}
