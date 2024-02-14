package com.android.p023dx.dex.file;

import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.rop.annotation.AnnotationsList;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.AnnotationsDirectoryItem */
public final class AnnotationsDirectoryItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ELEMENT_SIZE = 8;
    private static final int HEADER_SIZE = 16;
    private AnnotationSetItem classAnnotations = null;
    private ArrayList<FieldAnnotationStruct> fieldAnnotations = null;
    private ArrayList<MethodAnnotationStruct> methodAnnotations = null;
    private ArrayList<ParameterAnnotationStruct> parameterAnnotations = null;

    public AnnotationsDirectoryItem() {
        super(4, -1);
    }

    private static int listSize(ArrayList<?> arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public void addContents(DexFile dexFile) {
        MixedItemSection wordData = dexFile.getWordData();
        AnnotationSetItem annotationSetItem = this.classAnnotations;
        if (annotationSetItem != null) {
            this.classAnnotations = (AnnotationSetItem) wordData.intern(annotationSetItem);
        }
        ArrayList<FieldAnnotationStruct> arrayList = this.fieldAnnotations;
        if (arrayList != null) {
            Iterator<FieldAnnotationStruct> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().addContents(dexFile);
            }
        }
        ArrayList<MethodAnnotationStruct> arrayList2 = this.methodAnnotations;
        if (arrayList2 != null) {
            Iterator<MethodAnnotationStruct> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().addContents(dexFile);
            }
        }
        ArrayList<ParameterAnnotationStruct> arrayList3 = this.parameterAnnotations;
        if (arrayList3 != null) {
            Iterator<ParameterAnnotationStruct> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                it3.next().addContents(dexFile);
            }
        }
    }

    public void addFieldAnnotations(CstFieldRef cstFieldRef, Annotations annotations, DexFile dexFile) {
        if (this.fieldAnnotations == null) {
            this.fieldAnnotations = new ArrayList<>();
        }
        this.fieldAnnotations.add(new FieldAnnotationStruct(cstFieldRef, new AnnotationSetItem(annotations, dexFile)));
    }

    public void addMethodAnnotations(CstMethodRef cstMethodRef, Annotations annotations, DexFile dexFile) {
        if (this.methodAnnotations == null) {
            this.methodAnnotations = new ArrayList<>();
        }
        this.methodAnnotations.add(new MethodAnnotationStruct(cstMethodRef, new AnnotationSetItem(annotations, dexFile)));
    }

    public void addParameterAnnotations(CstMethodRef cstMethodRef, AnnotationsList annotationsList, DexFile dexFile) {
        if (this.parameterAnnotations == null) {
            this.parameterAnnotations = new ArrayList<>();
        }
        this.parameterAnnotations.add(new ParameterAnnotationStruct(cstMethodRef, annotationsList, dexFile));
    }

    public int compareTo0(OffsettedItem offsettedItem) {
        if (isInternable()) {
            return this.classAnnotations.compareTo((OffsettedItem) ((AnnotationsDirectoryItem) offsettedItem).classAnnotations);
        }
        throw new UnsupportedOperationException("uninternable instance");
    }

    /* access modifiers changed from: package-private */
    public void debugPrint(PrintWriter printWriter) {
        if (this.classAnnotations != null) {
            printWriter.println("  class annotations: " + this.classAnnotations);
        }
        if (this.fieldAnnotations != null) {
            printWriter.println("  field annotations:");
            Iterator<FieldAnnotationStruct> it = this.fieldAnnotations.iterator();
            while (it.hasNext()) {
                printWriter.println("    " + it.next().toHuman());
            }
        }
        if (this.methodAnnotations != null) {
            printWriter.println("  method annotations:");
            Iterator<MethodAnnotationStruct> it2 = this.methodAnnotations.iterator();
            while (it2.hasNext()) {
                printWriter.println("    " + it2.next().toHuman());
            }
        }
        if (this.parameterAnnotations != null) {
            printWriter.println("  parameter annotations:");
            Iterator<ParameterAnnotationStruct> it3 = this.parameterAnnotations.iterator();
            while (it3.hasNext()) {
                printWriter.println("    " + it3.next().toHuman());
            }
        }
    }

    public Annotations getMethodAnnotations(CstMethodRef cstMethodRef) {
        ArrayList<MethodAnnotationStruct> arrayList = this.methodAnnotations;
        if (arrayList == null) {
            return null;
        }
        Iterator<MethodAnnotationStruct> it = arrayList.iterator();
        while (it.hasNext()) {
            MethodAnnotationStruct next = it.next();
            if (next.getMethod().equals(cstMethodRef)) {
                return next.getAnnotations();
            }
        }
        return null;
    }

    public AnnotationsList getParameterAnnotations(CstMethodRef cstMethodRef) {
        ArrayList<ParameterAnnotationStruct> arrayList = this.parameterAnnotations;
        if (arrayList == null) {
            return null;
        }
        Iterator<ParameterAnnotationStruct> it = arrayList.iterator();
        while (it.hasNext()) {
            ParameterAnnotationStruct next = it.next();
            if (next.getMethod().equals(cstMethodRef)) {
                return next.getAnnotationsList();
            }
        }
        return null;
    }

    public int hashCode() {
        AnnotationSetItem annotationSetItem = this.classAnnotations;
        if (annotationSetItem == null) {
            return 0;
        }
        return annotationSetItem.hashCode();
    }

    public boolean isEmpty() {
        return this.classAnnotations == null && this.fieldAnnotations == null && this.methodAnnotations == null && this.parameterAnnotations == null;
    }

    public boolean isInternable() {
        return this.classAnnotations != null && this.fieldAnnotations == null && this.methodAnnotations == null && this.parameterAnnotations == null;
    }

    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATIONS_DIRECTORY_ITEM;
    }

    /* access modifiers changed from: protected */
    public void place0(Section section, int i) {
        setWriteSize(((listSize(this.fieldAnnotations) + listSize(this.methodAnnotations) + listSize(this.parameterAnnotations)) * 8) + 16);
    }

    public void setClassAnnotations(Annotations annotations, DexFile dexFile) {
        Objects.requireNonNull(annotations, "annotations == null");
        if (this.classAnnotations == null) {
            this.classAnnotations = new AnnotationSetItem(annotations, dexFile);
            return;
        }
        throw new UnsupportedOperationException("class annotations already set");
    }

    public String toHuman() {
        throw new RuntimeException("unsupported");
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean annotates = annotatedOutput.annotates();
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.classAnnotations);
        int listSize = listSize(this.fieldAnnotations);
        int listSize2 = listSize(this.methodAnnotations);
        int listSize3 = listSize(this.parameterAnnotations);
        if (annotates) {
            annotatedOutput.annotate(0, offsetString() + " annotations directory");
            annotatedOutput.annotate(4, "  class_annotations_off: " + Hex.m909u4(absoluteOffsetOr0));
            annotatedOutput.annotate(4, "  fields_size:           " + Hex.m909u4(listSize));
            annotatedOutput.annotate(4, "  methods_size:          " + Hex.m909u4(listSize2));
            annotatedOutput.annotate(4, "  parameters_size:       " + Hex.m909u4(listSize3));
        }
        annotatedOutput.writeInt(absoluteOffsetOr0);
        annotatedOutput.writeInt(listSize);
        annotatedOutput.writeInt(listSize2);
        annotatedOutput.writeInt(listSize3);
        if (listSize != 0) {
            Collections.sort(this.fieldAnnotations);
            if (annotates) {
                annotatedOutput.annotate(0, "  fields:");
            }
            Iterator<FieldAnnotationStruct> it = this.fieldAnnotations.iterator();
            while (it.hasNext()) {
                it.next().writeTo(dexFile, annotatedOutput);
            }
        }
        if (listSize2 != 0) {
            Collections.sort(this.methodAnnotations);
            if (annotates) {
                annotatedOutput.annotate(0, "  methods:");
            }
            Iterator<MethodAnnotationStruct> it2 = this.methodAnnotations.iterator();
            while (it2.hasNext()) {
                it2.next().writeTo(dexFile, annotatedOutput);
            }
        }
        if (listSize3 != 0) {
            Collections.sort(this.parameterAnnotations);
            if (annotates) {
                annotatedOutput.annotate(0, "  parameters:");
            }
            Iterator<ParameterAnnotationStruct> it3 = this.parameterAnnotations.iterator();
            while (it3.hasNext()) {
                it3.next().writeTo(dexFile, annotatedOutput);
            }
        }
    }
}
