package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

final class NioByteString extends ByteString.LeafByteString {
    private final ByteBuffer buffer;

    NioByteString(ByteBuffer byteBuffer) {
        Internal.m80733b(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    /* renamed from: m0 */
    private ByteBuffer m81016m0(int i, int i2) {
        if (i < this.buffer.position() || i2 > this.buffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        ByteBuffer slice = this.buffer.slice();
        slice.position(i - this.buffer.position());
        slice.limit(i2 - this.buffer.position());
        return slice;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.m79771m(this.buffer.slice());
    }

    /* renamed from: B */
    public byte mo64906B(int i) {
        return mo64922h(i);
    }

    /* renamed from: F */
    public boolean mo64908F() {
        return Utf8.m81485s(this.buffer);
    }

    /* renamed from: M */
    public CodedInputStream mo64910M() {
        return CodedInputStream.m79836h(this.buffer, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public int mo64911O(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.buffer.get(i4);
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public int mo64912P(int i, int i2, int i3) {
        return Utf8.m81488v(i, this.buffer, i2, i3 + i2);
    }

    /* renamed from: T */
    public ByteString mo64915T(int i, int i2) {
        try {
            return new NioByteString(m81016m0(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public String mo64918Y(Charset charset) {
        int i;
        int i2;
        byte[] bArr;
        if (this.buffer.hasArray()) {
            bArr = this.buffer.array();
            i2 = this.buffer.arrayOffset() + this.buffer.position();
            i = this.buffer.remaining();
        } else {
            bArr = mo64916V();
            i2 = 0;
            i = bArr.length;
        }
        return new String(bArr, i2, i, charset);
    }

    /* renamed from: d */
    public ByteBuffer mo64920d() {
        return this.buffer.asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof NioByteString) {
            return this.buffer.equals(((NioByteString) obj).buffer);
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        return this.buffer.equals(byteString.mo64920d());
    }

    /* renamed from: h */
    public byte mo64922h(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo64923h0(ByteOutput byteOutput) throws IOException {
        byteOutput.mo64863R(this.buffer.slice());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public boolean mo64946l0(ByteString byteString, int i, int i2) {
        return mo64915T(0, i2).equals(byteString.mo64915T(i, i2 + i));
    }

    public int size() {
        return this.buffer.remaining();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo64932w(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    /* renamed from: com.google.protobuf.NioByteString$1 */
    class C116021 extends InputStream {

        /* renamed from: a */
        private final ByteBuffer f57034a;

        public int available() throws IOException {
            return this.f57034a.remaining();
        }

        public void mark(int i) {
            this.f57034a.mark();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() throws IOException {
            if (!this.f57034a.hasRemaining()) {
                return -1;
            }
            return this.f57034a.get() & 255;
        }

        public void reset() throws IOException {
            try {
                this.f57034a.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f57034a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, this.f57034a.remaining());
            this.f57034a.get(bArr, i, min);
            return min;
        }
    }
}
