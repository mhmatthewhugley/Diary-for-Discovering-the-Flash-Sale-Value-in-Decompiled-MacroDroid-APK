package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13697j;
import kotlin.jvm.internal.C13704m;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15415h0;
import org.apache.commons.p353io.FilenameUtils;
import p297ja.C13316c;
import p297ja.C13339u;
import p370qa.C16254a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \"*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\"B#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b \u0010!J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0007J-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, mo71668d2 = {"Landroidx/paging/LegacyPagingSource;", "", "Key", "Value", "Landroidx/paging/PagingSource;", "Landroidx/paging/PagingSource$LoadParams;", "params", "", "guessPageSize", "pageSize", "Lja/u;", "setPageSize", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Object;", "Lkotlinx/coroutines/h0;", "fetchDispatcher", "Lkotlinx/coroutines/h0;", "Landroidx/paging/DataSource;", "dataSource", "Landroidx/paging/DataSource;", "getDataSource$paging_common", "()Landroidx/paging/DataSource;", "I", "", "getJumpingSupported", "()Z", "jumpingSupported", "<init>", "(Lkotlinx/coroutines/h0;Landroidx/paging/DataSource;)V", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: LegacyPagingSource.kt */
public final class LegacyPagingSource<Key, Value> extends PagingSource<Key, Value> {
    private static final Companion Companion = new Companion((C13695i) null);
    @Deprecated
    private static final int PAGE_SIZE_NOT_SET = Integer.MIN_VALUE;
    private final DataSource<Key, Value> dataSource;
    private final C15415h0 fetchDispatcher;
    private int pageSize = Integer.MIN_VALUE;

    @Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo71668d2 = {"Landroidx/paging/LegacyPagingSource$Companion;", "", "()V", "PAGE_SIZE_NOT_SET", "", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: LegacyPagingSource.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: LegacyPagingSource.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataSource.KeyType.values().length];
            iArr[DataSource.KeyType.POSITIONAL.ordinal()] = 1;
            iArr[DataSource.KeyType.PAGE_KEYED.ordinal()] = 2;
            iArr[DataSource.KeyType.ITEM_KEYED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LegacyPagingSource(C15415h0 h0Var, DataSource<Key, Value> dataSource2) {
        C13706o.m87929f(h0Var, "fetchDispatcher");
        C13706o.m87929f(dataSource2, "dataSource");
        this.fetchDispatcher = h0Var;
        this.dataSource = dataSource2;
        dataSource2.addInvalidatedCallback(new Object(this) {
            final /* synthetic */ LegacyPagingSource<Key, Value> $tmp0;

            {
                this.$tmp0 = r1;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof DataSource.InvalidatedCallback) || !(obj instanceof C13697j)) {
                    return false;
                }
                return C13706o.m87924a(getFunctionDelegate(), ((C13697j) obj).getFunctionDelegate());
            }

            public final C13316c<?> getFunctionDelegate() {
                return new C13704m(0, this.$tmp0, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final void onInvalidated() {
                this.$tmp0.invalidate();
            }
        });
        registerInvalidatedCallback(new C16254a<C13339u>(this) {
            final /* synthetic */ LegacyPagingSource<Key, Value> this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                DataSource<Key, Value> dataSource$paging_common = this.this$0.getDataSource$paging_common();
                final LegacyPagingSource<Key, Value> legacyPagingSource = this.this$0;
                dataSource$paging_common.removeInvalidatedCallback(new Object() {
                    public final boolean equals(Object obj) {
                        if (!(obj instanceof DataSource.InvalidatedCallback) || !(obj instanceof C13697j)) {
                            return false;
                        }
                        return C13706o.m87924a(getFunctionDelegate(), ((C13697j) obj).getFunctionDelegate());
                    }

                    public final C13316c<?> getFunctionDelegate() {
                        return new C13704m(0, legacyPagingSource, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }

                    public final void onInvalidated() {
                        legacyPagingSource.invalidate();
                    }
                });
                this.this$0.getDataSource$paging_common().invalidate();
            }
        });
    }

    private final int guessPageSize(PagingSource.LoadParams<Key> loadParams) {
        if (!(loadParams instanceof PagingSource.LoadParams.Refresh) || loadParams.getLoadSize() % 3 != 0) {
            return loadParams.getLoadSize();
        }
        return loadParams.getLoadSize() / 3;
    }

    public final DataSource<Key, Value> getDataSource$paging_common() {
        return this.dataSource;
    }

    public boolean getJumpingSupported() {
        return this.dataSource.getType$paging_common() == DataSource.KeyType.POSITIONAL;
    }

    public Key getRefreshKey(PagingState<Key, Value> pagingState) {
        int i;
        Value closestItemToPosition;
        C13706o.m87929f(pagingState, "state");
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.dataSource.getType$paging_common().ordinal()];
        if (i2 == 1) {
            Integer anchorPosition = pagingState.getAnchorPosition();
            if (anchorPosition == null) {
                return null;
            }
            int intValue = anchorPosition.intValue();
            int access$getLeadingPlaceholderCount$p = intValue - pagingState.leadingPlaceholderCount;
            int i3 = 0;
            while (i3 < C13614t.m87750l(pagingState.getPages()) && access$getLeadingPlaceholderCount$p > C13614t.m87750l(pagingState.getPages().get(i3).getData())) {
                access$getLeadingPlaceholderCount$p -= pagingState.getPages().get(i3).getData().size();
                i3++;
            }
            PagingSource.LoadResult.Page<Key, Value> closestPageToPosition = pagingState.closestPageToPosition(intValue);
            if (closestPageToPosition == null || (i = closestPageToPosition.getPrevKey()) == null) {
                i = 0;
            }
            return Integer.valueOf(((Integer) i).intValue() + access$getLeadingPlaceholderCount$p);
        } else if (i2 == 2) {
            return null;
        } else {
            if (i2 == 3) {
                Integer anchorPosition2 = pagingState.getAnchorPosition();
                if (anchorPosition2 == null || (closestItemToPosition = pagingState.closestItemToPosition(anchorPosition2.intValue())) == null) {
                    return null;
                }
                return getDataSource$paging_common().getKeyInternal$paging_common(closestItemToPosition);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public Object load(PagingSource.LoadParams<Key> loadParams, C13635d<? super PagingSource.LoadResult<Key, Value>> dVar) {
        LoadType loadType;
        if (loadParams instanceof PagingSource.LoadParams.Refresh) {
            loadType = LoadType.REFRESH;
        } else if (loadParams instanceof PagingSource.LoadParams.Append) {
            loadType = LoadType.APPEND;
        } else if (loadParams instanceof PagingSource.LoadParams.Prepend) {
            loadType = LoadType.PREPEND;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        LoadType loadType2 = loadType;
        if (this.pageSize == Integer.MIN_VALUE) {
            System.out.println("WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.pageSize = guessPageSize(loadParams);
        }
        return C15414h.m94298g(this.fetchDispatcher, new LegacyPagingSource$load$2(this, new DataSource.Params(loadType2, loadParams.getKey(), loadParams.getLoadSize(), loadParams.getPlaceholdersEnabled(), this.pageSize), loadParams, (C13635d<? super LegacyPagingSource$load$2>) null), dVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setPageSize(int i) {
        int i2 = this.pageSize;
        if (i2 == Integer.MIN_VALUE || i == i2) {
            this.pageSize = i;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.pageSize + FilenameUtils.EXTENSION_SEPARATOR).toString());
    }
}
