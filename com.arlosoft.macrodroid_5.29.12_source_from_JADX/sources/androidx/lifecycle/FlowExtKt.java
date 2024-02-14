package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/f;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "flowWithLifecycle", "lifecycle-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: FlowExt.kt */
public final class FlowExtKt {
    public static final <T> C15285f<T> flowWithLifecycle(C15285f<? extends T> fVar, Lifecycle lifecycle, Lifecycle.State state) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(lifecycle, "lifecycle");
        C13706o.m87929f(state, "minActiveState");
        return C15290h.m94119e(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, fVar, (C13635d<? super FlowExtKt$flowWithLifecycle$1>) null));
    }

    public static /* synthetic */ C15285f flowWithLifecycle$default(C15285f fVar, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(fVar, lifecycle, state);
    }
}
