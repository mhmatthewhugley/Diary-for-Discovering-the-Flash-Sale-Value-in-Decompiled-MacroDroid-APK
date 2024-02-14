package com.android.p023dx.ssa.back;

import com.android.p023dx.rop.code.CstInsn;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.ssa.BasicRegisterMapper;
import com.android.p023dx.ssa.NormalSsaInsn;
import com.android.p023dx.ssa.RegisterMapper;
import com.android.p023dx.ssa.SsaMethod;
import com.android.p023dx.util.BitIntSet;
import java.util.BitSet;

/* renamed from: com.android.dx.ssa.back.FirstFitAllocator */
public class FirstFitAllocator extends RegisterAllocator {
    private static final boolean PRESLOT_PARAMS = true;
    private final BitSet mapped;

    public FirstFitAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        super(ssaMethod, interferenceGraph);
        this.mapped = new BitSet(ssaMethod.getRegCount());
    }

    private int paramNumberFromMoveParam(NormalSsaInsn normalSsaInsn) {
        return ((CstInteger) ((CstInsn) normalSsaInsn.getOriginalRopInsn()).getConstant()).getValue();
    }

    public RegisterMapper allocateRegisters() {
        boolean z;
        int i;
        int regCount = this.ssaMeth.getRegCount();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(regCount);
        int paramWidth = this.ssaMeth.getParamWidth();
        for (int i2 = 0; i2 < regCount; i2++) {
            if (!this.mapped.get(i2)) {
                int categoryForSsaReg = getCategoryForSsaReg(i2);
                BitIntSet bitIntSet = new BitIntSet(regCount);
                this.interference.mergeInterferenceSet(i2, bitIntSet);
                if (isDefinitionMoveParam(i2)) {
                    i = paramNumberFromMoveParam((NormalSsaInsn) this.ssaMeth.getDefinitionForRegister(i2));
                    basicRegisterMapper.addMapping(i2, i, categoryForSsaReg);
                    z = true;
                } else {
                    basicRegisterMapper.addMapping(i2, paramWidth, categoryForSsaReg);
                    i = paramWidth;
                    z = false;
                }
                for (int i3 = i2 + 1; i3 < regCount; i3++) {
                    if (!this.mapped.get(i3) && !isDefinitionMoveParam(i3) && !bitIntSet.has(i3) && (!z || categoryForSsaReg >= getCategoryForSsaReg(i3))) {
                        this.interference.mergeInterferenceSet(i3, bitIntSet);
                        categoryForSsaReg = Math.max(categoryForSsaReg, getCategoryForSsaReg(i3));
                        basicRegisterMapper.addMapping(i3, i, categoryForSsaReg);
                        this.mapped.set(i3);
                    }
                }
                this.mapped.set(i2);
                if (!z) {
                    paramWidth += categoryForSsaReg;
                }
            }
        }
        return basicRegisterMapper;
    }

    public boolean wantsParamsMovedHigh() {
        return true;
    }
}
