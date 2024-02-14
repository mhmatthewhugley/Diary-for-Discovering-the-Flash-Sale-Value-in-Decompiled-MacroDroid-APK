package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$12 implements Consumer {

    /* renamed from: a */
    private final List f54337a;

    private SQLiteMutationQueue$$Lambda$12(List list) {
        this.f54337a = list;
    }

    /* renamed from: a */
    public static Consumer m75650a(List list) {
        return new SQLiteMutationQueue$$Lambda$12(list);
    }

    public void accept(Object obj) {
        this.f54337a.add(EncodedPath.m75289b(((Cursor) obj).getString(0)));
    }
}
