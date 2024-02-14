package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import javax.mail.UIDFolder;

/* renamed from: io.grpc.internal.p0 */
/* compiled from: GzipInflatingBuffer */
class C12776p0 implements Closeable {

    /* renamed from: A */
    private int f60125A;

    /* renamed from: B */
    private int f60126B;

    /* renamed from: C */
    private long f60127C;

    /* renamed from: D */
    private int f60128D = 0;

    /* renamed from: E */
    private int f60129E = 0;

    /* renamed from: F */
    private boolean f60130F = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12806u f60131a = new C12806u();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final CRC32 f60132c = new CRC32();

    /* renamed from: d */
    private final C12778b f60133d = new C12778b(this, (C12777a) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final byte[] f60134f = new byte[512];
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f60135g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f60136o;

    /* renamed from: p */
    private Inflater f60137p;

    /* renamed from: s */
    private C12779c f60138s = C12779c.HEADER;

    /* renamed from: z */
    private boolean f60139z = false;

    /* renamed from: io.grpc.internal.p0$a */
    /* compiled from: GzipInflatingBuffer */
    static /* synthetic */ class C12777a {

        /* renamed from: a */
        static final /* synthetic */ int[] f60140a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.grpc.internal.p0$c[] r0 = p292io.grpc.internal.C12776p0.C12779c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60140a = r0
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.HEADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60140a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.HEADER_EXTRA_LEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f60140a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.HEADER_EXTRA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f60140a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.HEADER_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f60140a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.HEADER_COMMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f60140a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.HEADER_CRC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f60140a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.INITIALIZE_INFLATER     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f60140a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.INFLATING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f60140a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.INFLATER_NEEDS_INPUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f60140a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.grpc.internal.p0$c r1 = p292io.grpc.internal.C12776p0.C12779c.TRAILER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12776p0.C12777a.<clinit>():void");
        }
    }

