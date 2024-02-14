package com.android.p023dx.rop.cst;

/* renamed from: com.android.dx.rop.cst.CstMethodRef */
public final class CstMethodRef extends CstBaseMethodRef {
    public CstMethodRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
    }

    public String typeName() {
        return "method";
    }
}
