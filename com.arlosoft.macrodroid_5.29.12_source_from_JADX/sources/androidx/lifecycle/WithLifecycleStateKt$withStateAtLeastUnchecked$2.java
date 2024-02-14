package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n"}, mo71668d2 = {"R", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: WithLifecycleState.kt */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2 extends C13708q implements C16254a<R> {
    final /* synthetic */ C16254a<R> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(C16254a<? extends R> aVar) {
        super(0);
        this.$block = aVar;
    }

    public final R invoke() {
        return this.$block.invoke();
    }
}
