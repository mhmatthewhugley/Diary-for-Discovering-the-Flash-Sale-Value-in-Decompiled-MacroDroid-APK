package com.google.android.gms.internal.icing;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzei<T> implements zzep<T> {

    /* renamed from: a */
    private final zzee f40931a;

    /* renamed from: b */
    private final zzfd<?, ?> f40932b;

    /* renamed from: c */
    private final boolean f40933c;

    /* renamed from: d */
    private final zzcq<?> f40934d;

    private zzei(zzfd<?, ?> zzfd, zzcq<?> zzcq, zzee zzee) {
        this.f40932b = zzfd;
        this.f40933c = zzcq.mo50288a(zzee);
        this.f40934d = zzcq;
        this.f40931a = zzee;
    }

    /* renamed from: g */
    static <T> zzei<T> m58911g(zzfd<?, ?> zzfd, zzcq<?> zzcq, zzee zzee) {
        return new zzei<>(zzfd, zzcq, zzee);
    }

    /* renamed from: a */
    public final int mo50356a(T t) {
        zzfd<?, ?> zzfd = this.f40932b;
        int e = zzfd.mo50407e(zzfd.mo50404b(t));
        if (!this.f40933c) {
            return e;
        }
        this.f40934d.mo50289b(t);
        throw null;
    }

    /* renamed from: b */
    public final void mo50357b(T t, T t2) {
        zzer.m58967f(this.f40932b, t, t2);
        if (this.f40933c) {
            zzer.m58966e(this.f40934d, t, t2);
        }
    }

    /* renamed from: c */
    public final int mo50358c(T t) {
        int hashCode = this.f40932b.mo50404b(t).hashCode();
        if (!this.f40933c) {
            return hashCode;
        }
        this.f40934d.mo50289b(t);
        throw null;
    }

    /* renamed from: d */
    public final void mo50359d(T t) {
        this.f40932b.mo50405c(t);
        this.f40934d.mo50290c(t);
    }

    /* renamed from: e */
    public final void mo50360e(T t, zzcn zzcn) throws IOException {
        this.f40934d.mo50289b(t);
        throw null;
    }

    /* renamed from: f */
    public final boolean mo50361f(T t, T t2) {
        if (!this.f40932b.mo50404b(t).equals(this.f40932b.mo50404b(t2))) {
            return false;
        }
        if (!this.f40933c) {
            return true;
        }
        this.f40934d.mo50289b(t);
        this.f40934d.mo50289b(t2);
        throw null;
    }
}
