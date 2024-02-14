package com.android.p023dx.p024cf.iface;

import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import java.util.Objects;

/* renamed from: com.android.dx.cf.iface.StdMember */
public abstract class StdMember implements Member {
    private final int accessFlags;
    private final AttributeList attributes;
    private final CstType definingClass;
    private final CstNat nat;

    public StdMember(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        Objects.requireNonNull(cstType, "definingClass == null");
        Objects.requireNonNull(cstNat, "nat == null");
        Objects.requireNonNull(attributeList, "attributes == null");
        this.definingClass = cstType;
        this.accessFlags = i;
        this.nat = cstNat;
        this.attributes = attributeList;
    }

    public final int getAccessFlags() {
        return this.accessFlags;
    }

    public final AttributeList getAttributes() {
        return this.attributes;
    }

    public final CstType getDefiningClass() {
        return this.definingClass;
    }

    public final CstString getDescriptor() {
        return this.nat.getDescriptor();
    }

    public final CstString getName() {
        return this.nat.getName();
    }

    public final CstNat getNat() {
        return this.nat;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(getClass().getName());
        stringBuffer.append('{');
        stringBuffer.append(this.nat.toHuman());
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
