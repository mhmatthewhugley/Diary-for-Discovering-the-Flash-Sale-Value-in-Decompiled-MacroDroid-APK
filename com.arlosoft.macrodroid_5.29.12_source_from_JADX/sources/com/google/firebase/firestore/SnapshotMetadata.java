package com.google.firebase.firestore;

import androidx.annotation.Nullable;

public class SnapshotMetadata {

    /* renamed from: a */
    private final boolean f5752a;

    /* renamed from: b */
    private final boolean f5753b;

    SnapshotMetadata(boolean z, boolean z2) {
        this.f5752a = z;
        this.f5753b = z2;
    }

    /* renamed from: a */
    public boolean mo23749a() {
        return this.f5753b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        SnapshotMetadata snapshotMetadata = (SnapshotMetadata) obj;
        if (this.f5752a == snapshotMetadata.f5752a && this.f5753b == snapshotMetadata.f5753b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5752a ? 1 : 0) * true) + (this.f5753b ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f5752a + ", isFromCache=" + this.f5753b + '}';
    }
}
