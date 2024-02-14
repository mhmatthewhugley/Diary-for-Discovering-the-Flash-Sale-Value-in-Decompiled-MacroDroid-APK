package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.internal.C15310h;
import kotlinx.coroutines.internal.C15431b0;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a`\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000220\b\u0001\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aT\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\b\u0001\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\" \u0010\u0014\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0016\u001a\u00020\u00158\u0006XT¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/g;", "Lkotlin/coroutines/d;", "Lja/u;", "", "transform", "b", "(Lkotlinx/coroutines/flow/f;Lqa/q;)Lkotlinx/coroutines/flow/f;", "Lkotlin/Function2;", "a", "(Lkotlinx/coroutines/flow/f;Lqa/p;)Lkotlinx/coroutines/flow/f;", "", "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.p */
/* compiled from: Merge.kt */
final /* synthetic */ class C15376p {

    /* renamed from: a */
    private static final int f64593a = C15431b0.m94340b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/flow/g;", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", mo71894f = "Merge.kt", mo71895l = {214, 214}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.p$a */
    /* compiled from: Merge.kt */
    static final class C15377a extends C13665l implements C16270q<C15288g<? super R>, T, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C16269p<T, C13635d<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15377a(C16269p<? super T, ? super C13635d<? super R>, ? extends Object> pVar, C13635d<? super C15377a> dVar) {
            super(3, dVar);
            this.$transform = pVar;
        }

        public final Object invoke(C15288g<? super R> gVar, T t, C13635d<? super C13339u> dVar) {
            C15377a aVar = new C15377a(this.$transform, dVar);
            aVar.L$0 = gVar;
            aVar.L$1 = t;
            return aVar.invokeSuspend(C13339u.f61331a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
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
                goto L_0x0045
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
                qa.p<T, kotlin.coroutines.d<? super R>, java.lang.Object> r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L_0x0039
                return r0
            L_0x0039:
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L_0x0045
                return r0
            L_0x0045:
                ja.u r6 = p297ja.C13339u.f61331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15376p.C15377a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T, R> C15285f<R> m94243a(C15285f<? extends T> fVar, C16269p<? super T, ? super C13635d<? super R>, ? extends Object> pVar) {
        return C15290h.m94113D(fVar, new C15377a(pVar, (C13635d<? super C15377a>) null));
    }

    /* renamed from: b */
    public static final <T, R> C15285f<R> m94244b(C15285f<? extends T> fVar, C16270q<? super C15288g<? super R>, ? super T, ? super C13635d<? super C13339u>, ? extends Object> qVar) {
        return new C15310h(qVar, fVar, (C13640g) null, 0, (C15220e) null, 28, (C13695i) null);
    }
}
