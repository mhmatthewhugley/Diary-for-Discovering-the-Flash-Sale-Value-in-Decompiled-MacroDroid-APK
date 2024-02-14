package androidx.paging;

import androidx.lifecycle.LiveData;
import androidx.paging.PagedList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004B[\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0014\u0012\u0018\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%0$\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b'\u0010(J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\f\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002J\b\u0010\r\u001a\u00020\bH\u0014R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006)"}, mo71668d2 = {"Landroidx/paging/LivePagedList;", "", "Key", "Value", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "", "force", "Lja/u;", "invalidate", "previous", "next", "onItemUpdate", "onActive", "Lkotlinx/coroutines/k0;", "coroutineScope", "Lkotlinx/coroutines/k0;", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagedList$Config;", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Landroidx/paging/PagedList$BoundaryCallback;", "Lkotlinx/coroutines/h0;", "notifyDispatcher", "Lkotlinx/coroutines/h0;", "fetchDispatcher", "currentData", "Landroidx/paging/PagedList;", "Lkotlinx/coroutines/w1;", "currentJob", "Lkotlinx/coroutines/w1;", "Ljava/lang/Runnable;", "refreshRetryCallback", "Ljava/lang/Runnable;", "initialKey", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "<init>", "(Lkotlinx/coroutines/k0;Ljava/lang/Object;Landroidx/paging/PagedList$Config;Landroidx/paging/PagedList$BoundaryCallback;Lqa/a;Lkotlinx/coroutines/h0;Lkotlinx/coroutines/h0;)V", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: LivePagedList.kt */
public final class LivePagedList<Key, Value> extends LiveData<PagedList<Value>> {
    /* access modifiers changed from: private */
    public final PagedList.BoundaryCallback<Value> boundaryCallback;
    /* access modifiers changed from: private */
    public final C16254a<C13339u> callback = new LivePagedList$callback$1(this);
    /* access modifiers changed from: private */
    public final PagedList.Config config;
    /* access modifiers changed from: private */
    public final C15478k0 coroutineScope;
    /* access modifiers changed from: private */
    public PagedList<Value> currentData;
    private C15561w1 currentJob;
    /* access modifiers changed from: private */
    public final C15415h0 fetchDispatcher;
    /* access modifiers changed from: private */
    public final C15415h0 notifyDispatcher;
    /* access modifiers changed from: private */
    public final C16254a<PagingSource<Key, Value>> pagingSourceFactory;
    private final Runnable refreshRetryCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LivePagedList(C15478k0 k0Var, Key key, PagedList.Config config2, PagedList.BoundaryCallback<Value> boundaryCallback2, C16254a<? extends PagingSource<Key, Value>> aVar, C15415h0 h0Var, C15415h0 h0Var2) {
        super(new InitialPagedList(k0Var, h0Var, h0Var2, config2, key));
        C13706o.m87929f(k0Var, "coroutineScope");
        C13706o.m87929f(config2, "config");
        C13706o.m87929f(aVar, "pagingSourceFactory");
        C13706o.m87929f(h0Var, "notifyDispatcher");
        C13706o.m87929f(h0Var2, "fetchDispatcher");
        this.coroutineScope = k0Var;
        this.config = config2;
        this.boundaryCallback = boundaryCallback2;
        this.pagingSourceFactory = aVar;
        this.notifyDispatcher = h0Var;
        this.fetchDispatcher = h0Var2;
        LivePagedList$refreshRetryCallback$1 livePagedList$refreshRetryCallback$1 = new LivePagedList$refreshRetryCallback$1(this);
        this.refreshRetryCallback = livePagedList$refreshRetryCallback$1;
        Object value = getValue();
        C13706o.m87926c(value);
        C13706o.m87928e(value, "value!!");
        PagedList<Value> pagedList = (PagedList) value;
        this.currentData = pagedList;
        pagedList.setRetryCallback(livePagedList$refreshRetryCallback$1);
    }

    /* access modifiers changed from: private */
    public final void invalidate(boolean z) {
        C15561w1 w1Var = this.currentJob;
        if (w1Var == null || z) {
            if (w1Var != null) {
                C15561w1.C15562a.m94723a(w1Var, (CancellationException) null, 1, (Object) null);
            }
            this.currentJob = C15473j.m94492d(this.coroutineScope, this.fetchDispatcher, (C15486m0) null, new LivePagedList$invalidate$1(this, (C13635d<? super LivePagedList$invalidate$1>) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void onItemUpdate(PagedList<Value> pagedList, PagedList<Value> pagedList2) {
        pagedList.setRetryCallback((Runnable) null);
        pagedList2.setRetryCallback(this.refreshRetryCallback);
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        super.onActive();
        invalidate(false);
    }
}
