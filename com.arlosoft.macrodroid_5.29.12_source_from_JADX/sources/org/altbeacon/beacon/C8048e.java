package org.altbeacon.beacon;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: org.altbeacon.beacon.e */
/* compiled from: Identifier */
public class C8048e implements Comparable<C8048e>, Serializable {

    /* renamed from: a */
    private static final Pattern f19638a = Pattern.compile("^0x[0-9A-Fa-f]*$");

    /* renamed from: c */
    private static final Pattern f19639c = Pattern.compile("^[0-9A-Fa-f]*$");

    /* renamed from: d */
    private static final Pattern f19640d = Pattern.compile("^0|[1-9][0-9]*$");

    /* renamed from: f */
    private static final Pattern f19641f = Pattern.compile("^[0-9A-Fa-f]{8}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{12}$");

    /* renamed from: g */
    private static final char[] f19642g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final byte[] mValue;

    protected C8048e(byte[] bArr) {
        Objects.requireNonNull(bArr, "Identifiers cannot be constructed from null pointers but \"value\" is null.");
        this.mValue = bArr;
    }

    /* renamed from: d */
    public static C8048e m33576d(byte[] bArr, int i, int i2, boolean z) {
        Objects.requireNonNull(bArr, "Identifiers cannot be constructed from null pointers but \"bytes\" is null.");
        if (i < 0 || i > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("start < 0 || start > bytes.length");
        } else if (i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("end > bytes.length");
        } else if (i <= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            if (z) {
                m33582k(copyOfRange);
            }
            return new C8048e(copyOfRange);
        } else {
            throw new IllegalArgumentException("start > end");
        }
    }

    /* renamed from: e */
    public static C8048e m33577e(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Identifiers can only be constructed from integers between 0 and 65535 (inclusive).");
        }
        return new C8048e(new byte[]{(byte) (i >> 8), (byte) i});
    }

    /* renamed from: f */
    public static C8048e m33578f(long j, int i) {
        if (i >= 0) {
            byte[] bArr = new byte[i];
            for (int i2 = i - 1; i2 >= 0; i2--) {
                bArr[i2] = (byte) ((int) (255 & j));
                j >>= 8;
            }
            return new C8048e(bArr);
        }
        throw new IllegalArgumentException("Identifier length must be > 0.");
    }

    /* renamed from: g */
    public static C8048e m33579g(String str) {
        return m33580i(str, -1);
    }

    /* renamed from: i */
    public static C8048e m33580i(String str, int i) {
        Objects.requireNonNull(str, "Identifiers cannot be constructed from null pointers but \"stringValue\" is null.");
        if (f19638a.matcher(str).matches()) {
            return m33581j(str.substring(2), i);
        }
        if (f19641f.matcher(str).matches()) {
            return m33581j(str.replace(HelpFormatter.DEFAULT_OPT_PREFIX, ""), i);
        }
        if (f19640d.matcher(str).matches()) {
            try {
                int intValue = Integer.valueOf(str).intValue();
                if (i <= 0 || i == 2) {
                    return m33577e(intValue);
                }
                return m33578f((long) intValue, i);
            } catch (Throwable th) {
                throw new IllegalArgumentException("Unable to parse Identifier in decimal format.", th);
            }
        } else if (f19639c.matcher(str).matches()) {
            return m33581j(str, i);
        } else {
            throw new IllegalArgumentException("Unable to parse Identifier.");
        }
    }

    /* renamed from: j */
    private static C8048e m33581j(String str, int i) {
        String str2 = (str.length() % 2 == 0 ? "" : "0") + str.toUpperCase();
        if (i > 0 && i < str2.length() / 2) {
            str2 = str2.substring(str2.length() - (i * 2));
        }
        if (i > 0 && i > str2.length() / 2) {
            int length = (i * 2) - str2.length();
            StringBuilder sb = new StringBuilder();
            while (sb.length() < length) {
                sb.append("0");
            }
            str2 = sb.toString() + str2;
        }
        int length2 = str2.length() / 2;
        byte[] bArr = new byte[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Integer.parseInt(str2.substring(i3, i3 + 2), 16) & 255);
        }
        return new C8048e(bArr);
    }

    /* renamed from: k */
    private static void m33582k(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int length = (bArr.length - i) - 1;
            byte b = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b;
        }
    }

    /* renamed from: b */
    public int compareTo(C8048e eVar) {
        byte[] bArr = this.mValue;
        int length = bArr.length;
        byte[] bArr2 = eVar.mValue;
        if (length == bArr2.length) {
            int i = 0;
            while (true) {
                byte[] bArr3 = this.mValue;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b = bArr3[i];
                byte[] bArr4 = eVar.mValue;
                if (b == bArr4[i]) {
                    i++;
                } else if (bArr3[i] < bArr4[i]) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else if (bArr.length < bArr2.length) {
            return -1;
        } else {
            return 1;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8048e)) {
            return false;
        }
        return Arrays.equals(this.mValue, ((C8048e) obj).mValue);
    }

    public int hashCode() {
        return Arrays.hashCode(this.mValue);
    }

    /* renamed from: l */
    public byte[] mo38053l() {
        return (byte[]) this.mValue.clone();
    }

    /* renamed from: m */
    public String mo38054m() {
        int length = this.mValue.length;
        int i = 2;
        char[] cArr = new char[((length * 2) + 2)];
        cArr[0] = '0';
        cArr[1] = 'x';
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f19642g;
            byte[] bArr = this.mValue;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return new String(cArr);
    }

    /* renamed from: n */
    public int mo38055n() {
        if (this.mValue.length <= 2) {
            int i = 0;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.mValue;
                if (i >= bArr.length) {
                    return i2;
                }
                i2 |= (bArr[i] & 255) << (((bArr.length - i) - 1) * 8);
                i++;
            }
        } else {
            throw new UnsupportedOperationException("Only supported for Identifiers with max byte length of 2");
        }
    }

    /* renamed from: q */
    public UUID mo38056q() {
        byte[] bArr = this.mValue;
        if (bArr.length == 16) {
            LongBuffer asLongBuffer = ByteBuffer.wrap(bArr).asLongBuffer();
            return new UUID(asLongBuffer.get(), asLongBuffer.get());
        }
        throw new UnsupportedOperationException("Only Identifiers backed by a byte array with length of exactly 16 can be UUIDs.");
    }

    public String toString() {
        byte[] bArr = this.mValue;
        if (bArr.length == 2) {
            return Integer.toString(mo38055n());
        }
        if (bArr.length == 16) {
            return mo38056q().toString();
        }
        return mo38054m();
    }
}
