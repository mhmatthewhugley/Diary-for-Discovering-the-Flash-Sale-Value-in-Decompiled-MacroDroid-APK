package com.android.p023dx.ssa.back;

import com.android.p023dx.rop.code.PlainInsn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rops;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.ssa.NormalSsaInsn;
import com.android.p023dx.ssa.RegisterMapper;
import com.android.p023dx.ssa.SsaBasicBlock;
import com.android.p023dx.ssa.SsaInsn;
import com.android.p023dx.ssa.SsaMethod;
import com.android.p023dx.util.IntIterator;
import java.util.ArrayList;

/* renamed from: com.android.dx.ssa.back.RegisterAllocator */
public abstract class RegisterAllocator {
    protected final InterferenceGraph interference;
    protected final SsaMethod ssaMeth;

    public RegisterAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        this.ssaMeth = ssaMethod;
        this.interference = interferenceGraph;
    }

    public abstract RegisterMapper allocateRegisters();

    /* access modifiers changed from: protected */
    public final int getCategoryForSsaReg(int i) {
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        if (definitionForRegister == null) {
            return 1;
        }
        return definitionForRegister.getResult().getCategory();
    }

    /* access modifiers changed from: protected */
    public final RegisterSpec getDefinitionSpecForSsaReg(int i) {
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        if (definitionForRegister == null) {
            return null;
        }
        return definitionForRegister.getResult();
    }

    /* access modifiers changed from: protected */
    public final RegisterSpec insertMoveBefore(SsaInsn ssaInsn, RegisterSpec registerSpec) {
        SsaBasicBlock block = ssaInsn.getBlock();
        ArrayList<SsaInsn> insns = block.getInsns();
        int indexOf = insns.indexOf(ssaInsn);
        if (indexOf < 0) {
            throw new IllegalArgumentException("specified insn is not in this block");
        } else if (indexOf == insns.size() - 1) {
            RegisterSpec make = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), registerSpec.getTypeBearer());
            insns.add(indexOf, SsaInsn.makeFromRop(new PlainInsn(Rops.opMove(make.getType()), SourcePosition.NO_INFO, make, RegisterSpecList.make(registerSpec)), block));
            int reg = make.getReg();
            IntIterator it = block.getLiveOutRegs().iterator();
            while (it.hasNext()) {
                this.interference.add(reg, it.next());
            }
            RegisterSpecList sources = ssaInsn.getSources();
            int size = sources.size();
            for (int i = 0; i < size; i++) {
                this.interference.add(reg, sources.get(i).getReg());
            }
            this.ssaMeth.onInsnsChanged();
            return make;
        } else {
            throw new IllegalArgumentException("Adding move here not supported:" + ssaInsn.toHuman());
        }
    }

    /* access modifiers changed from: protected */
    public boolean isDefinitionMoveParam(int i) {
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        if (!(definitionForRegister instanceof NormalSsaInsn) || ((NormalSsaInsn) definitionForRegister).getOpcode().getOpcode() != 3) {
            return false;
        }
        return true;
    }

    public abstract boolean wantsParamsMovedHigh();
}
