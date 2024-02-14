package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, mo71668d2 = {"Lokhttp3/q;", "", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "b", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.q */
/* compiled from: Dns.kt */
public interface C15972q {

    /* renamed from: a */
    public static final C15972q f65775a = new C15973a.C15974a();

    /* renamed from: b */
    public static final C15973a f65776b = new C15973a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\b"}, mo71668d2 = {"Lokhttp3/q$a;", "", "Lokhttp3/q;", "SYSTEM", "Lokhttp3/q;", "<init>", "()V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.q$a */
    /* compiled from: Dns.kt */
    public static final class C15973a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo71668d2 = {"Lokhttp3/q$a$a;", "Lokhttp3/q;", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: okhttp3.q$a$a */
        /* compiled from: Dns.kt */
        private static final class C15974a implements C15972q {
            public List<InetAddress> lookup(String str) {
                C13706o.m87929f(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C13706o.m87928e(allByName, "InetAddress.getAllByName(hostname)");
                    return C13596m.m87610i0(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private C15973a() {
        }

        public /* synthetic */ C15973a(C13695i iVar) {
            this();
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
