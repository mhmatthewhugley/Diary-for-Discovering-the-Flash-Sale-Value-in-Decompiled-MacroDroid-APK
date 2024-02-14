package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzguf extends zzguh {
    zzguf(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final byte mo47514a(long j) {
        return Memory.peekByte((int) j);
    }

    /* renamed from: b */
    public final double mo47515b(Object obj, long j) {
        return Double.longBitsToDouble(mo47526m(obj, j));
    }

    /* renamed from: c */
    public final float mo47516c(Object obj, long j) {
        return Float.intBitsToFloat(mo47525l(obj, j));
    }

    /* renamed from: d */
    public final void mo47517d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    /* renamed from: e */
    public final void mo47518e(Object obj, long j, boolean z) {
        if (zzgui.f37304i) {
            zzgui.m53437g(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzgui.m53438h(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: f */
    public final void mo47519f(Object obj, long j, byte b) {
        if (zzgui.f37304i) {
            zzgui.m53437g(obj, j, b);
        } else {
            zzgui.m53438h(obj, j, b);
        }
    }

    /* renamed from: g */
    public final void mo47520g(Object obj, long j, double d) {
        mo47530q(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: h */
    public final void mo47521h(Object obj, long j, float f) {
        mo47529p(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: i */
    public final boolean mo47522i(Object obj, long j) {
        if (zzgui.f37304i) {
            return zzgui.m53427E(obj, j);
        }
        return zzgui.m53428F(obj, j);
    }
}
