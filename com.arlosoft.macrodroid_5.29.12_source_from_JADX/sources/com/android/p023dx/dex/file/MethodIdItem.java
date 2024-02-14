package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.CstBaseMethodRef;

/* renamed from: com.android.dx.dex.file.MethodIdItem */
public final class MethodIdItem extends MemberIdItem {
    public MethodIdItem(CstBaseMethodRef cstBaseMethodRef) {
        super(cstBaseMethodRef);
    }

    public void addContents(DexFile dexFile) {
        super.addContents(dexFile);
        dexFile.getProtoIds().intern(getMethodRef().getPrototype());
    }

    public CstBaseMethodRef getMethodRef() {
        return (CstBaseMethodRef) getRef();
    }

    /* access modifiers changed from: protected */
    public int getTypoidIdx(DexFile dexFile) {
        return dexFile.getProtoIds().indexOf(getMethodRef().getPrototype());
    }

    /* access modifiers changed from: protected */
    public String getTypoidName() {
        return "proto_idx";
    }

    public ItemType itemType() {
        return ItemType.TYPE_METHOD_ID_ITEM;
    }
}
