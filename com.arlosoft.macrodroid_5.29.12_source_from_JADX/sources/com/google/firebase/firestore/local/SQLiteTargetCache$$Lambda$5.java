package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteTargetCache */
final /* synthetic */ class SQLiteTargetCache$$Lambda$5 implements Consumer {

    /* renamed from: a */
    private final SQLiteTargetCache.DocumentKeysHolder f54428a;

    private SQLiteTargetCache$$Lambda$5(SQLiteTargetCache.DocumentKeysHolder documentKeysHolder) {
        this.f54428a = documentKeysHolder;
    }

    /* renamed from: a */
    public static Consumer m75797a(SQLiteTargetCache.DocumentKeysHolder documentKeysHolder) {
        return new SQLiteTargetCache$$Lambda$5(documentKeysHolder);
    }

    public void accept(Object obj) {
        this.f54428a.f54417a = this.f54428a.f54417a.mo23560f(DocumentKey.m75849i(EncodedPath.m75289b(((Cursor) obj).getString(0))));
    }
}
