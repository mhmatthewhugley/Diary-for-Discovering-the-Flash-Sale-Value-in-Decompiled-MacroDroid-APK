package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.internal.p204firebaseauthapi.zzadb;
import com.google.android.gms.internal.p204firebaseauthapi.zzadf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzadf<MessageType extends zzadf<MessageType, BuilderType>, BuilderType extends zzadb<MessageType, BuilderType>> extends zzabm<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzafo zzc = zzafo.m56764c();
    private int zzd = -1;

    /* renamed from: A */
    protected static zzadf m56424A(zzadf zzadf, byte[] bArr, zzacs zzacs) throws zzadn {
        zzadf r = m56432r(zzadf, bArr, 0, bArr.length, zzacs);
        m56431q(r);
        return r;
    }

    /* renamed from: B */
    protected static zzadk m56425B() {
        return zzaet.m56610d();
    }

    /* renamed from: d */
    protected static zzadk m56426d(zzadk zzadk) {
        int size = zzadk.size();
        return zzadk.mo48877G(size == 0 ? 10 : size + size);
    }

    /* renamed from: e */
    static Object m56427e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: f */
    protected static Object m56428f(zzaek zzaek, String str, Object[] objArr) {
        return new zzaeu(zzaek, str, objArr);
    }

    /* renamed from: j */
    protected static void m56429j(Class cls, zzadf zzadf) {
        zzb.put(cls, zzadf);
        zzadf.mo49077g();
    }

    /* renamed from: o */
    private final int m56430o(zzaew zzaew) {
        if (zzaew == null) {
            return zzaes.m56608a().mo49150b(getClass()).mo49140a(this);
        }
        return zzaew.mo49140a(this);
    }

    /* renamed from: q */
    private static zzadf m56431q(zzadf zzadf) throws zzadn {
        if (zzadf == null || zzadf.mo49081m()) {
            return zzadf;
        }
        zzadn a = new zzafm(zzadf).mo49192a();
        a.mo49099h(zzadf);
        throw a;
    }

    /* renamed from: r */
    private static zzadf m56432r(zzadf zzadf, byte[] bArr, int i, int i2, zzacs zzacs) throws zzadn {
        zzadf y = zzadf.mo49090y();
        try {
            zzaew b = zzaes.m56608a().mo49150b(y.getClass());
            b.mo49149j(y, bArr, 0, i2, new zzabp(zzacs));
            b.mo49143d(y);
            return y;
        } catch (zzadn e) {
            e.mo49099h(y);
            throw e;
        } catch (zzafm e2) {
            zzadn a = e2.mo49192a();
            a.mo49099h(y);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzadn) {
                throw ((zzadn) e3.getCause());
            }
            zzadn zzadn = new zzadn(e3);
            zzadn.mo49099h(y);
            throw zzadn;
        } catch (IndexOutOfBoundsException unused) {
            zzadn i3 = zzadn.m56472i();
            i3.mo49099h(y);
            throw i3;
        }
    }

    /* renamed from: x */
    static zzadf m56433x(Class cls) {
        Map map = zzb;
        zzadf zzadf = (zzadf) map.get(cls);
        if (zzadf == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzadf = (zzadf) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzadf == null) {
            zzadf = (zzadf) ((zzadf) zzafx.m56843j(cls)).mo49084t(6, (Object) null, (Object) null);
            if (zzadf != null) {
                map.put(cls, zzadf);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzadf;
    }

    /* renamed from: z */
    protected static zzadf m56434z(zzadf zzadf, zzacc zzacc, zzacs zzacs) throws zzadn {
        zzacg k = zzacc.mo48898k();
        zzadf y = zzadf.mo49090y();
        try {
            zzaew b = zzaes.m56608a().mo49150b(y.getClass());
            b.mo49148i(y, zzach.m56216R(k), zzacs);
            b.mo49143d(y);
            try {
                k.mo48915g(0);
                m56431q(y);
                return y;
            } catch (zzadn e) {
                e.mo49099h(y);
                throw e;
            }
        } catch (zzadn e2) {
            e2.mo49099h(y);
            throw e2;
        } catch (zzafm e3) {
            zzadn a = e3.mo49192a();
            a.mo49099h(y);
            throw a;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzadn) {
                throw ((zzadn) e4.getCause());
            }
            zzadn zzadn = new zzadn(e4);
            zzadn.mo49099h(y);
            throw zzadn;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzadn) {
                throw ((zzadn) e5.getCause());
            }
            throw e5;
        }
    }

    /* renamed from: V */
    public final /* synthetic */ zzaej mo49074V() {
        return (zzadb) mo49084t(5, (Object) null, (Object) null);
    }

    /* renamed from: a */
    public final void mo49075a(zzacn zzacn) throws IOException {
        zzaes.m56608a().mo49150b(getClass()).mo49147h(this, zzaco.m56338l(zzacn));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo48858b(zzaew zzaew) {
        if (mo49082n()) {
            int o = m56430o(zzaew);
            if (o >= 0) {
                return o;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + o);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int o2 = m56430o(zzaew);
        if (o2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | o2;
            return o2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + o2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzaes.m56608a().mo49150b(getClass()).mo49146g(this, (zzadf) obj);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo49077g() {
        zzaes.m56608a().mo49150b(getClass()).mo49143d(this);
        mo49078h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo49078h() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (mo49082n()) {
            return mo49086u();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int u = mo49086u();
        this.zza = u;
        return u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo49080k(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: m */
    public final boolean mo49081m() {
        byte byteValue = ((Byte) mo49084t(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = zzaes.m56608a().mo49150b(getClass()).mo49144e(this);
        mo49084t(2, true != e ? null : this, (Object) null);
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo49082n() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: p */
    public final int mo49083p() {
        int i;
        if (mo49082n()) {
            i = m56430o((zzaew) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m56430o((zzaew) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract Object mo49084t(int i, Object obj, Object obj2);

    public final String toString() {
        return zzaem.m56535a(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final int mo49086u() {
        return zzaes.m56608a().mo49150b(getClass()).mo49142c(this);
    }

    /* renamed from: u0 */
    public final /* synthetic */ zzaek mo49087u0() {
        return (zzadf) mo49084t(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final zzadb mo49088v() {
        return (zzadb) mo49084t(5, (Object) null, (Object) null);
    }

    /* renamed from: w */
    public final zzadb mo49089w() {
        zzadb zzadb = (zzadb) mo49084t(5, (Object) null, (Object) null);
        zzadb.mo49068e(this);
        return zzadb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final zzadf mo49090y() {
        return (zzadf) mo49084t(4, (Object) null, (Object) null);
    }
}
