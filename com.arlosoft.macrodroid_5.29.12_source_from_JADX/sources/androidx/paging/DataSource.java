package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15415h0;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b&\u0018\u0000 1*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0006213456B\u0011\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b/\u00100J>\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u0005H\u0016J>\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\tH\u0016J2\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016J2\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017J\b\u0010\u0010\u001a\u00020\rH\u0017J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H @ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H ¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0010XD¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020#8\u0010XD¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020*8AX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020#8WX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010'\u0002\u0004\n\u0002\b\u0019¨\u00067"}, mo71668d2 = {"Landroidx/paging/DataSource;", "", "Key", "Value", "ToValue", "Landroidx/arch/core/util/Function;", "", "function", "mapByPage", "Lkotlin/Function1;", "map", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "Lja/u;", "addInvalidatedCallback", "removeInvalidatedCallback", "invalidate", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/d;)Ljava/lang/Object;", "load", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Object;", "getKeyInternal", "Landroidx/paging/DataSource$KeyType;", "type", "Landroidx/paging/DataSource$KeyType;", "getType$paging_common", "()Landroidx/paging/DataSource$KeyType;", "Landroidx/paging/InvalidateCallbackTracker;", "invalidateCallbackTracker", "Landroidx/paging/InvalidateCallbackTracker;", "", "isContiguous", "Z", "isContiguous$paging_common", "()Z", "supportsPageDropping", "getSupportsPageDropping$paging_common", "", "getInvalidateCallbackCount$paging_common", "()I", "invalidateCallbackCount", "isInvalid", "<init>", "(Landroidx/paging/DataSource$KeyType;)V", "Companion", "BaseResult", "Factory", "InvalidatedCallback", "KeyType", "Params", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: DataSource.kt */
public abstract class DataSource<Key, Value> {
    public static final Companion Companion = new Companion((C13695i) null);
    private final InvalidateCallbackTracker<InvalidatedCallback> invalidateCallbackTracker = new InvalidateCallbackTracker<>(DataSource$invalidateCallbackTracker$1.INSTANCE, new DataSource$invalidateCallbackTracker$2(this));
    private final boolean isContiguous = true;
    private final boolean supportsPageDropping = true;
    private final KeyType type;

