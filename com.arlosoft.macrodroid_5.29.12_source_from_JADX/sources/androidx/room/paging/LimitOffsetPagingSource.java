package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.CoroutinesRoomKt;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15414h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001*\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020504\"\u000205¢\u0006\u0004\b7\u00108B-\b\u0016\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010$\u001a\u00020#\u0012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020504\"\u000205¢\u0006\u0004\b7\u0010;J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\n\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\r\u001a\u00020\u0004H\u0002J&\u0010\u000f\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J7\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J-\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\tJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H%J%\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020&8\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, mo71668d2 = {"Landroidx/room/paging/LimitOffsetPagingSource;", "", "Value", "Landroidx/paging/PagingSource;", "", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "initialLoad", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "itemCount", "loadFromDb", "(Landroidx/paging/PagingSource$LoadParams;ILkotlin/coroutines/d;)Ljava/lang/Object;", "key", "getLimit", "getOffset", "offset", "limit", "queryDatabase", "(IIILkotlin/coroutines/d;)Ljava/lang/Object;", "queryItemCount", "Lja/u;", "registerObserverIfNecessary", "load", "Landroid/database/Cursor;", "cursor", "", "convertRows", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "Landroidx/room/RoomSQLiteQuery;", "sourceQuery", "Landroidx/room/RoomSQLiteQuery;", "Landroidx/room/RoomDatabase;", "db", "Landroidx/room/RoomDatabase;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getItemCount$room_paging_release", "()Ljava/util/concurrent/atomic/AtomicInteger;", "androidx/room/paging/LimitOffsetPagingSource$observer$1", "observer", "Landroidx/room/paging/LimitOffsetPagingSource$observer$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "registeredObserver", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "getJumpingSupported", "()Z", "jumpingSupported", "", "", "tables", "<init>", "(Landroidx/room/RoomSQLiteQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "Landroidx/sqlite/db/SupportSQLiteQuery;", "supportSQLiteQuery", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "room-paging_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* compiled from: LimitOffsetPagingSource.kt */
public abstract class LimitOffsetPagingSource<Value> extends PagingSource<Integer, Value> {
    /* access modifiers changed from: private */

    /* renamed from: db */
    public final RoomDatabase f666db;
    private final AtomicInteger itemCount;
    private final LimitOffsetPagingSource$observer$1 observer;
    private final AtomicBoolean registeredObserver;
    private final RoomSQLiteQuery sourceQuery;

    public LimitOffsetPagingSource(RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase, String... strArr) {
        C13706o.m87929f(roomSQLiteQuery, "sourceQuery");
        C13706o.m87929f(roomDatabase, "db");
        C13706o.m87929f(strArr, "tables");
        this.sourceQuery = roomSQLiteQuery;
        this.f666db = roomDatabase;
        this.itemCount = new AtomicInteger(-1);
        this.observer = new LimitOffsetPagingSource$observer$1(strArr, this);
        this.registeredObserver = new AtomicBoolean(false);
    }

    private final int getLimit(PagingSource.LoadParams<Integer> loadParams, int i) {
        if (!(loadParams instanceof PagingSource.LoadParams.Prepend)) {
            return loadParams.getLoadSize();
        }
        if (i < loadParams.getLoadSize()) {
            return i;
        }
        return loadParams.getLoadSize();
    }

