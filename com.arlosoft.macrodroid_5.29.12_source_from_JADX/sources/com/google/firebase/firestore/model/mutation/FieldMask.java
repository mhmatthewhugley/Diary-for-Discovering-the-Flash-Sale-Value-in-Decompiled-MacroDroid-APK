package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.FieldPath;
import java.util.Set;

public final class FieldMask {

    /* renamed from: a */
    private final Set<FieldPath> f54474a;

    private FieldMask(Set<FieldPath> set) {
        this.f54474a = set;
    }

    /* renamed from: a */
    public static FieldMask m75950a(Set<FieldPath> set) {
        return new FieldMask(set);
    }

    /* renamed from: b */
    public Set<FieldPath> mo62892b() {
        return this.f54474a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldMask.class != obj.getClass()) {
            return false;
        }
        return this.f54474a.equals(((FieldMask) obj).f54474a);
    }

    public int hashCode() {
        return this.f54474a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.f54474a.toString() + "}";
    }
}
