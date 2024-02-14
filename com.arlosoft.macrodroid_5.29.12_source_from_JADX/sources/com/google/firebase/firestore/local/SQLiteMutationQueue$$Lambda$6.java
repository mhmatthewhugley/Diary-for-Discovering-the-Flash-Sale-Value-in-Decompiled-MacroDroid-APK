package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$6 implements Function {

    /* renamed from: a */
    private static final SQLiteMutationQueue$$Lambda$6 f54343a = new SQLiteMutationQueue$$Lambda$6();

    private SQLiteMutationQueue$$Lambda$6() {
    }

    /* renamed from: a */
    public static Function m75655a() {
        return f54343a;
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((Cursor) obj).getInt(0));
    }
}
