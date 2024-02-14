package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.jvm.internal.C13684d0;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aG\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "a", "(Lkotlinx/coroutines/flow/f;Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.q */
/* compiled from: Reduce.kt */
final /* synthetic */ class C15378q {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"kotlinx/coroutines/flow/q$a", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.q$a */
    /* compiled from: Limit.kt */
    public static final class C15379a implements C15288g<T> {

        /* renamed from: a */
        final /* synthetic */ C16269p f64594a;

        /* renamed from: c */
        final /* synthetic */ C13684d0 f64595c;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", mo71894f = "Reduce.kt", mo71895l = {143}, mo71896m = "emit")
        /* renamed from: kotlinx.coroutines.flow.q$a$a */
        /* compiled from: Limit.kt */
        public static final class C15380a extends C13656d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15379a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15380a(C15379a aVar, C13635d dVar) {
                super(dVar);
                this.this$0 = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public C15379a(C16269p pVar, C13684d0 d0Var) {
            this.f64594a = pVar;
            this.f64595c = d0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(T r5, kotlin.coroutines.C13635d<? super p297ja.C13339u> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C15378q.C15379a.C15380a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                kotlinx.coroutines.flow.q$a$a r0 = (kotlinx.coroutines.flow.C15378q.C15379a.C15380a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.q$a$a r0 = new kotlinx.coroutines.flow.q$a$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.L$1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.q$a r0 = (kotlinx.coroutines.flow.C15378q.C15379a) r0
                p297ja.C13332o.m85685b(r6)
                goto L_0x0052
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                p297ja.C13332o.m85685b(r6)
                qa.p r6 = r4.f64594a
                r0.L$0 = r4
                r0.L$1 = r5
                r0.label = r3
                r2 = 6
                kotlin.jvm.internal.C13705n.m87923c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.C13705n.m87923c(r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                r0 = r4
            L_0x0052:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x005f
                kotlin.jvm.internal.d0 r6 = r0.f64595c
                r6.element = r5
                r3 = 0
            L_0x005f:
                if (r3 == 0) goto L_0x0064
                ja.u r5 = p297ja.C13339u.f61331a
                return r5
            L_0x0064:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15378q.C15379a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
    @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo71894f = "Reduce.kt", mo71895l = {183}, mo71896m = "first")
    /* renamed from: kotlinx.coroutines.flow.q$b */
    /* compiled from: Reduce.kt */
    static final class C15381b<T> extends C13656d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C15381b(C13635d<? super C15381b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C15290h.m94131q((C15285f) null, (C16269p) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m94245a(kotlinx.coroutines.flow.C15285f<? extends T> r4, p370qa.C16269p<? super T, ? super kotlin.coroutines.C13635d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.coroutines.C13635d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C15378q.C15381b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.q$b r0 = (kotlinx.coroutines.flow.C15378q.C15381b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.q$b r0 = new kotlinx.coroutines.flow.q$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.flow.q$a r4 = (kotlinx.coroutines.flow.C15378q.C15379a) r4
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.d0 r5 = (kotlin.jvm.internal.C13684d0) r5
            java.lang.Object r0 = r0.L$0
            qa.p r0 = (p370qa.C16269p) r0
            p297ja.C13332o.m85685b(r6)     // Catch:{ AbortFlowException -> 0x0035 }
            goto L_0x006a
        L_0x0035:
            r6 = move-exception
            goto L_0x0067
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003f:
            p297ja.C13332o.m85685b(r6)
            kotlin.jvm.internal.d0 r6 = new kotlin.jvm.internal.d0
            r6.<init>()
            kotlinx.coroutines.internal.a0 r2 = kotlinx.coroutines.flow.internal.C15328q.f64550a
            r6.element = r2
            kotlinx.coroutines.flow.q$a r2 = new kotlinx.coroutines.flow.q$a
            r2.<init>(r5, r6)
            r0.L$0 = r5     // Catch:{ AbortFlowException -> 0x0062 }
            r0.L$1 = r6     // Catch:{ AbortFlowException -> 0x0062 }
            r0.L$2 = r2     // Catch:{ AbortFlowException -> 0x0062 }
            r0.label = r3     // Catch:{ AbortFlowException -> 0x0062 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x0062 }
            if (r4 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r0 = r5
            r5 = r6
            goto L_0x006a
        L_0x0062:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x0067:
            kotlinx.coroutines.flow.internal.C15323m.m94186a(r6, r4)
        L_0x006a:
            T r4 = r5.element
            kotlinx.coroutines.internal.a0 r5 = kotlinx.coroutines.flow.internal.C15328q.f64550a
            if (r4 == r5) goto L_0x0071
            return r4
        L_0x0071:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate "
            java.lang.String r5 = kotlin.jvm.internal.C13706o.m87936m(r5, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15378q.m94245a(kotlinx.coroutines.flow.f, qa.p, kotlin.coroutines.d):java.lang.Object");
    }
}
