package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.CharSequenceReader */
final class CharSequenceReader extends Reader {

    /* renamed from: a */
    private CharSequence f52967a;

    /* renamed from: c */
    private int f52968c;

    /* renamed from: d */
    private int f52969d;

    public CharSequenceReader(CharSequence charSequence) {
        this.f52967a = (CharSequence) Preconditions.m5392s(charSequence);
    }

    /* renamed from: b */
    private void m73419b() throws IOException {
        if (this.f52967a == null) {
            throw new IOException("reader closed");
        }
    }

    /* renamed from: c */
    private boolean m73420c() {
        return m73421e() > 0;
    }

    /* renamed from: e */
    private int m73421e() {
        Objects.requireNonNull(this.f52967a);
        return this.f52967a.length() - this.f52968c;
    }

    public synchronized void close() throws IOException {
        this.f52967a = null;
    }

    public synchronized void mark(int i) throws IOException {
        Preconditions.m5381h(i >= 0, "readAheadLimit (%s) may not be negative", i);
        m73419b();
        this.f52969d = this.f52968c;
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized int read(CharBuffer charBuffer) throws IOException {
        Preconditions.m5392s(charBuffer);
        m73419b();
        Objects.requireNonNull(this.f52967a);
        if (!m73420c()) {
            return -1;
        }
        int min = Math.min(charBuffer.remaining(), m73421e());
        for (int i = 0; i < min; i++) {
            CharSequence charSequence = this.f52967a;
            int i2 = this.f52968c;
            this.f52968c = i2 + 1;
            charBuffer.put(charSequence.charAt(i2));
        }
        return min;
    }

    public synchronized boolean ready() throws IOException {
        m73419b();
        return true;
    }

    public synchronized void reset() throws IOException {
        m73419b();
        this.f52968c = this.f52969d;
    }

    public synchronized long skip(long j) throws IOException {
        int min;
        Preconditions.m5383j(j >= 0, "n (%s) may not be negative", j);
        m73419b();
        min = (int) Math.min((long) m73421e(), j);
        this.f52968c += min;
        return (long) min;
    }

    public synchronized int read() throws IOException {
        char c;
        m73419b();
        Objects.requireNonNull(this.f52967a);
        if (m73420c()) {
            CharSequence charSequence = this.f52967a;
            int i = this.f52968c;
            this.f52968c = i + 1;
            c = charSequence.charAt(i);
        } else {
            c = 65535;
        }
        return c;
    }

    public synchronized int read(char[] cArr, int i, int i2) throws IOException {
        Preconditions.m5397x(i, i + i2, cArr.length);
        m73419b();
        Objects.requireNonNull(this.f52967a);
        if (!m73420c()) {
            return -1;
        }
        int min = Math.min(i2, m73421e());
        for (int i3 = 0; i3 < min; i3++) {
            CharSequence charSequence = this.f52967a;
            int i4 = this.f52968c;
            this.f52968c = i4 + 1;
            cArr[i + i3] = charSequence.charAt(i4);
        }
        return min;
    }
}
