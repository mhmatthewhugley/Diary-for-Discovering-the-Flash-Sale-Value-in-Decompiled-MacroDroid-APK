package com.android.p023dx.util;

import java.io.PrintWriter;
import java.io.Writer;

/* renamed from: com.android.dx.util.Writers */
public final class Writers {
    private Writers() {
    }

    public static PrintWriter printWriterFor(Writer writer) {
        if (writer instanceof PrintWriter) {
            return (PrintWriter) writer;
        }
        return new PrintWriter(writer);
    }
}
