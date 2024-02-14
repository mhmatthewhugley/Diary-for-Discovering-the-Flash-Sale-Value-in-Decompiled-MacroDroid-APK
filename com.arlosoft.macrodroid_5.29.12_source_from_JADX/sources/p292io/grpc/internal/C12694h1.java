package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import p292io.grpc.C12537b1;
import p292io.grpc.C12905k;
import p292io.grpc.C12995t;
import p292io.grpc.internal.C12690g2;

/* renamed from: io.grpc.internal.h1 */
/* compiled from: MessageDeframer */
public class C12694h1 implements Closeable, C12878y {

    /* renamed from: A */
    private int f59899A = 5;

    /* renamed from: B */
    private boolean f59900B;

    /* renamed from: C */
    private C12806u f59901C;

    /* renamed from: D */
    private C12806u f59902D = new C12806u();

    /* renamed from: E */
    private long f59903E;

    /* renamed from: F */
    private boolean f59904F = false;

    /* renamed from: G */
    private int f59905G = -1;

    /* renamed from: H */
    private int f59906H;

    /* renamed from: I */
    private boolean f59907I = false;

    /* renamed from: J */
    private volatile boolean f59908J = false;

    /* renamed from: a */
    private C12696b f59909a;

    /* renamed from: c */
    private int f59910c;

    /* renamed from: d */
    private final C12669e2 f59911d;

    /* renamed from: f */
    private final C12725k2 f59912f;

    /* renamed from: g */
    private C12995t f59913g;

    /* renamed from: o */
    private C12776p0 f59914o;

    /* renamed from: p */
    private byte[] f59915p;

    /* renamed from: s */
    private int f59916s;

    /* renamed from: z */
    private C12699e f59917z = C12699e.HEADER;

