package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\u001d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\f0\u001c¢\u0006\u0004\b%\u0010&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fJ$\u0010\u0013\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011H\u0016J$\u0010\u0016\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0015H\u0016J$\u0010\u0017\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0015H\u0016J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR,\u0010\u001d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\f0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, mo71668d2 = {"Landroidx/paging/WrapperItemKeyedDataSource;", "", "K", "A", "B", "Landroidx/paging/ItemKeyedDataSource;", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "Lja/u;", "addInvalidatedCallback", "removeInvalidatedCallback", "invalidate", "", "source", "convertWithStashedKeys", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "params", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "callback", "loadInitial", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadAfter", "loadBefore", "item", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/paging/ItemKeyedDataSource;", "Landroidx/arch/core/util/Function;", "listFunction", "Landroidx/arch/core/util/Function;", "Ljava/util/IdentityHashMap;", "keyMap", "Ljava/util/IdentityHashMap;", "", "isInvalid", "()Z", "<init>", "(Landroidx/paging/ItemKeyedDataSource;Landroidx/arch/core/util/Function;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: WrapperItemKeyedDataSource.kt */
public final class WrapperItemKeyedDataSource<K, A, B> extends ItemKeyedDataSource<K, B> {
    private final IdentityHashMap<B, K> keyMap = new IdentityHashMap<>();
    private final Function<List<A>, List<B>> listFunction;
    private final ItemKeyedDataSource<K, A> source;

    public WrapperItemKeyedDataSource(ItemKeyedDataSource<K, A> itemKeyedDataSource, Function<List<A>, List<B>> function) {
        C13706o.m87929f(itemKeyedDataSource, "source");
        C13706o.m87929f(function, "listFunction");
        this.source = itemKeyedDataSource;
        this.listFunction = function;
    }

    public void addInvalidatedCallback(DataSource.InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(invalidatedCallback);
    }

    public final List<B> convertWithStashedKeys(List<? extends A> list) {
        C13706o.m87929f(list, "source");
        List<B> convert$paging_common = DataSource.Companion.convert$paging_common(this.listFunction, list);
        synchronized (this.keyMap) {
            int i = 0;
            int size = convert$paging_common.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    this.keyMap.put(convert$paging_common.get(i), this.source.getKey(list.get(i)));
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            C13339u uVar = C13339u.f61331a;
        }
        return convert$paging_common;
    }

    public K getKey(B b) {
        K k;
        C13706o.m87929f(b, "item");
        synchronized (this.keyMap) {
            k = this.keyMap.get(b);
            C13706o.m87926c(k);
            C13706o.m87928e(k, "keyMap[item]!!");
        }
        return k;
    }

    public void invalidate() {
        this.source.invalidate();
    }

    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    public void loadAfter(ItemKeyedDataSource.LoadParams<K> loadParams, ItemKeyedDataSource.LoadCallback<B> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        this.source.loadAfter(loadParams, new WrapperItemKeyedDataSource$loadAfter$1(loadCallback, this));
    }

    public void loadBefore(ItemKeyedDataSource.LoadParams<K> loadParams, ItemKeyedDataSource.LoadCallback<B> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        this.source.loadBefore(loadParams, new WrapperItemKeyedDataSource$loadBefore$1(loadCallback, this));
    }

    public void loadInitial(ItemKeyedDataSource.LoadInitialParams<K> loadInitialParams, ItemKeyedDataSource.LoadInitialCallback<B> loadInitialCallback) {
        C13706o.m87929f(loadInitialParams, "params");
        C13706o.m87929f(loadInitialCallback, "callback");
        this.source.loadInitial(loadInitialParams, new WrapperItemKeyedDataSource$loadInitial$1(loadInitialCallback, this));
    }

    public void removeInvalidatedCallback(DataSource.InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(invalidatedCallback);
    }
}
