package com.google.android.gms.internal.wearable;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
abstract class zzen {

    /* renamed from: a */
    final Unsafe f45735a;

    zzen(Unsafe unsafe) {
        this.f45735a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo54075a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo54076b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo54077c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo54078d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo54079e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo54080f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo54081g(Object obj, long j);

    /* renamed from: h */
    public final int mo54082h(Class cls) {
        return this.f45735a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo54083i(Class cls) {
        return this.f45735a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo54084j(Object obj, long j) {
        return this.f45735a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo54085k(Object obj, long j) {
        return this.f45735a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo54086l(Field field) {
        return this.f45735a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo54087m(Object obj, long j) {
        return this.f45735a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo54088n(Object obj, long j, int i) {
        this.f45735a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo54089o(Object obj, long j, long j2) {
        this.f45735a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo54090p(Object obj, long j, Object obj2) {
        this.f45735a.putObject(obj, j, obj2);
    }
}
