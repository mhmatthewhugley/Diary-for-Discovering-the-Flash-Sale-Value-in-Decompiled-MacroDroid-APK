package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLitePersistence */
final /* synthetic */ class SQLitePersistence$$Lambda$2 implements Function {

    /* renamed from: a */
    private static final SQLitePersistence$$Lambda$2 f54374a = new SQLitePersistence$$Lambda$2();

    private SQLitePersistence$$Lambda$2() {
    }

    /* renamed from: a */
    public static Function m75698a() {
        return f54374a;
    }

    public Object apply(Object obj) {
        return Long.valueOf(((Cursor) obj).getLong(0));
    }
}
