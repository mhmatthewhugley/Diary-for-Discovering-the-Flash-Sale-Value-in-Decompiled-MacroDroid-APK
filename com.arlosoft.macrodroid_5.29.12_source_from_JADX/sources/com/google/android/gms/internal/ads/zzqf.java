package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzqf extends zzgi {

    /* renamed from: h */
    private long f38240h;

    /* renamed from: i */
    private int f38241i;

    /* renamed from: j */
    private int f38242j = 32;

    public zzqf() {
        super(2, 0);
    }

    /* renamed from: b */
    public final void mo46720b() {
        super.mo46720b();
        this.f38241i = 0;
    }

    /* renamed from: m */
    public final int mo48054m() {
        return this.f38241i;
    }

    /* renamed from: n */
    public final long mo48055n() {
        return this.f38240h;
    }

    /* renamed from: o */
    public final void mo48056o(@IntRange(from = 1) int i) {
        this.f38242j = i;
    }

    /* renamed from: p */
    public final boolean mo48057p(zzgi zzgi) {
        ByteBuffer byteBuffer;
        zzdd.m47210d(!zzgi.mo46722d(BasicMeasure.EXACTLY));
        zzdd.m47210d(!zzgi.mo46722d(268435456));
        zzdd.m47210d(!zzgi.mo46722d(4));
        if (mo48058q()) {
            if (this.f38241i >= this.f38242j || zzgi.mo46722d(Integer.MIN_VALUE) != mo46722d(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzgi.f36861c;
            if (!(byteBuffer2 == null || (byteBuffer = this.f36861c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.f38241i;
        this.f38241i = i + 1;
        if (i == 0) {
            this.f36863e = zzgi.f36863e;
            if (zzgi.mo46722d(1)) {
                mo46721c(1);
            }
        }
        if (zzgi.mo46722d(Integer.MIN_VALUE)) {
            mo46721c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = zzgi.f36861c;
        if (byteBuffer3 != null) {
            mo46830i(byteBuffer3.remaining());
            this.f36861c.put(byteBuffer3);
        }
        this.f38240h = zzgi.f36863e;
        return true;
    }

    /* renamed from: q */
    public final boolean mo48058q() {
        return this.f38241i > 0;
    }
}
