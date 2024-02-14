package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.CstFieldRef;

/* renamed from: com.android.dx.dex.file.FieldIdItem */
public final class FieldIdItem extends MemberIdItem {
    public FieldIdItem(CstFieldRef cstFieldRef) {
        super(cstFieldRef);
    }

    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getTypeIds().intern(getFieldRef().getType());
    }

    public CstFieldRef getFieldRef() {
        return (CstFieldRef) getRef();
    }

    /* access modifiers changed from: protected */
    public int getTypoidIdx(DexFile dexFile) {
        return dexFile.getTypeIds().indexOf(getFieldRef().getType());
    }

    /* access modifiers changed from: protected */
    public String getTypoidName() {
        return "type_idx";
    }

    public ItemType itemType() {
        return ItemType.TYPE_FIELD_ID_ITEM;
    }
}
