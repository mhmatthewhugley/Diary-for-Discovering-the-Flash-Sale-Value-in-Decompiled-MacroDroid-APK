package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.p010db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    @NonNull
    public final List<AutoMigrationSpec> autoMigrationSpecs;
    @Nullable
    public final List<RoomDatabase.Callback> callbacks;
    @NonNull
    public final Context context;
    @Nullable
    public final String copyFromAssetPath;
    @Nullable
    public final File copyFromFile;
    @Nullable
    public final Callable<InputStream> copyFromInputStream;
    public final RoomDatabase.JournalMode journalMode;
    private final Set<Integer> mMigrationNotRequiredFrom;
    @NonNull
    public final RoomDatabase.MigrationContainer migrationContainer;
    public final boolean multiInstanceInvalidation;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Intent multiInstanceInvalidationServiceIntent;
    @Nullable
    public final String name;
    @Nullable
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    @NonNull
    public final Executor queryExecutor;
    public final boolean requireMigration;
    @NonNull
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    @NonNull
    public final Executor transactionExecutor;
    @NonNull
    public final List<Object> typeConverters;

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NonNull Context context2, @Nullable String str, @NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull RoomDatabase.MigrationContainer migrationContainer2, @Nullable List<RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode2, @NonNull Executor executor, boolean z2, @Nullable Set<Integer> set) {
        this(context2, str, factory, migrationContainer2, list, z, journalMode2, executor, executor, false, z2, false, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<Object>) null, (List<AutoMigrationSpec>) null);
    }

    public boolean isMigrationRequired(int i, int i2) {
        Set<Integer> set;
        if ((!(i > i2) || !this.allowDestructiveMigrationOnDowngrade) && this.requireMigration && ((set = this.mMigrationNotRequiredFrom) == null || !set.contains(Integer.valueOf(i)))) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isMigrationRequiredFrom(int i) {
        return isMigrationRequired(i, i + 1);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NonNull Context context2, @Nullable String str, @NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull RoomDatabase.MigrationContainer migrationContainer2, @Nullable List<RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode2, @NonNull Executor executor, @NonNull Executor executor2, boolean z2, boolean z3, boolean z4, @Nullable Set<Integer> set) {
        this(context2, str, factory, migrationContainer2, list, z, journalMode2, executor, executor2, z2, z3, z4, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<Object>) null, (List<AutoMigrationSpec>) null);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NonNull Context context2, @Nullable String str, @NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull RoomDatabase.MigrationContainer migrationContainer2, @Nullable List<RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode2, @NonNull Executor executor, @NonNull Executor executor2, boolean z2, boolean z3, boolean z4, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file) {
        this(context2, str, factory, migrationContainer2, list, z, journalMode2, executor, executor2, z2, z3, z4, set, str2, file, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<Object>) null, (List<AutoMigrationSpec>) null);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NonNull Context context2, @Nullable String str, @NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull RoomDatabase.MigrationContainer migrationContainer2, @Nullable List<RoomDatabase.Callback> list, boolean z, @NonNull RoomDatabase.JournalMode journalMode2, @NonNull Executor executor, @NonNull Executor executor2, boolean z2, boolean z3, boolean z4, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable) {
        this(context2, str, factory, migrationContainer2, list, z, journalMode2, executor, executor2, z2, z3, z4, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<Object>) null, (List<AutoMigrationSpec>) null);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NonNull Context context2, @Nullable String str, @NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull RoomDatabase.MigrationContainer migrationContainer2, @Nullable List<RoomDatabase.Callback> list, boolean z, @NonNull RoomDatabase.JournalMode journalMode2, @NonNull Executor executor, @NonNull Executor executor2, boolean z2, boolean z3, boolean z4, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback2) {
        this(context2, str, factory, migrationContainer2, list, z, journalMode2, executor, executor2, z2, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback2, (List<Object>) null, (List<AutoMigrationSpec>) null);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NonNull Context context2, @Nullable String str, @NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull RoomDatabase.MigrationContainer migrationContainer2, @Nullable List<RoomDatabase.Callback> list, boolean z, @NonNull RoomDatabase.JournalMode journalMode2, @NonNull Executor executor, @NonNull Executor executor2, boolean z2, boolean z3, boolean z4, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback2, @Nullable List<Object> list2) {
        this(context2, str, factory, migrationContainer2, list, z, journalMode2, executor, executor2, z2, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback2, list2, (List<AutoMigrationSpec>) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DatabaseConfiguration(@androidx.annotation.NonNull android.content.Context r23, @androidx.annotation.Nullable java.lang.String r24, @androidx.annotation.NonNull androidx.sqlite.p010db.SupportSQLiteOpenHelper.Factory r25, @androidx.annotation.NonNull androidx.room.RoomDatabase.MigrationContainer r26, @androidx.annotation.Nullable java.util.List<androidx.room.RoomDatabase.Callback> r27, boolean r28, @androidx.annotation.NonNull androidx.room.RoomDatabase.JournalMode r29, @androidx.annotation.NonNull java.util.concurrent.Executor r30, @androidx.annotation.NonNull java.util.concurrent.Executor r31, boolean r32, boolean r33, boolean r34, @androidx.annotation.Nullable java.util.Set<java.lang.Integer> r35, @androidx.annotation.Nullable java.lang.String r36, @androidx.annotation.Nullable java.io.File r37, @androidx.annotation.Nullable java.util.concurrent.Callable<java.io.InputStream> r38, @androidx.annotation.Nullable androidx.room.RoomDatabase.PrepackagedDatabaseCallback r39, @androidx.annotation.Nullable java.util.List<java.lang.Object> r40, @androidx.annotation.Nullable java.util.List<androidx.room.migration.AutoMigrationSpec> r41) {
        /*
            r22 = this;
            if (r32 == 0) goto L_0x000c
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r1 = androidx.room.MultiInstanceInvalidationService.class
            r3 = r23
            r0.<init>(r3, r1)
            goto L_0x000f
        L_0x000c:
            r3 = r23
            r0 = 0
        L_0x000f:
            r12 = r0
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r20 = r40
            r21 = r41
            r2.<init>((android.content.Context) r3, (java.lang.String) r4, (androidx.sqlite.p010db.SupportSQLiteOpenHelper.Factory) r5, (androidx.room.RoomDatabase.MigrationContainer) r6, (java.util.List<androidx.room.RoomDatabase.Callback>) r7, (boolean) r8, (androidx.room.RoomDatabase.JournalMode) r9, (java.util.concurrent.Executor) r10, (java.util.concurrent.Executor) r11, (android.content.Intent) r12, (boolean) r13, (boolean) r14, (java.util.Set<java.lang.Integer>) r15, (java.lang.String) r16, (java.io.File) r17, (java.util.concurrent.Callable<java.io.InputStream>) r18, (androidx.room.RoomDatabase.PrepackagedDatabaseCallback) r19, (java.util.List<java.lang.Object>) r20, (java.util.List<androidx.room.migration.AutoMigrationSpec>) r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.DatabaseConfiguration.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, androidx.room.RoomDatabase$MigrationContainer, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable, androidx.room.RoomDatabase$PrepackagedDatabaseCallback, java.util.List, java.util.List):void");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NonNull Context context2, @Nullable String str, @NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull RoomDatabase.MigrationContainer migrationContainer2, @Nullable List<RoomDatabase.Callback> list, boolean z, @NonNull RoomDatabase.JournalMode journalMode2, @NonNull Executor executor, @NonNull Executor executor2, @Nullable Intent intent, boolean z2, boolean z3, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback2, @Nullable List<Object> list2, @Nullable List<AutoMigrationSpec> list3) {
        Intent intent2 = intent;
        this.sqliteOpenHelperFactory = factory;
        this.context = context2;
        this.name = str;
        this.migrationContainer = migrationContainer2;
        this.callbacks = list;
        this.allowMainThreadQueries = z;
        this.journalMode = journalMode2;
        this.queryExecutor = executor;
        this.transactionExecutor = executor2;
        this.multiInstanceInvalidationServiceIntent = intent2;
        this.multiInstanceInvalidation = intent2 != null;
        this.requireMigration = z2;
        this.allowDestructiveMigrationOnDowngrade = z3;
        this.mMigrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback2;
        this.typeConverters = list2 == null ? Collections.emptyList() : list2;
        this.autoMigrationSpecs = list3 == null ? Collections.emptyList() : list3;
    }
}
