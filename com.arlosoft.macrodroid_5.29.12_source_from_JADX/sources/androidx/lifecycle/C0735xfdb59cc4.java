package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;
import p297ja.C13332o;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lja/u;", "onStateChanged", "lifecycle-runtime-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* compiled from: WithLifecycleState.kt */
public final class C0735xfdb59cc4 implements LifecycleEventObserver {
    final /* synthetic */ C16254a<R> $block;
    final /* synthetic */ C15492n<R> $co;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    C0735xfdb59cc4(Lifecycle.State state, Lifecycle lifecycle, C15492n<? super R> nVar, C16254a<? extends R> aVar) {
        this.$state = state;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$co = nVar;
        this.$block = aVar;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Object obj;
        C13706o.m87929f(lifecycleOwner, "source");
        C13706o.m87929f(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.upTo(this.$state)) {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this);
            C15492n<R> nVar = this.$co;
            C16254a<R> aVar = this.$block;
            try {
                C13329n.C13330a aVar2 = C13329n.f61327a;
                obj = C13329n.m85676a(aVar.invoke());
            } catch (Throwable th) {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                obj = C13329n.m85676a(C13332o.m85684a(th));
            }
            nVar.resumeWith(obj);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this);
            C15492n<R> nVar2 = this.$co;
            LifecycleDestroyedException lifecycleDestroyedException = new LifecycleDestroyedException();
            C13329n.C13330a aVar4 = C13329n.f61327a;
            nVar2.resumeWith(C13329n.m85676a(C13332o.m85684a(lifecycleDestroyedException)));
        }
    }
}
