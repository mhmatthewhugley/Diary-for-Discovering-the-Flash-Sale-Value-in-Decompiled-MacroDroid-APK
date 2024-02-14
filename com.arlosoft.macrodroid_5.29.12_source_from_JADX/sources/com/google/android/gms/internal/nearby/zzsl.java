package com.google.android.gms.internal.nearby;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
class zzsl extends zzsm {

    /* renamed from: a */
    Object[] f45100a = new Object[4];

    /* renamed from: b */
    int f45101b = 0;

    /* renamed from: c */
    boolean f45102c;

    zzsl(int i) {
    }

    /* renamed from: b */
    private final void m62996b(int i) {
        Object[] objArr = this.f45100a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f45100a = Arrays.copyOf(objArr, i2);
            this.f45102c = false;
        } else if (this.f45102c) {
            this.f45100a = (Object[]) objArr.clone();
            this.f45102c = false;
        }
    }

    /* renamed from: a */
    public final zzsl mo53236a(Object obj) {
        m62996b(this.f45101b + 1);
        Object[] objArr = this.f45100a;
        int i = this.f45101b;
        this.f45101b = i + 1;
        objArr[i] = obj;
        return this;
    }
}
