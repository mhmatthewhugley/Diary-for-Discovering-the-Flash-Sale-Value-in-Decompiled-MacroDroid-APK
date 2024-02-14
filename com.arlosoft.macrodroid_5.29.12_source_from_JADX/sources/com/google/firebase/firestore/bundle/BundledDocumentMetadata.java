package com.google.firebase.firestore.bundle;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.List;

public class BundledDocumentMetadata implements BundleElement {

    /* renamed from: a */
    private final DocumentKey f5794a;

    /* renamed from: b */
    private final SnapshotVersion f5795b;

    /* renamed from: c */
    private final boolean f5796c;

    /* renamed from: d */
    private final List<String> f5797d;

    public BundledDocumentMetadata(DocumentKey documentKey, SnapshotVersion snapshotVersion, boolean z, List<String> list) {
        this.f5794a = documentKey;
        this.f5795b = snapshotVersion;
        this.f5796c = z;
        this.f5797d = list;
    }

    /* renamed from: a */
    public boolean mo23785a() {
        return this.f5796c;
    }

    /* renamed from: b */
    public DocumentKey mo23786b() {
        return this.f5794a;
    }

    /* renamed from: c */
    public List<String> mo23787c() {
        return this.f5797d;
    }

    /* renamed from: d */
    public SnapshotVersion mo23788d() {
        return this.f5795b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BundledDocumentMetadata bundledDocumentMetadata = (BundledDocumentMetadata) obj;
        if (this.f5796c == bundledDocumentMetadata.f5796c && this.f5794a.equals(bundledDocumentMetadata.f5794a) && this.f5795b.equals(bundledDocumentMetadata.f5795b)) {
            return this.f5797d.equals(bundledDocumentMetadata.f5797d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f5794a.hashCode() * 31) + this.f5795b.hashCode()) * 31) + (this.f5796c ? 1 : 0)) * 31) + this.f5797d.hashCode();
    }
}
