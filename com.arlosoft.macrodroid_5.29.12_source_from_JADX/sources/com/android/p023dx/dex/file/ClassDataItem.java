package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstArray;
import com.android.p023dx.rop.cst.CstLiteralBits;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.cst.Zeroes;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.ByteArrayAnnotatedOutput;
import com.android.p023dx.util.Writers;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.ClassDataItem */
public final class ClassDataItem extends OffsettedItem {
    private final ArrayList<EncodedMethod> directMethods = new ArrayList<>(20);
    private byte[] encodedForm;
    private final ArrayList<EncodedField> instanceFields = new ArrayList<>(20);
    private final ArrayList<EncodedField> staticFields = new ArrayList<>(20);
    private final HashMap<EncodedField, Constant> staticValues = new HashMap<>(40);
    private CstArray staticValuesConstant = null;
    private final CstType thisClass;
    private final ArrayList<EncodedMethod> virtualMethods = new ArrayList<>(20);

    public ClassDataItem(CstType cstType) {
        super(1, -1);
        Objects.requireNonNull(cstType, "thisClass == null");
        this.thisClass = cstType;
    }

    private static void encodeList(DexFile dexFile, AnnotatedOutput annotatedOutput, String str, ArrayList<? extends EncodedMember> arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (annotatedOutput.annotates()) {
                annotatedOutput.annotate(0, "  " + str + ":");
            }
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i = ((EncodedMember) arrayList.get(i2)).encode(dexFile, annotatedOutput, i, i2);
            }
        }
    }

    private void encodeOutput(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean annotates = annotatedOutput.annotates();
        if (annotates) {
            annotatedOutput.annotate(0, offsetString() + " class data for " + this.thisClass.toHuman());
        }
        encodeSize(dexFile, annotatedOutput, "static_fields", this.staticFields.size());
        encodeSize(dexFile, annotatedOutput, "instance_fields", this.instanceFields.size());
        encodeSize(dexFile, annotatedOutput, "direct_methods", this.directMethods.size());
        encodeSize(dexFile, annotatedOutput, "virtual_methods", this.virtualMethods.size());
        encodeList(dexFile, annotatedOutput, "static_fields", this.staticFields);
        encodeList(dexFile, annotatedOutput, "instance_fields", this.instanceFields);
        encodeList(dexFile, annotatedOutput, "direct_methods", this.directMethods);
        encodeList(dexFile, annotatedOutput, "virtual_methods", this.virtualMethods);
        if (annotates) {
            annotatedOutput.endAnnotation();
        }
    }

    private static void encodeSize(DexFile dexFile, AnnotatedOutput annotatedOutput, String str, int i) {
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(String.format("  %-21s %08x", new Object[]{str + "_size:", Integer.valueOf(i)}));
        }
        annotatedOutput.writeUleb128(i);
    }

    private CstArray makeStaticValuesConstant() {
        Collections.sort(this.staticFields);
        int size = this.staticFields.size();
        while (size > 0) {
            Constant constant = this.staticValues.get(this.staticFields.get(size - 1));
            if (constant instanceof CstLiteralBits) {
                if (((CstLiteralBits) constant).getLongBits() != 0) {
                    break;
                }
            } else if (constant != null) {
                break;
            }
            size--;
        }
        if (size == 0) {
            return null;
        }
        CstArray.List list = new CstArray.List(size);
        for (int i = 0; i < size; i++) {
            EncodedField encodedField = this.staticFields.get(i);
            Constant constant2 = this.staticValues.get(encodedField);
            if (constant2 == null) {
                constant2 = Zeroes.zeroFor(encodedField.getRef().getType());
            }
            list.set(i, constant2);
        }
        list.setImmutable();
        return new CstArray(list);
    }

    public void addContents(DexFile dexFile) {
        if (!this.staticFields.isEmpty()) {
            getStaticValuesConstant();
            Iterator<EncodedField> it = this.staticFields.iterator();
            while (it.hasNext()) {
                it.next().addContents(dexFile);
            }
        }
        if (!this.instanceFields.isEmpty()) {
            Collections.sort(this.instanceFields);
            Iterator<EncodedField> it2 = this.instanceFields.iterator();
            while (it2.hasNext()) {
                it2.next().addContents(dexFile);
            }
        }
        if (!this.directMethods.isEmpty()) {
            Collections.sort(this.directMethods);
            Iterator<EncodedMethod> it3 = this.directMethods.iterator();
            while (it3.hasNext()) {
                it3.next().addContents(dexFile);
            }
        }
        if (!this.virtualMethods.isEmpty()) {
            Collections.sort(this.virtualMethods);
            Iterator<EncodedMethod> it4 = this.virtualMethods.iterator();
            while (it4.hasNext()) {
                it4.next().addContents(dexFile);
            }
        }
    }

    public void addDirectMethod(EncodedMethod encodedMethod) {
        Objects.requireNonNull(encodedMethod, "method == null");
        this.directMethods.add(encodedMethod);
    }

    public void addInstanceField(EncodedField encodedField) {
        Objects.requireNonNull(encodedField, "field == null");
        this.instanceFields.add(encodedField);
    }

    public void addStaticField(EncodedField encodedField, Constant constant) {
        Objects.requireNonNull(encodedField, "field == null");
        if (this.staticValuesConstant == null) {
            this.staticFields.add(encodedField);
            this.staticValues.put(encodedField, constant);
            return;
        }
        throw new UnsupportedOperationException("static fields already sorted");
    }

    public void addVirtualMethod(EncodedMethod encodedMethod) {
        Objects.requireNonNull(encodedMethod, "method == null");
        this.virtualMethods.add(encodedMethod);
    }

    public void debugPrint(Writer writer, boolean z) {
        PrintWriter printWriterFor = Writers.printWriterFor(writer);
        int size = this.staticFields.size();
        for (int i = 0; i < size; i++) {
            printWriterFor.println("  sfields[" + i + "]: " + this.staticFields.get(i));
        }
        int size2 = this.instanceFields.size();
        for (int i2 = 0; i2 < size2; i2++) {
            printWriterFor.println("  ifields[" + i2 + "]: " + this.instanceFields.get(i2));
        }
        int size3 = this.directMethods.size();
        for (int i3 = 0; i3 < size3; i3++) {
            printWriterFor.println("  dmeths[" + i3 + "]:");
            this.directMethods.get(i3).debugPrint(printWriterFor, z);
        }
        int size4 = this.virtualMethods.size();
        for (int i4 = 0; i4 < size4; i4++) {
            printWriterFor.println("  vmeths[" + i4 + "]:");
            this.virtualMethods.get(i4).debugPrint(printWriterFor, z);
        }
    }

    public ArrayList<EncodedMethod> getMethods() {
        ArrayList<EncodedMethod> arrayList = new ArrayList<>(this.directMethods.size() + this.virtualMethods.size());
        arrayList.addAll(this.directMethods);
        arrayList.addAll(this.virtualMethods);
        return arrayList;
    }

    public CstArray getStaticValuesConstant() {
        if (this.staticValuesConstant == null && this.staticFields.size() != 0) {
            this.staticValuesConstant = makeStaticValuesConstant();
        }
        return this.staticValuesConstant;
    }

    public boolean isEmpty() {
        return this.staticFields.isEmpty() && this.instanceFields.isEmpty() && this.directMethods.isEmpty() && this.virtualMethods.isEmpty();
    }

    public ItemType itemType() {
        return ItemType.TYPE_CLASS_DATA_ITEM;
    }

    /* access modifiers changed from: protected */
    public void place0(Section section, int i) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        encodeOutput(section.getFile(), byteArrayAnnotatedOutput);
        byte[] byteArray = byteArrayAnnotatedOutput.toByteArray();
        this.encodedForm = byteArray;
        setWriteSize(byteArray.length);
    }

    public String toHuman() {
        return toString();
    }

    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        if (annotatedOutput.annotates()) {
            encodeOutput(dexFile, annotatedOutput);
        } else {
            annotatedOutput.write(this.encodedForm);
        }
    }
}
