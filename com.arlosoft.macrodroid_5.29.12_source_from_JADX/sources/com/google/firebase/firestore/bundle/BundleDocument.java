package com.google.firebase.firestore.bundle;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;

public class BundleDocument implements BundleElement {

    /* renamed from: a */
    private MutableDocument f5773a;

    public BundleDocument(MutableDocument mutableDocument) {
        this.f5773a = mutableDocument;
    }

    /* renamed from: a */
    public MutableDocument mo23764a() {
        return this.f5773a;
    }

    /* renamed from: b */
    public DocumentKey mo23765b() {
        return this.f5773a.getKey();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5773a.equals(((BundleDocument) obj).f5773a);
    }

    public int hashCode() {
        return this.f5773a.hashCode();
    }
}
