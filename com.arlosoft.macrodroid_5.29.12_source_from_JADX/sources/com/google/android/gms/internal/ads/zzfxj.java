package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfxj extends zzfvs {

    /* renamed from: d */
    final transient Object f36532d;

    zzfxj(Object obj) {
        Objects.requireNonNull(obj);
        this.f36532d = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo46413c(Object[] objArr, int i) {
        objArr[i] = this.f36532d;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.f36532d.equals(obj);
    }

    /* renamed from: h */
    public final zzfvn mo46418h() {
        return zzfvn.m51136z(this.f36532d);
    }

    public final int hashCode() {
        return this.f36532d.hashCode();
    }

    /* renamed from: i */
    public final zzfxm mo46419i() {
        return new zzfvv(this.f36532d);
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzfvv(this.f36532d);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return '[' + this.f36532d.toString() + ']';
    }
}
