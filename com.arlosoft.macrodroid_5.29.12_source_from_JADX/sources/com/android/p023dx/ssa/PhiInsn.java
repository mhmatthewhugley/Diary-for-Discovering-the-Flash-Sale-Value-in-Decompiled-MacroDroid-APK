package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.ssa.SsaInsn;
import com.android.p023dx.util.Hex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.android.dx.ssa.PhiInsn */
public final class PhiInsn extends SsaInsn {
    private final ArrayList<Operand> operands = new ArrayList<>();
    private final int ropResultReg;
    private RegisterSpecList sources;

    /* renamed from: com.android.dx.ssa.PhiInsn$Operand */
    private static class Operand {
        public final int blockIndex;
        public RegisterSpec regSpec;
        public final int ropLabel;

        public Operand(RegisterSpec registerSpec, int i, int i2) {
            this.regSpec = registerSpec;
            this.blockIndex = i;
            this.ropLabel = i2;
        }
    }

    /* renamed from: com.android.dx.ssa.PhiInsn$Visitor */
    public interface Visitor {
        void visitPhiInsn(PhiInsn phiInsn);
    }

    public PhiInsn(RegisterSpec registerSpec, SsaBasicBlock ssaBasicBlock) {
        super(registerSpec, ssaBasicBlock);
        this.ropResultReg = registerSpec.getReg();
    }

    public void accept(SsaInsn.Visitor visitor) {
        visitor.visitPhiInsn(this);
    }

    public void addPhiOperand(RegisterSpec registerSpec, SsaBasicBlock ssaBasicBlock) {
        this.operands.add(new Operand(registerSpec, ssaBasicBlock.getIndex(), ssaBasicBlock.getRopLabel()));
        this.sources = null;
    }

    public boolean areAllOperandsEqual() {
        if (this.operands.size() == 0) {
            return true;
        }
        int reg = this.operands.get(0).regSpec.getReg();
        Iterator<Operand> it = this.operands.iterator();
        while (it.hasNext()) {
            if (reg != it.next().regSpec.getReg()) {
                return false;
            }
        }
        return true;
    }

    public boolean canThrow() {
        return false;
    }

    public void changeResultType(TypeBearer typeBearer, LocalItem localItem) {
        setResult(RegisterSpec.makeLocalOptional(getResult().getReg(), typeBearer, localItem));
    }

    public Rop getOpcode() {
        return null;
    }

    public Insn getOriginalRopInsn() {
        return null;
    }

    public int getRopResultReg() {
        return this.ropResultReg;
    }

    public RegisterSpecList getSources() {
        RegisterSpecList registerSpecList = this.sources;
        if (registerSpecList != null) {
            return registerSpecList;
        }
        if (this.operands.size() == 0) {
            return RegisterSpecList.EMPTY;
        }
        int size = this.operands.size();
        this.sources = new RegisterSpecList(size);
        for (int i = 0; i < size; i++) {
            this.sources.set(i, this.operands.get(i).regSpec);
        }
        this.sources.setImmutable();
        return this.sources;
    }

    public boolean hasSideEffect() {
        return Optimizer.getPreserveLocals() && getLocalAssignment() != null;
    }

    public boolean isPhiOrMove() {
        return true;
    }

    public boolean isRegASource(int i) {
        Iterator<Operand> it = this.operands.iterator();
        while (it.hasNext()) {
            if (it.next().regSpec.getReg() == i) {
                return true;
            }
        }
        return false;
    }

    public final void mapSourceRegisters(RegisterMapper registerMapper) {
        Iterator<Operand> it = this.operands.iterator();
        while (it.hasNext()) {
            Operand next = it.next();
            RegisterSpec registerSpec = next.regSpec;
            RegisterSpec map = registerMapper.map(registerSpec);
            next.regSpec = map;
            if (registerSpec != map) {
                getBlock().getParent().onSourceChanged(this, registerSpec, next.regSpec);
            }
        }
        this.sources = null;
    }

    public int predBlockIndexForSourcesIndex(int i) {
        return this.operands.get(i).blockIndex;
    }

    public List<SsaBasicBlock> predBlocksForReg(int i, SsaMethod ssaMethod) {
        ArrayList arrayList = new ArrayList();
        Iterator<Operand> it = this.operands.iterator();
        while (it.hasNext()) {
            Operand next = it.next();
            if (next.regSpec.getReg() == i) {
                arrayList.add(ssaMethod.getBlocks().get(next.blockIndex));
            }
        }
        return arrayList;
    }

    public void removePhiRegister(RegisterSpec registerSpec) {
        ArrayList arrayList = new ArrayList();
        Iterator<Operand> it = this.operands.iterator();
        while (it.hasNext()) {
            Operand next = it.next();
            if (next.regSpec.getReg() == registerSpec.getReg()) {
                arrayList.add(next);
            }
        }
        this.operands.removeAll(arrayList);
        this.sources = null;
    }

    public String toHuman() {
        return toHumanWithInline((String) null);
    }

    /* access modifiers changed from: protected */
    public final String toHumanWithInline(String str) {
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append(SourcePosition.NO_INFO);
        stringBuffer.append(": phi");
        if (str != null) {
            stringBuffer.append("(");
            stringBuffer.append(str);
            stringBuffer.append(")");
        }
        RegisterSpec result = getResult();
        if (result == null) {
            stringBuffer.append(" .");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(result.toHuman());
        }
        stringBuffer.append(" <-");
        int size = getSources().size();
        if (size == 0) {
            stringBuffer.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                stringBuffer.append(" ");
                stringBuffer.append(this.sources.get(i).toHuman() + "[b=" + Hex.m907u2(this.operands.get(i).ropLabel) + "]");
            }
        }
        return stringBuffer.toString();
    }

    public Insn toRopInsn() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    public void updateSourcesToDefinitions(SsaMethod ssaMethod) {
        Iterator<Operand> it = this.operands.iterator();
        while (it.hasNext()) {
            Operand next = it.next();
            next.regSpec = next.regSpec.withType(ssaMethod.getDefinitionForRegister(next.regSpec.getReg()).getResult().getType());
        }
        this.sources = null;
    }

    public PhiInsn clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    public PhiInsn(int i, SsaBasicBlock ssaBasicBlock) {
        super(RegisterSpec.make(i, Type.VOID), ssaBasicBlock);
        this.ropResultReg = i;
    }
}
