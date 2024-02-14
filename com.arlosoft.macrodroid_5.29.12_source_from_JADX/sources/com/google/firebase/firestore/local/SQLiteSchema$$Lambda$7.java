package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$7 implements Function {

    /* renamed from: a */
    private static final SQLiteSchema$$Lambda$7 f54406a = new SQLiteSchema$$Lambda$7();

    private SQLiteSchema$$Lambda$7() {
    }

    /* renamed from: a */
    public static Function m75765a() {
        return f54406a;
    }

    public Object apply(Object obj) {
        return Long.valueOf(((Cursor) obj).getLong(0));
    }
}
