package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteTargetCache */
final /* synthetic */ class SQLiteTargetCache$$Lambda$2 implements Consumer {

    /* renamed from: a */
    private final SQLiteTargetCache f54420a;

    /* renamed from: b */
    private final Consumer f54421b;

    private SQLiteTargetCache$$Lambda$2(SQLiteTargetCache sQLiteTargetCache, Consumer consumer) {
        this.f54420a = sQLiteTargetCache;
        this.f54421b = consumer;
    }

    /* renamed from: a */
    public static Consumer m75794a(SQLiteTargetCache sQLiteTargetCache, Consumer consumer) {
        return new SQLiteTargetCache$$Lambda$2(sQLiteTargetCache, consumer);
    }

    public void accept(Object obj) {
        this.f54421b.accept(this.f54420a.m75768k(((Cursor) obj).getBlob(0)));
    }
}
