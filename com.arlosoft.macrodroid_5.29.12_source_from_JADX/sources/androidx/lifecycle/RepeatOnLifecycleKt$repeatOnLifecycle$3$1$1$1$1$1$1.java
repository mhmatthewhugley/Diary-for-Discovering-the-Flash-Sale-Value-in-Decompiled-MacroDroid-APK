package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", mo71894f = "RepeatOnLifecycle.kt", mo71895l = {111}, mo71896m = "invokeSuspend")
/* compiled from: RepeatOnLifecycle.kt */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C16269p<C15478k0, C13635d<? super C13339u>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13635d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1> dVar) {
        super(2, dVar);
        this.$block = pVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(this.$block, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1;
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C16269p<C15478k0, C13635d<? super C13339u>, Object> pVar = this.$block;
            this.label = 1;
            if (pVar.invoke((C15478k0) this.L$0, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
