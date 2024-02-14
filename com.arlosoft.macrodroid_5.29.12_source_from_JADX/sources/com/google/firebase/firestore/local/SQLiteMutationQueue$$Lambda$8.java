package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$8 implements Consumer {

    /* renamed from: a */
    private final SQLiteMutationQueue f54346a;

    /* renamed from: b */
    private final List f54347b;

    private SQLiteMutationQueue$$Lambda$8(SQLiteMutationQueue sQLiteMutationQueue, List list) {
        this.f54346a = sQLiteMutationQueue;
        this.f54347b = list;
    }

    /* renamed from: a */
    public static Consumer m75657a(SQLiteMutationQueue sQLiteMutationQueue, List list) {
        return new SQLiteMutationQueue$$Lambda$8(sQLiteMutationQueue, list);
    }

    public void accept(Object obj) {
        this.f54347b.add(this.f54346a.m75616n(((Cursor) obj).getInt(0), ((Cursor) obj).getBlob(1)));
    }
}
