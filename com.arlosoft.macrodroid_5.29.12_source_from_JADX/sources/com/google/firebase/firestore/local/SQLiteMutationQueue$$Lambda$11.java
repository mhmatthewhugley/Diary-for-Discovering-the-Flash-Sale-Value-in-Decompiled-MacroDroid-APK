package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$11 implements Consumer {

    /* renamed from: a */
    private final SQLiteMutationQueue f54334a;

    /* renamed from: b */
    private final List f54335b;

    /* renamed from: c */
    private final int f54336c;

    private SQLiteMutationQueue$$Lambda$11(SQLiteMutationQueue sQLiteMutationQueue, List list, int i) {
        this.f54334a = sQLiteMutationQueue;
        this.f54335b = list;
        this.f54336c = i;
    }

    /* renamed from: a */
    public static Consumer m75649a(SQLiteMutationQueue sQLiteMutationQueue, List list, int i) {
        return new SQLiteMutationQueue$$Lambda$11(sQLiteMutationQueue, list, i);
    }

    public void accept(Object obj) {
        SQLiteMutationQueue.m75621t(this.f54334a, this.f54335b, this.f54336c, (Cursor) obj);
    }
}
