package com.fasterxml.jackson.core.p072io;

import com.android.p023dx.p026io.Opcodes;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* renamed from: com.fasterxml.jackson.core.io.m */
/* compiled from: UTF8Writer */
public final class C6820m extends Writer {

    /* renamed from: a */
    protected final C6811d f15861a;

    /* renamed from: c */
    OutputStream f15862c;

    /* renamed from: d */
    byte[] f15863d;

    /* renamed from: f */
    final int f15864f;

    /* renamed from: g */
    int f15865g;

    /* renamed from: o */
    int f15866o = 0;

    public C6820m(C6811d dVar, OutputStream outputStream) {
        this.f15861a = dVar;
        this.f15862c = outputStream;
        byte[] d = dVar.mo33903d();
        this.f15863d = d;
        this.f15864f = d.length - 4;
        this.f15865g = 0;
    }

    /* renamed from: b */
    private int m25632b(int i) throws IOException {
        int i2 = this.f15866o;
        this.f15866o = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    /* renamed from: c */
    private void m25633c(int i) throws IOException {
        if (i > 1114111) {
            throw new IOException("Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627");
        } else if (i < 55296) {
            throw new IOException("Illegal character point (0x" + Integer.toHexString(i) + ") to output");
        } else if (i <= 56319) {
            throw new IOException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        } else {
            throw new IOException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        }
    }

    public void close() throws IOException {
        OutputStream outputStream = this.f15862c;
        if (outputStream != null) {
            int i = this.f15865g;
            if (i > 0) {
                outputStream.write(this.f15863d, 0, i);
                this.f15865g = 0;
            }
            OutputStream outputStream2 = this.f15862c;
            this.f15862c = null;
            byte[] bArr = this.f15863d;
            if (bArr != null) {
                this.f15863d = null;
                this.f15861a.mo33912m(bArr);
            }
            outputStream2.close();
            int i2 = this.f15866o;
            this.f15866o = 0;
            if (i2 > 0) {
                m25633c(i2);
            }
        }
    }

    public void flush() throws IOException {
        OutputStream outputStream = this.f15862c;
        if (outputStream != null) {
            int i = this.f15865g;
            if (i > 0) {
                outputStream.write(this.f15863d, 0, i);
                this.f15865g = 0;
            }
            this.f15862c.flush();
        }
    }

    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    public Writer append(char c) throws IOException {
        write((int) c);
        return this;
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 >= 2) {
            if (this.f15866o > 0) {
                i2--;
                write(m25632b(cArr[i]));
                i++;
            }
            int i3 = this.f15865g;
            byte[] bArr = this.f15863d;
            int i4 = this.f15864f;
            int i5 = i2 + r9;
            while (r9 < i5) {
                if (i3 >= i4) {
                    this.f15862c.write(bArr, 0, i3);
                    i3 = 0;
                }
                int i6 = r9 + 1;
                char c = cArr[r9];
                if (c < 128) {
                    int i7 = i3 + 1;
                    bArr[i3] = (byte) c;
                    int i8 = i5 - i6;
                    int i9 = i4 - i7;
                    if (i8 > i9) {
                        i8 = i9;
                    }
                    int i10 = i8 + i6;
                    while (true) {
                        r9 = i6;
                        i3 = i7;
                        if (r9 >= i10) {
                            continue;
                            break;
                        }
                        i6 = r9 + 1;
                        c = cArr[r9];
                        if (c >= 128) {
                            break;
                        }
                        i7 = i3 + 1;
                        bArr[i3] = (byte) c;
                    }
                }
                if (c < 2048) {
                    int i11 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i3 = i11 + 1;
                    bArr[i11] = (byte) ((c & '?') | 128);
                    r9 = i6;
                } else if (c < 55296 || c > 57343) {
                    int i12 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 12) | Opcodes.SHL_INT_LIT8);
                    int i13 = i12 + 1;
                    bArr[i12] = (byte) (((c >> 6) & 63) | 128);
                    bArr[i13] = (byte) ((c & '?') | 128);
                    r9 = i6;
                    i3 = i13 + 1;
                } else {
                    if (c > 56319) {
                        this.f15865g = i3;
                        m25633c(c);
                    }
                    this.f15866o = c;
                    if (i6 >= i5) {
                        break;
                    }
                    r9 = i6 + 1;
                    int b = m25632b(cArr[i6]);
                    if (b > 1114111) {
                        this.f15865g = i3;
                        m25633c(b);
                    }
                    int i14 = i3 + 1;
                    bArr[i3] = (byte) ((b >> 18) | 240);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((b >> 12) & 63) | 128);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((b >> 6) & 63) | 128);
                    i3 = i16 + 1;
                    bArr[i16] = (byte) ((b & 63) | 128);
                }
            }
            this.f15865g = i3;
        } else if (i2 == 1) {
            write((int) cArr[i]);
        }
    }

    public void write(int i) throws IOException {
        int i2;
        if (this.f15866o > 0) {
            i = m25632b(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                m25633c(i);
            }
            this.f15866o = i;
            return;
        }
        int i3 = this.f15865g;
        if (i3 >= this.f15864f) {
            this.f15862c.write(this.f15863d, 0, i3);
            this.f15865g = 0;
        }
        if (i < 128) {
            byte[] bArr = this.f15863d;
            int i4 = this.f15865g;
            this.f15865g = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.f15865g;
        if (i < 2048) {
            byte[] bArr2 = this.f15863d;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i6 + 1;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.f15863d;
            int i7 = i5 + 1;
            bArr3[i5] = (byte) ((i >> 12) | Opcodes.SHL_INT_LIT8);
            int i8 = i7 + 1;
            bArr3[i7] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i8] = (byte) ((i & 63) | 128);
            i2 = i8 + 1;
        } else {
            if (i > 1114111) {
                m25633c(i);
            }
            byte[] bArr4 = this.f15863d;
            int i9 = i5 + 1;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            int i10 = i9 + 1;
            bArr4[i9] = (byte) (((i >> 12) & 63) | 128);
            int i11 = i10 + 1;
            bArr4[i10] = (byte) (((i >> 6) & 63) | 128);
            i2 = i11 + 1;
            bArr4[i11] = (byte) ((i & 63) | 128);
        }
        this.f15865g = i2;
    }

    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    public void write(String str, int i, int i2) throws IOException {
        if (i2 >= 2) {
            if (this.f15866o > 0) {
                i2--;
                write(m25632b(str.charAt(i)));
                i++;
            }
            int i3 = this.f15865g;
            byte[] bArr = this.f15863d;
            int i4 = this.f15864f;
            int i5 = i2 + r9;
            while (r9 < i5) {
                if (i3 >= i4) {
                    this.f15862c.write(bArr, 0, i3);
                    i3 = 0;
                }
                int i6 = r9 + 1;
                char charAt = str.charAt(r9);
                if (charAt < 128) {
                    int i7 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    int i8 = i5 - i6;
                    int i9 = i4 - i7;
                    if (i8 > i9) {
                        i8 = i9;
                    }
                    int i10 = i8 + i6;
                    while (true) {
                        r9 = i6;
                        i3 = i7;
                        if (r9 >= i10) {
                            continue;
                            break;
                        }
                        i6 = r9 + 1;
                        charAt = str.charAt(r9);
                        if (charAt >= 128) {
                            break;
                        }
                        i7 = i3 + 1;
                        bArr[i3] = (byte) charAt;
                    }
                }
                if (charAt < 2048) {
                    int i11 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 6) | 192);
                    i3 = i11 + 1;
                    bArr[i11] = (byte) ((charAt & '?') | 128);
                    r9 = i6;
                } else if (charAt < 55296 || charAt > 57343) {
                    int i12 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 12) | Opcodes.SHL_INT_LIT8);
                    int i13 = i12 + 1;
                    bArr[i12] = (byte) (((charAt >> 6) & 63) | 128);
                    bArr[i13] = (byte) ((charAt & '?') | 128);
                    r9 = i6;
                    i3 = i13 + 1;
                } else {
                    if (charAt > 56319) {
                        this.f15865g = i3;
                        m25633c(charAt);
                    }
                    this.f15866o = charAt;
                    if (i6 >= i5) {
                        break;
                    }
                    r9 = i6 + 1;
                    int b = m25632b(str.charAt(i6));
                    if (b > 1114111) {
                        this.f15865g = i3;
                        m25633c(b);
                    }
                    int i14 = i3 + 1;
                    bArr[i3] = (byte) ((b >> 18) | 240);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((b >> 12) & 63) | 128);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((b >> 6) & 63) | 128);
                    i3 = i16 + 1;
                    bArr[i16] = (byte) ((b & 63) | 128);
                }
            }
            this.f15865g = i3;
        } else if (i2 == 1) {
            write((int) str.charAt(i));
        }
    }
}
