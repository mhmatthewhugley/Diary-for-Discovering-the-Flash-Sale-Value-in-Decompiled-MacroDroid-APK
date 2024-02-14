package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15497o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b'\u0018\u0000 )*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0005)*+,-B\u0007¢\u0006\u0004\b(\u0010'J!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\nH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H'J\u001e\u0010\b\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H'J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001a*\u00020\u00012\u001e\u0010\u001d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u001bJ6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001a*\u00020\u00012\u001e\u0010\u001d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u001fJ*\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001a*\u00020\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001bJ*\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001a*\u00020\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fR \u0010\"\u001a\u00020!8\u0010XD¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006."}, mo71668d2 = {"Landroidx/paging/PositionalDataSource;", "", "T", "Landroidx/paging/DataSource;", "", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "params", "Landroidx/paging/DataSource$BaseResult;", "loadRange", "(Landroidx/paging/PositionalDataSource$LoadRangeParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/DataSource$Params;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/d;)Ljava/lang/Object;", "load", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "loadInitial$paging_common", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "loadInitial", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "callback", "Lja/u;", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Integer;", "getKeyInternal", "V", "Landroidx/arch/core/util/Function;", "", "function", "mapByPage", "Lkotlin/Function1;", "map", "", "isContiguous", "Z", "isContiguous$paging_common", "()Z", "isContiguous$paging_common$annotations", "()V", "<init>", "Companion", "LoadInitialCallback", "LoadInitialParams", "LoadRangeCallback", "LoadRangeParams", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PositionalDataSource.kt */
public abstract class PositionalDataSource<T> extends DataSource<Integer, T> {
    public static final Companion Companion = new Companion((C13695i) null);
    private final boolean isContiguous;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\n"}, mo71668d2 = {"Landroidx/paging/PositionalDataSource$Companion;", "", "()V", "computeInitialLoadPosition", "", "params", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "totalCount", "computeInitialLoadSize", "initialLoadPosition", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PositionalDataSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final int computeInitialLoadPosition(LoadInitialParams loadInitialParams, int i) {
            C13706o.m87929f(loadInitialParams, "params");
            int i2 = loadInitialParams.requestedStartPosition;
            int i3 = loadInitialParams.requestedLoadSize;
            int i4 = loadInitialParams.pageSize;
            return Math.max(0, Math.min(((((i - i3) + i4) - 1) / i4) * i4, (i2 / i4) * i4));
        }

        public final int computeInitialLoadSize(LoadInitialParams loadInitialParams, int i, int i2) {
            C13706o.m87929f(loadInitialParams, "params");
            return Math.min(i2 - i, loadInitialParams.requestedLoadSize);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\f"}, mo71668d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "T", "", "", "data", "", "position", "totalCount", "Lja/u;", "onResult", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PositionalDataSource.kt */
    public static abstract class LoadInitialCallback<T> {
        public abstract void onResult(List<? extends T> list, int i);

        public abstract void onResult(List<? extends T> list, int i, int i2);
    }

    @Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo71668d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialParams;", "", "requestedStartPosition", "", "requestedLoadSize", "pageSize", "placeholdersEnabled", "", "(IIIZ)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PositionalDataSource.kt */
    public static class LoadInitialParams {
        public final int pageSize;
        public final boolean placeholdersEnabled;
        public final int requestedLoadSize;
        public final int requestedStartPosition;

        public LoadInitialParams(int i, int i2, int i3, boolean z) {
            this.requestedStartPosition = i;
            this.requestedLoadSize = i2;
            this.pageSize = i3;
            this.placeholdersEnabled = z;
            boolean z2 = true;
            if (i >= 0) {
                if (i2 >= 0) {
                    if (!(i3 < 0 ? false : z2)) {
                        throw new IllegalStateException(C13706o.m87936m("invalid page size: ", Integer.valueOf(i3)).toString());
                    }
                    return;
                }
                throw new IllegalStateException(C13706o.m87936m("invalid load size: ", Integer.valueOf(i2)).toString());
            }
            throw new IllegalStateException(C13706o.m87936m("invalid start position: ", Integer.valueOf(i)).toString());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H&¨\u0006\t"}, mo71668d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "T", "", "", "data", "Lja/u;", "onResult", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PositionalDataSource.kt */
    public static abstract class LoadRangeCallback<T> {
        public abstract void onResult(List<? extends T> list);
    }

    @Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo71668d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeParams;", "", "startPosition", "", "loadSize", "(II)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PositionalDataSource.kt */
    public static class LoadRangeParams {
        public final int loadSize;
        public final int startPosition;

        public LoadRangeParams(int i, int i2) {
            this.startPosition = i;
            this.loadSize = i2;
        }
    }

    public PositionalDataSource() {
        super(DataSource.KeyType.POSITIONAL);
    }

    public static final int computeInitialLoadPosition(LoadInitialParams loadInitialParams, int i) {
        return Companion.computeInitialLoadPosition(loadInitialParams, i);
    }

    public static final int computeInitialLoadSize(LoadInitialParams loadInitialParams, int i, int i2) {
        return Companion.computeInitialLoadSize(loadInitialParams, i, i2);
    }

    public static /* synthetic */ void isContiguous$paging_common$annotations() {
    }

    /* access modifiers changed from: private */
    public final Object loadRange(LoadRangeParams loadRangeParams, C13635d<? super DataSource.BaseResult<T>> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        loadRange(loadRangeParams, new PositionalDataSource$loadRange$2$1(loadRangeParams, this, oVar));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    public boolean isContiguous$paging_common() {
        return this.isContiguous;
    }

    public final Object load$paging_common(DataSource.Params<Integer> params, C13635d<? super DataSource.BaseResult<T>> dVar) {
        if (params.getType$paging_common() == LoadType.REFRESH) {
            int initialLoadSize = params.getInitialLoadSize();
            int i = 0;
            if (params.getKey() != null) {
                int intValue = params.getKey().intValue();
                if (params.getPlaceholdersEnabled()) {
                    initialLoadSize = Math.max(initialLoadSize / params.getPageSize(), 2) * params.getPageSize();
                    i = Math.max(0, ((intValue - (initialLoadSize / 2)) / params.getPageSize()) * params.getPageSize());
                } else {
                    i = Math.max(0, intValue - (initialLoadSize / 2));
                }
            }
            return loadInitial$paging_common(new LoadInitialParams(i, initialLoadSize, params.getPageSize(), params.getPlaceholdersEnabled()), dVar);
        }
        Integer key = params.getKey();
        C13706o.m87926c(key);
        int intValue2 = key.intValue();
        int pageSize = params.getPageSize();
        if (params.getType$paging_common() == LoadType.PREPEND) {
            pageSize = Math.min(pageSize, intValue2);
            intValue2 -= pageSize;
        }
        return loadRange(new LoadRangeParams(intValue2, pageSize), dVar);
    }

    @WorkerThread
    public abstract void loadInitial(LoadInitialParams loadInitialParams, LoadInitialCallback<T> loadInitialCallback);

    @VisibleForTesting
    public final Object loadInitial$paging_common(LoadInitialParams loadInitialParams, C13635d<? super DataSource.BaseResult<T>> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        loadInitial(loadInitialParams, new PositionalDataSource$loadInitial$2$1(this, oVar, loadInitialParams));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    @WorkerThread
    public abstract void loadRange(LoadRangeParams loadRangeParams, LoadRangeCallback<T> loadRangeCallback);

    public final Integer getKeyInternal$paging_common(T t) {
        C13706o.m87929f(t, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    public final <V> PositionalDataSource<V> map(Function<T, V> function) {
        C13706o.m87929f(function, "function");
        return mapByPage((Function) new PositionalDataSource$map$1(function));
    }

    public final <V> PositionalDataSource<V> mapByPage(Function<List<T>, List<V>> function) {
        C13706o.m87929f(function, "function");
        return new WrapperPositionalDataSource(this, function);
    }

    public final <V> PositionalDataSource<V> map(C16265l<? super T, ? extends V> lVar) {
        C13706o.m87929f(lVar, "function");
        return mapByPage((Function) new PositionalDataSource$map$2(lVar));
    }

    public final <V> PositionalDataSource<V> mapByPage(C16265l<? super List<? extends T>, ? extends List<? extends V>> lVar) {
        C13706o.m87929f(lVar, "function");
        return mapByPage((Function) new PositionalDataSource$mapByPage$1(lVar));
    }
}
