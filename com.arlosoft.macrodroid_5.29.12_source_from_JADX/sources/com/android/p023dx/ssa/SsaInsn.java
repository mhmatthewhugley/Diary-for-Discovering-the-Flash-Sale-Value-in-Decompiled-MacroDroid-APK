package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.util.ToHuman;
import java.util.Objects;

/* renamed from: com.android.dx.ssa.SsaInsn */
public abstract class SsaInsn implements ToHuman, Cloneable {
    private final SsaBasicBlock block;
    private RegisterSpec result;

    /* renamed from: com.android.dx.ssa.SsaInsn$Visitor */
    public interface Visitor {
        void visitMoveInsn(NormalSsaInsn normalSsaInsn);

        void visitNonMoveInsn(NormalSsaInsn normalSsaInsn);

        void visitPhiInsn(PhiInsn phiInsn);
    }

    protected SsaInsn(RegisterSpec registerSpec, SsaBasicBlock ssaBasicBlock) {
        Objects.requireNonNull(ssaBasicBlock, "block == null");
        this.block = ssaBasicBlock;
        this.result = registerSpec;
    }

    public static SsaInsn makeFromRop(Insn insn, SsaBasicBlock ssaBasicBlock) {
        return new NormalSsaInsn(insn, ssaBasicBlock);
    }

    public abstract void accept(Visitor visitor);

    public abstract boolean canThrow();

    public void changeResultReg(int i) {
        RegisterSpec registerSpec = this.result;
        if (registerSpec != null) {
            this.result = registerSpec.withReg(i);
        }
    }

    public SsaBasicBlock getBlock() {
        return this.block;
    }

    public RegisterSpec getLocalAssignment() {
        RegisterSpec registerSpec = this.result;
        if (registerSpec == null || registerSpec.getLocalItem() == null) {
            return null;
        }
        return this.result;
    }

    public abstract Rop getOpcode();

    public abstract Insn getOriginalRopInsn();

    public RegisterSpec getResult() {
        return this.result;
    }

    public abstract RegisterSpecList getSources();

    public abstract boolean hasSideEffect();

    public boolean isMoveException() {
        return false;
    }

    public boolean isNormalMoveInsn() {
        return false;
    }

    public abstract boolean isPhiOrMove();

    public boolean isRegASource(int i) {
        return getSources().specForRegister(i) != null;
    }

    public boolean isResultReg(int i) {
        RegisterSpec registerSpec = this.result;
        return registerSpec != null && registerSpec.getReg() == i;
    }

    public final void mapRegisters(RegisterMapper registerMapper) {
        RegisterSpec registerSpec = this.result;
        this.result = registerMapper.map(registerSpec);
        this.block.getParent().updateOneDefinition(this, registerSpec);
        mapSourceRegisters(registerMapper);
    }

    public abstract void mapSourceRegisters(RegisterMapper registerMapper);

    /* access modifiers changed from: protected */
    public void setResult(RegisterSpec registerSpec) {
        Objects.requireNonNull(registerSpec, "result == null");
        this.result = registerSpec;
    }

    public final void setResultLocal(LocalItem localItem) {
        if (localItem == this.result.getLocalItem()) {
            return;
        }
        if (localItem == null || !localItem.equals(this.result.getLocalItem())) {
            this.result = RegisterSpec.makeLocalOptional(this.result.getReg(), this.result.getType(), localItem);
        }
    }

    public abstract Insn toRopInsn();

    public SsaInsn clone() {
        try {
            return (SsaInsn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("unexpected", e);
        }
    }
}
