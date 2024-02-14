package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzze {

    /* renamed from: a */
    public final String f39035a;

    private zzze(int i, int i2, String str) {
        this.f39035a = str;
    }

    @Nullable
    /* renamed from: a */
    public static zzze m55505a(zzef zzef) {
        String str;
        zzef.mo45231g(2);
        int s = zzef.mo45243s();
        int i = s >> 1;
        int s2 = (zzef.mo45243s() >> 3) | ((s & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = s2 < 10 ? ".0" : ".";
        return new zzze(i, s2, str + ".0" + i + str2 + s2);
    }
}
