package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteTargetCache */
final /* synthetic */ class SQLiteTargetCache$$Lambda$4 implements Consumer {

    /* renamed from: a */
    private final SQLiteTargetCache f54425a;

    /* renamed from: b */
    private final Target f54426b;

    /* renamed from: c */
    private final SQLiteTargetCache.TargetDataHolder f54427c;

    private SQLiteTargetCache$$Lambda$4(SQLiteTargetCache sQLiteTargetCache, Target target, SQLiteTargetCache.TargetDataHolder targetDataHolder) {
        this.f54425a = sQLiteTargetCache;
        this.f54426b = target;
        this.f54427c = targetDataHolder;
    }

    /* renamed from: a */
    public static Consumer m75796a(SQLiteTargetCache sQLiteTargetCache, Target target, SQLiteTargetCache.TargetDataHolder targetDataHolder) {
        return new SQLiteTargetCache$$Lambda$4(sQLiteTargetCache, target, targetDataHolder);
    }

    public void accept(Object obj) {
        SQLiteTargetCache.m75771q(this.f54425a, this.f54426b, this.f54427c, (Cursor) obj);
    }
}
