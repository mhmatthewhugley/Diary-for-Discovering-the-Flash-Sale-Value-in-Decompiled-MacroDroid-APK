package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$2 implements Consumer {

    /* renamed from: a */
    private final SQLiteSchema f54401a;

    private SQLiteSchema$$Lambda$2(SQLiteSchema sQLiteSchema) {
        this.f54401a = sQLiteSchema;
    }

    /* renamed from: a */
    public static Consumer m75760a(SQLiteSchema sQLiteSchema) {
        return new SQLiteSchema$$Lambda$2(sQLiteSchema);
    }

    public void accept(Object obj) {
        SQLiteSchema.m75718D(this.f54401a, (Cursor) obj);
    }
}
