package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$3 implements Consumer {

    /* renamed from: a */
    private final SQLiteMutationQueue f54339a;

    private SQLiteMutationQueue$$Lambda$3(SQLiteMutationQueue sQLiteMutationQueue) {
        this.f54339a = sQLiteMutationQueue;
    }

    /* renamed from: a */
    public static Consumer m75652a(SQLiteMutationQueue sQLiteMutationQueue) {
        return new SQLiteMutationQueue$$Lambda$3(sQLiteMutationQueue);
    }

    public void accept(Object obj) {
        this.f54339a.f54328d = Math.max(this.f54339a.f54328d, ((Cursor) obj).getInt(0));
    }
}
