package com.google.protobuf;

import java.nio.ByteBuffer;

abstract class AllocatedBuffer {
    AllocatedBuffer() {
    }

    /* renamed from: i */
    public static AllocatedBuffer m79318i(final ByteBuffer byteBuffer) {
        Internal.m80733b(byteBuffer, "buffer");
        return new AllocatedBuffer() {
            /* renamed from: a */
            public byte[] mo64758a() {
                return byteBuffer.array();
            }

            /* renamed from: b */
            public int mo64759b() {
                return byteBuffer.arrayOffset();
            }

            /* renamed from: c */
            public boolean mo64760c() {
                return byteBuffer.hasArray();
            }

            /* renamed from: d */
            public boolean mo64761d() {
                return true;
            }

            /* renamed from: e */
            public int mo64762e() {
                return byteBuffer.limit();
            }

            /* renamed from: f */
            public ByteBuffer mo64763f() {
                return byteBuffer;
            }

            /* renamed from: g */
            public int mo64764g() {
                return byteBuffer.position();
            }

            /* renamed from: h */
            public AllocatedBuffer mo64765h(int i) {
                byteBuffer.position(i);
                return this;
            }
        };
    }

    /* renamed from: j */
    public static AllocatedBuffer m79319j(byte[] bArr) {
        return m79321l(bArr, 0, bArr.length);
    }

    /* renamed from: k */
    public static AllocatedBuffer m79320k(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            return m79321l(bArr, i, i2);
        }
        throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: l */
    private static AllocatedBuffer m79321l(final byte[] bArr, final int i, final int i2) {
        return new AllocatedBuffer() {

            /* renamed from: a */
            private int f56564a;

            /* renamed from: a */
            public byte[] mo64758a() {
                return bArr;
            }

            /* renamed from: b */
            public int mo64759b() {
                return i;
            }

            /* renamed from: c */
            public boolean mo64760c() {
                return true;
            }

            /* renamed from: d */
            public boolean mo64761d() {
                return false;
            }

            /* renamed from: e */
            public int mo64762e() {
                return i2;
            }

            /* renamed from: f */
            public ByteBuffer mo64763f() {
                throw new UnsupportedOperationException();
            }

            /* renamed from: g */
            public int mo64764g() {
                return this.f56564a;
            }

            /* renamed from: h */
            public AllocatedBuffer mo64765h(int i) {
                if (i < 0 || i > i2) {
                    throw new IllegalArgumentException("Invalid position: " + i);
                }
                this.f56564a = i;
                return this;
            }
        };
    }

    /* renamed from: a */
    public abstract byte[] mo64758a();

    /* renamed from: b */
    public abstract int mo64759b();

    /* renamed from: c */
    public abstract boolean mo64760c();

    /* renamed from: d */
    public abstract boolean mo64761d();

    /* renamed from: e */
    public abstract int mo64762e();

    /* renamed from: f */
    public abstract ByteBuffer mo64763f();

    /* renamed from: g */
    public abstract int mo64764g();

    /* renamed from: h */
    public abstract AllocatedBuffer mo64765h(int i);
}
