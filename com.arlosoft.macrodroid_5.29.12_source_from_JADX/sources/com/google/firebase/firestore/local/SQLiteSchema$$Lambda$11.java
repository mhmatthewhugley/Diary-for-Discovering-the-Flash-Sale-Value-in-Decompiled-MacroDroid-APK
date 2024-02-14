package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$11 implements Consumer {

    /* renamed from: a */
    private final Consumer f54395a;

    private SQLiteSchema$$Lambda$11(Consumer consumer) {
        this.f54395a = consumer;
    }

    /* renamed from: a */
    public static Consumer m75755a(Consumer consumer) {
        return new SQLiteSchema$$Lambda$11(consumer);
    }

    public void accept(Object obj) {
        this.f54395a.accept((ResourcePath) EncodedPath.m75289b(((Cursor) obj).getString(0)).mo62809q());
    }
}
