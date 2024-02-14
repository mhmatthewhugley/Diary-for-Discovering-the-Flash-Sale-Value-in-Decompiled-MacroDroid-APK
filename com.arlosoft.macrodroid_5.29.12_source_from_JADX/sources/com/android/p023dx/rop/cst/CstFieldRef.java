package com.android.p023dx.rop.cst;

import com.android.p023dx.rop.type.Type;

/* renamed from: com.android.dx.rop.cst.CstFieldRef */
public final class CstFieldRef extends CstMemberRef {
    public CstFieldRef(CstType cstType, CstNat cstNat) {
        super(cstType, cstNat);
    }

    public static CstFieldRef forPrimitiveType(Type type) {
        return new CstFieldRef(CstType.forBoxedPrimitiveType(type), CstNat.PRIMITIVE_TYPE_NAT);
    }

    /* access modifiers changed from: protected */
    public int compareTo0(Constant constant) {
        int compareTo0 = super.compareTo0(constant);
        if (compareTo0 != 0) {
            return compareTo0;
        }
        return getNat().getDescriptor().compareTo((Constant) ((CstFieldRef) constant).getNat().getDescriptor());
    }

    public Type getType() {
        return getNat().getFieldType();
    }

    public String typeName() {
        return "field";
    }
}
