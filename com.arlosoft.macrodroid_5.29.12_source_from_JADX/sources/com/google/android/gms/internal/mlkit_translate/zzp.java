package com.google.android.gms.internal.mlkit_translate;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
class zzp extends zzq {

    /* renamed from: a */
    Object[] f44387a = new Object[4];

    /* renamed from: b */
    int f44388b = 0;

    /* renamed from: c */
    boolean f44389c;

    zzp(int i) {
    }

    /* renamed from: c */
    private final void m62114c(int i) {
        Object[] objArr = this.f44387a;
        int length = objArr.length;
        if (length < i) {
            this.f44387a = Arrays.copyOf(objArr, zzq.m62195a(length, i));
            this.f44389c = false;
        } else if (this.f44389c) {
            this.f44387a = (Object[]) objArr.clone();
            this.f44389c = false;
        }
    }

    /* renamed from: b */
    public final zzp mo52394b(Object obj) {
        Objects.requireNonNull(obj);
        m62114c(this.f44388b + 1);
        Object[] objArr = this.f44387a;
        int i = this.f44388b;
        this.f44388b = i + 1;
        objArr[i] = obj;
        return this;
    }
}
