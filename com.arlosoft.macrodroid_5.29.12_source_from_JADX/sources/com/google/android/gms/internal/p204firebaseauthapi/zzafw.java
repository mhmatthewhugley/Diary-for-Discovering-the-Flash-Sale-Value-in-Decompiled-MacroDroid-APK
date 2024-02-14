package com.google.android.gms.internal.p204firebaseauthapi;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class zzafw {

    /* renamed from: a */
    final Unsafe f39849a;

    zzafw(Unsafe unsafe) {
        this.f39849a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo49238a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo49239b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo49240c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo49241d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo49242e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo49243f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo49244g(Object obj, long j);

    /* renamed from: h */
    public final int mo49245h(Class cls) {
        return this.f39849a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo49246i(Class cls) {
        return this.f39849a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo49247j(Object obj, long j) {
        return this.f39849a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo49248k(Object obj, long j) {
        return this.f39849a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo49249l(Field field) {
        return this.f39849a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo49250m(Object obj, long j) {
        return this.f39849a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo49251n(Object obj, long j, int i) {
        this.f39849a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo49252o(Object obj, long j, long j2) {
        this.f39849a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo49253p(Object obj, long j, Object obj2) {
        this.f39849a.putObject(obj, j, obj2);
    }
}
