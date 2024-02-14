package p419ve;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: ve.d */
/* compiled from: StringBuilderWriter */
public class C16774d extends Writer implements Serializable {
    private final StringBuilder builder;

    public C16774d() {
        this.builder = new StringBuilder();
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return this.builder.toString();
    }

    public void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.builder.append(cArr, i, i2);
        }
    }

    public C16774d(int i) {
        this.builder = new StringBuilder(i);
    }

    public Writer append(char c) {
        this.builder.append(c);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i, int i2) {
        this.builder.append(charSequence, i, i2);
        return this;
    }
}
