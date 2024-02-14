package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
import org.apache.commons.p353io.FileUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzpe implements zzng {

    /* renamed from: b */
    private int f38161b;

    /* renamed from: c */
    private float f38162c = 1.0f;

    /* renamed from: d */
    private float f38163d = 1.0f;

    /* renamed from: e */
    private zzne f38164e;

    /* renamed from: f */
    private zzne f38165f;

    /* renamed from: g */
    private zzne f38166g;

    /* renamed from: h */
    private zzne f38167h;

    /* renamed from: i */
    private boolean f38168i;
    @Nullable

    /* renamed from: j */
    private zzpd f38169j;

    /* renamed from: k */
    private ByteBuffer f38170k;

    /* renamed from: l */
    private ShortBuffer f38171l;

    /* renamed from: m */
    private ByteBuffer f38172m;

    /* renamed from: n */
    private long f38173n;

    /* renamed from: o */
    private long f38174o;

    /* renamed from: p */
    private boolean f38175p;

    public zzpe() {
        zzne zzne = zzne.f37944e;
        this.f38164e = zzne;
        this.f38165f = zzne;
        this.f38166g = zzne;
        this.f38167h = zzne;
        ByteBuffer byteBuffer = zzng.f37949a;
        this.f38170k = byteBuffer;
        this.f38171l = byteBuffer.asShortBuffer();
        this.f38172m = byteBuffer;
        this.f38161b = -1;
    }

    /* renamed from: a */
    public final void mo47873a() {
        if (mo47878f()) {
            zzne zzne = this.f38164e;
            this.f38166g = zzne;
            zzne zzne2 = this.f38165f;
            this.f38167h = zzne2;
            if (this.f38168i) {
                this.f38169j = new zzpd(zzne.f37945a, zzne.f37946b, this.f38162c, this.f38163d, zzne2.f37945a);
            } else {
                zzpd zzpd = this.f38169j;
                if (zzpd != null) {
                    zzpd.mo48002c();
                }
            }
        }
        this.f38172m = zzng.f37949a;
        this.f38173n = 0;
        this.f38174o = 0;
        this.f38175p = false;
    }

    /* renamed from: b */
    public final void mo47874b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzpd zzpd = this.f38169j;
            Objects.requireNonNull(zzpd);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f38173n += (long) remaining;
            zzpd.mo48005f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: c */
    public final void mo47875c() {
        this.f38162c = 1.0f;
        this.f38163d = 1.0f;
        zzne zzne = zzne.f37944e;
        this.f38164e = zzne;
        this.f38165f = zzne;
        this.f38166g = zzne;
        this.f38167h = zzne;
        ByteBuffer byteBuffer = zzng.f37949a;
        this.f38170k = byteBuffer;
        this.f38171l = byteBuffer.asShortBuffer();
        this.f38172m = byteBuffer;
        this.f38161b = -1;
        this.f38168i = false;
        this.f38169j = null;
        this.f38173n = 0;
        this.f38174o = 0;
        this.f38175p = false;
    }

    /* renamed from: d */
    public final void mo47876d() {
        zzpd zzpd = this.f38169j;
        if (zzpd != null) {
            zzpd.mo48004e();
        }
        this.f38175p = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f38169j;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47877e() {
        /*
            r3 = this;
            boolean r0 = r3.f38175p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.zzpd r0 = r3.f38169j
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo48000a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.mo47877e():boolean");
    }

    /* renamed from: f */
    public final boolean mo47878f() {
        if (this.f38165f.f37945a != -1) {
            return Math.abs(this.f38162c + -1.0f) >= 1.0E-4f || Math.abs(this.f38163d + -1.0f) >= 1.0E-4f || this.f38165f.f37945a != this.f38164e.f37945a;
        }
        return false;
    }

    /* renamed from: g */
    public final zzne mo47879g(zzne zzne) throws zznf {
        if (zzne.f37947c == 2) {
            int i = this.f38161b;
            if (i == -1) {
                i = zzne.f37945a;
            }
            this.f38164e = zzne;
            zzne zzne2 = new zzne(i, zzne.f37946b, 2);
            this.f38165f = zzne2;
            this.f38168i = true;
            return zzne2;
        }
        throw new zznf(zzne);
    }

    /* renamed from: h */
    public final long mo48006h(long j) {
        long j2 = this.f38174o;
        if (j2 < FileUtils.ONE_KB) {
            return (long) (((double) this.f38162c) * ((double) j));
        }
        long j3 = this.f38173n;
        zzpd zzpd = this.f38169j;
        Objects.requireNonNull(zzpd);
        long b = j3 - ((long) zzpd.mo48001b());
        int i = this.f38167h.f37945a;
        int i2 = this.f38166g.f37945a;
        if (i == i2) {
            return zzen.m49165g0(j, b, j2);
        }
        return zzen.m49165g0(j, b * ((long) i), j2 * ((long) i2));
    }

    /* renamed from: i */
    public final void mo48007i(float f) {
        if (this.f38163d != f) {
            this.f38163d = f;
            this.f38168i = true;
        }
    }

    /* renamed from: j */
    public final void mo48008j(float f) {
        if (this.f38162c != f) {
            this.f38162c = f;
            this.f38168i = true;
        }
    }

    public final ByteBuffer zzb() {
        int a;
        zzpd zzpd = this.f38169j;
        if (zzpd != null && (a = zzpd.mo48000a()) > 0) {
            if (this.f38170k.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.f38170k = order;
                this.f38171l = order.asShortBuffer();
            } else {
                this.f38170k.clear();
                this.f38171l.clear();
            }
            zzpd.mo48003d(this.f38171l);
            this.f38174o += (long) a;
            this.f38170k.limit(a);
            this.f38172m = this.f38170k;
        }
        ByteBuffer byteBuffer = this.f38172m;
        this.f38172m = zzng.f37949a;
        return byteBuffer;
    }
}
