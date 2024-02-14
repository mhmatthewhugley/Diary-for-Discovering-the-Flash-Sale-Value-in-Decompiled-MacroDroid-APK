package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgre;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgre<MessageType extends zzgre<MessageType, BuilderType>, BuilderType extends zzgra<MessageType, BuilderType>> extends zzgpf<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgtz zzc = zzgtz.m53355c();
    protected int zzd = -1;

    /* renamed from: A */
    protected static void m52983A(Class cls, zzgre zzgre) {
        zzb.put(cls, zzgre);
    }

    /* renamed from: E */
    private static zzgre m52984E(zzgre zzgre, byte[] bArr, int i, int i2, zzgqq zzgqq) throws zzgrq {
        zzgre zzgre2 = (zzgre) zzgre.mo41649D(4, (Object) null, (Object) null);
        try {
            zzgth b = zzgsw.m53178a().mo47422b(zzgre2.getClass());
            b.mo47421j(zzgre2, bArr, 0, i2, new zzgpi(zzgqq));
            b.mo47415d(zzgre2);
            if (zzgre2.zza == 0) {
                return zzgre2;
            }
            throw new RuntimeException();
        } catch (zzgrq e) {
            e = e;
            if (e.mo47367l()) {
                e = new zzgrq((IOException) e);
            }
            e.mo47365h(zzgre2);
            throw e;
        } catch (zzgtx e2) {
            zzgrq a = e2.mo47470a();
            a.mo47365h(zzgre2);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgrq) {
                throw ((zzgrq) e3.getCause());
            }
            zzgrq zzgrq = new zzgrq(e3);
            zzgrq.mo47365h(zzgre2);
            throw zzgrq;
        } catch (IndexOutOfBoundsException unused) {
            zzgrq j = zzgrq.m53040j();
            j.mo47365h(zzgre2);
            throw j;
        }
    }

    /* renamed from: f */
    private static zzgre m52985f(zzgre zzgre) throws zzgrq {
        if (zzgre == null || zzgre.mo47344B()) {
            return zzgre;
        }
        zzgrq a = new zzgtx(zzgre).mo47470a();
        a.mo47365h(zzgre);
        throw a;
    }

    /* renamed from: h */
    static zzgre m52986h(Class cls) {
        Map map = zzb;
        zzgre zzgre = (zzgre) map.get(cls);
        if (zzgre == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgre = (zzgre) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgre == null) {
            zzgre = (zzgre) ((zzgre) zzgui.m53445o(cls)).mo41649D(6, (Object) null, (Object) null);
            if (zzgre != null) {
                map.put(cls, zzgre);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgre;
    }

    /* renamed from: i */
    protected static zzgre m52987i(zzgre zzgre, zzgpw zzgpw) throws zzgrq {
        zzgqq a = zzgqq.m52900a();
        zzgqe z = zzgpw.mo47096z();
        zzgre zzgre2 = (zzgre) zzgre.mo41649D(4, (Object) null, (Object) null);
        try {
            zzgth b = zzgsw.m53178a().mo47422b(zzgre2.getClass());
            b.mo47419h(zzgre2, zzgqf.m52736R(z), a);
            b.mo47415d(zzgre2);
            try {
                z.mo47113B(0);
                m52985f(zzgre2);
                m52985f(zzgre2);
                return zzgre2;
            } catch (zzgrq e) {
                e.mo47365h(zzgre2);
                throw e;
            }
        } catch (zzgrq e2) {
            e = e2;
            if (e.mo47367l()) {
                e = new zzgrq((IOException) e);
            }
            e.mo47365h(zzgre2);
            throw e;
        } catch (zzgtx e3) {
            zzgrq a2 = e3.mo47470a();
            a2.mo47365h(zzgre2);
            throw a2;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgrq) {
                throw ((zzgrq) e4.getCause());
            }
            zzgrq zzgrq = new zzgrq(e4);
            zzgrq.mo47365h(zzgre2);
            throw zzgrq;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgrq) {
                throw ((zzgrq) e5.getCause());
            }
            throw e5;
        }
    }

    /* renamed from: j */
    protected static zzgre m52988j(zzgre zzgre, byte[] bArr) throws zzgrq {
        zzgre E = m52984E(zzgre, bArr, 0, bArr.length, zzgqq.m52900a());
        m52985f(E);
        return E;
    }

    /* renamed from: k */
    protected static zzgre m52989k(zzgre zzgre, zzgpw zzgpw, zzgqq zzgqq) throws zzgrq {
        zzgqe z = zzgpw.mo47096z();
        zzgre zzgre2 = (zzgre) zzgre.mo41649D(4, (Object) null, (Object) null);
        try {
            zzgth b = zzgsw.m53178a().mo47422b(zzgre2.getClass());
            b.mo47419h(zzgre2, zzgqf.m52736R(z), zzgqq);
            b.mo47415d(zzgre2);
            try {
                z.mo47113B(0);
                m52985f(zzgre2);
                return zzgre2;
            } catch (zzgrq e) {
                e.mo47365h(zzgre2);
                throw e;
            }
        } catch (zzgrq e2) {
            e = e2;
            if (e.mo47367l()) {
                e = new zzgrq((IOException) e);
            }
            e.mo47365h(zzgre2);
            throw e;
        } catch (zzgtx e3) {
            zzgrq a = e3.mo47470a();
            a.mo47365h(zzgre2);
            throw a;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgrq) {
                throw ((zzgrq) e4.getCause());
            }
            zzgrq zzgrq = new zzgrq(e4);
            zzgrq.mo47365h(zzgre2);
            throw zzgrq;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgrq) {
                throw ((zzgrq) e5.getCause());
            }
            throw e5;
        }
    }

    /* renamed from: l */
    protected static zzgre m52990l(zzgre zzgre, InputStream inputStream, zzgqq zzgqq) throws zzgrq {
        zzgqe g = zzgqe.m52705g(inputStream, 4096);
        zzgre zzgre2 = (zzgre) zzgre.mo41649D(4, (Object) null, (Object) null);
        try {
            zzgth b = zzgsw.m53178a().mo47422b(zzgre2.getClass());
            b.mo47419h(zzgre2, zzgqf.m52736R(g), zzgqq);
            b.mo47415d(zzgre2);
            m52985f(zzgre2);
            return zzgre2;
        } catch (zzgrq e) {
            e = e;
            if (e.mo47367l()) {
                e = new zzgrq((IOException) e);
            }
            e.mo47365h(zzgre2);
            throw e;
        } catch (zzgtx e2) {
            zzgrq a = e2.mo47470a();
            a.mo47365h(zzgre2);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgrq) {
                throw ((zzgrq) e3.getCause());
            }
            zzgrq zzgrq = new zzgrq(e3);
            zzgrq.mo47365h(zzgre2);
            throw zzgrq;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgrq) {
                throw ((zzgrq) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: m */
    protected static zzgre m52991m(zzgre zzgre, byte[] bArr, zzgqq zzgqq) throws zzgrq {
        zzgre E = m52984E(zzgre, bArr, 0, bArr.length, zzgqq);
        m52985f(E);
        return E;
    }

    /* renamed from: n */
    protected static zzgrj m52992n() {
        return zzgrf.m53010f();
    }

    /* renamed from: o */
    protected static zzgrj m52993o(zzgrj zzgrj) {
        int size = zzgrj.size();
        return zzgrj.mo47361x(size == 0 ? 10 : size + size);
    }

    /* renamed from: u */
    protected static zzgrm m52994u() {
        return zzgsd.m53074f();
    }

    /* renamed from: v */
    protected static zzgrn m52995v() {
        return zzgsx.m53180d();
    }

    /* renamed from: w */
    protected static zzgrn m52996w(zzgrn zzgrn) {
        int size = zzgrn.size();
        return zzgrn.mo47067G(size == 0 ? 10 : size + size);
    }

    /* renamed from: x */
    static Object m52997x(Method method, Object obj, Object... objArr) {
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

    /* renamed from: y */
    protected static Object m52998y(zzgso zzgso, String str, Object[] objArr) {
        return new zzgsy(zzgso, str, objArr);
    }

    /* renamed from: B */
    public final boolean mo47344B() {
        byte byteValue = ((Byte) mo41649D(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = zzgsw.m53178a().mo47422b(getClass()).mo47416e(this);
        mo41649D(2, true != e ? null : this, (Object) null);
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final zzgra mo47345C() {
        return (zzgra) mo41649D(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract Object mo41649D(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo47047a() {
        return this.zzd;
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo47337b() {
        return (zzgre) mo41649D(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo47048d(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgsw.m53178a().mo47422b(getClass()).mo47418g(this, (zzgre) obj);
        }
        return false;
    }

    /* renamed from: g */
    public final zzgra mo47347g() {
        zzgra zzgra = (zzgra) mo41649D(5, (Object) null, (Object) null);
        zzgra.mo47339f(this);
        return zzgra;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int c = zzgsw.m53178a().mo47422b(getClass()).mo47414c(this);
        this.zza = c;
        return c;
    }

    /* renamed from: q */
    public final void mo47349q(zzgql zzgql) throws IOException {
        zzgsw.m53178a().mo47422b(getClass()).mo47420i(this, zzgqm.m52859l(zzgql));
    }

    /* renamed from: r */
    public final /* synthetic */ zzgsn mo47350r() {
        zzgra zzgra = (zzgra) mo41649D(5, (Object) null, (Object) null);
        zzgra.mo47339f(this);
        return zzgra;
    }

    /* renamed from: s */
    public final /* synthetic */ zzgsn mo47351s() {
        return (zzgra) mo41649D(5, (Object) null, (Object) null);
    }

    public final String toString() {
        return zzgsq.m53111a(this, super.toString());
    }

    /* renamed from: z */
    public final int mo47353z() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int a = zzgsw.m53178a().mo47422b(getClass()).mo47412a(this);
        this.zzd = a;
        return a;
    }
}
