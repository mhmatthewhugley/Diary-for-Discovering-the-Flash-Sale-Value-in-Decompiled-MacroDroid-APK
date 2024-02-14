package p219bd;

import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.p312io.C13667b;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15919e0;
import okhttp3.C15960j;
import okhttp3.C15986u;
import okhttp3.C15993w;
import okhttp3.C15995x;
import org.apache.http.protocol.HTTP;
import p226cd.C11179b;
import p226cd.C11186d;
import p226cd.C11193i;
import p408uc.C16689e;
import p435xc.C16926h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\t\u0007B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0015"}, mo71668d2 = {"Lbd/a;", "Lokhttp3/w;", "Lokhttp3/u;", "headers", "", "i", "Lja/u;", "b", "", "a", "Lbd/a$a;", "level", "c", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "Lbd/a$b;", "logger", "<init>", "(Lbd/a$b;)V", "okhttp-logging-interceptor"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: bd.a */
/* compiled from: HttpLoggingInterceptor.kt */
public final class C11150a implements C15993w {

    /* renamed from: a */
    private volatile Set<String> f54050a;

    /* renamed from: b */
    private volatile C11151a f54051b;

    /* renamed from: c */
    private final C11152b f54052c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo71668d2 = {"Lbd/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: bd.a$a */
    /* compiled from: HttpLoggingInterceptor.kt */
    public enum C11151a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo71668d2 = {"Lbd/a$b;", "", "", "message", "Lja/u;", "a", "okhttp-logging-interceptor"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: bd.a$b */
    /* compiled from: HttpLoggingInterceptor.kt */
    public interface C11152b {

        /* renamed from: a */
        public static final C11152b f54058a = new C11153a.C11154a();

        /* renamed from: b */
        public static final C11153a f54059b = new C11153a((C13695i) null);

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\b"}, mo71668d2 = {"Lbd/a$b$a;", "", "Lbd/a$b;", "DEFAULT", "Lbd/a$b;", "<init>", "()V", "a", "okhttp-logging-interceptor"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: bd.a$b$a */
        /* compiled from: HttpLoggingInterceptor.kt */
        public static final class C11153a {

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo71668d2 = {"Lbd/a$b$a$a;", "Lbd/a$b;", "", "message", "Lja/u;", "a", "<init>", "()V", "okhttp-logging-interceptor"}, mo71669k = 1, mo71670mv = {1, 4, 0})
            /* renamed from: bd.a$b$a$a */
            /* compiled from: HttpLoggingInterceptor.kt */
            private static final class C11154a implements C11152b {
                /* renamed from: a */
                public void mo62340a(String str) {
                    C13706o.m87929f(str, "message");
                    C16926h.m100022k(C16926h.f68190c.mo80117g(), str, 0, (Throwable) null, 6, (Object) null);
                }
            }

            private C11153a() {
            }

            public /* synthetic */ C11153a(C13695i iVar) {
                this();
            }
        }

        /* renamed from: a */
        void mo62340a(String str);
    }

    public C11150a() {
        this((C11152b) null, 1, (C13695i) null);
    }

    public C11150a(C11152b bVar) {
        C13706o.m87929f(bVar, "logger");
        this.f54052c = bVar;
        this.f54050a = C13627z0.m87806d();
        this.f54051b = C11151a.NONE;
    }

    /* renamed from: a */
    private final boolean m74901a(C15986u uVar) {
        String c = uVar.mo76241c(HTTP.CONTENT_ENCODING);
        if (c == null || C15176v.m93641v(c, HTTP.IDENTITY_CODING, true) || C15176v.m93641v(c, "gzip", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void m74902b(C15986u uVar, int i) {
        String i2 = this.f54050a.contains(uVar.mo76242d(i)) ? "██" : uVar.mo76246i(i);
        C11152b bVar = this.f54052c;
        bVar.mo62340a(uVar.mo76242d(i) + ": " + i2);
    }

    /* renamed from: c */
    public final C11150a mo62339c(C11151a aVar) {
        C13706o.m87929f(aVar, "level");
        this.f54051b = aVar;
        return this;
    }

    public C15915d0 intercept(C15993w.C15994a aVar) throws IOException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Charset charset;
        Throwable th;
        Charset charset2;
        C15993w.C15994a aVar2 = aVar;
        C13706o.m87929f(aVar2, "chain");
        C11151a aVar3 = this.f54051b;
        C15904b0 m = aVar.mo76312m();
        if (aVar3 == C11151a.NONE) {
            return aVar2.mo76309a(m);
        }
        boolean z = aVar3 == C11151a.BODY;
        boolean z2 = z || aVar3 == C11151a.HEADERS;
        C15907c0 a = m.mo75911a();
        C15960j b = aVar.mo76310b();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(m.mo75917g());
        sb.append(' ');
        sb.append(m.mo75920j());
        if (b != null) {
            str = " " + b.mo76126a();
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (!z2 && a != null) {
            sb2 = sb2 + " (" + a.mo75937a() + "-byte body)";
        }
        this.f54052c.mo62340a(sb2);
        if (z2) {
            C15986u e = m.mo75915e();
            if (a != null) {
                C15995x b2 = a.mo75938b();
                if (b2 != null && e.mo76241c("Content-Type") == null) {
                    this.f54052c.mo62340a("Content-Type: " + b2);
                }
                if (a.mo75937a() != -1 && e.mo76241c("Content-Length") == null) {
                    this.f54052c.mo62340a("Content-Length: " + a.mo75937a());
                }
            }
            int size = e.size();
            for (int i = 0; i < size; i++) {
                m74902b(e, i);
            }
            if (!z || a == null) {
                this.f54052c.mo62340a("--> END " + m.mo75917g());
            } else if (m74901a(m.mo75915e())) {
                this.f54052c.mo62340a("--> END " + m.mo75917g() + " (encoded body omitted)");
            } else if (a.mo75939f()) {
                this.f54052c.mo62340a("--> END " + m.mo75917g() + " (duplex request body omitted)");
            } else if (a.mo75940g()) {
                this.f54052c.mo62340a("--> END " + m.mo75917g() + " (one-shot body omitted)");
            } else {
                C11179b bVar = new C11179b();
                a.mo75941h(bVar);
                C15995x b3 = a.mo75938b();
                if (b3 == null || (charset2 = b3.mo76313c(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    C13706o.m87928e(charset2, "UTF_8");
                }
                this.f54052c.mo62340a("");
                if (C11155b.m74906a(bVar)) {
                    this.f54052c.mo62340a(bVar.mo62409L1(charset2));
                    this.f54052c.mo62340a("--> END " + m.mo75917g() + " (" + a.mo75937a() + "-byte body)");
                } else {
                    this.f54052c.mo62340a("--> END " + m.mo75917g() + " (binary " + a.mo75937a() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            C15915d0 a2 = aVar2.mo76309a(m);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            C15919e0 b4 = a2.mo75966b();
            C13706o.m87926c(b4);
            long contentLength = b4.contentLength();
            if (contentLength != -1) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            C11152b bVar2 = this.f54052c;
            String str6 = "-byte body)";
            StringBuilder sb3 = new StringBuilder();
            long j = contentLength;
            sb3.append("<-- ");
            sb3.append(a2.mo75971g());
            if (a2.mo75977r().length() == 0) {
                str3 = "-byte body omitted)";
                str4 = "";
            } else {
                String r = a2.mo75977r();
                StringBuilder sb4 = new StringBuilder();
                str3 = "-byte body omitted)";
                sb4.append(String.valueOf(' '));
                sb4.append(r);
                str4 = sb4.toString();
            }
            sb3.append(str4);
            sb3.append(' ');
            sb3.append(a2.mo75984y().mo75920j());
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            if (!z2) {
                str5 = ", " + str2 + " body";
            } else {
                str5 = "";
            }
            sb3.append(str5);
            sb3.append(')');
            bVar2.mo62340a(sb3.toString());
            if (z2) {
                C15986u p = a2.mo75976p();
                int size2 = p.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    m74902b(p, i2);
                }
                if (!z || !C16689e.m99148b(a2)) {
                    this.f54052c.mo62340a("<-- END HTTP");
                } else if (m74901a(a2.mo75976p())) {
                    this.f54052c.mo62340a("<-- END HTTP (encoded body omitted)");
                } else {
                    C11186d source = b4.source();
                    source.request(LocationRequestCompat.PASSIVE_INTERVAL);
                    C11179b buffer = source.getBuffer();
                    Long l = null;
                    if (C15176v.m93641v("gzip", p.mo76241c(HTTP.CONTENT_ENCODING), true)) {
                        Long valueOf = Long.valueOf(buffer.mo62399D());
                        C11193i iVar = new C11193i(buffer.clone());
                        try {
                            buffer = new C11179b();
                            buffer.mo62396A1(iVar);
                            C13667b.m87853a(iVar, (Throwable) null);
                            l = valueOf;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            C13667b.m87853a(iVar, th);
                            throw th3;
                        }
                    }
                    C15995x contentType = b4.contentType();
                    if (contentType == null || (charset = contentType.mo76313c(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        C13706o.m87928e(charset, "UTF_8");
                    }
                    if (!C11155b.m74906a(buffer)) {
                        this.f54052c.mo62340a("");
                        this.f54052c.mo62340a("<-- END HTTP (binary " + buffer.mo62399D() + str3);
                        return a2;
                    }
                    if (j != 0) {
                        this.f54052c.mo62340a("");
                        this.f54052c.mo62340a(buffer.clone().mo62409L1(charset));
                    }
                    if (l != null) {
                        this.f54052c.mo62340a("<-- END HTTP (" + buffer.mo62399D() + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        this.f54052c.mo62340a("<-- END HTTP (" + buffer.mo62399D() + str6);
                    }
                }
            }
            return a2;
        } catch (Exception e2) {
            Exception exc = e2;
            this.f54052c.mo62340a("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11150a(C11152b bVar, int i, C13695i iVar) {
        this((i & 1) != 0 ? C11152b.f54058a : bVar);
    }
}
