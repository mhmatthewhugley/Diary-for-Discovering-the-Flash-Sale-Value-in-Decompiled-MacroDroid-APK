package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.TargetInsn */
public final class TargetInsn extends FixedSizeInsn {
    private CodeAddress target;

    public TargetInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, CodeAddress codeAddress) {
        super(dop, sourcePosition, registerSpecList);
        Objects.requireNonNull(codeAddress, "target == null");
        this.target = codeAddress;
    }

    /* access modifiers changed from: protected */
    public String argString() {
        CodeAddress codeAddress = this.target;
        if (codeAddress == null) {
            return "????";
        }
        return codeAddress.identifierString();
    }

    public CodeAddress getTarget() {
        return this.target;
    }

    public int getTargetAddress() {
        return this.target.getAddress();
    }

    public int getTargetOffset() {
        return this.target.getAddress() - getAddress();
    }

    public boolean hasTargetOffset() {
        return hasAddress() && this.target.hasAddress();
    }

    public TargetInsn withNewTargetAndReversed(CodeAddress codeAddress) {
        return new TargetInsn(getOpcode().getOppositeTest(), getPosition(), getRegisters(), codeAddress);
    }

    public DalvInsn withOpcode(Dop dop) {
        return new TargetInsn(dop, getPosition(), getRegisters(), this.target);
    }

    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new TargetInsn(getOpcode(), getPosition(), registerSpecList, this.target);
    }
}
