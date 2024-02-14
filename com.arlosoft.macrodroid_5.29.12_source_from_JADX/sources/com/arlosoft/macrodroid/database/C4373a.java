package com.arlosoft.macrodroid.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p135n1.C7965b;
import p148q0.C8151a;
import p172u1.C10283c;

/* renamed from: com.arlosoft.macrodroid.database.a */
/* compiled from: Database */
public class C4373a {

    /* renamed from: c */
    private static C4373a f11138c;

    /* renamed from: d */
    private static final Object f11139d = new Object();

    /* renamed from: e */
    private static HashMap<Long, Long> f11140e = new HashMap<>();

    /* renamed from: f */
    private static HashMap<Long, Long> f11141f = new HashMap<>();

    /* renamed from: a */
    private final C4374b f11142a;

    /* renamed from: b */
    private SQLiteDatabase f11143b;

    private C4373a(Context context) {
        this.f11142a = new C4374b(context);
        m17335d();
    }

    /* renamed from: d */
    private synchronized void m17335d() {
        if (this.f11143b == null) {
            try {
                this.f11143b = this.f11142a.getWritableDatabase();
            } catch (SQLiteException e) {
                C8151a.m33873n(e);
                C4878b.m18868g("Failed to open database: " + e.toString());
            }
        }
        return;
    }

    /* renamed from: h */
    public static C4373a m17336h() {
        synchronized (f11139d) {
            if (f11138c == null) {
                f11138c = new C4373a(MacroDroidApplication.m14845u());
            }
        }
        return f11138c;
    }

    /* renamed from: i */
    public static synchronized C4373a m17337i(Context context) {
        C4373a aVar;
        synchronized (C4373a.class) {
            synchronized (f11139d) {
                if (f11138c == null) {
                    f11138c = new C4373a(context);
                }
            }
            aVar = f11138c;
        }
        return aVar;
    }

