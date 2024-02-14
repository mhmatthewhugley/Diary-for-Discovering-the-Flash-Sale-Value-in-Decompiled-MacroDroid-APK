package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15270a0;
import kotlinx.coroutines.flow.C15299i0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\n"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/w;", "Lkotlinx/coroutines/flow/i0;", "", "Lkotlinx/coroutines/flow/a0;", "delta", "", "X", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.w */
/* compiled from: AbstractSharedFlow.kt */
final class C15337w extends C15270a0<Integer> implements C15299i0<Integer> {
    public C15337w(int i) {
        super(1, Integer.MAX_VALUE, C15220e.DROP_OLDEST);
        mo74652b(Integer.valueOf(i));
    }

    /* renamed from: X */
    public final boolean mo74694X(int i) {
        boolean b;
        synchronized (this) {
            b = mo74652b(Integer.valueOf(((Number) mo74648K()).intValue() + i));
        }
        return b;
    }
}
