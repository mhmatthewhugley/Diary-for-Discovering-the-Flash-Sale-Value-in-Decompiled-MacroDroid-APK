package org.slf4j.helpers;

import java.io.PrintStream;

/* renamed from: org.slf4j.helpers.f */
/* compiled from: Util */
public class C16083f {
    /* renamed from: a */
    public static final void m96710a(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SLF4J: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    /* renamed from: b */
    public static final void m96711b(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
