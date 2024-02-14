package p426wc;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15899a0;
import okhttp3.C15904b0;
import okhttp3.C15915d0;
import okhttp3.C15986u;
import okhttp3.C16002z;
import okhttp3.internal.connection.C15946f;
import org.apache.http.protocol.HTTP;
import p226cd.C11210w;
import p226cd.C11212y;
import p372qc.C16279b;
import p408uc.C16688d;
import p408uc.C16689e;
import p408uc.C16691g;
import p408uc.C16693i;
import p408uc.C16696k;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, mo71668d2 = {"Lwc/f;", "Luc/d;", "Lokhttp3/b0;", "request", "", "contentLength", "Lcd/w;", "e", "Lja/u;", "f", "h", "a", "", "expectContinue", "Lokhttp3/d0$a;", "g", "Lokhttp3/d0;", "response", "d", "Lcd/y;", "b", "cancel", "Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/internal/connection/f;", "c", "()Lokhttp3/internal/connection/f;", "Lokhttp3/z;", "client", "Luc/g;", "chain", "Lwc/e;", "http2Connection", "<init>", "(Lokhttp3/z;Lokhttp3/internal/connection/f;Luc/g;Lwc/e;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.f */
/* compiled from: Http2ExchangeCodec.kt */
public final class C16821f implements C16688d {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final List<String> f67943g = C16279b.m97666t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final List<String> f67944h = C16279b.m97666t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: i */
    public static final C16822a f67945i = new C16822a((C13695i) null);

    /* renamed from: a */
    private volatile C16827h f67946a;

    /* renamed from: b */
    private final C15899a0 f67947b;

    /* renamed from: c */
    private volatile boolean f67948c;

    /* renamed from: d */
    private final C15946f f67949d;

    /* renamed from: e */
    private final C16691g f67950e;

    /* renamed from: f */
    private final C16802e f67951f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, mo71668d2 = {"Lwc/f$a;", "", "Lokhttp3/b0;", "request", "", "Lwc/b;", "a", "Lokhttp3/u;", "headerBlock", "Lokhttp3/a0;", "protocol", "Lokhttp3/d0$a;", "b", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.f$a */
    /* compiled from: Http2ExchangeCodec.kt */
    public static final class C16822a {
        private C16822a() {
        }

        public /* synthetic */ C16822a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final List<C16796b> mo79872a(C15904b0 b0Var) {
            C13706o.m87929f(b0Var, "request");
            C15986u e = b0Var.mo75915e();
            ArrayList arrayList = new ArrayList(e.size() + 4);
            arrayList.add(new C16796b(C16796b.f67801f, b0Var.mo75917g()));
            arrayList.add(new C16796b(C16796b.f67802g, C16693i.f67593a.mo79603c(b0Var.mo75920j())));
            String d = b0Var.mo75914d(HTTP.TARGET_HOST);
            if (d != null) {
                arrayList.add(new C16796b(C16796b.f67804i, d));
            }
            arrayList.add(new C16796b(C16796b.f67803h, b0Var.mo75920j().mo76278r()));
            int size = e.size();
            for (int i = 0; i < size; i++) {
                String d2 = e.mo76242d(i);
                Locale locale = Locale.US;
                C13706o.m87928e(locale, "Locale.US");
                Objects.requireNonNull(d2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = d2.toLowerCase(locale);
                C13706o.m87928e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!C16821f.f67943g.contains(lowerCase) || (C13706o.m87924a(lowerCase, "te") && C13706o.m87924a(e.mo76246i(i), "trailers"))) {
                    arrayList.add(new C16796b(lowerCase, e.mo76246i(i)));
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C15915d0.C15916a mo79873b(C15986u uVar, C15899a0 a0Var) {
            C13706o.m87929f(uVar, "headerBlock");
            C13706o.m87929f(a0Var, "protocol");
            C15986u.C15987a aVar = new C15986u.C15987a();
            int size = uVar.size();
            C16696k kVar = null;
            for (int i = 0; i < size; i++) {
                String d = uVar.mo76242d(i);
                String i2 = uVar.mo76246i(i);
                if (C13706o.m87924a(d, ":status")) {
                    C16696k.C16697a aVar2 = C16696k.f67596d;
                    kVar = aVar2.mo79605a("HTTP/1.1 " + i2);
                } else if (!C16821f.f67944h.contains(d)) {
                    aVar.mo76254d(d, i2);
                }
            }
            if (kVar != null) {
                return new C15915d0.C15916a().mo75999p(a0Var).mo75990g(kVar.f67598b).mo75996m(kVar.f67599c).mo75994k(aVar.mo76256f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public C16821f(C16002z zVar, C15946f fVar, C16691g gVar, C16802e eVar) {
        C13706o.m87929f(zVar, "client");
        C13706o.m87929f(fVar, "connection");
        C13706o.m87929f(gVar, "chain");
        C13706o.m87929f(eVar, "http2Connection");
        this.f67949d = fVar;
        this.f67950e = gVar;
        this.f67951f = eVar;
        List<C15899a0> z = zVar.mo76358z();
        C15899a0 a0Var = C15899a0.H2_PRIOR_KNOWLEDGE;
        this.f67947b = !z.contains(a0Var) ? C15899a0.HTTP_2 : a0Var;
    }

    /* renamed from: a */
    public void mo79583a() {
        C16827h hVar = this.f67946a;
        C13706o.m87926c(hVar);
        hVar.mo79902n().close();
    }

    /* renamed from: b */
    public C11212y mo79584b(C15915d0 d0Var) {
        C13706o.m87929f(d0Var, "response");
        C16827h hVar = this.f67946a;
        C13706o.m87926c(hVar);
        return hVar.mo79904p();
    }

    /* renamed from: c */
    public C15946f mo79585c() {
        return this.f67949d;
    }

    public void cancel() {
        this.f67948c = true;
        C16827h hVar = this.f67946a;
        if (hVar != null) {
            hVar.mo79894f(C16794a.CANCEL);
        }
    }

    /* renamed from: d */
    public long mo79587d(C15915d0 d0Var) {
        C13706o.m87929f(d0Var, "response");
        if (!C16689e.m99148b(d0Var)) {
            return 0;
        }
        return C16279b.m97665s(d0Var);
    }

    /* renamed from: e */
    public C11210w mo79588e(C15904b0 b0Var, long j) {
        C13706o.m87929f(b0Var, "request");
        C16827h hVar = this.f67946a;
        C13706o.m87926c(hVar);
        return hVar.mo79902n();
    }

    /* renamed from: f */
    public void mo79589f(C15904b0 b0Var) {
        C13706o.m87929f(b0Var, "request");
        if (this.f67946a == null) {
            this.f67946a = this.f67951f.mo79824O(f67945i.mo79872a(b0Var), b0Var.mo75911a() != null);
            if (!this.f67948c) {
                C16827h hVar = this.f67946a;
                C13706o.m87926c(hVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                hVar.mo79910v().mo62526g((long) this.f67950e.mo79598h(), timeUnit);
                C16827h hVar2 = this.f67946a;
                C13706o.m87926c(hVar2);
                hVar2.mo79889E().mo62526g((long) this.f67950e.mo79600j(), timeUnit);
                return;
            }
            C16827h hVar3 = this.f67946a;
            C13706o.m87926c(hVar3);
            hVar3.mo79894f(C16794a.CANCEL);
            throw new IOException("Canceled");
        }
    }

    /* renamed from: g */
    public C15915d0.C15916a mo79590g(boolean z) {
        C16827h hVar = this.f67946a;
        C13706o.m87926c(hVar);
        C15915d0.C15916a b = f67945i.mo79873b(hVar.mo79887C(), this.f67947b);
        if (!z || b.mo75991h() != 100) {
            return b;
        }
        return null;
    }

    /* renamed from: h */
    public void mo79591h() {
        this.f67951f.flush();
    }
}
