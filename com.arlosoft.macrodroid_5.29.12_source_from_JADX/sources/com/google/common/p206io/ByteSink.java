package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.ByteSink */
public abstract class ByteSink {

    /* renamed from: com.google.common.io.ByteSink$AsCharSink */
    private final class AsCharSink extends CharSink {

        /* renamed from: a */
        private final Charset f52950a;

        /* renamed from: b */
        final /* synthetic */ ByteSink f52951b;

        public String toString() {
            String obj = this.f52951b.toString();
            String valueOf = String.valueOf(this.f52950a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 13 + valueOf.length());
            sb.append(obj);
            sb.append(".asCharSink(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    protected ByteSink() {
    }
}
