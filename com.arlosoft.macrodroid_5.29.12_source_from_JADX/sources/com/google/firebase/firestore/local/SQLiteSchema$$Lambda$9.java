package com.google.firebase.firestore.local;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$9 implements Runnable {

    /* renamed from: a */
    private final SQLiteSchema f54410a;

    private SQLiteSchema$$Lambda$9(SQLiteSchema sQLiteSchema) {
        this.f54410a = sQLiteSchema;
    }

    /* renamed from: a */
    public static Runnable m75767a(SQLiteSchema sQLiteSchema) {
        return new SQLiteSchema$$Lambda$9(sQLiteSchema);
    }

    public void run() {
        this.f54410a.f54390a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }
}
