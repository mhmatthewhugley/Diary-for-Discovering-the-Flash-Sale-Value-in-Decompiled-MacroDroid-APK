package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo71668d2 = {"T", "Lkotlinx/coroutines/w1;", "controller", "Lkotlin/Function2;", "Landroidx/paging/SimpleProducerScope;", "Lkotlin/coroutines/d;", "Lja/u;", "", "block", "Lkotlinx/coroutines/flow/f;", "cancelableChannelFlow", "(Lkotlinx/coroutines/w1;Lqa/p;)Lkotlinx/coroutines/flow/f;", "paging-common"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: CancelableChannelFlow.kt */
public final class CancelableChannelFlowKt {
    public static final <T> C15285f<T> cancelableChannelFlow(C15561w1 w1Var, C16269p<? super SimpleProducerScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(w1Var, "controller");
        C13706o.m87929f(pVar, "block");
        return SimpleChannelFlowKt.simpleChannelFlow(new CancelableChannelFlowKt$cancelableChannelFlow$1(w1Var, pVar, (C13635d<? super CancelableChannelFlowKt$cancelableChannelFlow$1>) null));
    }
}
