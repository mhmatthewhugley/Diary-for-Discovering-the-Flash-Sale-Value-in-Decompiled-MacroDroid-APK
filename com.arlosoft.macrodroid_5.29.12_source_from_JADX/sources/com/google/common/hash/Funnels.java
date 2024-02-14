package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@Beta
public final class Funnels {

    private enum ByteArrayFunnel implements Funnel<byte[]> {
        INSTANCE;

        /* renamed from: d */
        public void mo36986S(byte[] bArr, PrimitiveSink primitiveSink) {
            primitiveSink.mo36948a(bArr);
        }

        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    private enum IntegerFunnel implements Funnel<Integer> {
        INSTANCE;

        /* renamed from: d */
        public void mo36986S(Integer num, PrimitiveSink primitiveSink) {
            primitiveSink.putInt(num.intValue());
        }

        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    private enum LongFunnel implements Funnel<Long> {
        INSTANCE;

        /* renamed from: d */
        public void mo36986S(Long l, PrimitiveSink primitiveSink) {
            primitiveSink.putLong(l.longValue());
        }

        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    private static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
        private final Funnel<E> elementFunnel;

        /* renamed from: a */
        public void mo36986S(Iterable<? extends E> iterable, PrimitiveSink primitiveSink) {
            for (Object S : iterable) {
                this.elementFunnel.mo36986S(S, primitiveSink);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof SequentialFunnel) {
                return this.elementFunnel.equals(((SequentialFunnel) obj).elementFunnel);
            }
            return false;
        }

        public int hashCode() {
            return SequentialFunnel.class.hashCode() ^ this.elementFunnel.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.elementFunnel);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("Funnels.sequentialFunnel(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class SinkAsStream extends OutputStream {

        /* renamed from: a */
        final PrimitiveSink f17536a;

        public String toString() {
            String valueOf = String.valueOf(this.f17536a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Funnels.asOutputStream(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }

        public void write(int i) {
            this.f17536a.mo36949b((byte) i);
        }

        public void write(byte[] bArr) {
            this.f17536a.mo36948a(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.f17536a.mo36950d(bArr, i, i2);
        }
    }

    private static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {
        private final Charset charset;

        private static class SerializedForm implements Serializable {
            private static final long serialVersionUID = 0;
            private final String charsetCanonicalName;

            SerializedForm(Charset charset) {
                this.charsetCanonicalName = charset.name();
            }

            private Object readResolve() {
                return Funnels.m29698a(Charset.forName(this.charsetCanonicalName));
            }
        }

        StringCharsetFunnel(Charset charset2) {
            this.charset = (Charset) Preconditions.m5392s(charset2);
        }

        /* renamed from: a */
        public void mo36986S(CharSequence charSequence, PrimitiveSink primitiveSink) {
            primitiveSink.mo36961e(charSequence, this.charset);
        }

        public boolean equals(Object obj) {
            if (obj instanceof StringCharsetFunnel) {
                return this.charset.equals(((StringCharsetFunnel) obj).charset);
            }
            return false;
        }

        public int hashCode() {
            return StringCharsetFunnel.class.hashCode() ^ this.charset.hashCode();
        }

        public String toString() {
            String name = this.charset.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 22);
            sb.append("Funnels.stringFunnel(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new SerializedForm(this.charset);
        }
    }

    private enum UnencodedCharsFunnel implements Funnel<CharSequence> {
        INSTANCE;

        /* renamed from: d */
        public void mo36986S(CharSequence charSequence, PrimitiveSink primitiveSink) {
            primitiveSink.mo36960c(charSequence);
        }

        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }

    private Funnels() {
    }

    /* renamed from: a */
    public static Funnel<CharSequence> m29698a(Charset charset) {
        return new StringCharsetFunnel(charset);
    }
}
