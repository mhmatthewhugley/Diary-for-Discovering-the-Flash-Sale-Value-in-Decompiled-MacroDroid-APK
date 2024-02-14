package com.google.android.gms.internal.mlkit_translate;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzav {

    /* renamed from: a */
    private static final OutputStream f43125a = new zzau();

    /* renamed from: a */
    public static long m61603a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }
}
