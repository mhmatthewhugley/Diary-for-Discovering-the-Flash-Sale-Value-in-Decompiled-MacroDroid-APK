package p408uc;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPut;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, mo71668d2 = {"Luc/f;", "", "", "method", "", "d", "a", "c", "b", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: uc.f */
/* compiled from: HttpMethod.kt */
public final class C16690f {

    /* renamed from: a */
    public static final C16690f f67580a = new C16690f();

    private C16690f() {
    }

    /* renamed from: a */
    public static final boolean m99155a(String str) {
        C13706o.m87929f(str, "method");
        return !C13706o.m87924a(str, "GET") && !C13706o.m87924a(str, HttpHead.METHOD_NAME);
    }

    /* renamed from: d */
    public static final boolean m99156d(String str) {
        C13706o.m87929f(str, "method");
        return C13706o.m87924a(str, "POST") || C13706o.m87924a(str, HttpPut.METHOD_NAME) || C13706o.m87924a(str, "PATCH") || C13706o.m87924a(str, "PROPPATCH") || C13706o.m87924a(str, "REPORT");
    }

    /* renamed from: b */
    public final boolean mo79592b(String str) {
        C13706o.m87929f(str, "method");
        return !C13706o.m87924a(str, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean mo79593c(String str) {
        C13706o.m87929f(str, "method");
        return C13706o.m87924a(str, "PROPFIND");
    }
}
