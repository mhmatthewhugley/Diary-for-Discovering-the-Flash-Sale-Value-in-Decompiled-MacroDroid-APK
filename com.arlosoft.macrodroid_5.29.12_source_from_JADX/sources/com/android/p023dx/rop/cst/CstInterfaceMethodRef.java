package com.android.p023dx.rop.cst;

/* renamed from: com.android.dx.rop.cst.CstInterfaceMethodRef */
public final class CstInterfaceMethodRef extends CstBaseMethodRef {
    private CstMethodRef methodRef = null;

    public CstInterfaceMethodRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
    }

    public CstMethodRef toMethodRef() {
        if (this.methodRef == null) {
            this.methodRef = new CstMethodRef(getDefiningClass(), getNat());
        }
        return this.methodRef;
    }

    public String typeName() {
        return "ifaceMethod";
    }
}
