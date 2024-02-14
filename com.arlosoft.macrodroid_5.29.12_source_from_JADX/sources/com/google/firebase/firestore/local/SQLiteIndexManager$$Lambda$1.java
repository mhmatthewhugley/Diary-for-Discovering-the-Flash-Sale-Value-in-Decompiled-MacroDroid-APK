package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;

/* compiled from: SQLiteIndexManager */
final /* synthetic */ class SQLiteIndexManager$$Lambda$1 implements Consumer {

    /* renamed from: a */
    private final ArrayList f54315a;

    private SQLiteIndexManager$$Lambda$1(ArrayList arrayList) {
        this.f54315a = arrayList;
    }

    /* renamed from: a */
    public static Consumer m75585a(ArrayList arrayList) {
        return new SQLiteIndexManager$$Lambda$1(arrayList);
    }

    public void accept(Object obj) {
        this.f54315a.add(EncodedPath.m75289b(((Cursor) obj).getString(0)));
    }
}
