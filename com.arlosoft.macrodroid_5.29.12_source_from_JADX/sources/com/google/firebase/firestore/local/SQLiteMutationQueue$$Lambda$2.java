package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$2 implements Consumer {

    /* renamed from: a */
    private final List f54338a;

    private SQLiteMutationQueue$$Lambda$2(List list) {
        this.f54338a = list;
    }

    /* renamed from: a */
    public static Consumer m75651a(List list) {
        return new SQLiteMutationQueue$$Lambda$2(list);
    }

    public void accept(Object obj) {
        this.f54338a.add(((Cursor) obj).getString(0));
    }
}
