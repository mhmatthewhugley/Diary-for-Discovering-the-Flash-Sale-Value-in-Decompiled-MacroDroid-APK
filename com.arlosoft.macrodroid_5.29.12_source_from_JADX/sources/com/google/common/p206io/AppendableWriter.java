package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.AppendableWriter */
class AppendableWriter extends Writer {

    /* renamed from: a */
    private final Appendable f52908a;

    /* renamed from: c */
    private boolean f52909c;

    /* renamed from: b */
    private void m73354b() throws IOException {
        if (this.f52909c) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    public void close() throws IOException {
        this.f52909c = true;
        Appendable appendable = this.f52908a;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    public void flush() throws IOException {
        m73354b();
        Appendable appendable = this.f52908a;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        m73354b();
        this.f52908a.append(new String(cArr, i, i2));
    }

    public void write(int i) throws IOException {
        m73354b();
        this.f52908a.append((char) i);
    }

    public Writer append(char c) throws IOException {
        m73354b();
        this.f52908a.append(c);
        return this;
    }

    public void write(String str) throws IOException {
        Preconditions.m5392s(str);
        m73354b();
        this.f52908a.append(str);
    }

    public Writer append(CharSequence charSequence) throws IOException {
        m73354b();
        this.f52908a.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        m73354b();
        this.f52908a.append(charSequence, i, i2);
        return this;
    }

    public void write(String str, int i, int i2) throws IOException {
        Preconditions.m5392s(str);
        m73354b();
        this.f52908a.append(str, i, i2 + i);
    }
}
