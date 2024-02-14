package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzqi {

    /* renamed from: a */
    private int f38246a = 0;

    /* renamed from: b */
    private int f38247b = -1;

    /* renamed from: c */
    private int f38248c = 0;

    /* renamed from: d */
    private int[] f38249d;

    /* renamed from: e */
    private int f38250e;

    public zzqi() {
        int[] iArr = new int[16];
        this.f38249d = iArr;
        this.f38250e = iArr.length - 1;
    }

    /* renamed from: a */
    public final int mo48062a() {
        int i = this.f38248c;
        if (i != 0) {
            int[] iArr = this.f38249d;
            int i2 = this.f38246a;
            int i3 = iArr[i2];
            this.f38246a = (i2 + 1) & this.f38250e;
            this.f38248c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void mo48063b(int i) {
        int i2 = this.f38248c;
        int[] iArr = this.f38249d;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 >= 0) {
                int[] iArr2 = new int[i3];
                int i4 = this.f38246a;
                int i5 = length - i4;
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy(this.f38249d, 0, iArr2, i5, i4);
                this.f38246a = 0;
                this.f38247b = this.f38248c - 1;
                this.f38249d = iArr2;
                this.f38250e = iArr2.length - 1;
                iArr = iArr2;
            } else {
                throw new IllegalStateException();
            }
        }
        int i6 = (this.f38247b + 1) & this.f38250e;
        this.f38247b = i6;
        iArr[i6] = i;
        this.f38248c++;
    }

    /* renamed from: c */
    public final void mo48064c() {
        this.f38246a = 0;
        this.f38247b = -1;
        this.f38248c = 0;
    }

    /* renamed from: d */
    public final boolean mo48065d() {
        return this.f38248c == 0;
    }
}
