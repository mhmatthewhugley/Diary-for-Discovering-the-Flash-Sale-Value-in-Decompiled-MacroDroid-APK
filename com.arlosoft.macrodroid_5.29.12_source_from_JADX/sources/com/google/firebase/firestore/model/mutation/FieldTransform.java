package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.FieldPath;

public final class FieldTransform {

    /* renamed from: a */
    private final FieldPath f54475a;

    /* renamed from: b */
    private final TransformOperation f54476b;

    public FieldTransform(FieldPath fieldPath, TransformOperation transformOperation) {
        this.f54475a = fieldPath;
        this.f54476b = transformOperation;
    }

    /* renamed from: a */
    public FieldPath mo62896a() {
        return this.f54475a;
    }

    /* renamed from: b */
    public TransformOperation mo62897b() {
        return this.f54476b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldTransform.class != obj.getClass()) {
            return false;
        }
        FieldTransform fieldTransform = (FieldTransform) obj;
        if (!this.f54475a.equals(fieldTransform.f54475a)) {
            return false;
        }
        return this.f54476b.equals(fieldTransform.f54476b);
    }

    public int hashCode() {
        return (this.f54475a.hashCode() * 31) + this.f54476b.hashCode();
    }
}