    /* renamed from: io.grpc.internal.p0$b */
    /* compiled from: GzipInflatingBuffer */
    private class C12778b {
        private C12778b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public boolean m84486g() {
            while (m84490k() > 0) {
                if (m84487h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public int m84487h() {
            int i;
            if (C12776p0.this.f60136o - C12776p0.this.f60135g > 0) {
                i = C12776p0.this.f60134f[C12776p0.this.f60135g] & 255;
                C12776p0.m84463e(C12776p0.this, 1);
            } else {
                i = C12776p0.this.f60131a.readUnsignedByte();
            }
            C12776p0.this.f60132c.update(i);
            C12776p0.m84467i(C12776p0.this, 1);
            return i;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public long m84488i() {
            return ((long) m84489j()) | (((long) m84489j()) << 16);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public int m84489j() {
            return m84487h() | (m84487h() << 8);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public int m84490k() {
            return (C12776p0.this.f60136o - C12776p0.this.f60135g) + C12776p0.this.f60131a.mo69462l();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public void m84491l(int i) {
            int i2;
            int b = C12776p0.this.f60136o - C12776p0.this.f60135g;
            if (b > 0) {
                int min = Math.min(b, i);
                C12776p0.this.f60132c.update(C12776p0.this.f60134f, C12776p0.this.f60135g, min);
                C12776p0.m84463e(C12776p0.this, min);
                i2 = i - min;
            } else {
                i2 = i;
            }
            if (i2 > 0) {
                byte[] bArr = new byte[512];
                int i3 = 0;
                while (i3 < i2) {
                    int min2 = Math.min(i2 - i3, 512);
                    C12776p0.this.f60131a.mo69460M1(bArr, 0, min2);
                    C12776p0.this.f60132c.update(bArr, 0, min2);
                    i3 += min2;
                }
            }
            C12776p0.m84467i(C12776p0.this, i);
        }

        /* synthetic */ C12778b(C12776p0 p0Var, C12777a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.p0$c */
    /* compiled from: GzipInflatingBuffer */
    private enum C12779c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    C12776p0() {
    }

    /* renamed from: A */
    private boolean m84457A() {
        int d = this.f60133d.m84490k();
        int i = this.f60126B;
        if (d < i) {
            return false;
        }
        this.f60133d.m84491l(i);
        this.f60138s = C12779c.HEADER_NAME;
        return true;
    }

    /* renamed from: B */
    private boolean m84458B() {
        if ((this.f60125A & 4) != 4) {
            this.f60138s = C12779c.HEADER_NAME;
            return true;
        } else if (this.f60133d.m84490k() < 2) {
            return false;
        } else {
            this.f60126B = this.f60133d.m84489j();
            this.f60138s = C12779c.HEADER_EXTRA;
            return true;
        }
    }

    /* renamed from: C */
    private boolean m84459C() {
        if ((this.f60125A & 8) != 8) {
            this.f60138s = C12779c.HEADER_COMMENT;
            return true;
        } else if (!this.f60133d.m84486g()) {
            return false;
        } else {
            this.f60138s = C12779c.HEADER_COMMENT;
            return true;
        }
    }

    /* renamed from: D */
    private boolean m84460D() throws ZipException {
        if (this.f60137p != null && this.f60133d.m84490k() <= 18) {
            this.f60137p.end();
            this.f60137p = null;
        }
        if (this.f60133d.m84490k() < 8) {
            return false;
        }
        if (this.f60132c.getValue() == this.f60133d.m84488i() && this.f60127C == this.f60133d.m84488i()) {
            this.f60132c.reset();
            this.f60138s = C12779c.HEADER;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    /* renamed from: e */
    static /* synthetic */ int m84463e(C12776p0 p0Var, int i) {
        int i2 = p0Var.f60135g + i;
        p0Var.f60135g = i2;
        return i2;
    }

    /* renamed from: i */
    static /* synthetic */ int m84467i(C12776p0 p0Var, int i) {
        int i2 = p0Var.f60128D + i;
        p0Var.f60128D = i2;
        return i2;
    }

    /* renamed from: m */
    private boolean m84468m() {
        Preconditions.m5399z(this.f60137p != null, "inflater is null");
        Preconditions.m5399z(this.f60135g == this.f60136o, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f60131a.mo69462l(), 512);
        if (min == 0) {
            return false;
        }
        this.f60135g = 0;
        this.f60136o = min;
        this.f60131a.mo69460M1(this.f60134f, 0, min);
        this.f60137p.setInput(this.f60134f, this.f60135g, min);
        this.f60138s = C12779c.INFLATING;
        return true;
    }

    /* renamed from: s */
    private int m84469s(byte[] bArr, int i, int i2) throws DataFormatException, ZipException {
        Preconditions.m5399z(this.f60137p != null, "inflater is null");
        try {
            int totalIn = this.f60137p.getTotalIn();
            int inflate = this.f60137p.inflate(bArr, i, i2);
            int totalIn2 = this.f60137p.getTotalIn() - totalIn;
            this.f60128D += totalIn2;
            this.f60129E += totalIn2;
            this.f60135g += totalIn2;
            this.f60132c.update(bArr, i, inflate);
            if (this.f60137p.finished()) {
                this.f60127C = this.f60137p.getBytesWritten() & UIDFolder.MAXUID;
                this.f60138s = C12779c.TRAILER;
            } else if (this.f60137p.needsInput()) {
                this.f60138s = C12779c.INFLATER_NEEDS_INPUT;
            }
            return inflate;
        } catch (DataFormatException e) {
            throw new DataFormatException("Inflater data format exception: " + e.getMessage());
        }
    }

    /* renamed from: v */
    private boolean m84470v() {
        Inflater inflater = this.f60137p;
        if (inflater == null) {
            this.f60137p = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f60132c.reset();
        int i = this.f60136o;
        int i2 = this.f60135g;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f60137p.setInput(this.f60134f, i2, i3);
            this.f60138s = C12779c.INFLATING;
        } else {
            this.f60138s = C12779c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    /* renamed from: x */
    private boolean m84471x() throws ZipException {
        if (this.f60133d.m84490k() < 10) {
            return false;
        }
        if (this.f60133d.m84489j() != 35615) {
            throw new ZipException("Not in GZIP format");
        } else if (this.f60133d.m84487h() == 8) {
            this.f60125A = this.f60133d.m84487h();
            this.f60133d.m84491l(6);
            this.f60138s = C12779c.HEADER_EXTRA_LEN;
            return true;
        } else {
            throw new ZipException("Unsupported compression method");
        }
    }

    /* renamed from: y */
    private boolean m84472y() {
        if ((this.f60125A & 16) != 16) {
            this.f60138s = C12779c.HEADER_CRC;
            return true;
        } else if (!this.f60133d.m84486g()) {
            return false;
        } else {
            this.f60138s = C12779c.HEADER_CRC;
            return true;
        }
    }

    /* renamed from: z */
    private boolean m84473z() throws ZipException {
        if ((this.f60125A & 2) != 2) {
            this.f60138s = C12779c.INITIALIZE_INFLATER;
            return true;
        } else if (this.f60133d.m84490k() < 2) {
            return false;
        } else {
            if ((65535 & ((int) this.f60132c.getValue())) == this.f60133d.m84489j()) {
                this.f60138s = C12779c.INITIALIZE_INFLATER;
                return true;
            }
            throw new ZipException("Corrupt GZIP header");
        }
    }

    public void close() {
        if (!this.f60139z) {
            this.f60139z = true;
            this.f60131a.close();
            Inflater inflater = this.f60137p;
            if (inflater != null) {
                inflater.end();
                this.f60137p = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo69509j(C12798s1 s1Var) {
        Preconditions.m5399z(!this.f60139z, "GzipInflatingBuffer is closed");
        this.f60131a.mo69563c(s1Var);
        this.f60130F = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo69510o() {
        int i = this.f60128D;
        this.f60128D = 0;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo69511p() {
        int i = this.f60129E;
        this.f60129E = 0;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo69512r() {
        Preconditions.m5399z(!this.f60139z, "GzipInflatingBuffer is closed");
        if (this.f60133d.m84490k() == 0 && this.f60138s == C12779c.HEADER) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo69513u(byte[] bArr, int i, int i2) throws DataFormatException, ZipException {
        boolean z = true;
        Preconditions.m5399z(!this.f60139z, "GzipInflatingBuffer is closed");
        boolean z2 = true;
        int i3 = 0;
        while (z2) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                switch (C12777a.f60140a[this.f60138s.ordinal()]) {
                    case 1:
                        z2 = m84471x();
                        break;
                    case 2:
                        z2 = m84458B();
                        break;
                    case 3:
                        z2 = m84457A();
                        break;
                    case 4:
                        z2 = m84459C();
                        break;
                    case 5:
                        z2 = m84472y();
                        break;
                    case 6:
                        z2 = m84473z();
                        break;
                    case 7:
                        z2 = m84470v();
                        break;
                    case 8:
                        i3 += m84469s(bArr, i + i3, i4);
                        if (this.f60138s != C12779c.TRAILER) {
                            z2 = true;
                            break;
                        } else {
                            z2 = m84460D();
                            break;
                        }
                    case 9:
                        z2 = m84468m();
                        break;
                    case 10:
                        z2 = m84460D();
                        break;
                    default:
                        throw new AssertionError("Invalid state: " + this.f60138s);
                }
            } else {
                if (z2 && (this.f60138s != C12779c.HEADER || this.f60133d.m84490k() >= 10)) {
                    z = false;
                }
                this.f60130F = z;
                return i3;
            }
        }
        z = false;
        this.f60130F = z;
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo69514w() {
        Preconditions.m5399z(!this.f60139z, "GzipInflatingBuffer is closed");
        return this.f60130F;
    }
}
