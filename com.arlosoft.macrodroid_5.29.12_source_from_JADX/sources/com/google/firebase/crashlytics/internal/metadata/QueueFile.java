package com.google.firebase.crashlytics.internal.metadata;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

class QueueFile implements Closeable {

    /* renamed from: p */
    private static final Logger f5050p = Logger.getLogger(QueueFile.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RandomAccessFile f5051a;

    /* renamed from: c */
    int f5052c;

    /* renamed from: d */
    private int f5053d;

    /* renamed from: f */
    private Element f5054f;

    /* renamed from: g */
    private Element f5055g;

    /* renamed from: o */
    private final byte[] f5056o = new byte[16];

    static class Element {

        /* renamed from: c */
        static final Element f5060c = new Element(0, 0);

        /* renamed from: a */
        final int f5061a;

        /* renamed from: b */
        final int f5062b;

        Element(int i, int i2) {
            this.f5061a = i;
            this.f5062b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f5061a + ", length = " + this.f5062b + "]";
        }
    }

    private final class ElementInputStream extends InputStream {

        /* renamed from: a */
        private int f5063a;

        /* renamed from: c */
        private int f5064c;

        public int read(byte[] bArr, int i, int i2) throws IOException {
            Object unused = QueueFile.m6863r(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f5064c;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            QueueFile.this.m6869z(this.f5063a, bArr, i, i2);
            this.f5063a = QueueFile.this.m6853D(this.f5063a + i2);
            this.f5064c -= i2;
            return i2;
        }

        private ElementInputStream(Element element) {
            this.f5063a = QueueFile.this.m6853D(element.f5061a + 4);
            this.f5064c = element.f5062b;
        }

        public int read() throws IOException {
            if (this.f5064c == 0) {
                return -1;
            }
            QueueFile.this.f5051a.seek((long) this.f5063a);
            int read = QueueFile.this.f5051a.read();
            this.f5063a = QueueFile.this.m6853D(this.f5063a + 1);
            this.f5064c--;
            return read;
        }
    }

    public interface ElementReader {
        /* renamed from: a */
        void mo23102a(InputStream inputStream, int i) throws IOException;
    }

    public QueueFile(File file) throws IOException {
        if (!file.exists()) {
            m6862o(file);
        }
        this.f5051a = m6864s(file);
        m6866v();
    }

    /* renamed from: A */
    private void m6851A(int i, byte[] bArr, int i2, int i3) throws IOException {
        int D = m6853D(i);
        int i4 = D + i3;
        int i5 = this.f5052c;
        if (i4 <= i5) {
            this.f5051a.seek((long) D);
            this.f5051a.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - D;
        this.f5051a.seek((long) D);
        this.f5051a.write(bArr, i2, i6);
        this.f5051a.seek(16);
        this.f5051a.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: B */
    private void m6852B(int i) throws IOException {
        this.f5051a.setLength((long) i);
        this.f5051a.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public int m6853D(int i) {
        int i2 = this.f5052c;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: E */
    private void m6854E(int i, int i2, int i3, int i4) throws IOException {
        m6856G(this.f5056o, i, i2, i3, i4);
        this.f5051a.seek(0);
        this.f5051a.write(this.f5056o);
    }

    /* renamed from: F */
    private static void m6855F(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: G */
    private static void m6856G(byte[] bArr, int... iArr) {
        int i = 0;
        for (int F : iArr) {
            m6855F(bArr, i, F);
            i += 4;
        }
    }

    /* renamed from: j */
    private void m6861j(int i) throws IOException {
        int i2 = i + 4;
        int x = m6868x();
        if (x < i2) {
            int i3 = this.f5052c;
            do {
                x += i3;
                i3 <<= 1;
            } while (x < i2);
            m6852B(i3);
            Element element = this.f5055g;
            int D = m6853D(element.f5061a + 4 + element.f5062b);
            if (D < this.f5054f.f5061a) {
                FileChannel channel = this.f5051a.getChannel();
                channel.position((long) this.f5052c);
                long j = (long) (D - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f5055g.f5061a;
            int i5 = this.f5054f.f5061a;
            if (i4 < i5) {
                int i6 = (this.f5052c + i4) - 16;
                m6854E(i3, this.f5053d, i5, i6);
                this.f5055g = new Element(i6, this.f5055g.f5062b);
            } else {
                m6854E(i3, this.f5053d, i5, i4);
            }
            this.f5052c = i3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o */
    private static void m6862o(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile s = m6864s(file2);
        try {
            s.setLength(4096);
            s.seek(0);
            byte[] bArr = new byte[16];
            m6856G(bArr, 4096, 0, 0, 0);
            s.write(bArr);
            s.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            s.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static <T> T m6863r(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: s */
    private static RandomAccessFile m6864s(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: u */
    private Element m6865u(int i) throws IOException {
        if (i == 0) {
            return Element.f5060c;
        }
        this.f5051a.seek((long) i);
        return new Element(i, this.f5051a.readInt());
    }

    /* renamed from: v */
    private void m6866v() throws IOException {
        this.f5051a.seek(0);
        this.f5051a.readFully(this.f5056o);
        int w = m6867w(this.f5056o, 0);
        this.f5052c = w;
        if (((long) w) <= this.f5051a.length()) {
            this.f5053d = m6867w(this.f5056o, 4);
            int w2 = m6867w(this.f5056o, 8);
            int w3 = m6867w(this.f5056o, 12);
            this.f5054f = m6865u(w2);
            this.f5055g = m6865u(w3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f5052c + ", Actual length: " + this.f5051a.length());
    }

    /* renamed from: w */
    private static int m6867w(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: x */
    private int m6868x() {
        return this.f5052c - mo23093C();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m6869z(int i, byte[] bArr, int i2, int i3) throws IOException {
        int D = m6853D(i);
        int i4 = D + i3;
        int i5 = this.f5052c;
        if (i4 <= i5) {
            this.f5051a.seek((long) D);
            this.f5051a.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - D;
        this.f5051a.seek((long) D);
        this.f5051a.readFully(bArr, i2, i6);
        this.f5051a.seek(16);
        this.f5051a.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: C */
    public int mo23093C() {
        if (this.f5053d == 0) {
            return 16;
        }
        Element element = this.f5055g;
        int i = element.f5061a;
        int i2 = this.f5054f.f5061a;
        if (i >= i2) {
            return (i - i2) + 4 + element.f5062b + 16;
        }
        return (((i + 4) + element.f5062b) + this.f5052c) - i2;
    }

    public synchronized void close() throws IOException {
        this.f5051a.close();
    }

    /* renamed from: g */
    public void mo23095g(byte[] bArr) throws IOException {
        mo23096h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public synchronized void mo23096h(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m6863r(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m6861j(i2);
        boolean p = mo23099p();
        if (p) {
            i3 = 16;
        } else {
            Element element = this.f5055g;
            i3 = m6853D(element.f5061a + 4 + element.f5062b);
        }
        Element element2 = new Element(i3, i2);
        m6855F(this.f5056o, 0, i2);
        m6851A(element2.f5061a, this.f5056o, 0, 4);
        m6851A(element2.f5061a + 4, bArr, i, i2);
        m6854E(this.f5052c, this.f5053d + 1, p ? element2.f5061a : this.f5054f.f5061a, element2.f5061a);
        this.f5055g = element2;
        this.f5053d++;
        if (p) {
            this.f5054f = element2;
        }
    }

    /* renamed from: i */
    public synchronized void mo23097i() throws IOException {
        m6854E(4096, 0, 0, 0);
        this.f5053d = 0;
        Element element = Element.f5060c;
        this.f5054f = element;
        this.f5055g = element;
        if (this.f5052c > 4096) {
            m6852B(4096);
        }
        this.f5052c = 4096;
    }

    /* renamed from: m */
    public synchronized void mo23098m(ElementReader elementReader) throws IOException {
        int i = this.f5054f.f5061a;
        for (int i2 = 0; i2 < this.f5053d; i2++) {
            Element u = m6865u(i);
            elementReader.mo23102a(new ElementInputStream(u), u.f5062b);
            i = m6853D(u.f5061a + 4 + u.f5062b);
        }
    }

    /* renamed from: p */
    public synchronized boolean mo23099p() {
        return this.f5053d == 0;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f5052c);
        sb.append(", size=");
        sb.append(this.f5053d);
        sb.append(", first=");
        sb.append(this.f5054f);
        sb.append(", last=");
        sb.append(this.f5055g);
        sb.append(", element lengths=[");
        try {
            mo23098m(new ElementReader() {

                /* renamed from: a */
                boolean f5057a = true;

                /* renamed from: a */
                public void mo23102a(InputStream inputStream, int i) throws IOException {
                    if (this.f5057a) {
                        this.f5057a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            f5050p.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: y */
    public synchronized void mo23101y() throws IOException {
        if (mo23099p()) {
            throw new NoSuchElementException();
        } else if (this.f5053d == 1) {
            mo23097i();
        } else {
            Element element = this.f5054f;
            int D = m6853D(element.f5061a + 4 + element.f5062b);
            m6869z(D, this.f5056o, 0, 4);
            int w = m6867w(this.f5056o, 0);
            m6854E(this.f5052c, this.f5053d - 1, D, this.f5055g.f5061a);
            this.f5053d--;
            this.f5054f = new Element(D, w);
        }
    }
}
