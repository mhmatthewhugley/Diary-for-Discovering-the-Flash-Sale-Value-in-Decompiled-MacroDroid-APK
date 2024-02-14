package androidx.paging;

import androidx.paging.LoadState;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;
import kotlinx.coroutines.flow.C15346k0;
import kotlinx.coroutines.flow.C15402v;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u001e\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u001a\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0016R\u0016\u0010\u001a\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00160\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R$\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f8\u0006@BX\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010(\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f8\u0006@BX\u000e¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, mo71668d2 = {"Landroidx/paging/MutableCombinedLoadStateCollection;", "", "Landroidx/paging/CombinedLoadStates;", "snapshot", "Lja/u;", "updateHelperStatesAndDispatch", "Landroidx/paging/LoadState;", "previousState", "sourceRefreshState", "sourceState", "remoteState", "computeHelperState", "Landroidx/paging/LoadStates;", "sourceLoadStates", "remoteLoadStates", "set", "Landroidx/paging/LoadType;", "type", "", "remote", "state", "get", "Lkotlin/Function1;", "listener", "addListener", "removeListener", "isInitialized", "Z", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "refresh", "Landroidx/paging/LoadState;", "prepend", "append", "<set-?>", "source", "Landroidx/paging/LoadStates;", "getSource", "()Landroidx/paging/LoadStates;", "mediator", "getMediator", "Lkotlinx/coroutines/flow/v;", "_stateFlow", "Lkotlinx/coroutines/flow/v;", "Lkotlinx/coroutines/flow/f;", "flow", "Lkotlinx/coroutines/flow/f;", "getFlow", "()Lkotlinx/coroutines/flow/f;", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: MutableCombinedLoadStateCollection.kt */
public final class MutableCombinedLoadStateCollection {
    private final C15402v<CombinedLoadStates> _stateFlow;
    private LoadState append;
    private final C15285f<CombinedLoadStates> flow;
    private boolean isInitialized;
    private final CopyOnWriteArrayList<C16265l<CombinedLoadStates, C13339u>> listeners = new CopyOnWriteArrayList<>();
    private LoadStates mediator;
    private LoadState prepend;
    private LoadState refresh;
    private LoadStates source;

    public MutableCombinedLoadStateCollection() {
        LoadState.NotLoading.Companion companion = LoadState.NotLoading.Companion;
        this.refresh = companion.getIncomplete$paging_common();
        this.prepend = companion.getIncomplete$paging_common();
        this.append = companion.getIncomplete$paging_common();
        this.source = LoadStates.Companion.getIDLE();
        C15402v<CombinedLoadStates> a = C15346k0.m94215a(null);
        this._stateFlow = a;
        this.flow = C15290h.m94130p(a);
    }

    private final LoadState computeHelperState(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadState loadState4) {
        if (loadState4 == null) {
            return loadState3;
        }
        return (!(loadState instanceof LoadState.Loading) || ((loadState2 instanceof LoadState.NotLoading) && (loadState4 instanceof LoadState.NotLoading)) || (loadState4 instanceof LoadState.Error)) ? loadState4 : loadState;
    }

    private final CombinedLoadStates snapshot() {
        if (!this.isInitialized) {
            return null;
        }
        return new CombinedLoadStates(this.refresh, this.prepend, this.append, this.source, this.mediator);
    }

    private final void updateHelperStatesAndDispatch() {
        LoadState loadState = this.refresh;
        LoadState refresh2 = this.source.getRefresh();
        LoadState refresh3 = this.source.getRefresh();
        LoadStates loadStates = this.mediator;
        LoadState loadState2 = null;
        this.refresh = computeHelperState(loadState, refresh2, refresh3, loadStates == null ? null : loadStates.getRefresh());
        LoadState loadState3 = this.prepend;
        LoadState refresh4 = this.source.getRefresh();
        LoadState prepend2 = this.source.getPrepend();
        LoadStates loadStates2 = this.mediator;
        this.prepend = computeHelperState(loadState3, refresh4, prepend2, loadStates2 == null ? null : loadStates2.getPrepend());
        LoadState loadState4 = this.append;
        LoadState refresh5 = this.source.getRefresh();
        LoadState append2 = this.source.getAppend();
        LoadStates loadStates3 = this.mediator;
        if (loadStates3 != null) {
            loadState2 = loadStates3.getAppend();
        }
        this.append = computeHelperState(loadState4, refresh5, append2, loadState2);
        CombinedLoadStates snapshot = snapshot();
        if (snapshot != null) {
            this._stateFlow.setValue(snapshot);
            for (C16265l invoke : this.listeners) {
                invoke.invoke(snapshot);
            }
        }
    }

    public final void addListener(C16265l<? super CombinedLoadStates, C13339u> lVar) {
        C13706o.m87929f(lVar, "listener");
        this.listeners.add(lVar);
        CombinedLoadStates snapshot = snapshot();
        if (snapshot != null) {
            lVar.invoke(snapshot);
        }
    }

    public final LoadState get(LoadType loadType, boolean z) {
        C13706o.m87929f(loadType, "type");
        LoadStates loadStates = z ? this.mediator : this.source;
        if (loadStates == null) {
            return null;
        }
        return loadStates.get$paging_common(loadType);
    }

    public final C15285f<CombinedLoadStates> getFlow() {
        return this.flow;
    }

    public final LoadStates getMediator() {
        return this.mediator;
    }

    public final LoadStates getSource() {
        return this.source;
    }

    public final void removeListener(C16265l<? super CombinedLoadStates, C13339u> lVar) {
        C13706o.m87929f(lVar, "listener");
        this.listeners.remove(lVar);
    }

    public final void set(LoadStates loadStates, LoadStates loadStates2) {
        C13706o.m87929f(loadStates, "sourceLoadStates");
        this.isInitialized = true;
        this.source = loadStates;
        this.mediator = loadStates2;
        updateHelperStatesAndDispatch();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (kotlin.jvm.internal.C13706o.m87924a(r4, r5) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (kotlin.jvm.internal.C13706o.m87924a(r4, r5) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean set(androidx.paging.LoadType r4, boolean r5, androidx.paging.LoadState r6) {
        /*
            r3 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            r0 = 1
            r3.isInitialized = r0
            r1 = 0
            if (r5 == 0) goto L_0x002a
            androidx.paging.LoadStates r5 = r3.mediator
            if (r5 != 0) goto L_0x001c
            androidx.paging.LoadStates$Companion r2 = androidx.paging.LoadStates.Companion
            androidx.paging.LoadStates r2 = r2.getIDLE()
            goto L_0x001d
        L_0x001c:
            r2 = r5
        L_0x001d:
            androidx.paging.LoadStates r4 = r2.modifyState$paging_common(r4, r6)
            r3.mediator = r4
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r5)
            if (r4 != 0) goto L_0x0039
            goto L_0x003a
        L_0x002a:
            androidx.paging.LoadStates r5 = r3.source
            androidx.paging.LoadStates r4 = r5.modifyState$paging_common(r4, r6)
            r3.source = r4
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r5)
            if (r4 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r3.updateHelperStatesAndDispatch()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.MutableCombinedLoadStateCollection.set(androidx.paging.LoadType, boolean, androidx.paging.LoadState):boolean");
    }
}
