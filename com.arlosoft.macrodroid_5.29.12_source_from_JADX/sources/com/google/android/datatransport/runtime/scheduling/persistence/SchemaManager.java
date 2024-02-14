package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

final class SchemaManager extends SQLiteOpenHelper {

    /* renamed from: A */
    private static final List<Migration> f1589A;

    /* renamed from: d */
    private static final String f1590d = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: f */
    static int f1591f = 5;

    /* renamed from: g */
    private static final Migration f1592g;

    /* renamed from: o */
    private static final Migration f1593o;

    /* renamed from: p */
    private static final Migration f1594p;

    /* renamed from: s */
    private static final Migration f1595s;

    /* renamed from: z */
    private static final Migration f1596z;

    /* renamed from: a */
    private final int f1597a;

    /* renamed from: c */
    private boolean f1598c = false;

    public interface Migration {
        /* renamed from: a */
        void mo19625a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C1697e0 e0Var = C1697e0.f1621a;
        f1592g = e0Var;
        C1691b0 b0Var = C1691b0.f1608a;
        f1593o = b0Var;
        C1693c0 c0Var = C1693c0.f1613a;
        f1594p = c0Var;
        C1695d0 d0Var = C1695d0.f1617a;
        f1595s = d0Var;
        C1699f0 f0Var = C1699f0.f1625a;
        f1596z = f0Var;
        f1589A = Arrays.asList(new Migration[]{e0Var, b0Var, c0Var, d0Var, f0Var});
    }

    SchemaManager(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f1597a = i;
    }

    /* renamed from: h */
    private void m1636h(SQLiteDatabase sQLiteDatabase) {
        if (!this.f1598c) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m1637i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m1638j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m1640o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m1641p(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f1590d);
    }

    /* renamed from: r */
    private void m1642r(SQLiteDatabase sQLiteDatabase, int i) {
        m1636h(sQLiteDatabase);
        m1643s(sQLiteDatabase, 0, i);
    }

    /* renamed from: s */
    private void m1643s(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<Migration> list = f1589A;
        if (i2 <= list.size()) {
            while (i < i2) {
                f1589A.get(i).mo19625a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f1598c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m1642r(sQLiteDatabase, this.f1597a);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m1642r(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m1636h(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m1636h(sQLiteDatabase);
        m1643s(sQLiteDatabase, i, i2);
    }
}
