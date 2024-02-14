package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLiteBundleCache */
final /* synthetic */ class SQLiteBundleCache$$Lambda$2 implements Function {

    /* renamed from: a */
    private final SQLiteBundleCache f54311a;

    /* renamed from: b */
    private final String f54312b;

    private SQLiteBundleCache$$Lambda$2(SQLiteBundleCache sQLiteBundleCache, String str) {
        this.f54311a = sQLiteBundleCache;
        this.f54312b = str;
    }

    /* renamed from: a */
    public static Function m75580a(SQLiteBundleCache sQLiteBundleCache, String str) {
        return new SQLiteBundleCache$$Lambda$2(sQLiteBundleCache, str);
    }

    public Object apply(Object obj) {
        return SQLiteBundleCache.m75574f(this.f54311a, this.f54312b, (Cursor) obj);
    }
}
