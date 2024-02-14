package com.google.firebase.firestore.model;

import com.google.firebase.Timestamp;

public final class SnapshotVersion implements Comparable<SnapshotVersion> {

    /* renamed from: c */
    public static final SnapshotVersion f54468c = new SnapshotVersion(new Timestamp(0, 0));

    /* renamed from: a */
    private final Timestamp f54469a;

    public SnapshotVersion(Timestamp timestamp) {
        this.f54469a = timestamp;
    }

    /* renamed from: b */
    public int compareTo(SnapshotVersion snapshotVersion) {
        return this.f54469a.compareTo(snapshotVersion.f54469a);
    }

    /* renamed from: d */
    public Timestamp mo62876d() {
        return this.f54469a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof SnapshotVersion) && compareTo((SnapshotVersion) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return mo62876d().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f54469a.mo61973e() + ", nanos=" + this.f54469a.mo61971d() + ")";
    }
}
