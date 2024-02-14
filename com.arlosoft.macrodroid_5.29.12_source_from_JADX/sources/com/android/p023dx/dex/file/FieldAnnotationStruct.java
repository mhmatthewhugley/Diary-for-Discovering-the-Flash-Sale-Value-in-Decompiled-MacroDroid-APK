package com.android.p023dx.dex.file;

import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.ToHuman;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.FieldAnnotationStruct */
public final class FieldAnnotationStruct implements ToHuman, Comparable<FieldAnnotationStruct> {
    private AnnotationSetItem annotations;
    private final CstFieldRef field;

    public FieldAnnotationStruct(CstFieldRef cstFieldRef, AnnotationSetItem annotationSetItem) {
        Objects.requireNonNull(cstFieldRef, "field == null");
        Objects.requireNonNull(annotationSetItem, "annotations == null");
        this.field = cstFieldRef;
        this.annotations = annotationSetItem;
    }

    public void addContents(DexFile dexFile) {
        FieldIdsSection fieldIds = dexFile.getFieldIds();
        MixedItemSection wordData = dexFile.getWordData();
        fieldIds.intern(this.field);
        this.annotations = (AnnotationSetItem) wordData.intern(this.annotations);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FieldAnnotationStruct)) {
            return false;
        }
        return this.field.equals(((FieldAnnotationStruct) obj).field);
    }

    public Annotations getAnnotations() {
        return this.annotations.getAnnotations();
    }

    public CstFieldRef getField() {
        return this.field;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    public String toHuman() {
        return this.field.toHuman() + ": " + this.annotations;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int indexOf = dexFile.getFieldIds().indexOf(this.field);
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, "    " + this.field.toHuman());
            annotatedOutput.annotate(4, "      field_idx:       " + Hex.m909u4(indexOf));
            annotatedOutput.annotate(4, "      annotations_off: " + Hex.m909u4(absoluteOffset));
        }
        annotatedOutput.writeInt(indexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }

    public int compareTo(FieldAnnotationStruct fieldAnnotationStruct) {
        return this.field.compareTo((Constant) fieldAnnotationStruct.field);
    }
}
