package com.google.android.gms.internal.ads;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcp {

    /* renamed from: f */
    public static final zzn f29178f = zzco.f29149a;

    /* renamed from: a */
    public final int f29179a = 1;

    /* renamed from: b */
    public final String f29180b;

    /* renamed from: c */
    public final int f29181c;

    /* renamed from: d */
    private final zzaf[] f29182d;

    /* renamed from: e */
    private int f29183e;

    public zzcp(String str, zzaf... zzafArr) {
        this.f29180b = str;
        this.f29182d = zzafArr;
        int b = zzbt.m44089b(zzafArr[0].f24213l);
        this.f29181c = b == -1 ? zzbt.m44089b(zzafArr[0].f24212k) : b;
        m46277d(zzafArr[0].f24204c);
        int i = zzafArr[0].f24206e;
    }

    /* renamed from: d */
    private static String m46277d(@Nullable String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: a */
    public final int mo44230a(zzaf zzaf) {
        for (int i = 0; i <= 0; i++) {
            if (zzaf == this.f29182d[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final zzaf mo44231b(int i) {
        return this.f29182d[i];
    }

    @CheckResult
    /* renamed from: c */
    public final zzcp mo44232c(String str) {
        return new zzcp(str, this.f29182d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcp.class == obj.getClass()) {
            zzcp zzcp = (zzcp) obj;
            return this.f29180b.equals(zzcp.f29180b) && Arrays.equals(this.f29182d, zzcp.f29182d);
        }
    }

    public final int hashCode() {
        int i = this.f29183e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.f29180b.hashCode() + 527) * 31) + Arrays.hashCode(this.f29182d);
        this.f29183e = hashCode;
        return hashCode;
    }
}
