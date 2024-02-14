package com.google.firebase.firestore.local;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$4 implements Runnable {

    /* renamed from: a */
    private final SQLiteSchema f54403a;

    private SQLiteSchema$$Lambda$4(SQLiteSchema sQLiteSchema) {
        this.f54403a = sQLiteSchema;
    }

    /* renamed from: a */
    public static Runnable m75762a(SQLiteSchema sQLiteSchema) {
        return new SQLiteSchema$$Lambda$4(sQLiteSchema);
    }

    public void run() {
        this.f54403a.f54390a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }
}
