package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: a */
    public static final ByteString f56619a = new LiteralByteString(Internal.f56937c);

    /* renamed from: c */
    private static final ByteArrayCopier f56620c = (Android.m79348c() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier());

    /* renamed from: d */
    private static final Comparator<ByteString> f56621d = new Comparator<ByteString>() {
        /* renamed from: a */
        public int compare(ByteString byteString, ByteString byteString2) {
            ByteIterator I = byteString.iterator();
            ByteIterator I2 = byteString2.iterator();
            while (I.hasNext() && I2.hasNext()) {
                int compare = Integer.compare(ByteString.m79761W(I.mo64934f()), ByteString.m79761W(I2.mo64934f()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    };
    private int hash = 0;

    static abstract class AbstractByteIterator implements ByteIterator {
        AbstractByteIterator() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(mo64934f());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        /* renamed from: a */
        public byte[] mo64941a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    private static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.m79769j(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public byte mo64906B(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        /* renamed from: h */
        public byte mo64922h(int i) {
            ByteString.m79768i(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: m0 */
        public int mo64942m0() {
            return this.bytesOffset;
        }

        public int size() {
            return this.bytesLength;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public void mo64932w(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, mo64942m0() + i, bArr, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return ByteString.m79766f0(mo64916V());
        }
    }

    private interface ByteArrayCopier {
        /* renamed from: a */
        byte[] mo64941a(byte[] bArr, int i, int i2);
    }

    public interface ByteIterator extends Iterator<Byte> {
        /* renamed from: f */
        byte mo64934f();
    }

    static final class CodedBuilder {

        /* renamed from: a */
        private final CodedOutputStream f56625a;

        /* renamed from: b */
        private final byte[] f56626b;

        /* renamed from: a */
        public ByteString mo64944a() {
            this.f56625a.mo65021U();
            return new LiteralByteString(this.f56626b);
        }

        /* renamed from: b */
        public CodedOutputStream mo64945b() {
            return this.f56625a;
        }

        private CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.f56626b = bArr;
            this.f56625a = CodedOutputStream.m80106Y0(bArr);
        }
    }

    static abstract class LeafByteString extends ByteString {
        LeafByteString() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public final boolean mo64907D() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i0 */
        public void mo64925i0(ByteOutput byteOutput) throws IOException {
            mo64923h0(byteOutput);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ByteString.super.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l0 */
        public abstract boolean mo64946l0(ByteString byteString, int i, int i2);

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public final int mo64933z() {
            return 0;
        }
    }

    private static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        LiteralByteString(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.bytes = bArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public byte mo64906B(int i) {
            return this.bytes[i];
        }

        /* renamed from: F */
        public final boolean mo64908F() {
            int m0 = mo64942m0();
            return Utf8.m81487u(this.bytes, m0, size() + m0);
        }

        /* renamed from: M */
        public final CodedInputStream mo64910M() {
            return CodedInputStream.m79839k(this.bytes, mo64942m0(), size(), true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public final int mo64911O(int i, int i2, int i3) {
            return Internal.m80740i(i, this.bytes, mo64942m0() + i2, i3);
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public final int mo64912P(int i, int i2, int i3) {
            int m0 = mo64942m0() + i2;
            return Utf8.m81489w(i, this.bytes, m0, i3 + m0);
        }

        /* renamed from: T */
        public final ByteString mo64915T(int i, int i2) {
            int j = ByteString.m79769j(i, i2, size());
            if (j == 0) {
                return ByteString.f56619a;
            }
            return new BoundedByteString(this.bytes, mo64942m0() + i, j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: Y */
        public final String mo64918Y(Charset charset) {
            return new String(this.bytes, mo64942m0(), size(), charset);
        }

        /* renamed from: d */
        public final ByteBuffer mo64920d() {
            return ByteBuffer.wrap(this.bytes, mo64942m0(), size()).asReadOnlyBuffer();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int Q = mo64913Q();
            int Q2 = literalByteString.mo64913Q();
            if (Q == 0 || Q2 == 0 || Q == Q2) {
                return mo64946l0(literalByteString, 0, size());
            }
            return false;
        }

        /* renamed from: h */
        public byte mo64922h(int i) {
            return this.bytes[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h0 */
        public final void mo64923h0(ByteOutput byteOutput) throws IOException {
            byteOutput.mo64864S(this.bytes, mo64942m0(), size());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l0 */
        public final boolean mo64946l0(ByteString byteString, int i, int i2) {
            if (i2 <= byteString.size()) {
                int i3 = i + i2;
                if (i3 > byteString.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
                } else if (!(byteString instanceof LiteralByteString)) {
                    return byteString.mo64915T(i, i3).equals(mo64915T(0, i2));
                } else {
                    LiteralByteString literalByteString = (LiteralByteString) byteString;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = literalByteString.bytes;
                    int m0 = mo64942m0() + i2;
                    int m02 = mo64942m0();
                    int m03 = literalByteString.mo64942m0() + i;
                    while (m02 < m0) {
                        if (bArr[m02] != bArr2[m03]) {
                            return false;
                        }
                        m02++;
                        m03++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: m0 */
        public int mo64942m0() {
            return 0;
        }

        public int size() {
            return this.bytes.length;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public void mo64932w(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }
    }

    private static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        /* renamed from: a */
        public byte[] mo64941a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    ByteString() {
    }

    /* renamed from: J */
    static CodedBuilder m79760J(int i) {
        return new CodedBuilder(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static int m79761W(byte b) {
        return b & 255;
    }

    /* renamed from: b0 */
    private String m79762b0() {
        if (size() <= 50) {
            return TextFormatEscaper.m81248a(this);
        }
        return TextFormatEscaper.m81248a(mo64915T(0, 47)) + "...";
    }

    /* renamed from: d0 */
    static ByteString m79764d0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return m79767g0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: f */
    private static ByteString m79765f(Iterator<ByteString> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            return m79765f(it, i2).mo64928k(m79765f(it, i - i2));
        }
    }

    /* renamed from: f0 */
    static ByteString m79766f0(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    /* renamed from: g0 */
    static ByteString m79767g0(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    /* renamed from: i */
    static void m79768i(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: j */
    static int m79769j(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: l */
    public static ByteString m79770l(Iterable<ByteString> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        if (i == 0) {
            return f56619a;
        }
        return m79765f(iterable.iterator(), i);
    }

    /* renamed from: m */
    public static ByteString m79771m(ByteBuffer byteBuffer) {
        return m79772n(byteBuffer, byteBuffer.remaining());
    }

    /* renamed from: n */
    public static ByteString m79772n(ByteBuffer byteBuffer, int i) {
        m79769j(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    /* renamed from: p */
    public static ByteString m79773p(byte[] bArr) {
        return m79774q(bArr, 0, bArr.length);
    }

    /* renamed from: q */
    public static ByteString m79774q(byte[] bArr, int i, int i2) {
        m79769j(i, i + i2, bArr.length);
        return new LiteralByteString(f56620c.mo64941a(bArr, i, i2));
    }

    /* renamed from: t */
    public static ByteString m79775t(String str) {
        return new LiteralByteString(str.getBytes(Internal.f56935a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public abstract byte mo64906B(int i);

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract boolean mo64907D();

    /* renamed from: F */
    public abstract boolean mo64908F();

    /* renamed from: I */
    public ByteIterator iterator() {
        return new AbstractByteIterator() {

            /* renamed from: a */
            private int f56622a = 0;

            /* renamed from: c */
            private final int f56623c;

            {
                this.f56623c = ByteString.this.size();
            }

            /* renamed from: f */
            public byte mo64934f() {
                int i = this.f56622a;
                if (i < this.f56623c) {
                    this.f56622a = i + 1;
                    return ByteString.this.mo64906B(i);
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return this.f56622a < this.f56623c;
            }
        };
    }

    /* renamed from: M */
    public abstract CodedInputStream mo64910M();

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public abstract int mo64911O(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract int mo64912P(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final int mo64913Q() {
        return this.hash;
    }

    /* renamed from: R */
    public final ByteString mo64914R(int i) {
        return mo64915T(i, size());
    }

    /* renamed from: T */
    public abstract ByteString mo64915T(int i, int i2);

    /* renamed from: V */
    public final byte[] mo64916V() {
        int size = size();
        if (size == 0) {
            return Internal.f56937c;
        }
        byte[] bArr = new byte[size];
        mo64932w(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: X */
    public final String mo64917X(Charset charset) {
        return size() == 0 ? "" : mo64918Y(charset);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public abstract String mo64918Y(Charset charset);

    /* renamed from: a0 */
    public final String mo64919a0() {
        return mo64917X(Internal.f56935a);
    }

    /* renamed from: d */
    public abstract ByteBuffer mo64920d();

    public abstract boolean equals(Object obj);

    /* renamed from: h */
    public abstract byte mo64922h(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public abstract void mo64923h0(ByteOutput byteOutput) throws IOException;

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = mo64911O(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public abstract void mo64925i0(ByteOutput byteOutput) throws IOException;

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public final ByteString mo64928k(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.m81102n0(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m79762b0()});
    }

    @Deprecated
    /* renamed from: u */
    public final void mo64931u(byte[] bArr, int i, int i2, int i3) {
        m79769j(i, i + i3, size());
        m79769j(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo64932w(bArr, i, i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo64932w(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract int mo64933z();

    public static final class Output extends OutputStream {

        /* renamed from: o */
        private static final byte[] f56627o = new byte[0];

        /* renamed from: a */
        private final int f56628a;

        /* renamed from: c */
        private final ArrayList<ByteString> f56629c;

        /* renamed from: d */
        private int f56630d;

        /* renamed from: f */
        private byte[] f56631f;

        /* renamed from: g */
        private int f56632g;

        /* renamed from: b */
        private void m79827b(int i) {
            this.f56629c.add(new LiteralByteString(this.f56631f));
            int length = this.f56630d + this.f56631f.length;
            this.f56630d = length;
            this.f56631f = new byte[Math.max(this.f56628a, Math.max(i, length >>> 1))];
            this.f56632g = 0;
        }

        /* renamed from: c */
        public synchronized int mo64947c() {
            return this.f56630d + this.f56632g;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo64947c())});
        }

        public synchronized void write(int i) {
            if (this.f56632g == this.f56631f.length) {
                m79827b(1);
            }
            byte[] bArr = this.f56631f;
            int i2 = this.f56632g;
            this.f56632g = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f56631f;
            int length = bArr2.length;
            int i3 = this.f56632g;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f56632g += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m79827b(i4);
                System.arraycopy(bArr, i + length2, this.f56631f, 0, i4);
                this.f56632g = i4;
            }
        }
    }
}
