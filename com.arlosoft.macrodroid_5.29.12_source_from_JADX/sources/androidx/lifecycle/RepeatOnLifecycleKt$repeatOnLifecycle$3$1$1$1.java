package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.sync.C15536b;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, mo71668d2 = {"Landroidx/lifecycle/LifecycleOwner;", "<anonymous parameter 0>", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: RepeatOnLifecycle.kt */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements LifecycleEventObserver {
    final /* synthetic */ C15478k0 $$this$coroutineScope;
    final /* synthetic */ C16269p<C15478k0, C13635d<? super C13339u>, Object> $block;
    final /* synthetic */ Lifecycle.Event $cancelWorkEvent;
    final /* synthetic */ C15492n<C13339u> $cont;
    final /* synthetic */ C13684d0<C15561w1> $launchedJob;
    final /* synthetic */ C15536b $mutex;
    final /* synthetic */ Lifecycle.Event $startWorkEvent;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", mo71894f = "RepeatOnLifecycle.kt", mo71895l = {171, 110}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 */
    /* compiled from: RepeatOnLifecycle.kt */
    static final class C07281 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C07281(bVar, pVar, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C07281) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th;
            C15536b bVar;
            C15536b bVar2;
            C16269p<C15478k0, C13635d<? super C13339u>, Object> pVar;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                bVar2 = bVar;
                pVar = pVar;
                this.L$0 = bVar2;
                this.L$1 = pVar;
                this.label = 1;
                if (bVar2.mo74906a((Object) null, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                pVar = (C16269p) this.L$1;
                C13332o.m85685b(obj);
                bVar2 = (C15536b) this.L$0;
            } else if (i == 2) {
                bVar = (C15536b) this.L$0;
                try {
                    C13332o.m85685b(obj);
                    C13339u uVar = C13339u.f61331a;
                    bVar.mo74907b((Object) null);
                    return uVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(pVar, (C13635d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1>) null);
                this.L$0 = bVar2;
                this.L$1 = null;
                this.label = 2;
                if (C15482l0.m94505d(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == c) {
                    return c;
                }
                bVar = bVar2;
                C13339u uVar2 = C13339u.f61331a;
                bVar.mo74907b((Object) null);
                return uVar2;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bVar = bVar2;
                th = th4;
                bVar.mo74907b((Object) null);
                throw th;
            }
        }
    }

    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(Lifecycle.Event event, C13684d0<C15561w1> d0Var, C15478k0 k0Var, Lifecycle.Event event2, C15492n<? super C13339u> nVar, C15536b bVar, C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        this.$startWorkEvent = event;
        this.$launchedJob = d0Var;
        this.$$this$coroutineScope = k0Var;
        this.$cancelWorkEvent = event2;
        this.$cont = nVar;
        this.$mutex = bVar;
        this.$block = pVar;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C13706o.m87929f(lifecycleOwner, "$noName_0");
        C13706o.m87929f(event, NotificationCompat.CATEGORY_EVENT);
        if (event == this.$startWorkEvent) {
            C13684d0<C15561w1> d0Var = this.$launchedJob;
            C15478k0 k0Var = this.$$this$coroutineScope;
            final C15536b bVar = this.$mutex;
            final C16269p<C15478k0, C13635d<? super C13339u>, Object> pVar = this.$block;
            d0Var.element = C15473j.m94492d(k0Var, (C13640g) null, (C15486m0) null, new C07281((C13635d<? super C07281>) null), 3, (Object) null);
            return;
        }
        if (event == this.$cancelWorkEvent) {
            C15561w1 w1Var = (C15561w1) this.$launchedJob.element;
            if (w1Var != null) {
                C15561w1.C15562a.m94723a(w1Var, (CancellationException) null, 1, (Object) null);
            }
            this.$launchedJob.element = null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            C15492n<C13339u> nVar = this.$cont;
            C13339u uVar = C13339u.f61331a;
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(uVar));
        }
    }
}
