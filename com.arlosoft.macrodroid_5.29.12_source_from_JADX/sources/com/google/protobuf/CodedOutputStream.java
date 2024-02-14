package com.google.protobuf;

import com.google.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends ByteOutput {

    /* renamed from: c */
    private static final Logger f56689c = Logger.getLogger(CodedOutputStream.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f56690d = UnsafeUtil.m81362H();

    /* renamed from: a */
    CodedOutputStreamWriter f56691a;

    /* renamed from: b */
    private boolean f56692b;

    private static abstract class AbstractBufferedEncoder extends CodedOutputStream {

        /* renamed from: e */
        final byte[] f56693e;

        /* renamed from: f */
        final int f56694f;

        /* renamed from: g */
        int f56695g;

        /* renamed from: h */
        int f56696h;

        AbstractBufferedEncoder(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f56693e = bArr;
                this.f56694f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E1 */
        public final void mo65061E1(byte b) {
            byte[] bArr = this.f56693e;
            int i = this.f56695g;
            this.f56695g = i + 1;
            bArr[i] = b;
            this.f56696h++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F1 */
        public final void mo65062F1(int i) {
            byte[] bArr = this.f56693e;
            int i2 = this.f56695g;
            int i3 = i2 + 1;
            this.f56695g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f56695g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f56695g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f56695g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f56696h += 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public final void mo65063G1(long j) {
            byte[] bArr = this.f56693e;
            int i = this.f56695g;
            int i2 = i + 1;
            this.f56695g = i2;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            this.f56695g = i3;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            this.f56695g = i4;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            this.f56695g = i5;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            this.f56695g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f56695g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f56695g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f56695g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f56696h += 8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H1 */
        public final void mo65064H1(int i) {
            if (i >= 0) {
                mo65066J1(i);
            } else {
                mo65067K1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I1 */
        public final void mo65065I1(int i, int i2) {
            mo65066J1(WireFormat.m81549c(i, i2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J1 */
        public final void mo65066J1(int i) {
            if (CodedOutputStream.f56690d) {
                long j = (long) this.f56695g;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f56693e;
                    int i2 = this.f56695g;
                    this.f56695g = i2 + 1;
                    UnsafeUtil.m81369O(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f56693e;
                int i3 = this.f56695g;
                this.f56695g = i3 + 1;
                UnsafeUtil.m81369O(bArr2, (long) i3, (byte) i);
                this.f56696h += (int) (((long) this.f56695g) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f56693e;
                int i4 = this.f56695g;
                this.f56695g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f56696h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f56693e;
            int i5 = this.f56695g;
            this.f56695g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f56696h++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K1 */
        public final void mo65067K1(long j) {
            if (CodedOutputStream.f56690d) {
                long j2 = (long) this.f56695g;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f56693e;
                    int i = this.f56695g;
                    this.f56695g = i + 1;
                    UnsafeUtil.m81369O(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f56693e;
                int i2 = this.f56695g;
                this.f56695g = i2 + 1;
                UnsafeUtil.m81369O(bArr2, (long) i2, (byte) ((int) j));
                this.f56696h += (int) (((long) this.f56695g) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f56693e;
                int i3 = this.f56695g;
                this.f56695g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f56696h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f56693e;
            int i4 = this.f56695g;
            this.f56695g = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f56696h++;
        }

        /* renamed from: a1 */
        public final int mo65025a1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class ArrayEncoder extends CodedOutputStream {

        /* renamed from: e */
        private final byte[] f56697e;

        /* renamed from: f */
        private final int f56698f;

        /* renamed from: g */
        private final int f56699g;

        /* renamed from: h */
        private int f56700h;

        ArrayEncoder(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) >= 0) {
                this.f56697e = bArr;
                this.f56698f = i;
                this.f56700h = i;
                this.f56699g = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: A1 */
        public final void mo65012A1(String str) throws IOException {
            int i = this.f56700h;
            try {
                int P0 = CodedOutputStream.m80095P0(str.length() * 3);
                int P02 = CodedOutputStream.m80095P0(str.length());
                if (P02 == P0) {
                    int i2 = i + P02;
                    this.f56700h = i2;
                    int i3 = Utf8.m81475i(str, this.f56697e, i2, mo65025a1());
                    this.f56700h = i;
                    mo65016C1((i3 - i) - P02);
                    this.f56700h = i3;
                    return;
                }
                mo65016C1(Utf8.m81477k(str));
                this.f56700h = Utf8.m81475i(str, this.f56697e, this.f56700h, mo65025a1());
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f56700h = i;
                mo65023V0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: B */
        public final void mo65013B(int i, boolean z) throws IOException {
            mo65014B1(i, 0);
            mo65026b1(z ? (byte) 1 : 0);
        }

        /* renamed from: B1 */
        public final void mo65014B1(int i, int i2) throws IOException {
            mo65016C1(WireFormat.m81549c(i, i2));
        }

        /* renamed from: C1 */
        public final void mo65016C1(int i) throws IOException {
            if (!CodedOutputStream.f56690d || Android.m79348c() || mo65025a1() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f56697e;
                    int i2 = this.f56700h;
                    this.f56700h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f56697e;
                    int i3 = this.f56700h;
                    this.f56700h = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f56700h), Integer.valueOf(this.f56699g), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f56697e;
                int i4 = this.f56700h;
                this.f56700h = i4 + 1;
                UnsafeUtil.m81369O(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f56697e;
                int i5 = this.f56700h;
                this.f56700h = i5 + 1;
                UnsafeUtil.m81369O(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f56697e;
                    int i7 = this.f56700h;
                    this.f56700h = i7 + 1;
                    UnsafeUtil.m81369O(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f56697e;
                int i8 = this.f56700h;
                this.f56700h = i8 + 1;
                UnsafeUtil.m81369O(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f56697e;
                    int i10 = this.f56700h;
                    this.f56700h = i10 + 1;
                    UnsafeUtil.m81369O(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f56697e;
                int i11 = this.f56700h;
                this.f56700h = i11 + 1;
                UnsafeUtil.m81369O(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f56697e;
                    int i13 = this.f56700h;
                    this.f56700h = i13 + 1;
                    UnsafeUtil.m81369O(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f56697e;
                int i14 = this.f56700h;
                this.f56700h = i14 + 1;
                UnsafeUtil.m81369O(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f56697e;
                int i15 = this.f56700h;
                this.f56700h = i15 + 1;
                UnsafeUtil.m81369O(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: D1 */
        public final void mo65017D1(long j) throws IOException {
            if (!CodedOutputStream.f56690d || mo65025a1() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f56697e;
                    int i = this.f56700h;
                    this.f56700h = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f56697e;
                    int i2 = this.f56700h;
                    this.f56700h = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f56700h), Integer.valueOf(this.f56699g), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f56697e;
                    int i3 = this.f56700h;
                    this.f56700h = i3 + 1;
                    UnsafeUtil.m81369O(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f56697e;
                int i4 = this.f56700h;
                this.f56700h = i4 + 1;
                UnsafeUtil.m81369O(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: E1 */
        public final int mo65068E1() {
            return this.f56700h - this.f56698f;
        }

        /* renamed from: F1 */
        public final void mo65069F1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f56697e, this.f56700h, remaining);
                this.f56700h += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f56700h), Integer.valueOf(this.f56699g), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: Q */
        public final void mo64862Q(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f56697e, this.f56700h, i2);
                this.f56700h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f56700h), Integer.valueOf(this.f56699g), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: R */
        public final void mo64863R(ByteBuffer byteBuffer) throws IOException {
            mo65069F1(byteBuffer);
        }

        /* renamed from: S */
        public final void mo64864S(byte[] bArr, int i, int i2) throws IOException {
            mo64862Q(bArr, i, i2);
        }

        /* renamed from: U0 */
        public void mo65022U0() {
        }

        /* renamed from: a1 */
        public final int mo65025a1() {
            return this.f56699g - this.f56700h;
        }

        /* renamed from: b1 */
        public final void mo65026b1(byte b) throws IOException {
            try {
                byte[] bArr = this.f56697e;
                int i = this.f56700h;
                this.f56700h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f56700h), Integer.valueOf(this.f56699g), 1}), e);
            }
        }

        /* renamed from: d */
        public final void mo65028d(int i, int i2) throws IOException {
            mo65014B1(i, 5);
            mo65036i1(i2);
        }

        /* renamed from: e1 */
        public final void mo65030e1(byte[] bArr, int i, int i2) throws IOException {
            mo65016C1(i2);
            mo64862Q(bArr, i, i2);
        }

        /* renamed from: f */
        public final void mo65031f(int i, String str) throws IOException {
            mo65014B1(i, 2);
            mo65012A1(str);
        }

        /* renamed from: f1 */
        public final void mo65032f1(ByteString byteString) throws IOException {
            mo65016C1(byteString.size());
            byteString.mo64923h0(this);
        }

        /* renamed from: g */
        public final void mo65033g(int i, long j) throws IOException {
            mo65014B1(i, 0);
            mo65017D1(j);
        }

        /* renamed from: i1 */
        public final void mo65036i1(int i) throws IOException {
            try {
                byte[] bArr = this.f56697e;
                int i2 = this.f56700h;
                int i3 = i2 + 1;
                this.f56700h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                this.f56700h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                this.f56700h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f56700h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f56700h), Integer.valueOf(this.f56699g), 1}), e);
            }
        }

        /* renamed from: j */
        public final void mo65037j(int i, ByteString byteString) throws IOException {
            mo65014B1(i, 2);
            mo65032f1(byteString);
        }

        /* renamed from: j1 */
        public final void mo65038j1(long j) throws IOException {
            try {
                byte[] bArr = this.f56697e;
                int i = this.f56700h;
                int i2 = i + 1;
                this.f56700h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                this.f56700h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                this.f56700h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                this.f56700h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                this.f56700h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                this.f56700h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                this.f56700h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f56700h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f56700h), Integer.valueOf(this.f56699g), 1}), e);
            }
        }

        /* renamed from: k */
        public final void mo65039k(int i, int i2) throws IOException {
            mo65014B1(i, 0);
            mo65047p1(i2);
        }

        /* renamed from: p1 */
        public final void mo65047p1(int i) throws IOException {
            if (i >= 0) {
                mo65016C1(i);
            } else {
                mo65017D1((long) i);
            }
        }

        /* renamed from: r1 */
        public final void mo65049r1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(i, 2);
            mo65053t1(messageLite);
        }

        /* renamed from: s */
        public final void mo65050s(int i, int i2) throws IOException {
            mo65014B1(i, 0);
            mo65016C1(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s1 */
        public final void mo65051s1(int i, MessageLite messageLite, Schema schema) throws IOException {
            mo65014B1(i, 2);
            mo65016C1(((AbstractMessageLite) messageLite).mo64720m(schema));
            schema.mo65347d(messageLite, this.f56691a);
        }

        /* renamed from: t1 */
        public final void mo65053t1(MessageLite messageLite) throws IOException {
            mo65016C1(messageLite.mo65174c());
            messageLite.mo65180k(this);
        }

        /* renamed from: u1 */
        public final void mo65054u1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65049r1(3, messageLite);
            mo65014B1(1, 4);
        }

        /* renamed from: v1 */
        public final void mo65055v1(int i, ByteString byteString) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65037j(3, byteString);
            mo65014B1(1, 4);
        }

        /* renamed from: x */
        public final void mo65057x(int i, long j) throws IOException {
            mo65014B1(i, 1);
            mo65038j1(j);
        }
    }

    private static final class ByteOutputEncoder extends AbstractBufferedEncoder {

        /* renamed from: i */
        private final ByteOutput f56701i;

        /* renamed from: L1 */
        private void m80224L1() throws IOException {
            this.f56701i.mo64862Q(this.f56693e, 0, this.f56695g);
            this.f56695g = 0;
        }

        /* renamed from: M1 */
        private void m80225M1(int i) throws IOException {
            if (this.f56694f - this.f56695g < i) {
                m80224L1();
            }
        }

        /* renamed from: A1 */
        public void mo65012A1(String str) throws IOException {
            int length = str.length() * 3;
            int P0 = CodedOutputStream.m80095P0(length);
            int i = P0 + length;
            int i2 = this.f56694f;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int i3 = Utf8.m81475i(str, bArr, 0, length);
                mo65016C1(i3);
                mo64864S(bArr, 0, i3);
                return;
            }
            if (i > i2 - this.f56695g) {
                m80224L1();
            }
            int i4 = this.f56695g;
            try {
                int P02 = CodedOutputStream.m80095P0(str.length());
                if (P02 == P0) {
                    int i5 = i4 + P02;
                    this.f56695g = i5;
                    int i6 = Utf8.m81475i(str, this.f56693e, i5, this.f56694f - i5);
                    this.f56695g = i4;
                    int i7 = (i6 - i4) - P02;
                    mo65066J1(i7);
                    this.f56695g = i6;
                    this.f56696h += i7;
                    return;
                }
                int k = Utf8.m81477k(str);
                mo65066J1(k);
                this.f56695g = Utf8.m81475i(str, this.f56693e, this.f56695g, k);
                this.f56696h += k;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f56696h -= this.f56695g - i4;
                this.f56695g = i4;
                mo65023V0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: B */
        public void mo65013B(int i, boolean z) throws IOException {
            m80225M1(11);
            mo65065I1(i, 0);
            mo65061E1(z ? (byte) 1 : 0);
        }

        /* renamed from: B1 */
        public void mo65014B1(int i, int i2) throws IOException {
            mo65016C1(WireFormat.m81549c(i, i2));
        }

        /* renamed from: C1 */
        public void mo65016C1(int i) throws IOException {
            m80225M1(5);
            mo65066J1(i);
        }

        /* renamed from: D1 */
        public void mo65017D1(long j) throws IOException {
            m80225M1(10);
            mo65067K1(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N1 */
        public void mo65070N1(MessageLite messageLite, Schema schema) throws IOException {
            mo65016C1(((AbstractMessageLite) messageLite).mo64720m(schema));
            schema.mo65347d(messageLite, this.f56691a);
        }

        /* renamed from: Q */
        public void mo64862Q(byte[] bArr, int i, int i2) throws IOException {
            mo65022U0();
            this.f56701i.mo64862Q(bArr, i, i2);
            this.f56696h += i2;
        }

        /* renamed from: R */
        public void mo64863R(ByteBuffer byteBuffer) throws IOException {
            mo65022U0();
            int remaining = byteBuffer.remaining();
            this.f56701i.mo64863R(byteBuffer);
            this.f56696h += remaining;
        }

        /* renamed from: S */
        public void mo64864S(byte[] bArr, int i, int i2) throws IOException {
            mo65022U0();
            this.f56701i.mo64864S(bArr, i, i2);
            this.f56696h += i2;
        }

        /* renamed from: U0 */
        public void mo65022U0() throws IOException {
            if (this.f56695g > 0) {
                m80224L1();
            }
        }

        /* renamed from: b1 */
        public void mo65026b1(byte b) throws IOException {
            if (this.f56695g == this.f56694f) {
                m80224L1();
            }
            mo65061E1(b);
        }

        /* renamed from: d */
        public void mo65028d(int i, int i2) throws IOException {
            m80225M1(14);
            mo65065I1(i, 5);
            mo65062F1(i2);
        }

        /* renamed from: e1 */
        public void mo65030e1(byte[] bArr, int i, int i2) throws IOException {
            mo65016C1(i2);
            mo64862Q(bArr, i, i2);
        }

        /* renamed from: f */
        public void mo65031f(int i, String str) throws IOException {
            mo65014B1(i, 2);
            mo65012A1(str);
        }

        /* renamed from: f1 */
        public void mo65032f1(ByteString byteString) throws IOException {
            mo65016C1(byteString.size());
            byteString.mo64923h0(this);
        }

        /* renamed from: g */
        public void mo65033g(int i, long j) throws IOException {
            m80225M1(20);
            mo65065I1(i, 0);
            mo65067K1(j);
        }

        /* renamed from: i1 */
        public void mo65036i1(int i) throws IOException {
            m80225M1(4);
            mo65062F1(i);
        }

        /* renamed from: j */
        public void mo65037j(int i, ByteString byteString) throws IOException {
            mo65014B1(i, 2);
            mo65032f1(byteString);
        }

        /* renamed from: j1 */
        public void mo65038j1(long j) throws IOException {
            m80225M1(8);
            mo65063G1(j);
        }

        /* renamed from: k */
        public void mo65039k(int i, int i2) throws IOException {
            m80225M1(20);
            mo65065I1(i, 0);
            mo65064H1(i2);
        }

        /* renamed from: p1 */
        public void mo65047p1(int i) throws IOException {
            if (i >= 0) {
                mo65016C1(i);
            } else {
                mo65017D1((long) i);
            }
        }

        /* renamed from: r1 */
        public void mo65049r1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(i, 2);
            mo65053t1(messageLite);
        }

        /* renamed from: s */
        public void mo65050s(int i, int i2) throws IOException {
            m80225M1(20);
            mo65065I1(i, 0);
            mo65066J1(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s1 */
        public void mo65051s1(int i, MessageLite messageLite, Schema schema) throws IOException {
            mo65014B1(i, 2);
            mo65070N1(messageLite, schema);
        }

        /* renamed from: t1 */
        public void mo65053t1(MessageLite messageLite) throws IOException {
            mo65016C1(messageLite.mo65174c());
            messageLite.mo65180k(this);
        }

        /* renamed from: u1 */
        public void mo65054u1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65049r1(3, messageLite);
            mo65014B1(1, 4);
        }

        /* renamed from: v1 */
        public void mo65055v1(int i, ByteString byteString) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65037j(3, byteString);
            mo65014B1(1, 4);
        }

        /* renamed from: x */
        public void mo65057x(int i, long j) throws IOException {
            m80225M1(18);
            mo65065I1(i, 1);
            mo65063G1(j);
        }
    }

    private static final class HeapNioEncoder extends ArrayEncoder {

        /* renamed from: i */
        private final ByteBuffer f56702i;

        /* renamed from: j */
        private int f56703j;

        /* renamed from: U0 */
        public void mo65022U0() {
            this.f56702i.position(this.f56703j + mo65068E1());
        }
    }

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static final class OutputStreamEncoder extends AbstractBufferedEncoder {

        /* renamed from: i */
        private final OutputStream f56704i;

        OutputStreamEncoder(OutputStream outputStream, int i) {
            super(i);
            Objects.requireNonNull(outputStream, "out");
            this.f56704i = outputStream;
        }

        /* renamed from: L1 */
        private void m80255L1() throws IOException {
            this.f56704i.write(this.f56693e, 0, this.f56695g);
            this.f56695g = 0;
        }

        /* renamed from: M1 */
        private void m80256M1(int i) throws IOException {
            if (this.f56694f - this.f56695g < i) {
                m80255L1();
            }
        }

        /* renamed from: A1 */
        public void mo65012A1(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int P0 = CodedOutputStream.m80095P0(length);
                int i3 = P0 + length;
                int i4 = this.f56694f;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int i5 = Utf8.m81475i(str, bArr, 0, length);
                    mo65016C1(i5);
                    mo64864S(bArr, 0, i5);
                    return;
                }
                if (i3 > i4 - this.f56695g) {
                    m80255L1();
                }
                int P02 = CodedOutputStream.m80095P0(str.length());
                i = this.f56695g;
                if (P02 == P0) {
                    int i6 = i + P02;
                    this.f56695g = i6;
                    int i7 = Utf8.m81475i(str, this.f56693e, i6, this.f56694f - i6);
                    this.f56695g = i;
                    i2 = (i7 - i) - P02;
                    mo65066J1(i2);
                    this.f56695g = i7;
                } else {
                    i2 = Utf8.m81477k(str);
                    mo65066J1(i2);
                    this.f56695g = Utf8.m81475i(str, this.f56693e, this.f56695g, i2);
                }
                this.f56696h += i2;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f56696h -= this.f56695g - i;
                this.f56695g = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (Utf8.UnpairedSurrogateException e3) {
                mo65023V0(str, e3);
            }
        }

        /* renamed from: B */
        public void mo65013B(int i, boolean z) throws IOException {
            m80256M1(11);
            mo65065I1(i, 0);
            mo65061E1(z ? (byte) 1 : 0);
        }

        /* renamed from: B1 */
        public void mo65014B1(int i, int i2) throws IOException {
            mo65016C1(WireFormat.m81549c(i, i2));
        }

        /* renamed from: C1 */
        public void mo65016C1(int i) throws IOException {
            m80256M1(5);
            mo65066J1(i);
        }

        /* renamed from: D1 */
        public void mo65017D1(long j) throws IOException {
            m80256M1(10);
            mo65067K1(j);
        }

        /* renamed from: N1 */
        public void mo65071N1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.f56694f;
            int i2 = this.f56695g;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f56693e, i2, remaining);
                this.f56695g += remaining;
                this.f56696h += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f56693e, i2, i3);
            int i4 = remaining - i3;
            this.f56695g = this.f56694f;
            this.f56696h += i3;
            m80255L1();
            while (true) {
                int i5 = this.f56694f;
                if (i4 > i5) {
                    byteBuffer.get(this.f56693e, 0, i5);
                    this.f56704i.write(this.f56693e, 0, this.f56694f);
                    int i6 = this.f56694f;
                    i4 -= i6;
                    this.f56696h += i6;
                } else {
                    byteBuffer.get(this.f56693e, 0, i4);
                    this.f56695g = i4;
                    this.f56696h += i4;
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O1 */
        public void mo65072O1(MessageLite messageLite, Schema schema) throws IOException {
            mo65016C1(((AbstractMessageLite) messageLite).mo64720m(schema));
            schema.mo65347d(messageLite, this.f56691a);
        }

        /* renamed from: Q */
        public void mo64862Q(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f56694f;
            int i4 = this.f56695g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f56693e, i4, i2);
                this.f56695g += i2;
                this.f56696h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f56693e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f56695g = this.f56694f;
            this.f56696h += i5;
            m80255L1();
            if (i7 <= this.f56694f) {
                System.arraycopy(bArr, i6, this.f56693e, 0, i7);
                this.f56695g = i7;
            } else {
                this.f56704i.write(bArr, i6, i7);
            }
            this.f56696h += i7;
        }

        /* renamed from: R */
        public void mo64863R(ByteBuffer byteBuffer) throws IOException {
            mo65071N1(byteBuffer);
        }

        /* renamed from: S */
        public void mo64864S(byte[] bArr, int i, int i2) throws IOException {
            mo64862Q(bArr, i, i2);
        }

        /* renamed from: U0 */
        public void mo65022U0() throws IOException {
            if (this.f56695g > 0) {
                m80255L1();
            }
        }

        /* renamed from: b1 */
        public void mo65026b1(byte b) throws IOException {
            if (this.f56695g == this.f56694f) {
                m80255L1();
            }
            mo65061E1(b);
        }

        /* renamed from: d */
        public void mo65028d(int i, int i2) throws IOException {
            m80256M1(14);
            mo65065I1(i, 5);
            mo65062F1(i2);
        }

        /* renamed from: e1 */
        public void mo65030e1(byte[] bArr, int i, int i2) throws IOException {
            mo65016C1(i2);
            mo64862Q(bArr, i, i2);
        }

        /* renamed from: f */
        public void mo65031f(int i, String str) throws IOException {
            mo65014B1(i, 2);
            mo65012A1(str);
        }

        /* renamed from: f1 */
        public void mo65032f1(ByteString byteString) throws IOException {
            mo65016C1(byteString.size());
            byteString.mo64923h0(this);
        }

        /* renamed from: g */
        public void mo65033g(int i, long j) throws IOException {
            m80256M1(20);
            mo65065I1(i, 0);
            mo65067K1(j);
        }

        /* renamed from: i1 */
        public void mo65036i1(int i) throws IOException {
            m80256M1(4);
            mo65062F1(i);
        }

        /* renamed from: j */
        public void mo65037j(int i, ByteString byteString) throws IOException {
            mo65014B1(i, 2);
            mo65032f1(byteString);
        }

        /* renamed from: j1 */
        public void mo65038j1(long j) throws IOException {
            m80256M1(8);
            mo65063G1(j);
        }

        /* renamed from: k */
        public void mo65039k(int i, int i2) throws IOException {
            m80256M1(20);
            mo65065I1(i, 0);
            mo65064H1(i2);
        }

        /* renamed from: p1 */
        public void mo65047p1(int i) throws IOException {
            if (i >= 0) {
                mo65016C1(i);
            } else {
                mo65017D1((long) i);
            }
        }

        /* renamed from: r1 */
        public void mo65049r1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(i, 2);
            mo65053t1(messageLite);
        }

        /* renamed from: s */
        public void mo65050s(int i, int i2) throws IOException {
            m80256M1(20);
            mo65065I1(i, 0);
            mo65066J1(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s1 */
        public void mo65051s1(int i, MessageLite messageLite, Schema schema) throws IOException {
            mo65014B1(i, 2);
            mo65072O1(messageLite, schema);
        }

        /* renamed from: t1 */
        public void mo65053t1(MessageLite messageLite) throws IOException {
            mo65016C1(messageLite.mo65174c());
            messageLite.mo65180k(this);
        }

        /* renamed from: u1 */
        public void mo65054u1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65049r1(3, messageLite);
            mo65014B1(1, 4);
        }

        /* renamed from: v1 */
        public void mo65055v1(int i, ByteString byteString) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65037j(3, byteString);
            mo65014B1(1, 4);
        }

        /* renamed from: x */
        public void mo65057x(int i, long j) throws IOException {
            m80256M1(18);
            mo65065I1(i, 1);
            mo65063G1(j);
        }
    }

    private static final class SafeDirectNioEncoder extends CodedOutputStream {

        /* renamed from: e */
        private final ByteBuffer f56705e;

        /* renamed from: f */
        private final ByteBuffer f56706f;

        /* renamed from: E1 */
        private void m80286E1(String str) throws IOException {
            try {
                Utf8.m81476j(str, this.f56706f);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: A1 */
        public void mo65012A1(String str) throws IOException {
            int position = this.f56706f.position();
            try {
                int P0 = CodedOutputStream.m80095P0(str.length() * 3);
                int P02 = CodedOutputStream.m80095P0(str.length());
                if (P02 == P0) {
                    int position2 = this.f56706f.position() + P02;
                    this.f56706f.position(position2);
                    m80286E1(str);
                    int position3 = this.f56706f.position();
                    this.f56706f.position(position);
                    mo65016C1(position3 - position2);
                    this.f56706f.position(position3);
                    return;
                }
                mo65016C1(Utf8.m81477k(str));
                m80286E1(str);
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f56706f.position(position);
                mo65023V0(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: B */
        public void mo65013B(int i, boolean z) throws IOException {
            mo65014B1(i, 0);
            mo65026b1(z ? (byte) 1 : 0);
        }

        /* renamed from: B1 */
        public void mo65014B1(int i, int i2) throws IOException {
            mo65016C1(WireFormat.m81549c(i, i2));
        }

        /* renamed from: C1 */
        public void mo65016C1(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f56706f.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f56706f.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: D1 */
        public void mo65017D1(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f56706f.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f56706f.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: F1 */
        public void mo65073F1(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f56706f.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public void mo65074G1(MessageLite messageLite, Schema schema) throws IOException {
            mo65016C1(((AbstractMessageLite) messageLite).mo64720m(schema));
            schema.mo65347d(messageLite, this.f56691a);
        }

        /* renamed from: Q */
        public void mo64862Q(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f56706f.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: R */
        public void mo64863R(ByteBuffer byteBuffer) throws IOException {
            mo65073F1(byteBuffer);
        }

        /* renamed from: S */
        public void mo64864S(byte[] bArr, int i, int i2) throws IOException {
            mo64862Q(bArr, i, i2);
        }

        /* renamed from: U0 */
        public void mo65022U0() {
            this.f56705e.position(this.f56706f.position());
        }

        /* renamed from: a1 */
        public int mo65025a1() {
            return this.f56706f.remaining();
        }

        /* renamed from: b1 */
        public void mo65026b1(byte b) throws IOException {
            try {
                this.f56706f.put(b);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: d */
        public void mo65028d(int i, int i2) throws IOException {
            mo65014B1(i, 5);
            mo65036i1(i2);
        }

        /* renamed from: e1 */
        public void mo65030e1(byte[] bArr, int i, int i2) throws IOException {
            mo65016C1(i2);
            mo64862Q(bArr, i, i2);
        }

        /* renamed from: f */
        public void mo65031f(int i, String str) throws IOException {
            mo65014B1(i, 2);
            mo65012A1(str);
        }

        /* renamed from: f1 */
        public void mo65032f1(ByteString byteString) throws IOException {
            mo65016C1(byteString.size());
            byteString.mo64923h0(this);
        }

        /* renamed from: g */
        public void mo65033g(int i, long j) throws IOException {
            mo65014B1(i, 0);
            mo65017D1(j);
        }

        /* renamed from: i1 */
        public void mo65036i1(int i) throws IOException {
            try {
                this.f56706f.putInt(i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: j */
        public void mo65037j(int i, ByteString byteString) throws IOException {
            mo65014B1(i, 2);
            mo65032f1(byteString);
        }

        /* renamed from: j1 */
        public void mo65038j1(long j) throws IOException {
            try {
                this.f56706f.putLong(j);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* renamed from: k */
        public void mo65039k(int i, int i2) throws IOException {
            mo65014B1(i, 0);
            mo65047p1(i2);
        }

        /* renamed from: p1 */
        public void mo65047p1(int i) throws IOException {
            if (i >= 0) {
                mo65016C1(i);
            } else {
                mo65017D1((long) i);
            }
        }

        /* renamed from: r1 */
        public void mo65049r1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(i, 2);
            mo65053t1(messageLite);
        }

        /* renamed from: s */
        public void mo65050s(int i, int i2) throws IOException {
            mo65014B1(i, 0);
            mo65016C1(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s1 */
        public void mo65051s1(int i, MessageLite messageLite, Schema schema) throws IOException {
            mo65014B1(i, 2);
            mo65074G1(messageLite, schema);
        }

        /* renamed from: t1 */
        public void mo65053t1(MessageLite messageLite) throws IOException {
            mo65016C1(messageLite.mo65174c());
            messageLite.mo65180k(this);
        }

        /* renamed from: u1 */
        public void mo65054u1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65049r1(3, messageLite);
            mo65014B1(1, 4);
        }

        /* renamed from: v1 */
        public void mo65055v1(int i, ByteString byteString) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65037j(3, byteString);
            mo65014B1(1, 4);
        }

        /* renamed from: x */
        public void mo65057x(int i, long j) throws IOException {
            mo65014B1(i, 1);
            mo65038j1(j);
        }
    }

    private static final class UnsafeDirectNioEncoder extends CodedOutputStream {

        /* renamed from: e */
        private final ByteBuffer f56707e;

        /* renamed from: f */
        private final ByteBuffer f56708f;

        /* renamed from: g */
        private final long f56709g;

        /* renamed from: h */
        private final long f56710h;

        /* renamed from: i */
        private final long f56711i;

        /* renamed from: j */
        private long f56712j;

        /* renamed from: E1 */
        private int m80317E1(long j) {
            return (int) (j - this.f56709g);
        }

        /* renamed from: F1 */
        private void m80318F1(long j) {
            this.f56708f.position(m80317E1(j));
        }

        /* renamed from: A1 */
        public void mo65012A1(String str) throws IOException {
            long j = this.f56712j;
            try {
                int P0 = CodedOutputStream.m80095P0(str.length() * 3);
                int P02 = CodedOutputStream.m80095P0(str.length());
                if (P02 == P0) {
                    int E1 = m80317E1(this.f56712j) + P02;
                    this.f56708f.position(E1);
                    Utf8.m81476j(str, this.f56708f);
                    int position = this.f56708f.position() - E1;
                    mo65016C1(position);
                    this.f56712j += (long) position;
                    return;
                }
                int k = Utf8.m81477k(str);
                mo65016C1(k);
                m80318F1(this.f56712j);
                Utf8.m81476j(str, this.f56708f);
                this.f56712j += (long) k;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f56712j = j;
                m80318F1(j);
                mo65023V0(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }

        /* renamed from: B */
        public void mo65013B(int i, boolean z) throws IOException {
            mo65014B1(i, 0);
            mo65026b1(z ? (byte) 1 : 0);
        }

        /* renamed from: B1 */
        public void mo65014B1(int i, int i2) throws IOException {
            mo65016C1(WireFormat.m81549c(i, i2));
        }

        /* renamed from: C1 */
        public void mo65016C1(int i) throws IOException {
            if (this.f56712j <= this.f56711i) {
                while ((i & -128) != 0) {
                    long j = this.f56712j;
                    this.f56712j = j + 1;
                    UnsafeUtil.m81368N(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f56712j;
                this.f56712j = 1 + j2;
                UnsafeUtil.m81368N(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f56712j;
                if (j3 >= this.f56710h) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f56712j), Long.valueOf(this.f56710h), 1}));
                } else if ((i & -128) == 0) {
                    this.f56712j = 1 + j3;
                    UnsafeUtil.m81368N(j3, (byte) i);
                    return;
                } else {
                    this.f56712j = j3 + 1;
                    UnsafeUtil.m81368N(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        /* renamed from: D1 */
        public void mo65017D1(long j) throws IOException {
            if (this.f56712j <= this.f56711i) {
                while ((j & -128) != 0) {
                    long j2 = this.f56712j;
                    this.f56712j = j2 + 1;
                    UnsafeUtil.m81368N(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f56712j;
                this.f56712j = 1 + j3;
                UnsafeUtil.m81368N(j3, (byte) ((int) j));
                return;
            }
            while (true) {
                long j4 = this.f56712j;
                if (j4 >= this.f56710h) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f56712j), Long.valueOf(this.f56710h), 1}));
                } else if ((j & -128) == 0) {
                    this.f56712j = 1 + j4;
                    UnsafeUtil.m81368N(j4, (byte) ((int) j));
                    return;
                } else {
                    this.f56712j = j4 + 1;
                    UnsafeUtil.m81368N(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        /* renamed from: G1 */
        public void mo65075G1(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                m80318F1(this.f56712j);
                this.f56708f.put(byteBuffer);
                this.f56712j += (long) remaining;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H1 */
        public void mo65076H1(MessageLite messageLite, Schema schema) throws IOException {
            mo65016C1(((AbstractMessageLite) messageLite).mo64720m(schema));
            schema.mo65347d(messageLite, this.f56691a);
        }

        /* renamed from: Q */
        public void mo64862Q(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.f56712j;
                if (this.f56710h - j >= j2) {
                    UnsafeUtil.m81393o(bArr, (long) i, j2, j);
                    this.f56712j += j;
                    return;
                }
            }
            Objects.requireNonNull(bArr, "value");
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f56712j), Long.valueOf(this.f56710h), Integer.valueOf(i2)}));
        }

        /* renamed from: R */
        public void mo64863R(ByteBuffer byteBuffer) throws IOException {
            mo65075G1(byteBuffer);
        }

        /* renamed from: S */
        public void mo64864S(byte[] bArr, int i, int i2) throws IOException {
            mo64862Q(bArr, i, i2);
        }

        /* renamed from: U0 */
        public void mo65022U0() {
            this.f56707e.position(m80317E1(this.f56712j));
        }

        /* renamed from: a1 */
        public int mo65025a1() {
            return (int) (this.f56710h - this.f56712j);
        }

        /* renamed from: b1 */
        public void mo65026b1(byte b) throws IOException {
            long j = this.f56712j;
            if (j < this.f56710h) {
                this.f56712j = 1 + j;
                UnsafeUtil.m81368N(j, b);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f56712j), Long.valueOf(this.f56710h), 1}));
        }

        /* renamed from: d */
        public void mo65028d(int i, int i2) throws IOException {
            mo65014B1(i, 5);
            mo65036i1(i2);
        }

        /* renamed from: e1 */
        public void mo65030e1(byte[] bArr, int i, int i2) throws IOException {
            mo65016C1(i2);
            mo64862Q(bArr, i, i2);
        }

        /* renamed from: f */
        public void mo65031f(int i, String str) throws IOException {
            mo65014B1(i, 2);
            mo65012A1(str);
        }

        /* renamed from: f1 */
        public void mo65032f1(ByteString byteString) throws IOException {
            mo65016C1(byteString.size());
            byteString.mo64923h0(this);
        }

        /* renamed from: g */
        public void mo65033g(int i, long j) throws IOException {
            mo65014B1(i, 0);
            mo65017D1(j);
        }

        /* renamed from: i1 */
        public void mo65036i1(int i) throws IOException {
            this.f56708f.putInt(m80317E1(this.f56712j), i);
            this.f56712j += 4;
        }

        /* renamed from: j */
        public void mo65037j(int i, ByteString byteString) throws IOException {
            mo65014B1(i, 2);
            mo65032f1(byteString);
        }

        /* renamed from: j1 */
        public void mo65038j1(long j) throws IOException {
            this.f56708f.putLong(m80317E1(this.f56712j), j);
            this.f56712j += 8;
        }

        /* renamed from: k */
        public void mo65039k(int i, int i2) throws IOException {
            mo65014B1(i, 0);
            mo65047p1(i2);
        }

        /* renamed from: p1 */
        public void mo65047p1(int i) throws IOException {
            if (i >= 0) {
                mo65016C1(i);
            } else {
                mo65017D1((long) i);
            }
        }

        /* renamed from: r1 */
        public void mo65049r1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(i, 2);
            mo65053t1(messageLite);
        }

        /* renamed from: s */
        public void mo65050s(int i, int i2) throws IOException {
            mo65014B1(i, 0);
            mo65016C1(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s1 */
        public void mo65051s1(int i, MessageLite messageLite, Schema schema) throws IOException {
            mo65014B1(i, 2);
            mo65076H1(messageLite, schema);
        }

        /* renamed from: t1 */
        public void mo65053t1(MessageLite messageLite) throws IOException {
            mo65016C1(messageLite.mo65174c());
            messageLite.mo65180k(this);
        }

        /* renamed from: u1 */
        public void mo65054u1(int i, MessageLite messageLite) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65049r1(3, messageLite);
            mo65014B1(1, 4);
        }

        /* renamed from: v1 */
        public void mo65055v1(int i, ByteString byteString) throws IOException {
            mo65014B1(1, 3);
            mo65050s(2, i);
            mo65037j(3, byteString);
            mo65014B1(1, 4);
        }

        /* renamed from: x */
        public void mo65057x(int i, long j) throws IOException {
            mo65014B1(i, 1);
            mo65038j1(j);
        }
    }

    /* renamed from: A0 */
    static int m80080A0(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: B0 */
    public static int m80081B0(int i, ByteString byteString) {
        return (m80093N0(1) * 2) + m80094O0(2, i) + m80105Y(3, byteString);
    }

    @Deprecated
    /* renamed from: C0 */
    public static int m80082C0(int i) {
        return m80095P0(i);
    }

    /* renamed from: D0 */
    public static int m80083D0(int i, int i2) {
        return m80093N0(i) + m80084E0(i2);
    }

    /* renamed from: E0 */
    public static int m80084E0(int i) {
        return 4;
    }

    /* renamed from: F0 */
    public static int m80085F0(int i, long j) {
        return m80093N0(i) + m80086G0(j);
    }

    /* renamed from: G0 */
    public static int m80086G0(long j) {
        return 8;
    }

    /* renamed from: H0 */
    public static int m80087H0(int i, int i2) {
        return m80093N0(i) + m80088I0(i2);
    }

    /* renamed from: I0 */
    public static int m80088I0(int i) {
        return m80095P0(m80098S0(i));
    }

    /* renamed from: J0 */
    public static int m80089J0(int i, long j) {
        return m80093N0(i) + m80090K0(j);
    }

    /* renamed from: K0 */
    public static int m80090K0(long j) {
        return m80097R0(m80100T0(j));
    }

    /* renamed from: L0 */
    public static int m80091L0(int i, String str) {
        return m80093N0(i) + m80092M0(str);
    }

    /* renamed from: M0 */
    public static int m80092M0(String str) {
        int i;
        try {
            i = Utf8.m81477k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(Internal.f56935a).length;
        }
        return m80129u0(i);
    }

    /* renamed from: N0 */
    public static int m80093N0(int i) {
        return m80095P0(WireFormat.m81549c(i, 0));
    }

    /* renamed from: O0 */
    public static int m80094O0(int i, int i2) {
        return m80093N0(i) + m80095P0(i2);
    }

    /* renamed from: P0 */
    public static int m80095P0(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: Q0 */
    public static int m80096Q0(int i, long j) {
        return m80093N0(i) + m80097R0(j);
    }

    /* renamed from: R0 */
    public static int m80097R0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: S0 */
    public static int m80098S0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: T0 */
    public static long m80100T0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: V */
    public static int m80101V(int i, boolean z) {
        return m80093N0(i) + m80102W(z);
    }

    /* renamed from: W */
    public static int m80102W(boolean z) {
        return 1;
    }

    /* renamed from: X */
    public static int m80103X(byte[] bArr) {
        return m80129u0(bArr.length);
    }

    /* renamed from: X0 */
    public static CodedOutputStream m80104X0(OutputStream outputStream, int i) {
        return new OutputStreamEncoder(outputStream, i);
    }

    /* renamed from: Y */
    public static int m80105Y(int i, ByteString byteString) {
        return m80093N0(i) + m80107Z(byteString);
    }

    /* renamed from: Y0 */
    public static CodedOutputStream m80106Y0(byte[] bArr) {
        return m80108Z0(bArr, 0, bArr.length);
    }

    /* renamed from: Z */
    public static int m80107Z(ByteString byteString) {
        return m80129u0(byteString.size());
    }

    /* renamed from: Z0 */
    public static CodedOutputStream m80108Z0(byte[] bArr, int i, int i2) {
        return new ArrayEncoder(bArr, i, i2);
    }

    /* renamed from: a0 */
    public static int m80109a0(int i, double d) {
        return m80093N0(i) + m80110b0(d);
    }

    /* renamed from: b0 */
    public static int m80110b0(double d) {
        return 8;
    }

    /* renamed from: c0 */
    public static int m80111c0(int i, int i2) {
        return m80093N0(i) + m80112d0(i2);
    }

    /* renamed from: d0 */
    public static int m80112d0(int i) {
        return m80123o0(i);
    }

    /* renamed from: e0 */
    public static int m80113e0(int i, int i2) {
        return m80093N0(i) + m80114f0(i2);
    }

    /* renamed from: f0 */
    public static int m80114f0(int i) {
        return 4;
    }

    /* renamed from: g0 */
    public static int m80115g0(int i, long j) {
        return m80093N0(i) + m80116h0(j);
    }

    /* renamed from: h0 */
    public static int m80116h0(long j) {
        return 8;
    }

    /* renamed from: i0 */
    public static int m80117i0(int i, float f) {
        return m80093N0(i) + m80118j0(f);
    }

    /* renamed from: j0 */
    public static int m80118j0(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: k0 */
    static int m80119k0(int i, MessageLite messageLite, Schema schema) {
        return (m80093N0(i) * 2) + m80121m0(messageLite, schema);
    }

    @Deprecated
    /* renamed from: l0 */
    public static int m80120l0(MessageLite messageLite) {
        return messageLite.mo65174c();
    }

    @Deprecated
    /* renamed from: m0 */
    static int m80121m0(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).mo64720m(schema);
    }

    /* renamed from: n0 */
    public static int m80122n0(int i, int i2) {
        return m80093N0(i) + m80123o0(i2);
    }

    /* renamed from: o0 */
    public static int m80123o0(int i) {
        if (i >= 0) {
            return m80095P0(i);
        }
        return 10;
    }

    /* renamed from: p0 */
    public static int m80124p0(int i, long j) {
        return m80093N0(i) + m80125q0(j);
    }

    /* renamed from: q0 */
    public static int m80125q0(long j) {
        return m80097R0(j);
    }

    /* renamed from: r0 */
    public static int m80126r0(int i, LazyFieldLite lazyFieldLite) {
        return (m80093N0(1) * 2) + m80094O0(2, i) + m80127s0(3, lazyFieldLite);
    }

    /* renamed from: s0 */
    public static int m80127s0(int i, LazyFieldLite lazyFieldLite) {
        return m80093N0(i) + m80128t0(lazyFieldLite);
    }

    /* renamed from: t0 */
    public static int m80128t0(LazyFieldLite lazyFieldLite) {
        return m80129u0(lazyFieldLite.mo65266b());
    }

    /* renamed from: u0 */
    static int m80129u0(int i) {
        return m80095P0(i) + i;
    }

    /* renamed from: v0 */
    public static int m80130v0(int i, MessageLite messageLite) {
        return (m80093N0(1) * 2) + m80094O0(2, i) + m80131w0(3, messageLite);
    }

    /* renamed from: w0 */
    public static int m80131w0(int i, MessageLite messageLite) {
        return m80093N0(i) + m80133y0(messageLite);
    }

    /* renamed from: x0 */
    static int m80132x0(int i, MessageLite messageLite, Schema schema) {
        return m80093N0(i) + m80134z0(messageLite, schema);
    }

    /* renamed from: y0 */
    public static int m80133y0(MessageLite messageLite) {
        return m80129u0(messageLite.mo65174c());
    }

    /* renamed from: z0 */
    static int m80134z0(MessageLite messageLite, Schema schema) {
        return m80129u0(((AbstractMessageLite) messageLite).mo64720m(schema));
    }

    /* renamed from: A */
    public final void mo65011A(int i, long j) throws IOException {
        mo65033g(i, j);
    }

    /* renamed from: A1 */
    public abstract void mo65012A1(String str) throws IOException;

    /* renamed from: B */
    public abstract void mo65013B(int i, boolean z) throws IOException;

    /* renamed from: B1 */
    public abstract void mo65014B1(int i, int i2) throws IOException;

    /* renamed from: C */
    public final void mo65015C(int i, int i2) throws IOException {
        mo65028d(i, i2);
    }

    /* renamed from: C1 */
    public abstract void mo65016C1(int i) throws IOException;

    /* renamed from: D1 */
    public abstract void mo65017D1(long j) throws IOException;

    /* renamed from: I */
    public final void mo65018I(int i, float f) throws IOException {
        mo65028d(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: L */
    public final void mo65019L(int i, int i2) throws IOException {
        mo65039k(i, i2);
    }

    /* renamed from: O */
    public final void mo65020O(int i, int i2) throws IOException {
        mo65050s(i, m80098S0(i2));
    }

    /* renamed from: S */
    public abstract void mo64864S(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: U */
    public final void mo65021U() {
        if (mo65025a1() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: U0 */
    public abstract void mo65022U0() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public final void mo65023V0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f56689c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f56935a);
        try {
            mo65016C1(bytes.length);
            mo64864S(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException((Throwable) e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public boolean mo65024W0() {
        return this.f56692b;
    }

    /* renamed from: a1 */
    public abstract int mo65025a1();

    /* renamed from: b1 */
    public abstract void mo65026b1(byte b) throws IOException;

    /* renamed from: c1 */
    public final void mo65027c1(boolean z) throws IOException {
        mo65026b1(z ? (byte) 1 : 0);
    }

    /* renamed from: d */
    public abstract void mo65028d(int i, int i2) throws IOException;

    /* renamed from: d1 */
    public final void mo65029d1(byte[] bArr) throws IOException {
        mo65030e1(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public abstract void mo65030e1(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: f */
    public abstract void mo65031f(int i, String str) throws IOException;

    /* renamed from: f1 */
    public abstract void mo65032f1(ByteString byteString) throws IOException;

    /* renamed from: g */
    public abstract void mo65033g(int i, long j) throws IOException;

    /* renamed from: g1 */
    public final void mo65034g1(double d) throws IOException {
        mo65038j1(Double.doubleToRawLongBits(d));
    }

    /* renamed from: h1 */
    public final void mo65035h1(int i) throws IOException {
        mo65047p1(i);
    }

    /* renamed from: i1 */
    public abstract void mo65036i1(int i) throws IOException;

    /* renamed from: j */
    public abstract void mo65037j(int i, ByteString byteString) throws IOException;

    /* renamed from: j1 */
    public abstract void mo65038j1(long j) throws IOException;

    /* renamed from: k */
    public abstract void mo65039k(int i, int i2) throws IOException;

    /* renamed from: k1 */
    public final void mo65040k1(float f) throws IOException {
        mo65036i1(Float.floatToRawIntBits(f));
    }

    /* renamed from: l */
    public final void mo65041l(int i, long j) throws IOException {
        mo65057x(i, j);
    }

    @Deprecated
    /* renamed from: l1 */
    public final void mo65042l1(int i, MessageLite messageLite) throws IOException {
        mo65014B1(i, 3);
        mo65044n1(messageLite);
        mo65014B1(i, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: m1 */
    public final void mo65043m1(int i, MessageLite messageLite, Schema schema) throws IOException {
        mo65014B1(i, 3);
        mo65045o1(messageLite, schema);
        mo65014B1(i, 4);
    }

    @Deprecated
    /* renamed from: n1 */
    public final void mo65044n1(MessageLite messageLite) throws IOException {
        messageLite.mo65180k(this);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: o1 */
    public final void mo65045o1(MessageLite messageLite, Schema schema) throws IOException {
        schema.mo65347d(messageLite, this.f56691a);
    }

    /* renamed from: p */
    public final void mo65046p(int i, long j) throws IOException {
        mo65033g(i, m80100T0(j));
    }

    /* renamed from: p1 */
    public abstract void mo65047p1(int i) throws IOException;

    /* renamed from: q1 */
    public final void mo65048q1(long j) throws IOException {
        mo65017D1(j);
    }

    /* renamed from: r1 */
    public abstract void mo65049r1(int i, MessageLite messageLite) throws IOException;

    /* renamed from: s */
    public abstract void mo65050s(int i, int i2) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public abstract void mo65051s1(int i, MessageLite messageLite, Schema schema) throws IOException;

    /* renamed from: t */
    public final void mo65052t(int i, double d) throws IOException {
        mo65057x(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: t1 */
    public abstract void mo65053t1(MessageLite messageLite) throws IOException;

    /* renamed from: u1 */
    public abstract void mo65054u1(int i, MessageLite messageLite) throws IOException;

    /* renamed from: v1 */
    public abstract void mo65055v1(int i, ByteString byteString) throws IOException;

    /* renamed from: w1 */
    public final void mo65056w1(int i) throws IOException {
        mo65036i1(i);
    }

    /* renamed from: x */
    public abstract void mo65057x(int i, long j) throws IOException;

    /* renamed from: x1 */
    public final void mo65058x1(long j) throws IOException {
        mo65038j1(j);
    }

    /* renamed from: y1 */
    public final void mo65059y1(int i) throws IOException {
        mo65016C1(m80098S0(i));
    }

    /* renamed from: z1 */
    public final void mo65060z1(long j) throws IOException {
        mo65017D1(m80100T0(j));
    }

    private CodedOutputStream() {
    }
}
