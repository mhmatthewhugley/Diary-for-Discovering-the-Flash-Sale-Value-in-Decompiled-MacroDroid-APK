package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15415h0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo71668d2 = {"Landroidx/lifecycle/PausingDispatcher;", "Lkotlinx/coroutines/h0;", "Lkotlin/coroutines/g;", "context", "", "isDispatchNeeded", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lja/u;", "dispatch", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "<init>", "()V", "lifecycle-runtime-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PausingDispatcher.kt */
public final class PausingDispatcher extends C15415h0 {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    public void dispatch(C13640g gVar, Runnable runnable) {
        C13706o.m87929f(gVar, "context");
        C13706o.m87929f(runnable, "block");
        this.dispatchQueue.dispatchAndEnqueue(gVar, runnable);
    }

    public boolean isDispatchNeeded(C13640g gVar) {
        C13706o.m87929f(gVar, "context");
        if (C15186a1.m93731c().mo74507o().isDispatchNeeded(gVar)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
