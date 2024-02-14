package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteLruReferenceDelegate */
final /* synthetic */ class SQLiteLruReferenceDelegate$$Lambda$2 implements Consumer {

    /* renamed from: a */
    private final Consumer f54322a;

    private SQLiteLruReferenceDelegate$$Lambda$2(Consumer consumer) {
        this.f54322a = consumer;
    }

    /* renamed from: a */
    public static Consumer m75611a(Consumer consumer) {
        return new SQLiteLruReferenceDelegate$$Lambda$2(consumer);
    }

    public void accept(Object obj) {
        this.f54322a.accept(Long.valueOf(((Cursor) obj).getLong(0)));
    }
}
