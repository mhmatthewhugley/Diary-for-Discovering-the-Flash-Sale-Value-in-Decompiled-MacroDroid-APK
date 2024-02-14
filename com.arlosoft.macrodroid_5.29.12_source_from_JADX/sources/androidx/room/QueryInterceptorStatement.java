package androidx.room;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.p010db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> mBindArgsCache = new ArrayList();
    private final SupportSQLiteStatement mDelegate;
    private final RoomDatabase.QueryCallback mQueryCallback;
    private final Executor mQueryCallbackExecutor;
    private final String mSqlStatement;

    QueryInterceptorStatement(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull RoomDatabase.QueryCallback queryCallback, String str, @NonNull Executor executor) {
        this.mDelegate = supportSQLiteStatement;
        this.mQueryCallback = queryCallback;
        this.mSqlStatement = str;
        this.mQueryCallbackExecutor = executor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$executeInsert$2() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$executeUpdateDelete$1() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$simpleQueryForLong$3() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$simpleQueryForString$4() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    private void saveArgsToCache(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.mBindArgsCache.size()) {
            for (int size = this.mBindArgsCache.size(); size <= i2; size++) {
                this.mBindArgsCache.add((Object) null);
            }
        }
        this.mBindArgsCache.set(i2, obj);
    }

    public void bindBlob(int i, byte[] bArr) {
        saveArgsToCache(i, bArr);
        this.mDelegate.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
        this.mDelegate.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
        this.mDelegate.bindLong(i, j);
    }

    public void bindNull(int i) {
        saveArgsToCache(i, this.mBindArgsCache.toArray());
        this.mDelegate.bindNull(i);
    }

    public void bindString(int i, String str) {
        saveArgsToCache(i, str);
        this.mDelegate.bindString(i, str);
    }

    public void clearBindings() {
        this.mBindArgsCache.clear();
        this.mDelegate.clearBindings();
    }

    public void close() throws IOException {
        this.mDelegate.close();
    }

    public void execute() {
        this.mQueryCallbackExecutor.execute(new C1143t0(this));
        this.mDelegate.execute();
    }

    public long executeInsert() {
        this.mQueryCallbackExecutor.execute(new C1145u0(this));
        return this.mDelegate.executeInsert();
    }

    public int executeUpdateDelete() {
        this.mQueryCallbackExecutor.execute(new C1147v0(this));
        return this.mDelegate.executeUpdateDelete();
    }

    public long simpleQueryForLong() {
        this.mQueryCallbackExecutor.execute(new C1149w0(this));
        return this.mDelegate.simpleQueryForLong();
    }

    public String simpleQueryForString() {
        this.mQueryCallbackExecutor.execute(new C1141s0(this));
        return this.mDelegate.simpleQueryForString();
    }
}
