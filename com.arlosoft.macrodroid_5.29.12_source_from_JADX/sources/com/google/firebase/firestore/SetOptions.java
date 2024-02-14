package com.google.firebase.firestore;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.util.Preconditions;

public final class SetOptions {

    /* renamed from: c */
    static final SetOptions f5748c = new SetOptions(false, (FieldMask) null);

    /* renamed from: d */
    private static final SetOptions f5749d = new SetOptions(true, (FieldMask) null);

    /* renamed from: a */
    private final boolean f5750a;
    @Nullable

    /* renamed from: b */
    private final FieldMask f5751b;

    private SetOptions(boolean z, @Nullable FieldMask fieldMask) {
        Preconditions.m76512a(fieldMask == null || z, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.f5750a = z;
        this.f5751b = fieldMask;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SetOptions.class != obj.getClass()) {
            return false;
        }
        SetOptions setOptions = (SetOptions) obj;
        if (this.f5750a != setOptions.f5750a) {
            return false;
        }
        FieldMask fieldMask = this.f5751b;
        FieldMask fieldMask2 = setOptions.f5751b;
        if (fieldMask != null) {
            return fieldMask.equals(fieldMask2);
        }
        if (fieldMask2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f5750a ? 1 : 0) * true;
        FieldMask fieldMask = this.f5751b;
        return i + (fieldMask != null ? fieldMask.hashCode() : 0);
    }
}
