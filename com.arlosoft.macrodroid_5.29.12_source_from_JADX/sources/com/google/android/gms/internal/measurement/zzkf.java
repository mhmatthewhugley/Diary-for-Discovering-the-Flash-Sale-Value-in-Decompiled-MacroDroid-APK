package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzkf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class zzkf<MessageType extends zzkf<MessageType, BuilderType>, BuilderType extends zzkb<MessageType, BuilderType>> extends zzio<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected zzmp zzc = zzmp.m60784c();
    private int zzd = -1;

    /* renamed from: i */
    private final int m60501i(zzlx zzlx) {
        if (zzlx == null) {
            return zzlu.m60679a().mo51518b(getClass()).mo51509a(this);
        }
        return zzlx.mo51509a(this);
    }

    /* renamed from: k */
    protected static zzkk m60502k() {
        return zzkg.m60525f();
    }

    /* renamed from: l */
    protected static zzkl m60503l() {
        return zzlb.m60576d();
    }

    /* renamed from: m */
    protected static zzkl m60504m(zzkl zzkl) {
        int size = zzkl.size();
        return zzkl.mo51469A(size == 0 ? 10 : size + size);
    }

    /* renamed from: n */
    protected static zzkm m60505n() {
        return zzlv.m60681d();
    }

    /* renamed from: o */
    protected static zzkm m60506o(zzkm zzkm) {
        int size = zzkm.size();
        return zzkm.mo51322G(size == 0 ? 10 : size + size);
    }

    /* renamed from: p */
    static Object m60507p(Method method, Object obj, Object... objArr) {
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

    /* renamed from: q */
    protected static Object m60508q(zzlm zzlm, String str, Object[] objArr) {
        return new zzlw(zzlm, str, objArr);
    }

    /* renamed from: t */
    protected static void m60509t(Class cls, zzkf zzkf) {
        zza.put(cls, zzkf);
        zzkf.mo51453r();
    }

    /* renamed from: z */
    static zzkf m60510z(Class cls) {
        Map map = zza;
        zzkf zzkf = (zzkf) map.get(cls);
        if (zzkf == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzkf = (zzkf) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzkf == null) {
            zzkf = (zzkf) ((zzkf) zzmy.m60855j(cls)).mo50883A(6, (Object) null, (Object) null);
            if (zzkf != null) {
                map.put(cls, zzkf);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzkf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract Object mo50883A(int i, Object obj, Object obj2);

    /* renamed from: a */
    public final void mo51446a(zzjm zzjm) throws IOException {
        zzlu.m60679a().mo51518b(getClass()).mo51516h(this, zzjn.m60422I(zzjm));
    }

    /* renamed from: b */
    public final /* synthetic */ zzll mo51447b() {
        return (zzkb) mo50883A(5, (Object) null, (Object) null);
    }

    /* renamed from: d */
    public final int mo51448d() {
        int i;
        if (mo51457v()) {
            i = m60501i((zzlx) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m60501i((zzlx) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public final /* synthetic */ zzlm mo51449e() {
        return (zzkf) mo50883A(6, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlu.m60679a().mo51518b(getClass()).mo51515g(this, (zzkf) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo51305f(zzlx zzlx) {
        if (mo51457v()) {
            int i = m60501i(zzlx);
            if (i >= 0) {
                return i;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = m60501i(zzlx);
        if (i3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i3;
            return i3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i3);
    }

    public final int hashCode() {
        if (mo51457v()) {
            return mo51458w();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int w = mo51458w();
        this.zzb = w;
        return w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final zzkf mo51452j() {
        return (zzkf) mo50883A(4, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo51453r() {
        zzlu.m60679a().mo51518b(getClass()).mo51512d(this);
        mo51454s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo51454s() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        return zzlo.m60611a(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo51456u(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo51457v() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final int mo51458w() {
        return zzlu.m60679a().mo51518b(getClass()).mo51511c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final zzkb mo51459x() {
        return (zzkb) mo50883A(5, (Object) null, (Object) null);
    }

    /* renamed from: y */
    public final zzkb mo51460y() {
        zzkb zzkb = (zzkb) mo50883A(5, (Object) null, (Object) null);
        zzkb.mo51439l(this);
        return zzkb;
    }
}
