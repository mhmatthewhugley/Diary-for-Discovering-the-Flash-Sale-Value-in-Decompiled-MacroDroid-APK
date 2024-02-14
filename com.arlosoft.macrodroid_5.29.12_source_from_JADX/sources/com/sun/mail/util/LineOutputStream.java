package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class LineOutputStream extends FilterOutputStream {
    private static byte[] newline;
    private boolean allowutf8;

    static {
        byte[] bArr = new byte[2];
        newline = bArr;
        bArr[0] = 13;
        bArr[1] = 10;
    }

    public LineOutputStream(OutputStream outputStream) {
        this(outputStream, false);
    }

    public void writeln(String str) throws IOException {
        byte[] bArr;
        if (this.allowutf8) {
            bArr = str.getBytes(StandardCharsets.UTF_8);
        } else {
            bArr = ASCIIUtility.getBytes(str);
        }
        this.out.write(bArr);
        this.out.write(newline);
    }

    public LineOutputStream(OutputStream outputStream, boolean z) {
        super(outputStream);
        this.allowutf8 = z;
    }

    public void writeln() throws IOException {
        this.out.write(newline);
    }
}
