package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzguh {

    /* renamed from: a */
    final Unsafe f37295a;

    zzguh(Unsafe unsafe) {
        this.f37295a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo47514a(long j);

    /* renamed from: b */
    public abstract double mo47515b(Object obj, long j);

    /* renamed from: c */
    public abstract float mo47516c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo47517d(long j, byte[] bArr, long j2, long j3);

    /* renamed from: e */
    public abstract void mo47518e(Object obj, long j, boolean z);

    /* renamed from: f */
    public abstract void mo47519f(Object obj, long j, byte b);

    /* renamed from: g */
    public abstract void mo47520g(Object obj, long j, double d);

    /* renamed from: h */
    public abstract void mo47521h(Object obj, long j, float f);

    /* renamed from: i */
    public abstract boolean mo47522i(Object obj, long j);

    /* renamed from: j */
    public final int mo47523j(Class cls) {
        return this.f37295a.arrayBaseOffset(cls);
    }

    /* renamed from: k */
    public final int mo47524k(Class cls) {
        return this.f37295a.arrayIndexScale(cls);
    }

    /* renamed from: l */
    public final int mo47525l(Object obj, long j) {
        return this.f37295a.getInt(obj, j);
    }

    /* renamed from: m */
    public final long mo47526m(Object obj, long j) {
        return this.f37295a.getLong(obj, j);
    }

    /* renamed from: n */
    public final long mo47527n(Field field) {
        return this.f37295a.objectFieldOffset(field);
    }

    /* renamed from: o */
    public final Object mo47528o(Object obj, long j) {
        return this.f37295a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo47529p(Object obj, long j, int i) {
        this.f37295a.putInt(obj, j, i);
    }

    /* renamed from: q */
    public final void mo47530q(Object obj, long j, long j2) {
        this.f37295a.putLong(obj, j, j2);
    }

    /* renamed from: r */
    public final void mo47531r(Object obj, long j, Object obj2) {
        this.f37295a.putObject(obj, j, obj2);
    }
}
