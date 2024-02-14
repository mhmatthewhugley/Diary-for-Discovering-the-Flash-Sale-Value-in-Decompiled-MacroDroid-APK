package p417vc;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15986u;
import p226cd.C11186d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo71668d2 = {"Lvc/a;", "", "", "b", "Lokhttp3/u;", "a", "Lcd/d;", "source", "<init>", "(Lcd/d;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: vc.a */
/* compiled from: HeadersReader.kt */
public final class C16760a {

    /* renamed from: c */
    public static final C16761a f67698c = new C16761a((C13695i) null);

    /* renamed from: a */
    private long f67699a = ((long) 262144);

    /* renamed from: b */
    private final C11186d f67700b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo71668d2 = {"Lvc/a$a;", "", "", "HEADER_LIMIT", "I", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: vc.a$a */
    /* compiled from: HeadersReader.kt */
    public static final class C16761a {
        private C16761a() {
        }

        public /* synthetic */ C16761a(C13695i iVar) {
            this();
        }
    }

    public C16760a(C11186d dVar) {
        C13706o.m87929f(dVar, "source");
        this.f67700b = dVar;
    }

    /* renamed from: a */
    public final C15986u mo79744a() {
        C15986u.C15987a aVar = new C15986u.C15987a();
        while (true) {
            String b = mo79745b();
            if (b.length() == 0) {
                return aVar.mo76256f();
            }
            aVar.mo76253c(b);
        }
    }

    /* renamed from: b */
    public final String mo79745b() {
        String i0 = this.f67700b.mo62437i0(this.f67699a);
        this.f67699a -= (long) i0.length();
        return i0;
    }
}
