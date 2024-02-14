package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLiteBundleCache */
final /* synthetic */ class SQLiteBundleCache$$Lambda$1 implements Function {

    /* renamed from: a */
    private final String f54310a;

    private SQLiteBundleCache$$Lambda$1(String str) {
        this.f54310a = str;
    }

    /* renamed from: a */
    public static Function m75579a(String str) {
        return new SQLiteBundleCache$$Lambda$1(str);
    }

    public Object apply(Object obj) {
        return SQLiteBundleCache.m75573e(this.f54310a, (Cursor) obj);
    }
}
