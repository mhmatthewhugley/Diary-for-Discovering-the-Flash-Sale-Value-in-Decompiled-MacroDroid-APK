package androidx.paging;

import androidx.annotation.CheckResult;
import androidx.core.app.NotificationCompat;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PagingSource;
import androidx.paging.ViewportHint;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13705n;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15221f;
import kotlinx.coroutines.channels.C15225i;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;
import kotlinx.coroutines.sync.C15536b;
import kotlinx.coroutines.sync.C15544d;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001PB\u0011\b\u0002\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bN\u0010OJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0007J\u0014\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016J\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aJ%\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R,\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0)8\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010,R$\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0000@BX\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010/R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0006068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0006068\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00108R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a0:8\u0000X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R$\u0010@\u001a\u00020?2\u0006\u0010-\u001a\u00020?8\u0000@BX\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\bD\u00101R$\u0010J\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00068@@@X\u000e¢\u0006\f\u001a\u0004\bG\u00101\"\u0004\bH\u0010IR$\u0010M\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00068@@@X\u000e¢\u0006\f\u001a\u0004\bK\u00101\"\u0004\bL\u0010I¨\u0006Q"}, mo71668d2 = {"Landroidx/paging/PageFetcherSnapshotState;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "", "generationId$paging_common", "(Landroidx/paging/LoadType;)I", "generationId", "Lkotlinx/coroutines/flow/f;", "consumePrependGenerationIdAsFlow", "consumeAppendGenerationIdAsFlow", "Landroidx/paging/PagingSource$LoadResult$Page;", "Landroidx/paging/PageEvent;", "toPageEvent$paging_common", "(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent;", "toPageEvent", "loadId", "page", "", "insert", "Landroidx/paging/PageEvent$Drop;", "event", "Lja/u;", "drop", "Landroidx/paging/ViewportHint;", "hint", "dropEventOrNull", "Landroidx/paging/ViewportHint$Access;", "viewportHint", "Landroidx/paging/PagingState;", "currentPagingState$paging_common", "(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;", "currentPagingState", "Landroidx/paging/PagingConfig;", "config", "Landroidx/paging/PagingConfig;", "", "_pages", "Ljava/util/List;", "", "pages", "getPages$paging_common", "()Ljava/util/List;", "<set-?>", "initialPageIndex", "I", "getInitialPageIndex$paging_common", "()I", "_placeholdersBefore", "_placeholdersAfter", "prependGenerationId", "appendGenerationId", "Lkotlinx/coroutines/channels/f;", "prependGenerationIdCh", "Lkotlinx/coroutines/channels/f;", "appendGenerationIdCh", "", "failedHintsByLoadType", "Ljava/util/Map;", "getFailedHintsByLoadType$paging_common", "()Ljava/util/Map;", "Landroidx/paging/MutableLoadStateCollection;", "sourceLoadStates", "Landroidx/paging/MutableLoadStateCollection;", "getSourceLoadStates$paging_common", "()Landroidx/paging/MutableLoadStateCollection;", "getStorageCount$paging_common", "storageCount", "value", "getPlaceholdersBefore$paging_common", "setPlaceholdersBefore$paging_common", "(I)V", "placeholdersBefore", "getPlaceholdersAfter$paging_common", "setPlaceholdersAfter$paging_common", "placeholdersAfter", "<init>", "(Landroidx/paging/PagingConfig;)V", "Holder", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PageFetcherSnapshotState.kt */
public final class PageFetcherSnapshotState<Key, Value> {
    private final List<PagingSource.LoadResult.Page<Key, Value>> _pages;
    private int _placeholdersAfter;
    private int _placeholdersBefore;
    /* access modifiers changed from: private */
    public int appendGenerationId;
    /* access modifiers changed from: private */
    public final C15221f<Integer> appendGenerationIdCh;
    private final PagingConfig config;
    private final Map<LoadType, ViewportHint> failedHintsByLoadType;
    private int initialPageIndex;
    private final List<PagingSource.LoadResult.Page<Key, Value>> pages;
    /* access modifiers changed from: private */
    public int prependGenerationId;
    /* access modifiers changed from: private */
    public final C15221f<Integer> prependGenerationIdCh;
    private MutableLoadStateCollection sourceLoadStates;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\b\u001a\u00028\u0004\"\u0004\b\u0004\u0010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\u0012\u0004\u0012\u00028\u00040\u0005HHø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo71668d2 = {"Landroidx/paging/PageFetcherSnapshotState$Holder;", "", "Key", "Value", "T", "Lkotlin/Function1;", "Landroidx/paging/PageFetcherSnapshotState;", "block", "withLock", "(Lqa/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/PagingConfig;", "config", "Landroidx/paging/PagingConfig;", "Lkotlinx/coroutines/sync/b;", "lock", "Lkotlinx/coroutines/sync/b;", "state", "Landroidx/paging/PageFetcherSnapshotState;", "<init>", "(Landroidx/paging/PagingConfig;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PageFetcherSnapshotState.kt */
    public static final class Holder<Key, Value> {
        private final PagingConfig config;
        /* access modifiers changed from: private */
        public final C15536b lock = C15544d.m94682b(false, 1, (Object) null);
        /* access modifiers changed from: private */
        public final PageFetcherSnapshotState<Key, Value> state;

        public Holder(PagingConfig pagingConfig) {
            C13706o.m87929f(pagingConfig, "config");
            this.config = pagingConfig;
            this.state = new PageFetcherSnapshotState<>(pagingConfig, (C13695i) null);
        }

        private final <T> Object withLock$$forInline(C16265l<? super PageFetcherSnapshotState<Key, Value>, ? extends T> lVar, C13635d<? super T> dVar) {
            C15536b access$getLock$p = this.lock;
            C13705n.m87923c(0);
            access$getLock$p.mo74906a((Object) null, dVar);
            C13705n.m87923c(1);
            try {
                return lVar.invoke(this.state);
            } finally {
                C13705n.m87922b(1);
                access$getLock$p.mo74907b((Object) null);
                C13705n.m87921a(1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object withLock(p370qa.C16265l<? super androidx.paging.PageFetcherSnapshotState<Key, Value>, ? extends T> r6, kotlin.coroutines.C13635d<? super T> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.PageFetcherSnapshotState$Holder$withLock$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                androidx.paging.PageFetcherSnapshotState$Holder$withLock$1 r0 = (androidx.paging.PageFetcherSnapshotState$Holder$withLock$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.PageFetcherSnapshotState$Holder$withLock$1 r0 = new androidx.paging.PageFetcherSnapshotState$Holder$withLock$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 != r4) goto L_0x0038
                java.lang.Object r6 = r0.L$2
                kotlinx.coroutines.sync.b r6 = (kotlinx.coroutines.sync.C15536b) r6
                java.lang.Object r1 = r0.L$1
                qa.l r1 = (p370qa.C16265l) r1
                java.lang.Object r0 = r0.L$0
                androidx.paging.PageFetcherSnapshotState$Holder r0 = (androidx.paging.PageFetcherSnapshotState.Holder) r0
                p297ja.C13332o.m85685b(r7)
                r7 = r6
                r6 = r1
                goto L_0x0057
            L_0x0038:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0040:
                p297ja.C13332o.m85685b(r7)
                kotlinx.coroutines.sync.b r7 = r5.lock
                r0.L$0 = r5
                r0.L$1 = r6
                r0.L$2 = r7
                r0.label = r4
                java.lang.Object r0 = r7.mo74906a(r3, r0)
                if (r0 != r1) goto L_0x0056
                return r1
            L_0x0056:
                r0 = r5
            L_0x0057:
                androidx.paging.PageFetcherSnapshotState r0 = r0.state     // Catch:{ all -> 0x0069 }
                java.lang.Object r6 = r6.invoke(r0)     // Catch:{ all -> 0x0069 }
                kotlin.jvm.internal.C13705n.m87922b(r4)
                r7.mo74907b(r3)
                kotlin.jvm.internal.C13705n.m87921a(r4)
                return r6
            L_0x0069:
                r6 = move-exception
                kotlin.jvm.internal.C13705n.m87922b(r4)
                r7.mo74907b(r3)
                kotlin.jvm.internal.C13705n.m87921a(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshotState.Holder.withLock(qa.l, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PageFetcherSnapshotState.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.REFRESH.ordinal()] = 1;
            iArr[LoadType.PREPEND.ordinal()] = 2;
            iArr[LoadType.APPEND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PageFetcherSnapshotState(PagingConfig pagingConfig) {
        this.config = pagingConfig;
        ArrayList arrayList = new ArrayList();
        this._pages = arrayList;
        this.pages = arrayList;
        this.prependGenerationIdCh = C15225i.m93852d(-1, (C15220e) null, (C16265l) null, 6, (Object) null);
        this.appendGenerationIdCh = C15225i.m93852d(-1, (C15220e) null, (C16265l) null, 6, (Object) null);
        this.failedHintsByLoadType = new LinkedHashMap();
        MutableLoadStateCollection mutableLoadStateCollection = new MutableLoadStateCollection();
        mutableLoadStateCollection.set(LoadType.REFRESH, LoadState.Loading.INSTANCE);
        C13339u uVar = C13339u.f61331a;
        this.sourceLoadStates = mutableLoadStateCollection;
    }

    public /* synthetic */ PageFetcherSnapshotState(PagingConfig pagingConfig, C13695i iVar) {
        this(pagingConfig);
    }

    public final C15285f<Integer> consumeAppendGenerationIdAsFlow() {
        return C15290h.m94139y(C15290h.m94124j(this.appendGenerationIdCh), new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this, (C13635d<? super PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1>) null));
    }

    public final C15285f<Integer> consumePrependGenerationIdAsFlow() {
        return C15290h.m94139y(C15290h.m94124j(this.prependGenerationIdCh), new PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1(this, (C13635d<? super PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1>) null));
    }

    public final PagingState<Key, Value> currentPagingState$paging_common(ViewportHint.Access access) {
        Integer num;
        int i;
        List F0 = C13566b0.m87402F0(this.pages);
        if (access == null) {
            num = null;
        } else {
            int placeholdersBefore$paging_common = getPlaceholdersBefore$paging_common();
            int i2 = -getInitialPageIndex$paging_common();
            int l = C13614t.m87750l(getPages$paging_common()) - getInitialPageIndex$paging_common();
            int pageOffset = access.getPageOffset();
            if (i2 < pageOffset) {
                int i3 = i2;
                while (true) {
                    int i4 = i3 + 1;
                    if (i3 > l) {
                        i = this.config.pageSize;
                    } else {
                        i = ((PagingSource.LoadResult.Page) getPages$paging_common().get(i3 + getInitialPageIndex$paging_common())).getData().size();
                    }
                    placeholdersBefore$paging_common += i;
                    if (i4 >= pageOffset) {
                        break;
                    }
                    i3 = i4;
                }
            }
            int indexInPage = placeholdersBefore$paging_common + access.getIndexInPage();
            if (access.getPageOffset() < i2) {
                indexInPage -= this.config.pageSize;
            }
            num = Integer.valueOf(indexInPage);
        }
        return new PagingState<>(F0, num, this.config, getPlaceholdersBefore$paging_common());
    }

    public final void drop(PageEvent.Drop<Value> drop) {
        C13706o.m87929f(drop, NotificationCompat.CATEGORY_EVENT);
        if (drop.getPageCount() <= this.pages.size()) {
            this.failedHintsByLoadType.remove(drop.getLoadType());
            this.sourceLoadStates.set(drop.getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common());
            int i = WhenMappings.$EnumSwitchMapping$0[drop.getLoadType().ordinal()];
            if (i == 2) {
                int pageCount = drop.getPageCount();
                for (int i2 = 0; i2 < pageCount; i2++) {
                    this._pages.remove(0);
                }
                this.initialPageIndex -= drop.getPageCount();
                setPlaceholdersBefore$paging_common(drop.getPlaceholdersRemaining());
                int i3 = this.prependGenerationId + 1;
                this.prependGenerationId = i3;
                this.prependGenerationIdCh.m101371trySendJP2dKIU(Integer.valueOf(i3));
            } else if (i == 3) {
                int pageCount2 = drop.getPageCount();
                for (int i4 = 0; i4 < pageCount2; i4++) {
                    this._pages.remove(getPages$paging_common().size() - 1);
                }
                setPlaceholdersAfter$paging_common(drop.getPlaceholdersRemaining());
                int i5 = this.appendGenerationId + 1;
                this.appendGenerationId = i5;
                this.appendGenerationIdCh.m101371trySendJP2dKIU(Integer.valueOf(i5));
            } else {
                throw new IllegalArgumentException(C13706o.m87936m("cannot drop ", drop.getLoadType()));
            }
        } else {
            throw new IllegalStateException(("invalid drop count. have " + getPages$paging_common().size() + " but wanted to drop " + drop.getPageCount()).toString());
        }
    }

    public final PageEvent.Drop<Value> dropEventOrNull(LoadType loadType, ViewportHint viewportHint) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(viewportHint, "hint");
        PageEvent.Drop<Value> drop = null;
        if (this.config.maxSize == Integer.MAX_VALUE || this.pages.size() <= 2 || getStorageCount$paging_common() <= this.config.maxSize) {
            return null;
        }
        int i6 = 0;
        if (loadType != LoadType.REFRESH) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < this.pages.size() && getStorageCount$paging_common() - i8 > this.config.maxSize) {
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                if (iArr[loadType.ordinal()] == 2) {
                    i4 = this.pages.get(i7).getData().size();
                } else {
                    List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
                    i4 = list.get(C13614t.m87750l(list) - i7).getData().size();
                }
                if (iArr[loadType.ordinal()] == 2) {
                    i5 = viewportHint.getPresentedItemsBefore();
                } else {
                    i5 = viewportHint.getPresentedItemsAfter();
                }
                if ((i5 - i8) - i4 < this.config.prefetchDistance) {
                    break;
                }
                i8 += i4;
                i7++;
            }
            if (i7 != 0) {
                int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                if (iArr2[loadType.ordinal()] == 2) {
                    i = -this.initialPageIndex;
                } else {
                    i = (C13614t.m87750l(this.pages) - this.initialPageIndex) - (i7 - 1);
                }
                if (iArr2[loadType.ordinal()] == 2) {
                    i2 = (i7 - 1) - this.initialPageIndex;
                } else {
                    i2 = C13614t.m87750l(this.pages) - this.initialPageIndex;
                }
                if (this.config.enablePlaceholders) {
                    if (loadType == LoadType.PREPEND) {
                        i3 = getPlaceholdersBefore$paging_common();
                    } else {
                        i3 = getPlaceholdersAfter$paging_common();
                    }
                    i6 = i3 + i8;
                }
                drop = new PageEvent.Drop<>(loadType, i, i2, i6);
            }
            return drop;
        }
        throw new IllegalArgumentException(C13706o.m87936m("Drop LoadType must be PREPEND or APPEND, but got ", loadType).toString());
    }

    public final int generationId$paging_common(LoadType loadType) {
        C13706o.m87929f(loadType, "loadType");
        int i = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        } else if (i == 2) {
            return this.prependGenerationId;
        } else {
            if (i == 3) {
                return this.appendGenerationId;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final Map<LoadType, ViewportHint> getFailedHintsByLoadType$paging_common() {
        return this.failedHintsByLoadType;
    }

    public final int getInitialPageIndex$paging_common() {
        return this.initialPageIndex;
    }

    public final List<PagingSource.LoadResult.Page<Key, Value>> getPages$paging_common() {
        return this.pages;
    }

    public final int getPlaceholdersAfter$paging_common() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersAfter;
        }
        return 0;
    }

    public final int getPlaceholdersBefore$paging_common() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersBefore;
        }
        return 0;
    }

    public final MutableLoadStateCollection getSourceLoadStates$paging_common() {
        return this.sourceLoadStates;
    }

    public final int getStorageCount$paging_common() {
        int i = 0;
        for (PagingSource.LoadResult.Page data : this.pages) {
            i += data.getData().size();
        }
        return i;
    }

    @CheckResult
    public final boolean insert(int i, LoadType loadType, PagingSource.LoadResult.Page<Key, Value> page) {
        int i2;
        int i3;
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(page, "page");
        int i4 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    if (!(!this.pages.isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    } else if (i != this.appendGenerationId) {
                        return false;
                    } else {
                        this._pages.add(page);
                        if (page.getItemsAfter() == Integer.MIN_VALUE) {
                            i3 = C16792h.m99540b(getPlaceholdersAfter$paging_common() - page.getData().size(), 0);
                        } else {
                            i3 = page.getItemsAfter();
                        }
                        setPlaceholdersAfter$paging_common(i3);
                        this.failedHintsByLoadType.remove(LoadType.APPEND);
                    }
                }
            } else if (!(!this.pages.isEmpty())) {
                throw new IllegalStateException("should've received an init before prepend".toString());
            } else if (i != this.prependGenerationId) {
                return false;
            } else {
                this._pages.add(0, page);
                this.initialPageIndex++;
                if (page.getItemsBefore() == Integer.MIN_VALUE) {
                    i2 = C16792h.m99540b(getPlaceholdersBefore$paging_common() - page.getData().size(), 0);
                } else {
                    i2 = page.getItemsBefore();
                }
                setPlaceholdersBefore$paging_common(i2);
                this.failedHintsByLoadType.remove(LoadType.PREPEND);
            }
        } else if (this.pages.isEmpty()) {
            if (i == 0) {
                this._pages.add(page);
                this.initialPageIndex = 0;
                setPlaceholdersAfter$paging_common(page.getItemsAfter());
                setPlaceholdersBefore$paging_common(page.getItemsBefore());
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
        } else {
            throw new IllegalStateException("cannot receive multiple init calls".toString());
        }
        return true;
    }

    public final void setPlaceholdersAfter$paging_common(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this._placeholdersAfter = i;
    }

    public final void setPlaceholdersBefore$paging_common(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this._placeholdersBefore = i;
    }

    public final PageEvent<Value> toPageEvent$paging_common(PagingSource.LoadResult.Page<Key, Value> page, LoadType loadType) {
        C13706o.m87929f(page, "<this>");
        C13706o.m87929f(loadType, "loadType");
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[loadType.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                i2 = 0 - this.initialPageIndex;
            } else if (i == 3) {
                i2 = (this.pages.size() - this.initialPageIndex) - 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        List e = C13612s.m87736e(new TransformablePage(i2, page.getData()));
        int i3 = iArr[loadType.ordinal()];
        if (i3 == 1) {
            return PageEvent.Insert.Companion.Refresh(e, getPlaceholdersBefore$paging_common(), getPlaceholdersAfter$paging_common(), this.sourceLoadStates.snapshot(), (LoadStates) null);
        }
        if (i3 == 2) {
            return PageEvent.Insert.Companion.Prepend(e, getPlaceholdersBefore$paging_common(), this.sourceLoadStates.snapshot(), (LoadStates) null);
        }
        if (i3 == 3) {
            return PageEvent.Insert.Companion.Append(e, getPlaceholdersAfter$paging_common(), this.sourceLoadStates.snapshot(), (LoadStates) null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
