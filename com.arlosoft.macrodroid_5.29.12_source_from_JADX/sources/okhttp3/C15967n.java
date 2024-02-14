package okhttp3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n"}, mo71668d2 = {"Lokhttp3/n;", "", "Lokhttp3/v;", "url", "", "Lokhttp3/m;", "cookies", "Lja/u;", "b", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.n */
/* compiled from: CookieJar.kt */
public interface C15967n {

    /* renamed from: a */
    public static final C15967n f65765a = new C15968a.C15969a();

    /* renamed from: b */
    public static final C15968a f65766b = new C15968a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\b"}, mo71668d2 = {"Lokhttp3/n$a;", "", "Lokhttp3/n;", "NO_COOKIES", "Lokhttp3/n;", "<init>", "()V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.n$a */
    /* compiled from: CookieJar.kt */
    public static final class C15968a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, mo71668d2 = {"Lokhttp3/n$a$a;", "Lokhttp3/n;", "Lokhttp3/v;", "url", "", "Lokhttp3/m;", "cookies", "Lja/u;", "b", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: okhttp3.n$a$a */
        /* compiled from: CookieJar.kt */
        private static final class C15969a implements C15967n {
            /* renamed from: a */
            public List<C15965m> mo76189a(C15989v vVar) {
                C13706o.m87929f(vVar, "url");
                return C13614t.m87748j();
            }

            /* renamed from: b */
            public void mo76190b(C15989v vVar, List<C15965m> list) {
                C13706o.m87929f(vVar, "url");
                C13706o.m87929f(list, "cookies");
            }
        }

        private C15968a() {
        }

        public /* synthetic */ C15968a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: a */
    List<C15965m> mo76189a(C15989v vVar);

    /* renamed from: b */
    void mo76190b(C15989v vVar, List<C15965m> list);
}
