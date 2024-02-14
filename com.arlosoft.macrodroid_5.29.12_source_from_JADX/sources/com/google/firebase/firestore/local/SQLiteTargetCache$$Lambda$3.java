package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteTargetCache */
final /* synthetic */ class SQLiteTargetCache$$Lambda$3 implements Consumer {

    /* renamed from: a */
    private final SQLiteTargetCache f54422a;

    /* renamed from: b */
    private final SparseArray f54423b;

    /* renamed from: c */
    private final int[] f54424c;

    private SQLiteTargetCache$$Lambda$3(SQLiteTargetCache sQLiteTargetCache, SparseArray sparseArray, int[] iArr) {
        this.f54422a = sQLiteTargetCache;
        this.f54423b = sparseArray;
        this.f54424c = iArr;
    }

    /* renamed from: a */
    public static Consumer m75795a(SQLiteTargetCache sQLiteTargetCache, SparseArray sparseArray, int[] iArr) {
        return new SQLiteTargetCache$$Lambda$3(sQLiteTargetCache, sparseArray, iArr);
    }

    public void accept(Object obj) {
        SQLiteTargetCache.m75772r(this.f54422a, this.f54423b, this.f54424c, (Cursor) obj);
    }
}
