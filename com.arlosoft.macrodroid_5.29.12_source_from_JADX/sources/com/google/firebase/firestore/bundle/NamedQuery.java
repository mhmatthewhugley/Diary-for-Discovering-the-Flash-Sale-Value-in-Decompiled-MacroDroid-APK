package com.google.firebase.firestore.bundle;

import com.google.firebase.firestore.model.SnapshotVersion;

public class NamedQuery implements BundleElement {

    /* renamed from: a */
    private final String f5800a;

    /* renamed from: b */
    private final BundledQuery f5801b;

    /* renamed from: c */
    private final SnapshotVersion f5802c;

    public NamedQuery(String str, BundledQuery bundledQuery, SnapshotVersion snapshotVersion) {
        this.f5800a = str;
        this.f5801b = bundledQuery;
        this.f5802c = snapshotVersion;
    }

    /* renamed from: a */
    public BundledQuery mo23795a() {
        return this.f5801b;
    }

    /* renamed from: b */
    public String mo23796b() {
        return this.f5800a;
    }

    /* renamed from: c */
    public SnapshotVersion mo23797c() {
        return this.f5802c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamedQuery namedQuery = (NamedQuery) obj;
        if (this.f5800a.equals(namedQuery.f5800a) && this.f5801b.equals(namedQuery.f5801b)) {
            return this.f5802c.equals(namedQuery.f5802c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5800a.hashCode() * 31) + this.f5801b.hashCode()) * 31) + this.f5802c.hashCode();
    }
}
