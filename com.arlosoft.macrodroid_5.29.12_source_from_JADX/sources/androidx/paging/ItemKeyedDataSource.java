package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15497o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00040123B\u0007¢\u0006\u0004\b.\u0010/J+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ$\u0010\u0018\u001a\u00020!2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001fH&J$\u0010\u001e\u001a\u00020!2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\"H&J$\u0010\u001c\u001a\u00020!2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\"H&J\u0017\u0010$\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H&¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H\u0010¢\u0006\u0004\b&\u0010%J<\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u001e\u0010*\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f0)J<\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u001e\u0010*\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f0,J0\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020)J0\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020,\u0002\u0004\n\u0002\b\u0019¨\u00064"}, mo71668d2 = {"Landroidx/paging/ItemKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "Lkotlinx/coroutines/n;", "Landroidx/paging/DataSource$BaseResult;", "androidx/paging/ItemKeyedDataSource$asCallback$1", "asCallback", "(Lkotlinx/coroutines/n;)Landroidx/paging/ItemKeyedDataSource$asCallback$1;", "Landroidx/paging/DataSource$Params;", "params", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/d;)Ljava/lang/Object;", "load", "", "getPrevKey$paging_common", "(Ljava/util/List;)Ljava/lang/Object;", "getPrevKey", "getNextKey$paging_common", "getNextKey", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "loadInitial$paging_common", "(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "loadInitial", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "loadBefore$paging_common", "(Landroidx/paging/ItemKeyedDataSource$LoadParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "loadBefore", "loadAfter$paging_common", "loadAfter", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "callback", "Lja/u;", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "item", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "getKeyInternal$paging_common", "getKeyInternal", "ToValue", "Landroidx/arch/core/util/Function;", "function", "mapByPage", "Lkotlin/Function1;", "map", "<init>", "()V", "LoadCallback", "LoadInitialCallback", "LoadInitialParams", "LoadParams", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: ItemKeyedDataSource.kt */
public abstract class ItemKeyedDataSource<Key, Value> extends DataSource<Key, Value> {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H&¨\u0006\t"}, mo71668d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "Value", "", "", "data", "Lja/u;", "onResult", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: ItemKeyedDataSource.kt */
    public static abstract class LoadCallback<Value> {
        public abstract void onResult(List<? extends Value> list);
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\f"}, mo71668d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "Value", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "", "data", "", "position", "totalCount", "Lja/u;", "onResult", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: ItemKeyedDataSource.kt */
    public static abstract class LoadInitialCallback<Value> extends LoadCallback<Value> {
        public abstract void onResult(List<? extends Value> list, int i, int i2);
    }

    @Metadata(mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u00028\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo71668d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Key", "", "requestedInitialKey", "requestedLoadSize", "", "placeholdersEnabled", "", "(Ljava/lang/Object;IZ)V", "Ljava/lang/Object;", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: ItemKeyedDataSource.kt */
    public static class LoadInitialParams<Key> {
        public final boolean placeholdersEnabled;
        public final Key requestedInitialKey;
        public final int requestedLoadSize;

        public LoadInitialParams(Key key, int i, boolean z) {
            this.requestedInitialKey = key;
            this.requestedLoadSize = i;
            this.placeholdersEnabled = z;
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0003\u001a\u00028\u00028\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo71668d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadParams;", "Key", "", "key", "requestedLoadSize", "", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: ItemKeyedDataSource.kt */
    public static class LoadParams<Key> {
        public final Key key;
        public final int requestedLoadSize;

        public LoadParams(Key key2, int i) {
            C13706o.m87929f(key2, "key");
            this.key = key2;
            this.requestedLoadSize = i;
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: ItemKeyedDataSource.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.REFRESH.ordinal()] = 1;
            iArr[LoadType.PREPEND.ordinal()] = 2;
            iArr[LoadType.APPEND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ItemKeyedDataSource() {
        super(DataSource.KeyType.ITEM_KEYED);
    }

    /* access modifiers changed from: private */
    public final ItemKeyedDataSource$asCallback$1 asCallback(C15492n<? super DataSource.BaseResult<Value>> nVar) {
        return new ItemKeyedDataSource$asCallback$1(nVar, this);
    }

    public abstract Key getKey(Value value);

    public Key getKeyInternal$paging_common(Value value) {
        C13706o.m87929f(value, "item");
        return getKey(value);
    }

    public final Key getNextKey$paging_common(List<? extends Value> list) {
        C13706o.m87929f(list, "<this>");
        Object k0 = C13566b0.m87436k0(list);
        if (k0 == null) {
            return null;
        }
        return getKey(k0);
    }

    public final Key getPrevKey$paging_common(List<? extends Value> list) {
        C13706o.m87929f(list, "<this>");
        Object Y = C13566b0.m87424Y(list);
        if (Y == null) {
            return null;
        }
        return getKey(Y);
    }

    public final Object load$paging_common(DataSource.Params<Key> params, C13635d<? super DataSource.BaseResult<Value>> dVar) {
        int i = WhenMappings.$EnumSwitchMapping$0[params.getType$paging_common().ordinal()];
        if (i == 1) {
            return loadInitial$paging_common(new LoadInitialParams(params.getKey(), params.getInitialLoadSize(), params.getPlaceholdersEnabled()), dVar);
        }
        if (i == 2) {
            Key key = params.getKey();
            C13706o.m87926c(key);
            return loadBefore$paging_common(new LoadParams(key, params.getPageSize()), dVar);
        } else if (i == 3) {
            Key key2 = params.getKey();
            C13706o.m87926c(key2);
            return loadAfter$paging_common(new LoadParams(key2, params.getPageSize()), dVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public abstract void loadAfter(LoadParams<Key> loadParams, LoadCallback<Value> loadCallback);

    @VisibleForTesting
    public final Object loadAfter$paging_common(LoadParams<Key> loadParams, C13635d<? super DataSource.BaseResult<Value>> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        loadAfter(loadParams, asCallback(oVar));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    public abstract void loadBefore(LoadParams<Key> loadParams, LoadCallback<Value> loadCallback);

    @VisibleForTesting
    public final Object loadBefore$paging_common(LoadParams<Key> loadParams, C13635d<? super DataSource.BaseResult<Value>> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        loadBefore(loadParams, asCallback(oVar));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    public abstract void loadInitial(LoadInitialParams<Key> loadInitialParams, LoadInitialCallback<Value> loadInitialCallback);

    @VisibleForTesting
    public final Object loadInitial$paging_common(LoadInitialParams<Key> loadInitialParams, C13635d<? super DataSource.BaseResult<Value>> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        loadInitial(loadInitialParams, new ItemKeyedDataSource$loadInitial$2$1(oVar, this));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    public final <ToValue> ItemKeyedDataSource<Key, ToValue> map(Function<Value, ToValue> function) {
        C13706o.m87929f(function, "function");
        return mapByPage((Function) new ItemKeyedDataSource$map$1(function));
    }

    public final <ToValue> ItemKeyedDataSource<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
        C13706o.m87929f(function, "function");
        return new WrapperItemKeyedDataSource(this, function);
    }

    public final <ToValue> ItemKeyedDataSource<Key, ToValue> map(C16265l<? super Value, ? extends ToValue> lVar) {
        C13706o.m87929f(lVar, "function");
        return mapByPage((Function) new ItemKeyedDataSource$map$2(lVar));
    }

    public final <ToValue> ItemKeyedDataSource<Key, ToValue> mapByPage(C16265l<? super List<? extends Value>, ? extends List<? extends ToValue>> lVar) {
        C13706o.m87929f(lVar, "function");
        return mapByPage((Function) new ItemKeyedDataSource$mapByPage$1(lVar));
    }
}
