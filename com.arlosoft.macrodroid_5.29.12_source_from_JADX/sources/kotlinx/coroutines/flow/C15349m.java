package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aY\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/f;", "a", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "b", "(Lkotlinx/coroutines/flow/f;Lqa/l;Lqa/p;)Lkotlinx/coroutines/flow/f;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.m */
/* compiled from: Distinct.kt */
final /* synthetic */ class C15349m {

    /* renamed from: a */
    private static final C16265l<Object, Object> f64566a = C15351b.f64569a;

    /* renamed from: b */
    private static final C16269p<Object, Object, Boolean> f64567b = C15350a.f64568a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "old", "new", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.m$a */
    /* compiled from: Distinct.kt */
    static final class C15350a extends C13708q implements C16269p<Object, Object, Boolean> {

        /* renamed from: a */
        public static final C15350a f64568a = new C15350a();

        C15350a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C13706o.m87924a(obj, obj2));
        }
    }

    @Metadata(mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo71668d2 = {"<anonymous>", "", "it", "invoke"}, mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.flow.m$b */
    /* compiled from: Distinct.kt */
    static final class C15351b extends C13708q implements C16265l<Object, Object> {

        /* renamed from: a */
        public static final C15351b f64569a = new C15351b();

        C15351b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static final <T> C15285f<T> m94229a(C15285f<? extends T> fVar) {
        return fVar instanceof C15299i0 ? fVar : m94230b(fVar, f64566a, f64567b);
    }

    /* renamed from: b */
    private static final <T> C15285f<T> m94230b(C15285f<? extends T> fVar, C16265l<? super T, ? extends Object> lVar, C16269p<Object, Object, Boolean> pVar) {
        if (fVar instanceof C15281e) {
            C15281e eVar = (C15281e) fVar;
            if (eVar.f64511c == lVar && eVar.f64512d == pVar) {
                return fVar;
            }
        }
        return new C15281e(fVar, lVar, pVar);
    }
}
