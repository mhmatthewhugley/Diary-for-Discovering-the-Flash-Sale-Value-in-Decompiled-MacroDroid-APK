package com.google.android.gms.internal.ads;

import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzow implements zzoh {
    protected zzow(zzov zzov) {
    }

    /* renamed from: a */
    protected static int m54469a(int i, int i2, int i3) {
        return zzfxs.m51254a(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    /* renamed from: b */
    protected static int m54470b(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return SamsungIrisUnlockModule.IRIS_ONE_EYE;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }
}
