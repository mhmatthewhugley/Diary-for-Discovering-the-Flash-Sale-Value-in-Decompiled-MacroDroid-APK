package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzaq {

    /* renamed from: a */
    Object[] f41944a = new Object[8];

    /* renamed from: b */
    int f41945b = 0;

    /* renamed from: c */
    zzap f41946c;

    /* renamed from: a */
    public final zzaq mo51761a(Object obj, Object obj2) {
        int i = this.f41945b + 1;
        int i2 = i + i;
        Object[] objArr = this.f41944a;
        int length = objArr.length;
        if (i2 > length) {
            this.f41944a = Arrays.copyOf(objArr, zzaj.m61147a(length, i2));
        }
        zzaf.m61142a(obj, obj2);
        Object[] objArr2 = this.f41944a;
        int i3 = this.f41945b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f41945b = i3 + 1;
        return this;
    }

    /* renamed from: b */
    public final zzar mo51762b() {
        zzap zzap = this.f41946c;
        if (zzap == null) {
            zzaz g = zzaz.m61192g(this.f41945b, this.f41944a, this);
            zzap zzap2 = this.f41946c;
            if (zzap2 == null) {
                return g;
            }
            throw zzap2.mo51760a();
        }
        throw zzap.mo51760a();
    }
}
