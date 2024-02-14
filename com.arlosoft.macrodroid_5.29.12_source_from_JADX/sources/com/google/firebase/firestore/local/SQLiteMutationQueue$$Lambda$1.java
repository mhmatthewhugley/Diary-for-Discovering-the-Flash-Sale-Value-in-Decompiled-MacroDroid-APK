package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import com.google.protobuf.ByteString;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$1 implements Consumer {

    /* renamed from: a */
    private final SQLiteMutationQueue f54332a;

    private SQLiteMutationQueue$$Lambda$1(SQLiteMutationQueue sQLiteMutationQueue) {
        this.f54332a = sQLiteMutationQueue;
    }

    /* renamed from: a */
    public static Consumer m75647a(SQLiteMutationQueue sQLiteMutationQueue) {
        return new SQLiteMutationQueue$$Lambda$1(sQLiteMutationQueue);
    }

    public void accept(Object obj) {
        this.f54332a.f54329e = ByteString.m79773p(((Cursor) obj).getBlob(0));
    }
}
