package splitties.lifecycle.coroutines;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b¸\u0006\u0000"}, mo71668d2 = {"splitties/lifecycle/coroutines/LifecycleAwaitStateKt$awaitState$3$1$observer$1", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lja/u;", "onStateChanged", "lifecycle-coroutines_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: splitties.lifecycle.coroutines.LifecycleAwaitStateKt$awaitState$3$invokeSuspend$$inlined$suspendCancellableCoroutine$lambda$1 */
/* compiled from: LifecycleAwaitState.kt */
public final class C17436x317b75c9 implements LifecycleEventObserver {

    /* renamed from: a */
    final /* synthetic */ C15492n f69206a;

    /* renamed from: c */
    final /* synthetic */ LifecycleAwaitStateKt$awaitState$3 f69207c;

    C17436x317b75c9(C15492n nVar, LifecycleAwaitStateKt$awaitState$3 lifecycleAwaitStateKt$awaitState$3) {
        this.f69206a = nVar;
        this.f69207c = lifecycleAwaitStateKt$awaitState$3;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C13706o.m87929f(lifecycleOwner, "source");
        C13706o.m87929f(event, NotificationCompat.CATEGORY_EVENT);
        if (this.f69207c.$this_awaitState.getCurrentState().compareTo(this.f69207c.$state) >= 0) {
            this.f69207c.$this_awaitState.removeObserver(this);
            C15492n nVar = this.f69206a;
            C13339u uVar = C13339u.f61331a;
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(uVar));
        } else if (this.f69207c.$this_awaitState.getCurrentState() == Lifecycle.State.DESTROYED) {
            C15492n.C15493a.m94522a(this.f69206a, (Throwable) null, 1, (Object) null);
        }
    }
}
