package com.google.firebase.firestore;

import java.util.regex.Pattern;

public final class FieldPath {

    /* renamed from: b */
    private static final Pattern f5649b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c */
    private static final FieldPath f5650c = new FieldPath(com.google.firebase.firestore.model.FieldPath.f54449c);

    /* renamed from: a */
    private final com.google.firebase.firestore.model.FieldPath f5651a;

    private FieldPath(com.google.firebase.firestore.model.FieldPath fieldPath) {
        this.f5651a = fieldPath;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldPath.class != obj.getClass()) {
            return false;
        }
        return this.f5651a.equals(((FieldPath) obj).f5651a);
    }

    public int hashCode() {
        return this.f5651a.hashCode();
    }

    public String toString() {
        return this.f5651a.toString();
    }
}
