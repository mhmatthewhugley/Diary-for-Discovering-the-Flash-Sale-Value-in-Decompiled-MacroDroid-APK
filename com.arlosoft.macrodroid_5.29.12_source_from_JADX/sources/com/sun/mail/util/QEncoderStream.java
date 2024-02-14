package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;

public class QEncoderStream extends QPEncoderStream {
    private static String TEXT_SPECIALS = "=_?";
    private static String WORD_SPECIALS = "=_?\"#$%&'(),.:;<>@[\\]^`{|}~";
    private String specials;

    public QEncoderStream(OutputStream outputStream, boolean z) {
        super(outputStream, Integer.MAX_VALUE);
        this.specials = z ? WORD_SPECIALS : TEXT_SPECIALS;
    }

    public static int encodedLength(byte[] bArr, boolean z) {
        String str = z ? WORD_SPECIALS : TEXT_SPECIALS;
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            i = (b2 < 32 || b2 >= Byte.MAX_VALUE || str.indexOf(b2) >= 0) ? i + 3 : i + 1;
        }
        return i;
    }

    public void write(int i) throws IOException {
        int i2 = i & 255;
        if (i2 == 32) {
            output(95, false);
        } else if (i2 < 32 || i2 >= 127 || this.specials.indexOf(i2) >= 0) {
            output(i2, true);
        } else {
            output(i2, false);
        }
    }
}
