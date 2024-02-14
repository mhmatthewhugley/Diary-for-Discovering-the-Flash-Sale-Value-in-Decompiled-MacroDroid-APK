package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13704m;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, mo71668d2 = {"kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.s */
/* compiled from: SafeCollector.kt */
public final class C15331s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C16270q<C15288g<Object>, Object, C13635d<? super C13339u>, Object> f64554a = ((C16270q) C13698j0.m87907g(C15332a.f64555a, 3));

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    /* renamed from: kotlinx.coroutines.flow.internal.s$a */
    /* compiled from: SafeCollector.kt */
    /* synthetic */ class C15332a extends C13704m implements C16270q {

        /* renamed from: a */
        public static final C15332a f64555a = new C15332a();

        C15332a() {
            super(3, C15288g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: l */
        public final Object invoke(C15288g<Object> gVar, Object obj, C13635d<? super C13339u> dVar) {
            return gVar.emit(obj, dVar);
        }
    }
}
