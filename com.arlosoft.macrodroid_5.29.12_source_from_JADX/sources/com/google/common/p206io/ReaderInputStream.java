package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.ReaderInputStream */
final class ReaderInputStream extends InputStream {

    /* renamed from: a */
    private final Reader f53013a;

    /* renamed from: c */
    private final CharsetEncoder f53014c;

    /* renamed from: d */
    private final byte[] f53015d;

    /* renamed from: f */
    private CharBuffer f53016f;

    /* renamed from: g */
    private ByteBuffer f53017g;

    /* renamed from: o */
    private boolean f53018o;

    /* renamed from: p */
    private boolean f53019p;

    /* renamed from: s */
    private boolean f53020s;

    ReaderInputStream(Reader reader, Charset charset, int i) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i);
    }

    /* renamed from: b */
    private static int m73458b(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    /* renamed from: c */
    private int m73459c(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f53017g.remaining());
        this.f53017g.get(bArr, i, min);
        return min;
    }

    /* renamed from: e */
    private static CharBuffer m73460e(CharBuffer charBuffer) {
        CharBuffer wrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        Java8Compatibility.m73454d(wrap, charBuffer.position());
        Java8Compatibility.m73453c(wrap, charBuffer.limit());
        return wrap;
    }

    /* renamed from: f */
    private void m73461f() throws IOException {
        if (m73458b(this.f53016f) == 0) {
            if (this.f53016f.position() > 0) {
                Java8Compatibility.m73452b(this.f53016f.compact());
            } else {
                this.f53016f = m73460e(this.f53016f);
            }
        }
        int limit = this.f53016f.limit();
        int read = this.f53013a.read(this.f53016f.array(), limit, m73458b(this.f53016f));
        if (read == -1) {
            this.f53018o = true;
        } else {
            Java8Compatibility.m73453c(this.f53016f, limit + read);
        }
    }

    /* renamed from: g */
    private void m73462g(boolean z) {
        Java8Compatibility.m73452b(this.f53017g);
        if (!z || this.f53017g.remaining() != 0) {
            this.f53019p = true;
        } else {
            this.f53017g = ByteBuffer.allocate(this.f53017g.capacity() * 2);
        }
    }

    public void close() throws IOException {
        this.f53013a.close();
    }

    public int read() throws IOException {
        if (read(this.f53015d) == 1) {
            return UnsignedBytes.m73668c(this.f53015d[0]);
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            com.google.common.base.Preconditions.m5397x(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r1 = r7.f53018o
            r2 = 0
        L_0x000d:
            boolean r3 = r7.f53019p
            if (r3 == 0) goto L_0x002e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.m73459c(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L_0x0029
            boolean r3 = r7.f53020s
            if (r3 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            r7.f53019p = r0
            java.nio.ByteBuffer r3 = r7.f53017g
            com.google.common.p206io.Java8Compatibility.m73451a(r3)
            goto L_0x002e
        L_0x0029:
            if (r2 <= 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = -1
        L_0x002d:
            return r2
        L_0x002e:
            boolean r3 = r7.f53020s
            if (r3 == 0) goto L_0x0035
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L_0x004c
        L_0x0035:
            if (r1 == 0) goto L_0x0040
            java.nio.charset.CharsetEncoder r3 = r7.f53014c
            java.nio.ByteBuffer r4 = r7.f53017g
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L_0x004c
        L_0x0040:
            java.nio.charset.CharsetEncoder r3 = r7.f53014c
            java.nio.CharBuffer r4 = r7.f53016f
            java.nio.ByteBuffer r5 = r7.f53017g
            boolean r6 = r7.f53018o
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L_0x004c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L_0x0057
            r7.m73462g(r5)
            goto L_0x000d
        L_0x0057:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x0065
            r7.f53020s = r5
            r7.m73462g(r0)
            goto L_0x000d
        L_0x0065:
            boolean r3 = r7.f53018o
            if (r3 == 0) goto L_0x006b
            r1 = 1
            goto L_0x002e
        L_0x006b:
            r7.m73461f()
            goto L_0x002e
        L_0x006f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L_0x002e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p206io.ReaderInputStream.read(byte[], int, int):int");
    }

    ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i) {
        boolean z = true;
        this.f53015d = new byte[1];
        this.f53013a = (Reader) Preconditions.m5392s(reader);
        this.f53014c = (CharsetEncoder) Preconditions.m5392s(charsetEncoder);
        Preconditions.m5381h(i <= 0 ? false : z, "bufferSize must be positive: %s", i);
        charsetEncoder.reset();
        CharBuffer allocate = CharBuffer.allocate(i);
        this.f53016f = allocate;
        Java8Compatibility.m73452b(allocate);
        this.f53017g = ByteBuffer.allocate(i);
    }
}
