package com.android.dex.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Objects;
import org.apache.commons.p353io.IOUtils;

public class ExceptionWithContext extends RuntimeException {
    private StringBuffer context;

    public ExceptionWithContext(String str) {
        this(str, (Throwable) null);
    }

    public static ExceptionWithContext withContext(Throwable th, String str) {
        ExceptionWithContext exceptionWithContext;
        if (th instanceof ExceptionWithContext) {
            exceptionWithContext = (ExceptionWithContext) th;
        } else {
            exceptionWithContext = new ExceptionWithContext(th);
        }
        exceptionWithContext.addContext(str);
        return exceptionWithContext;
    }

    public void addContext(String str) {
        Objects.requireNonNull(str, "str == null");
        this.context.append(str);
        if (!str.endsWith(IOUtils.LINE_SEPARATOR_UNIX)) {
            this.context.append(10);
        }
    }

    public String getContext() {
        return this.context.toString();
    }

    public void printContext(PrintStream printStream) {
        printStream.println(getMessage());
        printStream.print(this.context);
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.context);
    }

    public ExceptionWithContext(Throwable th) {
        this((String) null, th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExceptionWithContext(String str, Throwable th) {
        super(str == null ? th != null ? th.getMessage() : null : str, th);
        if (th instanceof ExceptionWithContext) {
            String stringBuffer = ((ExceptionWithContext) th).context.toString();
            StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.length() + 200);
            this.context = stringBuffer2;
            stringBuffer2.append(stringBuffer);
            return;
        }
        this.context = new StringBuffer(200);
    }

    public void printContext(PrintWriter printWriter) {
        printWriter.println(getMessage());
        printWriter.print(this.context);
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.context);
    }
}
