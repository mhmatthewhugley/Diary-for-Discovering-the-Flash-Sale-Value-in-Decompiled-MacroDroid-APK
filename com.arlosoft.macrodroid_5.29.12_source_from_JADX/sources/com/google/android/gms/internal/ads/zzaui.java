package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaui extends zzawu implements zzbag {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final zzats f25642Q;

    /* renamed from: R */
    private final zzaue f25643R = new zzaue((zzatj) null, new zzatl[0], new zzauh(this, (zzaug) null));

    /* renamed from: S */
    private boolean f25644S;

    /* renamed from: T */
    private int f25645T;

    /* renamed from: U */
    private int f25646U;

    /* renamed from: V */
    private long f25647V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f25648W;

    public zzaui(zzaww zzaww, zzauw zzauw, boolean z, Handler handler, zzatt zzatt) {
        super(1, zzaww, (zzauw) null, true);
        this.f25642Q = new zzats(handler, zzatt);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L_0x0037;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42043A(com.google.android.gms.internal.ads.zzaws r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzasw r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.f26116a
            int r7 = com.google.android.gms.internal.ads.zzbar.f26418a
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L_0x0037
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.zzbar.f26420c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.zzbar.f26419b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r3.f25644S = r0
            android.media.MediaFormat r4 = r6.mo41966b()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaui.mo42043A(com.google.android.gms.internal.ads.zzaws, android.media.MediaCodec, com.google.android.gms.internal.ads.zzasw, android.media.MediaCrypto):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo42044B(String str, long j, long j2) {
        this.f25642Q.mo42014d(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo42045C(zzasw zzasw) throws zzasi {
        super.mo42045C(zzasw);
        this.f25642Q.mo42017g(zzasw);
        this.f25645T = "audio/raw".equals(zzasw.f25527o) ? zzasw.f25514K : 2;
        this.f25646U = zzasw.f25512I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo42046D(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzasi {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f25644S || integer != 6) {
            i = integer;
            iArr = null;
        } else {
            int i2 = this.f25646U;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.f25646U; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        }
        try {
            this.f25643R.mo42031e("audio/raw", i, integer2, this.f25645T, 0, iArr);
        } catch (zzaty e) {
            throw zzasi.m42275a(e, mo41897j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo42047E() throws zzasi {
        try {
            this.f25643R.mo42035i();
        } catch (zzaud e) {
            throw zzasi.m42275a(e, mo41897j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final boolean mo42048G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzasi {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f26137O.f25705e++;
            this.f25643R.mo42032f();
            return true;
        }
        try {
            if (!this.f25643R.mo42039m(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f26137O.f25704d++;
            return true;
        } catch (zzatz | zzaud e) {
            throw zzasi.m42275a(e, mo41897j());
        }
    }

    /* renamed from: P */
    public final boolean mo41979P() {
        return super.mo41979P() && this.f25643R.mo42041o();
    }

    /* renamed from: Q */
    public final zzata mo42049Q() {
        return this.f25643R.mo42029c();
    }

    /* renamed from: S */
    public final long mo42050S() {
        long a = this.f25643R.mo42028a(mo41979P());
        if (a != Long.MIN_VALUE) {
            if (!this.f25648W) {
                a = Math.max(this.f25647V, a);
            }
            this.f25647V = a;
            this.f25648W = false;
        }
        return this.f25647V;
    }

    /* renamed from: X */
    public final zzata mo42051X(zzata zzata) {
        return this.f25643R.mo42030d(zzata);
    }

    /* renamed from: f */
    public final void mo41893f(int i, Object obj) throws zzasi {
        if (i == 2) {
            this.f25643R.mo42038l(((Float) obj).floatValue());
        }
    }

    /* renamed from: g */
    public final zzbag mo41894g() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo41901n() {
        try {
            this.f25643R.mo42036j();
            try {
                super.mo41901n();
            } finally {
                this.f26137O.mo42073a();
                this.f25642Q.mo42015e(this.f26137O);
            }
        } catch (Throwable th) {
            super.mo41901n();
            throw th;
        } finally {
            this.f26137O.mo42073a();
            this.f25642Q.mo42015e(this.f26137O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo41902o(boolean z) throws zzasi {
        super.mo41902o(z);
        this.f25642Q.mo42016f(this.f26137O);
        int i = mo41900m().f25538a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo41903p(long j, boolean z) throws zzasi {
        super.mo41903p(j, z);
        this.f25643R.mo42037k();
        this.f25647V = j;
        this.f25648W = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo41904q() {
        this.f25643R.mo42034h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo41905r() {
        this.f25643R.mo42033g();
    }

    /* renamed from: t */
    public final boolean mo41981t() {
        return this.f25643R.mo42040n() || super.mo41981t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo42052v(zzaww zzaww, zzasw zzasw) throws zzawz {
        int i;
        int i2;
        String str = zzasw.f25527o;
        if (!zzbah.m42941a(str)) {
            return 0;
        }
        int i3 = zzbar.f26418a;
        int i4 = i3 >= 21 ? 16 : 0;
        zzaws c = zzaxe.m42724c(str, false);
        if (c == null) {
            return 1;
        }
        int i5 = 2;
        if (i3 < 21 || (((i = zzasw.f25513J) == -1 || c.mo42149d(i)) && ((i2 = zzasw.f25512I) == -1 || c.mo42148c(i2)))) {
            i5 = 3;
        }
        return i4 | 4 | i5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final zzaws mo42053z(zzaww zzaww, zzasw zzasw, boolean z) throws zzawz {
        return super.mo42053z(zzaww, zzasw, false);
    }
}