    private final int getOffset(PagingSource.LoadParams<Integer> loadParams, int i, int i2) {
        if (loadParams instanceof PagingSource.LoadParams.Prepend) {
            if (i < loadParams.getLoadSize()) {
                return 0;
            }
            return i - loadParams.getLoadSize();
        } else if (loadParams instanceof PagingSource.LoadParams.Append) {
            return i;
        } else {
            if (loadParams instanceof PagingSource.LoadParams.Refresh) {
                return i >= i2 ? Math.max(0, i2 - loadParams.getLoadSize()) : i;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    public final Object initialLoad(PagingSource.LoadParams<Integer> loadParams, C13635d<? super PagingSource.LoadResult<Integer, Value>> dVar) {
        return RoomDatabaseKt.withTransaction(this.f666db, new LimitOffsetPagingSource$initialLoad$2(this, loadParams, (C13635d<? super LimitOffsetPagingSource$initialLoad$2>) null), dVar);
    }

    /* access modifiers changed from: private */
    public final Object loadFromDb(PagingSource.LoadParams<Integer> loadParams, int i, C13635d<? super PagingSource.LoadResult<Integer, Value>> dVar) {
        Integer key = loadParams.getKey();
        int intValue = key != null ? key.intValue() : 0;
        return queryDatabase(getOffset(loadParams, intValue, i), getLimit(loadParams, intValue), i, dVar);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public final Object queryDatabase(int i, int i2, int i3, C13635d<? super PagingSource.LoadResult<Integer, Value>> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM ( " + this.sourceQuery.getSql() + " ) LIMIT " + i2 + " OFFSET " + i, this.sourceQuery.getArgCount());
        C13706o.m87928e(acquire, "acquire(\n            lim…eQuery.argCount\n        )");
        acquire.copyArgumentsFrom(this.sourceQuery);
        Cursor query = this.f666db.query(acquire);
        C13706o.m87928e(query, "db.query(sqLiteQuery)");
        try {
            List convertRows = convertRows(query);
            query.close();
            acquire.release();
            int size = convertRows.size() + i;
            return new PagingSource.LoadResult.Page(convertRows, (i <= 0 || convertRows.isEmpty()) ? null : C13654b.m87834b(i), (convertRows.isEmpty() || convertRows.size() < i2 || size >= i3) ? null : C13654b.m87834b(size), i, Math.max(0, i3 - size));
        } catch (Throwable th) {
            query.close();
            acquire.release();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public final int queryItemCount() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM ( " + this.sourceQuery.getSql() + " )", this.sourceQuery.getArgCount());
        C13706o.m87928e(acquire, "acquire(\n            cou…eQuery.argCount\n        )");
        acquire.copyArgumentsFrom(this.sourceQuery);
        Cursor query = this.f666db.query(acquire);
        C13706o.m87928e(query, "db.query(sqLiteQuery)");
        try {
            if (query.moveToFirst()) {
                return query.getInt(0);
            }
            query.close();
            acquire.release();
            return 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    /* access modifiers changed from: private */
    public final void registerObserverIfNecessary() {
        if (this.registeredObserver.compareAndSet(false, true)) {
            this.f666db.getInvalidationTracker().addWeakObserver(this.observer);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract List<Value> convertRows(Cursor cursor);

    public final AtomicInteger getItemCount$room_paging_release() {
        return this.itemCount;
    }

    public boolean getJumpingSupported() {
        return true;
    }

    public Object load(PagingSource.LoadParams<Integer> loadParams, C13635d<? super PagingSource.LoadResult<Integer, Value>> dVar) {
        return C15414h.m94298g(CoroutinesRoomKt.getQueryDispatcher(this.f666db), new LimitOffsetPagingSource$load$2(this, loadParams, (C13635d<? super LimitOffsetPagingSource$load$2>) null), dVar);
    }

    public Integer getRefreshKey(PagingState<Integer, Value> pagingState) {
        C13706o.m87929f(pagingState, "state");
        int i = pagingState.getConfig().initialLoadSize;
        if (pagingState.getAnchorPosition() == null) {
            return null;
        }
        Integer anchorPosition = pagingState.getAnchorPosition();
        C13706o.m87926c(anchorPosition);
        return Integer.valueOf(Math.max(0, anchorPosition.intValue() - (i / 2)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LimitOffsetPagingSource(androidx.sqlite.p010db.SupportSQLiteQuery r2, androidx.room.RoomDatabase r3, java.lang.String... r4) {
        /*
            r1 = this;
            java.lang.String r0 = "supportSQLiteQuery"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            java.lang.String r0 = "db"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            java.lang.String r0 = "tables"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            androidx.room.RoomSQLiteQuery r2 = androidx.room.RoomSQLiteQuery.copyFrom(r2)
            java.lang.String r0 = "copyFrom(supportSQLiteQuery)"
            kotlin.jvm.internal.C13706o.m87928e(r2, r0)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r1.<init>((androidx.room.RoomSQLiteQuery) r2, (androidx.room.RoomDatabase) r3, (java.lang.String[]) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.LimitOffsetPagingSource.<init>(androidx.sqlite.db.SupportSQLiteQuery, androidx.room.RoomDatabase, java.lang.String[]):void");
    }
}
