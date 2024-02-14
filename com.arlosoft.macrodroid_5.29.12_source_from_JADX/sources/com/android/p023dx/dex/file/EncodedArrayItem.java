package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstArray;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.ByteArrayAnnotatedOutput;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.EncodedArrayItem */
public final class EncodedArrayItem extends OffsettedItem {
    private static final int ALIGNMENT = 1;
    private final CstArray array;
    private byte[] encodedForm = null;

    public EncodedArrayItem(CstArray cstArray) {
        super(1, -1);
        Objects.requireNonNull(cstArray, "array == null");
        this.array = cstArray;
    }

    public void addContents(DexFile dexFile) {
        ValueEncoder.addContents(dexFile, (Constant) this.array);
    }

    /* access modifiers changed from: protected */
    public int compareTo0(OffsettedItem offsettedItem) {
        return this.array.compareTo((Constant) ((EncodedArrayItem) offsettedItem).array);
    }

    public int hashCode() {
        return this.array.hashCode();
    }

    public ItemType itemType() {
        return ItemType.TYPE_ENCODED_ARRAY_ITEM;
    }

    /* access modifiers changed from: protected */
    public void place0(Section section, int i) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        new ValueEncoder(section.getFile(), byteArrayAnnotatedOutput).writeArray(this.array, false);
        byte[] byteArray = byteArrayAnnotatedOutput.toByteArray();
        this.encodedForm = byteArray;
        setWriteSize(byteArray.length);
    }

    public String toHuman() {
        return this.array.toHuman();
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, offsetString() + " encoded array");
            new ValueEncoder(dexFile, annotatedOutput).writeArray(this.array, true);
            return;
        }
        annotatedOutput.write(this.encodedForm);
    }
}
