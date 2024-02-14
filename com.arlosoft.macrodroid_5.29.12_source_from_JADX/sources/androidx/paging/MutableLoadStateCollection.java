package androidx.paging;

import androidx.paging.LoadState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u001b"}, mo71668d2 = {"Landroidx/paging/MutableLoadStateCollection;", "", "Landroidx/paging/LoadStates;", "snapshot", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/LoadState;", "get", "type", "state", "Lja/u;", "set", "states", "refresh", "Landroidx/paging/LoadState;", "getRefresh", "()Landroidx/paging/LoadState;", "setRefresh", "(Landroidx/paging/LoadState;)V", "prepend", "getPrepend", "setPrepend", "append", "getAppend", "setAppend", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: MutableLoadStateCollection.kt */
public final class MutableLoadStateCollection {
    private LoadState append;
    private LoadState prepend;
    private LoadState refresh;

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: MutableLoadStateCollection.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.REFRESH.ordinal()] = 1;
            iArr[LoadType.APPEND.ordinal()] = 2;
            iArr[LoadType.PREPEND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MutableLoadStateCollection() {
        LoadState.NotLoading.Companion companion = LoadState.NotLoading.Companion;
        this.refresh = companion.getIncomplete$paging_common();
        this.prepend = companion.getIncomplete$paging_common();
        this.append = companion.getIncomplete$paging_common();
    }

    public final LoadState get(LoadType loadType) {
        C13706o.m87929f(loadType, "loadType");
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            return this.refresh;
        }
        if (i == 2) {
            return this.append;
        }
        if (i == 3) {
            return this.prepend;
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

    public final void set(LoadType loadType, LoadState loadState) {
        C13706o.m87929f(loadType, "type");
        C13706o.m87929f(loadState, "state");
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            this.refresh = loadState;
        } else if (i == 2) {
            this.append = loadState;
        } else if (i == 3) {
            this.prepend = loadState;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setAppend(LoadState loadState) {
        C13706o.m87929f(loadState, "<set-?>");
        this.append = loadState;
    }

    public final void setPrepend(LoadState loadState) {
        C13706o.m87929f(loadState, "<set-?>");
        this.prepend = loadState;
    }

    public final void setRefresh(LoadState loadState) {
        C13706o.m87929f(loadState, "<set-?>");
        this.refresh = loadState;
    }

    public final LoadStates snapshot() {
        return new LoadStates(this.refresh, this.prepend, this.append);
    }

    public final void set(LoadStates loadStates) {
        C13706o.m87929f(loadStates, "states");
        this.refresh = loadStates.getRefresh();
        this.append = loadStates.getAppend();
        this.prepend = loadStates.getPrepend();
    }
}
