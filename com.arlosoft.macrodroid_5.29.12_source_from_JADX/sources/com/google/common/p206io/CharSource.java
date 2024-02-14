package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.CharSource */
public abstract class CharSource {

    /* renamed from: com.google.common.io.CharSource$AsByteSource */
    private final class AsByteSource extends ByteSource {

        /* renamed from: a */
        final Charset f52970a;

        /* renamed from: b */
        final /* synthetic */ CharSource f52971b;

        /* renamed from: a */
        public InputStream mo60979a() throws IOException {
            return new ReaderInputStream(this.f52971b.mo61010a(), this.f52970a, 8192);
        }

        public String toString() {
            String obj = this.f52971b.toString();
            String valueOf = String.valueOf(this.f52970a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + valueOf.length());
            sb.append(obj);
            sb.append(".asByteSource(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.CharSource$CharSequenceCharSource */
    private static class CharSequenceCharSource extends CharSource {

        /* renamed from: b */
        private static final Splitter f52972b = Splitter.m5431j("\r\n|\n|\r");

        /* renamed from: a */
        protected final CharSequence f52973a;

        /* renamed from: com.google.common.io.CharSource$CharSequenceCharSource$1 */
        class C108981 extends AbstractIterator<String> {

            /* renamed from: d */
            Iterator<String> f52974d;

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public String mo34417a() {
                if (this.f52974d.hasNext()) {
                    String next = this.f52974d.next();
                    if (this.f52974d.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return (String) mo34418b();
            }
        }

        protected CharSequenceCharSource(CharSequence charSequence) {
            this.f52973a = (CharSequence) Preconditions.m5392s(charSequence);
        }

        /* renamed from: a */
        public Reader mo61010a() {
            return new CharSequenceReader(this.f52973a);
        }

        public String toString() {
            String f = Ascii.m5150f(this.f52973a, 30, "...");
            StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 17);
            sb.append("CharSource.wrap(");
            sb.append(f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.CharSource$ConcatenatedCharSource */
    private static final class ConcatenatedCharSource extends CharSource {

        /* renamed from: a */
        private final Iterable<? extends CharSource> f52975a;

        /* renamed from: a */
        public Reader mo61010a() throws IOException {
            return new MultiReader(this.f52975a.iterator());
        }

        public String toString() {
            String valueOf = String.valueOf(this.f52975a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("CharSource.concat(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.CharSource$EmptyCharSource */
    private static final class EmptyCharSource extends StringCharSource {

        /* renamed from: c */
        private static final EmptyCharSource f52976c = new EmptyCharSource();

        private EmptyCharSource() {
            super("");
        }

        public String toString() {
            return "CharSource.empty()";
        }
    }

    /* renamed from: com.google.common.io.CharSource$StringCharSource */
    private static class StringCharSource extends CharSequenceCharSource {
        protected StringCharSource(String str) {
            super(str);
        }

        /* renamed from: a */
        public Reader mo61010a() {
            return new StringReader((String) this.f52973a);
        }
    }

    protected CharSource() {
    }

    /* renamed from: a */
    public abstract Reader mo61010a() throws IOException;
}
