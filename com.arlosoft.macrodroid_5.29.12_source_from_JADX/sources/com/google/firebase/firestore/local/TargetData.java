package com.google.firebase.firestore.local;

import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.ByteString;

public final class TargetData {

    /* renamed from: a */
    private final Target f54429a;

    /* renamed from: b */
    private final int f54430b;

    /* renamed from: c */
    private final long f54431c;

    /* renamed from: d */
    private final QueryPurpose f54432d;

    /* renamed from: e */
    private final SnapshotVersion f54433e;

    /* renamed from: f */
    private final SnapshotVersion f54434f;

    /* renamed from: g */
    private final ByteString f54435g;

    TargetData(Target target, int i, long j, QueryPurpose queryPurpose, SnapshotVersion snapshotVersion, SnapshotVersion snapshotVersion2, ByteString byteString) {
        this.f54429a = (Target) Preconditions.m76513b(target);
        this.f54430b = i;
        this.f54431c = j;
        this.f54434f = snapshotVersion2;
        this.f54432d = queryPurpose;
        this.f54433e = (SnapshotVersion) Preconditions.m76513b(snapshotVersion);
        this.f54435g = (ByteString) Preconditions.m76513b(byteString);
    }

    /* renamed from: a */
    public SnapshotVersion mo62781a() {
        return this.f54434f;
    }

    /* renamed from: b */
    public QueryPurpose mo62782b() {
        return this.f54432d;
    }

    /* renamed from: c */
    public ByteString mo62783c() {
        return this.f54435g;
    }

    /* renamed from: d */
    public long mo62784d() {
        return this.f54431c;
    }

    /* renamed from: e */
    public SnapshotVersion mo62785e() {
        return this.f54433e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TargetData.class != obj.getClass()) {
            return false;
        }
        TargetData targetData = (TargetData) obj;
        if (!this.f54429a.equals(targetData.f54429a) || this.f54430b != targetData.f54430b || this.f54431c != targetData.f54431c || !this.f54432d.equals(targetData.f54432d) || !this.f54433e.equals(targetData.f54433e) || !this.f54434f.equals(targetData.f54434f) || !this.f54435g.equals(targetData.f54435g)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Target mo62787f() {
        return this.f54429a;
    }

    /* renamed from: g */
    public int mo62788g() {
        return this.f54430b;
    }

    /* renamed from: h */
    public TargetData mo62789h(SnapshotVersion snapshotVersion) {
        return new TargetData(this.f54429a, this.f54430b, this.f54431c, this.f54432d, this.f54433e, snapshotVersion, this.f54435g);
    }

    public int hashCode() {
        return (((((((((((this.f54429a.hashCode() * 31) + this.f54430b) * 31) + ((int) this.f54431c)) * 31) + this.f54432d.hashCode()) * 31) + this.f54433e.hashCode()) * 31) + this.f54434f.hashCode()) * 31) + this.f54435g.hashCode();
    }

    /* renamed from: i */
    public TargetData mo62791i(ByteString byteString, SnapshotVersion snapshotVersion) {
        return new TargetData(this.f54429a, this.f54430b, this.f54431c, this.f54432d, snapshotVersion, this.f54434f, byteString);
    }

    /* renamed from: j */
    public TargetData mo62792j(long j) {
        return new TargetData(this.f54429a, this.f54430b, j, this.f54432d, this.f54433e, this.f54434f, this.f54435g);
    }

    public String toString() {
        return "TargetData{target=" + this.f54429a + ", targetId=" + this.f54430b + ", sequenceNumber=" + this.f54431c + ", purpose=" + this.f54432d + ", snapshotVersion=" + this.f54433e + ", lastLimboFreeSnapshotVersion=" + this.f54434f + ", resumeToken=" + this.f54435g + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TargetData(com.google.firebase.firestore.core.Target r10, int r11, long r12, com.google.firebase.firestore.local.QueryPurpose r14) {
        /*
            r9 = this;
            com.google.firebase.firestore.model.SnapshotVersion r7 = com.google.firebase.firestore.model.SnapshotVersion.f54468c
            com.google.protobuf.ByteString r8 = com.google.firebase.firestore.remote.WatchStream.f54709q
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
            r6 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.TargetData.<init>(com.google.firebase.firestore.core.Target, int, long, com.google.firebase.firestore.local.QueryPurpose):void");
    }
}
