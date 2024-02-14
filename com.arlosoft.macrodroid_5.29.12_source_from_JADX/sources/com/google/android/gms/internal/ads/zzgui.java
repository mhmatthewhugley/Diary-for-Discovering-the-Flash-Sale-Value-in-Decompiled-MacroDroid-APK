package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgui {

    /* renamed from: a */
    private static final Unsafe f37296a;

    /* renamed from: b */
    private static final Class f37297b = zzgph.m52515a();

    /* renamed from: c */
    private static final boolean f37298c;

    /* renamed from: d */
    private static final zzguh f37299d;

    /* renamed from: e */
    private static final boolean f37300e;

    /* renamed from: f */
    private static final boolean f37301f;

    /* renamed from: g */
    static final long f37302g = ((long) m53433c(byte[].class));

    /* renamed from: h */
    private static final long f37303h;

    /* renamed from: i */
    static final boolean f37304i;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0138  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m53447q()
            f37296a = r7
            java.lang.Class r8 = com.google.android.gms.internal.ads.zzgph.m52515a()
            f37297b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m53429G(r8)
            f37298c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m53429G(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.gms.internal.ads.zzgug r11 = new com.google.android.gms.internal.ads.zzgug
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzguf r11 = new com.google.android.gms.internal.ads.zzguf
            r11.<init>(r7)
        L_0x003b:
            f37299d = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x0048
        L_0x0046:
            r8 = 0
            goto L_0x006e
        L_0x0048:
            sun.misc.Unsafe r11 = r11.f37295a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m53435e()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzgui.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f37300e = r8
            com.google.android.gms.internal.ads.zzguh r8 = f37299d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f37295a
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r13] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e8 }
            r9[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00e8 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e8 }
            r14[r10] = r15     // Catch:{ all -> 0x00e8 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00e8 }
            r6 = 1
            goto L_0x00ed
        L_0x00e8:
            r6 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzgui.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f37301f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m53433c(r6)
            long r6 = (long) r6
            f37302g = r6
            m53433c(r5)
            m53434d(r5)
            m53433c(r4)
            m53434d(r4)
            m53433c(r3)
            m53434d(r3)
            m53433c(r2)
            m53434d(r2)
            m53433c(r1)
            m53434d(r1)
            m53433c(r0)
            m53434d(r0)
            java.lang.reflect.Field r0 = m53435e()
            r1 = -1
            if (r0 == 0) goto L_0x012d
            com.google.android.gms.internal.ads.zzguh r3 = f37299d
            if (r3 != 0) goto L_0x0129
            goto L_0x012d
        L_0x0129:
            long r1 = r3.mo47527n(r0)
        L_0x012d:
            f37303h = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r12 = 0
        L_0x0139:
            f37304i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgui.<clinit>():void");
    }

    private zzgui() {
    }

    /* renamed from: A */
    static void m53423A(Object obj, long j, float f) {
        f37299d.mo47521h(obj, j, f);
    }

    /* renamed from: B */
    static void m53424B(Object obj, long j, int i) {
        f37299d.mo47529p(obj, j, i);
    }

    /* renamed from: C */
    static void m53425C(Object obj, long j, long j2) {
        f37299d.mo47530q(obj, j, j2);
    }

    /* renamed from: D */
    static void m53426D(Object obj, long j, Object obj2) {
        f37299d.mo47531r(obj, j, obj2);
    }

    /* renamed from: E */
    static /* bridge */ /* synthetic */ boolean m53427E(Object obj, long j) {
        return ((byte) ((f37299d.mo47525l(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: F */
    static /* bridge */ /* synthetic */ boolean m53428F(Object obj, long j) {
        return ((byte) ((f37299d.mo47525l(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: G */
    static boolean m53429G(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = zzgph.f36995a;
        try {
            Class cls3 = f37297b;
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

    /* renamed from: H */
    static boolean m53430H(Object obj, long j) {
        return f37299d.mo47522i(obj, j);
    }

    /* renamed from: a */
    static boolean m53431a() {
        return f37301f;
    }

    /* renamed from: b */
    static boolean m53432b() {
        return f37300e;
    }

    /* renamed from: c */
    private static int m53433c(Class cls) {
        if (f37301f) {
            return f37299d.mo47523j(cls);
        }
        return -1;
    }

    /* renamed from: d */
    private static int m53434d(Class cls) {
        if (f37301f) {
            return f37299d.mo47524k(cls);
        }
        return -1;
    }

    /* renamed from: e */
    private static Field m53435e() {
        int i = zzgph.f36995a;
        Field f = m53436f(Buffer.class, "effectiveDirectAddress");
        if (f != null) {
            return f;
        }
        Field f2 = m53436f(Buffer.class, "address");
        if (f2 == null || f2.getType() != Long.TYPE) {
            return null;
        }
        return f2;
    }

    /* renamed from: f */
    private static Field m53436f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m53437g(Object obj, long j, byte b) {
        long j2 = -4 & j;
        zzguh zzguh = f37299d;
        int l = zzguh.mo47525l(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzguh.mo47529p(obj, j2, ((255 & b) << i) | (l & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m53438h(Object obj, long j, byte b) {
        long j2 = -4 & j;
        zzguh zzguh = f37299d;
        int i = (((int) j) & 3) << 3;
        zzguh.mo47529p(obj, j2, ((255 & b) << i) | (zzguh.mo47525l(obj, j2) & (~(255 << i))));
    }

    /* renamed from: i */
    static byte m53439i(long j) {
        return f37299d.mo47514a(j);
    }

    /* renamed from: j */
    static double m53440j(Object obj, long j) {
        return f37299d.mo47515b(obj, j);
    }

    /* renamed from: k */
    static float m53441k(Object obj, long j) {
        return f37299d.mo47516c(obj, j);
    }

    /* renamed from: l */
    static int m53442l(Object obj, long j) {
        return f37299d.mo47525l(obj, j);
    }

    /* renamed from: m */
    static long m53443m(ByteBuffer byteBuffer) {
        return f37299d.mo47526m(byteBuffer, f37303h);
    }

    /* renamed from: n */
    static long m53444n(Object obj, long j) {
        return f37299d.mo47526m(obj, j);
    }

    /* renamed from: o */
    static Object m53445o(Class cls) {
        try {
            return f37296a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: p */
    static Object m53446p(Object obj, long j) {
        return f37299d.mo47528o(obj, j);
    }

    /* renamed from: q */
    static Unsafe m53447q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgue());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: w */
    static void m53453w(long j, byte[] bArr, long j2, long j3) {
        f37299d.mo47517d(j, bArr, j2, j3);
    }

    /* renamed from: x */
    static void m53454x(Object obj, long j, boolean z) {
        f37299d.mo47518e(obj, j, z);
    }

    /* renamed from: y */
    static void m53455y(byte[] bArr, long j, byte b) {
        f37299d.mo47519f(bArr, f37302g + j, b);
    }

    /* renamed from: z */
    static void m53456z(Object obj, long j, double d) {
        f37299d.mo47520g(obj, j, d);
    }
}
