package p226cd;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import com.android.p023dx.p026io.Opcodes;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;
import org.apache.commons.p353io.IOUtils;
import p244dd.C12012a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001}B\u0007¢\u0006\u0004\b{\u0010|J\b\u0010\u0005\u001a\u00020\u0000H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u00100\u001a\u00020+2\u0006\u0010/\u001a\u00020.H\u0016J\u0018\u00101\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010/\u001a\u00020.H\u0016J\b\u00102\u001a\u00020+H\u0016J\u0010\u00104\u001a\u00020+2\u0006\u00103\u001a\u00020\nH\u0016J\b\u00105\u001a\u00020\u001dH\u0016J\b\u00107\u001a\u000206H\u0016J\u0010\u00108\u001a\u0002062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u00109\u001a\u00020\f2\u0006\u0010)\u001a\u000206H\u0016J \u0010:\u001a\u00020\u001d2\u0006\u0010)\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001dH\u0016J\u0010\u0010:\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020;H\u0016J\u0006\u0010<\u001a\u00020\fJ\u0010\u0010=\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\"H\u0016J\u0010\u0010A\u001a\u00020\u00002\u0006\u0010@\u001a\u00020+H\u0016J \u0010D\u001a\u00020\u00002\u0006\u0010@\u001a\u00020+2\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001dH\u0016J\u0010\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u001dH\u0016J\u0018\u0010G\u001a\u00020\u00002\u0006\u0010@\u001a\u00020+2\u0006\u0010/\u001a\u00020.H\u0016J(\u0010H\u001a\u00020\u00002\u0006\u0010@\u001a\u00020+2\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.H\u0016J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u000206H\u0016J \u0010K\u001a\u00020\u00002\u0006\u0010I\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001dH\u0016J\u0010\u0010L\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020;H\u0016J\u0010\u0010N\u001a\u00020\n2\u0006\u0010I\u001a\u00020MH\u0016J\u0010\u0010O\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u001dH\u0016J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u001dH\u0016J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001dH\u0016J\u0010\u0010S\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\nH\u0016J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\nH\u0016J\u0017\u0010W\u001a\u00020V2\u0006\u0010U\u001a\u00020\u001dH\u0000¢\u0006\u0004\bW\u0010XJ\u0018\u0010Y\u001a\u00020\f2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010Z\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010]\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010[\u001a\u00020\n2\u0006\u0010\\\u001a\u00020\nH\u0016J\u0010\u0010_\u001a\u00020\n2\u0006\u0010^\u001a\u00020\"H\u0016J\u0018\u0010`\u001a\u00020\n2\u0006\u0010^\u001a\u00020\"2\u0006\u0010[\u001a\u00020\nH\u0016J\u0010\u0010b\u001a\u00020\n2\u0006\u0010a\u001a\u00020\"H\u0016J\u0018\u0010c\u001a\u00020\n2\u0006\u0010a\u001a\u00020\"2\u0006\u0010[\u001a\u00020\nH\u0016J\b\u0010d\u001a\u00020\fH\u0016J\b\u0010e\u001a\u00020\bH\u0016J\b\u0010f\u001a\u00020\fH\u0016J\b\u0010h\u001a\u00020gH\u0016J\u0013\u0010k\u001a\u00020\b2\b\u0010j\u001a\u0004\u0018\u00010iH\u0002J\b\u0010l\u001a\u00020\u001dH\u0016J\b\u0010m\u001a\u00020+H\u0016J\u0006\u0010n\u001a\u00020\u0000J\b\u0010o\u001a\u00020\u0000H\u0016J\u0006\u0010p\u001a\u00020\"J\u000e\u0010q\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\u001dR*\u0010s\u001a\u00020\n2\u0006\u0010r\u001a\u00020\n8G@@X\u000e¢\u0006\u0012\n\u0004\bs\u0010?\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006~"}, mo71668d2 = {"Lcd/b;", "Lcd/d;", "Lcd/c;", "", "Ljava/nio/channels/ByteChannel;", "T", "Ljava/io/OutputStream;", "s", "", "x1", "", "byteCount", "Lja/u;", "W0", "request", "peek", "Ljava/io/InputStream;", "k2", "out", "offset", "g", "e", "", "readByte", "pos", "h", "(J)B", "", "readShort", "", "readInt", "x", "v", "j2", "Lcd/e;", "S1", "i1", "Lcd/o;", "options", "U1", "Lcd/w;", "sink", "L0", "", "z", "A", "Ljava/nio/charset/Charset;", "charset", "L1", "y", "F0", "limit", "i0", "B", "", "v1", "H0", "u", "read", "Ljava/nio/ByteBuffer;", "b", "skip", "byteString", "J", "string", "e0", "beginIndex", "endIndex", "f0", "codePoint", "j0", "c0", "Z", "source", "K", "L", "write", "Lcd/y;", "A1", "M", "U", "i", "S", "N", "O", "minimumCapacity", "Lcd/t;", "H", "(I)Lcd/t;", "X", "m0", "fromIndex", "toIndex", "o", "bytes", "a0", "p", "targetBytes", "o0", "r", "flush", "isOpen", "close", "Lcd/z;", "q", "", "other", "equals", "hashCode", "toString", "f", "c", "E", "G", "<set-?>", "size", "D", "()J", "C", "(J)V", "getBuffer", "()Lcd/b;", "buffer", "<init>", "()V", "a", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.b */
/* compiled from: Buffer.kt */
public final class C11179b implements C11186d, C11184c, Cloneable, ByteChannel {

    /* renamed from: a */
    public C11206t f54090a;

    /* renamed from: c */
    private long f54091c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, mo71668d2 = {"Lcd/b$a;", "Ljava/io/Closeable;", "Lja/u;", "close", "Lcd/t;", "segment", "Lcd/t;", "getSegment$okio", "()Lcd/t;", "b", "(Lcd/t;)V", "<init>", "()V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.b$a */
    /* compiled from: Buffer.kt */
    public static final class C11180a implements Closeable {

        /* renamed from: a */
        public C11179b f54092a;

        /* renamed from: c */
        private C11206t f54093c;

        /* renamed from: d */
        public long f54094d = -1;

        /* renamed from: f */
        public byte[] f54095f;

        /* renamed from: g */
        public int f54096g = -1;

        /* renamed from: o */
        public int f54097o = -1;

        /* renamed from: b */
        public final void mo62472b(C11206t tVar) {
            this.f54093c = tVar;
        }

        public void close() {
            if (this.f54092a != null) {
                this.f54092a = null;
                mo62472b((C11206t) null);
                this.f54094d = -1;
                this.f54095f = null;
                this.f54096g = -1;
                this.f54097o = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo71668d2 = {"cd/b$c", "Ljava/io/OutputStream;", "", "b", "Lja/u;", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.b$c */
    /* compiled from: Buffer.kt */
    public static final class C11182c extends OutputStream {

        /* renamed from: a */
        final /* synthetic */ C11179b f54099a;

        C11182c(C11179b bVar) {
            this.f54099a = bVar;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f54099a + ".outputStream()";
        }

        public void write(int i) {
            this.f54099a.writeByte(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C13706o.m87929f(bArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            this.f54099a.write(bArr, i, i2);
        }
    }

    /* renamed from: A */
    public String mo62395A(long j) throws EOFException {
        return mo62470y(j, C15147d.f64349b);
    }

    /* renamed from: A1 */
    public long mo62396A1(C11212y yVar) throws IOException {
        C13706o.m87929f(yVar, "source");
        long j = 0;
        while (true) {
            long m0 = yVar.mo62392m0(this, 8192);
            if (m0 == -1) {
                return j;
            }
            j += m0;
        }
    }

    /* renamed from: B */
    public int mo62397B() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (mo62399D() != 0) {
            byte h = mo62435h(0);
            boolean z = false;
            if ((h & 128) == 0) {
                b2 = h & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((h & 224) == 192) {
                b2 = h & 31;
                i = 2;
                b = 128;
            } else if ((h & 240) == 224) {
                b2 = h & 15;
                i = 3;
                b = 2048;
            } else if ((h & 248) == 240) {
                b2 = h & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (mo62399D() >= j) {
                if (1 < i) {
                    int i2 = 1;
                    while (true) {
                        int i3 = i2 + 1;
                        long j2 = (long) i2;
                        byte h2 = mo62435h(j2);
                        if ((h2 & 192) == 128) {
                            b2 = (b2 << 6) | (h2 & 63);
                            if (i3 >= i) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            skip(j2);
                            return 65533;
                        }
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if (55296 <= b2 && b2 <= 57343) {
                    z = true;
                }
                if (!z && b2 >= b) {
                    return b2;
                }
                return 65533;
            }
            throw new EOFException("size < " + i + ": " + mo62399D() + " (to read code point prefixed 0x" + C11187d0.m75101f(h) + ')');
        }
        throw new EOFException();
    }

    /* renamed from: C */
    public final void mo62398C(long j) {
        this.f54091c = j;
    }

    /* renamed from: D */
    public final long mo62399D() {
        return this.f54091c;
    }

    /* renamed from: E */
    public final C11188e mo62400E() {
        if (mo62399D() <= 2147483647L) {
            return mo62402G((int) mo62399D());
        }
        throw new IllegalStateException(C13706o.m87936m("size > Int.MAX_VALUE: ", Long.valueOf(mo62399D())).toString());
    }

    /* renamed from: F0 */
    public String mo62401F0() throws EOFException {
        return mo62437i0(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* renamed from: G */
    public final C11188e mo62402G(int i) {
        if (i == 0) {
            return C11188e.f54105f;
        }
        C11187d0.m75097b(mo62399D(), 0, (long) i);
        C11206t tVar = this.f54090a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C13706o.m87926c(tVar);
            int i5 = tVar.f54144c;
            int i6 = tVar.f54143b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                tVar = tVar.f54147f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C11206t tVar2 = this.f54090a;
        int i7 = 0;
        while (i2 < i) {
            C13706o.m87926c(tVar2);
            bArr[i7] = tVar2.f54142a;
            i2 += tVar2.f54144c - tVar2.f54143b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = tVar2.f54143b;
            tVar2.f54145d = true;
            i7++;
            tVar2 = tVar2.f54147f;
        }
        return new C11209v(bArr, iArr);
    }

    /* renamed from: H */
    public final C11206t mo62403H(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C11206t tVar = this.f54090a;
            if (tVar == null) {
                C11206t c = C11208u.m75235c();
                this.f54090a = c;
                c.f54148g = c;
                c.f54147f = c;
                return c;
            }
            C13706o.m87926c(tVar);
            C11206t tVar2 = tVar.f54148g;
            C13706o.m87926c(tVar2);
            if (tVar2.f54144c + i > 8192 || !tVar2.f54146e) {
                return tVar2.mo62563c(C11208u.m75235c());
            }
            return tVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: H0 */
    public byte[] mo62404H0(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(C13706o.m87936m("byteCount: ", Long.valueOf(j)).toString());
        } else if (mo62399D() >= j) {
            byte[] bArr = new byte[((int) j)];
            mo62458u(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: J */
    public C11179b mo62419V(C11188e eVar) {
        C13706o.m87929f(eVar, "byteString");
        eVar.mo62490I(this, 0, eVar.mo62485C());
        return this;
    }

    /* renamed from: K */
    public C11179b write(byte[] bArr) {
        C13706o.m87929f(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    /* renamed from: L */
    public C11179b write(byte[] bArr, int i, int i2) {
        C13706o.m87929f(bArr, "source");
        long j = (long) i2;
        C11187d0.m75097b((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C11206t H = mo62403H(1);
            int min = Math.min(i3 - i, 8192 - H.f54144c);
            int i4 = i + min;
            byte[] unused = C13593l.m87558e(bArr, H.f54142a, H.f54144c, i, i4);
            H.f54144c += min;
            i = i4;
        }
        mo62398C(mo62399D() + j);
        return this;
    }

    /* renamed from: L0 */
    public long mo62408L0(C11210w wVar) throws IOException {
        C13706o.m87929f(wVar, "sink");
        long D = mo62399D();
        if (D > 0) {
            wVar.mo62384X(this, D);
        }
        return D;
    }

    /* renamed from: L1 */
    public String mo62409L1(Charset charset) {
        C13706o.m87929f(charset, "charset");
        return mo62470y(this.f54091c, charset);
    }

    /* renamed from: M */
    public C11179b writeByte(int i) {
        C11206t H = mo62403H(1);
        byte[] bArr = H.f54142a;
        int i2 = H.f54144c;
        H.f54144c = i2 + 1;
        bArr[i2] = (byte) i;
        mo62398C(mo62399D() + 1);
        return this;
    }

    /* renamed from: N */
    public C11179b mo62423a1(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo62455s0("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= WorkRequest.MIN_BACKOFF_MILLIS) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        C11206t H = mo62403H(i2);
        byte[] bArr = H.f54142a;
        int i3 = H.f54144c + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = C12012a.m82451a()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        H.f54144c += i2;
        mo62398C(mo62399D() + ((long) i2));
        return this;
    }

    /* renamed from: O */
    public C11179b mo62413R1(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C11206t H = mo62403H(i);
        byte[] bArr = H.f54142a;
        int i2 = H.f54144c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C12012a.m82451a()[(int) (15 & j)];
            j >>>= 4;
        }
        H.f54144c += i;
        mo62398C(mo62399D() + ((long) i));
        return this;
    }

    /* renamed from: S */
    public C11179b writeInt(int i) {
        C11206t H = mo62403H(4);
        byte[] bArr = H.f54142a;
        int i2 = H.f54144c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        H.f54144c = i5 + 1;
        mo62398C(mo62399D() + 4);
        return this;
    }

    /* renamed from: S1 */
    public C11188e mo62415S1() {
        return mo62438i1(mo62399D());
    }

    /* renamed from: T */
    public C11179b mo62416T() {
        return this;
    }

    /* renamed from: U */
    public C11179b writeShort(int i) {
        C11206t H = mo62403H(2);
        byte[] bArr = H.f54142a;
        int i2 = H.f54144c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        H.f54144c = i3 + 1;
        mo62398C(mo62399D() + 2);
        return this;
    }

    /* renamed from: U1 */
    public int mo62418U1(C11199o oVar) {
        C13706o.m87929f(oVar, "options");
        int e = C12012a.m82455e(this, oVar, false, 2, (Object) null);
        if (e == -1) {
            return -1;
        }
        skip((long) oVar.mo62535f()[e].mo62485C());
        return e;
    }

    /* renamed from: W0 */
    public void mo62420W0(long j) throws EOFException {
        if (this.f54091c < j) {
            throw new EOFException();
        }
    }

    /* renamed from: X */
    public void mo62384X(C11179b bVar, long j) {
        C11206t tVar;
        C13706o.m87929f(bVar, "source");
        if (bVar != this) {
            C11187d0.m75097b(bVar.mo62399D(), 0, j);
            while (j > 0) {
                C11206t tVar2 = bVar.f54090a;
                C13706o.m87926c(tVar2);
                int i = tVar2.f54144c;
                C11206t tVar3 = bVar.f54090a;
                C13706o.m87926c(tVar3);
                if (j < ((long) (i - tVar3.f54143b))) {
                    C11206t tVar4 = this.f54090a;
                    if (tVar4 != null) {
                        C13706o.m87926c(tVar4);
                        tVar = tVar4.f54148g;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null && tVar.f54146e) {
                        if ((((long) tVar.f54144c) + j) - ((long) (tVar.f54145d ? 0 : tVar.f54143b)) <= 8192) {
                            C11206t tVar5 = bVar.f54090a;
                            C13706o.m87926c(tVar5);
                            tVar5.mo62566f(tVar, (int) j);
                            bVar.mo62398C(bVar.mo62399D() - j);
                            mo62398C(mo62399D() + j);
                            return;
                        }
                    }
                    C11206t tVar6 = bVar.f54090a;
                    C13706o.m87926c(tVar6);
                    bVar.f54090a = tVar6.mo62565e((int) j);
                }
                C11206t tVar7 = bVar.f54090a;
                C13706o.m87926c(tVar7);
                long j2 = (long) (tVar7.f54144c - tVar7.f54143b);
                bVar.f54090a = tVar7.mo62562b();
                C11206t tVar8 = this.f54090a;
                if (tVar8 == null) {
                    this.f54090a = tVar7;
                    tVar7.f54148g = tVar7;
                    tVar7.f54147f = tVar7;
                } else {
                    C13706o.m87926c(tVar8);
                    C11206t tVar9 = tVar8.f54148g;
                    C13706o.m87926c(tVar9);
                    tVar9.mo62563c(tVar7).mo62561a();
                }
                bVar.mo62398C(bVar.mo62399D() - j2);
                mo62398C(mo62399D() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: Z */
    public C11179b mo62421Z(String str, int i, int i2, Charset charset) {
        C13706o.m87929f(str, TypedValues.Custom.S_STRING);
        C13706o.m87929f(charset, "charset");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (C13706o.m87924a(charset, C15147d.f64349b)) {
                    return mo62460v0(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = substring.getBytes(charset);
                    C13706o.m87928e(bytes, "(this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(C13706o.m87936m("beginIndex < 0: ", Integer.valueOf(i)).toString());
        }
    }

    /* renamed from: a0 */
    public long mo62422a0(C11188e eVar) throws IOException {
        C13706o.m87929f(eVar, "bytes");
        return mo62445p(eVar, 0);
    }

    /* renamed from: b */
    public final void mo62424b() {
        skip(mo62399D());
    }

    /* renamed from: c */
    public C11179b clone() {
        return mo62431f();
    }

    /* renamed from: c0 */
    public C11179b mo62426c0(String str, Charset charset) {
        C13706o.m87929f(str, TypedValues.Custom.S_STRING);
        C13706o.m87929f(charset, "charset");
        return mo62421Z(str, 0, str.length(), charset);
    }

    public void close() {
    }

    /* renamed from: e */
    public final long mo62428e() {
        long D = mo62399D();
        if (D == 0) {
            return 0;
        }
        C11206t tVar = this.f54090a;
        C13706o.m87926c(tVar);
        C11206t tVar2 = tVar.f54148g;
        C13706o.m87926c(tVar2);
        int i = tVar2.f54144c;
        if (i < 8192 && tVar2.f54146e) {
            D -= (long) (i - tVar2.f54143b);
        }
        return D;
    }

    /* renamed from: e0 */
    public C11179b mo62455s0(String str) {
        C13706o.m87929f(str, TypedValues.Custom.S_STRING);
        return mo62460v0(str, 0, str.length());
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = 1
            goto L_0x008b
        L_0x000b:
            boolean r4 = r1 instanceof p226cd.C11179b
            if (r4 != 0) goto L_0x0011
            goto L_0x008b
        L_0x0011:
            long r4 = r18.mo62399D()
            cd.b r1 = (p226cd.C11179b) r1
            long r6 = r1.mo62399D()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0021
            goto L_0x008b
        L_0x0021:
            long r4 = r18.mo62399D()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002c
            goto L_0x0008
        L_0x002c:
            cd.t r4 = r0.f54090a
            kotlin.jvm.internal.C13706o.m87926c(r4)
            cd.t r1 = r1.f54090a
            kotlin.jvm.internal.C13706o.m87926c(r1)
            int r5 = r4.f54143b
            int r8 = r1.f54143b
            r9 = r6
        L_0x003b:
            long r11 = r18.mo62399D()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0008
            int r11 = r4.f54144c
            int r11 = r11 - r5
            int r12 = r1.f54144c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0073
            r13 = r6
        L_0x0053:
            r15 = 1
            long r13 = r13 + r15
            byte[] r15 = r4.f54142a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f54142a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0065
            goto L_0x008b
        L_0x0065:
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x006e
            r5 = r16
            r8 = r17
            goto L_0x0073
        L_0x006e:
            r5 = r16
            r8 = r17
            goto L_0x0053
        L_0x0073:
            int r13 = r4.f54144c
            if (r5 != r13) goto L_0x007e
            cd.t r4 = r4.f54147f
            kotlin.jvm.internal.C13706o.m87926c(r4)
            int r5 = r4.f54143b
        L_0x007e:
            int r13 = r1.f54144c
            if (r8 != r13) goto L_0x0089
            cd.t r1 = r1.f54147f
            kotlin.jvm.internal.C13706o.m87926c(r1)
            int r8 = r1.f54143b
        L_0x0089:
            long r9 = r9 + r11
            goto L_0x003b
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p226cd.C11179b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C11179b mo62431f() {
        C11179b bVar = new C11179b();
        if (mo62399D() != 0) {
            C11206t tVar = this.f54090a;
            C13706o.m87926c(tVar);
            C11206t d = tVar.mo62564d();
            bVar.f54090a = d;
            d.f54148g = d;
            d.f54147f = d;
            for (C11206t tVar2 = tVar.f54147f; tVar2 != tVar; tVar2 = tVar2.f54147f) {
                C11206t tVar3 = d.f54148g;
                C13706o.m87926c(tVar3);
                C13706o.m87926c(tVar2);
                tVar3.mo62563c(tVar2.mo62564d());
            }
            bVar.mo62398C(mo62399D());
        }
        return bVar;
    }

    /* renamed from: f0 */
    public C11179b mo62460v0(String str, int i, int i2) {
        char charAt;
        C13706o.m87929f(str, TypedValues.Custom.S_STRING);
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            C11206t H = mo62403H(1);
                            byte[] bArr = H.f54142a;
                            int i3 = H.f54144c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i5 = H.f54144c;
                                    int i6 = (i3 + i) - i5;
                                    H.f54144c = i5 + i6;
                                    mo62398C(mo62399D() + ((long) i6));
                                } else {
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt;
                                }
                            }
                            int i52 = H.f54144c;
                            int i62 = (i3 + i) - i52;
                            H.f54144c = i52 + i62;
                            mo62398C(mo62399D() + ((long) i62));
                        } else {
                            if (charAt2 < 2048) {
                                C11206t H2 = mo62403H(2);
                                byte[] bArr2 = H2.f54142a;
                                int i7 = H2.f54144c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                H2.f54144c = i7 + 2;
                                mo62398C(mo62399D() + 2);
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                C11206t H3 = mo62403H(3);
                                byte[] bArr3 = H3.f54142a;
                                int i8 = H3.f54144c;
                                bArr3[i8] = (byte) ((charAt2 >> 12) | Opcodes.SHL_INT_LIT8);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                                H3.f54144c = i8 + 3;
                                mo62398C(mo62399D() + 3);
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt2 <= 56319) {
                                    if (56320 <= charAt3 && charAt3 <= 57343) {
                                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + IOUtils.DIR_SEPARATOR;
                                        C11206t H4 = mo62403H(4);
                                        byte[] bArr4 = H4.f54142a;
                                        int i11 = H4.f54144c;
                                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                        H4.f54144c = i11 + 4;
                                        mo62398C(mo62399D() + 4);
                                        i += 2;
                                    }
                                }
                                writeByte(63);
                                i = i9;
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(C13706o.m87936m("beginIndex < 0: ", Integer.valueOf(i)).toString());
    }

    public void flush() {
    }

    /* renamed from: g */
    public final C11179b mo62433g(C11179b bVar, long j, long j2) {
        C13706o.m87929f(bVar, "out");
        C11187d0.m75097b(mo62399D(), j, j2);
        if (j2 != 0) {
            bVar.mo62398C(bVar.mo62399D() + j2);
            C11206t tVar = this.f54090a;
            while (true) {
                C13706o.m87926c(tVar);
                int i = tVar.f54144c;
                int i2 = tVar.f54143b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                tVar = tVar.f54147f;
            }
            while (j2 > 0) {
                C13706o.m87926c(tVar);
                C11206t d = tVar.mo62564d();
                int i3 = d.f54143b + ((int) j);
                d.f54143b = i3;
                d.f54144c = Math.min(i3 + ((int) j2), d.f54144c);
                C11206t tVar2 = bVar.f54090a;
                if (tVar2 == null) {
                    d.f54148g = d;
                    d.f54147f = d;
                    bVar.f54090a = d;
                } else {
                    C13706o.m87926c(tVar2);
                    C11206t tVar3 = tVar2.f54148g;
                    C13706o.m87926c(tVar3);
                    tVar3.mo62563c(d);
                }
                j2 -= (long) (d.f54144c - d.f54143b);
                tVar = tVar.f54147f;
                j = 0;
            }
        }
        return this;
    }

    public C11179b getBuffer() {
        return this;
    }

    /* renamed from: h */
    public final byte mo62435h(long j) {
        C11187d0.m75097b(mo62399D(), j, 1);
        C11206t tVar = this.f54090a;
        if (tVar == null) {
            C13706o.m87926c((Object) null);
            throw null;
        } else if (mo62399D() - j < j) {
            long D = mo62399D();
            while (D > j) {
                tVar = tVar.f54148g;
                C13706o.m87926c(tVar);
                D -= (long) (tVar.f54144c - tVar.f54143b);
            }
            C13706o.m87926c(tVar);
            return tVar.f54142a[(int) ((((long) tVar.f54143b) + j) - D)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (tVar.f54144c - tVar.f54143b)) + j2;
                if (j3 > j) {
                    C13706o.m87926c(tVar);
                    return tVar.f54142a[(int) ((((long) tVar.f54143b) + j) - j2)];
                }
                tVar = tVar.f54147f;
                C13706o.m87926c(tVar);
                j2 = j3;
            }
        }
    }

    public int hashCode() {
        C11206t tVar = this.f54090a;
        if (tVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = tVar.f54144c;
            for (int i3 = tVar.f54143b; i3 < i2; i3++) {
                i = (i * 31) + tVar.f54142a[i3];
            }
            tVar = tVar.f54147f;
            C13706o.m87926c(tVar);
        } while (tVar != this.f54090a);
        return i;
    }

    /* renamed from: i0 */
    public String mo62437i0(long j) throws EOFException {
        if (j >= 0) {
            long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
            if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long o = mo62443o(b, 0, j2);
            if (o != -1) {
                return C12012a.m82453c(this, o);
            }
            if (j2 < mo62399D() && mo62435h(j2 - 1) == ((byte) 13) && mo62435h(j2) == b) {
                return C12012a.m82453c(this, j2);
            }
            C11179b bVar = new C11179b();
            mo62433g(bVar, 0, Math.min((long) 32, mo62399D()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo62399D(), j) + " content=" + bVar.mo62415S1().mo62502m() + 8230);
        }
        throw new IllegalArgumentException(C13706o.m87936m("limit < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: i1 */
    public C11188e mo62438i1(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(C13706o.m87936m("byteCount: ", Long.valueOf(j)).toString());
        } else if (mo62399D() < j) {
            throw new EOFException();
        } else if (j < 4096) {
            return new C11188e(mo62404H0(j));
        } else {
            C11188e G = mo62402G((int) j);
            skip(j);
            return G;
        }
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j0 */
    public C11179b mo62440j0(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            C11206t H = mo62403H(2);
            byte[] bArr = H.f54142a;
            int i2 = H.f54144c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            H.f54144c = i2 + 2;
            mo62398C(mo62399D() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i <= 57343) {
                z = true;
            }
            if (z) {
                writeByte(63);
            } else if (i < 65536) {
                C11206t H2 = mo62403H(3);
                byte[] bArr2 = H2.f54142a;
                int i3 = H2.f54144c;
                bArr2[i3] = (byte) ((i >> 12) | Opcodes.SHL_INT_LIT8);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                H2.f54144c = i3 + 3;
                mo62398C(mo62399D() + 3);
            } else if (i <= 1114111) {
                C11206t H3 = mo62403H(4);
                byte[] bArr3 = H3.f54142a;
                int i4 = H3.f54144c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                H3.f54144c = i4 + 4;
                mo62398C(mo62399D() + 4);
            } else {
                throw new IllegalArgumentException(C13706o.m87936m("Unexpected code point: 0x", C11187d0.m75102g(i)));
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r8 != r9) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r15.f54090a = r6.mo62562b();
        p226cd.C11208u.m75234b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        r6.f54143b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r1 != false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[SYNTHETIC] */
    /* renamed from: j2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo62441j2() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.mo62399D()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a2
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000d:
            cd.t r6 = r15.f54090a
            kotlin.jvm.internal.C13706o.m87926c(r6)
            byte[] r7 = r6.f54142a
            int r8 = r6.f54143b
            int r9 = r6.f54144c
        L_0x0018:
            if (r8 >= r9) goto L_0x0084
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0070
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0070
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            cd.b r0 = new cd.b
            r0.<init>()
            cd.b r0 = r0.mo62413R1(r4)
            cd.b r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.mo62471z()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = kotlin.jvm.internal.C13706o.m87936m(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r0 == 0) goto L_0x0074
            r1 = 1
            goto L_0x0084
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = p226cd.C11187d0.m75101f(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = kotlin.jvm.internal.C13706o.m87936m(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x0084:
            if (r8 != r9) goto L_0x0090
            cd.t r7 = r6.mo62562b()
            r15.f54090a = r7
            p226cd.C11208u.m75234b(r6)
            goto L_0x0092
        L_0x0090:
            r6.f54143b = r8
        L_0x0092:
            if (r1 != 0) goto L_0x0098
            cd.t r6 = r15.f54090a
            if (r6 != 0) goto L_0x000d
        L_0x0098:
            long r1 = r15.mo62399D()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.mo62398C(r1)
            return r4
        L_0x00a2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p226cd.C11179b.mo62441j2():long");
    }

    /* renamed from: k2 */
    public InputStream mo62442k2() {
        return new C11181b(this);
    }

    /* renamed from: m0 */
    public long mo62392m0(C11179b bVar, long j) {
        C13706o.m87929f(bVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C13706o.m87936m("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (mo62399D() == 0) {
            return -1;
        } else {
            if (j > mo62399D()) {
                j = mo62399D();
            }
            bVar.mo62384X(this, j);
            return j;
        }
    }

    /* renamed from: o */
    public long mo62443o(byte b, long j, long j2) {
        long j3;
        int i;
        byte b2 = b;
        long j4 = j;
        long j5 = j2;
        boolean z = false;
        long j6 = 0;
        if (0 <= j4 && j4 <= j5) {
            z = true;
        }
        if (z) {
            if (j5 > mo62399D()) {
                j5 = mo62399D();
            }
            long j7 = j5;
            if (j4 == j7) {
                return -1;
            }
            C11206t tVar = this.f54090a;
            if (tVar == null) {
                return -1;
            }
            if (mo62399D() - j4 < j4) {
                j3 = mo62399D();
                while (j3 > j4) {
                    tVar = tVar.f54148g;
                    C13706o.m87926c(tVar);
                    j3 -= (long) (tVar.f54144c - tVar.f54143b);
                }
                while (j3 < j7) {
                    byte[] bArr = tVar.f54142a;
                    int min = (int) Math.min((long) tVar.f54144c, (((long) tVar.f54143b) + j7) - j3);
                    i = (int) ((((long) tVar.f54143b) + j4) - j3);
                    while (i < min) {
                        if (bArr[i] != b2) {
                            i++;
                        }
                    }
                    j3 += (long) (tVar.f54144c - tVar.f54143b);
                    tVar = tVar.f54147f;
                    C13706o.m87926c(tVar);
                    j4 = j3;
                }
                return -1;
            }
            while (true) {
                long j8 = ((long) (tVar.f54144c - tVar.f54143b)) + j6;
                if (j8 > j4) {
                    break;
                }
                tVar = tVar.f54147f;
                C13706o.m87926c(tVar);
                j6 = j8;
            }
            while (j3 < j7) {
                byte[] bArr2 = tVar.f54142a;
                int min2 = (int) Math.min((long) tVar.f54144c, (((long) tVar.f54143b) + j7) - j3);
                int i2 = (int) ((((long) tVar.f54143b) + j4) - j3);
                while (i < min2) {
                    if (bArr2[i] != b2) {
                        i2 = i + 1;
                    }
                }
                j6 = j3 + ((long) (tVar.f54144c - tVar.f54143b));
                tVar = tVar.f54147f;
                C13706o.m87926c(tVar);
                j4 = j6;
            }
            return -1;
            return ((long) (i - tVar.f54143b)) + j3;
        }
        throw new IllegalArgumentException(("size=" + mo62399D() + " fromIndex=" + j4 + " toIndex=" + j5).toString());
    }

    /* renamed from: o0 */
    public long mo62444o0(C11188e eVar) {
        C13706o.m87929f(eVar, "targetBytes");
        return mo62447r(eVar, 0);
    }

    /* renamed from: p */
    public long mo62445p(C11188e eVar, long j) throws IOException {
        C13706o.m87929f(eVar, "bytes");
        if (eVar.mo62485C() > 0) {
            long j2 = 0;
            if (j >= 0) {
                C11206t tVar = this.f54090a;
                if (tVar != null) {
                    if (mo62399D() - j < j) {
                        long D = mo62399D();
                        while (D > j) {
                            tVar = tVar.f54148g;
                            C13706o.m87926c(tVar);
                            D -= (long) (tVar.f54144c - tVar.f54143b);
                        }
                        byte[] n = eVar.mo62503n();
                        byte b = n[0];
                        int C = eVar.mo62485C();
                        long D2 = (mo62399D() - ((long) C)) + 1;
                        C11206t tVar2 = tVar;
                        long j3 = D;
                        long j4 = j;
                        while (j3 < D2) {
                            byte[] bArr = tVar2.f54142a;
                            long j5 = j4;
                            int min = (int) Math.min((long) tVar2.f54144c, (((long) tVar2.f54143b) + D2) - j3);
                            int i = (int) ((((long) tVar2.f54143b) + j5) - j3);
                            if (i < min) {
                                while (true) {
                                    int i2 = i + 1;
                                    if (bArr[i] == b && C12012a.m82452b(tVar2, i2, n, 1, C)) {
                                        return ((long) (i - tVar2.f54143b)) + j3;
                                    }
                                    if (i2 >= min) {
                                        break;
                                    }
                                    i = i2;
                                }
                            }
                            j3 += (long) (tVar2.f54144c - tVar2.f54143b);
                            tVar2 = tVar2.f54147f;
                            C13706o.m87926c(tVar2);
                            j4 = j3;
                        }
                    } else {
                        while (true) {
                            long j6 = ((long) (tVar.f54144c - tVar.f54143b)) + j2;
                            if (j6 > j) {
                                break;
                            }
                            tVar = tVar.f54147f;
                            C13706o.m87926c(tVar);
                            j2 = j6;
                        }
                        byte[] n2 = eVar.mo62503n();
                        byte b2 = n2[0];
                        int C2 = eVar.mo62485C();
                        long D3 = (mo62399D() - ((long) C2)) + 1;
                        long j7 = j2;
                        long j8 = j;
                        while (j7 < D3) {
                            byte[] bArr2 = tVar.f54142a;
                            long j9 = D3;
                            int min2 = (int) Math.min((long) tVar.f54144c, (((long) tVar.f54143b) + D3) - j7);
                            int i3 = (int) ((((long) tVar.f54143b) + j8) - j7);
                            if (i3 < min2) {
                                while (true) {
                                    int i4 = i3 + 1;
                                    if (bArr2[i3] == b2 && C12012a.m82452b(tVar, i4, n2, 1, C2)) {
                                        return ((long) (i3 - tVar.f54143b)) + j7;
                                    }
                                    if (i4 >= min2) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                            j7 += (long) (tVar.f54144c - tVar.f54143b);
                            tVar = tVar.f54147f;
                            C13706o.m87926c(tVar);
                            j8 = j7;
                            D3 = j9;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(C13706o.m87936m("fromIndex < 0: ", Long.valueOf(j)).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public C11186d peek() {
        return C11196l.m75163b(new C11202q(this));
    }

    /* renamed from: q */
    public C11213z mo62393q() {
        return C11213z.f54158e;
    }

    /* renamed from: r */
    public long mo62447r(C11188e eVar, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        C13706o.m87929f(eVar, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            C11206t tVar = this.f54090a;
            if (tVar == null) {
                return -1;
            }
            if (mo62399D() - j < j) {
                j2 = mo62399D();
                while (j2 > j) {
                    tVar = tVar.f54148g;
                    C13706o.m87926c(tVar);
                    j2 -= (long) (tVar.f54144c - tVar.f54143b);
                }
                if (eVar.mo62485C() == 2) {
                    byte g = eVar.mo62496g(0);
                    byte g2 = eVar.mo62496g(1);
                    while (j2 < mo62399D()) {
                        byte[] bArr = tVar.f54142a;
                        i2 = (int) ((((long) tVar.f54143b) + j) - j2);
                        int i4 = tVar.f54144c;
                        while (i2 < i4) {
                            byte b = bArr[i2];
                            if (!(b == g || b == g2)) {
                                i2++;
                            }
                        }
                        j2 += (long) (tVar.f54144c - tVar.f54143b);
                        tVar = tVar.f54147f;
                        C13706o.m87926c(tVar);
                        j = j2;
                    }
                    return -1;
                }
                byte[] n = eVar.mo62503n();
                while (j2 < mo62399D()) {
                    byte[] bArr2 = tVar.f54142a;
                    i = (int) ((((long) tVar.f54143b) + j) - j2);
                    int i5 = tVar.f54144c;
                    while (i < i5) {
                        byte b2 = bArr2[i];
                        int length = n.length;
                        int i6 = 0;
                        while (i6 < length) {
                            byte b3 = n[i6];
                            i6++;
                            if (b2 == b3) {
                                i3 = tVar.f54143b;
                                return ((long) (i2 - i3)) + j2;
                            }
                        }
                        i++;
                    }
                    j2 += (long) (tVar.f54144c - tVar.f54143b);
                    tVar = tVar.f54147f;
                    C13706o.m87926c(tVar);
                    j = j2;
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (tVar.f54144c - tVar.f54143b)) + j3;
                if (j4 > j) {
                    break;
                }
                tVar = tVar.f54147f;
                C13706o.m87926c(tVar);
                j3 = j4;
            }
            if (eVar.mo62485C() == 2) {
                byte g3 = eVar.mo62496g(0);
                byte g4 = eVar.mo62496g(1);
                while (j2 < mo62399D()) {
                    byte[] bArr3 = tVar.f54142a;
                    int i7 = (int) ((((long) tVar.f54143b) + j) - j2);
                    int i8 = tVar.f54144c;
                    while (i2 < i8) {
                        byte b4 = bArr3[i2];
                        if (!(b4 == g3 || b4 == g4)) {
                            i7 = i2 + 1;
                        }
                    }
                    j3 = j2 + ((long) (tVar.f54144c - tVar.f54143b));
                    tVar = tVar.f54147f;
                    C13706o.m87926c(tVar);
                    j = j3;
                }
                return -1;
            }
            byte[] n2 = eVar.mo62503n();
            while (j2 < mo62399D()) {
                byte[] bArr4 = tVar.f54142a;
                int i9 = (int) ((((long) tVar.f54143b) + j) - j2);
                int i10 = tVar.f54144c;
                while (i < i10) {
                    byte b5 = bArr4[i];
                    int length2 = n2.length;
                    int i11 = 0;
                    while (i11 < length2) {
                        byte b6 = n2[i11];
                        i11++;
                        if (b5 == b6) {
                            i3 = tVar.f54143b;
                            return ((long) (i2 - i3)) + j2;
                        }
                    }
                    i9 = i + 1;
                }
                j3 = j2 + ((long) (tVar.f54144c - tVar.f54143b));
                tVar = tVar.f54147f;
                C13706o.m87926c(tVar);
                j = j3;
            }
            return -1;
            i3 = tVar.f54143b;
            return ((long) (i2 - i3)) + j2;
        }
        throw new IllegalArgumentException(C13706o.m87936m("fromIndex < 0: ", Long.valueOf(j)).toString());
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C13706o.m87929f(byteBuffer, "sink");
        C11206t tVar = this.f54090a;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), tVar.f54144c - tVar.f54143b);
        byteBuffer.put(tVar.f54142a, tVar.f54143b, min);
        int i = tVar.f54143b + min;
        tVar.f54143b = i;
        this.f54091c -= (long) min;
        if (i == tVar.f54144c) {
            this.f54090a = tVar.mo62562b();
            C11208u.m75234b(tVar);
        }
        return min;
    }

    public byte readByte() throws EOFException {
        if (mo62399D() != 0) {
            C11206t tVar = this.f54090a;
            C13706o.m87926c(tVar);
            int i = tVar.f54143b;
            int i2 = tVar.f54144c;
            int i3 = i + 1;
            byte b = tVar.f54142a[i];
            mo62398C(mo62399D() - 1);
            if (i3 == i2) {
                this.f54090a = tVar.mo62562b();
                C11208u.m75234b(tVar);
            } else {
                tVar.f54143b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public int readInt() throws EOFException {
        if (mo62399D() >= 4) {
            C11206t tVar = this.f54090a;
            C13706o.m87926c(tVar);
            int i = tVar.f54143b;
            int i2 = tVar.f54144c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = tVar.f54142a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            mo62398C(mo62399D() - 4);
            if (i6 == i2) {
                this.f54090a = tVar.mo62562b();
                C11208u.m75234b(tVar);
            } else {
                tVar.f54143b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public short readShort() throws EOFException {
        if (mo62399D() >= 2) {
            C11206t tVar = this.f54090a;
            C13706o.m87926c(tVar);
            int i = tVar.f54143b;
            int i2 = tVar.f54144c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = tVar.f54142a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            mo62398C(mo62399D() - 2);
            if (i4 == i2) {
                this.f54090a = tVar.mo62562b();
                C11208u.m75234b(tVar);
            } else {
                tVar.f54143b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    public boolean request(long j) {
        return this.f54091c >= j;
    }

    /* renamed from: s */
    public OutputStream mo62454s() {
        return new C11182c(this);
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            C11206t tVar = this.f54090a;
            if (tVar != null) {
                int min = (int) Math.min(j, (long) (tVar.f54144c - tVar.f54143b));
                long j2 = (long) min;
                mo62398C(mo62399D() - j2);
                j -= j2;
                int i = tVar.f54143b + min;
                tVar.f54143b = i;
                if (i == tVar.f54144c) {
                    this.f54090a = tVar.mo62562b();
                    C11208u.m75234b(tVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        return mo62400E().toString();
    }

    /* renamed from: u */
    public void mo62458u(byte[] bArr) throws EOFException {
        C13706o.m87929f(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: v */
    public int mo62459v() throws EOFException {
        return C11187d0.m75099d(readInt());
    }

    /* renamed from: v1 */
    public byte[] mo62461v1() {
        return mo62404H0(mo62399D());
    }

    /* renamed from: x */
    public short mo62468x() throws EOFException {
        return C11187d0.m75100e(readShort());
    }

    /* renamed from: x1 */
    public boolean mo62469x1() {
        return this.f54091c == 0;
    }

    /* renamed from: y */
    public String mo62470y(long j, Charset charset) throws EOFException {
        C13706o.m87929f(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(C13706o.m87936m("byteCount: ", Long.valueOf(j)).toString());
        } else if (this.f54091c < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C11206t tVar = this.f54090a;
            C13706o.m87926c(tVar);
            int i2 = tVar.f54143b;
            if (((long) i2) + j > ((long) tVar.f54144c)) {
                return new String(mo62404H0(j), charset);
            }
            int i3 = (int) j;
            String str = new String(tVar.f54142a, i2, i3, charset);
            int i4 = tVar.f54143b + i3;
            tVar.f54143b = i4;
            this.f54091c -= j;
            if (i4 == tVar.f54144c) {
                this.f54090a = tVar.mo62562b();
                C11208u.m75234b(tVar);
            }
            return str;
        }
    }

    /* renamed from: z */
    public String mo62471z() {
        return mo62470y(this.f54091c, C15147d.f64349b);
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, mo71668d2 = {"cd/b$b", "Ljava/io/InputStream;", "", "read", "", "sink", "offset", "byteCount", "available", "Lja/u;", "close", "", "toString", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.b$b */
    /* compiled from: Buffer.kt */
    public static final class C11181b extends InputStream {

        /* renamed from: a */
        final /* synthetic */ C11179b f54098a;

        C11181b(C11179b bVar) {
            this.f54098a = bVar;
        }

        public int available() {
            return (int) Math.min(this.f54098a.mo62399D(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f54098a.mo62399D() > 0) {
                return this.f54098a.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f54098a + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C13706o.m87929f(bArr, "sink");
            return this.f54098a.read(bArr, i, i2);
        }
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        C13706o.m87929f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C11206t H = mo62403H(1);
            int min = Math.min(i, 8192 - H.f54144c);
            byteBuffer.get(H.f54142a, H.f54144c, min);
            i -= min;
            H.f54144c += min;
        }
        this.f54091c += (long) remaining;
        return remaining;
    }

    public int read(byte[] bArr, int i, int i2) {
        C13706o.m87929f(bArr, "sink");
        C11187d0.m75097b((long) bArr.length, (long) i, (long) i2);
        C11206t tVar = this.f54090a;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(i2, tVar.f54144c - tVar.f54143b);
        byte[] bArr2 = tVar.f54142a;
        int i3 = tVar.f54143b;
        byte[] unused = C13593l.m87558e(bArr2, bArr, i, i3, i3 + min);
        tVar.f54143b += min;
        mo62398C(mo62399D() - ((long) min));
        if (tVar.f54143b == tVar.f54144c) {
            this.f54090a = tVar.mo62562b();
            C11208u.m75234b(tVar);
        }
        return min;
    }
}
