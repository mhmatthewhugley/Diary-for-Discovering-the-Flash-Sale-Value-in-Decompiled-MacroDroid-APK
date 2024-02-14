package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.http.protocol.HTTP;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0011\u0010\u0015\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, mo71668d2 = {"Lkotlin/text/d;", "", "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "UTF_8", "c", "UTF_16", "d", "UTF_16BE", "e", "UTF_16LE", "f", "US_ASCII", "g", "ISO_8859_1", "h", "utf_32le", "i", "utf_32be", "()Ljava/nio/charset/Charset;", "UTF_32LE", "a", "UTF_32BE", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.text.d */
/* compiled from: Charsets.kt */
public final class C15147d {

    /* renamed from: a */
    public static final C15147d f64348a = new C15147d();

    /* renamed from: b */
    public static final Charset f64349b;

    /* renamed from: c */
    public static final Charset f64350c;

    /* renamed from: d */
    public static final Charset f64351d;

    /* renamed from: e */
    public static final Charset f64352e;

    /* renamed from: f */
    public static final Charset f64353f;

    /* renamed from: g */
    public static final Charset f64354g;

    /* renamed from: h */
    private static Charset f64355h;

    /* renamed from: i */
    private static Charset f64356i;

    static {
        Charset forName = Charset.forName("UTF-8");
        C13706o.m87928e(forName, "forName(\"UTF-8\")");
        f64349b = forName;
        Charset forName2 = Charset.forName(HTTP.UTF_16);
        C13706o.m87928e(forName2, "forName(\"UTF-16\")");
        f64350c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C13706o.m87928e(forName3, "forName(\"UTF-16BE\")");
        f64351d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C13706o.m87928e(forName4, "forName(\"UTF-16LE\")");
        f64352e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C13706o.m87928e(forName5, "forName(\"US-ASCII\")");
        f64353f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C13706o.m87928e(forName6, "forName(\"ISO-8859-1\")");
        f64354g = forName6;
    }

    private C15147d() {
    }

    /* renamed from: a */
    public final Charset mo74447a() {
        Charset charset = f64356i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C13706o.m87928e(forName, "forName(\"UTF-32BE\")");
        f64356i = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset mo74448b() {
        Charset charset = f64355h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C13706o.m87928e(forName, "forName(\"UTF-32LE\")");
        f64355h = forName;
        return forName;
    }
}
