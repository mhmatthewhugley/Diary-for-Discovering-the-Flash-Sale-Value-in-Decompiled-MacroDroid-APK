package p438y7;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: y7.j */
/* compiled from: IMAPFolder */
class C16962j extends OutputStream {

    /* renamed from: a */
    private int f68334a = 0;

    /* renamed from: c */
    private byte[] f68335c = new byte[8192];

    /* renamed from: d */
    private int f68336d;

    public C16962j(int i) {
        this.f68336d = i;
    }

    /* renamed from: b */
    public byte[] mo80193b() {
        return this.f68335c;
    }

    /* renamed from: c */
    public int mo80194c() {
        return this.f68334a;
    }

    public void write(int i) {
        int i2 = this.f68334a;
        int i3 = i2 + 1;
        byte[] bArr = this.f68335c;
        if (bArr != null) {
            int i4 = this.f68336d;
            if (i3 > i4 && i4 >= 0) {
                this.f68335c = null;
            } else if (i3 > bArr.length) {
                byte[] bArr2 = new byte[Math.max(bArr.length << 1, i3)];
                System.arraycopy(this.f68335c, 0, bArr2, 0, this.f68334a);
                this.f68335c = bArr2;
                bArr2[this.f68334a] = (byte) i;
            } else {
                bArr[i2] = (byte) i;
            }
        }
        this.f68334a = i3;
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 != 0) {
            int i4 = this.f68334a;
            int i5 = i4 + i2;
            byte[] bArr2 = this.f68335c;
            if (bArr2 != null) {
                int i6 = this.f68336d;
                if (i5 > i6 && i6 >= 0) {
                    this.f68335c = null;
                } else if (i5 > bArr2.length) {
                    byte[] bArr3 = new byte[Math.max(bArr2.length << 1, i5)];
                    System.arraycopy(this.f68335c, 0, bArr3, 0, this.f68334a);
                    this.f68335c = bArr3;
                    System.arraycopy(bArr, i, bArr3, this.f68334a, i2);
                } else {
                    System.arraycopy(bArr, i, bArr2, i4, i2);
                }
            }
            this.f68334a = i5;
        }
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
