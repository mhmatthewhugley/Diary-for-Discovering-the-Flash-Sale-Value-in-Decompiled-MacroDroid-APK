package com.android.p023dx.dex.file;

import com.android.dex.Leb128;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.ByteArray;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.dex.file.StringDataItem */
public final class StringDataItem extends OffsettedItem {
    private final CstString value;

    public StringDataItem(CstString cstString) {
        super(1, writeSize(cstString));
        this.value = cstString;
    }

    private static int writeSize(CstString cstString) {
        return Leb128.unsignedLeb128Size(cstString.getUtf16Size()) + cstString.getUtf8Size() + 1;
    }

    public void addContents(DexFile dexFile) {
    }

    /* access modifiers changed from: protected */
    public int compareTo0(OffsettedItem offsettedItem) {
        return this.value.compareTo((Constant) ((StringDataItem) offsettedItem).value);
    }

    public ItemType itemType() {
        return ItemType.TYPE_STRING_DATA_ITEM;
    }

    public String toHuman() {
        return this.value.toQuoted();
    }

    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        ByteArray bytes = this.value.getBytes();
        int utf16Size = this.value.getUtf16Size();
        if (annotatedOutput.annotates()) {
            int unsignedLeb128Size = Leb128.unsignedLeb128Size(utf16Size);
            annotatedOutput.annotate(unsignedLeb128Size, "utf16_size: " + Hex.m909u4(utf16Size));
            annotatedOutput.annotate(bytes.size() + 1, this.value.toQuoted());
        }
        annotatedOutput.writeUleb128(utf16Size);
        annotatedOutput.write(bytes);
        annotatedOutput.writeByte(0);
    }
}
