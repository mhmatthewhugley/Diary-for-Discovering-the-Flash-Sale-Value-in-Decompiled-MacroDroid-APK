package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstType;
import java.util.Objects;

/* renamed from: com.android.dx.cf.attrib.AttEnclosingMethod */
public final class AttEnclosingMethod extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "EnclosingMethod";
    private final CstNat method;
    private final CstType type;

    public AttEnclosingMethod(CstType cstType, CstNat cstNat) {
        super(ATTRIBUTE_NAME);
        Objects.requireNonNull(cstType, "type == null");
        this.type = cstType;
        this.method = cstNat;
    }

    public int byteLength() {
        return 10;
    }

    public CstType getEnclosingClass() {
        return this.type;
    }

    public CstNat getMethod() {
        return this.method;
    }
}
