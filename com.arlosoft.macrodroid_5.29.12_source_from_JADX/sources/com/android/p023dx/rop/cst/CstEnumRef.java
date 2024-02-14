package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Type;

/* renamed from: com.android.dx.rop.cst.CstEnumRef */
public final class CstEnumRef extends CstMemberRef {
    private CstFieldRef fieldRef = null;

    public CstEnumRef(CstNat cstNat) {
        super(new CstType(cstNat.getFieldType()), cstNat);
    }

    public CstFieldRef getFieldRef() {
        if (this.fieldRef == null) {
            this.fieldRef = new CstFieldRef(getDefiningClass(), getNat());
        }
        return this.fieldRef;
    }

    public Type getType() {
        return getDefiningClass().getClassType();
    }

    public String typeName() {
        return "enum";
    }
}
