package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.MutabilityException;

/* renamed from: com.android.dx.cf.attrib.AttExceptions */
public final class AttExceptions extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Exceptions";
    private final TypeList exceptions;

    public AttExceptions(TypeList typeList) {
        super(ATTRIBUTE_NAME);
        try {
            if (!typeList.isMutable()) {
                this.exceptions = typeList;
                return;
            }
            throw new MutabilityException("exceptions.isMutable()");
        } catch (NullPointerException unused) {
            throw new NullPointerException("exceptions == null");
        }
    }

    public int byteLength() {
        return (this.exceptions.size() * 2) + 8;
    }

    public TypeList getExceptions() {
        return this.exceptions;
    }
}
