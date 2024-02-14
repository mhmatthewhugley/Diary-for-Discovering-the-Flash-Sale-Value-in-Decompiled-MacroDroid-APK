package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\b\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ4\u0010\u000b\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u000f\u001a\u00020\f8 X \u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo71668d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Lkotlinx/coroutines/k0;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lja/u;", "", "block", "Lkotlinx/coroutines/w1;", "launchWhenCreated", "(Lqa/p;)Lkotlinx/coroutines/w1;", "launchWhenStarted", "launchWhenResumed", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_runtime_ktx_release", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "()V", "lifecycle-runtime-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: Lifecycle.kt */
public abstract class LifecycleCoroutineScope implements C15478k0 {
    public abstract /* synthetic */ C13640g getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_runtime_ktx_release();

    public final C15561w1 launchWhenCreated(C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(pVar, "block");
        return C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new LifecycleCoroutineScope$launchWhenCreated$1(this, pVar, (C13635d<? super LifecycleCoroutineScope$launchWhenCreated$1>) null), 3, (Object) null);
    }

    public final C15561w1 launchWhenResumed(C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(pVar, "block");
        return C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new LifecycleCoroutineScope$launchWhenResumed$1(this, pVar, (C13635d<? super LifecycleCoroutineScope$launchWhenResumed$1>) null), 3, (Object) null);
    }

    public final C15561w1 launchWhenStarted(C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar) {
        C13706o.m87929f(pVar, "block");
        return C15473j.m94492d(this, (C13640g) null, (C15486m0) null, new LifecycleCoroutineScope$launchWhenStarted$1(this, pVar, (C13635d<? super LifecycleCoroutineScope$launchWhenStarted$1>) null), 3, (Object) null);
    }
}
