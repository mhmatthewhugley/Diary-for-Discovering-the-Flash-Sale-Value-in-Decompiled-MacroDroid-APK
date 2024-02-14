package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzdz extends SQLiteOpenHelper {

    /* renamed from: a */
    final /* synthetic */ zzea f46660a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdz(zzea zzea, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f46660a = zzea;
    }

    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f46660a.f46899a.mo55221z().mo55098p().mo55091a("Opening the local database failed, dropping and recreating it");
            this.f46660a.f46899a.mo55219x();
            if (!this.f46660a.f46899a.mo55202c().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f46660a.f46899a.mo55221z().mo55098p().mo55092b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f46660a.f46899a.mo55221z().mo55098p().mo55092b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzan.m65447b(this.f46660a.f46899a.mo55221z(), sQLiteDatabase);
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzan.m65446a(this.f46660a.f46899a.mo55221z(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
