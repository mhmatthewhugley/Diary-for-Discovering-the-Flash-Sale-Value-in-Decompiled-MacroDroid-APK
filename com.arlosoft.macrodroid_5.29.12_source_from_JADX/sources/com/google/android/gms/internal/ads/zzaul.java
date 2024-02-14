package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaul implements zzatl {

    /* renamed from: b */
    private int f25679b = -1;

    /* renamed from: c */
    private int f25680c = -1;

    /* renamed from: d */
    private zzauk f25681d;

    /* renamed from: e */
    private float f25682e = 1.0f;

    /* renamed from: f */
    private float f25683f = 1.0f;

    /* renamed from: g */
    private ByteBuffer f25684g;

    /* renamed from: h */
    private ShortBuffer f25685h;

    /* renamed from: i */
    private ByteBuffer f25686i;

    /* renamed from: j */
    private long f25687j;

    /* renamed from: k */
    private long f25688k;

    /* renamed from: l */
    private boolean f25689l;

    public zzaul() {
        ByteBuffer byteBuffer = zzatl.f25551a;
        this.f25684g = byteBuffer;
        this.f25685h = byteBuffer.asShortBuffer();
        this.f25686i = byteBuffer;
    }

    /* renamed from: a */
    public final ByteBuffer mo41996a() {
        ByteBuffer byteBuffer = this.f25686i;
        this.f25686i = zzatl.f25551a;
        return byteBuffer;
    }

    /* renamed from: b */
    public final void mo41997b() {
        this.f25681d.mo42056c();
        this.f25689l = true;
    }

    /* renamed from: c */
    public final void mo41998c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f25687j += (long) remaining;
            this.f25681d.mo42057d(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a = this.f25681d.mo42054a() * this.f25679b;
        int i = a + a;
        if (i > 0) {
            if (this.f25684g.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f25684g = order;
                this.f25685h = order.asShortBuffer();
            } else {
                this.f25684g.clear();
                this.f25685h.clear();
            }
            this.f25681d.mo42055b(this.f25685h);
            this.f25688k += (long) i;
            this.f25684g.limit(i);
            this.f25686i = this.f25684g;
        }
    }

    /* renamed from: d */
    public final void mo41999d() {
        zzauk zzauk = new zzauk(this.f25680c, this.f25679b);
        this.f25681d = zzauk;
        zzauk.mo42059f(this.f25682e);
        this.f25681d.mo42058e(this.f25683f);
        this.f25686i = zzatl.f25551a;
        this.f25687j = 0;
        this.f25688k = 0;
        this.f25689l = false;
    }

    /* renamed from: e */
    public final boolean mo42000e(int i, int i2, int i3) throws zzatk {
        if (i3 != 2) {
            throw new zzatk(i, i2, i3);
        } else if (this.f25680c == i && this.f25679b == i2) {
            return false;
        } else {
            this.f25680c = i;
            this.f25679b = i2;
            return true;
        }
    }

    /* renamed from: f */
    public final void mo42001f() {
        this.f25681d = null;
        ByteBuffer byteBuffer = zzatl.f25551a;
        this.f25684g = byteBuffer;
        this.f25685h = byteBuffer.asShortBuffer();
        this.f25686i = byteBuffer;
        this.f25679b = -1;
        this.f25680c = -1;
        this.f25687j = 0;
        this.f25688k = 0;
        this.f25689l = false;
    }

    /* renamed from: g */
    public final boolean mo42002g() {
        return Math.abs(this.f25682e + -1.0f) >= 0.01f || Math.abs(this.f25683f + -1.0f) >= 0.01f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f25681d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42003h() {
        /*
            r3 = this;
            boolean r0 = r3.f25689l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.zzauk r0 = r3.f25681d
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo42054a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaul.mo42003h():boolean");
    }

    /* renamed from: i */
    public final float mo42060i(float f) {
        this.f25683f = zzbar.m42985a(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    /* renamed from: j */
    public final float mo42061j(float f) {
        float a = zzbar.m42985a(f, 0.1f, 8.0f);
        this.f25682e = a;
        return a;
    }

    /* renamed from: k */
    public final long mo42062k() {
        return this.f25687j;
    }

    /* renamed from: l */
    public final long mo42063l() {
        return this.f25688k;
    }

    public final int zza() {
        return this.f25679b;
    }

    public final int zzb() {
        return 2;
    }
}
