package dev.skomlach.biometric.compat.crypto.rsa;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¨\u0006\r"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/rsa/BigIntHelper;", "", "()V", "bigInt2Bytes", "", "bigInt", "Ljava/math/BigInteger;", "bigInteger", "resultLength", "", "divAndRoundUp", "num", "divisor", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BigIntHelper.kt */
public final class BigIntHelper {
    public static final BigIntHelper INSTANCE = new BigIntHelper();

    private BigIntHelper() {
    }

    public static final byte[] bigInt2Bytes(BigInteger bigInteger, int i) {
        C13706o.m87929f(bigInteger, "bigInteger");
        ByteBuffer allocate = ByteBuffer.allocate(i);
        byte[] bigInt2Bytes = INSTANCE.bigInt2Bytes(bigInteger);
        allocate.position(i - bigInt2Bytes.length);
        allocate.put(bigInt2Bytes);
        byte[] array = allocate.array();
        C13706o.m87928e(array, "bb.array()");
        return array;
    }

    public static final int divAndRoundUp(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    private final byte[] bigInt2Bytes(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 == 0 || (bigInteger.bitLength() / 8) + 1 != bitLength / 8) {
            int length = byteArray.length;
            if (bigInteger.bitLength() % 8 == 0) {
                length--;
            } else {
                i = 0;
            }
            int i2 = bitLength / 8;
            int i3 = i2 - length;
            byte[] bArr = new byte[i2];
            System.arraycopy(byteArray, i, bArr, i3, length);
            return bArr;
        }
        C13706o.m87928e(byteArray, "bigBytes");
        return byteArray;
    }
}
