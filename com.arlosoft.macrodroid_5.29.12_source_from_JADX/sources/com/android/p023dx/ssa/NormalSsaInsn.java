package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.ssa.SsaInsn;

/* renamed from: com.android.dx.ssa.NormalSsaInsn */
public final class NormalSsaInsn extends SsaInsn {
    private Insn insn;

    NormalSsaInsn(Insn insn2, SsaBasicBlock ssaBasicBlock) {
        super(insn2.getResult(), ssaBasicBlock);
        this.insn = insn2;
    }

    public void accept(SsaInsn.Visitor visitor) {
        if (isNormalMoveInsn()) {
            visitor.visitMoveInsn(this);
        } else {
            visitor.visitNonMoveInsn(this);
        }
    }

    public boolean canThrow() {
        return this.insn.canThrow();
    }

    public final void changeOneSource(int i, RegisterSpec registerSpec) {
        RegisterSpec registerSpec2;
        RegisterSpecList sources = this.insn.getSources();
        int size = sources.size();
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == i) {
                registerSpec2 = registerSpec;
            } else {
                registerSpec2 = sources.get(i2);
            }
            registerSpecList.set(i2, registerSpec2);
        }
        registerSpecList.setImmutable();
        RegisterSpec registerSpec3 = sources.get(i);
        if (registerSpec3.getReg() != registerSpec.getReg()) {
            getBlock().getParent().onSourceChanged(this, registerSpec3, registerSpec);
        }
        this.insn = this.insn.withNewRegisters(getResult(), registerSpecList);
    }

    public RegisterSpec getLocalAssignment() {
        RegisterSpec registerSpec;
        if (this.insn.getOpcode().getOpcode() == 54) {
            registerSpec = this.insn.getSources().get(0);
        } else {
            registerSpec = getResult();
        }
        if (registerSpec == null || registerSpec.getLocalItem() == null) {
            return null;
        }
        return registerSpec;
    }

    public Rop getOpcode() {
        return this.insn.getOpcode();
    }

    public Insn getOriginalRopInsn() {
        return this.insn;
    }

    public RegisterSpecList getSources() {
        return this.insn.getSources();
    }

    public boolean hasSideEffect() {
        Rop opcode = getOpcode();
        if (opcode.getBranchingness() != 1) {
            return true;
        }
        boolean z = Optimizer.getPreserveLocals() && getLocalAssignment() != null;
        int opcode2 = opcode.getOpcode();
        if (opcode2 == 2 || opcode2 == 5 || opcode2 == 55) {
            return z;
        }
        return true;
    }

    public boolean isMoveException() {
        return this.insn.getOpcode().getOpcode() == 4;
    }

    public boolean isNormalMoveInsn() {
        return this.insn.getOpcode().getOpcode() == 2;
    }

    public boolean isPhiOrMove() {
        return isNormalMoveInsn();
    }

    public final void mapSourceRegisters(RegisterMapper registerMapper) {
        RegisterSpecList sources = this.insn.getSources();
        RegisterSpecList map = registerMapper.map(sources);
        if (map != sources) {
            this.insn = this.insn.withNewRegisters(getResult(), map);
            getBlock().getParent().onSourcesChanged(this, sources);
        }
    }

    public final void setNewSources(RegisterSpecList registerSpecList) {
        if (this.insn.getSources().size() == registerSpecList.size()) {
            this.insn = this.insn.withNewRegisters(getResult(), registerSpecList);
            return;
        }
        throw new RuntimeException("Sources counts don't match");
    }

    public String toHuman() {
        return toRopInsn().toHuman();
    }

    public Insn toRopInsn() {
        return this.insn.withNewRegisters(getResult(), this.insn.getSources());
    }

    public void upgradeToLiteral() {
        RegisterSpecList sources = this.insn.getSources();
        this.insn = this.insn.withSourceLiteral();
        getBlock().getParent().onSourcesChanged(this, sources);
    }

    public NormalSsaInsn clone() {
        return (NormalSsaInsn) super.clone();
    }
}
