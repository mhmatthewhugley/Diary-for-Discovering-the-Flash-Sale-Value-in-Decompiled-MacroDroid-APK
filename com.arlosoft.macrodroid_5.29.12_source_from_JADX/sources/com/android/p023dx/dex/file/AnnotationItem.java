package com.android.p023dx.dex.file;

import com.android.p023dx.rop.annotation.Annotation;
import com.android.p023dx.rop.annotation.AnnotationVisibility;
import com.android.p023dx.rop.annotation.NameValuePair;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.ByteArrayAnnotatedOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.AnnotationItem */
public final class AnnotationItem extends OffsettedItem {
    private static final int ALIGNMENT = 1;
    private static final TypeIdSorter TYPE_ID_SORTER = new TypeIdSorter((C15391) null);
    private static final int VISIBILITY_BUILD = 0;
    private static final int VISIBILITY_RUNTIME = 1;
    private static final int VISIBILITY_SYSTEM = 2;
    private final Annotation annotation;
    private byte[] encodedForm = null;
    /* access modifiers changed from: private */
    public TypeIdItem type = null;

    /* renamed from: com.android.dx.dex.file.AnnotationItem$1 */
    static /* synthetic */ class C15391 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.android.dx.rop.annotation.AnnotationVisibility[] r0 = com.android.p023dx.rop.annotation.AnnotationVisibility.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility = r0
                com.android.dx.rop.annotation.AnnotationVisibility r1 = com.android.p023dx.rop.annotation.AnnotationVisibility.BUILD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility     // Catch:{ NoSuchFieldError -> 0x001d }
                com.android.dx.rop.annotation.AnnotationVisibility r1 = com.android.p023dx.rop.annotation.AnnotationVisibility.RUNTIME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.android.dx.rop.annotation.AnnotationVisibility r1 = com.android.p023dx.rop.annotation.AnnotationVisibility.SYSTEM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.dex.file.AnnotationItem.C15391.<clinit>():void");
        }
    }

    /* renamed from: com.android.dx.dex.file.AnnotationItem$TypeIdSorter */
    private static class TypeIdSorter implements Comparator<AnnotationItem> {
        private TypeIdSorter() {
        }

        /* synthetic */ TypeIdSorter(C15391 r1) {
            this();
        }

        public int compare(AnnotationItem annotationItem, AnnotationItem annotationItem2) {
            int index = annotationItem.type.getIndex();
            int index2 = annotationItem2.type.getIndex();
            if (index < index2) {
                return -1;
            }
            return index > index2 ? 1 : 0;
        }
    }

    public AnnotationItem(Annotation annotation2, DexFile dexFile) {
        super(1, -1);
        Objects.requireNonNull(annotation2, "annotation == null");
        this.annotation = annotation2;
        addContents(dexFile);
    }

    public static void sortByTypeIdIndex(AnnotationItem[] annotationItemArr) {
        Arrays.sort(annotationItemArr, TYPE_ID_SORTER);
    }

    public void addContents(DexFile dexFile) {
        this.type = dexFile.getTypeIds().intern(this.annotation.getType());
        ValueEncoder.addContents(dexFile, this.annotation);
    }

    public void annotateTo(AnnotatedOutput annotatedOutput, String str) {
        annotatedOutput.annotate(0, str + "visibility: " + this.annotation.getVisibility().toHuman());
        annotatedOutput.annotate(0, str + "type: " + this.annotation.getType().toHuman());
        for (NameValuePair next : this.annotation.getNameValuePairs()) {
            CstString name = next.getName();
            Constant value = next.getValue();
            annotatedOutput.annotate(0, str + name.toHuman() + ": " + ValueEncoder.constantToHuman(value));
        }
    }

    /* access modifiers changed from: protected */
    public int compareTo0(OffsettedItem offsettedItem) {
        return this.annotation.compareTo(((AnnotationItem) offsettedItem).annotation);
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATION_ITEM;
    }

    /* access modifiers changed from: protected */
    public void place0(Section section, int i) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        new ValueEncoder(section.getFile(), byteArrayAnnotatedOutput).writeAnnotation(this.annotation, false);
        byte[] byteArray = byteArrayAnnotatedOutput.toByteArray();
        this.encodedForm = byteArray;
        setWriteSize(byteArray.length + 1);
    }

    public String toHuman() {
        return this.annotation.toHuman();
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean annotates = annotatedOutput.annotates();
        AnnotationVisibility visibility = this.annotation.getVisibility();
        if (annotates) {
            annotatedOutput.annotate(0, offsetString() + " annotation");
            annotatedOutput.annotate(1, "  visibility: VISBILITY_" + visibility);
        }
        int i = C15391.$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility[visibility.ordinal()];
        if (i == 1) {
            annotatedOutput.writeByte(0);
        } else if (i == 2) {
            annotatedOutput.writeByte(1);
        } else if (i == 3) {
            annotatedOutput.writeByte(2);
        } else {
            throw new RuntimeException("shouldn't happen");
        }
        if (annotates) {
            new ValueEncoder(dexFile, annotatedOutput).writeAnnotation(this.annotation, true);
        } else {
            annotatedOutput.write(this.encodedForm);
        }
    }
}
