package p226cd;

import androidx.core.location.LocationRequestCompat;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p244dd.C12012a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020\u0014H\u0016J\b\u0010(\u001a\u00020\u0014H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\rH\u0016J \u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000fH\u0016J\u0018\u00101\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0005H\u0016J\u0010\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u000fH\u0016J\u0018\u00104\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020\u0001H\u0016J\b\u00107\u001a\u000206H\u0016J\b\u00108\u001a\u00020\bH\u0016J\b\u00109\u001a\u00020\nH\u0016J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020\u001fH\u0016R\u001b\u0010A\u001a\u00020\u00028Ö\u0002X\u0004¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>¨\u0006F"}, mo71668d2 = {"Lcd/s;", "Lcd/d;", "Lcd/b;", "T", "sink", "", "byteCount", "m0", "", "x1", "Lja/u;", "W0", "request", "", "readByte", "Lcd/e;", "S1", "i1", "Lcd/o;", "options", "", "U1", "", "v1", "H0", "Ljava/nio/ByteBuffer;", "read", "Lcd/w;", "L0", "Ljava/nio/charset/Charset;", "charset", "", "L1", "F0", "limit", "i0", "", "readShort", "h", "readInt", "g", "j2", "skip", "b", "fromIndex", "toIndex", "c", "bytes", "a0", "e", "targetBytes", "o0", "f", "peek", "Ljava/io/InputStream;", "k2", "isOpen", "close", "Lcd/z;", "q", "toString", "getBuffer", "()Lcd/b;", "getBuffer$annotations", "()V", "buffer", "Lcd/y;", "source", "<init>", "(Lcd/y;)V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.s */
/* compiled from: RealBufferedSource.kt */
public final class C11204s implements C11186d {

    /* renamed from: a */
    public final C11212y f54137a;

    /* renamed from: c */
    public final C11179b f54138c = new C11179b();

    /* renamed from: d */
    public boolean f54139d;

    public C11204s(C11212y yVar) {
        C13706o.m87929f(yVar, "source");
        this.f54137a = yVar;
    }

    /* renamed from: F0 */
    public String mo62401F0() {
        return mo62437i0(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* renamed from: H0 */
    public byte[] mo62404H0(long j) {
        mo62420W0(j);
        return this.f54138c.mo62404H0(j);
    }

    /* renamed from: L0 */
    public long mo62408L0(C11210w wVar) {
        C13706o.m87929f(wVar, "sink");
        long j = 0;
        while (this.f54137a.mo62392m0(this.f54138c, 8192) != -1) {
            long e = this.f54138c.mo62428e();
            if (e > 0) {
                j += e;
                wVar.mo62384X(this.f54138c, e);
            }
        }
        if (this.f54138c.mo62399D() <= 0) {
            return j;
        }
        long D = j + this.f54138c.mo62399D();
        C11179b bVar = this.f54138c;
        wVar.mo62384X(bVar, bVar.mo62399D());
        return D;
    }

    /* renamed from: L1 */
    public String mo62409L1(Charset charset) {
        C13706o.m87929f(charset, "charset");
        this.f54138c.mo62396A1(this.f54137a);
        return this.f54138c.mo62409L1(charset);
    }

    /* renamed from: S1 */
    public C11188e mo62415S1() {
        this.f54138c.mo62396A1(this.f54137a);
        return this.f54138c.mo62415S1();
    }

    /* renamed from: T */
    public C11179b mo62416T() {
        return this.f54138c;
    }

    /* renamed from: U1 */
    public int mo62418U1(C11199o oVar) {
        C13706o.m87929f(oVar, "options");
        if (!this.f54139d) {
            while (true) {
                int d = C12012a.m82454d(this.f54138c, oVar, true);
                if (d == -2) {
                    if (this.f54137a.mo62392m0(this.f54138c, 8192) == -1) {
                        break;
                    }
                } else if (d != -1) {
                    this.f54138c.skip((long) oVar.mo62535f()[d].mo62485C());
                    return d;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: W0 */
    public void mo62420W0(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: a0 */
    public long mo62422a0(C11188e eVar) {
        C13706o.m87929f(eVar, "bytes");
        return mo62549e(eVar, 0);
    }

    /* renamed from: b */
    public long mo62547b(byte b) {
        return mo62548c(b, 0, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* renamed from: c */
    public long mo62548c(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f54139d) {
            if (0 > j || j > j2) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long o = this.f54138c.mo62443o(b, j, j2);
                    if (o != -1) {
                        return o;
                    }
                    long D = this.f54138c.mo62399D();
                    if (D >= j2 || this.f54137a.mo62392m0(this.f54138c, 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, D);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f54139d) {
            this.f54139d = true;
            this.f54137a.close();
            this.f54138c.mo62424b();
        }
    }

    /* renamed from: e */
    public long mo62549e(C11188e eVar, long j) {
        C13706o.m87929f(eVar, "bytes");
        if (!this.f54139d) {
            while (true) {
                long p = this.f54138c.mo62445p(eVar, j);
                if (p != -1) {
                    return p;
                }
                long D = this.f54138c.mo62399D();
                if (this.f54137a.mo62392m0(this.f54138c, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (D - ((long) eVar.mo62485C())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: f */
    public long mo62550f(C11188e eVar, long j) {
        C13706o.m87929f(eVar, "targetBytes");
        if (!this.f54139d) {
            while (true) {
                long r = this.f54138c.mo62447r(eVar, j);
                if (r != -1) {
                    return r;
                }
                long D = this.f54138c.mo62399D();
                if (this.f54137a.mo62392m0(this.f54138c, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, D);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: g */
    public int mo62551g() {
        mo62420W0(4);
        return this.f54138c.mo62459v();
    }

    public C11179b getBuffer() {
        return this.f54138c;
    }

    /* renamed from: h */
    public short mo62552h() {
        mo62420W0(2);
        return this.f54138c.mo62468x();
    }

    /* renamed from: i0 */
    public String mo62437i0(long j) {
        if (j >= 0) {
            long j2 = j == LocationRequestCompat.PASSIVE_INTERVAL ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long c = mo62548c(b, 0, j2);
            if (c != -1) {
                return C12012a.m82453c(this.f54138c, c);
            }
            if (j2 < LocationRequestCompat.PASSIVE_INTERVAL && request(j2) && this.f54138c.mo62435h(j2 - 1) == ((byte) 13) && request(1 + j2) && this.f54138c.mo62435h(j2) == b) {
                return C12012a.m82453c(this.f54138c, j2);
            }
            C11179b bVar = new C11179b();
            C11179b bVar2 = this.f54138c;
            bVar2.mo62433g(bVar, 0, Math.min((long) 32, bVar2.mo62399D()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f54138c.mo62399D(), j) + " content=" + bVar.mo62415S1().mo62502m() + 8230);
        }
        throw new IllegalArgumentException(C13706o.m87936m("limit < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: i1 */
    public C11188e mo62438i1(long j) {
        mo62420W0(j);
        return this.f54138c.mo62438i1(j);
    }

    public boolean isOpen() {
        return !this.f54139d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: j2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo62441j2() {
        /*
            r5 = this;
            r0 = 1
            r5.mo62420W0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L_0x0059
            cd.b r2 = r5.f54138c
            long r3 = (long) r0
            byte r2 = r2.mo62435h(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0059
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            int r1 = kotlin.text.C15145b.m93519a(r1)
            int r1 = kotlin.text.C15145b.m93519a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = kotlin.jvm.internal.C13706o.m87936m(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x0059:
            cd.b r0 = r5.f54138c
            long r0 = r0.mo62441j2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p226cd.C11204s.mo62441j2():long");
    }

    /* renamed from: k2 */
    public InputStream mo62442k2() {
        return new C11205a(this);
    }

    /* renamed from: m0 */
    public long mo62392m0(C11179b bVar, long j) {
        C13706o.m87929f(bVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C13706o.m87936m("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (!(true ^ this.f54139d)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f54138c.mo62399D() == 0 && this.f54137a.mo62392m0(this.f54138c, 8192) == -1) {
            return -1;
        } else {
            return this.f54138c.mo62392m0(bVar, Math.min(j, this.f54138c.mo62399D()));
        }
    }

    /* renamed from: o0 */
    public long mo62444o0(C11188e eVar) {
        C13706o.m87929f(eVar, "targetBytes");
        return mo62550f(eVar, 0);
    }

    public C11186d peek() {
        return C11196l.m75163b(new C11202q(this));
    }

    /* renamed from: q */
    public C11213z mo62393q() {
        return this.f54137a.mo62393q();
    }

    public int read(ByteBuffer byteBuffer) {
        C13706o.m87929f(byteBuffer, "sink");
        if (this.f54138c.mo62399D() == 0 && this.f54137a.mo62392m0(this.f54138c, 8192) == -1) {
            return -1;
        }
        return this.f54138c.read(byteBuffer);
    }

    public byte readByte() {
        mo62420W0(1);
        return this.f54138c.readByte();
    }

    public int readInt() {
        mo62420W0(4);
        return this.f54138c.readInt();
    }

    public short readShort() {
        mo62420W0(2);
        return this.f54138c.readShort();
    }

    public boolean request(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C13706o.m87936m("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (!this.f54139d) {
            while (this.f54138c.mo62399D() < j) {
                if (this.f54137a.mo62392m0(this.f54138c, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public void skip(long j) {
        if (!this.f54139d) {
            while (j > 0) {
                if (this.f54138c.mo62399D() == 0 && this.f54137a.mo62392m0(this.f54138c, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f54138c.mo62399D());
                this.f54138c.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f54137a + ')';
    }

    /* renamed from: v1 */
    public byte[] mo62461v1() {
        this.f54138c.mo62396A1(this.f54137a);
        return this.f54138c.mo62461v1();
    }

    /* renamed from: x1 */
    public boolean mo62469x1() {
        if (!(!this.f54139d)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f54138c.mo62469x1() || this.f54137a.mo62392m0(this.f54138c, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, mo71668d2 = {"cd/s$a", "Ljava/io/InputStream;", "", "read", "", "data", "offset", "byteCount", "available", "Lja/u;", "close", "", "toString", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.s$a */
    /* compiled from: RealBufferedSource.kt */
    public static final class C11205a extends InputStream {

        /* renamed from: a */
        final /* synthetic */ C11204s f54140a;

        C11205a(C11204s sVar) {
            this.f54140a = sVar;
        }

        public int available() {
            C11204s sVar = this.f54140a;
            if (!sVar.f54139d) {
                return (int) Math.min(sVar.f54138c.mo62399D(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f54140a.close();
        }

        public int read() {
            C11204s sVar = this.f54140a;
            if (!sVar.f54139d) {
                if (sVar.f54138c.mo62399D() == 0) {
                    C11204s sVar2 = this.f54140a;
                    if (sVar2.f54137a.mo62392m0(sVar2.f54138c, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f54140a.f54138c.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f54140a + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C13706o.m87929f(bArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            if (!this.f54140a.f54139d) {
                C11187d0.m75097b((long) bArr.length, (long) i, (long) i2);
                if (this.f54140a.f54138c.mo62399D() == 0) {
                    C11204s sVar = this.f54140a;
                    if (sVar.f54137a.mo62392m0(sVar.f54138c, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f54140a.f54138c.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
