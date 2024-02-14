package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzauj implements zzatl {

    /* renamed from: b */
    private int f25649b = -1;

    /* renamed from: c */
    private int f25650c = -1;

    /* renamed from: d */
    private int f25651d = 0;

    /* renamed from: e */
    private ByteBuffer f25652e;

    /* renamed from: f */
    private ByteBuffer f25653f;

    /* renamed from: g */
    private boolean f25654g;

    public zzauj() {
        ByteBuffer byteBuffer = zzatl.f25551a;
        this.f25652e = byteBuffer;
        this.f25653f = byteBuffer;
    }

    /* renamed from: a */
    public final ByteBuffer mo41996a() {
        ByteBuffer byteBuffer = this.f25653f;
        this.f25653f = zzatl.f25551a;
        return byteBuffer;
    }

    /* renamed from: b */
    public final void mo41997b() {
        this.f25654g = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[LOOP:2: B:23:0x0080->B:24:0x0082, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0040, B:24:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41998c(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f25651d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0022
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 + r2
        L_0x0022:
            java.nio.ByteBuffer r3 = r7.f25652e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x0039
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f25652e = r2
            goto L_0x003e
        L_0x0039:
            java.nio.ByteBuffer r2 = r7.f25652e
            r2.clear()
        L_0x003e:
            int r2 = r7.f25651d
            if (r2 == r5) goto L_0x0080
            if (r2 == r6) goto L_0x0067
            if (r2 != r4) goto L_0x0061
        L_0x0046:
            if (r0 >= r1) goto L_0x009b
            java.nio.ByteBuffer r2 = r7.f25652e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f25652e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0046
        L_0x0061:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0067:
            if (r0 >= r1) goto L_0x009b
            java.nio.ByteBuffer r2 = r7.f25652e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f25652e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0067
        L_0x0080:
            if (r0 >= r1) goto L_0x009b
            java.nio.ByteBuffer r2 = r7.f25652e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f25652e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0080
        L_0x009b:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f25652e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f25652e
            r7.f25653f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauj.mo41998c(java.nio.ByteBuffer):void");
    }

    /* renamed from: d */
    public final void mo41999d() {
        this.f25653f = zzatl.f25551a;
        this.f25654g = false;
    }

    /* renamed from: e */
    public final boolean mo42000e(int i, int i2, int i3) throws zzatk {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new zzatk(i, i2, i3);
        } else if (this.f25649b == i && this.f25650c == i2 && this.f25651d == i3) {
            return false;
        } else {
            this.f25649b = i;
            this.f25650c = i2;
            this.f25651d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f25652e = zzatl.f25551a;
            return true;
        }
    }

    /* renamed from: f */
    public final void mo42001f() {
        mo41999d();
        this.f25652e = zzatl.f25551a;
        this.f25649b = -1;
        this.f25650c = -1;
        this.f25651d = 0;
    }

    /* renamed from: g */
    public final boolean mo42002g() {
        int i = this.f25651d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: h */
    public final boolean mo42003h() {
        return this.f25654g && this.f25653f == zzatl.f25551a;
    }

    public final int zza() {
        return this.f25650c;
    }

    public final int zzb() {
        return 2;
    }
}
