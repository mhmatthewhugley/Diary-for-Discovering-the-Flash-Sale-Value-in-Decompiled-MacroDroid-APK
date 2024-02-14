package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;
import java.util.Set;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$9 implements Consumer {

    /* renamed from: a */
    private final SQLiteMutationQueue f54348a;

    /* renamed from: b */
    private final Set f54349b;

    /* renamed from: c */
    private final List f54350c;

    private SQLiteMutationQueue$$Lambda$9(SQLiteMutationQueue sQLiteMutationQueue, Set set, List list) {
        this.f54348a = sQLiteMutationQueue;
        this.f54349b = set;
        this.f54350c = list;
    }

    /* renamed from: a */
    public static Consumer m75658a(SQLiteMutationQueue sQLiteMutationQueue, Set set, List list) {
        return new SQLiteMutationQueue$$Lambda$9(sQLiteMutationQueue, set, list);
    }

    public void accept(Object obj) {
        SQLiteMutationQueue.m75619r(this.f54348a, this.f54349b, this.f54350c, (Cursor) obj);
    }
}
