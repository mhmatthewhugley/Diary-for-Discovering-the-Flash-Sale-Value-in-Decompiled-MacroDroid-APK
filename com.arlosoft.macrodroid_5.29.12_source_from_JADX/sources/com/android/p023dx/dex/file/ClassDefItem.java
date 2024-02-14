package com.android.p023dx.dex.file;

import com.android.p023dx.rop.annotation.Annotations;
import com.android.p023dx.rop.annotation.AnnotationsList;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstArray;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.Writers;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.ClassDefItem */
public final class ClassDefItem extends IndexedItem {
    private final int accessFlags;
    private AnnotationsDirectoryItem annotationsDirectory;
    private final ClassDataItem classData;
    private TypeListItem interfaces;
    private final CstString sourceFile;
    private EncodedArrayItem staticValuesItem;
    private final CstType superclass;
    private final CstType thisClass;

    public ClassDefItem(CstType cstType, int i, CstType cstType2, TypeList typeList, CstString cstString) {
        Objects.requireNonNull(cstType, "thisClass == null");
        Objects.requireNonNull(typeList, "interfaces == null");
        this.thisClass = cstType;
        this.accessFlags = i;
        this.superclass = cstType2;
        this.interfaces = typeList.size() == 0 ? null : new TypeListItem(typeList);
        this.sourceFile = cstString;
        this.classData = new ClassDataItem(cstType);
        this.staticValuesItem = null;
        this.annotationsDirectory = new AnnotationsDirectoryItem();
    }

