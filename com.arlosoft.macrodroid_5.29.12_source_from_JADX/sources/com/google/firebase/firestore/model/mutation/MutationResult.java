package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firestore.p228v1.Value;
import java.util.List;

public final class MutationResult {

    /* renamed from: a */
    private final SnapshotVersion f54489a;

    /* renamed from: b */
    private final List<Value> f54490b;

    public MutationResult(SnapshotVersion snapshotVersion, List<Value> list) {
        this.f54489a = (SnapshotVersion) Preconditions.m76513b(snapshotVersion);
        this.f54490b = list;
    }

    /* renamed from: a */
    public List<Value> mo62926a() {
        return this.f54490b;
    }

    /* renamed from: b */
    public SnapshotVersion mo62927b() {
        return this.f54489a;
    }
}
