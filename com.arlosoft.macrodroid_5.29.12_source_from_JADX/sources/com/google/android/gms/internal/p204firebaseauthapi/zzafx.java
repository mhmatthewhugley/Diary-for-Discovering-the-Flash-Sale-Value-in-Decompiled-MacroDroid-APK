package com.google.android.gms.internal.p204firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzafx {

    /* renamed from: a */
    private static final Unsafe f39850a;

    /* renamed from: b */
    private static final Class f39851b = zzabo.m56119a();

    /* renamed from: c */
    private static final boolean f39852c;

    /* renamed from: d */
    private static final zzafw f39853d;

    /* renamed from: e */
    private static final boolean f39854e;

    /* renamed from: f */
    private static final boolean f39855f;

    /* renamed from: g */
    static final long f39856g = ((long) m56833E(byte[].class));

    /* renamed from: h */
    static final boolean f39857h;

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
            sun.misc.Unsafe r7 = m56845l()
            f39850a = r7
            java.lang.Class r8 = com.google.android.gms.internal.p204firebaseauthapi.zzabo.m56119a()
            f39851b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m56829A(r8)
            f39852c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m56829A(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.gms.internal.firebase-auth-api.zzafv r11 = new com.google.android.gms.internal.firebase-auth-api.zzafv
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.zzafu r11 = new com.google.android.gms.internal.firebase-auth-api.zzafu
            r11.<init>(r7)
        L_0x003b:
            f39853d = r11
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
            sun.misc.Unsafe r11 = r11.f39849a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m56835b()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.p204firebaseauthapi.zzafx.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f39854e = r8
            com.google.android.gms.internal.firebase-auth-api.zzafw r8 = f39853d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f39849a
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
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.p204firebaseauthapi.zzafx.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f39855f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m56833E(r6)
            long r6 = (long) r6
            f39856g = r6
            m56833E(r5)
            m56834a(r5)
            m56833E(r4)
            m56834a(r4)
            m56833E(r3)
            m56834a(r3)
            m56833E(r2)
            m56834a(r2)
            m56833E(r1)
            m56834a(r1)
            m56833E(r0)
            m56834a(r0)
            java.lang.reflect.Field r0 = m56835b()
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.internal.firebase-auth-api.zzafw r1 = f39853d
            if (r1 == 0) goto L_0x0129
            r1.mo49249l(r0)
        L_0x0129:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r12 = 0
        L_0x0133:
            f39857h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzafx.<clinit>():void");
    }

    private zzafx() {
    }

    /* renamed from: A */
    static boolean m56829A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = zzabo.f39623a;
        try {
            Class cls3 = f39851b;
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
    static boolean m56830B(Object obj, long j) {
        return f39853d.mo49244g(obj, j);
    }

    /* renamed from: C */
    static boolean m56831C() {
        return f39855f;
    }

    /* renamed from: D */
    static boolean m56832D() {
        return f39854e;
    }

    /* renamed from: E */
    private static int m56833E(Class cls) {
        if (f39855f) {
            return f39853d.mo49245h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m56834a(Class cls) {
        if (f39855f) {
            return f39853d.mo49246i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m56835b() {
        int i = zzabo.f39623a;
        Field c = m56836c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m56836c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m56836c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m56837d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        zzafw zzafw = f39853d;
        int j3 = zzafw.mo49247j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzafw.mo49251n(obj, j2, ((255 & b) << i) | (j3 & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m56838e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        zzafw zzafw = f39853d;
        int i = (((int) j) & 3) << 3;
        zzafw.mo49251n(obj, j2, ((255 & b) << i) | (zzafw.mo49247j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    static double m56839f(Object obj, long j) {
        return f39853d.mo49238a(obj, j);
    }

    /* renamed from: g */
    static float m56840g(Object obj, long j) {
        return f39853d.mo49239b(obj, j);
    }

    /* renamed from: h */
    static int m56841h(Object obj, long j) {
        return f39853d.mo49247j(obj, j);
    }

    /* renamed from: i */
    static long m56842i(Object obj, long j) {
        return f39853d.mo49248k(obj, j);
    }

    /* renamed from: j */
    static Object m56843j(Class cls) {
        try {
            return f39850a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m56844k(Object obj, long j) {
        return f39853d.mo49250m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m56845l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzaft());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m56851r(Object obj, long j, boolean z) {
        f39853d.mo49240c(obj, j, z);
    }

    /* renamed from: s */
    static void m56852s(byte[] bArr, long j, byte b) {
        f39853d.mo49241d(bArr, f39856g + j, b);
    }

    /* renamed from: t */
    static void m56853t(Object obj, long j, double d) {
        f39853d.mo49242e(obj, j, d);
    }

    /* renamed from: u */
    static void m56854u(Object obj, long j, float f) {
        f39853d.mo49243f(obj, j, f);
    }

    /* renamed from: v */
    static void m56855v(Object obj, long j, int i) {
        f39853d.mo49251n(obj, j, i);
    }

    /* renamed from: w */
    static void m56856w(Object obj, long j, long j2) {
        f39853d.mo49252o(obj, j, j2);
    }

    /* renamed from: x */
    static void m56857x(Object obj, long j, Object obj2) {
        f39853d.mo49253p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ boolean m56858y(Object obj, long j) {
        return ((byte) ((f39853d.mo49247j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ boolean m56859z(Object obj, long j) {
        return ((byte) ((f39853d.mo49247j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
