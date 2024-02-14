package androidx.paging;

import androidx.paging.PagedList;
import kotlin.Metadata;
import kotlin.jvm.internal.C13704m;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: AsyncPagedListDiffer.kt */
/* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends C13704m implements C16269p<LoadType, LoadState, C13339u> {
    AsyncPagedListDiffer$loadStateListener$1(Object obj) {
        super(2, obj, PagedList.LoadStateManager.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LoadType) obj, (LoadState) obj2);
        return C13339u.f61331a;
    }

    public final void invoke(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "p0");
        C13706o.m87929f(loadState, "p1");
        ((PagedList.LoadStateManager) this.receiver).setState(loadType, loadState);
    }
}
