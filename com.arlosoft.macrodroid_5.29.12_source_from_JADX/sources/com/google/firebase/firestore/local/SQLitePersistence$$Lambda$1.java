package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLitePersistence */
final /* synthetic */ class SQLitePersistence$$Lambda$1 implements Function {

    /* renamed from: a */
    private static final SQLitePersistence$$Lambda$1 f54373a = new SQLitePersistence$$Lambda$1();

    private SQLitePersistence$$Lambda$1() {
    }

    /* renamed from: a */
    public static Function m75697a() {
        return f54373a;
    }

    public Object apply(Object obj) {
        return Long.valueOf(((Cursor) obj).getLong(0));
    }
}
