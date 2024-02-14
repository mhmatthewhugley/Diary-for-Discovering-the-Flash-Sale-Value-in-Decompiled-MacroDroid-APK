package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;

public class DocumentViewChange {

    /* renamed from: a */
    private final Type f5838a;

    /* renamed from: b */
    private final Document f5839b;

    public enum Type {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    private DocumentViewChange(Type type, Document document) {
        this.f5838a = type;
        this.f5839b = document;
    }

    /* renamed from: a */
    public static DocumentViewChange m8047a(Type type, Document document) {
        return new DocumentViewChange(type, document);
    }

    /* renamed from: b */
    public Document mo23844b() {
        return this.f5839b;
    }

    /* renamed from: c */
    public Type mo23845c() {
        return this.f5838a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DocumentViewChange)) {
            return false;
        }
        DocumentViewChange documentViewChange = (DocumentViewChange) obj;
        if (!this.f5838a.equals(documentViewChange.f5838a) || !this.f5839b.equals(documentViewChange.f5839b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((1891 + this.f5838a.hashCode()) * 31) + this.f5839b.getKey().hashCode()) * 31) + this.f5839b.getData().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.f5839b + "," + this.f5838a + ")";
    }
}
