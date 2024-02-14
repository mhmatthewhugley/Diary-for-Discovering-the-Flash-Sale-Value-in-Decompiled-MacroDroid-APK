package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.C13592k0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15276b0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;
import kotlinx.coroutines.flow.C15401u;
import kotlinx.coroutines.flow.C15406z;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0004\u001a\u00020\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R(\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0018\u00010\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0018\u00010\t0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, mo71668d2 = {"Landroidx/paging/CachedPageEventFlow;", "", "T", "Lja/u;", "close", "Landroidx/paging/FlattenedPageController;", "pageController", "Landroidx/paging/FlattenedPageController;", "Lkotlinx/coroutines/flow/u;", "Lkotlin/collections/k0;", "Landroidx/paging/PageEvent;", "mutableSharedSrc", "Lkotlinx/coroutines/flow/u;", "Lkotlinx/coroutines/flow/z;", "sharedForDownstream", "Lkotlinx/coroutines/flow/z;", "Lkotlinx/coroutines/w1;", "job", "Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/flow/f;", "downstreamFlow", "Lkotlinx/coroutines/flow/f;", "getDownstreamFlow", "()Lkotlinx/coroutines/flow/f;", "src", "Lkotlinx/coroutines/k0;", "scope", "<init>", "(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/k0;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CachedPageEventFlow.kt */
public final class CachedPageEventFlow<T> {
    private final C15285f<PageEvent<T>> downstreamFlow;
    /* access modifiers changed from: private */
    public final C15561w1 job;
    /* access modifiers changed from: private */
    public final C15401u<C13592k0<PageEvent<T>>> mutableSharedSrc;
    /* access modifiers changed from: private */
    public final FlattenedPageController<T> pageController = new FlattenedPageController<>();
    /* access modifiers changed from: private */
    public final C15406z<C13592k0<PageEvent<T>>> sharedForDownstream;

    public CachedPageEventFlow(C15285f<? extends PageEvent<T>> fVar, C15478k0 k0Var) {
        C13706o.m87929f(fVar, "src");
        C13706o.m87929f(k0Var, "scope");
        C15401u<C13592k0<PageEvent<T>>> a = C15276b0.m94086a(1, Integer.MAX_VALUE, C15220e.SUSPEND);
        this.mutableSharedSrc = a;
        this.sharedForDownstream = C15290h.m94140z(a, new CachedPageEventFlow$sharedForDownstream$1(this, (C13635d<? super CachedPageEventFlow$sharedForDownstream$1>) null));
        C15561w1 d = C15473j.m94492d(k0Var, (C13640g) null, C15486m0.LAZY, new CachedPageEventFlow$job$1(fVar, this, (C13635d<? super CachedPageEventFlow$job$1>) null), 1, (Object) null);
        d.mo74617p(new CachedPageEventFlow$job$2$1(this));
        C13339u uVar = C13339u.f61331a;
        this.job = d;
        this.downstreamFlow = C15290h.m94132r(new CachedPageEventFlow$downstreamFlow$1(this, (C13635d<? super CachedPageEventFlow$downstreamFlow$1>) null));
    }

    public final void close() {
        C15561w1.C15562a.m94723a(this.job, (CancellationException) null, 1, (Object) null);
    }

    public final C15285f<PageEvent<T>> getDownstreamFlow() {
        return this.downstreamFlow;
    }
}
