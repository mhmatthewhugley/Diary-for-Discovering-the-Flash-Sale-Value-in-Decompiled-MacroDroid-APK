package p408uc;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15919e0;
import okhttp3.C15965m;
import okhttp3.C15967n;
import okhttp3.C15993w;
import okhttp3.C15995x;
import org.apache.http.cookie.C16050SM;
import org.apache.http.protocol.HTTP;
import p226cd.C11193i;
import p226cd.C11196l;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, mo71668d2 = {"Luc/a;", "Lokhttp3/w;", "", "Lokhttp3/m;", "cookies", "", "a", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "Lokhttp3/n;", "cookieJar", "<init>", "(Lokhttp3/n;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: uc.a */
/* compiled from: BridgeInterceptor.kt */
public final class C16684a implements C15993w {

    /* renamed from: a */
    private final C15967n f67573a;

    public C16684a(C15967n nVar) {
        C13706o.m87929f(nVar, "cookieJar");
        this.f67573a = nVar;
    }

    /* renamed from: a */
    private final String m99135a(List<C15965m> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C13614t.m87758t();
            }
            C15965m mVar = (C15965m) next;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(mVar.mo76180e());
            sb.append('=');
            sb.append(mVar.mo76183g());
            i = i2;
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public C15915d0 intercept(C15993w.C15994a aVar) throws IOException {
        C15919e0 b;
        C13706o.m87929f(aVar, "chain");
        C15904b0 m = aVar.mo76312m();
        C15904b0.C15905a h = m.mo75918h();
        C15907c0 a = m.mo75911a();
        if (a != null) {
            C15995x b2 = a.mo75938b();
            if (b2 != null) {
                h.mo75927f("Content-Type", b2.toString());
            }
            long a2 = a.mo75937a();
            if (a2 != -1) {
                h.mo75927f("Content-Length", String.valueOf(a2));
                h.mo75933l(HTTP.TRANSFER_ENCODING);
            } else {
                h.mo75927f(HTTP.TRANSFER_ENCODING, HTTP.CHUNK_CODING);
                h.mo75933l("Content-Length");
            }
        }
        boolean z = false;
        if (m.mo75914d(HTTP.TARGET_HOST) == null) {
            h.mo75927f(HTTP.TARGET_HOST, C16279b.m97638N(m.mo75920j(), false, 1, (Object) null));
        }
        if (m.mo75914d(HTTP.CONN_DIRECTIVE) == null) {
            h.mo75927f(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
        }
        if (m.mo75914d("Accept-Encoding") == null && m.mo75914d("Range") == null) {
            h.mo75927f("Accept-Encoding", "gzip");
            z = true;
        }
        List<C15965m> a3 = this.f67573a.mo76189a(m.mo75920j());
        if (!a3.isEmpty()) {
            h.mo75927f(C16050SM.COOKIE, m99135a(a3));
        }
        if (m.mo75914d(HTTP.USER_AGENT) == null) {
            h.mo75927f(HTTP.USER_AGENT, "okhttp/4.9.3");
        }
        C15915d0 a4 = aVar.mo76309a(h.mo75923b());
        C16689e.m99152f(this.f67573a, m.mo75920j(), a4.mo75976p());
        C15915d0.C15916a r = a4.mo75980u().mo76001r(m);
        if (z && C15176v.m93641v("gzip", C15915d0.m95985o(a4, HTTP.CONTENT_ENCODING, (String) null, 2, (Object) null), true) && C16689e.m99148b(a4) && (b = a4.mo75966b()) != null) {
            C11193i iVar = new C11193i(b.source());
            r.mo75994k(a4.mo75976p().mo76244f().mo76258h(HTTP.CONTENT_ENCODING).mo76258h("Content-Length").mo76256f());
            r.mo75987b(new C16692h(C15915d0.m95985o(a4, "Content-Type", (String) null, 2, (Object) null), -1, C11196l.m75163b(iVar)));
        }
        return r.mo75988c();
    }
}
