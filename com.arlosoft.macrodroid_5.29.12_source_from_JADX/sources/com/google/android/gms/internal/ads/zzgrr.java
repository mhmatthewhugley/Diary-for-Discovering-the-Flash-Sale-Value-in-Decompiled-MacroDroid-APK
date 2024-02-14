package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgrr extends InputStream {

    /* renamed from: a */
    private Iterator f37167a;

    /* renamed from: c */
    private ByteBuffer f37168c;

    /* renamed from: d */
    private int f37169d = 0;

    /* renamed from: f */
    private int f37170f;

    /* renamed from: g */
    private int f37171g;

    /* renamed from: o */
    private boolean f37172o;

    /* renamed from: p */
    private byte[] f37173p;

    /* renamed from: s */
    private int f37174s;

    /* renamed from: z */
    private long f37175z;

    zzgrr(Iterable iterable) {
        this.f37167a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f37169d++;
        }
        this.f37170f = -1;
        if (!m53045c()) {
            this.f37168c = zzgro.f37165e;
            this.f37170f = 0;
            this.f37171g = 0;
            this.f37175z = 0;
        }
    }

    /* renamed from: b */
    private final void m53044b(int i) {
        int i2 = this.f37171g + i;
        this.f37171g = i2;
        if (i2 == this.f37168c.limit()) {
            m53045c();
        }
    }

    /* renamed from: c */
    private final boolean m53045c() {
        this.f37170f++;
        if (!this.f37167a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f37167a.next();
        this.f37168c = byteBuffer;
        this.f37171g = byteBuffer.position();
        if (this.f37168c.hasArray()) {
            this.f37172o = true;
            this.f37173p = this.f37168c.array();
            this.f37174s = this.f37168c.arrayOffset();
        } else {
            this.f37172o = false;
            this.f37175z = zzgui.m53443m(this.f37168c);
            this.f37173p = null;
        }
        return true;
    }

    public final int read() throws IOException {
        byte i;
        if (this.f37170f == this.f37169d) {
            return -1;
        }
        if (this.f37172o) {
            i = this.f37173p[this.f37171g + this.f37174s];
            m53044b(1);
        } else {
            i = zzgui.m53439i(((long) this.f37171g) + this.f37175z);
            m53044b(1);
        }
        return i & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f37170f == this.f37169d) {
            return -1;
        }
        int limit = this.f37168c.limit();
        int i3 = this.f37171g;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f37172o) {
            System.arraycopy(this.f37173p, i3 + this.f37174s, bArr, i, i2);
            m53044b(i2);
        } else {
            int position = this.f37168c.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f37168c.position(this.f37171g);
            this.f37168c.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f37168c.position(position);
            m53044b(i2);
        }
        return i2;
    }
}
