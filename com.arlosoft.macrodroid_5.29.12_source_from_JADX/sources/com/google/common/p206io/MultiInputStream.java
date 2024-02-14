package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.MultiInputStream */
final class MultiInputStream extends InputStream {

    /* renamed from: a */
    private Iterator<? extends ByteSource> f53008a;

    /* renamed from: c */
    private InputStream f53009c;

    public MultiInputStream(Iterator<? extends ByteSource> it) throws IOException {
        this.f53008a = (Iterator) Preconditions.m5392s(it);
        m73456b();
    }

    /* renamed from: b */
    private void m73456b() throws IOException {
        close();
        if (this.f53008a.hasNext()) {
            this.f53009c = ((ByteSource) this.f53008a.next()).mo60979a();
        }
    }

    public int available() throws IOException {
        InputStream inputStream = this.f53009c;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    public void close() throws IOException {
        InputStream inputStream = this.f53009c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f53009c = null;
            }
        }
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f53009c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m73456b();
        }
    }

    public long skip(long j) throws IOException {
        InputStream inputStream = this.f53009c;
        if (inputStream == null || j <= 0) {
            return 0;
        }
        long skip = inputStream.skip(j);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0;
        }
        return this.f53009c.skip(j - 1) + 1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        Preconditions.m5392s(bArr);
        while (true) {
            InputStream inputStream = this.f53009c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                return read;
            }
            m73456b();
        }
    }
}