    public void addContents(DexFile dexFile) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        MixedItemSection byteData = dexFile.getByteData();
        MixedItemSection wordData = dexFile.getWordData();
        MixedItemSection typeLists = dexFile.getTypeLists();
        StringIdsSection stringIds = dexFile.getStringIds();
        typeIds.intern(this.thisClass);
        if (!this.classData.isEmpty()) {
            dexFile.getClassData().add(this.classData);
            CstArray staticValuesConstant = this.classData.getStaticValuesConstant();
            if (staticValuesConstant != null) {
                this.staticValuesItem = (EncodedArrayItem) byteData.intern(new EncodedArrayItem(staticValuesConstant));
            }
        }
        CstType cstType = this.superclass;
        if (cstType != null) {
            typeIds.intern(cstType);
        }
        TypeListItem typeListItem = this.interfaces;
        if (typeListItem != null) {
            this.interfaces = (TypeListItem) typeLists.intern(typeListItem);
        }
        CstString cstString = this.sourceFile;
        if (cstString != null) {
            stringIds.intern(cstString);
        }
        if (this.annotationsDirectory.isEmpty()) {
            return;
        }
        if (this.annotationsDirectory.isInternable()) {
            this.annotationsDirectory = (AnnotationsDirectoryItem) wordData.intern(this.annotationsDirectory);
        } else {
            wordData.add(this.annotationsDirectory);
        }
    }

    public void addDirectMethod(EncodedMethod encodedMethod) {
        this.classData.addDirectMethod(encodedMethod);
    }

    public void addFieldAnnotations(CstFieldRef cstFieldRef, Annotations annotations, DexFile dexFile) {
        this.annotationsDirectory.addFieldAnnotations(cstFieldRef, annotations, dexFile);
    }

    public void addInstanceField(EncodedField encodedField) {
        this.classData.addInstanceField(encodedField);
    }

    public void addMethodAnnotations(CstMethodRef cstMethodRef, Annotations annotations, DexFile dexFile) {
        this.annotationsDirectory.addMethodAnnotations(cstMethodRef, annotations, dexFile);
    }

    public void addParameterAnnotations(CstMethodRef cstMethodRef, AnnotationsList annotationsList, DexFile dexFile) {
        this.annotationsDirectory.addParameterAnnotations(cstMethodRef, annotationsList, dexFile);
    }

    public void addStaticField(EncodedField encodedField, Constant constant) {
        this.classData.addStaticField(encodedField, constant);
    }

    public void addVirtualMethod(EncodedMethod encodedMethod) {
        this.classData.addVirtualMethod(encodedMethod);
    }

    public void debugPrint(Writer writer, boolean z) {
        PrintWriter printWriterFor = Writers.printWriterFor(writer);
        printWriterFor.println(ClassDefItem.class.getName() + " {");
        printWriterFor.println("  accessFlags: " + Hex.m907u2(this.accessFlags));
        printWriterFor.println("  superclass: " + this.superclass);
        StringBuilder sb = new StringBuilder();
        sb.append("  interfaces: ");
        TypeListItem typeListItem = this.interfaces;
        String str = "<none>";
        if (typeListItem == null) {
            typeListItem = str;
        }
        sb.append(typeListItem);
        printWriterFor.println(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("  sourceFile: ");
        CstString cstString = this.sourceFile;
        String str2 = str;
        if (cstString != null) {
            str2 = cstString.toQuoted();
        }
        sb2.append(str2);
        printWriterFor.println(sb2.toString());
        this.classData.debugPrint(writer, z);
        this.annotationsDirectory.debugPrint(printWriterFor);
        printWriterFor.println("}");
    }

    public int getAccessFlags() {
        return this.accessFlags;
    }

    public TypeList getInterfaces() {
        TypeListItem typeListItem = this.interfaces;
        if (typeListItem == null) {
            return StdTypeList.EMPTY;
        }
        return typeListItem.getList();
    }

    public Annotations getMethodAnnotations(CstMethodRef cstMethodRef) {
        return this.annotationsDirectory.getMethodAnnotations(cstMethodRef);
    }

    public ArrayList<EncodedMethod> getMethods() {
        return this.classData.getMethods();
    }

    public AnnotationsList getParameterAnnotations(CstMethodRef cstMethodRef) {
        return this.annotationsDirectory.getParameterAnnotations(cstMethodRef);
    }

    public CstString getSourceFile() {
        return this.sourceFile;
    }

    public CstType getSuperclass() {
        return this.superclass;
    }

    public CstType getThisClass() {
        return this.thisClass;
    }

    public ItemType itemType() {
        return ItemType.TYPE_CLASS_DEF_ITEM;
    }

    public void setClassAnnotations(Annotations annotations, DexFile dexFile) {
        this.annotationsDirectory.setClassAnnotations(annotations, dexFile);
    }

    public int writeSize() {
        return 32;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int i;
        int i2;
        String str;
        AnnotatedOutput annotatedOutput2 = annotatedOutput;
        boolean annotates = annotatedOutput.annotates();
        TypeIdsSection typeIds = dexFile.getTypeIds();
        int indexOf = typeIds.indexOf(this.thisClass);
        CstType cstType = this.superclass;
        int i3 = -1;
        if (cstType == null) {
            i = -1;
        } else {
            i = typeIds.indexOf(cstType);
        }
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.interfaces);
        if (this.annotationsDirectory.isEmpty()) {
            i2 = 0;
        } else {
            i2 = this.annotationsDirectory.getAbsoluteOffset();
        }
        if (this.sourceFile != null) {
            i3 = dexFile.getStringIds().indexOf(this.sourceFile);
        }
        int absoluteOffset = this.classData.isEmpty() ? 0 : this.classData.getAbsoluteOffset();
        int absoluteOffsetOr02 = OffsettedItem.getAbsoluteOffsetOr0(this.staticValuesItem);
        if (annotates) {
            annotatedOutput2.annotate(0, indexString() + ' ' + this.thisClass.toHuman());
            StringBuilder sb = new StringBuilder();
            sb.append("  class_idx:           ");
            sb.append(Hex.m909u4(indexOf));
            annotatedOutput2.annotate(4, sb.toString());
            annotatedOutput2.annotate(4, "  access_flags:        " + AccessFlags.classString(this.accessFlags));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  superclass_idx:      ");
            sb2.append(Hex.m909u4(i));
            sb2.append(" // ");
            CstType cstType2 = this.superclass;
            String str2 = "<none>";
            if (cstType2 == null) {
                str = str2;
            } else {
                str = cstType2.toHuman();
            }
            sb2.append(str);
            annotatedOutput2.annotate(4, sb2.toString());
            annotatedOutput2.annotate(4, "  interfaces_off:      " + Hex.m909u4(absoluteOffsetOr0));
            if (absoluteOffsetOr0 != 0) {
                TypeList list = this.interfaces.getList();
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    annotatedOutput2.annotate(0, "    " + list.getType(i4).toHuman());
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  source_file_idx:     ");
            sb3.append(Hex.m909u4(i3));
            sb3.append(" // ");
            CstString cstString = this.sourceFile;
            if (cstString != null) {
                str2 = cstString.toHuman();
            }
            sb3.append(str2);
            annotatedOutput2.annotate(4, sb3.toString());
            annotatedOutput2.annotate(4, "  annotations_off:     " + Hex.m909u4(i2));
            annotatedOutput2.annotate(4, "  class_data_off:      " + Hex.m909u4(absoluteOffset));
            annotatedOutput2.annotate(4, "  static_values_off:   " + Hex.m909u4(absoluteOffsetOr02));
        }
        annotatedOutput2.writeInt(indexOf);
        annotatedOutput2.writeInt(this.accessFlags);
        annotatedOutput2.writeInt(i);
        annotatedOutput2.writeInt(absoluteOffsetOr0);
        annotatedOutput2.writeInt(i3);
        annotatedOutput2.writeInt(i2);
        annotatedOutput2.writeInt(absoluteOffset);
        annotatedOutput2.writeInt(absoluteOffsetOr02);
    }
}
