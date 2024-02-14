package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15989v;
import p226cd.C11179b;
import p226cd.C11184c;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0002\n\tB%\b\u0000\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0016"}, mo71668d2 = {"Lokhttp3/s;", "Lokhttp3/c0;", "Lcd/c;", "sink", "", "countBytes", "", "i", "Lokhttp3/x;", "b", "a", "Lja/u;", "h", "", "", "Ljava/util/List;", "encodedNames", "c", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "e", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.s */
/* compiled from: FormBody.kt */
public final class C15979s extends C15907c0 {

    /* renamed from: d */
    private static final C15995x f65779d = C15995x.f65817g.mo76319a("application/x-www-form-urlencoded");

    /* renamed from: e */
    public static final C15981b f65780e = new C15981b((C13695i) null);

    /* renamed from: b */
    private final List<String> f65781b;

    /* renamed from: c */
    private final List<String> f65782c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo71668d2 = {"Lokhttp3/s$b;", "", "Lokhttp3/x;", "CONTENT_TYPE", "Lokhttp3/x;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.s$b */
    /* compiled from: FormBody.kt */
    public static final class C15981b {
        private C15981b() {
        }

        public /* synthetic */ C15981b(C13695i iVar) {
            this();
        }
    }

    public C15979s(List<String> list, List<String> list2) {
        C13706o.m87929f(list, "encodedNames");
        C13706o.m87929f(list2, "encodedValues");
        this.f65781b = C16279b.m97639O(list);
        this.f65782c = C16279b.m97639O(list2);
    }

    /* renamed from: i */
    private final long m96286i(C11184c cVar, boolean z) {
        C11179b bVar;
        if (z) {
            bVar = new C11179b();
        } else {
            C13706o.m87926c(cVar);
            bVar = cVar.getBuffer();
        }
        int size = this.f65781b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                bVar.writeByte(38);
            }
            bVar.mo62455s0(this.f65781b.get(i));
            bVar.writeByte(61);
            bVar.mo62455s0(this.f65782c.get(i));
        }
        if (!z) {
            return 0;
        }
        long D = bVar.mo62399D();
        bVar.mo62424b();
        return D;
    }

    /* renamed from: a */
    public long mo75937a() {
        return m96286i((C11184c) null, true);
    }

    /* renamed from: b */
    public C15995x mo75938b() {
        return f65779d;
    }

    /* renamed from: h */
    public void mo75941h(C11184c cVar) throws IOException {
        C13706o.m87929f(cVar, "sink");
        m96286i(cVar, false);
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0012"}, mo71668d2 = {"Lokhttp3/s$a;", "", "", "name", "value", "a", "b", "Lokhttp3/s;", "c", "", "Ljava/util/List;", "names", "values", "Ljava/nio/charset/Charset;", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.s$a */
    /* compiled from: FormBody.kt */
    public static final class C15980a {

        /* renamed from: a */
        private final List<String> f65783a;

        /* renamed from: b */
        private final List<String> f65784b;

        /* renamed from: c */
        private final Charset f65785c;

        public C15980a() {
            this((Charset) null, 1, (C13695i) null);
        }

        public C15980a(Charset charset) {
            this.f65785c = charset;
            this.f65783a = new ArrayList();
            this.f65784b = new ArrayList();
        }

        /* renamed from: a */
        public final C15980a mo76228a(String str, String str2) {
            String str3 = str;
            C13706o.m87929f(str3, "name");
            C13706o.m87929f(str2, "value");
            List<String> list = this.f65783a;
            C15989v.C15992b bVar = C15989v.f65795l;
            list.add(C15989v.C15992b.m96376b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f65785c, 91, (Object) null));
            this.f65784b.add(C15989v.C15992b.m96376b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f65785c, 91, (Object) null));
            return this;
        }

        /* renamed from: b */
        public final C15980a mo76229b(String str, String str2) {
            String str3 = str;
            C13706o.m87929f(str3, "name");
            C13706o.m87929f(str2, "value");
            List<String> list = this.f65783a;
            C15989v.C15992b bVar = C15989v.f65795l;
            list.add(C15989v.C15992b.m96376b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f65785c, 83, (Object) null));
            this.f65784b.add(C15989v.C15992b.m96376b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f65785c, 83, (Object) null));
            return this;
        }

        /* renamed from: c */
        public final C15979s mo76230c() {
            return new C15979s(this.f65783a, this.f65784b);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C15980a(Charset charset, int i, C13695i iVar) {
            this((i & 1) != 0 ? null : charset);
        }
    }
}
