package p417vc;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15904b0;
import okhttp3.C15915d0;
import okhttp3.C15967n;
import okhttp3.C15986u;
import okhttp3.C15989v;
import okhttp3.C16002z;
import okhttp3.internal.connection.C15946f;
import org.apache.commons.p353io.IOUtils;
import org.apache.http.protocol.HTTP;
import p226cd.C11179b;
import p226cd.C11184c;
import p226cd.C11186d;
import p226cd.C11192h;
import p226cd.C11210w;
import p226cd.C11212y;
import p226cd.C11213z;
import p372qc.C16279b;
import p408uc.C16688d;
import p408uc.C16689e;
import p408uc.C16693i;
import p408uc.C16696k;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0007\u001c\u001a/\u0019\u0014\u0016%B)\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0016J\u000e\u0010&\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0018\u0010)\u001a\u00020\"*\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010)\u001a\u00020\"*\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00069"}, mo71668d2 = {"Lvc/b;", "Luc/d;", "Lcd/w;", "u", "x", "", "length", "Lcd/y;", "w", "Lokhttp3/v;", "url", "v", "y", "Lcd/h;", "timeout", "Lja/u;", "r", "Lokhttp3/b0;", "request", "contentLength", "e", "cancel", "f", "Lokhttp3/d0;", "response", "d", "b", "h", "a", "Lokhttp3/u;", "headers", "", "requestLine", "A", "", "expectContinue", "Lokhttp3/d0$a;", "g", "z", "t", "(Lokhttp3/d0;)Z", "isChunked", "s", "(Lokhttp3/b0;)Z", "Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/internal/connection/f;", "c", "()Lokhttp3/internal/connection/f;", "Lokhttp3/z;", "client", "Lcd/d;", "source", "Lcd/c;", "sink", "<init>", "(Lokhttp3/z;Lokhttp3/internal/connection/f;Lcd/d;Lcd/c;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: vc.b */
/* compiled from: Http1ExchangeCodec.kt */
public final class C16762b implements C16688d {

    /* renamed from: h */
    public static final C16766d f67701h = new C16766d((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f67702a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16760a f67703b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C15986u f67704c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16002z f67705d;

    /* renamed from: e */
    private final C15946f f67706e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C11186d f67707f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C11184c f67708g;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\"\u0010\f\u001a\u00020\u000b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo71668d2 = {"Lvc/b$a;", "Lcd/y;", "Lcd/z;", "q", "Lcd/b;", "sink", "", "byteCount", "m0", "Lja/u;", "c", "", "closed", "Z", "b", "()Z", "e", "(Z)V", "<init>", "(Lvc/b;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: vc.b$a */
    /* compiled from: Http1ExchangeCodec.kt */
    private abstract class C16763a implements C11212y {

        /* renamed from: a */
        private final C11192h f67709a;

        /* renamed from: c */
        private boolean f67710c;

        public C16763a() {
            this.f67709a = new C11192h(C16762b.this.f67707f.mo62393q());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo79748b() {
            return this.f67710c;
        }

        /* renamed from: c */
        public final void mo79749c() {
            if (C16762b.this.f67702a != 6) {
                if (C16762b.this.f67702a == 5) {
                    C16762b.this.m99448r(this.f67709a);
                    C16762b.this.f67702a = 6;
                    return;
                }
                throw new IllegalStateException("state: " + C16762b.this.f67702a);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final void mo79750e(boolean z) {
            this.f67710c = z;
        }

        /* renamed from: m0 */
        public long mo62392m0(C11179b bVar, long j) {
            C13706o.m87929f(bVar, "sink");
            try {
                return C16762b.this.f67707f.mo62392m0(bVar, j);
            } catch (IOException e) {
                C16762b.this.mo79585c().mo76144z();
                mo79749c();
                throw e;
            }
        }

        /* renamed from: q */
        public C11213z mo62393q() {
            return this.f67709a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u000e"}, mo71668d2 = {"Lvc/b$b;", "Lcd/w;", "Lcd/z;", "q", "Lcd/b;", "source", "", "byteCount", "Lja/u;", "X", "flush", "close", "<init>", "(Lvc/b;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: vc.b$b */
    /* compiled from: Http1ExchangeCodec.kt */
    private final class C16764b implements C11210w {

        /* renamed from: a */
        private final C11192h f67712a;

        /* renamed from: c */
        private boolean f67713c;

        public C16764b() {
            this.f67712a = new C11192h(C16762b.this.f67708g.mo62388q());
        }

        /* renamed from: X */
        public void mo62384X(C11179b bVar, long j) {
            C13706o.m87929f(bVar, "source");
            if (!(!this.f67713c)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                C16762b.this.f67708g.mo62413R1(j);
                C16762b.this.f67708g.mo62455s0(IOUtils.LINE_SEPARATOR_WINDOWS);
                C16762b.this.f67708g.mo62384X(bVar, j);
                C16762b.this.f67708g.mo62455s0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
        }

        public synchronized void close() {
            if (!this.f67713c) {
                this.f67713c = true;
                C16762b.this.f67708g.mo62455s0("0\r\n\r\n");
                C16762b.this.m99448r(this.f67712a);
                C16762b.this.f67702a = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f67713c) {
                C16762b.this.f67708g.flush();
            }
        }

        /* renamed from: q */
        public C11213z mo62388q() {
            return this.f67712a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, mo71668d2 = {"Lvc/b$c;", "Lvc/b$a;", "Lvc/b;", "Lja/u;", "f", "Lcd/b;", "sink", "", "byteCount", "m0", "close", "Lokhttp3/v;", "url", "<init>", "(Lvc/b;Lokhttp3/v;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: vc.b$c */
    /* compiled from: Http1ExchangeCodec.kt */
    private final class C16765c extends C16763a {

        /* renamed from: f */
        private long f67715f = -1;

        /* renamed from: g */
        private boolean f67716g = true;

        /* renamed from: o */
        private final C15989v f67717o;

        /* renamed from: p */
        final /* synthetic */ C16762b f67718p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16765c(C16762b bVar, C15989v vVar) {
            super();
            C13706o.m87929f(vVar, "url");
            this.f67718p = bVar;
            this.f67717o = vVar;
        }

        /* renamed from: f */
        private final void m99473f() {
            if (this.f67715f != -1) {
                this.f67718p.f67707f.mo62401F0();
            }
            try {
                this.f67715f = this.f67718p.f67707f.mo62441j2();
                String F0 = this.f67718p.f67707f.mo62401F0();
                if (F0 != null) {
                    String obj = C15177w.m93672R0(F0).toString();
                    if (this.f67715f >= 0) {
                        if (!(obj.length() > 0) || C15176v.m93634I(obj, ";", false, 2, (Object) null)) {
                            if (this.f67715f == 0) {
                                this.f67716g = false;
                                C16762b bVar = this.f67718p;
                                bVar.f67704c = bVar.f67703b.mo79744a();
                                C16002z j = this.f67718p.f67705d;
                                C13706o.m87926c(j);
                                C15967n n = j.mo76347n();
                                C15989v vVar = this.f67717o;
                                C15986u o = this.f67718p.f67704c;
                                C13706o.m87926c(o);
                                C16689e.m99152f(n, vVar, o);
                                mo79749c();
                                return;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f67715f + obj + '\"');
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!mo79748b()) {
                if (this.f67716g && !C16279b.m97662p(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f67718p.mo79585c().mo76144z();
                    mo79749c();
                }
                mo79750e(true);
            }
        }

        /* renamed from: m0 */
        public long mo62392m0(C11179b bVar, long j) {
            C13706o.m87929f(bVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(true ^ mo79748b())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f67716g) {
                return -1;
            } else {
                long j2 = this.f67715f;
                if (j2 == 0 || j2 == -1) {
                    m99473f();
                    if (!this.f67716g) {
                        return -1;
                    }
                }
                long m0 = super.mo62392m0(bVar, Math.min(j, this.f67715f));
                if (m0 != -1) {
                    this.f67715f -= m0;
                    return m0;
                }
                this.f67718p.mo79585c().mo76144z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo79749c();
                throw protocolException;
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, mo71668d2 = {"Lvc/b$d;", "", "", "NO_CHUNK_YET", "J", "", "STATE_CLOSED", "I", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: vc.b$d */
    /* compiled from: Http1ExchangeCodec.kt */
    public static final class C16766d {
        private C16766d() {
        }

        public /* synthetic */ C16766d(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, mo71668d2 = {"Lvc/b$e;", "Lvc/b$a;", "Lvc/b;", "Lcd/b;", "sink", "", "byteCount", "m0", "Lja/u;", "close", "bytesRemaining", "<init>", "(Lvc/b;J)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: vc.b$e */
    /* compiled from: Http1ExchangeCodec.kt */
    private final class C16767e extends C16763a {

        /* renamed from: f */
        private long f67719f;

        public C16767e(long j) {
            super();
            this.f67719f = j;
            if (j == 0) {
                mo79749c();
            }
        }

        public void close() {
            if (!mo79748b()) {
                if (this.f67719f != 0 && !C16279b.m97662p(this, 100, TimeUnit.MILLISECONDS)) {
                    C16762b.this.mo79585c().mo76144z();
                    mo79749c();
                }
                mo79750e(true);
            }
        }

        /* renamed from: m0 */
        public long mo62392m0(C11179b bVar, long j) {
            C13706o.m87929f(bVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (true ^ mo79748b()) {
                long j2 = this.f67719f;
                if (j2 == 0) {
                    return -1;
                }
                long m0 = super.mo62392m0(bVar, Math.min(j2, j));
                if (m0 != -1) {
                    long j3 = this.f67719f - m0;
                    this.f67719f = j3;
                    if (j3 == 0) {
                        mo79749c();
                    }
                    return m0;
                }
                C16762b.this.mo79585c().mo76144z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo79749c();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u000e"}, mo71668d2 = {"Lvc/b$f;", "Lcd/w;", "Lcd/z;", "q", "Lcd/b;", "source", "", "byteCount", "Lja/u;", "X", "flush", "close", "<init>", "(Lvc/b;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: vc.b$f */
    /* compiled from: Http1ExchangeCodec.kt */
    private final class C16768f implements C11210w {

        /* renamed from: a */
        private final C11192h f67721a;

        /* renamed from: c */
        private boolean f67722c;

        public C16768f() {
            this.f67721a = new C11192h(C16762b.this.f67708g.mo62388q());
        }

        /* renamed from: X */
        public void mo62384X(C11179b bVar, long j) {
            C13706o.m87929f(bVar, "source");
            if (!this.f67722c) {
                C16279b.m97655i(bVar.mo62399D(), 0, j);
                C16762b.this.f67708g.mo62384X(bVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public void close() {
            if (!this.f67722c) {
                this.f67722c = true;
                C16762b.this.m99448r(this.f67721a);
                C16762b.this.f67702a = 3;
            }
        }

        public void flush() {
            if (!this.f67722c) {
                C16762b.this.f67708g.flush();
            }
        }

        /* renamed from: q */
        public C11213z mo62388q() {
            return this.f67721a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, mo71668d2 = {"Lvc/b$g;", "Lvc/b$a;", "Lvc/b;", "Lcd/b;", "sink", "", "byteCount", "m0", "Lja/u;", "close", "<init>", "(Lvc/b;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: vc.b$g */
    /* compiled from: Http1ExchangeCodec.kt */
    private final class C16769g extends C16763a {

        /* renamed from: f */
        private boolean f67724f;

        public C16769g() {
            super();
        }

        public void close() {
            if (!mo79748b()) {
                if (!this.f67724f) {
                    mo79749c();
                }
                mo79750e(true);
            }
        }

        /* renamed from: m0 */
        public long mo62392m0(C11179b bVar, long j) {
            C13706o.m87929f(bVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(!mo79748b())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f67724f) {
                return -1;
            } else {
                long m0 = super.mo62392m0(bVar, j);
                if (m0 != -1) {
                    return m0;
                }
                this.f67724f = true;
                mo79749c();
                return -1;
            }
        }
    }

    public C16762b(C16002z zVar, C15946f fVar, C11186d dVar, C11184c cVar) {
        C13706o.m87929f(fVar, "connection");
        C13706o.m87929f(dVar, "source");
        C13706o.m87929f(cVar, "sink");
        this.f67705d = zVar;
        this.f67706e = fVar;
        this.f67707f = dVar;
        this.f67708g = cVar;
        this.f67703b = new C16760a(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m99448r(C11192h hVar) {
        C11213z i = hVar.mo62527i();
        hVar.mo62528j(C11213z.f54158e);
        i.mo62520a();
        i.mo62521b();
    }

    /* renamed from: s */
    private final boolean m99449s(C15904b0 b0Var) {
        return C15176v.m93641v(HTTP.CHUNK_CODING, b0Var.mo75914d(HTTP.TRANSFER_ENCODING), true);
    }

    /* renamed from: t */
    private final boolean m99450t(C15915d0 d0Var) {
        return C15176v.m93641v(HTTP.CHUNK_CODING, C15915d0.m95985o(d0Var, HTTP.TRANSFER_ENCODING, (String) null, 2, (Object) null), true);
    }

    /* renamed from: u */
    private final C11210w m99451u() {
        boolean z = true;
        if (this.f67702a != 1) {
            z = false;
        }
        if (z) {
            this.f67702a = 2;
            return new C16764b();
        }
        throw new IllegalStateException(("state: " + this.f67702a).toString());
    }

    /* renamed from: v */
    private final C11212y m99452v(C15989v vVar) {
        if (this.f67702a == 4) {
            this.f67702a = 5;
            return new C16765c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.f67702a).toString());
    }

    /* renamed from: w */
    private final C11212y m99453w(long j) {
        if (this.f67702a == 4) {
            this.f67702a = 5;
            return new C16767e(j);
        }
        throw new IllegalStateException(("state: " + this.f67702a).toString());
    }

    /* renamed from: x */
    private final C11210w m99454x() {
        boolean z = true;
        if (this.f67702a != 1) {
            z = false;
        }
        if (z) {
            this.f67702a = 2;
            return new C16768f();
        }
        throw new IllegalStateException(("state: " + this.f67702a).toString());
    }

    /* renamed from: y */
    private final C11212y m99455y() {
        if (this.f67702a == 4) {
            this.f67702a = 5;
            mo79585c().mo76144z();
            return new C16769g();
        }
        throw new IllegalStateException(("state: " + this.f67702a).toString());
    }

    /* renamed from: A */
    public final void mo79746A(C15986u uVar, String str) {
        C13706o.m87929f(uVar, "headers");
        C13706o.m87929f(str, "requestLine");
        if (this.f67702a == 0) {
            this.f67708g.mo62455s0(str).mo62455s0(IOUtils.LINE_SEPARATOR_WINDOWS);
            int size = uVar.size();
            for (int i = 0; i < size; i++) {
                this.f67708g.mo62455s0(uVar.mo76242d(i)).mo62455s0(": ").mo62455s0(uVar.mo76246i(i)).mo62455s0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            this.f67708g.mo62455s0(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f67702a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f67702a).toString());
    }

    /* renamed from: a */
    public void mo79583a() {
        this.f67708g.flush();
    }

    /* renamed from: b */
    public C11212y mo79584b(C15915d0 d0Var) {
        C13706o.m87929f(d0Var, "response");
        if (!C16689e.m99148b(d0Var)) {
            return m99453w(0);
        }
        if (m99450t(d0Var)) {
            return m99452v(d0Var.mo75984y().mo75920j());
        }
        long s = C16279b.m97665s(d0Var);
        if (s != -1) {
            return m99453w(s);
        }
        return m99455y();
    }

    /* renamed from: c */
    public C15946f mo79585c() {
        return this.f67706e;
    }

    public void cancel() {
        mo79585c().mo76129e();
    }

    /* renamed from: d */
    public long mo79587d(C15915d0 d0Var) {
        C13706o.m87929f(d0Var, "response");
        if (!C16689e.m99148b(d0Var)) {
            return 0;
        }
        if (m99450t(d0Var)) {
            return -1;
        }
        return C16279b.m97665s(d0Var);
    }

    /* renamed from: e */
    public C11210w mo79588e(C15904b0 b0Var, long j) {
        C13706o.m87929f(b0Var, "request");
        if (b0Var.mo75911a() != null && b0Var.mo75911a().mo75939f()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (m99449s(b0Var)) {
            return m99451u();
        } else {
            if (j != -1) {
                return m99454x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: f */
    public void mo79589f(C15904b0 b0Var) {
        C13706o.m87929f(b0Var, "request");
        C16693i iVar = C16693i.f67593a;
        Proxy.Type type = mo79585c().mo76121A().mo76026b().type();
        C13706o.m87928e(type, "connection.route().proxy.type()");
        mo79746A(b0Var.mo75915e(), iVar.mo79602a(b0Var, type));
    }

    /* renamed from: g */
    public C15915d0.C15916a mo79590g(boolean z) {
        int i = this.f67702a;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                C16696k a = C16696k.f67596d.mo79605a(this.f67703b.mo79745b());
                C15915d0.C15916a k = new C15915d0.C15916a().mo75999p(a.f67597a).mo75990g(a.f67598b).mo75996m(a.f67599c).mo75994k(this.f67703b.mo79744a());
                if (z && a.f67598b == 100) {
                    return null;
                }
                if (a.f67598b == 100) {
                    this.f67702a = 3;
                    return k;
                }
                this.f67702a = 4;
                return k;
            } catch (EOFException e) {
                String p = mo79585c().mo76121A().mo76025a().mo75907l().mo76276p();
                throw new IOException("unexpected end of stream on " + p, e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f67702a).toString());
        }
    }

    /* renamed from: h */
    public void mo79591h() {
        this.f67708g.flush();
    }

    /* renamed from: z */
    public final void mo79747z(C15915d0 d0Var) {
        C13706o.m87929f(d0Var, "response");
        long s = C16279b.m97665s(d0Var);
        if (s != -1) {
            C11212y w = m99453w(s);
            C16279b.m97633I(w, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w.close();
        }
    }
}
