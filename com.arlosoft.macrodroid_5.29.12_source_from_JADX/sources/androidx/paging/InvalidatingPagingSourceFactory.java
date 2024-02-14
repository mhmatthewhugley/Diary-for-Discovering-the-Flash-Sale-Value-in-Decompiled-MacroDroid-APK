package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B!\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0002J\u0006\u0010\b\u001a\u00020\u0007R2\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\t8\u0000X\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, mo71668d2 = {"Landroidx/paging/InvalidatingPagingSourceFactory;", "", "Key", "Value", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "invoke", "Lja/u;", "invalidate", "Ljava/util/concurrent/CopyOnWriteArrayList;", "pagingSources", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPagingSources$paging_common", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getPagingSources$paging_common$annotations", "()V", "pagingSourceFactory", "<init>", "(Lqa/a;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: InvalidatingPagingSourceFactory.kt */
public final class InvalidatingPagingSourceFactory<Key, Value> implements C16254a<PagingSource<Key, Value>> {
    private final C16254a<PagingSource<Key, Value>> pagingSourceFactory;
    private final CopyOnWriteArrayList<PagingSource<Key, Value>> pagingSources = new CopyOnWriteArrayList<>();

    public InvalidatingPagingSourceFactory(C16254a<? extends PagingSource<Key, Value>> aVar) {
        C13706o.m87929f(aVar, "pagingSourceFactory");
        this.pagingSourceFactory = aVar;
    }

    @VisibleForTesting
    public static /* synthetic */ void getPagingSources$paging_common$annotations() {
    }

    public final CopyOnWriteArrayList<PagingSource<Key, Value>> getPagingSources$paging_common() {
        return this.pagingSources;
    }

    public final void invalidate() {
        Iterator<PagingSource<Key, Value>> it = this.pagingSources.iterator();
        while (it.hasNext()) {
            PagingSource next = it.next();
            if (!next.getInvalid()) {
                next.invalidate();
            }
        }
        boolean unused = C13624y.m87795D(this.pagingSources, InvalidatingPagingSourceFactory$invalidate$1.INSTANCE);
    }

    public PagingSource<Key, Value> invoke() {
        PagingSource<Key, Value> invoke = this.pagingSourceFactory.invoke();
        getPagingSources$paging_common().add(invoke);
        return invoke;
    }
}
