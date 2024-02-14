package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.DocumentKey;

public class LimboDocumentChange {

    /* renamed from: a */
    private final Type f5929a;

    /* renamed from: b */
    private final DocumentKey f5930b;

    public enum Type {
        ADDED,
        REMOVED
    }

    public LimboDocumentChange(Type type, DocumentKey documentKey) {
        this.f5929a = type;
        this.f5930b = documentKey;
    }

    /* renamed from: a */
    public DocumentKey mo23892a() {
        return this.f5930b;
    }

    /* renamed from: b */
    public Type mo23893b() {
        return this.f5929a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LimboDocumentChange)) {
            return false;
        }
        LimboDocumentChange limboDocumentChange = (LimboDocumentChange) obj;
        if (!this.f5929a.equals(limboDocumentChange.mo23893b()) || !this.f5930b.equals(limboDocumentChange.mo23892a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((2077 + this.f5929a.hashCode()) * 31) + this.f5930b.hashCode();
    }
}
