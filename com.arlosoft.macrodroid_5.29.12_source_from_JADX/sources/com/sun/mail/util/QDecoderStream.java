package com.sun.mail.util;

import java.io.IOException;
import java.io.InputStream;

public class QDecoderStream extends QPDecoderStream {
    public QDecoderStream(InputStream inputStream) {
        super(inputStream);
    }

    public int read() throws IOException {
        int read = this.in.read();
        if (read == 95) {
            return 32;
        }
        if (read != 61) {
            return read;
        }
        this.f57626ba[0] = (byte) this.in.read();
        this.f57626ba[1] = (byte) this.in.read();
        try {
            return ASCIIUtility.parseInt(this.f57626ba, 0, 2, 16);
        } catch (NumberFormatException e) {
            throw new DecodingException("QDecoder: Error in QP stream " + e.getMessage());
        }
    }
}
