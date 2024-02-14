package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\t\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo71668d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/k0;", "Lkotlin/coroutines/d;", "Lja/u;", "", "block", "repeatOnLifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: RepeatOnLifecycle.kt */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13635d<? super C13339u> dVar) {
        if (!(state != Lifecycle.State.INITIALIZED)) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        } else if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return C13339u.f61331a;
        } else {
            Object d = C15482l0.m94505d(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, (C13635d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3>) null), dVar);
            return d == C13652d.m87832c() ? d : C13339u.f61331a;
        }
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13635d<? super C13339u> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C13706o.m87928e(lifecycle, "lifecycle");
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycle, state, pVar, dVar);
        return repeatOnLifecycle == C13652d.m87832c() ? repeatOnLifecycle : C13339u.f61331a;
    }
}
