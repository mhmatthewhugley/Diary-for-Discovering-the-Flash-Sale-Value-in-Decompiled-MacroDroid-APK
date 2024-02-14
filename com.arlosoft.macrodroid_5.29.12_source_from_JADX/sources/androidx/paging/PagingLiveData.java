package androidx.paging;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.flow.C15285f;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007\u001a4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\n\u001a\u00020\t\"A\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002\"\b\b\u0000\u0010\u000b*\u00020\u0000\"\b\b\u0001\u0010\f*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo71668d2 = {"", "T", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "cachedIn", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlinx/coroutines/k0;", "scope", "Key", "Value", "Landroidx/paging/Pager;", "getLiveData", "(Landroidx/paging/Pager;)Landroidx/lifecycle/LiveData;", "liveData", "paging-runtime_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: PagingLiveData.kt */
public final class PagingLiveData {
    public static final <T> LiveData<PagingData<T>> cachedIn(LiveData<PagingData<T>> liveData, Lifecycle lifecycle) {
        C13706o.m87929f(liveData, "<this>");
        C13706o.m87929f(lifecycle, "lifecycle");
        return FlowLiveDataConversions.asLiveData$default((C15285f) CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData), LifecycleKt.getCoroutineScope(lifecycle)), (C13640g) null, 0, 3, (Object) null);
    }

    public static final <Key, Value> LiveData<PagingData<Value>> getLiveData(Pager<Key, Value> pager) {
        C13706o.m87929f(pager, "<this>");
        return FlowLiveDataConversions.asLiveData$default((C15285f) pager.getFlow(), (C13640g) null, 0, 3, (Object) null);
    }

    public static final <T> LiveData<PagingData<T>> cachedIn(LiveData<PagingData<T>> liveData, ViewModel viewModel) {
        C13706o.m87929f(liveData, "<this>");
        C13706o.m87929f(viewModel, "viewModel");
        return FlowLiveDataConversions.asLiveData$default((C15285f) CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData), ViewModelKt.getViewModelScope(viewModel)), (C13640g) null, 0, 3, (Object) null);
    }

    public static final <T> LiveData<PagingData<T>> cachedIn(LiveData<PagingData<T>> liveData, C15478k0 k0Var) {
        C13706o.m87929f(liveData, "<this>");
        C13706o.m87929f(k0Var, "scope");
        return FlowLiveDataConversions.asLiveData$default((C15285f) CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(liveData), k0Var), (C13640g) null, 0, 3, (Object) null);
    }
}
