package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002\u001aE\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011\u001a?\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, mo71668d2 = {"T", "", "Lkotlin/sequences/h;", "c", "", "elements", "j", "([Ljava/lang/Object;)Lkotlin/sequences/h;", "e", "f", "R", "Lkotlin/Function1;", "iterator", "g", "(Lkotlin/sequences/h;Lqa/l;)Lkotlin/sequences/h;", "d", "", "Lkotlin/Function0;", "nextFunction", "i", "seed", "h", "(Ljava/lang/Object;Lqa/l;)Lkotlin/sequences/h;", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/sequences/SequencesKt")
/* renamed from: kotlin.sequences.n */
/* compiled from: Sequences.kt */
class C15125n extends C15124m {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo71668d2 = {"kotlin/sequences/n$a", "Lkotlin/sequences/h;", "", "iterator", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.n$a */
    /* compiled from: Sequences.kt */
    public static final class C15126a implements C15118h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f64322a;

        public C15126a(Iterator it) {
            this.f64322a = it;
        }

        public Iterator<T> iterator() {
            return this.f64322a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"T", "Lkotlin/sequences/h;", "it", "", "a", "(Lkotlin/sequences/h;)Ljava/util/Iterator;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.n$b */
    /* compiled from: Sequences.kt */
    static final class C15127b extends C13708q implements C16265l<C15118h<? extends T>, Iterator<? extends T>> {

        /* renamed from: a */
        public static final C15127b f64323a = new C15127b();

        C15127b() {
            super(1);
        }

        /* renamed from: a */
        public final Iterator<T> invoke(C15118h<? extends T> hVar) {
            C13706o.m87929f(hVar, "it");
            return hVar.iterator();
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.sequences.n$c */
    /* compiled from: Sequences.kt */
    static final class C15128c extends C13708q implements C16265l<T, T> {

        /* renamed from: a */
        public static final C15128c f64324a = new C15128c();

        C15128c() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.sequences.n$d */
    /* compiled from: Sequences.kt */
    static final class C15129d extends C13708q implements C16265l<T, T> {
        final /* synthetic */ C16254a<T> $nextFunction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15129d(C16254a<? extends T> aVar) {
            super(1);
            this.$nextFunction = aVar;
        }

        public final T invoke(T t) {
            C13706o.m87929f(t, "it");
            return this.$nextFunction.invoke();
        }
    }

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.sequences.n$e */
    /* compiled from: Sequences.kt */
    static final class C15130e extends C13708q implements C16254a<T> {
        final /* synthetic */ T $seed;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15130e(T t) {
            super(0);
            this.$seed = t;
        }

        public final T invoke() {
            return this.$seed;
        }
    }

    /* renamed from: c */
    public static <T> C15118h<T> m93468c(Iterator<? extends T> it) {
        C13706o.m87929f(it, "<this>");
        return m93469d(new C15126a(it));
    }

    /* renamed from: d */
    public static <T> C15118h<T> m93469d(C15118h<? extends T> hVar) {
        C13706o.m87929f(hVar, "<this>");
        return hVar instanceof C15107a ? hVar : new C15107a(hVar);
    }

    /* renamed from: e */
    public static <T> C15118h<T> m93470e() {
        return C15111d.f64298a;
    }

    /* renamed from: f */
    public static final <T> C15118h<T> m93471f(C15118h<? extends C15118h<? extends T>> hVar) {
        C13706o.m87929f(hVar, "<this>");
        return m93472g(hVar, C15127b.f64323a);
    }

    /* renamed from: g */
    private static final <T, R> C15118h<R> m93472g(C15118h<? extends T> hVar, C16265l<? super T, ? extends Iterator<? extends R>> lVar) {
        if (hVar instanceof C15142t) {
            return ((C15142t) hVar).mo74443e(lVar);
        }
        return new C15114f(hVar, C15128c.f64324a, lVar);
    }

    /* renamed from: h */
    public static <T> C15118h<T> m93473h(T t, C16265l<? super T, ? extends T> lVar) {
        C13706o.m87929f(lVar, "nextFunction");
        if (t == null) {
            return C15111d.f64298a;
        }
        return new C15116g(new C15130e(t), lVar);
    }

    /* renamed from: i */
    public static <T> C15118h<T> m93474i(C16254a<? extends T> aVar) {
        C13706o.m87929f(aVar, "nextFunction");
        return m93469d(new C15116g(aVar, new C15129d(aVar)));
    }

    /* renamed from: j */
    public static final <T> C15118h<T> m93475j(T... tArr) {
        C13706o.m87929f(tArr, "elements");
        return tArr.length == 0 ? m93470e() : C13596m.m87622t(tArr);
    }
}
