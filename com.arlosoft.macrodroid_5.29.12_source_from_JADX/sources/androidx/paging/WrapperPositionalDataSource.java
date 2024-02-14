package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B5\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00160\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R/\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo71668d2 = {"Landroidx/paging/WrapperPositionalDataSource;", "", "A", "B", "Landroidx/paging/PositionalDataSource;", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "Lja/u;", "addInvalidatedCallback", "removeInvalidatedCallback", "invalidate", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "params", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "callback", "loadInitial", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "loadRange", "source", "Landroidx/paging/PositionalDataSource;", "Landroidx/arch/core/util/Function;", "", "listFunction", "Landroidx/arch/core/util/Function;", "getListFunction", "()Landroidx/arch/core/util/Function;", "", "isInvalid", "()Z", "<init>", "(Landroidx/paging/PositionalDataSource;Landroidx/arch/core/util/Function;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: WrapperPositionalDataSource.kt */
public final class WrapperPositionalDataSource<A, B> extends PositionalDataSource<B> {
    private final Function<List<A>, List<B>> listFunction;
    private final PositionalDataSource<A> source;

    public WrapperPositionalDataSource(PositionalDataSource<A> positionalDataSource, Function<List<A>, List<B>> function) {
        C13706o.m87929f(positionalDataSource, "source");
        C13706o.m87929f(function, "listFunction");
        this.source = positionalDataSource;
        this.listFunction = function;
    }

    public void addInvalidatedCallback(DataSource.InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(invalidatedCallback);
    }

    public final Function<List<A>, List<B>> getListFunction() {
        return this.listFunction;
    }

    public void invalidate() {
        this.source.invalidate();
    }

    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    public void loadInitial(PositionalDataSource.LoadInitialParams loadInitialParams, PositionalDataSource.LoadInitialCallback<B> loadInitialCallback) {
        C13706o.m87929f(loadInitialParams, "params");
        C13706o.m87929f(loadInitialCallback, "callback");
        this.source.loadInitial(loadInitialParams, new WrapperPositionalDataSource$loadInitial$1(loadInitialCallback, this));
    }

    public void loadRange(PositionalDataSource.LoadRangeParams loadRangeParams, PositionalDataSource.LoadRangeCallback<B> loadRangeCallback) {
        C13706o.m87929f(loadRangeParams, "params");
        C13706o.m87929f(loadRangeCallback, "callback");
        this.source.loadRange(loadRangeParams, new WrapperPositionalDataSource$loadRange$1(loadRangeCallback, this));
    }

    public void removeInvalidatedCallback(DataSource.InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(invalidatedCallback);
    }
}
