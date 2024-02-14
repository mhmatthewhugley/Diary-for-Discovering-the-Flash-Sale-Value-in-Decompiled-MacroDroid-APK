package com.google.firebase.firestore.local;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$5 implements Runnable {

    /* renamed from: a */
    private final SQLiteSchema f54404a;

    private SQLiteSchema$$Lambda$5(SQLiteSchema sQLiteSchema) {
        this.f54404a = sQLiteSchema;
    }

    /* renamed from: a */
    public static Runnable m75763a(SQLiteSchema sQLiteSchema) {
        return new SQLiteSchema$$Lambda$5(sQLiteSchema);
    }

    public void run() {
        this.f54404a.f54390a.execSQL("CREATE TABLE collection_index (uid TEXT, collection_path TEXT, field_path TEXT, field_value_type INTEGER, field_value_1, field_value_2, document_id TEXT, PRIMARY KEY (uid, collection_path, field_path, field_value_type, field_value_1, field_value_2, document_id))");
    }
}
