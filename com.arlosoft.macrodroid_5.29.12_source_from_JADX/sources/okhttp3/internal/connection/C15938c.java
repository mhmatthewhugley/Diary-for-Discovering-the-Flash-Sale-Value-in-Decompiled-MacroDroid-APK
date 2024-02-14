package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15919e0;
import okhttp3.C15975r;
import p226cd.C11179b;
import p226cd.C11190f;
import p226cd.C11191g;
import p226cd.C11196l;
import p226cd.C11210w;
import p226cd.C11212y;
import p408uc.C16688d;
import p408uc.C16692h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u001f\u0018B'\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00105\u001a\u000201\u0012\u0006\u0010:\u001a\u000206\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004J9\u0010\u001f\u001a\u00028\u0000\"\n\b\u0000\u0010\u001a*\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010!\u001a\u00020\u0004R$\u0010&\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8\u0000@BX\u000e¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020'8\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010*R\u001a\u00100\u001a\u00020,8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\u0002018\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u0002068\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\t8@X\u0004¢\u0006\u0006\u001a\u0004\b;\u0010%¨\u0006A"}, mo71668d2 = {"Lokhttp3/internal/connection/c;", "", "Ljava/io/IOException;", "e", "Lja/u;", "s", "Lokhttp3/b0;", "request", "t", "", "duplex", "Lcd/w;", "c", "f", "r", "expectContinue", "Lokhttp3/d0$a;", "p", "Lokhttp3/d0;", "response", "q", "Lokhttp3/e0;", "o", "m", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "n", "<set-?>", "Z", "l", "()Z", "isDuplex", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "h", "()Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/internal/connection/e;", "Lokhttp3/internal/connection/e;", "g", "()Lokhttp3/internal/connection/e;", "call", "Lokhttp3/r;", "Lokhttp3/r;", "i", "()Lokhttp3/r;", "eventListener", "Lokhttp3/internal/connection/d;", "Lokhttp3/internal/connection/d;", "j", "()Lokhttp3/internal/connection/d;", "finder", "k", "isCoalescedConnection", "Luc/d;", "codec", "<init>", "(Lokhttp3/internal/connection/e;Lokhttp3/r;Lokhttp3/internal/connection/d;Luc/d;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.c */
/* compiled from: Exchange.kt */
public final class C15938c {

    /* renamed from: a */
    private boolean f65639a;

    /* renamed from: b */
    private final C15946f f65640b;

    /* renamed from: c */
    private final C15942e f65641c;

    /* renamed from: d */
    private final C15975r f65642d;

    /* renamed from: e */
    private final C15941d f65643e;

    /* renamed from: f */
    private final C16688d f65644f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u001e"}, mo71668d2 = {"Lokhttp3/internal/connection/c$a;", "Lcd/f;", "Ljava/io/IOException;", "E", "e", "b", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lcd/b;", "source", "", "byteCount", "Lja/u;", "X", "flush", "close", "", "c", "Z", "completed", "d", "J", "bytesReceived", "f", "closed", "g", "contentLength", "Lcd/w;", "delegate", "<init>", "(Lokhttp3/internal/connection/c;Lcd/w;J)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.c$a */
    /* compiled from: Exchange.kt */
    private final class C15939a extends C11190f {

        /* renamed from: c */
        private boolean f65645c;

        /* renamed from: d */
        private long f65646d;

        /* renamed from: f */
        private boolean f65647f;

        /* renamed from: g */
        private final long f65648g;

        /* renamed from: o */
        final /* synthetic */ C15938c f65649o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15939a(C15938c cVar, C11210w wVar, long j) {
            super(wVar);
            C13706o.m87929f(wVar, "delegate");
            this.f65649o = cVar;
            this.f65648g = j;
        }

        /* renamed from: b */
        private final <E extends IOException> E m96094b(E e) {
            if (this.f65645c) {
                return e;
            }
            this.f65645c = true;
            return this.f65649o.mo76069a(this.f65646d, false, true, e);
        }

        /* renamed from: X */
        public void mo62384X(C11179b bVar, long j) throws IOException {
            C13706o.m87929f(bVar, "source");
            if (!this.f65647f) {
                long j2 = this.f65648g;
                if (j2 == -1 || this.f65646d + j <= j2) {
                    try {
                        super.mo62384X(bVar, j);
                        this.f65646d += j;
                    } catch (IOException e) {
                        throw m96094b(e);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f65648g + " bytes but received " + (this.f65646d + j));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() throws IOException {
            if (!this.f65647f) {
                this.f65647f = true;
                long j = this.f65648g;
                if (j == -1 || this.f65646d == j) {
                    try {
                        super.close();
                        m96094b((IOException) null);
                    } catch (IOException e) {
                        throw m96094b(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m96094b(e);
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e¨\u0006\u001e"}, mo71668d2 = {"Lokhttp3/internal/connection/c$b;", "Lcd/g;", "Lcd/b;", "sink", "", "byteCount", "m0", "Lja/u;", "close", "Ljava/io/IOException;", "E", "e", "c", "(Ljava/io/IOException;)Ljava/io/IOException;", "J", "bytesReceived", "", "d", "Z", "invokeStartEvent", "f", "completed", "g", "closed", "o", "contentLength", "Lcd/y;", "delegate", "<init>", "(Lokhttp3/internal/connection/c;Lcd/y;J)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.c$b */
    /* compiled from: Exchange.kt */
    public final class C15940b extends C11191g {

        /* renamed from: c */
        private long f65650c;

        /* renamed from: d */
        private boolean f65651d = true;

        /* renamed from: f */
        private boolean f65652f;

        /* renamed from: g */
        private boolean f65653g;

        /* renamed from: o */
        private final long f65654o;

        /* renamed from: p */
        final /* synthetic */ C15938c f65655p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15940b(C15938c cVar, C11212y yVar, long j) {
            super(yVar);
            C13706o.m87929f(yVar, "delegate");
            this.f65655p = cVar;
            this.f65654o = j;
            if (j == 0) {
                mo76088c((IOException) null);
            }
        }

        /* renamed from: c */
        public final <E extends IOException> E mo76088c(E e) {
            if (this.f65652f) {
                return e;
            }
            this.f65652f = true;
            if (e == null && this.f65651d) {
                this.f65651d = false;
                this.f65655p.mo76077i().mo76222v(this.f65655p.mo76075g());
            }
            return this.f65655p.mo76069a(this.f65650c, true, false, e);
        }

        public void close() throws IOException {
            if (!this.f65653g) {
                this.f65653g = true;
                try {
                    super.close();
                    mo76088c((IOException) null);
                } catch (IOException e) {
                    throw mo76088c(e);
                }
            }
        }

        /* renamed from: m0 */
        public long mo62392m0(C11179b bVar, long j) throws IOException {
            C13706o.m87929f(bVar, "sink");
            if (!this.f65653g) {
                try {
                    long m0 = mo62518b().mo62392m0(bVar, j);
                    if (this.f65651d) {
                        this.f65651d = false;
                        this.f65655p.mo76077i().mo76222v(this.f65655p.mo76075g());
                    }
                    if (m0 == -1) {
                        mo76088c((IOException) null);
                        return -1;
                    }
                    long j2 = this.f65650c + m0;
                    long j3 = this.f65654o;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f65654o + " bytes but received " + j2);
                        }
                    }
                    this.f65650c = j2;
                    if (j2 == j3) {
                        mo76088c((IOException) null);
                    }
                    return m0;
                } catch (IOException e) {
                    throw mo76088c(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public C15938c(C15942e eVar, C15975r rVar, C15941d dVar, C16688d dVar2) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(rVar, "eventListener");
        C13706o.m87929f(dVar, "finder");
        C13706o.m87929f(dVar2, "codec");
        this.f65641c = eVar;
        this.f65642d = rVar;
        this.f65643e = dVar;
        this.f65644f = dVar2;
        this.f65640b = dVar2.mo79585c();
    }

    /* renamed from: s */
    private final void m96074s(IOException iOException) {
        this.f65643e.mo76093h(iOException);
        this.f65644f.mo79585c().mo76125H(this.f65641c, iOException);
    }

    /* renamed from: a */
    public final <E extends IOException> E mo76069a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            m96074s(e);
        }
        if (z2) {
            if (e != null) {
                this.f65642d.mo76218r(this.f65641c, e);
            } else {
                this.f65642d.mo76216p(this.f65641c, j);
            }
        }
        if (z) {
            if (e != null) {
                this.f65642d.mo76223w(this.f65641c, e);
            } else {
                this.f65642d.mo76221u(this.f65641c, j);
            }
        }
        return this.f65641c.mo76109u(this, z2, z, e);
    }

    /* renamed from: b */
    public final void mo76070b() {
        this.f65644f.cancel();
    }

    /* renamed from: c */
    public final C11210w mo76071c(C15904b0 b0Var, boolean z) throws IOException {
        C13706o.m87929f(b0Var, "request");
        this.f65639a = z;
        C15907c0 a = b0Var.mo75911a();
        C13706o.m87926c(a);
        long a2 = a.mo75937a();
        this.f65642d.mo76217q(this.f65641c);
        return new C15939a(this, this.f65644f.mo79588e(b0Var, a2), a2);
    }

    /* renamed from: d */
    public final void mo76072d() {
        this.f65644f.cancel();
        this.f65641c.mo76109u(this, true, true, null);
    }

    /* renamed from: e */
    public final void mo76073e() throws IOException {
        try {
            this.f65644f.mo79583a();
        } catch (IOException e) {
            this.f65642d.mo76218r(this.f65641c, e);
            m96074s(e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void mo76074f() throws IOException {
        try {
            this.f65644f.mo79591h();
        } catch (IOException e) {
            this.f65642d.mo76218r(this.f65641c, e);
            m96074s(e);
            throw e;
        }
    }

    /* renamed from: g */
    public final C15942e mo76075g() {
        return this.f65641c;
    }

    /* renamed from: h */
    public final C15946f mo76076h() {
        return this.f65640b;
    }

    /* renamed from: i */
    public final C15975r mo76077i() {
        return this.f65642d;
    }

    /* renamed from: j */
    public final C15941d mo76078j() {
        return this.f65643e;
    }

    /* renamed from: k */
    public final boolean mo76079k() {
        return !C13706o.m87924a(this.f65643e.mo76090d().mo75907l().mo76269i(), this.f65640b.mo76121A().mo76025a().mo75907l().mo76269i());
    }

    /* renamed from: l */
    public final boolean mo76080l() {
        return this.f65639a;
    }

    /* renamed from: m */
    public final void mo76081m() {
        this.f65644f.mo79585c().mo76144z();
    }

    /* renamed from: n */
    public final void mo76082n() {
        this.f65641c.mo76109u(this, true, false, null);
    }

    /* renamed from: o */
    public final C15919e0 mo76083o(C15915d0 d0Var) throws IOException {
        C13706o.m87929f(d0Var, "response");
        try {
            String o = C15915d0.m95985o(d0Var, "Content-Type", (String) null, 2, (Object) null);
            long d = this.f65644f.mo79587d(d0Var);
            return new C16692h(o, d, C11196l.m75163b(new C15940b(this, this.f65644f.mo79584b(d0Var), d)));
        } catch (IOException e) {
            this.f65642d.mo76223w(this.f65641c, e);
            m96074s(e);
            throw e;
        }
    }

    /* renamed from: p */
    public final C15915d0.C15916a mo76084p(boolean z) throws IOException {
        try {
            C15915d0.C15916a g = this.f65644f.mo79590g(z);
            if (g != null) {
                g.mo75995l(this);
            }
            return g;
        } catch (IOException e) {
            this.f65642d.mo76223w(this.f65641c, e);
            m96074s(e);
            throw e;
        }
    }

    /* renamed from: q */
    public final void mo76085q(C15915d0 d0Var) {
        C13706o.m87929f(d0Var, "response");
        this.f65642d.mo76224x(this.f65641c, d0Var);
    }

    /* renamed from: r */
    public final void mo76086r() {
        this.f65642d.mo76225y(this.f65641c);
    }

    /* renamed from: t */
    public final void mo76087t(C15904b0 b0Var) throws IOException {
        C13706o.m87929f(b0Var, "request");
        try {
            this.f65642d.mo76220t(this.f65641c);
            this.f65644f.mo79589f(b0Var);
            this.f65642d.mo76219s(this.f65641c, b0Var);
        } catch (IOException e) {
            this.f65642d.mo76218r(this.f65641c, e);
            m96074s(e);
            throw e;
        }
    }
}
