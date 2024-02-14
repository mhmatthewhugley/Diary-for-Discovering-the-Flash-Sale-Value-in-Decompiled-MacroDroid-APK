package com.android.p023dx.p024cf.code;

import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.cf.code.ReturnAddress */
public final class ReturnAddress implements TypeBearer {
    private final int subroutineAddress;

    public ReturnAddress(int i) {
        if (i >= 0) {
            this.subroutineAddress = i;
            return;
        }
        throw new IllegalArgumentException("subroutineAddress < 0");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ReturnAddress) && this.subroutineAddress == ((ReturnAddress) obj).subroutineAddress) {
            return true;
        }
        return false;
    }

    public int getBasicFrameType() {
        return Type.RETURN_ADDRESS.getBasicFrameType();
    }

    public int getBasicType() {
        return Type.RETURN_ADDRESS.getBasicType();
    }

    public TypeBearer getFrameType() {
        return this;
    }

    public int getSubroutineAddress() {
        return this.subroutineAddress;
    }

    public Type getType() {
        return Type.RETURN_ADDRESS;
    }

    public int hashCode() {
        return this.subroutineAddress;
    }

    public boolean isConstant() {
        return false;
    }

    public String toHuman() {
        return toString();
    }

    public String toString() {
        return "<addr:" + Hex.m907u2(this.subroutineAddress) + ">";
    }
}
