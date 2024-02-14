package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzfn {

    /* renamed from: a */
    private static final Unsafe f40979a;

    /* renamed from: b */
    private static final Class<?> f40980b = zzbu.m58646a();

    /* renamed from: c */
    private static final boolean f40981c;

    /* renamed from: d */
    private static final boolean f40982d;

    /* renamed from: e */
    private static final zzfm f40983e;

    /* renamed from: f */
    private static final boolean f40984f;

    /* renamed from: g */
    private static final boolean f40985g;

    /* renamed from: h */
    static final long f40986h = ((long) m59068E(byte[].class));

    /* renamed from: i */
    static final boolean f40987i;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m59090v()
            f40979a = r7
            java.lang.Class r8 = com.google.android.gms.internal.icing.zzbu.m58646a()
            f40980b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m59091w(r8)
            f40981c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m59091w(r10)
            f40982d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            com.google.android.gms.internal.icing.zzfl r11 = new com.google.android.gms.internal.icing.zzfl
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            com.google.android.gms.internal.icing.zzfk r11 = new com.google.android.gms.internal.icing.zzfk
            r11.<init>(r7)
        L_0x003d:
            f40983e = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x004a
        L_0x0048:
            r8 = 0
            goto L_0x0073
        L_0x004a:
            sun.misc.Unsafe r11 = r11.f40978a
            if (r11 != 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006e }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006e }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x006e }
            r14[r13] = r6     // Catch:{ all -> 0x006e }
            r14[r12] = r8     // Catch:{ all -> 0x006e }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x006e }
            java.lang.reflect.Field r8 = m59070b()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = 1
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            m59092x(r8)
            goto L_0x0048
        L_0x0073:
            f40984f = r8
            com.google.android.gms.internal.icing.zzfm r8 = f40983e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = 0
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f40978a
            if (r8 != 0) goto L_0x0081
            goto L_0x0079
        L_0x0081:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r9[r13] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f1 }
            r9[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00f1 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f1 }
            r14[r10] = r15     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00f1 }
            r6 = 1
            goto L_0x00f6
        L_0x00f1:
            r6 = move-exception
            m59092x(r6)
            goto L_0x0079
        L_0x00f6:
            f40985g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m59068E(r6)
            long r6 = (long) r6
            f40986h = r6
            m59068E(r5)
            m59069a(r5)
            m59068E(r4)
            m59069a(r4)
            m59068E(r3)
            m59069a(r3)
            m59068E(r2)
            m59069a(r2)
            m59068E(r1)
            m59069a(r1)
            m59068E(r0)
            m59069a(r0)
            java.lang.reflect.Field r0 = m59070b()
            if (r0 == 0) goto L_0x0132
            com.google.android.gms.internal.icing.zzfm r1 = f40983e
            if (r1 == 0) goto L_0x0132
            r1.mo50439h(r0)
        L_0x0132:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r12 = 0
        L_0x013c:
            f40987i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzfn.<clinit>():void");
    }

    private zzfn() {
    }

    /* renamed from: A */
    static /* synthetic */ boolean m59064A(Object obj, long j) {
        return ((byte) ((f40983e.mo50442k(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: B */
    static /* synthetic */ boolean m59065B(Object obj, long j) {
        return ((byte) ((f40983e.mo50442k(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: E */
    private static int m59068E(Class<?> cls) {
        if (f40985g) {
            return f40983e.mo50440i(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m59069a(Class<?> cls) {
        if (f40985g) {
            return f40983e.mo50441j(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m59070b() {
        int i = zzbu.f40784a;
        Field c = m59071c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m59071c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m59071c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m59072d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        zzfm zzfm = f40983e;
        int k = zzfm.mo50442k(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzfm.mo50443l(obj, j2, ((255 & b) << i) | (k & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m59073e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        zzfm zzfm = f40983e;
        int i = (((int) j) & 3) << 3;
        zzfm.mo50443l(obj, j2, ((255 & b) << i) | (zzfm.mo50442k(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    static boolean m59074f() {
        return f40985g;
    }

    /* renamed from: g */
    static boolean m59075g() {
        return f40984f;
    }

    /* renamed from: h */
    static <T> T m59076h(Class<T> cls) {
        try {
            return f40979a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: i */
    static int m59077i(Object obj, long j) {
        return f40983e.mo50442k(obj, j);
    }

    /* renamed from: j */
    static void m59078j(Object obj, long j, int i) {
        f40983e.mo50443l(obj, j, i);
    }

    /* renamed from: k */
    static long m59079k(Object obj, long j) {
        return f40983e.mo50444m(obj, j);
    }

    /* renamed from: l */
    static void m59080l(Object obj, long j, long j2) {
        f40983e.mo50445n(obj, j, j2);
    }

    /* renamed from: m */
    static boolean m59081m(Object obj, long j) {
        return f40983e.mo50433b(obj, j);
    }

    /* renamed from: n */
    static void m59082n(Object obj, long j, boolean z) {
        f40983e.mo50434c(obj, j, z);
    }

    /* renamed from: o */
    static float m59083o(Object obj, long j) {
        return f40983e.mo50435d(obj, j);
    }

    /* renamed from: p */
    static void m59084p(Object obj, long j, float f) {
        f40983e.mo50436e(obj, j, f);
    }

    /* renamed from: q */
    static double m59085q(Object obj, long j) {
        return f40983e.mo50437f(obj, j);
    }

    /* renamed from: r */
    static void m59086r(Object obj, long j, double d) {
        f40983e.mo50438g(obj, j, d);
    }

    /* renamed from: s */
    static Object m59087s(Object obj, long j) {
        return f40983e.mo50446o(obj, j);
    }

    /* renamed from: t */
    static void m59088t(Object obj, long j, Object obj2) {
        f40983e.mo50447p(obj, j, obj2);
    }

    /* renamed from: u */
    static void m59089u(byte[] bArr, long j, byte b) {
        f40983e.mo50432a(bArr, f40986h + j, b);
    }

    /* renamed from: v */
    static Unsafe m59090v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzfj());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: w */
    static boolean m59091w(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = zzbu.f40784a;
        try {
            Class<?> cls3 = f40980b;
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

    /* renamed from: x */
    static /* synthetic */ void m59092x(Throwable th) {
        Logger logger = Logger.getLogger(zzfn.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }
}
