package com.google.android.gms.internal.wearable;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzeo {

    /* renamed from: a */
    private static final Unsafe f45736a;

    /* renamed from: b */
    private static final Class f45737b = zzai.m64034a();

    /* renamed from: c */
    private static final boolean f45738c;

    /* renamed from: d */
    private static final zzen f45739d;

    /* renamed from: e */
    private static final boolean f45740e;

    /* renamed from: f */
    private static final boolean f45741f;

    /* renamed from: g */
    static final long f45742g = ((long) m64488E(byte[].class));

    /* renamed from: h */
    static final boolean f45743h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m64500l()
            f45736a = r7
            java.lang.Class r8 = com.google.android.gms.internal.wearable.zzai.m64034a()
            f45737b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m64484A(r8)
            f45738c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m64484A(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.gms.internal.wearable.zzem r11 = new com.google.android.gms.internal.wearable.zzem
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.gms.internal.wearable.zzel r11 = new com.google.android.gms.internal.wearable.zzel
            r11.<init>(r7)
        L_0x003b:
            f45739d = r11
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
            sun.misc.Unsafe r11 = r11.f45735a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m64490b()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.wearable.zzeo.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f45740e = r8
            com.google.android.gms.internal.wearable.zzen r8 = f45739d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f45735a
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
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.wearable.zzeo.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f45741f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m64488E(r6)
            long r6 = (long) r6
            f45742g = r6
            m64488E(r5)
            m64489a(r5)
            m64488E(r4)
            m64489a(r4)
            m64488E(r3)
            m64489a(r3)
            m64488E(r2)
            m64489a(r2)
            m64488E(r1)
            m64489a(r1)
            m64488E(r0)
            m64489a(r0)
            java.lang.reflect.Field r0 = m64490b()
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.internal.wearable.zzen r1 = f45739d
            if (r1 == 0) goto L_0x0129
            r1.mo54086l(r0)
        L_0x0129:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r12 = 0
        L_0x0133:
            f45743h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzeo.<clinit>():void");
    }

    private zzeo() {
    }

    /* renamed from: A */
    static boolean m64484A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = zzai.f45533a;
        try {
            Class cls3 = f45737b;
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

    /* renamed from: B */
    static boolean m64485B(Object obj, long j) {
        return f45739d.mo54081g(obj, j);
    }

    /* renamed from: C */
    static boolean m64486C() {
        return f45741f;
    }

    /* renamed from: D */
    static boolean m64487D() {
        return f45740e;
    }

    /* renamed from: E */
    private static int m64488E(Class cls) {
        if (f45741f) {
            return f45739d.mo54082h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m64489a(Class cls) {
        if (f45741f) {
            return f45739d.mo54083i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m64490b() {
        int i = zzai.f45533a;
        Field c = m64491c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m64491c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m64491c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m64492d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        zzen zzen = f45739d;
        int j3 = zzen.mo54084j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzen.mo54088n(obj, j2, ((255 & b) << i) | (j3 & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m64493e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        zzen zzen = f45739d;
        int i = (((int) j) & 3) << 3;
        zzen.mo54088n(obj, j2, ((255 & b) << i) | (zzen.mo54084j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    static double m64494f(Object obj, long j) {
        return f45739d.mo54075a(obj, j);
    }

    /* renamed from: g */
    static float m64495g(Object obj, long j) {
        return f45739d.mo54076b(obj, j);
    }

    /* renamed from: h */
    static int m64496h(Object obj, long j) {
        return f45739d.mo54084j(obj, j);
    }

    /* renamed from: i */
    static long m64497i(Object obj, long j) {
        return f45739d.mo54085k(obj, j);
    }

    /* renamed from: j */
    static Object m64498j(Class cls) {
        try {
            return f45736a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m64499k(Object obj, long j) {
        return f45739d.mo54087m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m64500l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzek());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m64506r(Object obj, long j, boolean z) {
        f45739d.mo54077c(obj, j, z);
    }

    /* renamed from: s */
    static void m64507s(byte[] bArr, long j, byte b) {
        f45739d.mo54078d(bArr, f45742g + j, b);
    }

    /* renamed from: t */
    static void m64508t(Object obj, long j, double d) {
        f45739d.mo54079e(obj, j, d);
    }

    /* renamed from: u */
    static void m64509u(Object obj, long j, float f) {
        f45739d.mo54080f(obj, j, f);
    }

    /* renamed from: v */
    static void m64510v(Object obj, long j, int i) {
        f45739d.mo54088n(obj, j, i);
    }

    /* renamed from: w */
    static void m64511w(Object obj, long j, long j2) {
        f45739d.mo54089o(obj, j, j2);
    }

    /* renamed from: x */
    static void m64512x(Object obj, long j, Object obj2) {
        f45739d.mo54090p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ boolean m64513y(Object obj, long j) {
        return ((byte) ((f45739d.mo54084j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ boolean m64514z(Object obj, long j) {
        return ((byte) ((f45739d.mo54084j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
