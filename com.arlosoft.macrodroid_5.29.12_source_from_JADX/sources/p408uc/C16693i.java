package p408uc;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15904b0;
import okhttp3.C15989v;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, mo71668d2 = {"Luc/i;", "", "Lokhttp3/b0;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "", "a", "Lokhttp3/v;", "url", "c", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: uc.i */
/* compiled from: RequestLine.kt */
public final class C16693i {

    /* renamed from: a */
    public static final C16693i f67593a = new C16693i();

    private C16693i() {
    }

    /* renamed from: b */
    private final boolean m99171b(C15904b0 b0Var, Proxy.Type type) {
        return !b0Var.mo75916f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: a */
    public final String mo79602a(C15904b0 b0Var, Proxy.Type type) {
        C13706o.m87929f(b0Var, "request");
        C13706o.m87929f(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(b0Var.mo75917g());
        sb.append(' ');
        C16693i iVar = f67593a;
        if (iVar.m99171b(b0Var, type)) {
            sb.append(b0Var.mo75920j());
        } else {
            sb.append(iVar.mo79603c(b0Var.mo75920j()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public final String mo79603c(C15989v vVar) {
        C13706o.m87929f(vVar, "url");
        String d = vVar.mo76263d();
        String f = vVar.mo76266f();
        if (f == null) {
            return d;
        }
        return d + '?' + f;
    }
}
