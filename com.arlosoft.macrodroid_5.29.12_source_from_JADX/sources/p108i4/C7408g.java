package p108i4;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i4.g */
/* compiled from: ExifOrientationStream */
public final class C7408g extends FilterInputStream {

    /* renamed from: d */
    private static final byte[] f18107d;

    /* renamed from: f */
    private static final int f18108f;

    /* renamed from: g */
    private static final int f18109g;

    /* renamed from: a */
    private final byte f18110a;

    /* renamed from: c */
    private int f18111c;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, Framer.EXIT_FRAME_PREFIX, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f18107d = bArr;
        int length = bArr.length;
        f18108f = length;
        f18109g = length + 2;
    }

    public C7408g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f18110a = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f18111c;
        if (i3 < 2 || i3 > (i2 = f18109g)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f18110a;
        } else {
            i = f18107d[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f18111c++;
        }
        return i;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f18111c = (int) (((long) this.f18111c) + skip);
        }
        return skip;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f18111c;
        int i5 = f18109g;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f18110a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f18107d, this.f18111c - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f18111c += i3;
        }
        return i3;
    }
}
