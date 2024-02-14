package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.util.IntList;

/* renamed from: com.android.dx.ssa.BasicRegisterMapper */
public class BasicRegisterMapper extends RegisterMapper {
    private IntList oldToNew;
    private int runningCountNewRegisters;

    public BasicRegisterMapper(int i) {
        this.oldToNew = new IntList(i);
    }

    public void addMapping(int i, int i2, int i3) {
        if (i >= this.oldToNew.size()) {
            for (int size = i - this.oldToNew.size(); size >= 0; size--) {
                this.oldToNew.add(-1);
            }
        }
        this.oldToNew.set(i, i2);
        int i4 = i2 + i3;
        if (this.runningCountNewRegisters < i4) {
            this.runningCountNewRegisters = i4;
        }
    }

    public int getNewRegisterCount() {
        return this.runningCountNewRegisters;
    }

    public RegisterSpec map(RegisterSpec registerSpec) {
        int i;
        if (registerSpec == null) {
            return null;
        }
        try {
            i = this.oldToNew.get(registerSpec.getReg());
        } catch (IndexOutOfBoundsException unused) {
            i = -1;
        }
        if (i >= 0) {
            return registerSpec.withReg(i);
        }
        throw new RuntimeException("no mapping specified for register");
    }

    public int oldToNew(int i) {
        if (i >= this.oldToNew.size()) {
            return -1;
        }
        return this.oldToNew.get(i);
    }

    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        sb.append("Old\tNew\n");
        int size = this.oldToNew.size();
        for (int i = 0; i < size; i++) {
            sb.append(i);
            sb.append(9);
            sb.append(this.oldToNew.get(i));
            sb.append(10);
        }
        sb.append("new reg count:");
        sb.append(this.runningCountNewRegisters);
        sb.append(10);
        return sb.toString();
    }
}
