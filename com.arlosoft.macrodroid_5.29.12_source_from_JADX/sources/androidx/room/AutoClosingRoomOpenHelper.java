package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.room.util.SneakyThrow;
import androidx.sqlite.p010db.C1169a;
import androidx.sqlite.p010db.SupportSQLiteCompat;
import androidx.sqlite.p010db.SupportSQLiteDatabase;
import androidx.sqlite.p010db.SupportSQLiteOpenHelper;
import androidx.sqlite.p010db.SupportSQLiteQuery;
import androidx.sqlite.p010db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    @NonNull
    private final AutoCloser mAutoCloser;
    @NonNull
    private final AutoClosingSupportSQLiteDatabase mAutoClosingDb;
    @NonNull
    private final SupportSQLiteOpenHelper mDelegateOpenHelper;

    static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        @NonNull
        private final AutoCloser mAutoCloser;

        AutoClosingSupportSQLiteDatabase(@NonNull AutoCloser autoCloser) {
            this.mAutoCloser = autoCloser;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ Object lambda$pokeOpen$0(SupportSQLiteDatabase supportSQLiteDatabase) {
            return null;
        }

        public void beginTransaction() {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        public void beginTransactionNonExclusive() {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
            } catch (Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        public void close() throws IOException {
            this.mAutoCloser.closeDatabaseIfOpen();
        }

        public SupportSQLiteStatement compileStatement(String str) {
            return new AutoClosingSupportSqliteStatement(str, this.mAutoCloser);
        }

        public int delete(String str, String str2, Object[] objArr) {
            return ((Integer) this.mAutoCloser.executeRefCountingFunction(new C1150x(str, str2, objArr))).intValue();
        }

        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        public void endTransaction() {
            if (this.mAutoCloser.getDelegateDatabase() != null) {
                try {
                    this.mAutoCloser.getDelegateDatabase().endTransaction();
                } finally {
                    this.mAutoCloser.decrementCountAndScheduleClose();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        public /* synthetic */ void execPerConnectionSQL(String str, Object[] objArr) {
            C1169a.m591a(this, str, objArr);
        }

        public void execSQL(String str) throws SQLException {
            this.mAutoCloser.executeRefCountingFunction(new C1144u(str));
        }

        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.mAutoCloser.executeRefCountingFunction(C1111f.f636a);
        }

        public long getMaximumSize() {
            return ((Long) this.mAutoCloser.executeRefCountingFunction(C1131o.f658a)).longValue();
        }

        public long getPageSize() {
            return ((Long) this.mAutoCloser.executeRefCountingFunction(C1133p.f662a)).longValue();
        }

        public String getPath() {
            return (String) this.mAutoCloser.executeRefCountingFunction(C1113g.f638a);
        }

        public int getVersion() {
            return ((Integer) this.mAutoCloser.executeRefCountingFunction(C1115h.f640a)).intValue();
        }

        public boolean inTransaction() {
            if (this.mAutoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(C1117i.f644a)).booleanValue();
        }

        public long insert(String str, int i, ContentValues contentValues) throws SQLException {
            return ((Long) this.mAutoCloser.executeRefCountingFunction(new C1146v(str, i, contentValues))).longValue();
        }

        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(C1119j.f648a)).booleanValue();
        }

        public boolean isDbLockedByCurrentThread() {
            if (this.mAutoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(C1121k.f650a)).booleanValue();
        }

        public /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            return C1169a.m592b(this);
        }

        public boolean isOpen() {
            SupportSQLiteDatabase delegateDatabase = this.mAutoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        public boolean isReadOnly() {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(C1126m.f654a)).booleanValue();
        }

        @RequiresApi(api = 16)
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(C1107d.f632a)).booleanValue();
        }

        public boolean needUpgrade(int i) {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(new C1101a(i))).booleanValue();
        }

        /* access modifiers changed from: package-private */
        public void pokeOpen() {
            this.mAutoCloser.executeRefCountingFunction(C1109e.f634a);
        }

        public Cursor query(String str) {
            try {
                return new KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(str), this.mAutoCloser);
            } catch (Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @RequiresApi(api = 16)
        public void setForeignKeyConstraintsEnabled(boolean z) {
            this.mAutoCloser.executeRefCountingFunction(new C1105c(z));
        }

        public void setLocale(Locale locale) {
            this.mAutoCloser.executeRefCountingFunction(new C1103b(locale));
        }

        public void setMaxSqlCacheSize(int i) {
            this.mAutoCloser.executeRefCountingFunction(new C1124l(i));
        }

        public long setMaximumSize(long j) {
            return ((Long) this.mAutoCloser.executeRefCountingFunction(new C1142t(j))).longValue();
        }

        public void setPageSize(long j) {
            this.mAutoCloser.executeRefCountingFunction(new C1140s(j));
        }

        public void setTransactionSuccessful() {
            SupportSQLiteDatabase delegateDatabase = this.mAutoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                delegateDatabase.setTransactionSuccessful();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        public void setVersion(int i) {
            this.mAutoCloser.executeRefCountingFunction(new C1137q(i));
        }

        public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
            return ((Integer) this.mAutoCloser.executeRefCountingFunction(new C1148w(str, i, contentValues, str2, objArr))).intValue();
        }

        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(C1129n.f656a)).booleanValue();
        }

        public void execSQL(String str, Object[] objArr) throws SQLException {
            this.mAutoCloser.executeRefCountingFunction(new C1152y(str, objArr));
        }

        public boolean yieldIfContendedSafely(long j) {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(C1129n.f656a)).booleanValue();
        }

        public Cursor query(String str, Object[] objArr) {
            try {
                return new KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(str, objArr), this.mAutoCloser);
            } catch (Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        public Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
            try {
                return new KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(supportSQLiteQuery), this.mAutoCloser);
            } catch (Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @RequiresApi(api = 24)
        public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
            try {
                return new KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(supportSQLiteQuery, cancellationSignal), this.mAutoCloser);
            } catch (Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }
    }

    private static class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {
        private final AutoCloser mAutoCloser;
        private final ArrayList<Object> mBinds = new ArrayList<>();
        private final String mSql;

        AutoClosingSupportSqliteStatement(String str, AutoCloser autoCloser) {
            this.mSql = str;
            this.mAutoCloser = autoCloser;
        }

        private void doBinds(SupportSQLiteStatement supportSQLiteStatement) {
            int i = 0;
            while (i < this.mBinds.size()) {
                int i2 = i + 1;
                Object obj = this.mBinds.get(i);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i2);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.bindLong(i2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.bindDouble(i2, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        private <T> T executeSqliteStatementWithRefCount(Function<SupportSQLiteStatement, T> function) {
            return this.mAutoCloser.executeRefCountingFunction(new C1154z(this, function));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object lambda$executeSqliteStatementWithRefCount$0(Function function, SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteStatement compileStatement = supportSQLiteDatabase.compileStatement(this.mSql);
            doBinds(compileStatement);
            return function.apply(compileStatement);
        }

        private void saveBinds(int i, Object obj) {
            int i2 = i - 1;
            if (i2 >= this.mBinds.size()) {
                for (int size = this.mBinds.size(); size <= i2; size++) {
                    this.mBinds.add((Object) null);
                }
            }
            this.mBinds.set(i2, obj);
        }

        public void bindBlob(int i, byte[] bArr) {
            saveBinds(i, bArr);
        }

        public void bindDouble(int i, double d) {
            saveBinds(i, Double.valueOf(d));
        }

        public void bindLong(int i, long j) {
            saveBinds(i, Long.valueOf(j));
        }

        public void bindNull(int i) {
            saveBinds(i, (Object) null);
        }

        public void bindString(int i, String str) {
            saveBinds(i, str);
        }

        public void clearBindings() {
            this.mBinds.clear();
        }

        public void close() throws IOException {
        }

        public void execute() {
            executeSqliteStatementWithRefCount(C1102a0.f627a);
        }

        public long executeInsert() {
            return ((Long) executeSqliteStatementWithRefCount(C1108d0.f633a)).longValue();
        }

        public int executeUpdateDelete() {
            return ((Integer) executeSqliteStatementWithRefCount(C1104b0.f629a)).intValue();
        }

        public long simpleQueryForLong() {
            return ((Long) executeSqliteStatementWithRefCount(C1110e0.f635a)).longValue();
        }

        public String simpleQueryForString() {
            return (String) executeSqliteStatementWithRefCount(C1106c0.f631a);
        }
    }

    private static final class KeepAliveCursor implements Cursor {
        private final AutoCloser mAutoCloser;
        private final Cursor mDelegate;

        KeepAliveCursor(Cursor cursor, AutoCloser autoCloser) {
            this.mDelegate = cursor;
            this.mAutoCloser = autoCloser;
        }

        public void close() {
            this.mDelegate.close();
            this.mAutoCloser.decrementCountAndScheduleClose();
        }

        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.mDelegate.copyStringToBuffer(i, charArrayBuffer);
        }

        @Deprecated
        public void deactivate() {
            this.mDelegate.deactivate();
        }

        public byte[] getBlob(int i) {
            return this.mDelegate.getBlob(i);
        }

        public int getColumnCount() {
            return this.mDelegate.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.mDelegate.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.mDelegate.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i) {
            return this.mDelegate.getColumnName(i);
        }

        public String[] getColumnNames() {
            return this.mDelegate.getColumnNames();
        }

        public int getCount() {
            return this.mDelegate.getCount();
        }

        public double getDouble(int i) {
            return this.mDelegate.getDouble(i);
        }

        public Bundle getExtras() {
            return this.mDelegate.getExtras();
        }

        public float getFloat(int i) {
            return this.mDelegate.getFloat(i);
        }

        public int getInt(int i) {
            return this.mDelegate.getInt(i);
        }

        public long getLong(int i) {
            return this.mDelegate.getLong(i);
        }

        @RequiresApi(api = 19)
        public Uri getNotificationUri() {
            return SupportSQLiteCompat.Api19Impl.getNotificationUri(this.mDelegate);
        }

        @RequiresApi(api = 29)
        @Nullable
        public List<Uri> getNotificationUris() {
            return SupportSQLiteCompat.Api29Impl.getNotificationUris(this.mDelegate);
        }

        public int getPosition() {
            return this.mDelegate.getPosition();
        }

        public short getShort(int i) {
            return this.mDelegate.getShort(i);
        }

        public String getString(int i) {
            return this.mDelegate.getString(i);
        }

        public int getType(int i) {
            return this.mDelegate.getType(i);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.mDelegate.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.mDelegate.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.mDelegate.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.mDelegate.isClosed();
        }

        public boolean isFirst() {
            return this.mDelegate.isFirst();
        }

        public boolean isLast() {
            return this.mDelegate.isLast();
        }

        public boolean isNull(int i) {
            return this.mDelegate.isNull(i);
        }

        public boolean move(int i) {
            return this.mDelegate.move(i);
        }

        public boolean moveToFirst() {
            return this.mDelegate.moveToFirst();
        }

        public boolean moveToLast() {
            return this.mDelegate.moveToLast();
        }

        public boolean moveToNext() {
            return this.mDelegate.moveToNext();
        }

        public boolean moveToPosition(int i) {
            return this.mDelegate.moveToPosition(i);
        }

        public boolean moveToPrevious() {
            return this.mDelegate.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.mDelegate.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.mDelegate.registerDataSetObserver(dataSetObserver);
        }

        @Deprecated
        public boolean requery() {
            return this.mDelegate.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.mDelegate.respond(bundle);
        }

        @RequiresApi(api = 23)
        public void setExtras(Bundle bundle) {
            SupportSQLiteCompat.Api23Impl.setExtras(this.mDelegate, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.mDelegate.setNotificationUri(contentResolver, uri);
        }

        @RequiresApi(api = 29)
        public void setNotificationUris(@NonNull ContentResolver contentResolver, @NonNull List<Uri> list) {
            SupportSQLiteCompat.Api29Impl.setNotificationUris(this.mDelegate, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.mDelegate.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.mDelegate.unregisterDataSetObserver(dataSetObserver);
        }
    }

    AutoClosingRoomOpenHelper(@NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper, @NonNull AutoCloser autoCloser) {
        this.mDelegateOpenHelper = supportSQLiteOpenHelper;
        this.mAutoCloser = autoCloser;
        autoCloser.init(supportSQLiteOpenHelper);
        this.mAutoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    public void close() {
        try {
            this.mAutoClosingDb.close();
        } catch (IOException e) {
            SneakyThrow.reThrow(e);
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public AutoCloser getAutoCloser() {
        return this.mAutoCloser;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public SupportSQLiteDatabase getAutoClosingDb() {
        return this.mAutoClosingDb;
    }

    @Nullable
    public String getDatabaseName() {
        return this.mDelegateOpenHelper.getDatabaseName();
    }

    @NonNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.mDelegateOpenHelper;
    }

    @RequiresApi(api = 24)
    @NonNull
    public SupportSQLiteDatabase getReadableDatabase() {
        this.mAutoClosingDb.pokeOpen();
        return this.mAutoClosingDb;
    }

    @RequiresApi(api = 24)
    @NonNull
    public SupportSQLiteDatabase getWritableDatabase() {
        this.mAutoClosingDb.pokeOpen();
        return this.mAutoClosingDb;
    }

    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.mDelegateOpenHelper.setWriteAheadLoggingEnabled(z);
    }
}
