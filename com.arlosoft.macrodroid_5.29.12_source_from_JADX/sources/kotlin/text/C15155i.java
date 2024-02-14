package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.C13560a;
import kotlin.collections.C13570c;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.text.C15152h;
import p370qa.C16265l;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0018¨\u0006\u001c"}, mo71668d2 = {"Lkotlin/text/i;", "Lkotlin/text/h;", "Ljava/util/regex/Matcher;", "a", "Ljava/util/regex/Matcher;", "matcher", "", "b", "Ljava/lang/CharSequence;", "input", "Lkotlin/text/g;", "c", "Lkotlin/text/g;", "getGroups", "()Lkotlin/text/g;", "groups", "", "", "d", "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", "()Ljava/util/regex/MatchResult;", "matchResult", "()Ljava/util/List;", "groupValues", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.text.i */
/* compiled from: Regex.kt */
final class C15155i implements C15152h {

    /* renamed from: a */
    private final Matcher f64370a;

    /* renamed from: b */
    private final CharSequence f64371b;

    /* renamed from: c */
    private final C15151g f64372c = new C15157b(this);

    /* renamed from: d */
    private List<String> f64373d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, mo71668d2 = {"kotlin/text/i$a", "Lkotlin/collections/c;", "", "", "index", "d", "getSize", "()I", "size", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.text.i$a */
    /* compiled from: Regex.kt */
    public static final class C15156a extends C13570c<String> {

        /* renamed from: a */
        final /* synthetic */ C15155i f64374a;

        C15156a(C15155i iVar) {
            this.f64374a = iVar;
        }

        /* renamed from: c */
        public /* bridge */ boolean mo74459c(String str) {
            return super.contains(str);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return mo74459c((String) obj);
        }

        /* renamed from: d */
        public String get(int i) {
            String group = this.f64374a.m93536d().group(i);
            return group == null ? "" : group;
        }

        /* renamed from: f */
        public /* bridge */ int mo74461f(String str) {
            return super.indexOf(str);
        }

        public int getSize() {
            return this.f64374a.m93536d().groupCount() + 1;
        }

        /* renamed from: h */
        public /* bridge */ int mo74462h(String str) {
            return super.lastIndexOf(str);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo74461f((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo74462h((String) obj);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000%\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006H\u0002J\u0013\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo71668d2 = {"kotlin/text/i$b", "", "Lkotlin/collections/a;", "Lkotlin/text/f;", "", "isEmpty", "", "iterator", "", "index", "d", "getSize", "()I", "size", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.text.i$b */
    /* compiled from: Regex.kt */
    public static final class C15157b extends C13560a<C15150f> implements C15151g {

        /* renamed from: a */
        final /* synthetic */ C15155i f64375a;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lkotlin/text/f;", "a", "(I)Lkotlin/text/f;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.text.i$b$a */
        /* compiled from: Regex.kt */
        static final class C15158a extends C13708q implements C16265l<Integer, C15150f> {
            final /* synthetic */ C15157b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15158a(C15157b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final C15150f mo74465a(int i) {
                return this.this$0.mo74464d(i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo74465a(((Number) obj).intValue());
            }
        }

        C15157b(C15155i iVar) {
            this.f64375a = iVar;
        }

        /* renamed from: c */
        public /* bridge */ boolean mo74463c(C15150f fVar) {
            return super.contains(fVar);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj == null ? true : obj instanceof C15150f)) {
                return false;
            }
            return mo74463c((C15150f) obj);
        }

        /* renamed from: d */
        public C15150f mo74464d(int i) {
            C16788e b = C15163k.m93554d(this.f64375a.m93536d(), i);
            if (b.getStart().intValue() < 0) {
                return null;
            }
            String group = this.f64375a.m93536d().group(i);
            C13706o.m87928e(group, "matchResult.group(index)");
            return new C15150f(group, b);
        }

        public int getSize() {
            return this.f64375a.m93536d().groupCount() + 1;
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<C15150f> iterator() {
            return C15132p.m93494w(C13566b0.m87412N(C13614t.m87749k(this)), new C15158a(this)).iterator();
        }
    }

    public C15155i(Matcher matcher, CharSequence charSequence) {
        C13706o.m87929f(matcher, "matcher");
        C13706o.m87929f(charSequence, "input");
        this.f64370a = matcher;
        this.f64371b = charSequence;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final MatchResult m93536d() {
        return this.f64370a;
    }

    /* renamed from: a */
    public C15152h.C15154b mo74456a() {
        return C15152h.C15153a.m93533a(this);
    }

    /* renamed from: b */
    public List<String> mo74457b() {
        if (this.f64373d == null) {
            this.f64373d = new C15156a(this);
        }
        List<String> list = this.f64373d;
        C13706o.m87926c(list);
        return list;
    }
}
