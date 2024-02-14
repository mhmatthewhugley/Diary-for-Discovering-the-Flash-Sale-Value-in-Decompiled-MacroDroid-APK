package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;
import p370qa.C16271r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a`\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022.\u0010\u000e\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000b\u001a[\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022*\b\u0004\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0010H\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aU\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\b\u0004\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0010H\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001au\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u000220\b\u0004\u0010\u000e\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0017HHø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, mo71668d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "initial", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "", "operation", "simpleScan", "(Lkotlinx/coroutines/flow/f;Ljava/lang/Object;Lqa/q;)Lkotlinx/coroutines/flow/f;", "simpleRunningReduce", "(Lkotlinx/coroutines/flow/f;Lqa/q;)Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "Lja/u;", "transform", "simpleTransformLatest", "Lkotlin/Function2;", "simpleFlatMapLatest", "(Lkotlinx/coroutines/flow/f;Lqa/p;)Lkotlinx/coroutines/flow/f;", "simpleMapLatest", "T1", "T2", "otherFlow", "Lkotlin/Function4;", "Landroidx/paging/CombineSource;", "combineWithoutBatching", "(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/f;Lqa/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "NULL", "Ljava/lang/Object;", "paging-common"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: FlowExt.kt */
public final class FlowExtKt {
    /* access modifiers changed from: private */
    public static final Object NULL = new Object();

    public static final <T1, T2, R> Object combineWithoutBatching(C15285f<? extends T1> fVar, C15285f<? extends T2> fVar2, C16271r<? super T1, ? super T2, ? super CombineSource, ? super C13635d<? super R>, ? extends Object> rVar, C13635d<? super C15285f<? extends R>> dVar) {
        return SimpleChannelFlowKt.simpleChannelFlow(new FlowExtKt$combineWithoutBatching$2(fVar, fVar2, rVar, (C13635d<? super FlowExtKt$combineWithoutBatching$2>) null));
    }

    private static final <T1, T2, R> Object combineWithoutBatching$$forInline(C15285f<? extends T1> fVar, C15285f<? extends T2> fVar2, C16271r<? super T1, ? super T2, ? super CombineSource, ? super C13635d<? super R>, ? extends Object> rVar, C13635d<? super C15285f<? extends R>> dVar) {
        return SimpleChannelFlowKt.simpleChannelFlow(new FlowExtKt$combineWithoutBatching$2(fVar, fVar2, rVar, (C13635d<? super FlowExtKt$combineWithoutBatching$2>) null));
    }

    public static final <T, R> C15285f<R> simpleFlatMapLatest(C15285f<? extends T> fVar, C16269p<? super T, ? super C13635d<? super C15285f<? extends R>>, ? extends Object> pVar) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(pVar, "transform");
        return simpleTransformLatest(fVar, new FlowExtKt$simpleFlatMapLatest$1(pVar, (C13635d<? super FlowExtKt$simpleFlatMapLatest$1>) null));
    }

    public static final <T, R> C15285f<R> simpleMapLatest(C15285f<? extends T> fVar, C16269p<? super T, ? super C13635d<? super R>, ? extends Object> pVar) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(pVar, "transform");
        return simpleTransformLatest(fVar, new FlowExtKt$simpleMapLatest$1(pVar, (C13635d<? super FlowExtKt$simpleMapLatest$1>) null));
    }

    public static final <T> C15285f<T> simpleRunningReduce(C15285f<? extends T> fVar, C16270q<? super T, ? super T, ? super C13635d<? super T>, ? extends Object> qVar) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(qVar, "operation");
        return C15290h.m94132r(new FlowExtKt$simpleRunningReduce$1(fVar, qVar, (C13635d<? super FlowExtKt$simpleRunningReduce$1>) null));
    }

    public static final <T, R> C15285f<R> simpleScan(C15285f<? extends T> fVar, R r, C16270q<? super R, ? super T, ? super C13635d<? super R>, ? extends Object> qVar) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(qVar, "operation");
        return C15290h.m94132r(new FlowExtKt$simpleScan$1(r, fVar, qVar, (C13635d<? super FlowExtKt$simpleScan$1>) null));
    }

    public static final <T, R> C15285f<R> simpleTransformLatest(C15285f<? extends T> fVar, C16270q<? super C15288g<? super R>, ? super T, ? super C13635d<? super C13339u>, ? extends Object> qVar) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(qVar, "transform");
        return SimpleChannelFlowKt.simpleChannelFlow(new FlowExtKt$simpleTransformLatest$1(fVar, qVar, (C13635d<? super FlowExtKt$simpleTransformLatest$1>) null));
    }
}
