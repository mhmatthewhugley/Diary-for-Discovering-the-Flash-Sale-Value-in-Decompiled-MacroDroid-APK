package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.common.p206io.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p292io.grpc.C12537b1;
import p292io.grpc.C12905k;
import p292io.grpc.C12908k0;
import p292io.grpc.C12909l;
import p292io.grpc.C13003v;

/* renamed from: io.grpc.internal.i1 */
/* compiled from: MessageFramer */
public class C12711i1 implements C12738m0 {

    /* renamed from: a */
    private final C12715d f59939a;

    /* renamed from: b */
    private int f59940b = -1;

    /* renamed from: c */
    private C12734l2 f59941c;

    /* renamed from: d */
    private C12909l f59942d = C12905k.C12907b.f60451a;

    /* renamed from: e */
    private boolean f59943e = true;

    /* renamed from: f */
    private final C12714c f59944f = new C12714c();

    /* renamed from: g */
    private final byte[] f59945g = new byte[5];
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12740m2 f59946h;

    /* renamed from: i */
    private final C12669e2 f59947i;

    /* renamed from: j */
    private boolean f59948j;

    /* renamed from: k */
    private int f59949k;

    /* renamed from: l */
    private int f59950l = -1;

    /* renamed from: m */
    private long f59951m;

    /* renamed from: io.grpc.internal.i1$c */
    /* compiled from: MessageFramer */
    private class C12714c extends OutputStream {
        private C12714c() {
        }

        public void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        public void write(byte[] bArr, int i, int i2) {
            C12711i1.this.m84251n(bArr, i, i2);
        }
    }

    /* renamed from: io.grpc.internal.i1$d */
    /* compiled from: MessageFramer */
    public interface C12715d {
        /* renamed from: n */
        void mo69148n(C12734l2 l2Var, boolean z, boolean z2, int i);
    }

    public C12711i1(C12715d dVar, C12740m2 m2Var, C12669e2 e2Var) {
        this.f59939a = (C12715d) Preconditions.m5393t(dVar, "sink");
        this.f59946h = (C12740m2) Preconditions.m5393t(m2Var, "bufferAllocator");
        this.f59947i = (C12669e2) Preconditions.m5393t(e2Var, "statsTraceCtx");
    }

    /* renamed from: f */
    private void m84244f(boolean z, boolean z2) {
        C12734l2 l2Var = this.f59941c;
        this.f59941c = null;
        this.f59939a.mo69148n(l2Var, z, z2, this.f59949k);
        this.f59949k = 0;
    }

