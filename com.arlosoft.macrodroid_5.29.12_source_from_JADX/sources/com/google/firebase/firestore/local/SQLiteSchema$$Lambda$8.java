package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$8 implements Consumer {

    /* renamed from: a */
    private final boolean[] f54407a;

    /* renamed from: b */
    private final SQLiteStatement f54408b;

    /* renamed from: c */
    private final long f54409c;

    private SQLiteSchema$$Lambda$8(boolean[] zArr, SQLiteStatement sQLiteStatement, long j) {
        this.f54407a = zArr;
        this.f54408b = sQLiteStatement;
        this.f54409c = j;
    }

    /* renamed from: a */
    public static Consumer m75766a(boolean[] zArr, SQLiteStatement sQLiteStatement, long j) {
        return new SQLiteSchema$$Lambda$8(zArr, sQLiteStatement, j);
    }

    public void accept(Object obj) {
        SQLiteSchema.m75716B(this.f54407a, this.f54408b, this.f54409c, (Cursor) obj);
    }
}
