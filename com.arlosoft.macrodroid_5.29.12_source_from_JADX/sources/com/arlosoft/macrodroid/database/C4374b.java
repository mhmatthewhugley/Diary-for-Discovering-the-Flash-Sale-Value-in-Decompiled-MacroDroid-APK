package com.arlosoft.macrodroid.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.arlosoft.macrodroid.database.b */
/* compiled from: DatabaseHelper */
class C4374b extends SQLiteOpenHelper {
    public C4374b(Context context) {
        super(context, "MacroDroid", (SQLiteDatabase.CursorFactory) null, 9);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE lastRunTime (macro_guid LONG PRIMARY KEY, last_run_time LONG, previous_run_time LONG)");
        sQLiteDatabase.execSQL("CREATE TABLE cellTowerRecords (id LONG PRIMARY KEY, cell_id TEXT, timestamp LONG)");
        sQLiteDatabase.execSQL("CREATE TABLE cellTowerIgnore (id LONG PRIMARY KEY, cell_id TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE floatingButtons (trigger_id LONG PRIMARY KEY, x_location LONG, y_location LONG, x_location_landscape LONG DEFAULT -9999, y_location_landscape LONG DEFAULT -9999)");
        sQLiteDatabase.execSQL("CREATE TABLE recentMacros (id LONG PRIMARY KEY, last_run_time LONG, macro_guid LONG)");
        sQLiteDatabase.execSQL("CREATE TABLE floatingTexts (id TEXT PRIMARY KEY, value TEXT, x_position REAL, y_position REAL, text_color LONG, bg_color LONG, padding LONG, text_size LONG, corners LONG, alpha LONG, is_visible LONG, trigger_context_info TEXT, macro_id LONG DEFAULT -1, alignment LONG)");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1.execSQL("CREATE TABLE floatingButtons (trigger_id LONG PRIMARY KEY, x_location INTEGER, y_location INTEGER)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r1.execSQL("CREATE TABLE recentMacros (id LONG PRIMARY KEY, last_run_time LONG, macro_guid LONG)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r1.execSQL("ALTER TABLE lastRunTime ADD COLUMN previous_run_time LONG");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r1.execSQL("ALTER TABLE floatingButtons ADD COLUMN x_location_landscape LONG DEFAULT -9999");
        r1.execSQL("ALTER TABLE floatingButtons ADD COLUMN y_location_landscape LONG DEFAULT -9999");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r1.execSQL("CREATE TABLE floatingTexts (id TEXT PRIMARY KEY, value TEXT, x_position REAL, y_position REAL, text_color LONG, bg_color LONG, padding LONG, text_size LONG, corners LONG, alpha LONG, is_visible LONG, trigger_context_info TEXT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        r1.execSQL("ALTER TABLE floatingTexts ADD COLUMN macro_id LONG DEFAULT -1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r1.execSQL("ALTER TABLE floatingTexts ADD COLUMN alignment LONG DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
        /*
            r0 = this;
            switch(r2) {
                case 1: goto L_0x0004;
                case 2: goto L_0x000e;
                case 3: goto L_0x0013;
                case 4: goto L_0x0018;
                case 5: goto L_0x001d;
                case 6: goto L_0x0027;
                case 7: goto L_0x002c;
                case 8: goto L_0x0031;
                default: goto L_0x0003;
            }
        L_0x0003:
            goto L_0x0036
        L_0x0004:
            java.lang.String r2 = "CREATE TABLE cellTowerRecords (id LONG PRIMARY KEY, cell_id TEXT, timestamp LONG)"
            r1.execSQL(r2)
            java.lang.String r2 = "CREATE TABLE cellTowerIgnore (id LONG PRIMARY KEY, cell_id TEXT)"
            r1.execSQL(r2)
        L_0x000e:
            java.lang.String r2 = "CREATE TABLE floatingButtons (trigger_id LONG PRIMARY KEY, x_location INTEGER, y_location INTEGER)"
            r1.execSQL(r2)
        L_0x0013:
            java.lang.String r2 = "CREATE TABLE recentMacros (id LONG PRIMARY KEY, last_run_time LONG, macro_guid LONG)"
            r1.execSQL(r2)
        L_0x0018:
            java.lang.String r2 = "ALTER TABLE lastRunTime ADD COLUMN previous_run_time LONG"
            r1.execSQL(r2)
        L_0x001d:
            java.lang.String r2 = "ALTER TABLE floatingButtons ADD COLUMN x_location_landscape LONG DEFAULT -9999"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE floatingButtons ADD COLUMN y_location_landscape LONG DEFAULT -9999"
            r1.execSQL(r2)
        L_0x0027:
            java.lang.String r2 = "CREATE TABLE floatingTexts (id TEXT PRIMARY KEY, value TEXT, x_position REAL, y_position REAL, text_color LONG, bg_color LONG, padding LONG, text_size LONG, corners LONG, alpha LONG, is_visible LONG, trigger_context_info TEXT)"
            r1.execSQL(r2)
        L_0x002c:
            java.lang.String r2 = "ALTER TABLE floatingTexts ADD COLUMN macro_id LONG DEFAULT -1"
            r1.execSQL(r2)
        L_0x0031:
            java.lang.String r2 = "ALTER TABLE floatingTexts ADD COLUMN alignment LONG DEFAULT 0"
            r1.execSQL(r2)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.database.C4374b.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
