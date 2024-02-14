package com.google.android.gms.internal.mlkit_translate;

import java.util.Arrays;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzx {

    /* renamed from: a */
    Object[] f44521a = new Object[8];

    /* renamed from: b */
    int f44522b = 0;

    /* renamed from: c */
    zzw f44523c;

    /* renamed from: a */
    public final zzx mo52499a(Object obj, Object obj2) {
        int i = this.f44522b + 1;
        int i2 = i + i;
        Object[] objArr = this.f44521a;
        int length = objArr.length;
        if (i2 > length) {
            this.f44521a = Arrays.copyOf(objArr, zzq.m62195a(length, i2));
        }
        zzn.m61999a(obj, obj2);
        Object[] objArr2 = this.f44521a;
        int i3 = this.f44522b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f44522b = i3 + 1;
        return this;
    }

    /* renamed from: b */
    public final zzy mo52500b() {
        zzw zzw = this.f44523c;
        if (zzw == null) {
            zzai i = zzai.m61574i(this.f44522b, this.f44521a, this);
            zzw zzw2 = this.f44523c;
            if (zzw2 == null) {
                return i;
            }
            throw zzw2.mo52498a();
        }
        throw zzw.mo52498a();
    }
}
