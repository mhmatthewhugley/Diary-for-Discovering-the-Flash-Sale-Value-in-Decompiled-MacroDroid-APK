package com.android.p023dx.rop.code;

import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.util.FixedSizeList;

/* renamed from: com.android.dx.rop.code.InsnList */
public final class InsnList extends FixedSizeList {
    public InsnList(int i) {
        super(i);
    }

    public boolean contentEquals(InsnList insnList) {
        int size;
        if (insnList == null || (size = size()) != insnList.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).contentEquals(insnList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void forEach(Insn.Visitor visitor) {
        int size = size();
        for (int i = 0; i < size; i++) {
            get(i).accept(visitor);
        }
    }

    public Insn get(int i) {
        return (Insn) get0(i);
    }

    public Insn getLast() {
        return get(size() - 1);
    }

    public void set(int i, Insn insn) {
        set0(i, insn);
    }

    public InsnList withRegisterOffset(int i) {
        int size = size();
        InsnList insnList = new InsnList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Insn insn = (Insn) get0(i2);
            if (insn != null) {
                insnList.set0(i2, insn.withRegisterOffset(i));
            }
        }
        if (isImmutable()) {
            insnList.setImmutable();
        }
        return insnList;
    }
}
