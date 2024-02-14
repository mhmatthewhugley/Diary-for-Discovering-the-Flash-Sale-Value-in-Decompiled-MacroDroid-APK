package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.jvm.internal.C13695i;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15239r;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aH\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo71668d2 = {"T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/g;", "Lkotlin/coroutines/d;", "Lja/u;", "", "block", "Lkotlinx/coroutines/flow/f;", "b", "(Lqa/p;)Lkotlinx/coroutines/flow/f;", "", "elements", "d", "([Ljava/lang/Object;)Lkotlinx/coroutines/flow/f;", "value", "c", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/channels/r;", "a", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.i */
/* compiled from: Builders.kt */
final /* synthetic */ class C15295i {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/i$a", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.i$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15296a implements C15285f<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f64526a;

        @Metadata(mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
        @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", mo71894f = "Builders.kt", mo71895l = {114}, mo71896m = "collect")
        /* renamed from: kotlinx.coroutines.flow.i$a$a */
        /* compiled from: SafeCollector.common.kt */
        public static final class C15297a extends C13656d {
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C15296a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15297a(C15296a aVar, C13635d dVar) {
                super(dVar);
                this.this$0 = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((C15288g) null, this);
            }
        }

        public C15296a(Object[] objArr) {
            this.f64526a = objArr;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(kotlinx.coroutines.flow.C15288g<? super T> r8, kotlin.coroutines.C13635d<? super p297ja.C13339u> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.C15295i.C15296a.C15297a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                kotlinx.coroutines.flow.i$a$a r0 = (kotlinx.coroutines.flow.C15295i.C15296a.C15297a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.i$a$a r0 = new kotlinx.coroutines.flow.i$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0042
                if (r2 != r3) goto L_0x003a
                int r8 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                kotlinx.coroutines.flow.g r4 = (kotlinx.coroutines.flow.C15288g) r4
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.i$a r5 = (kotlinx.coroutines.flow.C15295i.C15296a) r5
                p297ja.C13332o.m85685b(r9)
                r9 = r4
                r6 = r1
                r1 = r0
                r0 = r2
                r2 = r6
                goto L_0x004f
            L_0x003a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0042:
                p297ja.C13332o.m85685b(r9)
                r9 = 0
                java.lang.Object[] r2 = r7.f64526a
                int r2 = r2.length
                r5 = r7
                r9 = r8
                r8 = r2
                r2 = r1
                r1 = r0
                r0 = 0
            L_0x004f:
                if (r0 >= r8) goto L_0x0068
                java.lang.Object[] r4 = r5.f64526a
                r4 = r4[r0]
                int r0 = r0 + 1
                r1.L$0 = r5
                r1.L$1 = r9
                r1.I$0 = r0
                r1.I$1 = r8
                r1.label = r3
                java.lang.Object r4 = r9.emit(r4, r1)
                if (r4 != r2) goto L_0x004f
                return r2
            L_0x0068:
                ja.u r8 = p297ja.C13339u.f61331a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C15295i.C15296a.collect(kotlinx.coroutines.flow.g, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/i$b", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.i$b */
    /* compiled from: SafeCollector.common.kt */
    public static final class C15298b implements C15285f<T> {

        /* renamed from: a */
        final /* synthetic */ Object f64527a;

        public C15298b(Object obj) {
            this.f64527a = obj;
        }

        public Object collect(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
            Object emit = gVar.emit(this.f64527a, dVar);
            if (emit == C13652d.m87832c()) {
                return emit;
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: a */
    public static final <T> C15285f<T> m94143a(C16269p<? super C15239r<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        return new C15274b(pVar, (C13640g) null, 0, (C15220e) null, 14, (C13695i) null);
    }

    /* renamed from: b */
    public static final <T> C15285f<T> m94144b(C16269p<? super C15288g<? super T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        return new C15405y(pVar);
    }

    /* renamed from: c */
    public static final <T> C15285f<T> m94145c(T t) {
        return new C15298b(t);
    }

    /* renamed from: d */
    public static final <T> C15285f<T> m94146d(T... tArr) {
        return new C15296a(tArr);
    }
}
