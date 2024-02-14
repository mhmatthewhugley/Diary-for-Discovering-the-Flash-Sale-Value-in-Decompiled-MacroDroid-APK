package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J&\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\bø\u0001\u0000J\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\"\u0010 \u0002\u0007\n\u0005\b20\u0001¨\u0006&"}, mo71668d2 = {"Landroidx/paging/LoadStates;", "", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "Lja/u;", "op", "forEach", "loadType", "newState", "modifyState$paging_common", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Landroidx/paging/LoadStates;", "modifyState", "get$paging_common", "(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;", "get", "component1", "component2", "component3", "refresh", "prepend", "append", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/paging/LoadState;", "getRefresh", "()Landroidx/paging/LoadState;", "getPrepend", "getAppend", "<init>", "(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)V", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: LoadStates.kt */
public final class LoadStates {
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static final LoadStates IDLE;
    private final LoadState append;
    private final LoadState prepend;
    private final LoadState refresh;

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo71668d2 = {"Landroidx/paging/LoadStates$Companion;", "", "()V", "IDLE", "Landroidx/paging/LoadStates;", "getIDLE", "()Landroidx/paging/LoadStates;", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: LoadStates.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final LoadStates getIDLE() {
            return LoadStates.IDLE;
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: LoadStates.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.APPEND.ordinal()] = 1;
            iArr[LoadType.PREPEND.ordinal()] = 2;
            iArr[LoadType.REFRESH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LoadState.NotLoading.Companion companion = LoadState.NotLoading.Companion;
        IDLE = new LoadStates(companion.getIncomplete$paging_common(), companion.getIncomplete$paging_common(), companion.getIncomplete$paging_common());
    }

    public LoadStates(LoadState loadState, LoadState loadState2, LoadState loadState3) {
        C13706o.m87929f(loadState, "refresh");
        C13706o.m87929f(loadState2, "prepend");
        C13706o.m87929f(loadState3, "append");
        this.refresh = loadState;
        this.prepend = loadState2;
        this.append = loadState3;
    }

    public static /* synthetic */ LoadStates copy$default(LoadStates loadStates, LoadState loadState, LoadState loadState2, LoadState loadState3, int i, Object obj) {
        if ((i & 1) != 0) {
            loadState = loadStates.refresh;
        }
        if ((i & 2) != 0) {
            loadState2 = loadStates.prepend;
        }
        if ((i & 4) != 0) {
            loadState3 = loadStates.append;
        }
        return loadStates.copy(loadState, loadState2, loadState3);
    }

    public final LoadState component1() {
        return this.refresh;
    }

    public final LoadState component2() {
        return this.prepend;
    }

    public final LoadState component3() {
        return this.append;
    }

    public final LoadStates copy(LoadState loadState, LoadState loadState2, LoadState loadState3) {
        C13706o.m87929f(loadState, "refresh");
        C13706o.m87929f(loadState2, "prepend");
        C13706o.m87929f(loadState3, "append");
        return new LoadStates(loadState, loadState2, loadState3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) obj;
        return C13706o.m87924a(this.refresh, loadStates.refresh) && C13706o.m87924a(this.prepend, loadStates.prepend) && C13706o.m87924a(this.append, loadStates.append);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void forEach(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        C13706o.m87929f(pVar, "op");
        pVar.invoke(LoadType.REFRESH, getRefresh());
        pVar.invoke(LoadType.PREPEND, getPrepend());
        pVar.invoke(LoadType.APPEND, getAppend());
    }

    public final LoadState get$paging_common(LoadType loadType) {
        C13706o.m87929f(loadType, "loadType");
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.append;
        }
        if (i == 2) {
            return this.prepend;
        }
        if (i == 3) {
            return this.refresh;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final LoadState getAppend() {
        return this.append;
    }

    public final LoadState getPrepend() {
        return this.prepend;
    }

    public final LoadState getRefresh() {
        return this.refresh;
    }

    public int hashCode() {
        return (((this.refresh.hashCode() * 31) + this.prepend.hashCode()) * 31) + this.append.hashCode();
    }

    public final LoadStates modifyState$paging_common(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(loadState, "newState");
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return copy$default(this, (LoadState) null, (LoadState) null, loadState, 3, (Object) null);
        }
        if (i == 2) {
            return copy$default(this, (LoadState) null, loadState, (LoadState) null, 5, (Object) null);
        }
        if (i == 3) {
            return copy$default(this, loadState, (LoadState) null, (LoadState) null, 6, (Object) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return "LoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ')';
    }
}
