package com.sun.mail.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ASCIIUtility {
    private ASCIIUtility() {
    }

    public static byte[] getBytes(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) charArray[i];
        }
        return bArr;
    }

    public static int parseInt(byte[] bArr, int i, int i2, int i3) throws NumberFormatException {
        boolean z;
        int i4;
        int i5;
        if (bArr == null) {
            throw new NumberFormatException("null");
        } else if (i2 > i) {
            int i6 = 0;
            if (bArr[i] == 45) {
                i5 = Integer.MIN_VALUE;
                i4 = i + 1;
                z = true;
            } else {
                i5 = -2147483647;
                i4 = i;
                z = false;
            }
            int i7 = i5 / i3;
            if (i4 < i2) {
                int i8 = i4 + 1;
                int digit = Character.digit((char) bArr[i4], i3);
                if (digit >= 0) {
                    int i9 = i8;
                    i6 = -digit;
                    i4 = i9;
                } else {
                    throw new NumberFormatException("illegal number: " + toString(bArr, i, i2));
                }
            }
            while (i4 < i2) {
                int i10 = i4 + 1;
                int digit2 = Character.digit((char) bArr[i4], i3);
                if (digit2 < 0) {
                    throw new NumberFormatException("illegal number");
                } else if (i6 >= i7) {
                    int i11 = i6 * i3;
                    if (i11 >= i5 + digit2) {
                        i6 = i11 - digit2;
                        i4 = i10;
                    } else {
                        throw new NumberFormatException("illegal number");
                    }
                } else {
                    throw new NumberFormatException("illegal number");
                }
            }
            if (!z) {
                return -i6;
            }
            if (i4 > i + 1) {
                return i6;
            }
            throw new NumberFormatException("illegal number");
        } else {
            throw new NumberFormatException("illegal number");
        }
    }

    public static long parseLong(byte[] bArr, int i, int i2, int i3) throws NumberFormatException {
        long j;
        boolean z;
        int i4;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        if (bArr != null) {
            long j2 = 0;
            if (i6 > i5) {
                if (bArr[i5] == 45) {
                    i4 = i5 + 1;
                    j = Long.MIN_VALUE;
                    z = true;
                } else {
                    i4 = i5;
                    j = -9223372036854775807L;
                    z = false;
                }
                long j3 = (long) i7;
                long j4 = j / j3;
                if (i4 < i6) {
                    int i8 = i4 + 1;
                    int digit = Character.digit((char) bArr[i4], i7);
                    if (digit >= 0) {
                        i4 = i8;
                        j2 = (long) (-digit);
                    } else {
                        throw new NumberFormatException("illegal number: " + toString(bArr, i, i2));
                    }
                }
                while (i4 < i6) {
                    int i9 = i4 + 1;
                    int digit2 = Character.digit((char) bArr[i4], i7);
                    if (digit2 < 0) {
                        throw new NumberFormatException("illegal number");
                    } else if (j2 >= j4) {
                        long j5 = j2 * j3;
                        long j6 = (long) digit2;
                        if (j5 >= j + j6) {
                            j2 = j5 - j6;
                            i6 = i2;
                            i7 = i3;
                            i4 = i9;
                        } else {
                            throw new NumberFormatException("illegal number");
                        }
                    } else {
                        throw new NumberFormatException("illegal number");
                    }
                }
                if (!z) {
                    return -j2;
                }
                if (i4 > i5 + 1) {
                    return j2;
                }
                throw new NumberFormatException("illegal number");
            }
            throw new NumberFormatException("illegal number");
        }
        throw new NumberFormatException("null");
    }

    public static String toString(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        char[] cArr = new char[i3];
        int i4 = 0;
        while (i4 < i3) {
            cArr[i4] = (char) (bArr[i] & 255);
            i4++;
            i++;
        }
        return new String(cArr);
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, 0, bArr.length);
    }

    public static byte[] getBytes(InputStream inputStream) throws IOException {
        if (inputStream instanceof ByteArrayInputStream) {
            int available = inputStream.available();
            byte[] bArr = new byte[available];
            inputStream.read(bArr, 0, available);
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr2, 0, 1024);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr2, 0, read);
        }
    }

    public static String toString(ByteArrayInputStream byteArrayInputStream) {
        int available = byteArrayInputStream.available();
        char[] cArr = new char[available];
        byte[] bArr = new byte[available];
        byteArrayInputStream.read(bArr, 0, available);
        for (int i = 0; i < available; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static int parseInt(byte[] bArr, int i, int i2) throws NumberFormatException {
        return parseInt(bArr, i, i2, 10);
    }

    public static long parseLong(byte[] bArr, int i, int i2) throws NumberFormatException {
        return parseLong(bArr, i, i2, 10);
    }
}
