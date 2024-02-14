package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$13 implements Consumer {

    /* renamed from: a */
    private final SQLiteSchema f54397a;

    private SQLiteSchema$$Lambda$13(SQLiteSchema sQLiteSchema) {
        this.f54397a = sQLiteSchema;
    }

    /* renamed from: a */
    public static Consumer m75757a(SQLiteSchema sQLiteSchema) {
        return new SQLiteSchema$$Lambda$13(sQLiteSchema);
    }

    public void accept(Object obj) {
        SQLiteSchema.m75719E(this.f54397a, (Cursor) obj);
    }
}
