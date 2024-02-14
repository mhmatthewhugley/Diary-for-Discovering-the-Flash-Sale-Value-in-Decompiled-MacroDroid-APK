package com.android.p023dx.dex.file;

import com.android.p023dx.rop.annotation.Annotation;
import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.dex.file.AnnotationSetItem */
public final class AnnotationSetItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ENTRY_WRITE_SIZE = 4;
    private final Annotations annotations;
    private final AnnotationItem[] items;

    public AnnotationSetItem(Annotations annotations2, DexFile dexFile) {
        super(4, writeSize(annotations2));
        this.annotations = annotations2;
        this.items = new AnnotationItem[annotations2.size()];
        int i = 0;
        for (Annotation annotationItem : annotations2.getAnnotations()) {
            this.items[i] = new AnnotationItem(annotationItem, dexFile);
            i++;
        }
    }

    private static int writeSize(Annotations annotations2) {
        try {
            return (annotations2.size() * 4) + 4;
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    public void addContents(DexFile dexFile) {
        MixedItemSection byteData = dexFile.getByteData();
        int length = this.items.length;
        for (int i = 0; i < length; i++) {
            AnnotationItem[] annotationItemArr = this.items;
            annotationItemArr[i] = (AnnotationItem) byteData.intern(annotationItemArr[i]);
        }
    }

    /* access modifiers changed from: protected */
    public int compareTo0(OffsettedItem offsettedItem) {
        return this.annotations.compareTo(((AnnotationSetItem) offsettedItem).annotations);
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATION_SET_ITEM;
    }

    /* access modifiers changed from: protected */
    public void place0(Section section, int i) {
        AnnotationItem.sortByTypeIdIndex(this.items);
    }

    public String toHuman() {
        return this.annotations.toString();
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean annotates = annotatedOutput.annotates();
        int length = this.items.length;
        if (annotates) {
            annotatedOutput.annotate(0, offsetString() + " annotation set");
            annotatedOutput.annotate(4, "  size: " + Hex.m909u4(length));
        }
        annotatedOutput.writeInt(length);
        for (int i = 0; i < length; i++) {
            int absoluteOffset = this.items[i].getAbsoluteOffset();
            if (annotates) {
                annotatedOutput.annotate(4, "  entries[" + Integer.toHexString(i) + "]: " + Hex.m909u4(absoluteOffset));
                this.items[i].annotateTo(annotatedOutput, "    ");
            }
            annotatedOutput.writeInt(absoluteOffset);
        }
    }
}
