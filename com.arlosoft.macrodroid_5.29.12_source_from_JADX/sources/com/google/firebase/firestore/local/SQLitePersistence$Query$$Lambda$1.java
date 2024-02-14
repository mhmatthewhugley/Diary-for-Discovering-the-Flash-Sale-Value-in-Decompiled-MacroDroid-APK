package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: SQLitePersistence */
final /* synthetic */ class SQLitePersistence$Query$$Lambda$1 implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    private final Object[] f54375a;

    private SQLitePersistence$Query$$Lambda$1(Object[] objArr) {
        this.f54375a = objArr;
    }

    /* renamed from: a */
    public static SQLiteDatabase.CursorFactory m75699a(Object[] objArr) {
        return new SQLitePersistence$Query$$Lambda$1(objArr);
    }

    public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return SQLitePersistence.m75661n(sQLiteQuery, this.f54375a);
    }
}
