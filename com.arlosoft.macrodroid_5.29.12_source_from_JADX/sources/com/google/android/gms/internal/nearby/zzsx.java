package com.google.android.gms.internal.nearby;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzsx extends zzss {

    /* renamed from: d */
    final transient Object f45121d;

    zzsx(Object obj) {
        Objects.requireNonNull(obj);
        this.f45121d = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo53239c(Object[] objArr, int i) {
        objArr[0] = this.f45121d;
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.f45121d.equals(obj);
    }

    /* renamed from: h */
    public final zzsq mo53243h() {
        return zzsq.m63015t(this.f45121d);
    }

    public final int hashCode() {
        return this.f45121d.hashCode();
    }

    /* renamed from: i */
    public final zzsy mo53244i() {
        return new zzst(this.f45121d);
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzst(this.f45121d);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return '[' + this.f45121d.toString() + ']';
    }
}
