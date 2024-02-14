package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzek {

    /* renamed from: a */
    private long[] f34235a;

    /* renamed from: b */
    private Object[] f34236b;

    /* renamed from: c */
    private int f34237c;

    /* renamed from: d */
    private int f34238d;

    public zzek() {
        this(10);
    }

    public zzek(int i) {
        this.f34235a = new long[10];
        this.f34236b = new Object[10];
    }

    @Nullable
    /* renamed from: f */
    private final Object m48980f() {
        zzdd.m47212f(this.f34238d > 0);
        Object[] objArr = this.f34236b;
        int i = this.f34237c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f34237c = (i + 1) % objArr.length;
        this.f34238d--;
        return obj;
    }

    /* renamed from: a */
    public final synchronized int mo45343a() {
        return this.f34238d;
    }

    @Nullable
    /* renamed from: b */
    public final synchronized Object mo45344b() {
        if (this.f34238d == 0) {
            return null;
        }
        return m48980f();
    }

    @Nullable
    /* renamed from: c */
    public final synchronized Object mo45345c(long j) {
        Object obj;
        obj = null;
        while (true) {
            if (this.f34238d <= 0) {
                break;
            } else if (j - this.f34235a[this.f34237c] < 0) {
                break;
            } else {
                obj = m48980f();
            }
        }
        return obj;
    }

    /* renamed from: d */
    public final synchronized void mo45346d(long j, Object obj) {
        int i = this.f34238d;
        if (i > 0) {
            if (j <= this.f34235a[((this.f34237c + i) - 1) % this.f34236b.length]) {
                mo45347e();
            }
        }
        int length = this.f34236b.length;
        if (this.f34238d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            Object[] objArr = new Object[i2];
            int i3 = this.f34237c;
            int i4 = length - i3;
            System.arraycopy(this.f34235a, i3, jArr, 0, i4);
            System.arraycopy(this.f34236b, this.f34237c, objArr, 0, i4);
            int i5 = this.f34237c;
            if (i5 > 0) {
                System.arraycopy(this.f34235a, 0, jArr, i4, i5);
                System.arraycopy(this.f34236b, 0, objArr, i4, this.f34237c);
            }
            this.f34235a = jArr;
            this.f34236b = objArr;
            this.f34237c = 0;
        }
        int i6 = this.f34237c;
        int i7 = this.f34238d;
        Object[] objArr2 = this.f34236b;
        int length2 = (i6 + i7) % objArr2.length;
        this.f34235a[length2] = j;
        objArr2[length2] = obj;
        this.f34238d = i7 + 1;
    }

    /* renamed from: e */
    public final synchronized void mo45347e() {
        this.f34237c = 0;
        this.f34238d = 0;
        Arrays.fill(this.f34236b, (Object) null);
    }
}
