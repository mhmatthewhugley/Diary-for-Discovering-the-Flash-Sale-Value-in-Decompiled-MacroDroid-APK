package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$12 implements Consumer {

    /* renamed from: a */
    private final Consumer f54396a;

    private SQLiteSchema$$Lambda$12(Consumer consumer) {
        this.f54396a = consumer;
    }

    /* renamed from: a */
    public static Consumer m75756a(Consumer consumer) {
        return new SQLiteSchema$$Lambda$12(consumer);
    }

    public void accept(Object obj) {
        this.f54396a.accept((ResourcePath) EncodedPath.m75289b(((Cursor) obj).getString(0)).mo62809q());
    }
}
