package p226cd;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016¨\u0006\u0019"}, mo71668d2 = {"Lcd/i;", "Lcd/y;", "Lja/u;", "c", "e", "Lcd/b;", "buffer", "", "offset", "byteCount", "f", "", "name", "", "expected", "actual", "b", "sink", "m0", "Lcd/z;", "q", "close", "source", "<init>", "(Lcd/y;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.i */
/* compiled from: GzipSource.kt */
public final class C11193i implements C11212y {

    /* renamed from: a */
    private byte f54111a;

    /* renamed from: c */
    private final C11204s f54112c;

    /* renamed from: d */
    private final Inflater f54113d;

    /* renamed from: f */
    private final C11194j f54114f;

    /* renamed from: g */
    private final CRC32 f54115g = new CRC32();

    public C11193i(C11212y yVar) {
        C13706o.m87929f(yVar, "source");
        C11204s sVar = new C11204s(yVar);
        this.f54112c = sVar;
        Inflater inflater = new Inflater(true);
        this.f54113d = inflater;
        this.f54114f = new C11194j(sVar, inflater);
    }

    /* renamed from: b */
    private final void m75149b(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C13706o.m87928e(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: c */
    private final void m75150c() throws IOException {
        this.f54112c.mo62420W0(10);
        byte h = this.f54112c.f54138c.mo62435h(3);
        boolean z = true;
        boolean z2 = ((h >> 1) & 1) == 1;
        if (z2) {
            m75152f(this.f54112c.f54138c, 0, 10);
        }
        m75149b("ID1ID2", 8075, this.f54112c.readShort());
        this.f54112c.skip(8);
        if (((h >> 2) & 1) == 1) {
            this.f54112c.mo62420W0(2);
            if (z2) {
                m75152f(this.f54112c.f54138c, 0, 2);
            }
            long x = (long) this.f54112c.f54138c.mo62468x();
            this.f54112c.mo62420W0(x);
            if (z2) {
                m75152f(this.f54112c.f54138c, 0, x);
            }
            this.f54112c.skip(x);
        }
        if (((h >> 3) & 1) == 1) {
            long b = this.f54112c.mo62547b((byte) 0);
            if (b != -1) {
                if (z2) {
                    m75152f(this.f54112c.f54138c, 0, b + 1);
                }
                this.f54112c.skip(b + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((h >> 4) & 1) != 1) {
            z = false;
        }
        if (z) {
            long b2 = this.f54112c.mo62547b((byte) 0);
            if (b2 != -1) {
                if (z2) {
                    m75152f(this.f54112c.f54138c, 0, b2 + 1);
                }
                this.f54112c.skip(b2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            m75149b("FHCRC", this.f54112c.mo62552h(), (short) ((int) this.f54115g.getValue()));
            this.f54115g.reset();
        }
    }

    /* renamed from: e */
    private final void m75151e() throws IOException {
        m75149b("CRC", this.f54112c.mo62551g(), (int) this.f54115g.getValue());
        m75149b("ISIZE", this.f54112c.mo62551g(), (int) this.f54113d.getBytesWritten());
    }

    /* renamed from: f */
    private final void m75152f(C11179b bVar, long j, long j2) {
        C11206t tVar = bVar.f54090a;
        C13706o.m87926c(tVar);
        while (true) {
            int i = tVar.f54144c;
            int i2 = tVar.f54143b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            tVar = tVar.f54147f;
            C13706o.m87926c(tVar);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) tVar.f54143b) + j);
            int min = (int) Math.min((long) (tVar.f54144c - i3), j2);
            this.f54115g.update(tVar.f54142a, i3, min);
            j2 -= (long) min;
            tVar = tVar.f54147f;
            C13706o.m87926c(tVar);
            j = 0;
        }
    }

    public void close() throws IOException {
        this.f54114f.close();
    }

    /* renamed from: m0 */
    public long mo62392m0(C11179b bVar, long j) throws IOException {
        C13706o.m87929f(bVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C13706o.m87936m("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f54111a == 0) {
                m75150c();
                this.f54111a = 1;
            }
            if (this.f54111a == 1) {
                long D = bVar.mo62399D();
                long m0 = this.f54114f.mo62392m0(bVar, j);
                if (m0 != -1) {
                    m75152f(bVar, D, m0);
                    return m0;
                }
                this.f54111a = 2;
            }
            if (this.f54111a == 2) {
                m75151e();
                this.f54111a = 3;
                if (!this.f54112c.mo62469x1()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: q */
    public C11213z mo62393q() {
        return this.f54112c.mo62393q();
    }
}
