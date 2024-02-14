package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002(\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo71668d2 = {"T", "Lkotlin/Function2;", "Landroidx/paging/SimpleProducerScope;", "Lkotlin/coroutines/d;", "Lja/u;", "", "block", "Lkotlinx/coroutines/flow/f;", "simpleChannelFlow", "(Lqa/p;)Lkotlinx/coroutines/flow/f;", "paging-common"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: SimpleChannelFlow.kt */
public final class SimpleChannelFlowKt {
    public static final <T> C15285f<T> simpleChannelFlow(C16269p<? super SimpleProducerScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(pVar, "block");
        return C15347l.m94220b(C15290h.m94132r(new SimpleChannelFlowKt$simpleChannelFlow$1(pVar, (C13635d<? super SimpleChannelFlowKt$simpleChannelFlow$1>) null)), -2, (C15220e) null, 2, (Object) null);
    }
}
