package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;
import com.google.android.gms.internal.places.zzbc.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzbc<MessageType extends zzbc<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzm<MessageType, BuilderType> {
    private static Map<Object, zzbc<?, ?>> zzij = new ConcurrentHashMap();
    protected zzdr zzih = zzdr.m63623i();
    private int zzii = -1;

    public static abstract class zzb<MessageType extends zzbc<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzo<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f45258a;

        /* renamed from: c */
        private MessageType f45259c;

        /* renamed from: d */
        private boolean f45260d = false;

        protected zzb(MessageType messagetype) {
            this.f45258a = messagetype;
            this.f45259c = (zzbc) messagetype.mo53456l(zze.f45265d, (Object) null, (Object) null);
        }

        /* renamed from: l */
        private static void m63329l(MessageType messagetype, MessageType messagetype2) {
            zzcv.m63517a().mo53548c(messagetype).mo53542h(messagetype, messagetype2);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzb = (zzb) this.f45258a.mo53456l(zze.f45266e, (Object) null, (Object) null);
            zzb.mo53461g((zzbc) mo53458Q());
            return zzb;
        }

        /* renamed from: f */
        public final /* synthetic */ zzck mo53451f() {
            return this.f45258a;
        }

        /* renamed from: h */
        public final /* synthetic */ zzo mo53462h() {
            return (zzb) clone();
        }

        /* renamed from: k */
        public final BuilderType mo53461g(MessageType messagetype) {
            if (this.f45260d) {
                MessageType messagetype2 = (zzbc) this.f45259c.mo53456l(zze.f45265d, (Object) null, (Object) null);
                m63329l(messagetype2, this.f45259c);
                this.f45259c = messagetype2;
                this.f45260d = false;
            }
            m63329l(this.f45259c, messagetype);
            return this;
        }

        /* renamed from: n */
        public MessageType mo53458Q() {
            if (this.f45260d) {
                return this.f45259c;
            }
            this.f45259c.mo53455i();
            this.f45260d = true;
            return this.f45259c;
        }

        /* renamed from: o */
        public final MessageType mo53459W1() {
            MessageType messagetype = (zzbc) mo53458Q();
            if (messagetype.mo53445a()) {
                return messagetype;
            }
            throw new zzdp(messagetype);
        }
    }

    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzbc<MessageType, BuilderType> implements zzcm {
        protected zzav<Object> zzik = zzav.m63274f();

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final zzav<Object> mo53466t() {
            if (this.zzik.mo53419b()) {
                this.zzik = (zzav) this.zzik.clone();
            }
            return this.zzik;
        }
    }

    public static class zzd<T extends zzbc<T, ?>> extends zzn<T> {

        /* renamed from: b */
        private final T f45261b;

        public zzd(T t) {
            this.f45261b = t;
        }
    }

    /* 'enum' modifier removed */
    public static final class zze {

        /* renamed from: a */
        public static final int f45262a = 1;

        /* renamed from: b */
        public static final int f45263b = 2;

        /* renamed from: c */
        public static final int f45264c = 3;

        /* renamed from: d */
        public static final int f45265d = 4;

        /* renamed from: e */
        public static final int f45266e = 5;

        /* renamed from: f */
        public static final int f45267f = 6;

        /* renamed from: g */
        public static final int f45268g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f45269h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i */
        public static final int f45270i = 1;

        /* renamed from: j */
        public static final int f45271j = 2;

        /* renamed from: k */
        private static final /* synthetic */ int[] f45272k = {1, 2};

        /* renamed from: l */
        public static final int f45273l = 1;

        /* renamed from: m */
        public static final int f45274m = 2;

        /* renamed from: n */
        private static final /* synthetic */ int[] f45275n = {1, 2};

        /* renamed from: a */
        public static int[] m63339a() {
            return (int[]) f45269h.clone();
        }
    }

    public static class zzf<ContainingType extends zzck, Type> extends zzan<ContainingType, Type> {
    }

    /* renamed from: j */
    protected static <T extends zzbc<T, ?>> T m63310j(T t, byte[] bArr) throws zzbk {
        T k = m63311k(t, bArr, 0, bArr.length, zzap.m63253b());
        if (k == null || k.mo53445a()) {
            return k;
        }
        throw new zzbk(new zzdp(k).getMessage()).mo53476g(k);
    }

    /* renamed from: k */
    private static <T extends zzbc<T, ?>> T m63311k(T t, byte[] bArr, int i, int i2, zzap zzap) throws zzbk {
        T t2 = (zzbc) t.mo53456l(zze.f45265d, (Object) null, (Object) null);
        try {
            zzcv.m63517a().mo53548c(t2).mo53538d(t2, bArr, 0, i2, new zzr(zzap));
            t2.mo53455i();
            if (t2.zzdt == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzbk) {
                throw ((zzbk) e.getCause());
            }
            throw new zzbk(e.getMessage()).mo53476g(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzbk.m63362a().mo53476g(t2);
        }
    }

    /* renamed from: m */
    protected static Object m63312m(zzck zzck, String str, Object[] objArr) {
        return new zzcx(zzck, str, objArr);
    }

    /* renamed from: n */
    static Object m63313n(Method method, Object obj, Object... objArr) {
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

    /* renamed from: o */
    protected static <T extends zzbc<?, ?>> void m63314o(Class<T> cls, T t) {
        zzij.put(cls, t);
    }

    /* renamed from: p */
    protected static final <T extends zzbc<T, ?>> boolean m63315p(T t, boolean z) {
        byte byteValue = ((Byte) t.mo53456l(zze.f45262a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = zzcv.m63517a().mo53548c(t).mo53539e(t);
        if (z) {
            t.mo53456l(zze.f45263b, e ? t : null, (Object) null);
        }
        return e;
    }

    /* renamed from: q */
    protected static zzbi m63316q() {
        return zzbe.m63350h();
    }

    /* renamed from: r */
    protected static <E> zzbh<E> m63317r() {
        return zzcy.m63525d();
    }

    /* renamed from: s */
    static <T extends zzbc<?, ?>> T m63318s(Class<T> cls) {
        T t = (zzbc) zzij.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzbc) zzij.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzbc) ((zzbc) zzdy.m63699x(cls)).mo53456l(zze.f45267f, (Object) null, (Object) null);
            if (t != null) {
                zzij.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    public final boolean mo53445a() {
        return m63315p(this, true);
    }

    /* renamed from: b */
    public final int mo53446b() {
        if (this.zzii == -1) {
            this.zzii = zzcv.m63517a().mo53548c(this).mo53540f(this);
        }
        return this.zzii;
    }

    /* renamed from: c */
    public final /* synthetic */ zzcj mo53447c() {
        zzb zzb2 = (zzb) mo53456l(zze.f45266e, (Object) null, (Object) null);
        zzb2.mo53461g(this);
        return zzb2;
    }

    /* renamed from: d */
    public final /* synthetic */ zzcj mo53448d() {
        return (zzb) mo53456l(zze.f45266e, (Object) null, (Object) null);
    }

    /* renamed from: e */
    public final void mo53449e(zzaj zzaj) throws IOException {
        zzcv.m63517a().mo53547b(getClass()).mo53541g(this, zzam.m63205O(zzaj));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzbc) mo53456l(zze.f45267f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return zzcv.m63517a().mo53548c(this).mo53537c(this, (zzbc) obj);
    }

    /* renamed from: f */
    public final /* synthetic */ zzck mo53451f() {
        return (zzbc) mo53456l(zze.f45267f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo53452g(int i) {
        this.zzii = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo53453h() {
        return this.zzii;
    }

    public int hashCode() {
        int i = this.zzdt;
        if (i != 0) {
            return i;
        }
        int b = zzcv.m63517a().mo53548c(this).mo53536b(this);
        this.zzdt = b;
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo53455i() {
        zzcv.m63517a().mo53548c(this).mo53535a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract Object mo53456l(int i, Object obj, Object obj2);

    public String toString() {
        return zzcl.m63451a(this, super.toString());
    }
}
