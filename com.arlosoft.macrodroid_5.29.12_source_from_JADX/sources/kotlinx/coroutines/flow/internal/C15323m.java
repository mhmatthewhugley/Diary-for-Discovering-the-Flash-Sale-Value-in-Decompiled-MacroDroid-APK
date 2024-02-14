package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlinx.coroutines.flow.C15288g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¨\u0006\u0005"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Lkotlinx/coroutines/flow/g;", "owner", "Lja/u;", "a", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.m */
/* compiled from: FlowExceptions.common.kt */
public final class C15323m {
    /* renamed from: a */
    public static final void m94186a(AbortFlowException abortFlowException, C15288g<?> gVar) {
        if (abortFlowException.mo74673a() != gVar) {
            throw abortFlowException;
        }
    }
}
