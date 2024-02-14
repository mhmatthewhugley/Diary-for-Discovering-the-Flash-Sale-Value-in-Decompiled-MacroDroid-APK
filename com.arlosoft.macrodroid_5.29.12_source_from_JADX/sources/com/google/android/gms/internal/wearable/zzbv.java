package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzbs;
import com.google.android.gms.internal.wearable.zzbv;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class zzbv<MessageType extends zzbv<MessageType, BuilderType>, BuilderType extends zzbs<MessageType, BuilderType>> extends zzag<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzef zzc = zzef.m64434c();
    protected int zzd = -1;

    /* renamed from: h */
    static zzbv m64191h(Class cls) {
        Map map = zzb;
        zzbv zzbv = (zzbv) map.get(cls);
        if (zzbv == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzbv = (zzbv) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzbv == null) {
            zzbv = (zzbv) ((zzbv) zzeo.m64498j(cls)).mo53945f(6, (Object) null, (Object) null);
            if (zzbv != null) {
                map.put(cls, zzbv);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzbv;
    }

    /* renamed from: i */
    protected static zzca m64192i() {
        return zzbq.m64172d();
    }

    /* renamed from: j */
    protected static zzcb m64193j() {
        return zzcr.m64255f();
    }

    /* renamed from: k */
    protected static zzcc m64194k() {
        return zzdl.m64338d();
    }

    /* renamed from: l */
    protected static zzcc m64195l(zzcc zzcc) {
        int size = zzcc.size();
        return zzcc.mo53817G(size == 0 ? 10 : size + size);
    }

    /* renamed from: m */
    static Object m64196m(Method method, Object obj, Object... objArr) {
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

    /* renamed from: n */
    protected static Object m64197n(zzdc zzdc, String str, Object[] objArr) {
        return new zzdm(zzdc, str, objArr);
    }

    /* renamed from: o */
    protected static void m64198o(Class cls, zzbv zzbv) {
        zzb.put(cls, zzbv);
    }

    /* renamed from: D */
    public final /* synthetic */ zzdb mo53941D() {
        zzbs zzbs = (zzbs) mo53945f(5, (Object) null, (Object) null);
        zzbs.mo53936f(this);
        return zzbs;
    }

    /* renamed from: G */
    public final /* synthetic */ zzdc mo53934G() {
        return (zzbv) mo53945f(6, (Object) null, (Object) null);
    }

    /* renamed from: T */
    public final int mo53942T() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int a = zzdk.m64336a().mo54003b(getClass()).mo53996a(this);
        this.zzd = a;
        return a;
    }

    /* renamed from: a */
    public final void mo53943a(zzbe zzbe) throws IOException {
        zzdk.m64336a().mo54003b(getClass()).mo53997b(this, zzbf.m64117I(zzbe));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo53799b() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo53800d(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzdk.m64336a().mo54003b(getClass()).mo54002g(this, (zzbv) obj);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo53945f(int i, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final zzbs mo53946g() {
        return (zzbs) mo53945f(5, (Object) null, (Object) null);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int c = zzdk.m64336a().mo54003b(getClass()).mo53998c(this);
        this.zza = c;
        return c;
    }

    /* renamed from: p */
    public final boolean mo53948p() {
        byte byteValue = ((Byte) mo53945f(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = zzdk.m64336a().mo54003b(getClass()).mo54000e(this);
        mo53945f(2, true != e ? null : this, (Object) null);
        return e;
    }

    public final String toString() {
        return zzde.m64288a(this, super.toString());
    }
}
