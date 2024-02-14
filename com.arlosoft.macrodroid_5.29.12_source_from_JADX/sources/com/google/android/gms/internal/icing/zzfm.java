package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
abstract class zzfm {

    /* renamed from: a */
    final Unsafe f40978a;

    zzfm(Unsafe unsafe) {
        this.f40978a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo50432a(Object obj, long j, byte b);

    /* renamed from: b */
    public abstract boolean mo50433b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo50434c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract float mo50435d(Object obj, long j);

    /* renamed from: e */
    public abstract void mo50436e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract double mo50437f(Object obj, long j);

    /* renamed from: g */
    public abstract void mo50438g(Object obj, long j, double d);

    /* renamed from: h */
    public final long mo50439h(Field field) {
        return this.f40978a.objectFieldOffset(field);
    }

    /* renamed from: i */
    public final int mo50440i(Class<?> cls) {
        return this.f40978a.arrayBaseOffset(cls);
    }

    /* renamed from: j */
    public final int mo50441j(Class<?> cls) {
        return this.f40978a.arrayIndexScale(cls);
    }

    /* renamed from: k */
    public final int mo50442k(Object obj, long j) {
        return this.f40978a.getInt(obj, j);
    }

    /* renamed from: l */
    public final void mo50443l(Object obj, long j, int i) {
        this.f40978a.putInt(obj, j, i);
    }

    /* renamed from: m */
    public final long mo50444m(Object obj, long j) {
        return this.f40978a.getLong(obj, j);
    }

    /* renamed from: n */
    public final void mo50445n(Object obj, long j, long j2) {
        this.f40978a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final Object mo50446o(Object obj, long j) {
        return this.f40978a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo50447p(Object obj, long j, Object obj2) {
        this.f40978a.putObject(obj, j, obj2);
    }
}
