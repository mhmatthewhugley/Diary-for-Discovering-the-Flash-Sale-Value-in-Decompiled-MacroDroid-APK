package p369q9;

import com.google.errorprone.annotations.FormatMethod;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p226cd.C11179b;
import p226cd.C11184c;
import p226cd.C11186d;
import p226cd.C11188e;
import p226cd.C11212y;
import p226cd.C11213z;
import p369q9.C16237b;
import p369q9.C16242f;

/* renamed from: q9.g */
/* compiled from: Http2 */
public final class C16245g implements C16253j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f66590a = Logger.getLogger(C16247b.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C11188e f66591b = C11188e.m75103f("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: q9.g$a */
    /* compiled from: Http2 */
    static final class C16246a implements C11212y {

        /* renamed from: a */
        private final C11186d f66592a;

        /* renamed from: c */
        int f66593c;

        /* renamed from: d */
        byte f66594d;

        /* renamed from: f */
        int f66595f;

        /* renamed from: g */
        int f66596g;

        /* renamed from: o */
        short f66597o;

        public C16246a(C11186d dVar) {
            this.f66592a = dVar;
        }

        /* renamed from: b */
        private void m97570b() throws IOException {
            int i = this.f66595f;
            int f = C16245g.m97566m(this.f66592a);
            this.f66596g = f;
            this.f66593c = f;
            byte readByte = (byte) (this.f66592a.readByte() & 255);
            this.f66594d = (byte) (this.f66592a.readByte() & 255);
            if (C16245g.f66590a.isLoggable(Level.FINE)) {
                C16245g.f66590a.fine(C16247b.m97574b(true, this.f66595f, this.f66593c, readByte, this.f66594d));
            }
            int readInt = this.f66592a.readInt() & Integer.MAX_VALUE;
            this.f66595f = readInt;
            if (readByte != 9) {
                throw C16245g.m97564k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw C16245g.m97564k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public void close() throws IOException {
        }

        /* renamed from: m0 */
        public long mo62392m0(C11179b bVar, long j) throws IOException {
            while (true) {
                int i = this.f66596g;
                if (i == 0) {
                    this.f66592a.skip((long) this.f66597o);
                    this.f66597o = 0;
                    if ((this.f66594d & 4) != 0) {
                        return -1;
                    }
                    m97570b();
                } else {
                    long m0 = this.f66592a.mo62392m0(bVar, Math.min(j, (long) i));
                    if (m0 == -1) {
                        return -1;
                    }
                    this.f66596g -= (int) m0;
                    return m0;
                }
            }
        }

        /* renamed from: q */
        public C11213z mo62393q() {
            return this.f66592a.mo62393q();
        }
    }

    /* renamed from: q9.g$b */
    /* compiled from: Http2 */
    static final class C16247b {

        /* renamed from: a */
        private static final String[] f66598a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        private static final String[] f66599b = new String[64];

        /* renamed from: c */
        private static final String[] f66600c = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f66600c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f66599b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = iArr[i3];
                String[] strArr3 = f66599b;
                strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
            }
            String[] strArr4 = f66599b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                for (int i7 = 0; i7 < 1; i7++) {
                    int i8 = iArr[i7];
                    String[] strArr5 = f66599b;
                    int i9 = i8 | i6;
                    strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                    strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f66599b;
                if (i < strArr6.length) {
                    if (strArr6[i] == null) {
                        strArr6[i] = f66600c[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        C16247b() {
        }

        /* renamed from: a */
        static String m97573a(byte b, byte b2) {
            if (b2 == 0) {
                return "";
            }
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        return "ACK";
                    }
                    return f66600c[b2];
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr = f66599b;
                    String str = b2 < strArr.length ? strArr[b2] : f66600c[b2];
                    if (b != 5 || (b2 & 4) == 0) {
                        return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f66600c[b2];
        }

        /* renamed from: b */
        static String m97574b(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = f66598a;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            String a = m97573a(b, b2);
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = a;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: q9.g$c */
    /* compiled from: Http2 */
    static final class C16248c implements C16237b {

        /* renamed from: a */
        private final C11186d f66601a;

        /* renamed from: c */
        private final C16246a f66602c;

        /* renamed from: d */
        private final boolean f66603d;

        /* renamed from: f */
        final C16242f.C16243a f66604f;

        C16248c(C11186d dVar, int i, boolean z) {
            this.f66601a = dVar;
            this.f66603d = z;
            C16246a aVar = new C16246a(dVar);
            this.f66602c = aVar;
            this.f66604f = new C16242f.C16243a(i, aVar);
        }

        /* renamed from: b */
        private void m97575b(C16237b.C16238a aVar, int i, byte b, int i2) throws IOException {
            boolean z = true;
            short s = 0;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f66601a.readByte() & 255);
                }
                aVar.mo78503w(z2, i2, this.f66601a, C16245g.m97565l(i, b, s));
                this.f66601a.skip((long) s);
                return;
            }
            throw C16245g.m97564k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }

        /* renamed from: c */
        private void m97576c(C16237b.C16238a aVar, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                throw C16245g.m97564k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.f66601a.readInt();
                int readInt2 = this.f66601a.readInt();
                int i3 = i - 8;
                C16236a b2 = C16236a.m97504b(readInt2);
                if (b2 != null) {
                    C11188e eVar = C11188e.f54105f;
                    if (i3 > 0) {
                        eVar = this.f66601a.mo62438i1((long) i3);
                    }
                    aVar.mo78505y(readInt, b2, eVar);
                    return;
                }
                throw C16245g.m97564k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            } else {
                throw C16245g.m97564k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
        }

        /* renamed from: e */
        private List<C16240d> m97577e(int i, short s, byte b, int i2) throws IOException {
            C16246a aVar = this.f66602c;
            aVar.f66596g = i;
            aVar.f66593c = i;
            aVar.f66597o = s;
            aVar.f66594d = b;
            aVar.f66595f = i2;
            this.f66604f.mo78751l();
            return this.f66604f.mo78748e();
        }

        /* renamed from: f */
        private void m97578f(C16237b.C16238a aVar, int i, byte b, int i2) throws IOException {
            short s = 0;
            if (i2 != 0) {
                boolean z = (b & 1) != 0;
                if ((b & 8) != 0) {
                    s = (short) (this.f66601a.readByte() & 255);
                }
                if ((b & 32) != 0) {
                    m97580h(aVar, i2);
                    i -= 5;
                }
                aVar.mo78506z(false, z, i2, -1, m97577e(C16245g.m97565l(i, b, s), s, b, i2), C16241e.HTTP_20_HEADERS);
                return;
            }
            throw C16245g.m97564k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }

        /* renamed from: g */
        private void m97579g(C16237b.C16238a aVar, int i, byte b, int i2) throws IOException {
            boolean z = false;
            if (i != 8) {
                throw C16245g.m97564k("TYPE_PING length != 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.f66601a.readInt();
                int readInt2 = this.f66601a.readInt();
                if ((b & 1) != 0) {
                    z = true;
                }
                aVar.mo78498k(z, readInt, readInt2);
            } else {
                throw C16245g.m97564k("TYPE_PING streamId != 0", new Object[0]);
            }
        }

        /* renamed from: h */
        private void m97580h(C16237b.C16238a aVar, int i) throws IOException {
            int readInt = this.f66601a.readInt();
            aVar.mo78504x(i, readInt & Integer.MAX_VALUE, (this.f66601a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: i */
        private void m97581i(C16237b.C16238a aVar, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                throw C16245g.m97564k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            } else if (i2 != 0) {
                m97580h(aVar, i2);
            } else {
                throw C16245g.m97564k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
        }

        /* renamed from: j */
        private void m97582j(C16237b.C16238a aVar, int i, byte b, int i2) throws IOException {
            short s = 0;
            if (i2 != 0) {
                if ((b & 8) != 0) {
                    s = (short) (this.f66601a.readByte() & 255);
                }
                aVar.mo78501u(i2, this.f66601a.readInt() & Integer.MAX_VALUE, m97577e(C16245g.m97565l(i - 4, b, s), s, b, i2));
                return;
            }
            throw C16245g.m97564k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }

        /* renamed from: m */
        private void m97583m(C16237b.C16238a aVar, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw C16245g.m97564k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            } else if (i2 != 0) {
                int readInt = this.f66601a.readInt();
                C16236a b2 = C16236a.m97504b(readInt);
                if (b2 != null) {
                    aVar.mo78500t(i2, b2);
                } else {
                    throw C16245g.m97564k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                }
            } else {
                throw C16245g.m97564k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
        }

        /* renamed from: o */
        private void m97584o(C16237b.C16238a aVar, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                throw C16245g.m97564k("TYPE_SETTINGS streamId != 0", new Object[0]);
            } else if ((b & 1) != 0) {
                if (i == 0) {
                    aVar.mo78502v();
                    return;
                }
                throw C16245g.m97564k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            } else if (i % 6 == 0) {
                C16252i iVar = new C16252i();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short readShort = this.f66601a.readShort();
                    int readInt = this.f66601a.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                throw C16245g.m97564k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt < 0) {
                                throw C16245g.m97564k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                            break;
                        case 5:
                            if (readInt < 16384 || readInt > 16777215) {
                                throw C16245g.m97564k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                    }
                    iVar.mo78770e(readShort, 0, readInt);
                }
                aVar.mo78496A(false, iVar);
                if (iVar.mo78767b() >= 0) {
                    this.f66604f.mo78749g(iVar.mo78767b());
                }
            } else {
                throw C16245g.m97564k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            }
        }

        /* renamed from: p */
        private void m97585p(C16237b.C16238a aVar, int i, byte b, int i2) throws IOException {
            if (i == 4) {
                long readInt = ((long) this.f66601a.readInt()) & 2147483647L;
                if (readInt != 0) {
                    aVar.mo78497d(i2, readInt);
                    return;
                }
                throw C16245g.m97564k("windowSizeIncrement was 0", new Object[0]);
            }
            throw C16245g.m97564k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }

        /* renamed from: C1 */
        public boolean mo78744C1(C16237b.C16238a aVar) throws IOException {
            try {
                this.f66601a.mo62420W0(9);
                int f = C16245g.m97566m(this.f66601a);
                if (f < 0 || f > 16384) {
                    throw C16245g.m97564k("FRAME_SIZE_ERROR: %s", Integer.valueOf(f));
                }
                byte readByte = (byte) (this.f66601a.readByte() & 255);
                byte readByte2 = (byte) (this.f66601a.readByte() & 255);
                int readInt = this.f66601a.readInt() & Integer.MAX_VALUE;
                if (C16245g.f66590a.isLoggable(Level.FINE)) {
                    C16245g.f66590a.fine(C16247b.m97574b(true, readInt, f, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m97575b(aVar, f, readByte2, readInt);
                        break;
                    case 1:
                        m97578f(aVar, f, readByte2, readInt);
                        break;
                    case 2:
                        m97581i(aVar, f, readByte2, readInt);
                        break;
                    case 3:
                        m97583m(aVar, f, readByte2, readInt);
                        break;
                    case 4:
                        m97584o(aVar, f, readByte2, readInt);
                        break;
                    case 5:
                        m97582j(aVar, f, readByte2, readInt);
                        break;
                    case 6:
                        m97579g(aVar, f, readByte2, readInt);
                        break;
                    case 7:
                        m97576c(aVar, f, readByte2, readInt);
                        break;
                    case 8:
                        m97585p(aVar, f, readByte2, readInt);
                        break;
                    default:
                        this.f66601a.skip((long) f);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public void close() throws IOException {
            this.f66601a.close();
        }
    }

    /* renamed from: q9.g$d */
    /* compiled from: Http2 */
    static final class C16249d implements C16239c {

        /* renamed from: a */
        private final C11184c f66605a;

        /* renamed from: c */
        private final boolean f66606c;

        /* renamed from: d */
        private final C11179b f66607d;

        /* renamed from: f */
        private final C16242f.C16244b f66608f;

        /* renamed from: g */
        private int f66609g = 16384;

        /* renamed from: o */
        private boolean f66610o;

        C16249d(C11184c cVar, boolean z) {
            this.f66605a = cVar;
            this.f66606c = z;
            C11179b bVar = new C11179b();
            this.f66607d = bVar;
            this.f66608f = new C16242f.C16244b(bVar);
        }

        /* renamed from: f */
        private void m97587f(int i, long j) throws IOException {
            while (j > 0) {
                int min = (int) Math.min((long) this.f66609g, j);
                long j2 = (long) min;
                j -= j2;
                mo78760c(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
                this.f66605a.mo62384X(this.f66607d, j2);
            }
        }

        /* renamed from: P0 */
        public synchronized void mo78445P0(C16252i iVar) throws IOException {
            if (!this.f66610o) {
                this.f66609g = iVar.mo78768c(this.f66609g);
                mo78760c(0, 0, (byte) 4, (byte) 1);
                this.f66605a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: T0 */
        public int mo78446T0() {
            return this.f66609g;
        }

        /* renamed from: X0 */
        public synchronized void mo78447X0(boolean z, int i, C11179b bVar, int i2) throws IOException {
            if (!this.f66610o) {
                byte b = 0;
                if (z) {
                    b = (byte) 1;
                }
                mo78759b(i, b, bVar, i2);
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo78759b(int i, byte b, C11179b bVar, int i2) throws IOException {
            mo78760c(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f66605a.mo62384X(bVar, (long) i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo78760c(int i, int i2, byte b, byte b2) throws IOException {
            if (C16245g.f66590a.isLoggable(Level.FINE)) {
                C16245g.f66590a.fine(C16247b.m97574b(false, i, i2, b, b2));
            }
            int i3 = this.f66609g;
            if (i2 > i3) {
                throw C16245g.m97563j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            } else if ((Integer.MIN_VALUE & i) == 0) {
                C16245g.m97567n(this.f66605a, i2);
                this.f66605a.writeByte(b & 255);
                this.f66605a.writeByte(b2 & 255);
                this.f66605a.writeInt(i & Integer.MAX_VALUE);
            } else {
                throw C16245g.m97563j("reserved bit set: %s", Integer.valueOf(i));
            }
        }

        public synchronized void close() throws IOException {
            this.f66610o = true;
            this.f66605a.close();
        }

        /* renamed from: d */
        public synchronized void mo78449d(int i, long j) throws IOException {
            if (this.f66610o) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw C16245g.m97563j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            } else {
                mo78760c(i, 4, (byte) 8, (byte) 0);
                this.f66605a.writeInt((int) j);
                this.f66605a.flush();
            }
        }

        /* renamed from: d0 */
        public synchronized void mo78450d0() throws IOException {
            if (this.f66610o) {
                throw new IOException("closed");
            } else if (this.f66606c) {
                if (C16245g.f66590a.isLoggable(Level.FINE)) {
                    C16245g.f66590a.fine(String.format(">> CONNECTION %s", new Object[]{C16245g.f66591b.mo62502m()}));
                }
                this.f66605a.write(C16245g.f66591b.mo62488G());
                this.f66605a.flush();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo78762e(boolean z, int i, List<C16240d> list) throws IOException {
            if (!this.f66610o) {
                this.f66608f.mo78754e(list);
                long D = this.f66607d.mo62399D();
                int min = (int) Math.min((long) this.f66609g, D);
                long j = (long) min;
                int i2 = (D > j ? 1 : (D == j ? 0 : -1));
                byte b = i2 == 0 ? (byte) 4 : 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                mo78760c(i, min, (byte) 1, b);
                this.f66605a.mo62384X(this.f66607d, j);
                if (i2 > 0) {
                    m97587f(i, D - j);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        /* renamed from: f2 */
        public synchronized void mo78451f2(boolean z, boolean z2, int i, int i2, List<C16240d> list) throws IOException {
            if (!z2) {
                try {
                    if (!this.f66610o) {
                        mo78762e(z, i, list);
                    } else {
                        throw new IOException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f66610o) {
                this.f66605a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: k */
        public synchronized void mo78453k(boolean z, int i, int i2) throws IOException {
            if (!this.f66610o) {
                mo78760c(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.f66605a.writeInt(i);
                this.f66605a.writeInt(i2);
                this.f66605a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: m1 */
        public synchronized void mo78454m1(C16252i iVar) throws IOException {
            if (!this.f66610o) {
                int i = 0;
                mo78760c(0, iVar.mo78771f() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (iVar.mo78769d(i)) {
                        this.f66605a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f66605a.writeInt(iVar.mo78766a(i));
                    }
                    i++;
                }
                this.f66605a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: r1 */
        public synchronized void mo78455r1(int i, C16236a aVar, byte[] bArr) throws IOException {
            if (this.f66610o) {
                throw new IOException("closed");
            } else if (aVar.httpCode != -1) {
                mo78760c(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f66605a.writeInt(i);
                this.f66605a.writeInt(aVar.httpCode);
                if (bArr.length > 0) {
                    this.f66605a.write(bArr);
                }
                this.f66605a.flush();
            } else {
                throw C16245g.m97563j("errorCode.httpCode == -1", new Object[0]);
            }
        }

        /* renamed from: t */
        public synchronized void mo78456t(int i, C16236a aVar) throws IOException {
            if (this.f66610o) {
                throw new IOException("closed");
            } else if (aVar.httpCode != -1) {
                mo78760c(i, 4, (byte) 3, (byte) 0);
                this.f66605a.writeInt(aVar.httpCode);
                this.f66605a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    /* access modifiers changed from: private */
    @FormatMethod
    /* renamed from: j */
    public static IllegalArgumentException m97563j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    @FormatMethod
    /* renamed from: k */
    public static IOException m97564k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m97565l(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw m97564k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m97566m(C11186d dVar) throws IOException {
        return (dVar.readByte() & 255) | ((dVar.readByte() & 255) << 16) | ((dVar.readByte() & 255) << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m97567n(C11184c cVar, int i) throws IOException {
        cVar.writeByte((i >>> 16) & 255);
        cVar.writeByte((i >>> 8) & 255);
        cVar.writeByte(i & 255);
    }

    /* renamed from: a */
    public C16237b mo78756a(C11186d dVar, boolean z) {
        return new C16248c(dVar, 4096, z);
    }

    /* renamed from: b */
    public C16239c mo78757b(C11184c cVar, boolean z) {
        return new C16249d(cVar, z);
    }
}
