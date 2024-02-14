package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class RandomFidGenerator {

    /* renamed from: a */
    private static final byte f54854a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f54855b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m76638b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m76639c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    /* renamed from: a */
    public String mo63240a() {
        byte[] c = m76639c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f54855b & c[0]) | f54854a);
        return m76638b(c);
    }
}
