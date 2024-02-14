package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.MultiReader */
class MultiReader extends Reader {

    /* renamed from: a */
    private final Iterator<? extends CharSource> f53010a;

    /* renamed from: c */
    private Reader f53011c;

    MultiReader(Iterator<? extends CharSource> it) throws IOException {
        this.f53010a = it;
        m73457b();
    }

    /* renamed from: b */
    private void m73457b() throws IOException {
        close();
        if (this.f53010a.hasNext()) {
            this.f53011c = ((CharSource) this.f53010a.next()).mo61010a();
        }
    }

    public void close() throws IOException {
        Reader reader = this.f53011c;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f53011c = null;
            }
        }
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        Preconditions.m5392s(cArr);
        Reader reader = this.f53011c;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i, i2);
        if (read != -1) {
            return read;
        }
        m73457b();
        return read(cArr, i, i2);
    }

    public boolean ready() throws IOException {
        Reader reader = this.f53011c;
        return reader != null && reader.ready();
    }

    public long skip(long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        Preconditions.m5378e(i >= 0, "n is negative");
        if (i > 0) {
            while (true) {
                Reader reader = this.f53011c;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j);
                if (skip > 0) {
                    return skip;
                }
                m73457b();
            }
        }
        return 0;
    }
}
