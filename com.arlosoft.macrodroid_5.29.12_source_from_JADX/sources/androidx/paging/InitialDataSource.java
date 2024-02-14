package androidx.paging;

import androidx.paging.PageKeyedDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J*\u0010\r\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016J*\u0010\u000e\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¨\u0006\u0011"}, mo71668d2 = {"Landroidx/paging/InitialDataSource;", "", "K", "V", "Landroidx/paging/PageKeyedDataSource;", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "params", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "callback", "Lja/u;", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadAfter", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: InitialDataSource.kt */
public final class InitialDataSource<K, V> extends PageKeyedDataSource<K, V> {
    public void loadAfter(PageKeyedDataSource.LoadParams<K> loadParams, PageKeyedDataSource.LoadCallback<K, V> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        loadCallback.onResult(C13614t.m87748j(), null);
    }

    public void loadBefore(PageKeyedDataSource.LoadParams<K> loadParams, PageKeyedDataSource.LoadCallback<K, V> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        loadCallback.onResult(C13614t.m87748j(), null);
    }

    public void loadInitial(PageKeyedDataSource.LoadInitialParams<K> loadInitialParams, PageKeyedDataSource.LoadInitialCallback<K, V> loadInitialCallback) {
        C13706o.m87929f(loadInitialParams, "params");
        C13706o.m87929f(loadInitialCallback, "callback");
        loadInitialCallback.onResult(C13614t.m87748j(), 0, 0, null, null);
    }
}