    /* renamed from: io.grpc.internal.h1$a */
    /* compiled from: MessageDeframer */
    static /* synthetic */ class C12695a {

        /* renamed from: a */
        static final /* synthetic */ int[] f59918a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.grpc.internal.h1$e[] r0 = p292io.grpc.internal.C12694h1.C12699e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f59918a = r0
                io.grpc.internal.h1$e r1 = p292io.grpc.internal.C12694h1.C12699e.HEADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f59918a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.internal.h1$e r1 = p292io.grpc.internal.C12694h1.C12699e.BODY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12694h1.C12695a.<clinit>():void");
        }
    }

    /* renamed from: io.grpc.internal.h1$b */
    /* compiled from: MessageDeframer */
    public interface C12696b {
        /* renamed from: a */
        void mo69251a(C12690g2.C12691a aVar);

        /* renamed from: d */
        void mo69374d(int i);

        /* renamed from: f */
        void mo69376f(Throwable th);

        /* renamed from: i */
        void mo69172i(boolean z);
    }

    /* renamed from: io.grpc.internal.h1$c */
    /* compiled from: MessageDeframer */
    private static class C12697c implements C12690g2.C12691a {

        /* renamed from: a */
        private InputStream f59919a;

        /* synthetic */ C12697c(InputStream inputStream, C12695a aVar) {
            this(inputStream);
        }

        public InputStream next() {
            InputStream inputStream = this.f59919a;
            this.f59919a = null;
            return inputStream;
        }

        private C12697c(InputStream inputStream) {
            this.f59919a = inputStream;
        }
    }

    /* renamed from: io.grpc.internal.h1$e */
    /* compiled from: MessageDeframer */
    private enum C12699e {
        HEADER,
        BODY
    }

    public C12694h1(C12696b bVar, C12995t tVar, int i, C12669e2 e2Var, C12725k2 k2Var) {
        this.f59909a = (C12696b) Preconditions.m5393t(bVar, "sink");
        this.f59913g = (C12995t) Preconditions.m5393t(tVar, "decompressor");
        this.f59910c = i;
        this.f59911d = (C12669e2) Preconditions.m5393t(e2Var, "statsTraceCtx");
        this.f59912f = (C12725k2) Preconditions.m5393t(k2Var, "transportTracer");
    }

    /* renamed from: f */
    private void m84195f() {
        if (!this.f59904F) {
            this.f59904F = true;
            while (!this.f59908J && this.f59903E > 0 && m84202u()) {
                try {
                    int i = C12695a.f59918a[this.f59917z.ordinal()];
                    if (i == 1) {
                        m84201s();
                    } else if (i == 2) {
                        m84200r();
                        this.f59903E--;
                    } else {
                        throw new AssertionError("Invalid state: " + this.f59917z);
                    }
                } finally {
                    this.f59904F = false;
                }
            }
            if (this.f59908J) {
                close();
                return;
            }
            if (this.f59907I && m84199p()) {
                close();
            }
            this.f59904F = false;
        }
    }

    /* renamed from: i */
    private InputStream m84196i() {
        C12995t tVar = this.f59913g;
        if (tVar != C12905k.C12907b.f60451a) {
            try {
                return new C12698d(tVar.mo69669b(C12802t1.m84563b(this.f59901C, true)), this.f59910c, this.f59911d);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw C12537b1.f59421t.mo69066q("Can't decode compressed gRPC message as compression not configured").mo69057d();
        }
    }

    /* renamed from: m */
    private InputStream m84197m() {
        this.f59911d.mo69364f((long) this.f59901C.mo69462l());
        return C12802t1.m84563b(this.f59901C, true);
    }

    /* renamed from: o */
    private boolean m84198o() {
        return isClosed() || this.f59907I;
    }

    /* renamed from: p */
    private boolean m84199p() {
        C12776p0 p0Var = this.f59914o;
        if (p0Var != null) {
            return p0Var.mo69514w();
        }
        return this.f59902D.mo69462l() == 0;
    }

    /* renamed from: r */
    private void m84200r() {
        this.f59911d.mo69363e(this.f59905G, (long) this.f59906H, -1);
        this.f59906H = 0;
        InputStream i = this.f59900B ? m84196i() : m84197m();
        this.f59901C = null;
        this.f59909a.mo69251a(new C12697c(i, (C12695a) null));
        this.f59917z = C12699e.HEADER;
        this.f59899A = 5;
    }

    /* renamed from: s */
    private void m84201s() {
        int readUnsignedByte = this.f59901C.readUnsignedByte();
        if ((readUnsignedByte & 254) == 0) {
            this.f59900B = (readUnsignedByte & 1) != 0;
            int readInt = this.f59901C.readInt();
            this.f59899A = readInt;
            if (readInt < 0 || readInt > this.f59910c) {
                throw C12537b1.f59416o.mo69066q(String.format("gRPC message exceeds maximum size %d: %d", new Object[]{Integer.valueOf(this.f59910c), Integer.valueOf(this.f59899A)})).mo69057d();
            }
            int i = this.f59905G + 1;
            this.f59905G = i;
            this.f59911d.mo69362d(i);
            this.f59912f.mo69452d();
            this.f59917z = C12699e.BODY;
            return;
        }
        throw C12537b1.f59421t.mo69066q("gRPC frame header malformed: reserved bits not zero").mo69057d();
    }

    /* renamed from: u */
    private boolean m84202u() {
        int i;
        int i2 = 0;
        try {
            if (this.f59901C == null) {
                this.f59901C = new C12806u();
            }
            int i3 = 0;
            i = 0;
            while (true) {
                try {
                    int l = this.f59899A - this.f59901C.mo69462l();
                    if (l <= 0) {
                        if (i3 > 0) {
                            this.f59909a.mo69374d(i3);
                            if (this.f59917z == C12699e.BODY) {
                                if (this.f59914o != null) {
                                    this.f59911d.mo69365g((long) i);
                                    this.f59906H += i;
                                } else {
                                    this.f59911d.mo69365g((long) i3);
                                    this.f59906H += i3;
                                }
                            }
                        }
                        return true;
                    } else if (this.f59914o != null) {
                        byte[] bArr = this.f59915p;
                        if (bArr == null || this.f59916s == bArr.length) {
                            this.f59915p = new byte[Math.min(l, 2097152)];
                            this.f59916s = 0;
                        }
                        int u = this.f59914o.mo69513u(this.f59915p, this.f59916s, Math.min(l, this.f59915p.length - this.f59916s));
                        i3 += this.f59914o.mo69510o();
                        i += this.f59914o.mo69511p();
                        if (u == 0) {
                            if (i3 > 0) {
                                this.f59909a.mo69374d(i3);
                                if (this.f59917z == C12699e.BODY) {
                                    if (this.f59914o != null) {
                                        this.f59911d.mo69365g((long) i);
                                        this.f59906H += i;
                                    } else {
                                        this.f59911d.mo69365g((long) i3);
                                        this.f59906H += i3;
                                    }
                                }
                            }
                            return false;
                        }
                        this.f59901C.mo69563c(C12802t1.m84566e(this.f59915p, this.f59916s, u));
                        this.f59916s += u;
                    } else if (this.f59902D.mo69462l() == 0) {
                        if (i3 > 0) {
                            this.f59909a.mo69374d(i3);
                            if (this.f59917z == C12699e.BODY) {
                                if (this.f59914o != null) {
                                    this.f59911d.mo69365g((long) i);
                                    this.f59906H += i;
                                } else {
                                    this.f59911d.mo69365g((long) i3);
                                    this.f59906H += i3;
                                }
                            }
                        }
                        return false;
                    } else {
                        int min = Math.min(l, this.f59902D.mo69462l());
                        i3 += min;
                        this.f59901C.mo69563c(this.f59902D.mo69461Y(min));
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (DataFormatException e2) {
                    throw new RuntimeException(e2);
                } catch (Throwable th) {
                    int i4 = i3;
                    th = th;
                    i2 = i4;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            if (i2 > 0) {
                this.f59909a.mo69374d(i2);
                if (this.f59917z == C12699e.BODY) {
                    if (this.f59914o != null) {
                        this.f59911d.mo69365g((long) i);
                        this.f59906H += i;
                    } else {
                        this.f59911d.mo69365g((long) i2);
                        this.f59906H += i2;
                    }
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public void mo69371b(int i) {
        Preconditions.m5378e(i > 0, "numMessages must be > 0");
        if (!isClosed()) {
            this.f59903E += (long) i;
            m84195f();
        }
    }

    /* renamed from: c */
    public void mo69372c(int i) {
        this.f59910c = i;
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        if (!isClosed()) {
            C12806u uVar = this.f59901C;
            boolean z = true;
            boolean z2 = uVar != null && uVar.mo69462l() > 0;
            try {
                C12776p0 p0Var = this.f59914o;
                if (p0Var != null) {
                    if (!z2) {
                        if (!p0Var.mo69512r()) {
                            z = false;
                        }
                    }
                    this.f59914o.close();
                    z2 = z;
                }
                C12806u uVar2 = this.f59902D;
                if (uVar2 != null) {
                    uVar2.close();
                }
                C12806u uVar3 = this.f59901C;
                if (uVar3 != null) {
                    uVar3.close();
                }
                this.f59914o = null;
                this.f59902D = null;
                this.f59901C = null;
                this.f59909a.mo69172i(z2);
            } catch (Throwable th) {
                this.f59914o = null;
                this.f59902D = null;
                this.f59901C = null;
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void mo69375e(C12776p0 p0Var) {
        boolean z = true;
        Preconditions.m5399z(this.f59913g == C12905k.C12907b.f60451a, "per-message decompressor already set");
        if (this.f59914o != null) {
            z = false;
        }
        Preconditions.m5399z(z, "full stream decompressor already set");
        this.f59914o = (C12776p0) Preconditions.m5393t(p0Var, "Can't pass a null full stream decompressor");
        this.f59902D = null;
    }

    /* renamed from: g */
    public void mo69377g(C12995t tVar) {
        Preconditions.m5399z(this.f59914o == null, "Already set full stream decompressor");
        this.f59913g = (C12995t) Preconditions.m5393t(tVar, "Can't pass an empty decompressor");
    }

    /* renamed from: h */
    public void mo69378h(C12798s1 s1Var) {
        Preconditions.m5393t(s1Var, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        boolean z = true;
        try {
            if (!m84198o()) {
                C12776p0 p0Var = this.f59914o;
                if (p0Var != null) {
                    p0Var.mo69509j(s1Var);
                } else {
                    this.f59902D.mo69563c(s1Var);
                }
                z = false;
                m84195f();
            }
        } finally {
            if (z) {
                s1Var.close();
            }
        }
    }

    public boolean isClosed() {
        return this.f59902D == null && this.f59914o == null;
    }

    /* renamed from: j */
    public void mo69379j() {
        if (!isClosed()) {
            if (m84199p()) {
                close();
            } else {
                this.f59907I = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo69411v(C12696b bVar) {
        this.f59909a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo69412w() {
        this.f59908J = true;
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.h1$d */
    /* compiled from: MessageDeframer */
    static final class C12698d extends FilterInputStream {

        /* renamed from: a */
        private final int f59920a;

        /* renamed from: c */
        private final C12669e2 f59921c;

        /* renamed from: d */
        private long f59922d;

        /* renamed from: f */
        private long f59923f;

        /* renamed from: g */
        private long f59924g = -1;

        C12698d(InputStream inputStream, int i, C12669e2 e2Var) {
            super(inputStream);
            this.f59920a = i;
            this.f59921c = e2Var;
        }

        /* renamed from: b */
        private void m84215b() {
            long j = this.f59923f;
            long j2 = this.f59922d;
            if (j > j2) {
                this.f59921c.mo69364f(j - j2);
                this.f59922d = this.f59923f;
            }
        }

        /* renamed from: c */
        private void m84216c() {
            long j = this.f59923f;
            int i = this.f59920a;
            if (j > ((long) i)) {
                throw C12537b1.f59416o.mo69066q(String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", new Object[]{Integer.valueOf(i), Long.valueOf(this.f59923f)})).mo69057d();
            }
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f59924g = this.f59923f;
        }

        public int read() throws IOException {
            int read = this.in.read();
            if (read != -1) {
                this.f59923f++;
            }
            m84216c();
            m84215b();
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f59924g != -1) {
                this.in.reset();
                this.f59923f = this.f59924g;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(j);
            this.f59923f += skip;
            m84216c();
            m84215b();
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.in.read(bArr, i, i2);
            if (read != -1) {
                this.f59923f += (long) read;
            }
            m84216c();
            m84215b();
            return read;
        }
    }
}
