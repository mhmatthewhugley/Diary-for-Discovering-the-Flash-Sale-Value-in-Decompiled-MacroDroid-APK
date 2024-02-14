package com.google.common.hash;

import com.google.common.annotations.GwtIncompatible;
import java.util.Random;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class Striped64 extends Number {

    /* renamed from: f */
    static final ThreadLocal<int[]> f17596f = new ThreadLocal<>();

    /* renamed from: g */
    static final Random f17597g = new Random();

    /* renamed from: o */
    static final int f17598o = Runtime.getRuntime().availableProcessors();

    /* renamed from: p */
    private static final Unsafe f17599p;

    /* renamed from: s */
    private static final long f17600s;

    /* renamed from: z */
    private static final long f17601z;

    /* renamed from: a */
    volatile transient Cell[] f17602a;

    /* renamed from: c */
    volatile transient long f17603c;

    /* renamed from: d */
    volatile transient int f17604d;

    static final class Cell {

        /* renamed from: b */
        private static final Unsafe f17605b;

        /* renamed from: c */
        private static final long f17606c;

        /* renamed from: a */
        volatile long f17607a;

        static {
            try {
                Unsafe b = Striped64.m29855f();
                f17605b = b;
                f17606c = b.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        Cell(long j) {
            this.f17607a = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo37062a(long j, long j2) {
            return f17605b.compareAndSwapLong(this, f17606c, j, j2);
        }
    }

    static {
        try {
            Unsafe f = m29855f();
            f17599p = f;
            Class<Striped64> cls = Striped64.class;
            f17600s = f.objectFieldOffset(cls.getDeclaredField("c"));
            f17601z = f.objectFieldOffset(cls.getDeclaredField("d"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    Striped64() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.hash.Striped64.C72291());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe m29855f() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.hash.Striped64$1 r0 = new com.google.common.hash.Striped64$1     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Striped64.m29855f():sun.misc.Unsafe");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo37057c(long j, long j2) {
        return f17599p.compareAndSwapLong(this, f17600s, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo37058d() {
        return f17599p.compareAndSwapInt(this, f17601z, 0, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract long mo37039e(long j, long j2);

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0023 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37059g(long r17, int[] r19, boolean r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = 1
            r4 = 0
            if (r19 != 0) goto L_0x001b
            java.lang.ThreadLocal<int[]> r5 = f17596f
            int[] r6 = new int[r0]
            r5.set(r6)
            java.util.Random r5 = f17597g
            int r5 = r5.nextInt()
            if (r5 != 0) goto L_0x0018
            r5 = 1
        L_0x0018:
            r6[r4] = r5
            goto L_0x001f
        L_0x001b:
            r5 = r19[r4]
            r6 = r19
        L_0x001f:
            r7 = r5
            r8 = 0
            r5 = r20
        L_0x0023:
            com.google.common.hash.Striped64$Cell[] r9 = r1.f17602a
            if (r9 == 0) goto L_0x00b6
            int r10 = r9.length
            if (r10 <= 0) goto L_0x00b6
            int r11 = r10 + -1
            r11 = r11 & r7
            r11 = r9[r11]
            if (r11 != 0) goto L_0x0063
            int r9 = r1.f17604d
            if (r9 != 0) goto L_0x0061
            com.google.common.hash.Striped64$Cell r9 = new com.google.common.hash.Striped64$Cell
            r9.<init>(r2)
            int r10 = r1.f17604d
            if (r10 != 0) goto L_0x0061
            boolean r10 = r16.mo37058d()
            if (r10 == 0) goto L_0x0061
            com.google.common.hash.Striped64$Cell[] r10 = r1.f17602a     // Catch:{ all -> 0x005d }
            if (r10 == 0) goto L_0x0056
            int r11 = r10.length     // Catch:{ all -> 0x005d }
            if (r11 <= 0) goto L_0x0056
            int r11 = r11 + -1
            r11 = r11 & r7
            r12 = r10[r11]     // Catch:{ all -> 0x005d }
            if (r12 != 0) goto L_0x0056
            r10[r11] = r9     // Catch:{ all -> 0x005d }
            r9 = 1
            goto L_0x0057
        L_0x0056:
            r9 = 0
        L_0x0057:
            r1.f17604d = r4
            if (r9 == 0) goto L_0x0023
            goto L_0x00ee
        L_0x005d:
            r0 = move-exception
            r1.f17604d = r4
            throw r0
        L_0x0061:
            r8 = 0
            goto L_0x00a9
        L_0x0063:
            if (r5 != 0) goto L_0x0067
            r5 = 1
            goto L_0x00a9
        L_0x0067:
            long r12 = r11.f17607a
            long r14 = r1.mo37039e(r12, r2)
            boolean r11 = r11.mo37062a(r12, r14)
            if (r11 == 0) goto L_0x0075
            goto L_0x00ee
        L_0x0075:
            int r11 = f17598o
            if (r10 >= r11) goto L_0x0061
            com.google.common.hash.Striped64$Cell[] r11 = r1.f17602a
            if (r11 == r9) goto L_0x007e
            goto L_0x0061
        L_0x007e:
            if (r8 != 0) goto L_0x0082
            r8 = 1
            goto L_0x00a9
        L_0x0082:
            int r11 = r1.f17604d
            if (r11 != 0) goto L_0x00a9
            boolean r11 = r16.mo37058d()
            if (r11 == 0) goto L_0x00a9
            com.google.common.hash.Striped64$Cell[] r8 = r1.f17602a     // Catch:{ all -> 0x00a5 }
            if (r8 != r9) goto L_0x00a0
            int r8 = r10 << 1
            com.google.common.hash.Striped64$Cell[] r8 = new com.google.common.hash.Striped64.Cell[r8]     // Catch:{ all -> 0x00a5 }
            r11 = 0
        L_0x0095:
            if (r11 >= r10) goto L_0x009e
            r12 = r9[r11]     // Catch:{ all -> 0x00a5 }
            r8[r11] = r12     // Catch:{ all -> 0x00a5 }
            int r11 = r11 + 1
            goto L_0x0095
        L_0x009e:
            r1.f17602a = r8     // Catch:{ all -> 0x00a5 }
        L_0x00a0:
            r1.f17604d = r4
            r8 = 0
            goto L_0x0023
        L_0x00a5:
            r0 = move-exception
            r1.f17604d = r4
            throw r0
        L_0x00a9:
            int r9 = r7 << 13
            r7 = r7 ^ r9
            int r9 = r7 >>> 17
            r7 = r7 ^ r9
            int r9 = r7 << 5
            r7 = r7 ^ r9
            r6[r4] = r7
            goto L_0x0023
        L_0x00b6:
            int r10 = r1.f17604d
            if (r10 != 0) goto L_0x00e2
            com.google.common.hash.Striped64$Cell[] r10 = r1.f17602a
            if (r10 != r9) goto L_0x00e2
            boolean r10 = r16.mo37058d()
            if (r10 == 0) goto L_0x00e2
            com.google.common.hash.Striped64$Cell[] r10 = r1.f17602a     // Catch:{ all -> 0x00de }
            if (r10 != r9) goto L_0x00d8
            r9 = 2
            com.google.common.hash.Striped64$Cell[] r9 = new com.google.common.hash.Striped64.Cell[r9]     // Catch:{ all -> 0x00de }
            r10 = r7 & 1
            com.google.common.hash.Striped64$Cell r11 = new com.google.common.hash.Striped64$Cell     // Catch:{ all -> 0x00de }
            r11.<init>(r2)     // Catch:{ all -> 0x00de }
            r9[r10] = r11     // Catch:{ all -> 0x00de }
            r1.f17602a = r9     // Catch:{ all -> 0x00de }
            r9 = 1
            goto L_0x00d9
        L_0x00d8:
            r9 = 0
        L_0x00d9:
            r1.f17604d = r4
            if (r9 == 0) goto L_0x0023
            goto L_0x00ee
        L_0x00de:
            r0 = move-exception
            r1.f17604d = r4
            throw r0
        L_0x00e2:
            long r9 = r1.f17603c
            long r11 = r1.mo37039e(r9, r2)
            boolean r9 = r1.mo37057c(r9, r11)
            if (r9 == 0) goto L_0x0023
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Striped64.mo37059g(long, int[], boolean):void");
    }
}
