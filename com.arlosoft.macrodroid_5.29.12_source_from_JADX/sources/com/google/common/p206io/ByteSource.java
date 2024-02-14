package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.ByteSource */
public abstract class ByteSource {

    /* renamed from: com.google.common.io.ByteSource$AsCharSource */
    class AsCharSource extends CharSource {

        /* renamed from: a */
        final Charset f52952a;

        /* renamed from: b */
        final /* synthetic */ ByteSource f52953b;

        /* renamed from: a */
        public Reader mo61010a() throws IOException {
            return new InputStreamReader(this.f52953b.mo60979a(), this.f52952a);
        }

        public String toString() {
            String obj = this.f52953b.toString();
            String valueOf = String.valueOf(this.f52952a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + valueOf.length());
            sb.append(obj);
            sb.append(".asCharSource(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.ByteSource$ByteArrayByteSource */
    private static class ByteArrayByteSource extends ByteSource {

        /* renamed from: a */
        final byte[] f52954a;

        /* renamed from: b */
        final int f52955b;

        /* renamed from: c */
        final int f52956c;

        ByteArrayByteSource(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        public InputStream mo60979a() {
            return new ByteArrayInputStream(this.f52954a, this.f52955b, this.f52956c);
        }

        public String toString() {
            String f = Ascii.m5150f(BaseEncoding.m73355a().mo60972h(this.f52954a, this.f52955b, this.f52956c), 30, "...");
            StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 17);
            sb.append("ByteSource.wrap(");
            sb.append(f);
            sb.append(")");
            return sb.toString();
        }

        ByteArrayByteSource(byte[] bArr, int i, int i2) {
            this.f52954a = bArr;
            this.f52955b = i;
            this.f52956c = i2;
        }
    }

    /* renamed from: com.google.common.io.ByteSource$ConcatenatedByteSource */
    private static final class ConcatenatedByteSource extends ByteSource {

        /* renamed from: a */
        final Iterable<? extends ByteSource> f52957a;

        /* renamed from: a */
        public InputStream mo60979a() throws IOException {
            return new MultiInputStream(this.f52957a.iterator());
        }

        public String toString() {
            String valueOf = String.valueOf(this.f52957a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("ByteSource.concat(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.ByteSource$EmptyByteSource */
    private static final class EmptyByteSource extends ByteArrayByteSource {

        /* renamed from: d */
        static final EmptyByteSource f52958d = new EmptyByteSource();

        EmptyByteSource() {
            super(new byte[0]);
        }

        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* renamed from: com.google.common.io.ByteSource$SlicedByteSource */
    private final class SlicedByteSource extends ByteSource {

        /* renamed from: a */
        final long f52959a;

        /* renamed from: b */
        final long f52960b;

        /* renamed from: c */
        final /* synthetic */ ByteSource f52961c;

        /* renamed from: b */
        private InputStream m73406b(InputStream inputStream) throws IOException {
            Closer b;
            long j = this.f52959a;
            if (j > 0) {
                try {
                    if (ByteStreams.m73416i(inputStream, j) < this.f52959a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } catch (Throwable th) {
                    b.close();
                    throw th;
                }
            }
            return ByteStreams.m73411d(inputStream, this.f52960b);
        }

        /* renamed from: a */
        public InputStream mo60979a() throws IOException {
            return m73406b(this.f52961c.mo60979a());
        }

        public String toString() {
            String obj = this.f52961c.toString();
            long j = this.f52959a;
            long j2 = this.f52960b;
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 50);
            sb.append(obj);
            sb.append(".slice(");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }
    }

    protected ByteSource() {
    }

    /* renamed from: a */
    public abstract InputStream mo60979a() throws IOException;
}
