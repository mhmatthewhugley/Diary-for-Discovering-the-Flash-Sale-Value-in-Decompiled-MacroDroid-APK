package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15478k0;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\b\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001aA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\u001aA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001aI\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo71668d2 = {"T", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function2;", "Lkotlinx/coroutines/k0;", "Lkotlin/coroutines/d;", "", "block", "whenCreated", "(Landroidx/lifecycle/LifecycleOwner;Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "whenStarted", "whenResumed", "Landroidx/lifecycle/Lifecycle$State;", "minState", "whenStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: PausingDispatcher.kt */
public final class PausingDispatcherKt {
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super T> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C13706o.m87928e(lifecycle, "lifecycle");
        return whenCreated(lifecycle, pVar, dVar);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super T> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C13706o.m87928e(lifecycle, "lifecycle");
        return whenResumed(lifecycle, pVar, dVar);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super T> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C13706o.m87928e(lifecycle, "lifecycle");
        return whenStarted(lifecycle, pVar, dVar);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super T> dVar) {
        return C15414h.m94298g(C15186a1.m93731c().mo74507o(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, (C13635d<? super PausingDispatcherKt$whenStateAtLeast$2>) null), dVar);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, pVar, dVar);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, pVar, dVar);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, pVar, dVar);
    }
}
