package androidx.paging;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010!J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J/\u0010\u0010\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006\""}, mo71668d2 = {"Landroidx/paging/CombinedLoadStates;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/Function3;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "Lja/u;", "op", "forEach$paging_common", "(Lqa/q;)V", "forEach", "refresh", "Landroidx/paging/LoadState;", "getRefresh", "()Landroidx/paging/LoadState;", "prepend", "getPrepend", "append", "getAppend", "Landroidx/paging/LoadStates;", "source", "Landroidx/paging/LoadStates;", "getSource", "()Landroidx/paging/LoadStates;", "mediator", "getMediator", "<init>", "(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CombinedLoadStates.kt */
public final class CombinedLoadStates {
    private final LoadState append;
    private final LoadStates mediator;
    private final LoadState prepend;
    private final LoadState refresh;
    private final LoadStates source;

    public CombinedLoadStates(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadStates loadStates, LoadStates loadStates2) {
        C13706o.m87929f(loadState, "refresh");
        C13706o.m87929f(loadState2, "prepend");
        C13706o.m87929f(loadState3, "append");
        C13706o.m87929f(loadStates, "source");
        this.refresh = loadState;
        this.prepend = loadState2;
        this.append = loadState3;
        this.source = loadStates;
        this.mediator = loadStates2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13706o.m87924a(CombinedLoadStates.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) obj;
        return C13706o.m87924a(this.refresh, combinedLoadStates.refresh) && C13706o.m87924a(this.prepend, combinedLoadStates.prepend) && C13706o.m87924a(this.append, combinedLoadStates.append) && C13706o.m87924a(this.source, combinedLoadStates.source) && C13706o.m87924a(this.mediator, combinedLoadStates.mediator);
    }

    public final void forEach$paging_common(C16270q<? super LoadType, ? super Boolean, ? super LoadState, C13339u> qVar) {
        C13706o.m87929f(qVar, "op");
        LoadStates loadStates = this.source;
        LoadType loadType = LoadType.REFRESH;
        LoadState refresh2 = loadStates.getRefresh();
        Boolean bool = Boolean.FALSE;
        qVar.invoke(loadType, bool, refresh2);
        LoadType loadType2 = LoadType.PREPEND;
        qVar.invoke(loadType2, bool, loadStates.getPrepend());
        LoadType loadType3 = LoadType.APPEND;
        qVar.invoke(loadType3, bool, loadStates.getAppend());
        LoadStates loadStates2 = this.mediator;
        if (loadStates2 != null) {
            LoadState refresh3 = loadStates2.getRefresh();
            Boolean bool2 = Boolean.TRUE;
            qVar.invoke(loadType, bool2, refresh3);
            qVar.invoke(loadType2, bool2, loadStates2.getPrepend());
            qVar.invoke(loadType3, bool2, loadStates2.getAppend());
        }
    }

    public final LoadState getAppend() {
        return this.append;
    }

    public final LoadStates getMediator() {
        return this.mediator;
    }

    public final LoadState getPrepend() {
        return this.prepend;
    }

    public final LoadState getRefresh() {
        return this.refresh;
    }

    public final LoadStates getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = ((((((this.refresh.hashCode() * 31) + this.prepend.hashCode()) * 31) + this.append.hashCode()) * 31) + this.source.hashCode()) * 31;
        LoadStates loadStates = this.mediator;
        return hashCode + (loadStates == null ? 0 : loadStates.hashCode());
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ", source=" + this.source + ", mediator=" + this.mediator + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombinedLoadStates(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadStates loadStates, LoadStates loadStates2, int i, C13695i iVar) {
        this(loadState, loadState2, loadState3, loadStates, (i & 16) != 0 ? null : loadStates2);
    }
}
