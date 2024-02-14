package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteLruReferenceDelegate */
final /* synthetic */ class SQLiteLruReferenceDelegate$$Lambda$3 implements Consumer {

    /* renamed from: a */
    private final SQLiteLruReferenceDelegate f54323a;

    /* renamed from: b */
    private final int[] f54324b;

    private SQLiteLruReferenceDelegate$$Lambda$3(SQLiteLruReferenceDelegate sQLiteLruReferenceDelegate, int[] iArr) {
        this.f54323a = sQLiteLruReferenceDelegate;
        this.f54324b = iArr;
    }

    /* renamed from: a */
    public static Consumer m75612a(SQLiteLruReferenceDelegate sQLiteLruReferenceDelegate, int[] iArr) {
        return new SQLiteLruReferenceDelegate$$Lambda$3(sQLiteLruReferenceDelegate, iArr);
    }

    public void accept(Object obj) {
        SQLiteLruReferenceDelegate.m75589t(this.f54323a, this.f54324b, (Cursor) obj);
    }
}
