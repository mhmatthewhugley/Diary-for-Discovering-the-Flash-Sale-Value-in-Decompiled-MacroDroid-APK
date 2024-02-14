package p408uc;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15919e0;
import okhttp3.C15993w;
import okhttp3.internal.connection.C15938c;
import org.apache.http.protocol.HTTP;
import p226cd.C11184c;
import p226cd.C11196l;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo71668d2 = {"Luc/b;", "Lokhttp3/w;", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "", "forWebSocket", "<init>", "(Z)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: uc.b */
/* compiled from: CallServerInterceptor.kt */
public final class C16685b implements C15993w {

    /* renamed from: a */
    private final boolean f67574a;

    public C16685b(boolean z) {
        this.f67574a = z;
    }

    public C15915d0 intercept(C15993w.C15994a aVar) throws IOException {
        boolean z;
        C15915d0.C15916a aVar2;
        C15915d0 d0Var;
        C13706o.m87929f(aVar, "chain");
        C16691g gVar = (C16691g) aVar;
        C15938c g = gVar.mo79597g();
        C13706o.m87926c(g);
        C15904b0 i = gVar.mo79599i();
        C15907c0 a = i.mo75911a();
        long currentTimeMillis = System.currentTimeMillis();
        g.mo76087t(i);
        Long l = null;
        if (!C16690f.m99155a(i.mo75917g()) || a == null) {
            g.mo76082n();
            aVar2 = null;
            z = true;
        } else {
            if (C15176v.m93641v("100-continue", i.mo75914d(HTTP.EXPECT_DIRECTIVE), true)) {
                g.mo76074f();
                aVar2 = g.mo76084p(true);
                g.mo76086r();
                z = false;
            } else {
                aVar2 = null;
                z = true;
            }
            if (aVar2 != null) {
                g.mo76082n();
                if (!g.mo76076h().mo76141w()) {
                    g.mo76081m();
                }
            } else if (a.mo75939f()) {
                g.mo76074f();
                a.mo75941h(C11196l.m75162a(g.mo76071c(i, true)));
            } else {
                C11184c a2 = C11196l.m75162a(g.mo76071c(i, false));
                a.mo75941h(a2);
                a2.close();
            }
        }
        if (a == null || !a.mo75939f()) {
            g.mo76073e();
        }
        if (aVar2 == null) {
            aVar2 = g.mo76084p(false);
            C13706o.m87926c(aVar2);
            if (z) {
                g.mo76086r();
                z = false;
            }
        }
        C15915d0 c = aVar2.mo76001r(i).mo75992i(g.mo76076h().mo76136s()).mo76002s(currentTimeMillis).mo76000q(System.currentTimeMillis()).mo75988c();
        int g2 = c.mo75971g();
        if (g2 == 100) {
            C15915d0.C15916a p = g.mo76084p(false);
            C13706o.m87926c(p);
            if (z) {
                g.mo76086r();
            }
            c = p.mo76001r(i).mo75992i(g.mo76076h().mo76136s()).mo76002s(currentTimeMillis).mo76000q(System.currentTimeMillis()).mo75988c();
            g2 = c.mo75971g();
        }
        g.mo76085q(c);
        if (!this.f67574a || g2 != 101) {
            d0Var = c.mo75980u().mo75987b(g.mo76083o(c)).mo75988c();
        } else {
            d0Var = c.mo75980u().mo75987b(C16279b.f66624c).mo75988c();
        }
        if (C15176v.m93641v("close", d0Var.mo75984y().mo75914d(HTTP.CONN_DIRECTIVE), true) || C15176v.m93641v("close", C15915d0.m95985o(d0Var, HTTP.CONN_DIRECTIVE, (String) null, 2, (Object) null), true)) {
            g.mo76081m();
        }
        if (g2 == 204 || g2 == 205) {
            C15919e0 b = d0Var.mo75966b();
            if ((b != null ? b.contentLength() : -1) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(g2);
                sb.append(" had non-zero Content-Length: ");
                C15919e0 b2 = d0Var.mo75966b();
                if (b2 != null) {
                    l = Long.valueOf(b2.contentLength());
                }
                sb.append(l);
                throw new ProtocolException(sb.toString());
            }
        }
        return d0Var;
    }
}
