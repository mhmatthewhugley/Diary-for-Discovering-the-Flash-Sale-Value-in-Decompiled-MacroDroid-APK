package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$7 implements Consumer {

    /* renamed from: a */
    private final SQLiteMutationQueue f54344a;

    /* renamed from: b */
    private final List f54345b;

    private SQLiteMutationQueue$$Lambda$7(SQLiteMutationQueue sQLiteMutationQueue, List list) {
        this.f54344a = sQLiteMutationQueue;
        this.f54345b = list;
    }

    /* renamed from: a */
    public static Consumer m75656a(SQLiteMutationQueue sQLiteMutationQueue, List list) {
        return new SQLiteMutationQueue$$Lambda$7(sQLiteMutationQueue, list);
    }

    public void accept(Object obj) {
        this.f54345b.add(this.f54344a.m75616n(((Cursor) obj).getInt(0), ((Cursor) obj).getBlob(1)));
    }
}
