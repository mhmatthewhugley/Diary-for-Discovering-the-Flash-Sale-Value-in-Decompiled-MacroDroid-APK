package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.ssa.back.InterferenceGraph;
import com.android.p023dx.util.BitIntSet;
import com.android.p023dx.util.IntSet;
import java.util.ArrayList;

/* renamed from: com.android.dx.ssa.InterferenceRegisterMapper */
public class InterferenceRegisterMapper extends BasicRegisterMapper {
    private final ArrayList<BitIntSet> newRegInterference = new ArrayList<>();
    private final InterferenceGraph oldRegInterference;

    public InterferenceRegisterMapper(InterferenceGraph interferenceGraph, int i) {
        super(i);
        this.oldRegInterference = interferenceGraph;
    }

    private void addInterfence(int i, int i2) {
        int i3 = i + 1;
        this.newRegInterference.ensureCapacity(i3);
        while (i >= this.newRegInterference.size()) {
            this.newRegInterference.add(new BitIntSet(i3));
        }
        this.oldRegInterference.mergeInterferenceSet(i2, this.newRegInterference.get(i));
    }

    public void addMapping(int i, int i2, int i3) {
        super.addMapping(i, i2, i3);
        addInterfence(i2, i);
        if (i3 == 2) {
            addInterfence(i2 + 1, i);
        }
    }

    public boolean areAnyPinned(RegisterSpecList registerSpecList, int i, int i2) {
        int size = registerSpecList.size();
        for (int i3 = 0; i3 < size; i3++) {
            RegisterSpec registerSpec = registerSpecList.get(i3);
            int oldToNew = oldToNew(registerSpec.getReg());
            if (oldToNew == i) {
                return true;
            }
            if (registerSpec.getCategory() == 2 && oldToNew + 1 == i) {
                return true;
            }
            if (i2 == 2 && oldToNew == i + 1) {
                return true;
            }
        }
        return false;
    }

    public boolean interferes(int i, int i2, int i3) {
        IntSet intSet;
        if (i2 >= this.newRegInterference.size() || (intSet = this.newRegInterference.get(i2)) == null) {
            return false;
        }
        if (i3 == 1) {
            return intSet.has(i);
        }
        if (intSet.has(i) || interferes(i, i2 + 1, i3 - 1)) {
            return true;
        }
        return false;
    }

    public boolean interferes(RegisterSpec registerSpec, int i) {
        return interferes(registerSpec.getReg(), i, registerSpec.getCategory());
    }
}
