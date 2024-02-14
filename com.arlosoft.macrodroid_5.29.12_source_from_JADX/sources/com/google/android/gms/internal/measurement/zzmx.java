package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
abstract class zzmx {

    /* renamed from: a */
    final Unsafe f41737a;

    zzmx(Unsafe unsafe) {
        this.f41737a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo51595a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo51596b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo51597c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo51598d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo51599e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo51600f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo51601g(Object obj, long j);

    /* renamed from: h */
    public final int mo51602h(Class cls) {
        return this.f41737a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo51603i(Class cls) {
        return this.f41737a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo51604j(Object obj, long j) {
        return this.f41737a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo51605k(Object obj, long j) {
        return this.f41737a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo51606l(Field field) {
        return this.f41737a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo51607m(Object obj, long j) {
        return this.f41737a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo51608n(Object obj, long j, int i) {
        this.f41737a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo51609o(Object obj, long j, long j2) {
        this.f41737a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo51610p(Object obj, long j, Object obj2) {
        this.f41737a.putObject(obj, j, obj2);
    }
}
