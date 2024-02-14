package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.annotation.Annotation;
import java.util.Objects;

/* renamed from: com.android.dx.rop.cst.CstAnnotation */
public final class CstAnnotation extends Constant {
    private final Annotation annotation;

    public CstAnnotation(Annotation annotation2) {
        Objects.requireNonNull(annotation2, "annotation == null");
        annotation2.throwIfMutable();
        this.annotation = annotation2;
    }

    /* access modifiers changed from: protected */
    public int compareTo0(Constant constant) {
        return this.annotation.compareTo(((CstAnnotation) constant).annotation);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CstAnnotation)) {
            return false;
        }
        return this.annotation.equals(((CstAnnotation) obj).annotation);
    }

    public Annotation getAnnotation() {
        return this.annotation;
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    public boolean isCategory2() {
        return false;
    }

    public String toHuman() {
        return this.annotation.toString();
    }

    public String toString() {
        return this.annotation.toString();
    }

    public String typeName() {
        return "annotation";
    }
}
