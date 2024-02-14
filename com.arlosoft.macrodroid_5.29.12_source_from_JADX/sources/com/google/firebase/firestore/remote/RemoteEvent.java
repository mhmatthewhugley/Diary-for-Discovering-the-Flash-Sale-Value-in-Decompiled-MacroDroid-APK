package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.Map;
import java.util.Set;

public final class RemoteEvent {

    /* renamed from: a */
    private final SnapshotVersion f54635a;

    /* renamed from: b */
    private final Map<Integer, TargetChange> f54636b;

    /* renamed from: c */
    private final Set<Integer> f54637c;

    /* renamed from: d */
    private final Map<DocumentKey, MutableDocument> f54638d;

    /* renamed from: e */
    private final Set<DocumentKey> f54639e;

    public RemoteEvent(SnapshotVersion snapshotVersion, Map<Integer, TargetChange> map, Set<Integer> set, Map<DocumentKey, MutableDocument> map2, Set<DocumentKey> set2) {
        this.f54635a = snapshotVersion;
        this.f54636b = map;
        this.f54637c = set;
        this.f54638d = map2;
        this.f54639e = set2;
    }

    /* renamed from: a */
    public Map<DocumentKey, MutableDocument> mo63050a() {
        return this.f54638d;
    }

    /* renamed from: b */
    public Set<DocumentKey> mo63051b() {
        return this.f54639e;
    }

    /* renamed from: c */
    public SnapshotVersion mo63052c() {
        return this.f54635a;
    }

    /* renamed from: d */
    public Map<Integer, TargetChange> mo63053d() {
        return this.f54636b;
    }

    /* renamed from: e */
    public Set<Integer> mo63054e() {
        return this.f54637c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f54635a + ", targetChanges=" + this.f54636b + ", targetMismatches=" + this.f54637c + ", documentUpdates=" + this.f54638d + ", resolvedLimboDocuments=" + this.f54639e + '}';
    }
}
