package com.android.p023dx.dex.file;

import com.android.p023dx.rop.annotation.AnnotationsList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.ToHuman;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.ParameterAnnotationStruct */
public final class ParameterAnnotationStruct implements ToHuman, Comparable<ParameterAnnotationStruct> {
    private final UniformListItem<AnnotationSetRefItem> annotationsItem;
    private final AnnotationsList annotationsList;
    private final CstMethodRef method;

    public ParameterAnnotationStruct(CstMethodRef cstMethodRef, AnnotationsList annotationsList2, DexFile dexFile) {
        Objects.requireNonNull(cstMethodRef, "method == null");
        Objects.requireNonNull(annotationsList2, "annotationsList == null");
        this.method = cstMethodRef;
        this.annotationsList = annotationsList2;
        int size = annotationsList2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new AnnotationSetRefItem(new AnnotationSetItem(annotationsList2.get(i), dexFile)));
        }
        this.annotationsItem = new UniformListItem<>(ItemType.TYPE_ANNOTATION_SET_REF_LIST, arrayList);
    }

    public void addContents(DexFile dexFile) {
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MixedItemSection wordData = dexFile.getWordData();
        methodIds.intern(this.method);
        wordData.add(this.annotationsItem);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ParameterAnnotationStruct)) {
            return false;
        }
        return this.method.equals(((ParameterAnnotationStruct) obj).method);
    }

    public AnnotationsList getAnnotationsList() {
        return this.annotationsList;
    }

    public CstMethodRef getMethod() {
        return this.method;
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.method.toHuman());
        sb.append(": ");
        boolean z = true;
        for (AnnotationSetRefItem next : this.annotationsItem.getItems()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next.toHuman());
        }
        return sb.toString();
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int indexOf = dexFile.getMethodIds().indexOf(this.method);
        int absoluteOffset = this.annotationsItem.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, "    " + this.method.toHuman());
            annotatedOutput.annotate(4, "      method_idx:      " + Hex.m909u4(indexOf));
            annotatedOutput.annotate(4, "      annotations_off: " + Hex.m909u4(absoluteOffset));
        }
        annotatedOutput.writeInt(indexOf);
        annotatedOutput.writeInt(absoluteOffset);
    }

    public int compareTo(ParameterAnnotationStruct parameterAnnotationStruct) {
        return this.method.compareTo((Constant) parameterAnnotationStruct.method);
    }
}
