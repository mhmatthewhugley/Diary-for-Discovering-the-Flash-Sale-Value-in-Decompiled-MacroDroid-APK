package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class UnsafeUtil {

    /* renamed from: a */
    private static final Unsafe f57130a = m81361G();

    /* renamed from: b */
    private static final Class<?> f57131b = Android.m79347b();

    /* renamed from: c */
    private static final boolean f57132c = m81394p(Long.TYPE);

    /* renamed from: d */
    private static final boolean f57133d = m81394p(Integer.TYPE);

    /* renamed from: e */
    private static final MemoryAccessor f57134e = m81359E();

    /* renamed from: f */
    private static final boolean f57135f = m81378X();

    /* renamed from: g */
    private static final boolean f57136g = m81377W();

    /* renamed from: h */
    static final long f57137h;

    /* renamed from: i */
    private static final long f57138i;

    /* renamed from: j */
    private static final long f57139j;

    /* renamed from: k */
    private static final long f57140k;

    /* renamed from: l */
    private static final long f57141l;

    /* renamed from: m */
    private static final long f57142m;

    /* renamed from: n */
    private static final long f57143n;

    /* renamed from: o */
    private static final long f57144o;

    /* renamed from: p */
    private static final long f57145p;

    /* renamed from: q */
    private static final long f57146q;

    /* renamed from: r */
    private static final long f57147r;

    /* renamed from: s */
    private static final long f57148s;

    /* renamed from: t */
    private static final long f57149t;

    /* renamed from: u */
    private static final long f57150u = m81396r(m81391m());

    /* renamed from: v */
    private static final int f57151v;

    /* renamed from: w */
    static final boolean f57152w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    private static final class Android32MemoryAccessor extends MemoryAccessor {
        Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo65512c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo65513d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public boolean mo65514e(Object obj, long j) {
            if (UnsafeUtil.f57152w) {
                return UnsafeUtil.m81398t(obj, j);
            }
            return UnsafeUtil.m81399u(obj, j);
        }

        /* renamed from: f */
        public byte mo65515f(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public byte mo65516g(Object obj, long j) {
            if (UnsafeUtil.f57152w) {
                return UnsafeUtil.m81402x(obj, j);
            }
            return UnsafeUtil.m81403y(obj, j);
        }

        /* renamed from: h */
        public double mo65517h(Object obj, long j) {
            return Double.longBitsToDouble(mo65528l(obj, j));
        }

        /* renamed from: i */
        public float mo65518i(Object obj, long j) {
            return Float.intBitsToFloat(mo65527j(obj, j));
        }

        /* renamed from: k */
        public long mo65519k(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public void mo65520o(Object obj, long j, boolean z) {
            if (UnsafeUtil.f57152w) {
                UnsafeUtil.m81366L(obj, j, z);
            } else {
                UnsafeUtil.m81367M(obj, j, z);
            }
        }

        /* renamed from: p */
        public void mo65521p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: q */
        public void mo65522q(Object obj, long j, byte b) {
            if (UnsafeUtil.f57152w) {
                UnsafeUtil.m81370P(obj, j, b);
            } else {
                UnsafeUtil.m81371Q(obj, j, b);
            }
        }

        /* renamed from: r */
        public void mo65523r(Object obj, long j, double d) {
            mo65532u(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: s */
        public void mo65524s(Object obj, long j, float f) {
            mo65531t(obj, j, Float.floatToIntBits(f));
        }
    }

    private static final class Android64MemoryAccessor extends MemoryAccessor {
        Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo65512c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo65513d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public boolean mo65514e(Object obj, long j) {
            if (UnsafeUtil.f57152w) {
                return UnsafeUtil.m81398t(obj, j);
            }
            return UnsafeUtil.m81399u(obj, j);
        }

        /* renamed from: f */
        public byte mo65515f(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public byte mo65516g(Object obj, long j) {
            if (UnsafeUtil.f57152w) {
                return UnsafeUtil.m81402x(obj, j);
            }
            return UnsafeUtil.m81403y(obj, j);
        }

        /* renamed from: h */
        public double mo65517h(Object obj, long j) {
            return Double.longBitsToDouble(mo65528l(obj, j));
        }

        /* renamed from: i */
        public float mo65518i(Object obj, long j) {
            return Float.intBitsToFloat(mo65527j(obj, j));
        }

        /* renamed from: k */
        public long mo65519k(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public void mo65520o(Object obj, long j, boolean z) {
            if (UnsafeUtil.f57152w) {
                UnsafeUtil.m81366L(obj, j, z);
            } else {
                UnsafeUtil.m81367M(obj, j, z);
            }
        }

        /* renamed from: p */
        public void mo65521p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: q */
        public void mo65522q(Object obj, long j, byte b) {
            if (UnsafeUtil.f57152w) {
                UnsafeUtil.m81370P(obj, j, b);
            } else {
                UnsafeUtil.m81371Q(obj, j, b);
            }
        }

        /* renamed from: r */
        public void mo65523r(Object obj, long j, double d) {
            mo65532u(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: s */
        public void mo65524s(Object obj, long j, float f) {
            mo65531t(obj, j, Float.floatToIntBits(f));
        }
    }

    private static final class JvmMemoryAccessor extends MemoryAccessor {
        JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo65512c(long j, byte[] bArr, long j2, long j3) {
            this.f57153a.copyMemory((Object) null, j, bArr, UnsafeUtil.f57137h + j2, j3);
        }

        /* renamed from: d */
        public void mo65513d(byte[] bArr, long j, long j2, long j3) {
            this.f57153a.copyMemory(bArr, UnsafeUtil.f57137h + j, (Object) null, j2, j3);
        }

        /* renamed from: e */
        public boolean mo65514e(Object obj, long j) {
            return this.f57153a.getBoolean(obj, j);
        }

        /* renamed from: f */
        public byte mo65515f(long j) {
            return this.f57153a.getByte(j);
        }

        /* renamed from: g */
        public byte mo65516g(Object obj, long j) {
            return this.f57153a.getByte(obj, j);
        }

        /* renamed from: h */
        public double mo65517h(Object obj, long j) {
            return this.f57153a.getDouble(obj, j);
        }

        /* renamed from: i */
        public float mo65518i(Object obj, long j) {
            return this.f57153a.getFloat(obj, j);
        }

        /* renamed from: k */
        public long mo65519k(long j) {
            return this.f57153a.getLong(j);
        }

        /* renamed from: o */
        public void mo65520o(Object obj, long j, boolean z) {
            this.f57153a.putBoolean(obj, j, z);
        }

        /* renamed from: p */
        public void mo65521p(long j, byte b) {
            this.f57153a.putByte(j, b);
        }

        /* renamed from: q */
        public void mo65522q(Object obj, long j, byte b) {
            this.f57153a.putByte(obj, j, b);
        }

        /* renamed from: r */
        public void mo65523r(Object obj, long j, double d) {
            this.f57153a.putDouble(obj, j, d);
        }

        /* renamed from: s */
        public void mo65524s(Object obj, long j, float f) {
            this.f57153a.putFloat(obj, j, f);
        }
    }

    private static abstract class MemoryAccessor {

        /* renamed from: a */
        Unsafe f57153a;

        MemoryAccessor(Unsafe unsafe) {
            this.f57153a = unsafe;
        }

        /* renamed from: a */
        public final int mo65525a(Class<?> cls) {
            return this.f57153a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo65526b(Class<?> cls) {
            return this.f57153a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo65512c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract void mo65513d(byte[] bArr, long j, long j2, long j3);

        /* renamed from: e */
        public abstract boolean mo65514e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo65515f(long j);

        /* renamed from: g */
        public abstract byte mo65516g(Object obj, long j);

        /* renamed from: h */
        public abstract double mo65517h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo65518i(Object obj, long j);

        /* renamed from: j */
        public final int mo65527j(Object obj, long j) {
            return this.f57153a.getInt(obj, j);
        }

        /* renamed from: k */
        public abstract long mo65519k(long j);

        /* renamed from: l */
        public final long mo65528l(Object obj, long j) {
            return this.f57153a.getLong(obj, j);
        }

        /* renamed from: m */
        public final Object mo65529m(Object obj, long j) {
            return this.f57153a.getObject(obj, j);
        }

        /* renamed from: n */
        public final long mo65530n(Field field) {
            return this.f57153a.objectFieldOffset(field);
        }

        /* renamed from: o */
        public abstract void mo65520o(Object obj, long j, boolean z);

        /* renamed from: p */
        public abstract void mo65521p(long j, byte b);

        /* renamed from: q */
        public abstract void mo65522q(Object obj, long j, byte b);

        /* renamed from: r */
        public abstract void mo65523r(Object obj, long j, double d);

        /* renamed from: s */
        public abstract void mo65524s(Object obj, long j, float f);

        /* renamed from: t */
        public final void mo65531t(Object obj, long j, int i) {
            this.f57153a.putInt(obj, j, i);
        }

        /* renamed from: u */
        public final void mo65532u(Object obj, long j, long j2) {
            this.f57153a.putLong(obj, j, j2);
        }

        /* renamed from: v */
        public final void mo65533v(Object obj, long j, Object obj2) {
            this.f57153a.putObject(obj, j, obj2);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        long k = (long) m81389k(byte[].class);
        f57137h = k;
        f57138i = (long) m81389k(cls6);
        f57139j = (long) m81390l(cls6);
        f57140k = (long) m81389k(cls5);
        f57141l = (long) m81390l(cls5);
        f57142m = (long) m81389k(cls4);
        f57143n = (long) m81390l(cls4);
        f57144o = (long) m81389k(cls3);
        f57145p = (long) m81390l(cls3);
        f57146q = (long) m81389k(cls2);
        f57147r = (long) m81390l(cls2);
        f57148s = (long) m81389k(cls);
        f57149t = (long) m81390l(cls);
        f57151v = (int) (7 & k);
    }

    private UnsafeUtil() {
    }

    /* renamed from: A */
    static float m81355A(Object obj, long j) {
        return f57134e.mo65518i(obj, j);
    }

    /* renamed from: B */
    static int m81356B(Object obj, long j) {
        return f57134e.mo65527j(obj, j);
    }

    /* renamed from: C */
    static long m81357C(long j) {
        return f57134e.mo65519k(j);
    }

    /* renamed from: D */
    static long m81358D(Object obj, long j) {
        return f57134e.mo65528l(obj, j);
    }

    /* renamed from: E */
    private static MemoryAccessor m81359E() {
        Unsafe unsafe = f57130a;
        if (unsafe == null) {
            return null;
        }
        if (!Android.m79348c()) {
            return new JvmMemoryAccessor(unsafe);
        }
        if (f57132c) {
            return new Android64MemoryAccessor(unsafe);
        }
        if (f57133d) {
            return new Android32MemoryAccessor(unsafe);
        }
        return null;
    }

    /* renamed from: F */
    static Object m81360F(Object obj, long j) {
        return f57134e.mo65529m(obj, j);
    }

    /* renamed from: G */
    static Unsafe m81361G() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() {
                /* renamed from: a */
                public Unsafe run() throws Exception {
                    Class<Unsafe> cls = Unsafe.class;
                    for (Field field : cls.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get((Object) null);
                        if (cls.isInstance(obj)) {
                            return cls.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: H */
    static boolean m81362H() {
        return f57136g;
    }

    /* renamed from: I */
    static boolean m81363I() {
        return f57135f;
    }

    /* renamed from: J */
    static long m81364J(Field field) {
        return f57134e.mo65530n(field);
    }

    /* renamed from: K */
    static void m81365K(Object obj, long j, boolean z) {
        f57134e.mo65520o(obj, j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static void m81366L(Object obj, long j, boolean z) {
        m81370P(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static void m81367M(Object obj, long j, boolean z) {
        m81371Q(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: N */
    static void m81368N(long j, byte b) {
        f57134e.mo65521p(j, b);
    }

    /* renamed from: O */
    static void m81369O(byte[] bArr, long j, byte b) {
        f57134e.mo65522q(bArr, f57137h + j, b);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static void m81370P(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int B = m81356B(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m81374T(obj, j2, ((255 & b) << i) | (B & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static void m81371Q(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m81374T(obj, j2, ((255 & b) << i) | (m81356B(obj, j2) & (~(255 << i))));
    }

    /* renamed from: R */
    static void m81372R(Object obj, long j, double d) {
        f57134e.mo65523r(obj, j, d);
    }

    /* renamed from: S */
    static void m81373S(Object obj, long j, float f) {
        f57134e.mo65524s(obj, j, f);
    }

    /* renamed from: T */
    static void m81374T(Object obj, long j, int i) {
        f57134e.mo65531t(obj, j, i);
    }

    /* renamed from: U */
    static void m81375U(Object obj, long j, long j2) {
        f57134e.mo65532u(obj, j, j2);
    }

    /* renamed from: V */
    static void m81376V(Object obj, long j, Object obj2) {
        f57134e.mo65533v(obj, j, obj2);
    }

    /* renamed from: W */
    private static boolean m81377W() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f57130a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getInt", new Class[]{cls, cls3});
            cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
            cls2.getMethod("getObject", new Class[]{cls, cls3});
            cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
            if (Android.m79348c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(UnsafeUtil.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: X */
    private static boolean m81378X() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f57130a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m81391m() == null) {
                return false;
            }
            if (Android.m79348c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(UnsafeUtil.class.getName());
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: i */
    static long m81387i(ByteBuffer byteBuffer) {
        return f57134e.mo65528l(byteBuffer, f57150u);
    }

    /* renamed from: j */
    static <T> T m81388j(Class<T> cls) {
        try {
            return f57130a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    private static int m81389k(Class<?> cls) {
        if (f57136g) {
            return f57134e.mo65525a(cls);
        }
        return -1;
    }

    /* renamed from: l */
    private static int m81390l(Class<?> cls) {
        if (f57136g) {
            return f57134e.mo65526b(cls);
        }
        return -1;
    }

    /* renamed from: m */
    private static Field m81391m() {
        Field q;
        if (Android.m79348c() && (q = m81395q(Buffer.class, "effectiveDirectAddress")) != null) {
            return q;
        }
        Field q2 = m81395q(Buffer.class, "address");
        if (q2 == null || q2.getType() != Long.TYPE) {
            return null;
        }
        return q2;
    }

    /* renamed from: n */
    static void m81392n(long j, byte[] bArr, long j2, long j3) {
        f57134e.mo65512c(j, bArr, j2, j3);
    }

    /* renamed from: o */
    static void m81393o(byte[] bArr, long j, long j2, long j3) {
        f57134e.mo65513d(bArr, j, j2, j3);
    }

    /* renamed from: p */
    private static boolean m81394p(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!Android.m79348c()) {
            return false;
        }
        try {
            Class<?> cls3 = f57131b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: q */
    private static Field m81395q(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    private static long m81396r(Field field) {
        MemoryAccessor memoryAccessor;
        if (field == null || (memoryAccessor = f57134e) == null) {
            return -1;
        }
        return memoryAccessor.mo65530n(field);
    }

    /* renamed from: s */
    static boolean m81397s(Object obj, long j) {
        return f57134e.mo65514e(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m81398t(Object obj, long j) {
        return m81402x(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static boolean m81399u(Object obj, long j) {
        return m81403y(obj, j) != 0;
    }

    /* renamed from: v */
    static byte m81400v(long j) {
        return f57134e.mo65515f(j);
    }

    /* renamed from: w */
    static byte m81401w(byte[] bArr, long j) {
        return f57134e.mo65516g(bArr, f57137h + j);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static byte m81402x(Object obj, long j) {
        return (byte) ((m81356B(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static byte m81403y(Object obj, long j) {
        return (byte) ((m81356B(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: z */
    static double m81404z(Object obj, long j) {
        return f57134e.mo65517h(obj, j);
    }
}
