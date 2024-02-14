package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.cst.CstString;
import java.util.Objects;

/* renamed from: com.android.dx.cf.attrib.AttSignature */
public final class AttSignature extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Signature";
    private final CstString signature;

    public AttSignature(CstString cstString) {
        super(ATTRIBUTE_NAME);
        Objects.requireNonNull(cstString, "signature == null");
        this.signature = cstString;
    }

    public int byteLength() {
        return 8;
    }

    public CstString getSignature() {
        return this.signature;
    }
}
