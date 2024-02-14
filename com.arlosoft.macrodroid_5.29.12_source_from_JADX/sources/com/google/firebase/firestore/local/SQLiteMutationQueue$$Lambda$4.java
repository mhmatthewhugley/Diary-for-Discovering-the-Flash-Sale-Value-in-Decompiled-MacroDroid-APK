package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$4 implements Function {

    /* renamed from: a */
    private final SQLiteMutationQueue f54340a;

    /* renamed from: b */
    private final int f54341b;

    private SQLiteMutationQueue$$Lambda$4(SQLiteMutationQueue sQLiteMutationQueue, int i) {
        this.f54340a = sQLiteMutationQueue;
        this.f54341b = i;
    }

    /* renamed from: a */
    public static Function m75653a(SQLiteMutationQueue sQLiteMutationQueue, int i) {
        return new SQLiteMutationQueue$$Lambda$4(sQLiteMutationQueue, i);
    }

    public Object apply(Object obj) {
        return this.f54340a.m75616n(this.f54341b, ((Cursor) obj).getBlob(0));
    }
}
