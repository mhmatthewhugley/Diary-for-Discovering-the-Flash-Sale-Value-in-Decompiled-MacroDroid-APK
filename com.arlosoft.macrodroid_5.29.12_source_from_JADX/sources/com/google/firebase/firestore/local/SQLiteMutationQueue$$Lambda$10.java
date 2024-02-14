package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.util.Util;
import java.util.Comparator;

/* compiled from: SQLiteMutationQueue */
final /* synthetic */ class SQLiteMutationQueue$$Lambda$10 implements Comparator {

    /* renamed from: a */
    private static final SQLiteMutationQueue$$Lambda$10 f54333a = new SQLiteMutationQueue$$Lambda$10();

    private SQLiteMutationQueue$$Lambda$10() {
    }

    /* renamed from: a */
    public static Comparator m75648a() {
        return f54333a;
    }

    public int compare(Object obj, Object obj2) {
        return Util.m76522e(((MutationBatch) obj).mo62914e(), ((MutationBatch) obj2).mo62914e());
    }
}
