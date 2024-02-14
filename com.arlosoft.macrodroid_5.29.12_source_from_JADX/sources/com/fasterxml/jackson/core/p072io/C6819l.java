package com.fasterxml.jackson.core.p072io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.io.l */
/* compiled from: UTF32Reader */
public class C6819l extends C6808a {

    /* renamed from: A */
    protected int f15856A = 0;

    /* renamed from: B */
    protected final boolean f15857B;

    /* renamed from: p */
    protected final boolean f15858p;

    /* renamed from: s */
    protected char f15859s = 0;

    /* renamed from: z */
    protected int f15860z = 0;

    public C6819l(C6811d dVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        super(dVar, inputStream, bArr, i, i2);
        boolean z2 = false;
        this.f15858p = z;
        this.f15857B = inputStream != null ? true : z2;
    }

    /* renamed from: f */
    private boolean m25629f(int i) throws IOException {
        int i2;
        this.f15856A += this.f15810g - i;
        if (i > 0) {
            if (this.f15809f > 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    byte[] bArr = this.f15808d;
                    bArr[i3] = bArr[this.f15809f + i3];
                }
                this.f15809f = 0;
            }
            this.f15810g = i;
        } else {
            this.f15809f = 0;
            InputStream inputStream = this.f15807c;
            int read = inputStream == null ? -1 : inputStream.read(this.f15808d);
            if (read < 1) {
                this.f15810g = 0;
                if (read < 0) {
                    if (this.f15857B) {
                        mo33895b();
                    }
                    return false;
                }
                mo33898e();
            }
            this.f15810g = read;
        }
        while (true) {
            int i4 = this.f15810g;
            if (i4 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f15807c;
            if (inputStream2 == null) {
                i2 = -1;
            } else {
                byte[] bArr2 = this.f15808d;
                i2 = inputStream2.read(bArr2, i4, bArr2.length - i4);
            }
            if (i2 < 1) {
                if (i2 < 0) {
                    if (this.f15857B) {
                        mo33895b();
                    }
                    m25631h(this.f15810g, 4);
                }
                mo33898e();
            }
            this.f15810g += i2;
        }
    }

    /* renamed from: g */
    private void m25630g(int i, int i2, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(this.f15860z + i2);
        sb.append(", byte #");
        sb.append((this.f15856A + this.f15809f) - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    /* renamed from: h */
    private void m25631h(int i, int i2) throws IOException {
        int i3 = this.f15860z;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + i3 + ", byte #" + (this.f15856A + i) + ")");
    }

    public /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    public /* bridge */ /* synthetic */ int read() throws IOException {
        return super.read();
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        byte b;
        int i4;
        int i5;
        if (this.f15808d == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            mo33896c(cArr, i, i2);
        }
        int i6 = i2 + i;
        char c = this.f15859s;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.f15859s = 0;
        } else {
            int i7 = this.f15810g - this.f15809f;
            if (i7 < 4 && !m25629f(i7)) {
                return -1;
            }
            i3 = i;
        }
        while (true) {
            if (i3 >= i6) {
                break;
            }
            int i8 = this.f15809f;
            if (this.f15858p) {
                byte[] bArr = this.f15808d;
                b = (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
                i4 = bArr[i8 + 3] & 255;
            } else {
                byte[] bArr2 = this.f15808d;
                b = (bArr2[i8] & 255) | ((bArr2[i8 + 1] & 255) << 8) | ((bArr2[i8 + 2] & 255) << 16);
                i4 = bArr2[i8 + 3] << 24;
            }
            byte b2 = i4 | b;
            this.f15809f = i8 + 4;
            if (b2 > 65535) {
                if (b2 > 1114111) {
                    m25630g(b2, i3 - i, "(above " + Integer.toHexString(1114111) + ") ");
                }
                int i9 = b2 - 65536;
                i5 = i3 + 1;
                cArr[i3] = (char) ((i9 >> 10) + 55296);
                b2 = (i9 & 1023) | 56320;
                if (i5 >= i6) {
                    this.f15859s = (char) b2;
                    break;
                }
                i3 = i5;
            }
            i5 = i3 + 1;
            cArr[i3] = (char) b2;
            if (this.f15809f >= this.f15810g) {
                break;
            }
            i3 = i5;
        }
        i3 = i5;
        int i10 = i3 - i;
        this.f15860z += i10;
        return i10;
    }
}
