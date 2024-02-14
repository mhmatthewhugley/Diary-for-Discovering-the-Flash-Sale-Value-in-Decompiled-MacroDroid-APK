package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;
import androidx.sqlite.p010db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class AutoCloser {
    final long mAutoCloseTimeoutInMs;
    @NonNull
    final Runnable mAutoCloser = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                androidx.room.AutoCloser r0 = androidx.room.AutoCloser.this
                java.lang.Object r0 = r0.mLock
                monitor-enter(r0)
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x004a }
                androidx.room.AutoCloser r3 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x004a }
                long r4 = r3.mLastDecrementRefCountTimeStamp     // Catch:{ all -> 0x004a }
                long r1 = r1 - r4
                long r4 = r3.mAutoCloseTimeoutInMs     // Catch:{ all -> 0x004a }
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x0016
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x0016:
                int r1 = r3.mRefCount     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x001c:
                java.lang.Runnable r1 = r3.mOnAutoCloseCallback     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0042
                r1.run()     // Catch:{ all -> 0x004a }
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x004a }
                androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.mDelegateDatabase     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0040
                boolean r1 = r1.isOpen()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0040
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ IOException -> 0x0037 }
                androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.mDelegateDatabase     // Catch:{ IOException -> 0x0037 }
                r1.close()     // Catch:{ IOException -> 0x0037 }
                goto L_0x003b
            L_0x0037:
                r1 = move-exception
                androidx.room.util.SneakyThrow.reThrow(r1)     // Catch:{ all -> 0x004a }
            L_0x003b:
                androidx.room.AutoCloser r1 = androidx.room.AutoCloser.this     // Catch:{ all -> 0x004a }
                r2 = 0
                r1.mDelegateDatabase = r2     // Catch:{ all -> 0x004a }
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x0042:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
                java.lang.String r2 = "mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568"
                r1.<init>(r2)     // Catch:{ all -> 0x004a }
                throw r1     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.AutoCloser.C10812.run():void");
        }
    };
    @GuardedBy("mLock")
    @Nullable
    SupportSQLiteDatabase mDelegateDatabase;
    @Nullable
    private SupportSQLiteOpenHelper mDelegateOpenHelper = null;
    private final Runnable mExecuteAutoCloser = new Runnable() {
        public void run() {
            AutoCloser autoCloser = AutoCloser.this;
            autoCloser.mExecutor.execute(autoCloser.mAutoCloser);
        }
    };
    @NonNull
    final Executor mExecutor;
    @NonNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    @GuardedBy("mLock")
    long mLastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
    @NonNull
    final Object mLock = new Object();
    private boolean mManuallyClosed = false;
    @Nullable
    Runnable mOnAutoCloseCallback = null;
    @GuardedBy("mLock")
    int mRefCount = 0;

    AutoCloser(long j, @NonNull TimeUnit timeUnit, @NonNull Executor executor) {
        this.mAutoCloseTimeoutInMs = timeUnit.toMillis(j);
        this.mExecutor = executor;
    }

    public void closeDatabaseIfOpen() throws IOException {
        synchronized (this.mLock) {
            this.mManuallyClosed = true;
            SupportSQLiteDatabase supportSQLiteDatabase = this.mDelegateDatabase;
            if (supportSQLiteDatabase != null) {
                supportSQLiteDatabase.close();
            }
            this.mDelegateDatabase = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void decrementCountAndScheduleClose() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            int r1 = r5.mRefCount     // Catch:{ all -> 0x0026 }
            if (r1 <= 0) goto L_0x001e
            int r1 = r1 + -1
            r5.mRefCount = r1     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x001c
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r5.mDelegateDatabase     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0013:
            android.os.Handler r1 = r5.mHandler     // Catch:{ all -> 0x0026 }
            java.lang.Runnable r2 = r5.mExecuteAutoCloser     // Catch:{ all -> 0x0026 }
            long r3 = r5.mAutoCloseTimeoutInMs     // Catch:{ all -> 0x0026 }
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0026 }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "ref count is 0 or lower but we're supposed to decrement"
            r1.<init>(r2)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.AutoCloser.decrementCountAndScheduleClose():void");
    }

    @Nullable
    public <V> V executeRefCountingFunction(@NonNull Function<SupportSQLiteDatabase, V> function) {
        try {
            return function.apply(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    @Nullable
    public SupportSQLiteDatabase getDelegateDatabase() {
        SupportSQLiteDatabase supportSQLiteDatabase;
        synchronized (this.mLock) {
            supportSQLiteDatabase = this.mDelegateDatabase;
        }
        return supportSQLiteDatabase;
    }

    @VisibleForTesting
    public int getRefCountForTest() {
        int i;
        synchronized (this.mLock) {
            i = this.mRefCount;
        }
        return i;
    }

    @NonNull
    public SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized (this.mLock) {
            this.mHandler.removeCallbacks(this.mExecuteAutoCloser);
            this.mRefCount++;
            if (!this.mManuallyClosed) {
                SupportSQLiteDatabase supportSQLiteDatabase = this.mDelegateDatabase;
                if (supportSQLiteDatabase == null || !supportSQLiteDatabase.isOpen()) {
                    SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.mDelegateOpenHelper;
                    if (supportSQLiteOpenHelper != null) {
                        SupportSQLiteDatabase writableDatabase = supportSQLiteOpenHelper.getWritableDatabase();
                        this.mDelegateDatabase = writableDatabase;
                        return writableDatabase;
                    }
                    throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                SupportSQLiteDatabase supportSQLiteDatabase2 = this.mDelegateDatabase;
                return supportSQLiteDatabase2;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public void init(@NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (this.mDelegateOpenHelper != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.mDelegateOpenHelper = supportSQLiteOpenHelper;
        }
    }

    public boolean isActive() {
        return !this.mManuallyClosed;
    }

    public void setAutoCloseCallback(Runnable runnable) {
        this.mOnAutoCloseCallback = runnable;
    }
}