    @Metadata(mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JM\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0002\u0010\u0006\"\u0004\b\u0003\u0010\u00052\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004H\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, mo71668d2 = {"Landroidx/paging/DataSource$Companion;", "", "()V", "convert", "", "B", "A", "function", "Landroidx/arch/core/util/Function;", "source", "convert$paging_common", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: DataSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final <A, B> List<B> convert$paging_common(Function<List<A>, List<B>> function, List<? extends A> list) {
            C13706o.m87929f(function, "function");
            C13706o.m87929f(list, "source");
            List<B> apply = function.apply(list);
            if (apply.size() == list.size()) {
                C13706o.m87928e(apply, "dest");
                return apply;
            }
            throw new IllegalStateException("Invalid Function " + function + " changed return size. This is not supported.");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H&J2\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0007H\u0016J2\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\nH\u0016J>\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000b0\u0007H\u0016J>\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\u0006*\u00020\u00012\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000b0\nH\u0016J$\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00100\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¨\u0006\u0014"}, mo71668d2 = {"Landroidx/paging/DataSource$Factory;", "", "Key", "Value", "Landroidx/paging/DataSource;", "create", "ToValue", "Landroidx/arch/core/util/Function;", "function", "map", "Lkotlin/Function1;", "", "mapByPage", "Lkotlinx/coroutines/h0;", "fetchDispatcher", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "asPagingSourceFactory", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: DataSource.kt */
    public static abstract class Factory<Key, Value> {
        public static /* synthetic */ C16254a asPagingSourceFactory$default(Factory factory, C15415h0 h0Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    h0Var = C15186a1.m93730b();
                }
                return factory.asPagingSourceFactory(h0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPagingSourceFactory");
        }

        public final C16254a<PagingSource<Key, Value>> asPagingSourceFactory() {
            return asPagingSourceFactory$default(this, (C15415h0) null, 1, (Object) null);
        }

        public final C16254a<PagingSource<Key, Value>> asPagingSourceFactory(C15415h0 h0Var) {
            C13706o.m87929f(h0Var, "fetchDispatcher");
            return new SuspendingPagingSourceFactory(h0Var, new DataSource$Factory$asPagingSourceFactory$1(h0Var, this));
        }

        public abstract DataSource<Key, Value> create();

        public <ToValue> Factory<Key, ToValue> map(Function<Value, ToValue> function) {
            C13706o.m87929f(function, "function");
            return mapByPage(new DataSource$Factory$map$1(function));
        }

        public <ToValue> Factory<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
            C13706o.m87929f(function, "function");
            return new DataSource$Factory$mapByPage$1(this, function);
        }

        public /* synthetic */ Factory map(C16265l lVar) {
            C13706o.m87929f(lVar, "function");
            return mapByPage(new DataSource$Factory$map$2(lVar));
        }

        public /* synthetic */ Factory mapByPage(C16265l lVar) {
            C13706o.m87929f(lVar, "function");
            return mapByPage(new DataSource$Factory$mapByPage$2(lVar));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0004"}, mo71668d2 = {"Landroidx/paging/DataSource$InvalidatedCallback;", "", "Lja/u;", "onInvalidated", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: DataSource.kt */
    public interface InvalidatedCallback {
        @AnyThread
        void onInvalidated();
    }

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo71668d2 = {"Landroidx/paging/DataSource$KeyType;", "", "(Ljava/lang/String;I)V", "POSITIONAL", "PAGE_KEYED", "ITEM_KEYED", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: DataSource.kt */
    public enum KeyType {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    @Metadata(mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, mo71668d2 = {"Landroidx/paging/DataSource$Params;", "K", "", "type", "Landroidx/paging/LoadType;", "key", "initialLoadSize", "", "placeholdersEnabled", "", "pageSize", "(Landroidx/paging/LoadType;Ljava/lang/Object;IZI)V", "getInitialLoadSize", "()I", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getPageSize", "getPlaceholdersEnabled", "()Z", "getType$paging_common", "()Landroidx/paging/LoadType;", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: DataSource.kt */
    public static final class Params<K> {
        private final int initialLoadSize;
        private final K key;
        private final int pageSize;
        private final boolean placeholdersEnabled;
        private final LoadType type;

        public Params(LoadType loadType, K k, int i, boolean z, int i2) {
            C13706o.m87929f(loadType, "type");
            this.type = loadType;
            this.key = k;
            this.initialLoadSize = i;
            this.placeholdersEnabled = z;
            this.pageSize = i2;
            if (loadType != LoadType.REFRESH && k == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        public final int getInitialLoadSize() {
            return this.initialLoadSize;
        }

        public final K getKey() {
            return this.key;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final boolean getPlaceholdersEnabled() {
            return this.placeholdersEnabled;
        }

        public final LoadType getType$paging_common() {
            return this.type;
        }
    }

    public DataSource(KeyType keyType) {
        C13706o.m87929f(keyType, "type");
        this.type = keyType;
    }

    @AnyThread
    public void addInvalidatedCallback(InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.registerInvalidatedCallback$paging_common(invalidatedCallback);
    }

    @VisibleForTesting
    public final int getInvalidateCallbackCount$paging_common() {
        return this.invalidateCallbackTracker.callbackCount$paging_common();
    }

    public abstract Key getKeyInternal$paging_common(Value value);

    public boolean getSupportsPageDropping$paging_common() {
        return this.supportsPageDropping;
    }

    public final KeyType getType$paging_common() {
        return this.type;
    }

    @AnyThread
    public void invalidate() {
        this.invalidateCallbackTracker.invalidate$paging_common();
    }

    public boolean isContiguous$paging_common() {
        return this.isContiguous;
    }

    @WorkerThread
    public boolean isInvalid() {
        return this.invalidateCallbackTracker.getInvalid$paging_common();
    }

    public abstract Object load$paging_common(Params<Key> params, C13635d<? super BaseResult<Value>> dVar);

    public <ToValue> DataSource<Key, ToValue> map(Function<Value, ToValue> function) {
        C13706o.m87929f(function, "function");
        return mapByPage((C16265l) new DataSource$map$1(function));
    }

    public <ToValue> DataSource<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
        C13706o.m87929f(function, "function");
        return new WrapperDataSource(this, function);
    }

    @AnyThread
    public void removeInvalidatedCallback(InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.unregisterInvalidatedCallback$paging_common(invalidatedCallback);
    }

    public /* synthetic */ DataSource map(C16265l lVar) {
        C13706o.m87929f(lVar, "function");
        return map(new DataSource$map$2(lVar));
    }

    public /* synthetic */ DataSource mapByPage(C16265l lVar) {
        C13706o.m87929f(lVar, "function");
        return mapByPage(new DataSource$mapByPage$1(lVar));
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\b\u0000\u0018\u0000 \u001d*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001dB?\b\u0000\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, mo71668d2 = {"Landroidx/paging/DataSource$BaseResult;", "", "Value", "", "pageSize", "Lja/u;", "validateForInitialTiling$paging_common", "(I)V", "validateForInitialTiling", "other", "", "equals", "", "data", "Ljava/util/List;", "prevKey", "Ljava/lang/Object;", "getPrevKey", "()Ljava/lang/Object;", "nextKey", "getNextKey", "itemsBefore", "I", "getItemsBefore", "()I", "itemsAfter", "getItemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: DataSource.kt */
    public static final class BaseResult<Value> {
        public static final Companion Companion = new Companion((C13695i) null);
        public final List<Value> data;
        private final int itemsAfter;
        private final int itemsBefore;
        private final Object nextKey;
        private final Object prevKey;

        @Metadata(mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JU\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0003\u0010\u0006*\u00020\u0001\"\b\b\u0004\u0010\u0005*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\n0\tH\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0003\u0010\r*\u00020\u0001H\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, mo71668d2 = {"Landroidx/paging/DataSource$BaseResult$Companion;", "", "()V", "convert", "Landroidx/paging/DataSource$BaseResult;", "Value", "ToValue", "result", "function", "Landroidx/arch/core/util/Function;", "", "convert$paging_common", "empty", "T", "empty$paging_common", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
        /* compiled from: DataSource.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C13695i iVar) {
                this();
            }

            public final <ToValue, Value> BaseResult<Value> convert$paging_common(BaseResult<ToValue> baseResult, Function<List<ToValue>, List<Value>> function) {
                C13706o.m87929f(baseResult, "result");
                C13706o.m87929f(function, "function");
                return new BaseResult(DataSource.Companion.convert$paging_common(function, baseResult.data), baseResult.getPrevKey(), baseResult.getNextKey(), baseResult.getItemsBefore(), baseResult.getItemsAfter());
            }

            public final <T> BaseResult<T> empty$paging_common() {
                return new BaseResult(C13614t.m87748j(), (Object) null, (Object) null, 0, 0);
            }
        }

        public BaseResult(List<? extends Value> list, Object obj, Object obj2, int i, int i2) {
            C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            this.data = list;
            this.prevKey = obj;
            this.nextKey = obj2;
            this.itemsBefore = i;
            this.itemsAfter = i2;
            if (i < 0 && i != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            } else if (list.isEmpty() && (i > 0 || i2 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            } else if (i2 < 0 && i2 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BaseResult)) {
                return false;
            }
            BaseResult baseResult = (BaseResult) obj;
            if (!C13706o.m87924a(this.data, baseResult.data) || !C13706o.m87924a(this.prevKey, baseResult.prevKey) || !C13706o.m87924a(this.nextKey, baseResult.nextKey) || this.itemsBefore != baseResult.itemsBefore || this.itemsAfter != baseResult.itemsAfter) {
                return false;
            }
            return true;
        }

        public final int getItemsAfter() {
            return this.itemsAfter;
        }

        public final int getItemsBefore() {
            return this.itemsBefore;
        }

        public final Object getNextKey() {
            return this.nextKey;
        }

        public final Object getPrevKey() {
            return this.prevKey;
        }

        public final void validateForInitialTiling$paging_common(int i) {
            int i2;
            if (this.itemsBefore == Integer.MIN_VALUE || (i2 = this.itemsAfter) == Integer.MIN_VALUE) {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            } else if (i2 > 0 && this.data.size() % i != 0) {
                throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + this.data.size() + ", position " + this.itemsBefore + ", totalCount " + (this.itemsBefore + this.data.size() + this.itemsAfter) + ", pageSize " + i);
            } else if (this.itemsBefore % i != 0) {
                throw new IllegalArgumentException("Initial load must be pageSize aligned.Position = " + this.itemsBefore + ", pageSize = " + i);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BaseResult(List list, Object obj, Object obj2, int i, int i2, int i3, C13695i iVar) {
            this(list, obj, obj2, (i3 & 8) != 0 ? Integer.MIN_VALUE : i, (i3 & 16) != 0 ? Integer.MIN_VALUE : i2);
        }
    }
}
