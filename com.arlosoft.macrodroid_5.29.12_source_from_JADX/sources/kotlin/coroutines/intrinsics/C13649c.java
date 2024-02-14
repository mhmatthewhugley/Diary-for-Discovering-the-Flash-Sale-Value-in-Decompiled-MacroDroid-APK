package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13653a;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.coroutines.jvm.internal.C13663j;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo71668d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "receiver", "completion", "Lja/u;", "a", "(Lqa/p;Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "b", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* renamed from: kotlin.coroutines.intrinsics.c */
/* compiled from: IntrinsicsJvm.kt */
class C13649c {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo71668d2 = {"kotlin/coroutines/intrinsics/c$a", "Lkotlin/coroutines/jvm/internal/j;", "Lja/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "label", "I", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.intrinsics.c$a */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C13650a extends C13663j {
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ C16269p $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13650a(C13635d dVar, C16269p pVar, Object obj) {
            super(dVar);
            this.$this_createCoroutineUnintercepted$inlined = pVar;
            this.$receiver$inlined = obj;
            C13706o.m87927d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                C13332o.m85685b(obj);
                C13706o.m87927d(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((C16269p) C13698j0.m87907g(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
            } else if (i == 1) {
                this.label = 2;
                C13332o.m85685b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo71668d2 = {"kotlin/coroutines/intrinsics/c$b", "Lkotlin/coroutines/jvm/internal/d;", "Lja/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "label", "I", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.intrinsics.c$b */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C13651b extends C13656d {
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ C16269p $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13651b(C13635d dVar, C13640g gVar, C16269p pVar, Object obj) {
            super(dVar, gVar);
            this.$this_createCoroutineUnintercepted$inlined = pVar;
            this.$receiver$inlined = obj;
            C13706o.m87927d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                C13332o.m85685b(obj);
                C13706o.m87927d(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((C16269p) C13698j0.m87907g(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
            } else if (i == 1) {
                this.label = 2;
                C13332o.m85685b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <R, T> C13635d<C13339u> m87830a(C16269p<? super R, ? super C13635d<? super T>, ? extends Object> pVar, R r, C13635d<? super T> dVar) {
        C13706o.m87929f(pVar, "<this>");
        C13706o.m87929f(dVar, "completion");
        C13635d<? super T> a = C13660h.m87845a(dVar);
        if (pVar instanceof C13653a) {
            return ((C13653a) pVar).create(r, a);
        }
        C13640g context = a.getContext();
        if (context == C13646h.f61899a) {
            return new C13650a(a, pVar, r);
        }
        return new C13651b(a, context, pVar, r);
    }

    /* renamed from: b */
    public static <T> C13635d<T> m87831b(C13635d<? super T> dVar) {
        C13635d<Object> intercepted;
        C13706o.m87929f(dVar, "<this>");
        C13656d dVar2 = dVar instanceof C13656d ? (C13656d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
