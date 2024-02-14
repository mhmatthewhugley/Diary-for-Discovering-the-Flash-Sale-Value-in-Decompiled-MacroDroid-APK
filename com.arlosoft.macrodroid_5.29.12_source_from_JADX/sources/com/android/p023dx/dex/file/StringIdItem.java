package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.StringIdItem */
public final class StringIdItem extends IndexedItem implements Comparable {
    private StringDataItem data = null;
    private final CstString value;

    public StringIdItem(CstString cstString) {
        Objects.requireNonNull(cstString, "value == null");
        this.value = cstString;
    }

    public void addContents(DexFile dexFile) {
        if (this.data == null) {
            MixedItemSection stringData = dexFile.getStringData();
            StringDataItem stringDataItem = new StringDataItem(this.value);
            this.data = stringDataItem;
            stringData.add(stringDataItem);
        }
    }

    public int compareTo(Object obj) {
        return this.value.compareTo((Constant) ((StringIdItem) obj).value);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StringIdItem)) {
            return false;
        }
        return this.value.equals(((StringIdItem) obj).value);
    }

    public StringDataItem getData() {
        return this.data;
    }

    public CstString getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public ItemType itemType() {
        return ItemType.TYPE_STRING_ID_ITEM;
    }

    public int writeSize() {
        return 4;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int absoluteOffset = this.data.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, indexString() + ' ' + this.value.toQuoted(100));
            StringBuilder sb = new StringBuilder();
            sb.append("  string_data_off: ");
            sb.append(Hex.m909u4(absoluteOffset));
            annotatedOutput.annotate(4, sb.toString());
        }
        annotatedOutput.writeInt(absoluteOffset);
    }
}
