package com.google.android.gms.internal.places;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzdy {

    /* renamed from: a */
    private static final Logger f45395a = Logger.getLogger(zzdy.class.getName());

    /* renamed from: b */
    private static final Unsafe f45396b;

    /* renamed from: c */
    private static final Class<?> f45397c = zzp.m63836c();

    /* renamed from: d */
    private static final boolean f45398d;

    /* renamed from: e */
    private static final boolean f45399e;

    /* renamed from: f */
    private static final zzd f45400f;

    /* renamed from: g */
    private static final boolean f45401g = m63694s();

    /* renamed from: h */
    private static final boolean f45402h = m63693r();

    /* renamed from: i */
    private static final long f45403i;

    /* renamed from: j */
    private static final long f45404j;

    /* renamed from: k */
    private static final long f45405k;

    /* renamed from: l */
    private static final long f45406l;

    /* renamed from: m */
    private static final long f45407m;

    /* renamed from: n */
    private static final long f45408n;

    /* renamed from: o */
    private static final long f45409o;

    /* renamed from: p */
    private static final long f45410p;

    /* renamed from: q */
    private static final long f45411q;

    /* renamed from: r */
    private static final long f45412r;

    /* renamed from: s */
    private static final long f45413s;

    /* renamed from: t */
    private static final long f45414t;

    /* renamed from: u */
    private static final long f45415u;

    /* renamed from: v */
    private static final long f45416v;

    /* renamed from: w */
    private static final int f45417w;

    /* renamed from: x */
    static final boolean f45418x = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo53632a(Object obj, long j, double d) {
            mo53641d(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: b */
        public final void mo53633b(Object obj, long j, float f) {
            mo53640c(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: e */
        public final void mo53634e(Object obj, long j, boolean z) {
            if (zzdy.f45418x) {
                zzdy.m63687l(obj, j, z);
            } else {
                zzdy.m63689n(obj, j, z);
            }
        }

        /* renamed from: f */
        public final void mo53635f(Object obj, long j, byte b) {
            if (zzdy.f45418x) {
                zzdy.m63677b(obj, j, b);
            } else {
                zzdy.m63686k(obj, j, b);
            }
        }

        /* renamed from: i */
        public final boolean mo53636i(Object obj, long j) {
            if (zzdy.f45418x) {
                return zzdy.m63670J(obj, j);
            }
            return zzdy.m63671K(obj, j);
        }

        /* renamed from: j */
        public final float mo53637j(Object obj, long j) {
            return Float.intBitsToFloat(mo53642g(obj, j));
        }

        /* renamed from: k */
        public final double mo53638k(Object obj, long j) {
            return Double.longBitsToDouble(mo53643h(obj, j));
        }

        /* renamed from: l */
        public final byte mo53639l(Object obj, long j) {
            if (zzdy.f45418x) {
                return zzdy.m63668H(obj, j);
            }
            return zzdy.m63669I(obj, j);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo53632a(Object obj, long j, double d) {
            mo53641d(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: b */
        public final void mo53633b(Object obj, long j, float f) {
            mo53640c(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: e */
        public final void mo53634e(Object obj, long j, boolean z) {
            if (zzdy.f45418x) {
                zzdy.m63687l(obj, j, z);
            } else {
                zzdy.m63689n(obj, j, z);
            }
        }

        /* renamed from: f */
        public final void mo53635f(Object obj, long j, byte b) {
            if (zzdy.f45418x) {
                zzdy.m63677b(obj, j, b);
            } else {
                zzdy.m63686k(obj, j, b);
            }
        }

        /* renamed from: i */
        public final boolean mo53636i(Object obj, long j) {
            if (zzdy.f45418x) {
                return zzdy.m63670J(obj, j);
            }
            return zzdy.m63671K(obj, j);
        }

        /* renamed from: j */
        public final float mo53637j(Object obj, long j) {
            return Float.intBitsToFloat(mo53642g(obj, j));
        }

        /* renamed from: k */
        public final double mo53638k(Object obj, long j) {
            return Double.longBitsToDouble(mo53643h(obj, j));
        }

        /* renamed from: l */
        public final byte mo53639l(Object obj, long j) {
            if (zzdy.f45418x) {
                return zzdy.m63668H(obj, j);
            }
            return zzdy.m63669I(obj, j);
        }
    }

    static abstract class zzd {

        /* renamed from: a */
        Unsafe f45419a;

        zzd(Unsafe unsafe) {
            this.f45419a = unsafe;
        }

        /* renamed from: a */
        public abstract void mo53632a(Object obj, long j, double d);

        /* renamed from: b */
        public abstract void mo53633b(Object obj, long j, float f);

        /* renamed from: c */
        public final void mo53640c(Object obj, long j, int i) {
            this.f45419a.putInt(obj, j, i);
        }

        /* renamed from: d */
        public final void mo53641d(Object obj, long j, long j2) {
            this.f45419a.putLong(obj, j, j2);
        }

        /* renamed from: e */
        public abstract void mo53634e(Object obj, long j, boolean z);

        /* renamed from: f */
        public abstract void mo53635f(Object obj, long j, byte b);

        /* renamed from: g */
        public final int mo53642g(Object obj, long j) {
            return this.f45419a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long mo53643h(Object obj, long j) {
            return this.f45419a.getLong(obj, j);
        }

        /* renamed from: i */
        public abstract boolean mo53636i(Object obj, long j);

        /* renamed from: j */
        public abstract float mo53637j(Object obj, long j);

        /* renamed from: k */
        public abstract double mo53638k(Object obj, long j);

        /* renamed from: l */
        public abstract byte mo53639l(Object obj, long j);
    }

    static final class zze extends zzd {
        zze(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo53632a(Object obj, long j, double d) {
            this.f45419a.putDouble(obj, j, d);
        }

        /* renamed from: b */
        public final void mo53633b(Object obj, long j, float f) {
            this.f45419a.putFloat(obj, j, f);
        }

        /* renamed from: e */
        public final void mo53634e(Object obj, long j, boolean z) {
            this.f45419a.putBoolean(obj, j, z);
        }

        /* renamed from: f */
        public final void mo53635f(Object obj, long j, byte b) {
            this.f45419a.putByte(obj, j, b);
        }

        /* renamed from: i */
        public final boolean mo53636i(Object obj, long j) {
            return this.f45419a.getBoolean(obj, j);
        }

        /* renamed from: j */
        public final float mo53637j(Object obj, long j) {
            return this.f45419a.getFloat(obj, j);
        }

        /* renamed from: k */
        public final double mo53638k(Object obj, long j) {
            return this.f45419a.getDouble(obj, j);
        }

        /* renamed from: l */
        public final byte mo53639l(Object obj, long j) {
            return this.f45419a.getByte(obj, j);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        Unsafe q = m63692q();
        f45396b = q;
        boolean B = m63662B(Long.TYPE);
        f45398d = B;
        boolean B2 = m63662B(Integer.TYPE);
        f45399e = B2;
        zzd zzd2 = null;
        if (q != null) {
            if (!zzp.m63835b()) {
                zzd2 = new zze(q);
            } else if (B) {
                zzd2 = new zzb(q);
            } else if (B2) {
                zzd2 = new zzc(q);
            }
        }
        f45400f = zzd2;
        long y = (long) m63700y(byte[].class);
        f45403i = y;
        f45404j = (long) m63700y(cls6);
        f45405k = (long) m63701z(cls6);
        f45406l = (long) m63700y(cls5);
        f45407m = (long) m63701z(cls5);
        f45408n = (long) m63700y(cls4);
        f45409o = (long) m63701z(cls4);
        f45410p = (long) m63700y(cls3);
        f45411q = (long) m63701z(cls3);
        f45412r = (long) m63700y(cls2);
        f45413s = (long) m63701z(cls2);
        f45414t = (long) m63700y(cls);
        f45415u = (long) m63701z(cls);
        Field t = m63695t();
        f45416v = (t == null || zzd2 == null) ? -1 : zzd2.f45419a.objectFieldOffset(t);
        f45417w = (int) (7 & y);
    }

    private zzdy() {
    }

    /* renamed from: A */
    static int m63661A(Object obj, long j) {
        return f45400f.mo53642g(obj, j);
    }

    /* renamed from: B */
    private static boolean m63662B(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzp.m63835b()) {
            return false;
        }
        try {
            Class<?> cls3 = f45397c;
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

    /* renamed from: C */
    static long m63663C(Object obj, long j) {
        return f45400f.mo53643h(obj, j);
    }

    /* renamed from: D */
    static boolean m63664D(Object obj, long j) {
        return f45400f.mo53636i(obj, j);
    }

    /* renamed from: E */
    static float m63665E(Object obj, long j) {
        return f45400f.mo53637j(obj, j);
    }

    /* renamed from: F */
    static double m63666F(Object obj, long j) {
        return f45400f.mo53638k(obj, j);
    }

    /* renamed from: G */
    static Object m63667G(Object obj, long j) {
        return f45400f.f45419a.getObject(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static byte m63668H(Object obj, long j) {
        return (byte) (m63661A(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static byte m63669I(Object obj, long j) {
        return (byte) (m63661A(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static boolean m63670J(Object obj, long j) {
        return m63668H(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static boolean m63671K(Object obj, long j) {
        return m63669I(obj, j) != 0;
    }

    /* renamed from: a */
    static byte m63676a(byte[] bArr, long j) {
        return f45400f.mo53639l(bArr, f45403i + j);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m63677b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int A = m63661A(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m63680e(obj, j2, ((255 & b) << i) | (A & (~(255 << i))));
    }

    /* renamed from: c */
    static void m63678c(Object obj, long j, double d) {
        f45400f.mo53632a(obj, j, d);
    }

    /* renamed from: d */
    static void m63679d(Object obj, long j, float f) {
        f45400f.mo53633b(obj, j, f);
    }

    /* renamed from: e */
    static void m63680e(Object obj, long j, int i) {
        f45400f.mo53640c(obj, j, i);
    }

    /* renamed from: f */
    static void m63681f(Object obj, long j, long j2) {
        f45400f.mo53641d(obj, j, j2);
    }

    /* renamed from: g */
    static void m63682g(Object obj, long j, Object obj2) {
        f45400f.f45419a.putObject(obj, j, obj2);
    }

    /* renamed from: h */
    static void m63683h(Object obj, long j, boolean z) {
        f45400f.mo53634e(obj, j, z);
    }

    /* renamed from: i */
    static void m63684i(byte[] bArr, long j, byte b) {
        f45400f.mo53635f(bArr, f45403i + j, b);
    }

    /* renamed from: j */
    private static Field m63685j(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static void m63686k(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m63680e(obj, j2, ((255 & b) << i) | (m63661A(obj, j2) & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m63687l(Object obj, long j, boolean z) {
        m63677b(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m63689n(Object obj, long j, boolean z) {
        m63686k(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: o */
    static boolean m63690o() {
        return f45402h;
    }

    /* renamed from: p */
    static boolean m63691p() {
        return f45401g;
    }

    /* renamed from: q */
    static Unsafe m63692q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzdx());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    private static boolean m63693r() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f45396b;
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
            if (zzp.m63835b()) {
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
            Logger logger = f45395a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: s */
    private static boolean m63694s() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f45396b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m63695t() == null) {
                return false;
            }
            if (zzp.m63835b()) {
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
            Logger logger = f45395a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: t */
    private static Field m63695t() {
        Field j;
        if (zzp.m63835b() && (j = m63685j(Buffer.class, "effectiveDirectAddress")) != null) {
            return j;
        }
        Field j2 = m63685j(Buffer.class, "address");
        if (j2 == null || j2.getType() != Long.TYPE) {
            return null;
        }
        return j2;
    }

    /* renamed from: x */
    static <T> T m63699x(Class<T> cls) {
        try {
            return f45396b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: y */
    private static int m63700y(Class<?> cls) {
        if (f45402h) {
            return f45400f.f45419a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: z */
    private static int m63701z(Class<?> cls) {
        if (f45402h) {
            return f45400f.f45419a.arrayIndexScale(cls);
        }
        return -1;
    }
}
