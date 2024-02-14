package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$15 implements Consumer {

    /* renamed from: a */
    private final SQLiteSchema f54399a;

    /* renamed from: b */
    private final String f54400b;

    private SQLiteSchema$$Lambda$15(SQLiteSchema sQLiteSchema, String str) {
        this.f54399a = sQLiteSchema;
        this.f54400b = str;
    }

    /* renamed from: a */
    public static Consumer m75759a(SQLiteSchema sQLiteSchema, String str) {
        return new SQLiteSchema$$Lambda$15(sQLiteSchema, str);
    }

    public void accept(Object obj) {
        this.f54399a.m75721G(this.f54400b, ((Cursor) obj).getInt(0));
    }
}
