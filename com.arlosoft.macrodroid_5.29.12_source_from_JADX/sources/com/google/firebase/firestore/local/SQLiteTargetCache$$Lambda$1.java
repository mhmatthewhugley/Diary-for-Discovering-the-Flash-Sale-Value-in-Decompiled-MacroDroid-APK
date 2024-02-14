package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteTargetCache */
final /* synthetic */ class SQLiteTargetCache$$Lambda$1 implements Consumer {

    /* renamed from: a */
    private final SQLiteTargetCache f54419a;

    private SQLiteTargetCache$$Lambda$1(SQLiteTargetCache sQLiteTargetCache) {
        this.f54419a = sQLiteTargetCache;
    }

    /* renamed from: a */
    public static Consumer m75793a(SQLiteTargetCache sQLiteTargetCache) {
        return new SQLiteTargetCache$$Lambda$1(sQLiteTargetCache);
    }

    public void accept(Object obj) {
        SQLiteTargetCache.m75773s(this.f54419a, (Cursor) obj);
    }
}
