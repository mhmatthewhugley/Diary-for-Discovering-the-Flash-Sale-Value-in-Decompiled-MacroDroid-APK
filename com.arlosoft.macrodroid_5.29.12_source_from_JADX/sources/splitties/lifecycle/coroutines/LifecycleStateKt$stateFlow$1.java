package splitties.lifecycle.coroutines;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.channels.C15235p;
import kotlinx.coroutines.channels.C15239r;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lkotlinx/coroutines/channels/r;", "Landroidx/lifecycle/Lifecycle$State;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
@C13658f(mo71893c = "splitties.lifecycle.coroutines.LifecycleStateKt$stateFlow$1", mo71894f = "LifecycleState.kt", mo71895l = {54}, mo71896m = "invokeSuspend")
/* compiled from: LifecycleState.kt */
final class LifecycleStateKt$stateFlow$1 extends C13665l implements C16269p<C15239r<? super Lifecycle.State>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ Lifecycle $this_stateFlow;
    Object L$0;
    Object L$1;
    int label;

    /* renamed from: p$ */
    private C15239r f69211p$;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "invoke", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: splitties.lifecycle.coroutines.LifecycleStateKt$stateFlow$1$a */
    /* compiled from: LifecycleState.kt */
    static final class C17439a extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ LifecycleEventObserver $observer;
        final /* synthetic */ LifecycleStateKt$stateFlow$1 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17439a(LifecycleStateKt$stateFlow$1 lifecycleStateKt$stateFlow$1, LifecycleEventObserver lifecycleEventObserver) {
            super(0);
            this.this$0 = lifecycleStateKt$stateFlow$1;
            this.$observer = lifecycleEventObserver;
        }

        public final void invoke() {
            this.this$0.$this_stateFlow.removeObserver(this.$observer);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LifecycleStateKt$stateFlow$1(Lifecycle lifecycle, C13635d dVar) {
        super(2, dVar);
        this.$this_stateFlow = lifecycle;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        C13706o.m87929f(dVar, "completion");
        LifecycleStateKt$stateFlow$1 lifecycleStateKt$stateFlow$1 = new LifecycleStateKt$stateFlow$1(this.$this_stateFlow, dVar);
        lifecycleStateKt$stateFlow$1.f69211p$ = (C15239r) obj;
        return lifecycleStateKt$stateFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleStateKt$stateFlow$1) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15239r rVar = this.f69211p$;
            LifecycleStateKt$stateFlow$1$observer$1 lifecycleStateKt$stateFlow$1$observer$1 = new LifecycleStateKt$stateFlow$1$observer$1(this, rVar);
            this.$this_stateFlow.addObserver(lifecycleStateKt$stateFlow$1$observer$1);
            C17439a aVar = new C17439a(this, lifecycleStateKt$stateFlow$1$observer$1);
            this.L$0 = rVar;
            this.L$1 = lifecycleStateKt$stateFlow$1$observer$1;
            this.label = 1;
            if (C15235p.m93897a(rVar, aVar, this) == c) {
                return c;
            }
        } else if (i == 1) {
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) this.L$1;
            C15239r rVar2 = (C15239r) this.L$0;
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
