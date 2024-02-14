package androidx.lifecycle;

import androidx.annotation.MainThread;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B`\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012(\u0010\u0016\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo71668d2 = {"Landroidx/lifecycle/BlockRunner;", "T", "", "Lja/u;", "maybeRun", "cancel", "Landroidx/lifecycle/CoroutineLiveData;", "liveData", "Landroidx/lifecycle/CoroutineLiveData;", "", "timeoutInMs", "J", "Lkotlinx/coroutines/k0;", "scope", "Lkotlinx/coroutines/k0;", "Lkotlinx/coroutines/w1;", "runningJob", "Lkotlinx/coroutines/w1;", "cancellationJob", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/d;", "block", "Lkotlin/Function0;", "onDone", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lqa/p;JLkotlinx/coroutines/k0;Lqa/a;)V", "lifecycle-livedata-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CoroutineLiveData.kt */
public final class BlockRunner<T> {
    /* access modifiers changed from: private */
    public final C16269p<LiveDataScope<T>, C13635d<? super C13339u>, Object> block;
    private C15561w1 cancellationJob;
    /* access modifiers changed from: private */
    public final CoroutineLiveData<T> liveData;
    /* access modifiers changed from: private */
    public final C16254a<C13339u> onDone;
    /* access modifiers changed from: private */
    public C15561w1 runningJob;
    private final C15478k0 scope;
    /* access modifiers changed from: private */
    public final long timeoutInMs;

    public BlockRunner(CoroutineLiveData<T> coroutineLiveData, C16269p<? super LiveDataScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar, long j, C15478k0 k0Var, C16254a<C13339u> aVar) {
        C13706o.m87929f(coroutineLiveData, "liveData");
        C13706o.m87929f(pVar, "block");
        C13706o.m87929f(k0Var, "scope");
        C13706o.m87929f(aVar, "onDone");
        this.liveData = coroutineLiveData;
        this.block = pVar;
        this.timeoutInMs = j;
        this.scope = k0Var;
        this.onDone = aVar;
    }

    @MainThread
    public final void cancel() {
        if (this.cancellationJob == null) {
            this.cancellationJob = C15473j.m94492d(this.scope, C15186a1.m93731c().mo74507o(), (C15486m0) null, new BlockRunner$cancel$1(this, (C13635d<? super BlockRunner$cancel$1>) null), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    @MainThread
    public final void maybeRun() {
        C15561w1 w1Var = this.cancellationJob;
        if (w1Var != null) {
            C15561w1.C15562a.m94723a(w1Var, (CancellationException) null, 1, (Object) null);
        }
        this.cancellationJob = null;
        if (this.runningJob == null) {
            this.runningJob = C15473j.m94492d(this.scope, (C13640g) null, (C15486m0) null, new BlockRunner$maybeRun$1(this, (C13635d<? super BlockRunner$maybeRun$1>) null), 3, (Object) null);
        }
    }
}
