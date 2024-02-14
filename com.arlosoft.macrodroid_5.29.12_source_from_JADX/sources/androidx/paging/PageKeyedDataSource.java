package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15497o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004-./0B\u0007¢\u0006\u0004\b,\u0010+J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ0\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\b\u001a\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H&J*\u0010\u000b\u001a\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&J*\u0010\r\u001a\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&J\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u001f*\u00020\u00012\u001e\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!0 J<\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u001f*\u00020\u00012\u001e\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!0$J0\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u001f*\u00020\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020 J0\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u001f*\u00020\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$R \u0010&\u001a\u00020\u00108\u0010XD¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)\u0002\u0004\n\u0002\b\u0019¨\u00061"}, mo71668d2 = {"Landroidx/paging/PageKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "params", "Landroidx/paging/DataSource$BaseResult;", "loadInitial", "(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "loadBefore", "(Landroidx/paging/PageKeyedDataSource$LoadParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "loadAfter", "Lkotlinx/coroutines/n;", "continuation", "", "isAppend", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "continuationAsCallback", "Landroidx/paging/DataSource$Params;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/d;)Ljava/lang/Object;", "load", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "callback", "Lja/u;", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Object;", "getKeyInternal", "ToValue", "Landroidx/arch/core/util/Function;", "", "function", "mapByPage", "Lkotlin/Function1;", "map", "supportsPageDropping", "Z", "getSupportsPageDropping$paging_common", "()Z", "getSupportsPageDropping$paging_common$annotations", "()V", "<init>", "LoadCallback", "LoadInitialCallback", "LoadInitialParams", "LoadParams", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PageKeyedDataSource.kt */
public abstract class PageKeyedDataSource<Key, Value> extends DataSource<Key, Value> {
    private final boolean supportsPageDropping;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\b\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, mo71668d2 = {"Landroidx/paging/PageKeyedDataSource$LoadCallback;", "Key", "Value", "", "", "data", "adjacentPageKey", "Lja/u;", "onResult", "(Ljava/util/List;Ljava/lang/Object;)V", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PageKeyedDataSource.kt */
    public static abstract class LoadCallback<Key, Value> {
        public abstract void onResult(List<? extends Value> list, Key key);
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00018\u00022\b\u0010\n\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\f\u0010\rJ1\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\b\u0010\t\u001a\u0004\u0018\u00018\u00022\b\u0010\n\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u0011"}, mo71668d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "Key", "Value", "", "", "data", "", "position", "totalCount", "previousPageKey", "nextPageKey", "Lja/u;", "onResult", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PageKeyedDataSource.kt */
    public static abstract class LoadInitialCallback<Key, Value> {
        public abstract void onResult(List<? extends Value> list, int i, int i2, Key key, Key key2);

        public abstract void onResult(List<? extends Value> list, Key key, Key key2);
    }

    @Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo71668d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Key", "", "requestedLoadSize", "", "placeholdersEnabled", "", "(IZ)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PageKeyedDataSource.kt */
    public static class LoadInitialParams<Key> {
        public final boolean placeholdersEnabled;
        public final int requestedLoadSize;

        public LoadInitialParams(int i, boolean z) {
            this.requestedLoadSize = i;
            this.placeholdersEnabled = z;
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0003\u001a\u00028\u00028\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo71668d2 = {"Landroidx/paging/PageKeyedDataSource$LoadParams;", "Key", "", "key", "requestedLoadSize", "", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PageKeyedDataSource.kt */
    public static class LoadParams<Key> {
        public final Key key;
        public final int requestedLoadSize;

        public LoadParams(Key key2, int i) {
            C13706o.m87929f(key2, "key");
            this.key = key2;
            this.requestedLoadSize = i;
        }
    }

    public PageKeyedDataSource() {
        super(DataSource.KeyType.PAGE_KEYED);
    }

    /* access modifiers changed from: private */
    public final LoadCallback<Key, Value> continuationAsCallback(C15492n<? super DataSource.BaseResult<Value>> nVar, boolean z) {
        return new PageKeyedDataSource$continuationAsCallback$1(nVar, z);
    }

    public static /* synthetic */ void getSupportsPageDropping$paging_common$annotations() {
    }

    /* access modifiers changed from: private */
    public final Object loadAfter(LoadParams<Key> loadParams, C13635d<? super DataSource.BaseResult<Value>> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        loadAfter(loadParams, continuationAsCallback(oVar, true));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    /* access modifiers changed from: private */
    public final Object loadBefore(LoadParams<Key> loadParams, C13635d<? super DataSource.BaseResult<Value>> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        loadBefore(loadParams, continuationAsCallback(oVar, false));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    /* access modifiers changed from: private */
    public final Object loadInitial(LoadInitialParams<Key> loadInitialParams, C13635d<? super DataSource.BaseResult<Value>> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        loadInitial(loadInitialParams, new PageKeyedDataSource$loadInitial$2$1(oVar));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    public Key getKeyInternal$paging_common(Value value) {
        C13706o.m87929f(value, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    public boolean getSupportsPageDropping$paging_common() {
        return this.supportsPageDropping;
    }

    public final Object load$paging_common(DataSource.Params<Key> params, C13635d<? super DataSource.BaseResult<Value>> dVar) {
        if (params.getType$paging_common() == LoadType.REFRESH) {
            return loadInitial(new LoadInitialParams(params.getInitialLoadSize(), params.getPlaceholdersEnabled()), dVar);
        }
        if (params.getKey() == null) {
            return DataSource.BaseResult.Companion.empty$paging_common();
        }
        if (params.getType$paging_common() == LoadType.PREPEND) {
            return loadBefore(new LoadParams(params.getKey(), params.getPageSize()), dVar);
        }
        if (params.getType$paging_common() == LoadType.APPEND) {
            return loadAfter(new LoadParams(params.getKey(), params.getPageSize()), dVar);
        }
        throw new IllegalArgumentException(C13706o.m87936m("Unsupported type ", params.getType$paging_common()));
    }

    public abstract void loadAfter(LoadParams<Key> loadParams, LoadCallback<Key, Value> loadCallback);

    public abstract void loadBefore(LoadParams<Key> loadParams, LoadCallback<Key, Value> loadCallback);

    public abstract void loadInitial(LoadInitialParams<Key> loadInitialParams, LoadInitialCallback<Key, Value> loadInitialCallback);

    public final <ToValue> PageKeyedDataSource<Key, ToValue> map(Function<Value, ToValue> function) {
        C13706o.m87929f(function, "function");
        return mapByPage((Function) new PageKeyedDataSource$map$1(function));
    }

    public final <ToValue> PageKeyedDataSource<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
        C13706o.m87929f(function, "function");
        return new WrapperPageKeyedDataSource(this, function);
    }

    public final <ToValue> PageKeyedDataSource<Key, ToValue> map(C16265l<? super Value, ? extends ToValue> lVar) {
        C13706o.m87929f(lVar, "function");
        return mapByPage((Function) new PageKeyedDataSource$map$2(lVar));
    }

    public final <ToValue> PageKeyedDataSource<Key, ToValue> mapByPage(C16265l<? super List<? extends Value>, ? extends List<? extends ToValue>> lVar) {
        C13706o.m87929f(lVar, "function");
        return mapByPage((Function) new PageKeyedDataSource$mapByPage$1(lVar));
    }
}
