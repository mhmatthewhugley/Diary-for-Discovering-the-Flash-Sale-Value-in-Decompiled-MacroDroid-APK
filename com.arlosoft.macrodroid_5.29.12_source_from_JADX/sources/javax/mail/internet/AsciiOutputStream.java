package javax.mail.internet;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: MimeUtility */
class AsciiOutputStream extends OutputStream {
    private int ascii = 0;
    private boolean badEOL = false;
    private boolean breakOnNonAscii;
    private boolean checkEOL = false;
    private int lastb = 0;
    private int linelen = 0;
    private boolean longLine = false;
    private int non_ascii = 0;
    private int ret = 0;

    public AsciiOutputStream(boolean z, boolean z2) {
        boolean z3 = false;
        this.breakOnNonAscii = z;
        if (z2 && z) {
            z3 = true;
        }
        this.checkEOL = z3;
    }

    private final void check(int i) throws IOException {
        int i2;
        int i3 = i & 255;
        if (this.checkEOL && (((i2 = this.lastb) == 13 && i3 != 10) || (i2 != 13 && i3 == 10))) {
            this.badEOL = true;
        }
        if (i3 == 13 || i3 == 10) {
            this.linelen = 0;
        } else {
            int i4 = this.linelen + 1;
            this.linelen = i4;
            if (i4 > 998) {
                this.longLine = true;
            }
        }
        if (MimeUtility.nonascii(i3)) {
            this.non_ascii++;
            if (this.breakOnNonAscii) {
                this.ret = 3;
                throw new EOFException();
            }
        } else {
            this.ascii++;
        }
        this.lastb = i3;
    }

    public int getAscii() {
        int i = this.ret;
        if (i != 0) {
            return i;
        }
        if (this.badEOL) {
            return 3;
        }
        int i2 = this.non_ascii;
        if (i2 == 0) {
            if (this.longLine) {
                return 2;
            }
            return 1;
        } else if (this.ascii > i2) {
            return 2;
        } else {
            return 3;
        }
    }

    public void write(int i) throws IOException {
        check(i);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        while (i < i3) {
            check(bArr[i]);
            i++;
        }
    }
}
