package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.protobuf.ByteString;

public final class TargetChange {

    /* renamed from: a */
    private final ByteString f54676a;

    /* renamed from: b */
    private final boolean f54677b;

    /* renamed from: c */
    private final ImmutableSortedSet<DocumentKey> f54678c;

    /* renamed from: d */
    private final ImmutableSortedSet<DocumentKey> f54679d;

    /* renamed from: e */
    private final ImmutableSortedSet<DocumentKey> f54680e;

    public TargetChange(ByteString byteString, boolean z, ImmutableSortedSet<DocumentKey> immutableSortedSet, ImmutableSortedSet<DocumentKey> immutableSortedSet2, ImmutableSortedSet<DocumentKey> immutableSortedSet3) {
        this.f54676a = byteString;
        this.f54677b = z;
        this.f54678c = immutableSortedSet;
        this.f54679d = immutableSortedSet2;
        this.f54680e = immutableSortedSet3;
    }

    /* renamed from: a */
    public static TargetChange m76369a(boolean z) {
        return new TargetChange(ByteString.f56619a, z, DocumentKey.m75847f(), DocumentKey.m75847f(), DocumentKey.m75847f());
    }

    /* renamed from: b */
    public ImmutableSortedSet<DocumentKey> mo63098b() {
        return this.f54678c;
    }

    /* renamed from: c */
    public ImmutableSortedSet<DocumentKey> mo63099c() {
        return this.f54679d;
    }

    /* renamed from: d */
    public ImmutableSortedSet<DocumentKey> mo63100d() {
        return this.f54680e;
    }

    /* renamed from: e */
    public ByteString mo63101e() {
        return this.f54676a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TargetChange.class != obj.getClass()) {
            return false;
        }
        TargetChange targetChange = (TargetChange) obj;
        if (this.f54677b == targetChange.f54677b && this.f54676a.equals(targetChange.f54676a) && this.f54678c.equals(targetChange.f54678c) && this.f54679d.equals(targetChange.f54679d)) {
            return this.f54680e.equals(targetChange.f54680e);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo63103f() {
        return this.f54677b;
    }

    public int hashCode() {
        return (((((((this.f54676a.hashCode() * 31) + (this.f54677b ? 1 : 0)) * 31) + this.f54678c.hashCode()) * 31) + this.f54679d.hashCode()) * 31) + this.f54680e.hashCode();
    }
}
