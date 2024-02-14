package p292io.grpc.internal;

import com.google.common.base.Charsets;
import com.google.common.p206io.BaseEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import p292io.grpc.C12562g0;
import p292io.grpc.C12960q0;

/* renamed from: io.grpc.internal.i2 */
/* compiled from: TransportFrameUtil */
public final class C12716i2 {

    /* renamed from: a */
    private static final Logger f59956a = Logger.getLogger(C12716i2.class.getName());

    /* renamed from: b */
    private static final byte[] f59957b = "-bin".getBytes(Charsets.f4137a);

    private C12716i2() {
    }

    /* renamed from: a */
    private static boolean m84262a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m84263b(byte[] bArr) {
        for (byte b : bArr) {
            if (b < 32 || b > 126) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static byte[][] m84264c(byte[][] bArr, int i) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(bArr[i2]);
        }
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            if (!m84262a(bArr2, f59957b)) {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 <= bArr3.length; i4++) {
                    if (i4 == bArr3.length || bArr3[i4] == 44) {
                        byte[] c = BaseEncoding.m73356b().mo60967c(new String(bArr3, i3, i4 - i3, Charsets.f4137a));
                        arrayList.add(bArr2);
                        arrayList.add(c);
                        i3 = i4 + 1;
                    }
                }
            }
            i += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    /* renamed from: d */
    public static byte[][] m84265d(C12960q0 q0Var) {
        byte[][] d = C12562g0.m83778d(q0Var);
        if (d == null) {
            return new byte[0][];
        }
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2 += 2) {
            byte[] bArr = d[i2];
            byte[] bArr2 = d[i2 + 1];
            if (m84262a(bArr, f59957b)) {
                d[i] = bArr;
                d[i + 1] = C12562g0.f59500b.mo60971g(bArr2).getBytes(Charsets.f4137a);
            } else if (m84263b(bArr2)) {
                d[i] = bArr;
                d[i + 1] = bArr2;
            } else {
                String str = new String(bArr, Charsets.f4137a);
                Logger logger = f59956a;
                logger.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i += 2;
        }
        if (i == d.length) {
            return d;
        }
        return (byte[][]) Arrays.copyOfRange(d, 0, i);
    }

    /* renamed from: e */
    public static byte[][] m84266e(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (m84262a(bArr2, f59957b)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        return m84264c(bArr, i);
                    }
                }
                bArr[i2] = BaseEncoding.m73356b().mo60967c(new String(bArr3, Charsets.f4137a));
            }
        }
        return bArr;
    }
}
