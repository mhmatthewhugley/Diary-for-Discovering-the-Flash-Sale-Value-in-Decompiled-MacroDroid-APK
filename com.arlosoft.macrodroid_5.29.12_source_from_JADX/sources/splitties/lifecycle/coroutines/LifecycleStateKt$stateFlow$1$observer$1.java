package splitties.lifecycle.coroutines;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15239r;
import kotlinx.coroutines.channels.C15245x;
import p477uf.C17481a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"Landroidx/lifecycle/LifecycleOwner;", "<anonymous parameter 0>", "Landroidx/lifecycle/Lifecycle$Event;", "<anonymous parameter 1>", "Lja/u;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* compiled from: LifecycleState.kt */
final class LifecycleStateKt$stateFlow$1$observer$1 implements LifecycleEventObserver {

    /* renamed from: a */
    final /* synthetic */ LifecycleStateKt$stateFlow$1 f69212a;

    /* renamed from: c */
    final /* synthetic */ C15239r f69213c;

    LifecycleStateKt$stateFlow$1$observer$1(LifecycleStateKt$stateFlow$1 lifecycleStateKt$stateFlow$1, C15239r rVar) {
        this.f69212a = lifecycleStateKt$stateFlow$1;
        this.f69213c = rVar;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C13706o.m87929f(lifecycleOwner, "<anonymous parameter 0>");
        C13706o.m87929f(event, "<anonymous parameter 1>");
        C17481a.m101260a(this.f69213c, this.f69212a.$this_stateFlow.getCurrentState());
        if (this.f69212a.$this_stateFlow.getCurrentState() == Lifecycle.State.DESTROYED) {
            C15245x.C15246a.m93924a(this.f69213c.getChannel(), (Throwable) null, 1, (Object) null);
        }
    }
}
