package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00180\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000eH\u0016J*\u0010\u0013\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0012H\u0016J*\u0010\u0014\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0012H\u0016R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R,\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo71668d2 = {"Landroidx/paging/WrapperPageKeyedDataSource;", "", "K", "A", "B", "Landroidx/paging/PageKeyedDataSource;", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "Lja/u;", "addInvalidatedCallback", "removeInvalidatedCallback", "invalidate", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "params", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "callback", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadAfter", "source", "Landroidx/paging/PageKeyedDataSource;", "Landroidx/arch/core/util/Function;", "", "listFunction", "Landroidx/arch/core/util/Function;", "", "isInvalid", "()Z", "<init>", "(Landroidx/paging/PageKeyedDataSource;Landroidx/arch/core/util/Function;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: WrapperPageKeyedDataSource.kt */
public final class WrapperPageKeyedDataSource<K, A, B> extends PageKeyedDataSource<K, B> {
    /* access modifiers changed from: private */
    public final Function<List<A>, List<B>> listFunction;
    private final PageKeyedDataSource<K, A> source;

    public WrapperPageKeyedDataSource(PageKeyedDataSource<K, A> pageKeyedDataSource, Function<List<A>, List<B>> function) {
        C13706o.m87929f(pageKeyedDataSource, "source");
        C13706o.m87929f(function, "listFunction");
        this.source = pageKeyedDataSource;
        this.listFunction = function;
    }

    public void addInvalidatedCallback(DataSource.InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(invalidatedCallback);
    }

    public void invalidate() {
        this.source.invalidate();
    }

    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    public void loadAfter(PageKeyedDataSource.LoadParams<K> loadParams, PageKeyedDataSource.LoadCallback<K, B> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        this.source.loadAfter(loadParams, new WrapperPageKeyedDataSource$loadAfter$1(loadCallback, this));
    }

    public void loadBefore(PageKeyedDataSource.LoadParams<K> loadParams, PageKeyedDataSource.LoadCallback<K, B> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        this.source.loadBefore(loadParams, new WrapperPageKeyedDataSource$loadBefore$1(loadCallback, this));
    }

    public void loadInitial(PageKeyedDataSource.LoadInitialParams<K> loadInitialParams, PageKeyedDataSource.LoadInitialCallback<K, B> loadInitialCallback) {
        C13706o.m87929f(loadInitialParams, "params");
        C13706o.m87929f(loadInitialCallback, "callback");
        this.source.loadInitial(loadInitialParams, new WrapperPageKeyedDataSource$loadInitial$1(this, loadInitialCallback));
    }

    public void removeInvalidatedCallback(DataSource.InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(invalidatedCallback);
    }
}
