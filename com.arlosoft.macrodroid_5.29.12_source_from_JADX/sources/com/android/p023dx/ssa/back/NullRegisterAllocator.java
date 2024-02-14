package com.android.p023dx.ssa.back;

import com.android.p023dx.ssa.BasicRegisterMapper;
import com.android.p023dx.ssa.RegisterMapper;
import com.android.p023dx.ssa.SsaMethod;

/* renamed from: com.android.dx.ssa.back.NullRegisterAllocator */
public class NullRegisterAllocator extends RegisterAllocator {
    public NullRegisterAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        super(ssaMethod, interferenceGraph);
    }

    public RegisterMapper allocateRegisters() {
        int regCount = this.ssaMeth.getRegCount();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(regCount);
        for (int i = 0; i < regCount; i++) {
            basicRegisterMapper.addMapping(i, i * 2, 2);
        }
        return basicRegisterMapper;
    }

    public boolean wantsParamsMovedHigh() {
        return false;
    }
}
