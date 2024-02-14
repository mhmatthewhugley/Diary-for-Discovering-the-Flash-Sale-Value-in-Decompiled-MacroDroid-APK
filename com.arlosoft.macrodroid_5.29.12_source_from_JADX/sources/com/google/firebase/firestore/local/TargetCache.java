package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;

interface TargetCache {
    /* renamed from: a */
    void mo62710a(TargetData targetData);

    /* renamed from: b */
    void mo62711b(SnapshotVersion snapshotVersion);

    /* renamed from: c */
    void mo62712c(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i);

    /* renamed from: d */
    void mo62713d(TargetData targetData);

    @Nullable
    /* renamed from: e */
    TargetData mo62714e(Target target);

    /* renamed from: f */
    int mo62715f();

    /* renamed from: g */
    ImmutableSortedSet<DocumentKey> mo62716g(int i);

    /* renamed from: h */
    SnapshotVersion mo62717h();

    /* renamed from: i */
    void mo62718i(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i);

    /* renamed from: j */
    void mo62719j(int i);
}
