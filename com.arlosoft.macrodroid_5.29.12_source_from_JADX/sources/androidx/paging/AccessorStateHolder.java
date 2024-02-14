package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15299i0;
import kotlinx.coroutines.flow.C15346k0;
import kotlinx.coroutines.flow.C15402v;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\b\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo71668d2 = {"Landroidx/paging/AccessorStateHolder;", "", "Key", "Value", "R", "Lkotlin/Function1;", "Landroidx/paging/AccessorState;", "block", "use", "(Lqa/l;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/flow/v;", "Landroidx/paging/LoadStates;", "_loadStates", "Lkotlinx/coroutines/flow/v;", "internalState", "Landroidx/paging/AccessorState;", "Lkotlinx/coroutines/flow/i0;", "getLoadStates", "()Lkotlinx/coroutines/flow/i0;", "loadStates", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediatorAccessor.kt */
final class AccessorStateHolder<Key, Value> {
    private final C15402v<LoadStates> _loadStates = C15346k0.m94215a(LoadStates.Companion.getIDLE());
    private final AccessorState<Key, Value> internalState = new AccessorState<>();
    private final ReentrantLock lock = new ReentrantLock();

    public final C15299i0<LoadStates> getLoadStates() {
        return this._loadStates;
    }

    public final <R> R use(C16265l<? super AccessorState<Key, Value>, ? extends R> lVar) {
        C13706o.m87929f(lVar, "block");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            R invoke = lVar.invoke(this.internalState);
            this._loadStates.setValue(this.internalState.computeLoadStates());
            return invoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
