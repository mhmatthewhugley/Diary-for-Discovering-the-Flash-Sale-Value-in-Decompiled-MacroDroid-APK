package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzyn {

    /* renamed from: a */
    public final List f38981a;

    /* renamed from: b */
    public final int f38982b;

    /* renamed from: c */
    public final int f38983c;

    /* renamed from: d */
    public final int f38984d;

    /* renamed from: e */
    public final float f38985e;
    @Nullable

    /* renamed from: f */
    public final String f38986f;

    private zzyn(List list, int i, int i2, int i3, float f, @Nullable String str) {
        this.f38981a = list;
        this.f38982b = i;
        this.f38983c = i2;
        this.f38984d = i3;
        this.f38985e = f;
        this.f38986f = str;
    }

    /* renamed from: a */
    public static zzyn m55435a(zzef zzef) throws zzbu {
        String str;
        float f;
        int i;
        int i2;
        try {
            zzef.mo45231g(4);
            int s = (zzef.mo45243s() & 3) + 1;
            if (s != 3) {
                ArrayList arrayList = new ArrayList();
                int s2 = zzef.mo45243s() & 31;
                for (int i3 = 0; i3 < s2; i3++) {
                    arrayList.add(m55436b(zzef));
                }
                int s3 = zzef.mo45243s();
                for (int i4 = 0; i4 < s3; i4++) {
                    arrayList.add(m55436b(zzef));
                }
                if (s2 > 0) {
                    zzaae d = zzaaf.m40917d((byte[]) arrayList.get(0), s + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = d.f23722e;
                    int i6 = d.f23723f;
                    float f2 = d.f23724g;
                    str = zzdf.m47279a(d.f23718a, d.f23719b, d.f23720c);
                    i2 = i5;
                    i = i6;
                    f = f2;
                } else {
                    str = null;
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new zzyn(arrayList, s, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbu.m44135a("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m55436b(zzef zzef) {
        int w = zzef.mo45247w();
        int k = zzef.mo45235k();
        zzef.mo45231g(w);
        return zzdf.m47281c(zzef.mo45232h(), k, w);
    }
}
