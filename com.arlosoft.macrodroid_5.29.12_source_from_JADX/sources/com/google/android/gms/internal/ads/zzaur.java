package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaur extends zzaum {

    /* renamed from: b */
    public final zzaup f25708b = new zzaup();

    /* renamed from: c */
    public ByteBuffer f25709c;

    /* renamed from: d */
    public long f25710d;

    public zzaur(int i) {
    }

    /* renamed from: j */
    private final ByteBuffer m42553j(int i) {
        int i2;
        ByteBuffer byteBuffer = this.f25709c;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + i2 + " < " + i + ")");
    }

    /* renamed from: b */
    public final void mo42065b() {
        super.mo42065b();
        ByteBuffer byteBuffer = this.f25709c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: h */
    public final void mo42074h(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f25709c;
        if (byteBuffer == null) {
            this.f25709c = m42553j(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f25709c.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer j = m42553j(i2);
            if (position > 0) {
                this.f25709c.position(0);
                this.f25709c.limit(position);
                j.put(this.f25709c);
            }
            this.f25709c = j;
        }
    }

    /* renamed from: i */
    public final boolean mo42075i() {
        return mo42067d(BasicMeasure.EXACTLY);
    }
}
