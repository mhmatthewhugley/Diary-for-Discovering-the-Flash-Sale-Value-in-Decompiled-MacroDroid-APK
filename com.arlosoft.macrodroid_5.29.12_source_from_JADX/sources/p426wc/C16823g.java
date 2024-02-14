package p426wc;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p226cd.C11179b;
import p226cd.C11186d;
import p226cd.C11188e;
import p226cd.C11212y;
import p226cd.C11213z;
import p372qc.C16279b;
import p424wa.C16785c;
import p426wc.C16798c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003!\"\u001aB\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\bH\u0016¨\u0006#"}, mo71668d2 = {"Lwc/g;", "Ljava/io/Closeable;", "Lwc/g$c;", "handler", "", "length", "flags", "streamId", "Lja/u;", "i", "padding", "", "Lwc/b;", "h", "f", "o", "m", "r", "s", "p", "j", "g", "u", "e", "", "requireSettings", "c", "close", "Lcd/d;", "source", "client", "<init>", "(Lcd/d;Z)V", "a", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.g */
/* compiled from: Http2Reader.kt */
public final class C16823g implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Logger f67952g;

    /* renamed from: o */
    public static final C16824a f67953o = new C16824a((C13695i) null);

    /* renamed from: a */
    private final C16825b f67954a;

    /* renamed from: c */
    private final C16798c.C16799a f67955c;

    /* renamed from: d */
    private final C11186d f67956d;

    /* renamed from: f */
    private final boolean f67957f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo71668d2 = {"Lwc/g$a;", "", "", "length", "flags", "padding", "b", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.g$a */
    /* compiled from: Http2Reader.kt */
    public static final class C16824a {
        private C16824a() {
        }

        public /* synthetic */ C16824a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Logger mo79877a() {
            return C16823g.f67952g;
        }

        /* renamed from: b */
        public final int mo79878b(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006#"}, mo71668d2 = {"Lwc/g$b;", "Lcd/y;", "Lja/u;", "c", "Lcd/b;", "sink", "", "byteCount", "m0", "Lcd/z;", "q", "close", "", "length", "I", "getLength", "()I", "g", "(I)V", "flags", "getFlags", "e", "streamId", "getStreamId", "i", "left", "b", "f", "padding", "getPadding", "h", "Lcd/d;", "source", "<init>", "(Lcd/d;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.g$b */
    /* compiled from: Http2Reader.kt */
    public static final class C16825b implements C11212y {

        /* renamed from: a */
        private int f67958a;

        /* renamed from: c */
        private int f67959c;

        /* renamed from: d */
        private int f67960d;

        /* renamed from: f */
        private int f67961f;

        /* renamed from: g */
        private int f67962g;

        /* renamed from: o */
        private final C11186d f67963o;

        public C16825b(C11186d dVar) {
            C13706o.m87929f(dVar, "source");
            this.f67963o = dVar;
        }

        /* renamed from: c */
        private final void m99720c() throws IOException {
            int i = this.f67960d;
            int G = C16279b.m97631G(this.f67963o);
            this.f67961f = G;
            this.f67958a = G;
            int b = C16279b.m97648b(this.f67963o.readByte(), 255);
            this.f67959c = C16279b.m97648b(this.f67963o.readByte(), 255);
            C16824a aVar = C16823g.f67953o;
            if (aVar.mo79877a().isLoggable(Level.FINE)) {
                aVar.mo79877a().fine(C16801d.f67834e.mo79811c(true, this.f67960d, this.f67958a, b, this.f67959c));
            }
            int readInt = this.f67963o.readInt() & Integer.MAX_VALUE;
            this.f67960d = readInt;
            if (b != 9) {
                throw new IOException(b + " != TYPE_CONTINUATION");
            } else if (readInt != i) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        /* renamed from: b */
        public final int mo79879b() {
            return this.f67961f;
        }

        public void close() throws IOException {
        }

        /* renamed from: e */
        public final void mo79880e(int i) {
            this.f67959c = i;
        }

        /* renamed from: f */
        public final void mo79881f(int i) {
            this.f67961f = i;
        }

        /* renamed from: g */
        public final void mo79882g(int i) {
            this.f67958a = i;
        }

        /* renamed from: h */
        public final void mo79883h(int i) {
            this.f67962g = i;
        }

        /* renamed from: i */
        public final void mo79884i(int i) {
            this.f67960d = i;
        }

        /* renamed from: m0 */
        public long mo62392m0(C11179b bVar, long j) throws IOException {
            C13706o.m87929f(bVar, "sink");
            while (true) {
                int i = this.f67961f;
                if (i == 0) {
                    this.f67963o.skip((long) this.f67962g);
                    this.f67962g = 0;
                    if ((this.f67959c & 4) != 0) {
                        return -1;
                    }
                    m99720c();
                } else {
                    long m0 = this.f67963o.mo62392m0(bVar, Math.min(j, (long) i));
                    if (m0 == -1) {
                        return -1;
                    }
                    this.f67961f -= (int) m0;
                    return m0;
                }
            }
        }

        /* renamed from: q */
        public C11213z mo62393q() {
            return this.f67963o.mo62393q();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\tH&J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&J(\u0010&\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H&J&\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006*"}, mo71668d2 = {"Lwc/g$c;", "", "", "inFinished", "", "streamId", "Lcd/d;", "source", "length", "Lja/u;", "w", "associatedStreamId", "", "Lwc/b;", "headerBlock", "a", "Lwc/a;", "errorCode", "b", "clearPrevious", "Lwc/l;", "settings", "c", "v", "ack", "payload1", "payload2", "k", "lastGoodStreamId", "Lcd/e;", "debugData", "g", "", "windowSizeIncrement", "d", "streamDependency", "weight", "exclusive", "x", "promisedStreamId", "requestHeaders", "u", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.g$c */
    /* compiled from: Http2Reader.kt */
    public interface C16826c {
        /* renamed from: a */
        void mo79860a(boolean z, int i, int i2, List<C16796b> list);

        /* renamed from: b */
        void mo79861b(int i, C16794a aVar);

        /* renamed from: c */
        void mo79862c(boolean z, C16839l lVar);

        /* renamed from: d */
        void mo79863d(int i, long j);

        /* renamed from: g */
        void mo79864g(int i, C16794a aVar, C11188e eVar);

        /* renamed from: k */
        void mo79867k(boolean z, int i, int i2);

        /* renamed from: u */
        void mo79868u(int i, int i2, List<C16796b> list) throws IOException;

        /* renamed from: v */
        void mo79869v();

        /* renamed from: w */
        void mo79870w(boolean z, int i, C11186d dVar, int i2) throws IOException;

        /* renamed from: x */
        void mo79871x(int i, int i2, int i3, boolean z);
    }

    static {
        Logger logger = Logger.getLogger(C16801d.class.getName());
        C13706o.m87928e(logger, "Logger.getLogger(Http2::class.java.name)");
        f67952g = logger;
    }

    public C16823g(C11186d dVar, boolean z) {
        C13706o.m87929f(dVar, "source");
        this.f67956d = dVar;
        this.f67957f = z;
        C16825b bVar = new C16825b(dVar);
        this.f67954a = bVar;
        this.f67955c = new C16798c.C16799a(bVar, 4096, 0, 4, (C13695i) null);
    }

    /* renamed from: f */
    private final void m99705f(C16826c cVar, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = true;
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((i2 & 8) != 0) {
                    i4 = C16279b.m97648b(this.f67956d.readByte(), 255);
                }
                cVar.mo79870w(z2, i3, this.f67956d, f67953o.mo79878b(i, i2, i4));
                this.f67956d.skip((long) i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* renamed from: g */
    private final void m99706g(C16826c cVar, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f67956d.readInt();
            int readInt2 = this.f67956d.readInt();
            int i4 = i - 8;
            C16794a a = C16794a.f67789G.mo79792a(readInt2);
            if (a != null) {
                C11188e eVar = C11188e.f54105f;
                if (i4 > 0) {
                    eVar = this.f67956d.mo62438i1((long) i4);
                }
                cVar.mo79864g(readInt, a, eVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    /* renamed from: h */
    private final List<C16796b> m99707h(int i, int i2, int i3, int i4) throws IOException {
        this.f67954a.mo79881f(i);
        C16825b bVar = this.f67954a;
        bVar.mo79882g(bVar.mo79879b());
        this.f67954a.mo79883h(i2);
        this.f67954a.mo79880e(i3);
        this.f67954a.mo79884i(i4);
        this.f67955c.mo79803k();
        return this.f67955c.mo79801e();
    }

    /* renamed from: i */
    private final void m99708i(C16826c cVar, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                i4 = C16279b.m97648b(this.f67956d.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                m99710m(cVar, i3);
                i -= 5;
            }
            cVar.mo79860a(z, i3, -1, m99707h(f67953o.mo79878b(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: j */
    private final void m99709j(C16826c cVar, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException("TYPE_PING length != 8: " + i);
        } else if (i3 == 0) {
            int readInt = this.f67956d.readInt();
            int readInt2 = this.f67956d.readInt();
            boolean z = true;
            if ((i2 & 1) == 0) {
                z = false;
            }
            cVar.mo79867k(z, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    /* renamed from: m */
    private final void m99710m(C16826c cVar, int i) throws IOException {
        int readInt = this.f67956d.readInt();
        cVar.mo79871x(i, readInt & Integer.MAX_VALUE, C16279b.m97648b(this.f67956d.readByte(), 255) + 1, (readInt & ((int) 2147483648L)) != 0);
    }

    /* renamed from: o */
    private final void m99711o(C16826c cVar, int i, int i2, int i3) throws IOException {
        if (i != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        } else if (i3 != 0) {
            m99710m(cVar, i3);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    /* renamed from: p */
    private final void m99712p(C16826c cVar, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int b = (i2 & 8) != 0 ? C16279b.m97648b(this.f67956d.readByte(), 255) : 0;
            cVar.mo79868u(i3, this.f67956d.readInt() & Integer.MAX_VALUE, m99707h(f67953o.mo79878b(i - 4, i2, b), b, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    /* renamed from: r */
    private final void m99713r(C16826c cVar, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        } else if (i3 != 0) {
            int readInt = this.f67956d.readInt();
            C16794a a = C16794a.f67789G.mo79792a(readInt);
            if (a != null) {
                cVar.mo79861b(i3, a);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    /* renamed from: s */
    private final void m99714s(C16826c cVar, int i, int i2, int i3) throws IOException {
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i2 & 1) != 0) {
            if (i == 0) {
                cVar.mo79869v();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            C16839l lVar = new C16839l();
            C16785c j = C16792h.m99548j(C16792h.m99549k(0, i), 6);
            int d = j.mo79764d();
            int f = j.mo79766f();
            int h = j.mo79767h();
            if (h < 0 ? d >= f : d <= f) {
                while (true) {
                    int c = C16279b.m97649c(this.f67956d.readShort(), 65535);
                    readInt = this.f67956d.readInt();
                    if (c != 2) {
                        if (c == 3) {
                            c = 4;
                        } else if (c == 4) {
                            c = 7;
                            if (readInt < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                        } else if (c == 5 && (readInt < 16384 || readInt > 16777215)) {
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    lVar.mo79955h(c, readInt);
                    if (d == f) {
                        break;
                    }
                    d += h;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.mo79862c(false, lVar);
        } else {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
        }
    }

    /* renamed from: u */
    private final void m99715u(C16826c cVar, int i, int i2, int i3) throws IOException {
        if (i == 4) {
            long d = C16279b.m97650d(this.f67956d.readInt(), 2147483647L);
            if (d != 0) {
                cVar.mo79863d(i3, d);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
    }

    /* renamed from: c */
    public final boolean mo79874c(boolean z, C16826c cVar) throws IOException {
        C13706o.m87929f(cVar, "handler");
        try {
            this.f67956d.mo62420W0(9);
            int G = C16279b.m97631G(this.f67956d);
            if (G <= 16384) {
                int b = C16279b.m97648b(this.f67956d.readByte(), 255);
                int b2 = C16279b.m97648b(this.f67956d.readByte(), 255);
                int readInt = this.f67956d.readInt() & Integer.MAX_VALUE;
                Logger logger = f67952g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C16801d.f67834e.mo79811c(true, readInt, G, b, b2));
                }
                if (!z || b == 4) {
                    switch (b) {
                        case 0:
                            m99705f(cVar, G, b2, readInt);
                            return true;
                        case 1:
                            m99708i(cVar, G, b2, readInt);
                            return true;
                        case 2:
                            m99711o(cVar, G, b2, readInt);
                            return true;
                        case 3:
                            m99713r(cVar, G, b2, readInt);
                            return true;
                        case 4:
                            m99714s(cVar, G, b2, readInt);
                            return true;
                        case 5:
                            m99712p(cVar, G, b2, readInt);
                            return true;
                        case 6:
                            m99709j(cVar, G, b2, readInt);
                            return true;
                        case 7:
                            m99706g(cVar, G, b2, readInt);
                            return true;
                        case 8:
                            m99715u(cVar, G, b2, readInt);
                            return true;
                        default:
                            this.f67956d.skip((long) G);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + C16801d.f67834e.mo79810b(b));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + G);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() throws IOException {
        this.f67956d.close();
    }

    /* renamed from: e */
    public final void mo79876e(C16826c cVar) throws IOException {
        C13706o.m87929f(cVar, "handler");
        if (!this.f67957f) {
            C11186d dVar = this.f67956d;
            C11188e eVar = C16801d.f67830a;
            C11188e i1 = dVar.mo62438i1((long) eVar.mo62485C());
            Logger logger = f67952g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C16279b.m97663q("<< CONNECTION " + i1.mo62502m(), new Object[0]));
            }
            if (!C13706o.m87924a(eVar, i1)) {
                throw new IOException("Expected a connection header but was " + i1.mo62489H());
            }
        } else if (!mo79874c(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }
}
