package com.android.p023dx.dex.file;

import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.AnnotationSetRefItem */
public final class AnnotationSetRefItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int WRITE_SIZE = 4;
    private AnnotationSetItem annotations;

    public AnnotationSetRefItem(AnnotationSetItem annotationSetItem) {
        super(4, 4);
        Objects.requireNonNull(annotationSetItem, "annotations == null");
        this.annotations = annotationSetItem;
    }

    public void addContents(DexFile dexFile) {
        this.annotations = (AnnotationSetItem) dexFile.getWordData().intern(this.annotations);
    }

    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    public String toHuman() {
        return this.annotations.toHuman();
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "  annotations_off: " + Hex.m909u4(absoluteOffset));
        }
        annotatedOutput.writeInt(absoluteOffset);
    }
}
