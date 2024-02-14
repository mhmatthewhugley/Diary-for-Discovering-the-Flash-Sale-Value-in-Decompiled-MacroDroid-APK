package p390sc;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15899a0;
import okhttp3.C15904b0;
import okhttp3.C15906c;
import okhttp3.C15915d0;
import okhttp3.C15917e;
import okhttp3.C15919e0;
import okhttp3.C15975r;
import okhttp3.C15986u;
import okhttp3.C15993w;
import okhttp3.internal.connection.C15942e;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import p372qc.C16279b;
import p390sc.C16527b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, mo71668d2 = {"Lsc/a;", "Lokhttp3/w;", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "Lokhttp3/c;", "cache", "<init>", "(Lokhttp3/c;)V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: sc.a */
/* compiled from: CacheInterceptor.kt */
public final class C16525a implements C15993w {

    /* renamed from: a */
    public static final C16526a f67246a = new C16526a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010"}, mo71668d2 = {"Lsc/a$a;", "", "Lokhttp3/d0;", "response", "f", "Lokhttp3/u;", "cachedHeaders", "networkHeaders", "c", "", "fieldName", "", "e", "d", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: sc.a$a */
    /* compiled from: CacheInterceptor.kt */
    public static final class C16526a {
        private C16526a() {
        }

        public /* synthetic */ C16526a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final C15986u m98640c(C15986u uVar, C15986u uVar2) {
            C15986u.C15987a aVar = new C15986u.C15987a();
            int size = uVar.size();
            for (int i = 0; i < size; i++) {
                String d = uVar.mo76242d(i);
                String i2 = uVar.mo76246i(i);
                if ((!C15176v.m93641v("Warning", d, true) || !C15176v.m93634I(i2, "1", false, 2, (Object) null)) && (m98641d(d) || !m98642e(d) || uVar2.mo76241c(d) == null)) {
                    aVar.mo76254d(d, i2);
                }
            }
            int size2 = uVar2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String d2 = uVar2.mo76242d(i3);
                if (!m98641d(d2) && m98642e(d2)) {
                    aVar.mo76254d(d2, uVar2.mo76246i(i3));
                }
            }
            return aVar.mo76256f();
        }

        /* renamed from: d */
        private final boolean m98641d(String str) {
            if (C15176v.m93641v("Content-Length", str, true) || C15176v.m93641v(HTTP.CONTENT_ENCODING, str, true) || C15176v.m93641v("Content-Type", str, true)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private final boolean m98642e(String str) {
            if (C15176v.m93641v(HTTP.CONN_DIRECTIVE, str, true) || C15176v.m93641v(HTTP.CONN_KEEP_ALIVE, str, true) || C15176v.m93641v(AUTH.PROXY_AUTH, str, true) || C15176v.m93641v(AUTH.PROXY_AUTH_RESP, str, true) || C15176v.m93641v("TE", str, true) || C15176v.m93641v("Trailers", str, true) || C15176v.m93641v(HTTP.TRANSFER_ENCODING, str, true) || C15176v.m93641v("Upgrade", str, true)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final C15915d0 m98643f(C15915d0 d0Var) {
            return (d0Var != null ? d0Var.mo75966b() : null) != null ? d0Var.mo75980u().mo75987b((C15919e0) null).mo75988c() : d0Var;
        }
    }

    public C16525a(C15906c cVar) {
    }

    public C15915d0 intercept(C15993w.C15994a aVar) throws IOException {
        C15975r rVar;
        C13706o.m87929f(aVar, "chain");
        C15917e call = aVar.call();
        C16527b b = new C16527b.C16529b(System.currentTimeMillis(), aVar.mo76312m(), (C15915d0) null).mo79328b();
        C15904b0 b2 = b.mo79326b();
        C15915d0 a = b.mo79325a();
        C15942e eVar = (C15942e) (!(call instanceof C15942e) ? null : call);
        if (eVar == null || (rVar = eVar.mo76103o()) == null) {
            rVar = C15975r.f65777a;
        }
        if (b2 == null && a == null) {
            C15915d0 c = new C15915d0.C15916a().mo76001r(aVar.mo76312m()).mo75999p(C15899a0.HTTP_1_1).mo75990g(504).mo75996m("Unsatisfiable Request (only-if-cached)").mo75987b(C16279b.f66624c).mo76002s(-1).mo76000q(System.currentTimeMillis()).mo75988c();
            rVar.mo76226z(call, c);
            return c;
        } else if (b2 == null) {
            C13706o.m87926c(a);
            C15915d0 c2 = a.mo75980u().mo75989d(f67246a.m98643f(a)).mo75988c();
            rVar.mo76202b(call, c2);
            return c2;
        } else {
            if (a != null) {
                rVar.mo76201a(call, a);
            }
            C15915d0 a2 = aVar.mo76309a(b2);
            if (a != null) {
                if (a2 == null || a2.mo75971g() != 304) {
                    C15919e0 b3 = a.mo75966b();
                    if (b3 != null) {
                        C16279b.m97656j(b3);
                    }
                } else {
                    C15915d0.C15916a u = a.mo75980u();
                    C16526a aVar2 = f67246a;
                    u.mo75994k(aVar2.m98640c(a.mo75976p(), a2.mo75976p())).mo76002s(a2.mo75985z()).mo76000q(a2.mo75983x()).mo75989d(aVar2.m98643f(a)).mo75997n(aVar2.m98643f(a2)).mo75988c();
                    C15919e0 b4 = a2.mo75966b();
                    C13706o.m87926c(b4);
                    b4.close();
                    C13706o.m87926c((Object) null);
                    throw null;
                }
            }
            C13706o.m87926c(a2);
            C15915d0.C15916a u2 = a2.mo75980u();
            C16526a aVar3 = f67246a;
            return u2.mo75989d(aVar3.m98643f(a)).mo75997n(aVar3.m98643f(a2)).mo75988c();
        }
    }
}