    /* renamed from: g */
    private int m84245g(InputStream inputStream) throws IOException {
        if ((inputStream instanceof C12908k0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    /* renamed from: h */
    private void m84246h() {
        C12734l2 l2Var = this.f59941c;
        if (l2Var != null) {
            l2Var.release();
            this.f59941c = null;
        }
    }

    /* renamed from: j */
    private void m84247j() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    /* renamed from: k */
    private void m84248k(C12713b bVar, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(this.f59945g);
        wrap.put(z ? (byte) 1 : 0);
        int b = bVar.m84260l();
        wrap.putInt(b);
        C12734l2 a = this.f59946h.mo69474a(5);
        a.write(this.f59945g, 0, wrap.position());
        if (b == 0) {
            this.f59941c = a;
            return;
        }
        this.f59939a.mo69148n(a, false, false, this.f59949k - 1);
        this.f59949k = 1;
        List c = bVar.f59952a;
        for (int i = 0; i < c.size() - 1; i++) {
            this.f59939a.mo69148n((C12734l2) c.get(i), false, false, 0);
        }
        this.f59941c = (C12734l2) c.get(c.size() - 1);
        this.f59951m = (long) b;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    private int m84249l(InputStream inputStream, int i) throws IOException {
        C12713b bVar = new C12713b();
        OutputStream c = this.f59942d.mo69670c(bVar);
        try {
            int o = m84252o(inputStream, c);
            c.close();
            int i2 = this.f59940b;
            if (i2 < 0 || o <= i2) {
                m84248k(bVar, true);
                return o;
            }
            throw C12537b1.f59416o.mo69066q(String.format("message too large %d > %d", new Object[]{Integer.valueOf(o), Integer.valueOf(this.f59940b)})).mo69057d();
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    /* renamed from: m */
    private int m84250m(InputStream inputStream, int i) throws IOException {
        int i2 = this.f59940b;
        if (i2 < 0 || i <= i2) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f59945g);
            wrap.put((byte) 0);
            wrap.putInt(i);
            if (this.f59941c == null) {
                this.f59941c = this.f59946h.mo69474a(wrap.position() + i);
            }
            m84251n(this.f59945g, 0, wrap.position());
            return m84252o(inputStream, this.f59944f);
        }
        throw C12537b1.f59416o.mo69066q(String.format("message too large %d > %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f59940b)})).mo69057d();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m84251n(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            C12734l2 l2Var = this.f59941c;
            if (l2Var != null && l2Var.mo69465a() == 0) {
                m84244f(false, false);
            }
            if (this.f59941c == null) {
                this.f59941c = this.f59946h.mo69474a(i2);
            }
            int min = Math.min(i2, this.f59941c.mo69465a());
            this.f59941c.write(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    /* renamed from: o */
    private static int m84252o(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof C13003v) {
            return ((C13003v) inputStream).mo69859b(outputStream);
        }
        long b = ByteStreams.m73409b(inputStream, outputStream);
        Preconditions.m5383j(b <= 2147483647L, "Message size overflow: %s", b);
        return (int) b;
    }

    /* renamed from: p */
    private int m84253p(InputStream inputStream, int i) throws IOException {
        if (i != -1) {
            this.f59951m = (long) i;
            return m84250m(inputStream, i);
        }
        C12713b bVar = new C12713b();
        int o = m84252o(inputStream, bVar);
        int i2 = this.f59940b;
        if (i2 < 0 || o <= i2) {
            m84248k(bVar, false);
            return o;
        }
        throw C12537b1.f59416o.mo69066q(String.format("message too large %d > %d", new Object[]{Integer.valueOf(o), Integer.valueOf(this.f59940b)})).mo69057d();
    }

    /* renamed from: b */
    public void mo69156b(InputStream inputStream) {
        int i;
        m84247j();
        this.f59949k++;
        int i2 = this.f59950l + 1;
        this.f59950l = i2;
        this.f59951m = 0;
        this.f59947i.mo69366i(i2);
        boolean z = this.f59943e && this.f59942d != C12905k.C12907b.f60451a;
        try {
            int g = m84245g(inputStream);
            if (g == 0 || !z) {
                i = m84253p(inputStream, g);
            } else {
                i = m84249l(inputStream, g);
            }
            if (g == -1 || i == g) {
                long j = (long) i;
                this.f59947i.mo69368k(j);
                this.f59947i.mo69369l(this.f59951m);
                this.f59947i.mo69367j(this.f59950l, this.f59951m, j);
                return;
            }
            throw C12537b1.f59421t.mo69066q(String.format("Message length inaccurate %s != %s", new Object[]{Integer.valueOf(i), Integer.valueOf(g)})).mo69057d();
        } catch (IOException e) {
            throw C12537b1.f59421t.mo69066q("Failed to frame message").mo69065p(e).mo69057d();
        } catch (RuntimeException e2) {
            throw C12537b1.f59421t.mo69066q("Failed to frame message").mo69065p(e2).mo69057d();
        }
    }

    public void close() {
        if (!isClosed()) {
            this.f59948j = true;
            C12734l2 l2Var = this.f59941c;
            if (l2Var != null && l2Var.mo69467l() == 0) {
                m84246h();
            }
            m84244f(true, true);
        }
    }

    /* renamed from: d */
    public void mo69158d(int i) {
        Preconditions.m5399z(this.f59940b == -1, "max size already set");
        this.f59940b = i;
    }

    public void flush() {
        C12734l2 l2Var = this.f59941c;
        if (l2Var != null && l2Var.mo69467l() > 0) {
            m84244f(false, true);
        }
    }

    /* renamed from: i */
    public C12711i1 mo69155a(C12909l lVar) {
        this.f59942d = (C12909l) Preconditions.m5393t(lVar, "Can't pass an empty compressor");
        return this;
    }

    public boolean isClosed() {
        return this.f59948j;
    }

    /* renamed from: io.grpc.internal.i1$b */
    /* compiled from: MessageFramer */
    private final class C12713b extends OutputStream {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C12734l2> f59952a;

        /* renamed from: c */
        private C12734l2 f59953c;

        private C12713b() {
            this.f59952a = new ArrayList();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public int m84260l() {
            int i = 0;
            for (C12734l2 l : this.f59952a) {
                i += l.mo69467l();
            }
            return i;
        }

        public void write(int i) throws IOException {
            C12734l2 l2Var = this.f59953c;
            if (l2Var == null || l2Var.mo69465a() <= 0) {
                write(new byte[]{(byte) i}, 0, 1);
                return;
            }
            this.f59953c.mo69466b((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            if (this.f59953c == null) {
                C12734l2 a = C12711i1.this.f59946h.mo69474a(i2);
                this.f59953c = a;
                this.f59952a.add(a);
            }
            while (i2 > 0) {
                int min = Math.min(i2, this.f59953c.mo69465a());
                if (min == 0) {
                    C12734l2 a2 = C12711i1.this.f59946h.mo69474a(Math.max(i2, this.f59953c.mo69467l() * 2));
                    this.f59953c = a2;
                    this.f59952a.add(a2);
                } else {
                    this.f59953c.write(bArr, i, min);
                    i += min;
                    i2 -= min;
                }
            }
        }
    }
}
