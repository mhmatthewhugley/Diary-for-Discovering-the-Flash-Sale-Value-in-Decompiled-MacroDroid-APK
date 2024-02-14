package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$5 implements Function {

    /* renamed from: a */
    private final SQLiteMutationQueue f54342a;

    private SQLiteMutationQueue$$Lambda$5(SQLiteMutationQueue sQLiteMutationQueue) {
        this.f54342a = sQLiteMutationQueue;
    }

    /* renamed from: a */
    public static Function m75654a(SQLiteMutationQueue sQLiteMutationQueue) {
        return new SQLiteMutationQueue$$Lambda$5(sQLiteMutationQueue);
    }

    public Object apply(Object obj) {
        return this.f54342a.m75616n(((Cursor) obj).getInt(0), ((Cursor) obj).getBlob(1));
    }
}
