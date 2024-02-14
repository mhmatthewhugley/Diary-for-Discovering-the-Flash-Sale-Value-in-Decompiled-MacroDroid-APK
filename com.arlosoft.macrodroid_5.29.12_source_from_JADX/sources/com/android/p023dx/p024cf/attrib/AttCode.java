package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.p024cf.code.ByteCatchList;
import com.android.p023dx.p024cf.code.BytecodeArray;
import com.android.p023dx.p024cf.iface.AttributeList;
import com.android.p023dx.util.MutabilityException;
import java.util.Objects;

/* renamed from: com.android.dx.cf.attrib.AttCode */
public final class AttCode extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Code";
    private final AttributeList attributes;
    private final ByteCatchList catches;
    private final BytecodeArray code;
    private final int maxLocals;
    private final int maxStack;

    public AttCode(int i, int i2, BytecodeArray bytecodeArray, ByteCatchList byteCatchList, AttributeList attributeList) {
        super(ATTRIBUTE_NAME);
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        } else if (i2 >= 0) {
            Objects.requireNonNull(bytecodeArray, "code == null");
            try {
                if (!byteCatchList.isMutable()) {
                    try {
                        if (!attributeList.isMutable()) {
                            this.maxStack = i;
                            this.maxLocals = i2;
                            this.code = bytecodeArray;
                            this.catches = byteCatchList;
                            this.attributes = attributeList;
                            return;
                        }
                        throw new MutabilityException("attributes.isMutable()");
                    } catch (NullPointerException unused) {
                        throw new NullPointerException("attributes == null");
                    }
                } else {
                    throw new MutabilityException("catches.isMutable()");
                }
            } catch (NullPointerException unused2) {
                throw new NullPointerException("catches == null");
            }
        } else {
            throw new IllegalArgumentException("maxLocals < 0");
        }
    }

    public int byteLength() {
        return this.code.byteLength() + 10 + this.catches.byteLength() + this.attributes.byteLength();
    }

    public AttributeList getAttributes() {
        return this.attributes;
    }

    public ByteCatchList getCatches() {
        return this.catches;
    }

    public BytecodeArray getCode() {
        return this.code;
    }

    public int getMaxLocals() {
        return this.maxLocals;
    }

    public int getMaxStack() {
        return this.maxStack;
    }
}
