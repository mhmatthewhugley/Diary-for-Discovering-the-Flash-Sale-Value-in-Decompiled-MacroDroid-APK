package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.mlkit:common@@18.5.0 */
class zzai extends zzaj {

    /* renamed from: a */
    Object[] f41933a = new Object[4];

    /* renamed from: b */
    int f41934b = 0;

    /* renamed from: c */
    boolean f41935c;

    zzai(int i) {
    }

    /* renamed from: c */
    private final void m61145c(int i) {
        Object[] objArr = this.f41933a;
        int length = objArr.length;
        if (length < i) {
            this.f41933a = Arrays.copyOf(objArr, zzaj.m61147a(length, i));
            this.f41935c = false;
        } else if (this.f41935c) {
            this.f41933a = (Object[]) objArr.clone();
            this.f41935c = false;
        }
    }

    /* renamed from: b */
    public final zzai mo51727b(Object obj) {
        Objects.requireNonNull(obj);
        m61145c(this.f41934b + 1);
        Object[] objArr = this.f41933a;
        int i = this.f41934b;
        this.f41934b = i + 1;
        objArr[i] = obj;
        return this;
    }
}
