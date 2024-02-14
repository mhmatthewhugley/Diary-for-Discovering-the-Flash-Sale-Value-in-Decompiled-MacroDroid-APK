package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.Writer;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.CharStreams */
public final class CharStreams {

    /* renamed from: com.google.common.io.CharStreams$NullWriter */
    private static final class NullWriter extends Writer {

        /* renamed from: a */
        private static final NullWriter f52977a = new NullWriter();

        private NullWriter() {
        }

        public Writer append(char c) {
            return this;
        }

        public Writer append(CharSequence charSequence) {
            return this;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        public void write(int i) {
        }

        public void write(char[] cArr) {
            Preconditions.m5392s(cArr);
        }

        public void write(char[] cArr, int i, int i2) {
            Preconditions.m5397x(i, i2 + i, cArr.length);
        }

        public void write(String str) {
            Preconditions.m5392s(str);
        }

        public Writer append(CharSequence charSequence, int i, int i2) {
            Preconditions.m5397x(i, i2, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        public void write(String str, int i, int i2) {
            Preconditions.m5397x(i, i2 + i, str.length());
        }
    }

    private CharStreams() {
    }
}
