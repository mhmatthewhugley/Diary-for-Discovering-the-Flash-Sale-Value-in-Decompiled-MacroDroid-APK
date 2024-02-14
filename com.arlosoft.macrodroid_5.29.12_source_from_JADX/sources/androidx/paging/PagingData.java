package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0010*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0010B%\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo71668d2 = {"Landroidx/paging/PagingData;", "", "T", "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/PageEvent;", "flow", "Lkotlinx/coroutines/flow/f;", "getFlow$paging_common", "()Lkotlinx/coroutines/flow/f;", "Landroidx/paging/UiReceiver;", "receiver", "Landroidx/paging/UiReceiver;", "getReceiver$paging_common", "()Landroidx/paging/UiReceiver;", "<init>", "(Lkotlinx/coroutines/flow/f;Landroidx/paging/UiReceiver;)V", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PagingData.kt */
public final class PagingData<T> {
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static final PagingData<Object> EMPTY;
    /* access modifiers changed from: private */
    public static final UiReceiver NOOP_RECEIVER;
    private final C15285f<PageEvent<T>> flow;
    private final UiReceiver receiver;

    @Metadata(mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0001\u0010\r*\u00020\u0001H\u0007J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0001\u0010\r*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010H\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo71668d2 = {"Landroidx/paging/PagingData$Companion;", "", "()V", "EMPTY", "Landroidx/paging/PagingData;", "getEMPTY$paging_common$annotations", "getEMPTY$paging_common", "()Landroidx/paging/PagingData;", "NOOP_RECEIVER", "Landroidx/paging/UiReceiver;", "getNOOP_RECEIVER$paging_common", "()Landroidx/paging/UiReceiver;", "empty", "T", "from", "data", "", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PagingData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public static /* synthetic */ void getEMPTY$paging_common$annotations() {
        }

        public final <T> PagingData<T> empty() {
            return getEMPTY$paging_common();
        }

        public final <T> PagingData<T> from(List<? extends T> list) {
            C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            PageEvent.Insert.Companion companion = PageEvent.Insert.Companion;
            List e = C13612s.m87736e(new TransformablePage(0, list));
            LoadState.NotLoading.Companion companion2 = LoadState.NotLoading.Companion;
            return new PagingData<>(C15290h.m94133s(PageEvent.Insert.Companion.Refresh$default(companion, e, 0, 0, new LoadStates(companion2.getIncomplete$paging_common(), companion2.getComplete$paging_common(), companion2.getComplete$paging_common()), (LoadStates) null, 16, (Object) null)), getNOOP_RECEIVER$paging_common());
        }

        public final PagingData<Object> getEMPTY$paging_common() {
            return PagingData.EMPTY;
        }

        public final UiReceiver getNOOP_RECEIVER$paging_common() {
            return PagingData.NOOP_RECEIVER;
        }
    }

    static {
        PagingData$Companion$NOOP_RECEIVER$1 pagingData$Companion$NOOP_RECEIVER$1 = new PagingData$Companion$NOOP_RECEIVER$1();
        NOOP_RECEIVER = pagingData$Companion$NOOP_RECEIVER$1;
        EMPTY = new PagingData<>(C15290h.m94133s(PageEvent.Insert.Companion.getEMPTY_REFRESH_LOCAL()), pagingData$Companion$NOOP_RECEIVER$1);
    }

    public PagingData(C15285f<? extends PageEvent<T>> fVar, UiReceiver uiReceiver) {
        C13706o.m87929f(fVar, "flow");
        C13706o.m87929f(uiReceiver, "receiver");
        this.flow = fVar;
        this.receiver = uiReceiver;
    }

    public static final <T> PagingData<T> empty() {
        return Companion.empty();
    }

    public static final <T> PagingData<T> from(List<? extends T> list) {
        return Companion.from(list);
    }

    public final C15285f<PageEvent<T>> getFlow$paging_common() {
        return this.flow;
    }

    public final UiReceiver getReceiver$paging_common() {
        return this.receiver;
    }
}
