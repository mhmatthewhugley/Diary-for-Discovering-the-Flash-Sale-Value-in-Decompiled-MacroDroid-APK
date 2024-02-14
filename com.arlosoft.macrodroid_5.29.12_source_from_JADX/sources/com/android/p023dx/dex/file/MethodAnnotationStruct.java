package com.android.p023dx.dex.file;

import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.ToHuman;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.MethodAnnotationStruct */
public final class MethodAnnotationStruct implements ToHuman, Comparable<MethodAnnotationStruct> {
    private AnnotationSetItem annotations;
    private final CstMethodRef method;

    public MethodAnnotationStruct(CstMethodRef cstMethodRef, AnnotationSetItem annotationSetItem) {
        Objects.requireNonNull(cstMethodRef, "method == null");
        Objects.requireNonNull(annotationSetItem, "annotations == null");
        this.method = cstMethodRef;
        this.annotations = annotationSetItem;
    }

    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        this.annotations = (AnnotationSetItem) wordData.intern(this.annotations);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MethodAnnotationStruct)) {
            return false;
        }
        return this.method.equals(((MethodAnnotationStruct) obj).method);
    }

    public Annotations getAnnotations() {
        return this.annotations.getAnnotations();
    }

    public CstMethodRef getMethod() {
        return this.method;
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public String toHuman() {
        return this.method.toHuman() + ": " + this.annotations;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int indexOf = dexFile.getMethodIds().indexOf(this.method);
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, "    " + this.method.toHuman());
            annotatedOutput.annotate(4, "      method_idx:      " + Hex.m909u4(indexOf));
            annotatedOutput.annotate(4, "      annotations_off: " + Hex.m909u4(absoluteOffset));
        }
        annotatedOutput.writeInt(indexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }

    public int compareTo(MethodAnnotationStruct methodAnnotationStruct) {
        return this.method.compareTo((Constant) methodAnnotationStruct.method);
    }
}
