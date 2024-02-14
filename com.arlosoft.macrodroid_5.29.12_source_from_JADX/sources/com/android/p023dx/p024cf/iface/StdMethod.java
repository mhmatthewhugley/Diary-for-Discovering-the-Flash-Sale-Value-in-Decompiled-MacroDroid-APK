package com.android.p023dx.p024cf.iface;

import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Prototype;

/* renamed from: com.android.dx.cf.iface.StdMethod */
public final class StdMethod extends StdMember implements Method {
    private final Prototype effectiveDescriptor;

    public StdMethod(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        super(cstType, i, cstNat, attributeList);
        this.effectiveDescriptor = Prototype.intern(getDescriptor().getString(), cstType.getClassType(), AccessFlags.isStatic(i), cstNat.isInstanceInit());
    }

    public Prototype getEffectiveDescriptor() {
        return this.effectiveDescriptor;
    }
}
