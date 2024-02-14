package androidx.paging;

import androidx.paging.ViewportHint;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15276b0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15401u;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005R\u0018\u0010\f\u001a\u00060\u000bR\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, mo71668d2 = {"Landroidx/paging/HintHandler;", "", "Landroidx/paging/LoadType;", "loadType", "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/ViewportHint;", "hintFor", "viewportHint", "Lja/u;", "forceSetHint", "processHint", "Landroidx/paging/HintHandler$State;", "state", "Landroidx/paging/HintHandler$State;", "Landroidx/paging/ViewportHint$Access;", "getLastAccessHint", "()Landroidx/paging/ViewportHint$Access;", "lastAccessHint", "<init>", "()V", "HintFlow", "State", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: HintHandler.kt */
public final class HintHandler {
    private final State state = new State(this);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo71668d2 = {"Landroidx/paging/HintHandler$HintFlow;", "", "Landroidx/paging/ViewportHint;", "value", "Landroidx/paging/ViewportHint;", "getValue", "()Landroidx/paging/ViewportHint;", "setValue", "(Landroidx/paging/ViewportHint;)V", "Lkotlinx/coroutines/flow/u;", "_flow", "Lkotlinx/coroutines/flow/u;", "Lkotlinx/coroutines/flow/f;", "getFlow", "()Lkotlinx/coroutines/flow/f;", "flow", "<init>", "(Landroidx/paging/HintHandler;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: HintHandler.kt */
    private final class HintFlow {
        private final C15401u<ViewportHint> _flow = C15276b0.m94087b(1, 0, C15220e.DROP_OLDEST, 2, (Object) null);
        final /* synthetic */ HintHandler this$0;
        private ViewportHint value;

        public HintFlow(HintHandler hintHandler) {
            C13706o.m87929f(hintHandler, "this$0");
            this.this$0 = hintHandler;
        }

        public final C15285f<ViewportHint> getFlow() {
            return this._flow;
        }

        public final ViewportHint getValue() {
            return this.value;
        }

        public final void setValue(ViewportHint viewportHint) {
            this.value = viewportHint;
            if (viewportHint != null) {
                this._flow.mo74652b(viewportHint);
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022 \u0010\b\u001a\u001c\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004R\u0018\u0010\n\u001a\u00060\u0005R\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00060\u0005R\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR(\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, mo71668d2 = {"Landroidx/paging/HintHandler$State;", "", "Landroidx/paging/ViewportHint$Access;", "accessHint", "Lkotlin/Function2;", "Landroidx/paging/HintHandler$HintFlow;", "Landroidx/paging/HintHandler;", "Lja/u;", "block", "modify", "prepend", "Landroidx/paging/HintHandler$HintFlow;", "append", "<set-?>", "lastAccessHint", "Landroidx/paging/ViewportHint$Access;", "getLastAccessHint", "()Landroidx/paging/ViewportHint$Access;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/ViewportHint;", "getPrependFlow", "()Lkotlinx/coroutines/flow/f;", "prependFlow", "getAppendFlow", "appendFlow", "<init>", "(Landroidx/paging/HintHandler;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: HintHandler.kt */
    private final class State {
        private final HintFlow append;
        private ViewportHint.Access lastAccessHint;
        private final ReentrantLock lock = new ReentrantLock();
        private final HintFlow prepend;
        final /* synthetic */ HintHandler this$0;

        public State(HintHandler hintHandler) {
            C13706o.m87929f(hintHandler, "this$0");
            this.this$0 = hintHandler;
            this.prepend = new HintFlow(hintHandler);
            this.append = new HintFlow(hintHandler);
        }

        public final C15285f<ViewportHint> getAppendFlow() {
            return this.append.getFlow();
        }

        public final ViewportHint.Access getLastAccessHint() {
            return this.lastAccessHint;
        }

        public final C15285f<ViewportHint> getPrependFlow() {
            return this.prepend.getFlow();
        }

        public final void modify(ViewportHint.Access access, C16269p<? super HintFlow, ? super HintFlow, C13339u> pVar) {
            C13706o.m87929f(pVar, "block");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            if (access != null) {
                try {
                    this.lastAccessHint = access;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            pVar.invoke(this.prepend, this.append);
            C13339u uVar = C13339u.f61331a;
            reentrantLock.unlock();
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: HintHandler.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.PREPEND.ordinal()] = 1;
            iArr[LoadType.APPEND.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void forceSetHint(LoadType loadType, ViewportHint viewportHint) {
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(viewportHint, "viewportHint");
        if (loadType == LoadType.PREPEND || loadType == LoadType.APPEND) {
            this.state.modify((ViewportHint.Access) null, new HintHandler$forceSetHint$2(loadType, viewportHint));
            return;
        }
        throw new IllegalArgumentException(C13706o.m87936m("invalid load type for reset: ", loadType).toString());
    }

    public final ViewportHint.Access getLastAccessHint() {
        return this.state.getLastAccessHint();
    }

    public final C15285f<ViewportHint> hintFor(LoadType loadType) {
        C13706o.m87929f(loadType, "loadType");
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.state.getPrependFlow();
        }
        if (i == 2) {
            return this.state.getAppendFlow();
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final void processHint(ViewportHint viewportHint) {
        C13706o.m87929f(viewportHint, "viewportHint");
        this.state.modify(viewportHint instanceof ViewportHint.Access ? (ViewportHint.Access) viewportHint : null, new HintHandler$processHint$1(viewportHint));
    }
}
