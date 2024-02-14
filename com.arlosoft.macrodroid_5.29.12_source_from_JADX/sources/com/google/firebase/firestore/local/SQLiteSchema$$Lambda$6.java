package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$6 implements Consumer {

    /* renamed from: a */
    private final SQLiteSchema f54405a;

    private SQLiteSchema$$Lambda$6(SQLiteSchema sQLiteSchema) {
        this.f54405a = sQLiteSchema;
    }

    /* renamed from: a */
    public static Consumer m75764a(SQLiteSchema sQLiteSchema) {
        return new SQLiteSchema$$Lambda$6(sQLiteSchema);
    }

    public void accept(Object obj) {
        SQLiteSchema.m75749z(this.f54405a, (Cursor) obj);
    }
}
