package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.internal.C15437e0;
import kotlinx.coroutines.internal.C15471y;
import p289ic.C12514a;
import p289ic.C12515b;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aL\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aX\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aR\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H@ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/m0;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lja/u;", "", "block", "Lkotlinx/coroutines/w1;", "c", "(Lkotlinx/coroutines/k0;Lkotlin/coroutines/g;Lkotlinx/coroutines/m0;Lqa/p;)Lkotlinx/coroutines/w1;", "T", "Lkotlinx/coroutines/r0;", "a", "(Lkotlinx/coroutines/k0;Lkotlin/coroutines/g;Lkotlinx/coroutines/m0;Lqa/p;)Lkotlinx/coroutines/r0;", "e", "(Lkotlin/coroutines/g;Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: kotlinx.coroutines.j */
/* compiled from: Builders.common.kt */
final /* synthetic */ class C15473j {
    /* renamed from: a */
    public static final <T> C15510r0<T> m94489a(C15478k0 k0Var, C13640g gVar, C15486m0 m0Var, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar) {
        C15514s0 s0Var;
        C13640g e = C15408g0.m94273e(k0Var, gVar);
        if (m0Var.mo74838e()) {
            s0Var = new C15267f2(e, pVar);
        } else {
            s0Var = new C15514s0(e, true);
        }
        s0Var.mo74485J0(m0Var, s0Var, pVar);
        return s0Var;
    }

    /* renamed from: b */
    public static /* synthetic */ C15510r0 m94490b(C15478k0 k0Var, C13640g gVar, C15486m0 m0Var, C16269p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C13646h.f61899a;
        }
        if ((i & 2) != 0) {
            m0Var = C15486m0.DEFAULT;
        }
        return C15414h.m94292a(k0Var, gVar, m0Var, pVar);
    }

    /* renamed from: c */
    public static final C15561w1 m94491c(C15478k0 k0Var, C13640g gVar, C15486m0 m0Var, C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C15184a aVar;
        C13640g e = C15408g0.m94273e(k0Var, gVar);
        if (m0Var.mo74838e()) {
            aVar = new C15413g2(e, pVar);
        } else {
            aVar = new C15508q2(e, true);
        }
        aVar.mo74485J0(m0Var, aVar, pVar);
        return aVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C15561w1 m94492d(C15478k0 k0Var, C13640g gVar, C15486m0 m0Var, C16269p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C13646h.f61899a;
        }
        if ((i & 2) != 0) {
            m0Var = C15486m0.DEFAULT;
        }
        return C15414h.m94294c(k0Var, gVar, m0Var, pVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static final <T> Object m94493e(C13640g gVar, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super T> dVar) {
        Object obj;
        C13640g context = dVar.getContext();
        C13640g d = C15408g0.m94272d(context, gVar);
        C15575z1.m94759g(d);
        if (d == context) {
            C15471y yVar = new C15471y(d, dVar);
            obj = C12515b.m83623b(yVar, yVar, pVar);
        } else {
            C13636e.C13638b bVar = C13636e.f61896u;
            if (C13706o.m87924a(d.get(bVar), context.get(bVar))) {
                C15199b3 b3Var = new C15199b3(d, dVar);
                Object c = C15437e0.m94362c(d, (Object) null);
                try {
                    Object b = C12515b.m83623b(b3Var, b3Var, pVar);
                    C15437e0.m94360a(d, c);
                    obj = b;
                } catch (Throwable th) {
                    C15437e0.m94360a(d, c);
                    throw th;
                }
            } else {
                C15560w0 w0Var = new C15560w0(d, dVar);
                C12514a.m83621d(pVar, w0Var, w0Var, (C16265l) null, 4, (Object) null);
                obj = w0Var.mo74925L0();
            }
        }
        if (obj == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return obj;
    }
}
