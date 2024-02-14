package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p226cd.C11188e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, mo71668d2 = {"Lokhttp3/o;", "", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "b", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.o */
/* compiled from: Credentials.kt */
public final class C15970o {

    /* renamed from: a */
    public static final C15970o f65767a = new C15970o();

    private C15970o() {
    }

    /* renamed from: a */
    public static final String m96244a(String str, String str2) {
        return m96246c(str, str2, (Charset) null, 4, (Object) null);
    }

    /* renamed from: b */
    public static final String m96245b(String str, String str2, Charset charset) {
        C13706o.m87929f(str, "username");
        C13706o.m87929f(str2, "password");
        C13706o.m87929f(charset, "charset");
        String b = C11188e.f54104d.mo62512b(str + ':' + str2, charset).mo62491b();
        return "Basic " + b;
    }

    /* renamed from: c */
    public static /* synthetic */ String m96246c(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            C13706o.m87928e(charset, "ISO_8859_1");
        }
        return m96245b(str, str2, charset);
    }
}
