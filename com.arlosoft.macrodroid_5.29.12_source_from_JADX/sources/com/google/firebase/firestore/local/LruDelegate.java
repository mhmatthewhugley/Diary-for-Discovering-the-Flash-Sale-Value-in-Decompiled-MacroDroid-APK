package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.firestore.util.Consumer;

public interface LruDelegate {
    /* renamed from: a */
    long mo62638a();

    /* renamed from: b */
    void mo62639b(Consumer<Long> consumer);

    /* renamed from: c */
    LruGarbageCollector mo62640c();

    /* renamed from: e */
    int mo62641e(long j);

    /* renamed from: f */
    int mo62642f(long j, SparseArray<?> sparseArray);

    /* renamed from: k */
    void mo62643k(Consumer<TargetData> consumer);

    /* renamed from: m */
    long mo62644m();
}
