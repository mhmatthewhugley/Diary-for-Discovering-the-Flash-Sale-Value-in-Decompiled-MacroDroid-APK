package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLiteLruReferenceDelegate */
final /* synthetic */ class SQLiteLruReferenceDelegate$$Lambda$1 implements Function {

    /* renamed from: a */
    private static final SQLiteLruReferenceDelegate$$Lambda$1 f54321a = new SQLiteLruReferenceDelegate$$Lambda$1();

    private SQLiteLruReferenceDelegate$$Lambda$1() {
    }

    /* renamed from: a */
    public static Function m75610a() {
        return f54321a;
    }

    public Object apply(Object obj) {
        return Long.valueOf(((Cursor) obj).getLong(0));
    }
}
