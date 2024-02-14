package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzgi extends zzgc {

    /* renamed from: b */
    public final zzgf f36860b = new zzgf();
    @Nullable

    /* renamed from: c */
    public ByteBuffer f36861c;

    /* renamed from: d */
    public boolean f36862d;

    /* renamed from: e */
    public long f36863e;
    @Nullable

    /* renamed from: f */
    public ByteBuffer f36864f;

    /* renamed from: g */
    private final int f36865g;

    static {
        zzbh.m43425b("media3.decoder");
    }

    public zzgi(int i, int i2) {
        this.f36865g = i;
    }

    /* renamed from: l */
    private final ByteBuffer m51935l(int i) {
        int i2;
        int i3 = this.f36865g;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f36861c;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new zzgh(i2, i);
    }

    /* renamed from: b */
    public void mo46720b() {
        super.mo46720b();
        ByteBuffer byteBuffer = this.f36861c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f36864f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f36862d = false;
    }

    /* renamed from: i */
    public final void mo46830i(int i) {
        ByteBuffer byteBuffer = this.f36861c;
        if (byteBuffer == null) {
            this.f36861c = m51935l(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f36861c = byteBuffer;
            return;
        }
        ByteBuffer l = m51935l(i2);
        l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l.put(byteBuffer);
        }
        this.f36861c = l;
    }

    /* renamed from: j */
    public final void mo46831j() {
        ByteBuffer byteBuffer = this.f36861c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f36864f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: k */
    public final boolean mo46832k() {
        return mo46722d(BasicMeasure.EXACTLY);
    }
}
