package com.android.p023dx.p024cf.iface;

import com.android.p023dx.p024cf.attrib.AttConstantValue;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.cst.TypedConstant;

/* renamed from: com.android.dx.cf.iface.StdField */
public final class StdField extends StdMember implements Field {
    public StdField(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        super(cstType, i, cstNat, attributeList);
    }

    public TypedConstant getConstantValue() {
        AttConstantValue attConstantValue = (AttConstantValue) getAttributes().findFirst(AttConstantValue.ATTRIBUTE_NAME);
        if (attConstantValue == null) {
            return null;
        }
        return attConstantValue.getConstantValue();
    }
}