    /* renamed from: r */
    private boolean m17338r(long j) {
        boolean z = true;
        Cursor query = this.f11143b.query("floatingButtons", new String[]{"trigger_id"}, "trigger_id=?", new String[]{String.valueOf(j)}, (String) null, (String) null, (String) null);
        try {
            if (query.getCount() <= 0) {
                z = false;
            }
            query.close();
            return z;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: s */
    private boolean m17339s(String str) {
        boolean z = true;
        Cursor query = this.f11143b.query("floatingTexts", new String[]{"id"}, "id=?", new String[]{str}, (String) null, (String) null, (String) null);
        try {
            if (query.getCount() <= 0) {
                z = false;
            }
            query.close();
            return z;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: A */
    public void mo28634A(String str, float f, float f2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        contentValues.put("x_position", Float.valueOf(f));
        contentValues.put("y_position", Float.valueOf(f2));
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.update("floatingTexts", contentValues, "id=?", new String[]{str});
            } catch (SQLiteCantOpenDatabaseException | SQLiteReadOnlyDatabaseException e) {
                C4878b.m18864c("Failed to set floating texts in database: " + e.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo28635a(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("cell_id", str);
        contentValues.put("timestamp", Long.valueOf(j));
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.insertWithOnConflict("cellTowerRecords", (String) null, contentValues, 5);
            } catch (SQLiteCantOpenDatabaseException | SQLiteReadOnlyDatabaseException unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo28636b() {
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.delete("cellTowerIgnore", (String) null, (String[]) null);
        }
    }

    /* renamed from: c */
    public void mo28637c(String str, String str2, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, long j, TriggerContextInfo triggerContextInfo) {
        String str3 = str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        String str4 = str2;
        contentValues.put("value", str2);
        contentValues.put("text_color", Integer.valueOf(i));
        contentValues.put("bg_color", Integer.valueOf(i2));
        contentValues.put("padding", Integer.valueOf(i3));
        contentValues.put("text_size", Integer.valueOf(i4));
        contentValues.put("corners", Integer.valueOf(i5));
        contentValues.put("alignment", Integer.valueOf(i6));
        contentValues.put("alpha", Integer.valueOf(i7));
        contentValues.put("is_visible", Boolean.valueOf(z));
        contentValues.put("macro_id", Long.valueOf(j));
        contentValues.put("trigger_context_info", C10283c.m40413c().mo64004c().mo63984s(triggerContextInfo));
        m17335d();
        if (this.f11143b != null) {
            try {
                if (m17339s(str)) {
                    if (z2) {
                        contentValues.put("x_position", Float.valueOf(f));
                        contentValues.put("y_position", Float.valueOf(f2));
                    }
                    this.f11143b.update("floatingTexts", contentValues, "id=?", new String[]{str3});
                    return;
                }
                contentValues.put("x_position", Float.valueOf(f));
                contentValues.put("y_position", Float.valueOf(f2));
                this.f11143b.insert("floatingTexts", (String) null, contentValues);
            } catch (SQLiteCantOpenDatabaseException | SQLiteReadOnlyDatabaseException e) {
                C4878b.m18864c("Failed to set floating texts in database: " + e.toString());
            }
        }
    }

    /* renamed from: e */
    public List<C4378d> mo28638e(boolean z) {
        Throwable th;
        m17335d();
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            Cursor query = sQLiteDatabase.query("floatingTexts", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(query.getColumnIndex("id"));
                    String string2 = query.getString(query.getColumnIndex("value"));
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str = string2;
                    float f = query.getFloat(query.getColumnIndex("x_position"));
                    float f2 = query.getFloat(query.getColumnIndex("y_position"));
                    int i = query.getInt(query.getColumnIndex("text_color"));
                    int i2 = query.getInt(query.getColumnIndex("bg_color"));
                    int i3 = query.getInt(query.getColumnIndex("padding"));
                    arrayList.add(new C4378d(string, str, f, f2, i, i2, query.getInt(query.getColumnIndex("text_size")), i3, query.getInt(query.getColumnIndex("corners")), query.getInt(query.getColumnIndex("alignment")), query.getInt(query.getColumnIndex("alpha")), query.getInt(query.getColumnIndex("is_visible")) != 0, query.getLong(query.getColumnIndex("macro_id")), (TriggerContextInfo) C10283c.m40413c().mo64004c().mo63976j(query.getString(query.getColumnIndex("trigger_context_info")), TriggerContextInfo.class)));
                    query.moveToNext();
                }
                query.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return arrayList;
        throw th;
    }

    /* renamed from: f */
    public Set<String> mo28639f() {
        HashSet hashSet = new HashSet();
        String[] strArr = {"cell_id"};
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            Cursor query = sQLiteDatabase.query("cellTowerIgnore", strArr, (String) null, (String[]) null, (String) null, (String) null, "cell_id ASC");
            if (query != null) {
                try {
                    query.moveToFirst();
                    while (!query.isAfterLast()) {
                        hashSet.add(query.getString(0));
                        query.moveToNext();
                    }
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return hashSet;
        throw th;
    }

    /* renamed from: g */
    public List<String> mo28640g() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"cell_id"};
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            Cursor query = sQLiteDatabase.query("cellTowerIgnore", strArr, (String) null, (String[]) null, (String) null, (String) null, "cell_id ASC");
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    arrayList.add(query.getString(0));
                    query.moveToNext();
                }
                query.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return arrayList;
        throw th;
    }

    /* renamed from: j */
    public long mo28641j(long j) {
        String[] strArr = {"last_run_time"};
        String[] strArr2 = {String.valueOf(j)};
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        long j2 = 0;
        if (sQLiteDatabase != null) {
            Cursor query = sQLiteDatabase.query("lastRunTime", strArr, "macro_guid=?", strArr2, (String) null, (String) null, (String) null);
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    j2 = query.getLong(0);
                    query.moveToNext();
                }
                query.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return j2;
        throw th;
    }

    /* renamed from: k */
    public HashMap<Long, Long> mo28642k() {
        HashMap<Long, Long> hashMap = new HashMap<>();
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            Cursor query = sQLiteDatabase.query("lastRunTime", new String[]{"macro_guid", "last_run_time"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    hashMap.put(Long.valueOf(query.getLong(0)), Long.valueOf(query.getLong(1)));
                    query.moveToNext();
                }
                query.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return hashMap;
        throw th;
    }

    /* renamed from: l */
    public List<Pair<Long, Long>> mo28643l(int i) {
        Cursor query;
        ArrayList arrayList = new ArrayList();
        try {
            m17335d();
            SQLiteDatabase sQLiteDatabase = this.f11143b;
            if (sQLiteDatabase != null) {
                query = sQLiteDatabase.query("recentMacros", new String[]{"macro_guid", "last_run_time"}, (String) null, (String[]) null, (String) null, (String) null, "last_run_time DESC");
                query.moveToFirst();
                while (!query.isAfterLast() && query.getPosition() < i + 1) {
                    arrayList.add(new Pair(Long.valueOf(query.getLong(0)), Long.valueOf(query.getLong(1))));
                    query.moveToNext();
                }
                query.close();
            }
        } catch (SQLiteException e) {
            C4878b.m18879r("Database error: " + e.toString());
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return arrayList;
        throw th;
    }

    /* renamed from: m */
    public List<C7965b> mo28644m(long j) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"cell_id", "timestamp"};
        String[] strArr2 = {String.valueOf(j)};
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            Cursor query = sQLiteDatabase.query("cellTowerRecords", strArr, "timestamp > ?", strArr2, (String) null, (String) null, "timestamp DESC");
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    arrayList.add(new C7965b(query.getString(0), query.getLong(1)));
                    query.moveToNext();
                }
                query.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return arrayList;
        throw th;
    }

    /* renamed from: n */
    public Pair<Integer, Integer> mo28645n(long j, boolean z, int i, int i2, int i3) {
        Throwable th;
        String[] strArr = {"trigger_id", "x_location", "y_location", "x_location_landscape", "y_location_landscape"};
        int i4 = 0;
        String[] strArr2 = {String.valueOf(j)};
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase == null) {
            return null;
        }
        Cursor query = sQLiteDatabase.query("floatingButtons", strArr, "trigger_id=?", strArr2, (String) null, (String) null, (String) null);
        try {
            query.moveToFirst();
            long j2 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (!query.isAfterLast()) {
                j2 = (long) query.getInt(query.getColumnIndex("trigger_id"));
                i6 = query.getInt(query.getColumnIndex("x_location"));
                i7 = query.getInt(query.getColumnIndex("y_location"));
                i4 = query.getInt(query.getColumnIndex("x_location_landscape"));
                i5 = query.getInt(query.getColumnIndex("y_location_landscape"));
                query.moveToNext();
            }
            if (z) {
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(i6), Integer.valueOf(i7));
                query.close();
                return pair;
            }
            if (i4 == -9999 && i5 == -9999) {
                int i8 = i - i3;
                int i9 = i2 - i3;
                i4 = (int) ((((float) i6) / ((float) (i9 / 2))) * ((float) (i8 / 2)));
                i5 = (int) ((((float) i7) / ((float) (i8 / 2))) * ((float) (i9 / 2)));
                mo28654y(j2, i4, i5);
            }
            Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(i4), Integer.valueOf(i5));
            query.close();
            return pair2;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: o */
    public long mo28646o(long j) {
        Long l = f11141f.get(Long.valueOf(j));
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: p */
    public void mo28647p() {
        for (C4378d e : mo28638e(true)) {
            mo28648q(e.mo28664e());
        }
    }

    /* renamed from: q */
    public void mo28648q(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        contentValues.put("is_visible", Boolean.FALSE);
        m17335d();
        if (this.f11143b != null) {
            try {
                if (m17339s(str)) {
                    this.f11143b.update("floatingTexts", contentValues, "id=?", new String[]{str});
                    return;
                }
                C4878b.m18882u("Cannot hide floating text with id: " + str + " (not found)");
            } catch (SQLiteCantOpenDatabaseException | SQLiteReadOnlyDatabaseException e) {
                C4878b.m18864c("Failed to set floating texts in database: " + e.toString());
            }
        }
    }

    /* renamed from: t */
    public void mo28649t(long j) {
        Long l = f11140e.get(Long.valueOf(j));
        if (l != null) {
            f11141f.put(Long.valueOf(j), l);
        }
    }

    /* renamed from: u */
    public void mo28650u(long j) {
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.delete("cellTowerRecords", "timestamp < ?", new String[]{String.valueOf(j)});
            } catch (SQLiteCantOpenDatabaseException | SQLiteReadOnlyDatabaseException unused) {
            }
        }
    }

    /* renamed from: v */
    public void mo28651v(String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("cell_id", str);
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase == null) {
            return;
        }
        if (z) {
            try {
                sQLiteDatabase.insertWithOnConflict("cellTowerIgnore", (String) null, contentValues, 5);
            } catch (SQLiteCantOpenDatabaseException | SQLiteReadOnlyDatabaseException unused) {
            }
        } else {
            sQLiteDatabase.delete("cellTowerIgnore", "cell_id = ?", new String[]{str});
        }
    }

    /* renamed from: w */
    public void mo28652w(long j, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("macro_guid", Long.valueOf(j));
        contentValues.put("last_run_time", Long.valueOf(j2));
        if (f11141f.get(Long.valueOf(j)) == null) {
            f11141f.put(Long.valueOf(j), Long.valueOf(mo28641j(j)));
        }
        m17335d();
        SQLiteDatabase sQLiteDatabase = this.f11143b;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.insert("recentMacros", (String) null, contentValues);
                this.f11143b.insertWithOnConflict("lastRunTime", (String) null, contentValues, 5);
            } catch (SQLiteCantOpenDatabaseException | SQLiteReadOnlyDatabaseException | IllegalStateException e) {
                C4878b.m18868g("Failed to update last run time: " + e);
            } catch (SQLiteException e2) {
                C8151a.m33873n(e2);
                C4878b.m18868g("Failed to update last run time: " + e2);
            }
        }
    }

    /* renamed from: x */
    public void mo28653x(long j, long j2) {
        f11140e.put(Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: y */
    public void mo28654y(long j, int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("trigger_id", String.valueOf(j));
        contentValues.put("x_location_landscape", Integer.valueOf(i));
        contentValues.put("y_location_landscape", Integer.valueOf(i2));
        m17335d();
        if (this.f11143b != null) {
            try {
                if (m17338r(j)) {
                    this.f11143b.update("floatingButtons", contentValues, "trigger_id=?", new String[]{String.valueOf(j)});
                    return;
                }
                this.f11143b.insert("floatingButtons", (String) null, contentValues);
            } catch (SQLiteCantOpenDatabaseException | SQLiteReadOnlyDatabaseException unused) {
            }
        }
    }

    /* renamed from: z */
    public void mo28655z(long j, int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("trigger_id", String.valueOf(j));
        contentValues.put("x_location", Integer.valueOf(i));
        contentValues.put("y_location", Integer.valueOf(i2));
        m17335d();
        if (this.f11143b != null) {
            try {
                if (m17338r(j)) {
                    this.f11143b.update("floatingButtons", contentValues, "trigger_id=?", new String[]{String.valueOf(j)});
                    return;
                }
                this.f11143b.insert("floatingButtons", (String) null, contentValues);
            } catch (SQLiteCantOpenDatabaseException | SQLiteReadOnlyDatabaseException e) {
                C4878b.m18864c("Failed to set floating button in database: " + e.toString());
            }
        }
    }
}
