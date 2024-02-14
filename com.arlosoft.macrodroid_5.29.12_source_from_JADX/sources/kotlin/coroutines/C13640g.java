package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13636e;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¨\u0006\u0013"}, mo71668d2 = {"Lkotlin/coroutines/g;", "", "Lkotlin/coroutines/g$b;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lqa/p;)Ljava/lang/Object;", "context", "plus", "minusKey", "b", "c", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.g */
/* compiled from: CoroutineContext.kt */
public interface C13640g {

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.coroutines.g$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C13641a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lkotlin/coroutines/g;", "acc", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.coroutines.g$a$a */
        /* compiled from: CoroutineContext.kt */
        static final class C13642a extends C13708q implements C16269p<C13640g, C13643b, C13640g> {

            /* renamed from: a */
            public static final C13642a f61898a = new C13642a();

            C13642a() {
                super(2);
            }

            /* renamed from: a */
            public final C13640g invoke(C13640g gVar, C13643b bVar) {
                C13630c cVar;
                C13706o.m87929f(gVar, "acc");
                C13706o.m87929f(bVar, "element");
                C13640g minusKey = gVar.minusKey(bVar.getKey());
                C13646h hVar = C13646h.f61899a;
                if (minusKey == hVar) {
                    return bVar;
                }
                C13636e.C13638b bVar2 = C13636e.f61896u;
                C13636e eVar = (C13636e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new C13630c(minusKey, bVar);
                } else {
                    C13640g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new C13630c(bVar, eVar);
                    }
                    cVar = new C13630c(new C13630c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static C13640g m87820a(C13640g gVar, C13640g gVar2) {
            C13706o.m87929f(gVar2, "context");
            return gVar2 == C13646h.f61899a ? gVar : (C13640g) gVar2.fold(gVar, C13642a.f61898a);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo71668d2 = {"Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "getKey", "()Lkotlin/coroutines/g$c;", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.g$b */
    /* compiled from: CoroutineContext.kt */
    public interface C13643b extends C13640g {

        @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
        /* renamed from: kotlin.coroutines.g$b$a */
        /* compiled from: CoroutineContext.kt */
        public static final class C13644a {
            /* renamed from: a */
            public static <R> R m87822a(C13643b bVar, R r, C16269p<? super R, ? super C13643b, ? extends R> pVar) {
                C13706o.m87929f(pVar, "operation");
                return pVar.invoke(r, bVar);
            }

            /* renamed from: b */
            public static <E extends C13643b> E m87823b(C13643b bVar, C13645c<E> cVar) {
                C13706o.m87929f(cVar, "key");
                if (!C13706o.m87924a(bVar.getKey(), cVar)) {
                    return null;
                }
                C13706o.m87927d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static C13640g m87824c(C13643b bVar, C13645c<?> cVar) {
                C13706o.m87929f(cVar, "key");
                return C13706o.m87924a(bVar.getKey(), cVar) ? C13646h.f61899a : bVar;
            }

            /* renamed from: d */
            public static C13640g m87825d(C13643b bVar, C13640g gVar) {
                C13706o.m87929f(gVar, "context");
                return C13641a.m87820a(bVar, gVar);
            }
        }

        <E extends C13643b> E get(C13645c<E> cVar);

        C13645c<?> getKey();
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo71668d2 = {"Lkotlin/coroutines/g$c;", "Lkotlin/coroutines/g$b;", "E", "", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.g$c */
    /* compiled from: CoroutineContext.kt */
    public interface C13645c<E extends C13643b> {
    }

    <R> R fold(R r, C16269p<? super R, ? super C13643b, ? extends R> pVar);

    <E extends C13643b> E get(C13645c<E> cVar);

    C13640g minusKey(C13645c<?> cVar);

    C13640g plus(C13640g gVar);
}
