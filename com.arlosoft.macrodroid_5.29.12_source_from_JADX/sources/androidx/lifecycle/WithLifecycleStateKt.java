package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13705n;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15497o;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HHø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HHø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HHø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a-\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HHø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a5\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HHø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\r\u001a-\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HHø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a-\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HHø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000e\u001a-\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HHø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000e\u001a5\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HHø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007\u001aC\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo71668d2 = {"R", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function0;", "block", "withStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Lqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "withStarted", "withResumed", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Lqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "", "dispatchNeeded", "Lkotlinx/coroutines/h0;", "lifecycleDispatcher", "suspendWithStateAtLeastUnchecked", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/h0;Lqa/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: WithLifecycleState.kt */
public final class WithLifecycleStateKt {
    public static final <R> Object suspendWithStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, boolean z, C15415h0 h0Var, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        C0735xfdb59cc4 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new C0735xfdb59cc4(state, lifecycle, oVar, aVar);
        if (z) {
            h0Var.dispatch(C13646h.f61899a, new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1(lifecycle, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
        } else {
            lifecycle.addObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
        }
        oVar.mo74843d(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(h0Var, lifecycle, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C15423h2 o = C15186a1.m93731c().mo74507o();
        boolean isDispatchNeeded = o.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, o, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C15186a1.m93731c().mo74507o();
        C13705n.m87923c(3);
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C15423h2 o = C15186a1.m93731c().mo74507o();
        boolean isDispatchNeeded = o.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, o, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C15186a1.m93731c().mo74507o();
        C13705n.m87923c(3);
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C15423h2 o = C15186a1.m93731c().mo74507o();
        boolean isDispatchNeeded = o.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, o, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C15186a1.m93731c().mo74507o();
        C13705n.m87923c(3);
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C15423h2 o = C15186a1.m93731c().mo74507o();
            boolean isDispatchNeeded = o.isDispatchNeeded(dVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, o, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
        }
        throw new IllegalArgumentException(C13706o.m87936m("target state must be CREATED or greater, found ", state).toString());
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(C13706o.m87936m("target state must be CREATED or greater, found ", state).toString());
        }
        C15186a1.m93731c().mo74507o();
        C13705n.m87923c(3);
        throw null;
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        C15423h2 o = C15186a1.m93731c().mo74507o();
        boolean isDispatchNeeded = o.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, o, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        C15186a1.m93731c().mo74507o();
        C13705n.m87923c(3);
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        C13706o.m87928e(lifecycleOwner.getLifecycle(), "lifecycle");
        Lifecycle.State state = Lifecycle.State.CREATED;
        C15186a1.m93731c().mo74507o();
        C13705n.m87923c(3);
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        C13706o.m87928e(lifecycleOwner.getLifecycle(), "lifecycle");
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C15186a1.m93731c().mo74507o();
        C13705n.m87923c(3);
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        C13706o.m87928e(lifecycleOwner.getLifecycle(), "lifecycle");
        Lifecycle.State state = Lifecycle.State.STARTED;
        C15186a1.m93731c().mo74507o();
        C13705n.m87923c(3);
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        C13706o.m87928e(lifecycleOwner.getLifecycle(), "lifecycle");
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(C13706o.m87936m("target state must be CREATED or greater, found ", state).toString());
        }
        C15186a1.m93731c().mo74507o();
        C13705n.m87923c(3);
        throw null;
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C13706o.m87928e(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.CREATED;
        C15423h2 o = C15186a1.m93731c().mo74507o();
        boolean isDispatchNeeded = o.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, o, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C13706o.m87928e(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C15423h2 o = C15186a1.m93731c().mo74507o();
        boolean isDispatchNeeded = o.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, o, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C13706o.m87928e(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.STARTED;
        C15423h2 o = C15186a1.m93731c().mo74507o();
        boolean isDispatchNeeded = o.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, o, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, C16254a<? extends R> aVar, C13635d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C13706o.m87928e(lifecycle, "lifecycle");
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C15423h2 o = C15186a1.m93731c().mo74507o();
            boolean isDispatchNeeded = o.isDispatchNeeded(dVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, o, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
        }
        throw new IllegalArgumentException(C13706o.m87936m("target state must be CREATED or greater, found ", state).toString());
    }
}
