package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.dex.file.TypeIdItem */
public final class TypeIdItem extends IdItem {
    public TypeIdItem(CstType cstType) {
        super(cstType);
    }

    public void addContents(DexFile dexFile) {
        dexFile.getStringIds().intern(getDefiningClass().getDescriptor());
    }

    public ItemType itemType() {
        return ItemType.TYPE_TYPE_ID_ITEM;
    }

    public int writeSize() {
        return 4;
    }

    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        CstString descriptor = getDefiningClass().getDescriptor();
        int indexOf = dexFile.getStringIds().indexOf(descriptor);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, indexString() + ' ' + descriptor.toHuman());
            StringBuilder sb = new StringBuilder();
            sb.append("  descriptor_idx: ");
            sb.append(Hex.m909u4(indexOf));
            annotatedOutput.annotate(4, sb.toString());
        }
        annotatedOutput.writeInt(indexOf);
    }
}
