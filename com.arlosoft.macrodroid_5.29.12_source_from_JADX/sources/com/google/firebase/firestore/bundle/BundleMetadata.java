package com.google.firebase.firestore.bundle;

import com.google.firebase.firestore.model.SnapshotVersion;

public class BundleMetadata implements BundleElement {

    /* renamed from: a */
    private final String f5781a;

    /* renamed from: b */
    private final int f5782b;

    /* renamed from: c */
    private final SnapshotVersion f5783c;

    /* renamed from: d */
    private final int f5784d;

    /* renamed from: e */
    private final long f5785e;

    public BundleMetadata(String str, int i, SnapshotVersion snapshotVersion, int i2, long j) {
        this.f5781a = str;
        this.f5782b = i;
        this.f5783c = snapshotVersion;
        this.f5784d = i2;
        this.f5785e = j;
    }

    /* renamed from: a */
    public String mo23770a() {
        return this.f5781a;
    }

    /* renamed from: b */
    public SnapshotVersion mo23771b() {
        return this.f5783c;
    }

    /* renamed from: c */
    public int mo23772c() {
        return this.f5782b;
    }

    /* renamed from: d */
    public long mo23773d() {
        return this.f5785e;
    }

    /* renamed from: e */
    public int mo23774e() {
        return this.f5784d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BundleMetadata bundleMetadata = (BundleMetadata) obj;
        if (this.f5782b == bundleMetadata.f5782b && this.f5784d == bundleMetadata.f5784d && this.f5785e == bundleMetadata.f5785e && this.f5781a.equals(bundleMetadata.f5781a)) {
            return this.f5783c.equals(bundleMetadata.f5783c);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5785e;
        return (((((((this.f5781a.hashCode() * 31) + this.f5782b) * 31) + this.f5784d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f5783c.hashCode();
    }
}
