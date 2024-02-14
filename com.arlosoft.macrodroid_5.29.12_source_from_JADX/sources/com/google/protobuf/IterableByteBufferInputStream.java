package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

class IterableByteBufferInputStream extends InputStream {

    /* renamed from: a */
    private Iterator<ByteBuffer> f56952a;

    /* renamed from: c */
    private ByteBuffer f56953c;

    /* renamed from: d */
    private int f56954d;

    /* renamed from: f */
    private int f56955f;

    /* renamed from: g */
    private int f56956g;

    /* renamed from: o */
    private boolean f56957o;

    /* renamed from: p */
    private byte[] f56958p;

    /* renamed from: s */
    private int f56959s;

    /* renamed from: z */
    private long f56960z;

    /* renamed from: b */
    private boolean m80769b() {
        this.f56955f++;
        if (!this.f56952a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f56952a.next();
        this.f56953c = next;
        this.f56956g = next.position();
        if (this.f56953c.hasArray()) {
            this.f56957o = true;
            this.f56958p = this.f56953c.array();
            this.f56959s = this.f56953c.arrayOffset();
        } else {
            this.f56957o = false;
            this.f56960z = UnsafeUtil.m81387i(this.f56953c);
            this.f56958p = null;
        }
        return true;
    }

    /* renamed from: c */
    private void m80770c(int i) {
        int i2 = this.f56956g + i;
        this.f56956g = i2;
        if (i2 == this.f56953c.limit()) {
            m80769b();
        }
    }

    public int read() throws IOException {
        if (this.f56955f == this.f56954d) {
            return -1;
        }
        if (this.f56957o) {
            byte b = this.f56958p[this.f56956g + this.f56959s] & 255;
            m80770c(1);
            return b;
        }
        byte v = UnsafeUtil.m81400v(((long) this.f56956g) + this.f56960z) & 255;
        m80770c(1);
        return v;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f56955f == this.f56954d) {
            return -1;
        }
        int limit = this.f56953c.limit();
        int i3 = this.f56956g;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f56957o) {
            System.arraycopy(this.f56958p, i3 + this.f56959s, bArr, i, i2);
            m80770c(i2);
        } else {
            int position = this.f56953c.position();
            this.f56953c.position(this.f56956g);
            this.f56953c.get(bArr, i, i2);
            this.f56953c.position(position);
            m80770c(i2);
        }
        return i2;
    }
}
