package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzda;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public abstract class zzda<MessageType extends zzda<MessageType, BuilderType>, BuilderType extends zzcx<MessageType, BuilderType>> extends zzbs<MessageType, BuilderType> {
    private static final Map<Object, zzda<?, ?>> zzb = new ConcurrentHashMap();
    protected zzfe zzc = zzfe.m59017a();
    protected int zzd = -1;

    /* renamed from: e */
    static <T extends zzda> T m58796e(Class<T> cls) {
        Map<Object, zzda<?, ?>> map = zzb;
        T t = (zzda) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzda) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzda) ((zzda) zzfn.m59076h(cls)).mo50166d(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: g */
    protected static <T extends zzda> void m58797g(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: h */
    protected static Object m58798h(zzee zzee, String str, Object[] objArr) {
        return new zzeo(zzee, str, objArr);
    }

    /* renamed from: i */
    static Object m58799i(Method method, Object obj, Object... objArr) {
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

    /* renamed from: m */
    protected static zzdf m58800m() {
        return zzdt.m58846d();
    }

    /* renamed from: n */
    protected static zzdd m58801n() {
        return zzco.m58764d();
    }

    /* renamed from: o */
    protected static zzdc m58802o() {
        return zzbv.m58647d();
    }

    /* renamed from: p */
    protected static <E> zzdg<E> m58803p() {
        return zzen.m58922d();
    }

    /* renamed from: H */
    public final /* bridge */ /* synthetic */ zzed mo50308H() {
        zzcx zzcx = (zzcx) mo50166d(5, (Object) null, (Object) null);
        zzcx.mo50307n(this);
        return zzcx;
    }

    /* renamed from: a */
    public final void mo50309a(zzcm zzcm) throws IOException {
        zzem.m58920a().mo50362b(getClass()).mo50360e(this, zzcn.m58729j(zzcm));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo50183b() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo50184c(int i) {
        this.zzd = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo50166d(int i, Object obj, Object obj2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzem.m58920a().mo50362b(getClass()).mo50361f(this, (zzda) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int c = zzem.m58920a().mo50362b(getClass()).mo50358c(this);
        this.zza = c;
        return c;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzee mo50306k() {
        return (zzda) mo50166d(6, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public final int mo50312l() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int a = zzem.m58920a().mo50362b(getClass()).mo50356a(this);
        this.zzd = a;
        return a;
    }

    public final String toString() {
        return zzeg.m58876a(this, super.toString());
    }
}
