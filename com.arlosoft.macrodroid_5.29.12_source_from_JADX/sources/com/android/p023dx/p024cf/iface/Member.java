package com.android.p023dx.p024cf.iface;

import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;

/* renamed from: com.android.dx.cf.iface.Member */
public interface Member extends HasAttribute {
    int getAccessFlags();

    AttributeList getAttributes();

    CstType getDefiningClass();

    CstString getDescriptor();

    CstString getName();

    CstNat getNat();
}
