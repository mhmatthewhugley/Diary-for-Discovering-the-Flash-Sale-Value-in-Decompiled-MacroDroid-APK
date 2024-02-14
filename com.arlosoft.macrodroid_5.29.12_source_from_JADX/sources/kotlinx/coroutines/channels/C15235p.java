package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15408g0;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010j\u0004\u0018\u0001`\u00122*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo71668d2 = {"Lkotlinx/coroutines/channels/r;", "Lkotlin/Function0;", "Lja/u;", "block", "a", "(Lkotlinx/coroutines/channels/r;Lqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "E", "Lkotlinx/coroutines/k0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "Lkotlinx/coroutines/m0;", "start", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlinx/coroutines/channels/t;", "b", "(Lkotlinx/coroutines/k0;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;Lkotlinx/coroutines/m0;Lqa/l;Lqa/p;)Lkotlinx/coroutines/channels/t;", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.p */
/* compiled from: Produce.kt */
public final class C15235p {

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.channels.ProduceKt", mo71894f = "Produce.kt", mo71895l = {153}, mo71896m = "awaitClose")
    /* renamed from: kotlinx.coroutines.channels.p$a */
    /* compiled from: Produce.kt */
    static final class C15236a extends C13656d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C15236a(C13635d<? super C15236a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C15235p.m93897a((C15239r<?>) null, (C16254a<C13339u>) null, this);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.p$b */
    /* compiled from: Produce.kt */
    static final class C15237b extends C13708q implements C16265l<Throwable, C13339u> {
        final /* synthetic */ C15492n<C13339u> $cont;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15237b(C15492n<? super C13339u> nVar) {
            super(1);
            this.$cont = nVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            C15492n<C13339u> nVar = this.$cont;
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: qa.a<ja.u>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m93897a(kotlinx.coroutines.channels.C15239r<?> r4, p370qa.C16254a<p297ja.C13339u> r5, kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.C15235p.C15236a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.p$a r0 = (kotlinx.coroutines.channels.C15235p.C15236a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.p$a r0 = new kotlinx.coroutines.channels.p$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.L$1
            r5 = r4
            qa.a r5 = (p370qa.C16254a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.C15239r) r4
            p297ja.C13332o.m85685b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x007a
        L_0x0032:
            r4 = move-exception
            goto L_0x0080
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            p297ja.C13332o.m85685b(r6)
            kotlin.coroutines.g r6 = r0.getContext()
            kotlinx.coroutines.w1$b r2 = kotlinx.coroutines.C15561w1.f64808x
            kotlin.coroutines.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0084
            r0.L$0 = r4     // Catch:{ all -> 0x0032 }
            r0.L$1 = r5     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            kotlinx.coroutines.o r6 = new kotlinx.coroutines.o     // Catch:{ all -> 0x0032 }
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.C13649c.m87831b(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.mo74864z()     // Catch:{ all -> 0x0032 }
            kotlinx.coroutines.channels.p$b r2 = new kotlinx.coroutines.channels.p$b     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.invokeOnClose(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.mo74862w()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = kotlin.coroutines.intrinsics.C13652d.m87832c()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0077
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0077:
            if (r4 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r5.invoke()
            ja.u r4 = p297ja.C13339u.f61331a
            return r4
        L_0x0080:
            r5.invoke()
            throw r4
        L_0x0084:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C15235p.m93897a(kotlinx.coroutines.channels.r, qa.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: b */
    public static final <E> C15241t<E> m93898b(C15478k0 k0Var, C13640g gVar, int i, C15220e eVar, C15486m0 m0Var, C16265l<? super Throwable, C13339u> lVar, C16269p<? super C15239r<? super E>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C15238q qVar = new C15238q(C15408g0.m94273e(k0Var, gVar), C15225i.m93852d(i, eVar, (C16265l) null, 4, (Object) null));
        if (lVar != null) {
            qVar.mo74617p(lVar);
        }
        qVar.mo74485J0(m0Var, qVar, pVar);
        return qVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C15241t m93899c(C15478k0 k0Var, C13640g gVar, int i, C15220e eVar, C15486m0 m0Var, C16265l lVar, C16269p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = C13646h.f61899a;
        }
        C13640g gVar2 = gVar;
        int i3 = (i2 & 2) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            eVar = C15220e.SUSPEND;
        }
        C15220e eVar2 = eVar;
        if ((i2 & 8) != 0) {
            m0Var = C15486m0.DEFAULT;
        }
        C15486m0 m0Var2 = m0Var;
        if ((i2 & 16) != 0) {
            lVar = null;
        }
        return m93898b(k0Var, gVar2, i3, eVar2, m0Var2, lVar, pVar);
    }
}
