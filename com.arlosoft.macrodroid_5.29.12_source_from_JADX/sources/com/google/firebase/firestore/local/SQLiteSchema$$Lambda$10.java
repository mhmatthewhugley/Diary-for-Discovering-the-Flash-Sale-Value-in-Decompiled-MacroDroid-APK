package com.google.firebase.firestore.local;

import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.local.MemoryIndexManager;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteSchema */
final /* synthetic */ class SQLiteSchema$$Lambda$10 implements Consumer {

    /* renamed from: a */
    private final MemoryIndexManager.MemoryCollectionParentIndex f54393a;

    /* renamed from: b */
    private final SQLiteStatement f54394b;

    private SQLiteSchema$$Lambda$10(MemoryIndexManager.MemoryCollectionParentIndex memoryCollectionParentIndex, SQLiteStatement sQLiteStatement) {
        this.f54393a = memoryCollectionParentIndex;
        this.f54394b = sQLiteStatement;
    }

    /* renamed from: a */
    public static Consumer m75754a(MemoryIndexManager.MemoryCollectionParentIndex memoryCollectionParentIndex, SQLiteStatement sQLiteStatement) {
        return new SQLiteSchema$$Lambda$10(memoryCollectionParentIndex, sQLiteStatement);
    }

    public void accept(Object obj) {
        SQLiteSchema.m75745v(this.f54393a, this.f54394b, (ResourcePath) obj);
    }
}
