package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo71668d2 = {"Lokhttp3/a0;", "", "", "toString", "protocol", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "s", "a", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.a0 */
/* compiled from: Protocol.kt */
public enum C15899a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: s */
    public static final C15900a f65409s = null;
    /* access modifiers changed from: private */
    public final String protocol;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, mo71668d2 = {"Lokhttp3/a0$a;", "", "", "protocol", "Lokhttp3/a0;", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.a0$a */
    /* compiled from: Protocol.kt */
    public static final class C15900a {
        private C15900a() {
        }

        public /* synthetic */ C15900a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C15899a0 mo75910a(String str) throws IOException {
            C13706o.m87929f(str, "protocol");
            C15899a0 a0Var = C15899a0.HTTP_1_0;
            if (!C13706o.m87924a(str, a0Var.protocol)) {
                a0Var = C15899a0.HTTP_1_1;
                if (!C13706o.m87924a(str, a0Var.protocol)) {
                    a0Var = C15899a0.H2_PRIOR_KNOWLEDGE;
                    if (!C13706o.m87924a(str, a0Var.protocol)) {
                        a0Var = C15899a0.HTTP_2;
                        if (!C13706o.m87924a(str, a0Var.protocol)) {
                            a0Var = C15899a0.SPDY_3;
                            if (!C13706o.m87924a(str, a0Var.protocol)) {
                                a0Var = C15899a0.QUIC;
                                if (!C13706o.m87924a(str, a0Var.protocol)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return a0Var;
        }
    }

    static {
        f65409s = new C15900a((C13695i) null);
    }

    private C15899a0(String str) {
        this.protocol = str;
    }

    public String toString() {
        return this.protocol;
    }
}
