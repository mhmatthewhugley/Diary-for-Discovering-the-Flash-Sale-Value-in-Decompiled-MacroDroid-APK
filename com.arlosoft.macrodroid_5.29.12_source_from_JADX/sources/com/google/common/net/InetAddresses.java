package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.apache.commons.p353io.FilenameUtils;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class InetAddresses {

    /* renamed from: a */
    private static final CharMatcher f53063a = CharMatcher.m5176k(FilenameUtils.EXTENSION_SEPARATOR);

    /* renamed from: b */
    private static final CharMatcher f53064b = CharMatcher.m5176k(':');

    /* renamed from: c */
    private static final Inet4Address f53065c = ((Inet4Address) m73490c("127.0.0.1"));

    /* renamed from: d */
    private static final Inet4Address f53066d = ((Inet4Address) m73490c("0.0.0.0"));

    public static final class TeredoInfo {
    }

    private InetAddresses() {
    }

    /* renamed from: a */
    private static InetAddress m73488a(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    private static String m73489b(String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        String substring = str.substring(0, lastIndexOf);
        byte[] h = m73495h(str.substring(lastIndexOf));
        if (h == null) {
            return null;
        }
        String hexString = Integer.toHexString(((h[0] & 255) << 8) | (h[1] & 255));
        String hexString2 = Integer.toHexString((h[3] & 255) | ((h[2] & 255) << 8));
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(hexString).length() + String.valueOf(hexString2).length());
        sb.append(substring);
        sb.append(hexString);
        sb.append(":");
        sb.append(hexString2);
        return sb.toString();
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public static InetAddress m73490c(String str) {
        byte[] e = m73492e(str);
        if (e != null) {
            return m73488a(e);
        }
        throw m73491d("'%s' is not an IP string literal.", str);
    }

    /* renamed from: d */
    private static IllegalArgumentException m73491d(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    /* renamed from: e */
    private static byte[] m73492e(String str) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i >= str.length()) {
                i = -1;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == '.') {
                z = true;
            } else if (charAt == ':') {
                if (z) {
                    return null;
                }
                z2 = true;
            } else if (charAt == '%') {
                break;
            } else if (Character.digit(charAt, 16) == -1) {
                return null;
            }
            i++;
        }
        if (z2) {
            if (z && (str = m73489b(str)) == null) {
                return null;
            }
            if (i != -1) {
                str = str.substring(0, i);
            }
            return m73496i(str);
        } else if (!z || i != -1) {
            return null;
        } else {
            return m73495h(str);
        }
    }

    /* renamed from: f */
    private static short m73493f(String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 <= 0 || i3 > 4) {
            throw new NumberFormatException();
        }
        int i4 = 0;
        while (i < i2) {
            i4 = (i4 << 4) | Character.digit(str.charAt(i), 16);
            i++;
        }
        return (short) i4;
    }

    /* renamed from: g */
    private static byte m73494g(String str, int i, int i2) {
        int i3 = i2 - i;
        if (i3 <= 0 || i3 > 3) {
            throw new NumberFormatException();
        } else if (i3 <= 1 || str.charAt(i) != '0') {
            int i4 = 0;
            while (i < i2) {
                int i5 = i4 * 10;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i4 = i5 + digit;
                    i++;
                } else {
                    throw new NumberFormatException();
                }
            }
            if (i4 <= 255) {
                return (byte) i4;
            }
            throw new NumberFormatException();
        } else {
            throw new NumberFormatException();
        }
    }

    /* renamed from: h */
    private static byte[] m73495h(String str) {
        if (f53063a.mo22105g(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        int i2 = 0;
        while (i < 4) {
            int indexOf = str.indexOf(46, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i] = m73494g(str, i2, indexOf);
                i2 = indexOf + 1;
                i++;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    /* renamed from: i */
    private static byte[] m73496i(String str) {
        int g = f53064b.mo22105g(str);
        if (g >= 2 && g <= 8) {
            int i = 1;
            int i2 = g + 1;
            int i3 = 8 - i2;
            boolean z = false;
            for (int i4 = 0; i4 < str.length() - 1; i4++) {
                if (str.charAt(i4) == ':' && str.charAt(i4 + 1) == ':') {
                    if (z) {
                        return null;
                    }
                    i3++;
                    if (i4 == 0) {
                        i3++;
                    }
                    if (i4 == str.length() - 2) {
                        i3++;
                    }
                    z = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z && i3 <= 0) {
                return null;
            }
            if (!z && i2 != 8) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i = 0;
                }
                while (i < str.length()) {
                    int indexOf = str.indexOf(58, i);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    if (str.charAt(i) == ':') {
                        for (int i5 = 0; i5 < i3; i5++) {
                            allocate.putShort(0);
                        }
                    } else {
                        allocate.putShort(m73493f(str, i, indexOf));
                    }
                    i = indexOf + 1;
                }
                return allocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
