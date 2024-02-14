package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15561w1;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, mo71668d2 = {"Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "<anonymous parameter 1>", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: LifecycleController.kt */
final class LifecycleController$observer$1 implements LifecycleEventObserver {
    final /* synthetic */ C15561w1 $parentJob;
    final /* synthetic */ LifecycleController this$0;

    LifecycleController$observer$1(LifecycleController lifecycleController, C15561w1 w1Var) {
        this.this$0 = lifecycleController;
        this.$parentJob = w1Var;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C13706o.m87929f(lifecycleOwner, "source");
        C13706o.m87929f(event, "$noName_1");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            LifecycleController lifecycleController = this.this$0;
            C15561w1.C15562a.m94723a(this.$parentJob, (CancellationException) null, 1, (Object) null);
            lifecycleController.finish();
        } else if (lifecycleOwner.getLifecycle().getCurrentState().compareTo(this.this$0.minState) < 0) {
            this.this$0.dispatchQueue.pause();
        } else {
            this.this$0.dispatchQueue.resume();
        }
    }
}
