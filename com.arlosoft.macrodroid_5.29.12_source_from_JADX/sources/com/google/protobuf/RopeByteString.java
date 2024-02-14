package com.google.protobuf;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

final class RopeByteString extends ByteString {

    /* renamed from: f */
    static final int[] f57056f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.Motion.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */
    public final ByteString left;
    private final int leftLength;
    /* access modifiers changed from: private */
    public final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private static class Balancer {

        /* renamed from: a */
        private final ArrayDeque<ByteString> f57060a;

        private Balancer() {
            this.f57060a = new ArrayDeque<>();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public ByteString m81124b(ByteString byteString, ByteString byteString2) {
            m81125c(byteString);
            m81125c(byteString2);
            ByteString pop = this.f57060a.pop();
            while (!this.f57060a.isEmpty()) {
                pop = new RopeByteString(this.f57060a.pop(), pop);
            }
            return pop;
        }

        /* renamed from: c */
        private void m81125c(ByteString byteString) {
            if (byteString.mo64907D()) {
                m81127e(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                m81125c(ropeByteString.left);
                m81125c(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        /* renamed from: d */
        private int m81126d(int i) {
            int binarySearch = Arrays.binarySearch(RopeByteString.f57056f, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        private void m81127e(ByteString byteString) {
            int d = m81126d(byteString.size());
            int r0 = RopeByteString.m81105r0(d + 1);
            if (this.f57060a.isEmpty() || this.f57060a.peek().size() >= r0) {
                this.f57060a.push(byteString);
                return;
            }
            int r02 = RopeByteString.m81105r0(d);
            ByteString pop = this.f57060a.pop();
            while (!this.f57060a.isEmpty() && this.f57060a.peek().size() < r02) {
                pop = new RopeByteString(this.f57060a.pop(), pop);
            }
            RopeByteString ropeByteString = new RopeByteString(pop, byteString);
            while (!this.f57060a.isEmpty() && this.f57060a.peek().size() < RopeByteString.m81105r0(m81126d(ropeByteString.size()) + 1)) {
                ropeByteString = new RopeByteString(this.f57060a.pop(), ropeByteString);
            }
            this.f57060a.push(ropeByteString);
        }
    }

    private static final class PieceIterator implements Iterator<ByteString.LeafByteString> {

        /* renamed from: a */
        private final ArrayDeque<RopeByteString> f57061a;

        /* renamed from: c */
        private ByteString.LeafByteString f57062c;

        /* renamed from: a */
        private ByteString.LeafByteString m81128a(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f57061a.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        /* renamed from: b */
        private ByteString.LeafByteString m81129b() {
            ByteString.LeafByteString a;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f57061a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a = m81128a(this.f57061a.pop().right);
            } while (a.isEmpty());
            return a;
        }

        /* renamed from: c */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f57062c;
            if (leafByteString != null) {
                this.f57062c = m81129b();
                return leafByteString;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f57062c != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private PieceIterator(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.mo64933z());
                this.f57061a = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.f57062c = m81128a(ropeByteString.left);
                return;
            }
            this.f57061a = null;
            this.f57062c = (ByteString.LeafByteString) byteString;
        }
    }

    /* renamed from: n0 */
    static ByteString m81102n0(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return m81103o0(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, m81103o0(ropeByteString.right, byteString2));
            } else if (ropeByteString.left.mo64933z() > ropeByteString.right.mo64933z() && ropeByteString.mo64933z() > byteString2.mo64933z()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size >= m81105r0(Math.max(byteString.mo64933z(), byteString2.mo64933z()) + 1)) {
            return new RopeByteString(byteString, byteString2);
        }
        return new Balancer().m81124b(byteString, byteString2);
    }

    /* renamed from: o0 */
    private static ByteString m81103o0(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.mo64931u(bArr, 0, 0, size);
        byteString2.mo64931u(bArr, 0, size, size2);
        return ByteString.m79766f0(bArr);
    }

    /* renamed from: q0 */
    private boolean m81104q0(ByteString byteString) {
        boolean z;
        PieceIterator pieceIterator = new PieceIterator(this);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) pieceIterator2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = leafByteString.size() - i;
            int size2 = leafByteString2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = leafByteString.mo64946l0(leafByteString2, i2, min);
            } else {
                z = leafByteString2.mo64946l0(leafByteString, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 < i4) {
                if (min == size) {
                    leafByteString = (ByteString.LeafByteString) pieceIterator.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    leafByteString2 = (ByteString.LeafByteString) pieceIterator2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: r0 */
    static int m81105r0(int i) {
        int[] iArr = f57056f;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public byte mo64906B(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.mo64906B(i);
        }
        return this.right.mo64906B(i - i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo64907D() {
        return this.totalLength >= m81105r0(this.treeDepth);
    }

    /* renamed from: F */
    public boolean mo64908F() {
        int P = this.left.mo64912P(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.mo64912P(P, 0, byteString.size()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public ByteString.ByteIterator iterator() {
        return new ByteString.AbstractByteIterator() {

            /* renamed from: a */
            final PieceIterator f57057a;

            /* renamed from: c */
            ByteString.ByteIterator f57058c = m81121b();

            {
                this.f57057a = new PieceIterator(RopeByteString.this);
            }

            /* renamed from: b */
            private ByteString.ByteIterator m81121b() {
                if (this.f57057a.hasNext()) {
                    return this.f57057a.next().iterator();
                }
                return null;
            }

            /* renamed from: f */
            public byte mo64934f() {
                ByteString.ByteIterator byteIterator = this.f57058c;
                if (byteIterator != null) {
                    byte f = byteIterator.mo64934f();
                    if (!this.f57058c.hasNext()) {
                        this.f57058c = m81121b();
                    }
                    return f;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return this.f57058c != null;
            }
        };
    }

    /* renamed from: M */
    public CodedInputStream mo64910M() {
        return CodedInputStream.m79834f(new RopeInputStream());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public int mo64911O(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.mo64911O(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.mo64911O(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.mo64911O(this.left.mo64911O(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public int mo64912P(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.mo64912P(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.mo64912P(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.mo64912P(this.left.mo64912P(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: T */
    public ByteString mo64915T(int i, int i2) {
        int j = ByteString.m79769j(i, i2, this.totalLength);
        if (j == 0) {
            return ByteString.f56619a;
        }
        if (j == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.mo64915T(i, i2);
        }
        if (i >= i3) {
            return this.right.mo64915T(i - i3, i2 - i3);
        }
        return new RopeByteString(this.left.mo64914R(i), this.right.mo64915T(0, i2 - this.leftLength));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public String mo64918Y(Charset charset) {
        return new String(mo64916V(), charset);
    }

    /* renamed from: d */
    public ByteBuffer mo64920d() {
        return ByteBuffer.wrap(mo64916V()).asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int Q = mo64913Q();
        int Q2 = byteString.mo64913Q();
        if (Q == 0 || Q2 == 0 || Q == Q2) {
            return m81104q0(byteString);
        }
        return false;
    }

    /* renamed from: h */
    public byte mo64922h(int i) {
        ByteString.m79768i(i, this.totalLength);
        return mo64906B(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo64923h0(ByteOutput byteOutput) throws IOException {
        this.left.mo64923h0(byteOutput);
        this.right.mo64923h0(byteOutput);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo64925i0(ByteOutput byteOutput) throws IOException {
        this.right.mo64925i0(byteOutput);
        this.left.mo64925i0(byteOutput);
    }

    public int size() {
        return this.totalLength;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo64932w(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.mo64932w(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.mo64932w(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.mo64932w(bArr, i, i2, i6);
            this.right.mo64932w(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return ByteString.m79766f0(mo64916V());
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo64933z() {
        return this.treeDepth;
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.mo64933z(), byteString2.mo64933z()) + 1;
    }

    private class RopeInputStream extends InputStream {

        /* renamed from: a */
        private PieceIterator f57063a;

        /* renamed from: c */
        private ByteString.LeafByteString f57064c;

        /* renamed from: d */
        private int f57065d;

        /* renamed from: f */
        private int f57066f;

        /* renamed from: g */
        private int f57067g;

        /* renamed from: o */
        private int f57068o;

        public RopeInputStream() {
            m81133e();
        }

        /* renamed from: b */
        private void m81131b() {
            int i;
            if (this.f57064c != null && this.f57066f == (i = this.f57065d)) {
                this.f57067g += i;
                this.f57066f = 0;
                if (this.f57063a.hasNext()) {
                    ByteString.LeafByteString c = this.f57063a.next();
                    this.f57064c = c;
                    this.f57065d = c.size();
                    return;
                }
                this.f57064c = null;
                this.f57065d = 0;
            }
        }

        /* renamed from: c */
        private int m81132c() {
            return RopeByteString.this.size() - (this.f57067g + this.f57066f);
        }

        /* renamed from: e */
        private void m81133e() {
            PieceIterator pieceIterator = new PieceIterator(RopeByteString.this);
            this.f57063a = pieceIterator;
            ByteString.LeafByteString c = pieceIterator.next();
            this.f57064c = c;
            this.f57065d = c.size();
            this.f57066f = 0;
            this.f57067g = 0;
        }

        /* renamed from: f */
        private int m81134f(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                m81131b();
                if (this.f57064c == null) {
                    break;
                }
                int min = Math.min(this.f57065d - this.f57066f, i3);
                if (bArr != null) {
                    this.f57064c.mo64931u(bArr, this.f57066f, i, min);
                    i += min;
                }
                this.f57066f += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        public int available() throws IOException {
            return m81132c();
        }

        public void mark(int i) {
            this.f57068o = this.f57067g + this.f57066f;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            Objects.requireNonNull(bArr);
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int f = m81134f(bArr, i, i2);
            if (f != 0) {
                return f;
            }
            if (i2 > 0 || m81132c() == 0) {
                return -1;
            }
            return f;
        }

        public synchronized void reset() {
            m81133e();
            m81134f((byte[]) null, 0, this.f57068o);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) m81134f((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            m81131b();
            ByteString.LeafByteString leafByteString = this.f57064c;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f57066f;
            this.f57066f = i + 1;
            return leafByteString.mo64922h(i) & 255;
        }
    }
}
