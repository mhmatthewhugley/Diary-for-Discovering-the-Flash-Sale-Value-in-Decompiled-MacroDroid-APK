package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;

public final class Precondition {

    /* renamed from: c */
    public static final Precondition f54494c = new Precondition((SnapshotVersion) null, (Boolean) null);
    @Nullable

    /* renamed from: a */
    private final SnapshotVersion f54495a;
    @Nullable

    /* renamed from: b */
    private final Boolean f54496b;

    private Precondition(@Nullable SnapshotVersion snapshotVersion, @Nullable Boolean bool) {
        Assert.m76443d(snapshotVersion == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f54495a = snapshotVersion;
        this.f54496b = bool;
    }

    /* renamed from: a */
    public static Precondition m75995a(boolean z) {
        return new Precondition((SnapshotVersion) null, Boolean.valueOf(z));
    }

    /* renamed from: f */
    public static Precondition m75996f(SnapshotVersion snapshotVersion) {
        return new Precondition(snapshotVersion, (Boolean) null);
    }

    @Nullable
    /* renamed from: b */
    public Boolean mo62934b() {
        return this.f54496b;
    }

    @Nullable
    /* renamed from: c */
    public SnapshotVersion mo62935c() {
        return this.f54495a;
    }

    /* renamed from: d */
    public boolean mo62936d() {
        return this.f54495a == null && this.f54496b == null;
    }

    /* renamed from: e */
    public boolean mo62937e(MutableDocument mutableDocument) {
        if (this.f54495a == null) {
            Boolean bool = this.f54496b;
            if (bool == null) {
                Assert.m76443d(mo62936d(), "Precondition should be empty", new Object[0]);
                return true;
            } else if (bool.booleanValue() == mutableDocument.mo62822e()) {
                return true;
            } else {
                return false;
            }
        } else if (!mutableDocument.mo62822e() || !mutableDocument.getVersion().equals(this.f54495a)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Precondition.class != obj.getClass()) {
            return false;
        }
        Precondition precondition = (Precondition) obj;
        SnapshotVersion snapshotVersion = this.f54495a;
        if (snapshotVersion == null ? precondition.f54495a != null : !snapshotVersion.equals(precondition.f54495a)) {
            return false;
        }
        Boolean bool = this.f54496b;
        Boolean bool2 = precondition.f54496b;
        if (bool != null) {
            return bool.equals(bool2);
        }
        if (bool2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        SnapshotVersion snapshotVersion = this.f54495a;
        int i = 0;
        int hashCode = (snapshotVersion != null ? snapshotVersion.hashCode() : 0) * 31;
        Boolean bool = this.f54496b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        if (mo62936d()) {
            return "Precondition{<none>}";
        }
        if (this.f54495a != null) {
            return "Precondition{updateTime=" + this.f54495a + "}";
        } else if (this.f54496b != null) {
            return "Precondition{exists=" + this.f54496b + "}";
        } else {
            throw Assert.m76440a("Invalid Precondition", new Object[0]);
        }
    }
}
