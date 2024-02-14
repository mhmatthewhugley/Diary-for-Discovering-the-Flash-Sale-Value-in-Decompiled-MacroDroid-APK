package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13705n;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/flow/g;", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", mo71894f = "FlowExt.kt", mo71895l = {96, 96}, mo71896m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$simpleFlatMapLatest$1 extends C13665l implements C16270q<C15288g<? super R>, T, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C16269p<T, C13635d<? super C15285f<? extends R>>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleFlatMapLatest$1(C16269p<? super T, ? super C13635d<? super C15285f<? extends R>>, ? extends Object> pVar, C13635d<? super FlowExtKt$simpleFlatMapLatest$1> dVar) {
        super(3, dVar);
        this.$transform = pVar;
    }

    public final Object invoke(C15288g<? super R> gVar, T t, C13635d<? super C13339u> dVar) {
        FlowExtKt$simpleFlatMapLatest$1 flowExtKt$simpleFlatMapLatest$1 = new FlowExtKt$simpleFlatMapLatest$1(this.$transform, dVar);
        flowExtKt$simpleFlatMapLatest$1.L$0 = gVar;
        flowExtKt$simpleFlatMapLatest$1.L$1 = t;
        return flowExtKt$simpleFlatMapLatest$1.invokeSuspend(C13339u.f61331a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            p297ja.C13332o.m85685b(r6)
            goto L_0x0047
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001a:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.C15288g) r1
            p297ja.C13332o.m85685b(r6)
            goto L_0x0039
        L_0x0022:
            p297ja.C13332o.m85685b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.C15288g) r1
            java.lang.Object r6 = r5.L$1
            qa.p<T, kotlin.coroutines.d<? super kotlinx.coroutines.flow.f<? extends R>>, java.lang.Object> r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L_0x0039
            return r0
        L_0x0039:
            kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.C15285f) r6
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.flow.C15290h.m94128n(r1, r6, r5)
            if (r6 != r0) goto L_0x0047
            return r0
        L_0x0047:
            ja.u r6 = p297ja.C13339u.f61331a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$simpleFlatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Object obj2 = this.L$1;
        C13705n.m87923c(0);
        C15290h.m94128n((C15288g) this.L$0, (C15285f) this.$transform.invoke(obj2, this), this);
        C13705n.m87923c(1);
        return C13339u.f61331a;
    }
}
