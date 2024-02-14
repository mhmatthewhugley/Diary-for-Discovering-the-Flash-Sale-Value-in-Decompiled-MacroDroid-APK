package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.dex.code.SimpleInsn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.util.AnnotatedOutput;
import java.util.BitSet;

/* renamed from: com.android.dx.dex.code.form.Form12x */
public final class Form12x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form12x();

    private Form12x() {
    }

    public int codeSize() {
        return 1;
    }

    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(2);
        int reg = registers.get(0).getReg();
        int reg2 = registers.get(1).getReg();
        int size = registers.size();
        if (size == 2) {
            bitSet.set(0, InsnFormat.unsignedFitsInNibble(reg));
            bitSet.set(1, InsnFormat.unsignedFitsInNibble(reg2));
        } else if (size == 3) {
            if (reg != reg2) {
                bitSet.set(0, false);
                bitSet.set(1, false);
            } else {
                boolean unsignedFitsInNibble = InsnFormat.unsignedFitsInNibble(reg2);
                bitSet.set(0, unsignedFitsInNibble);
                bitSet.set(1, unsignedFitsInNibble);
            }
            bitSet.set(2, InsnFormat.unsignedFitsInNibble(registers.get(2).getReg()));
        } else {
            throw new AssertionError();
        }
        return bitSet;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        return registers.get(size - 2).regString() + ", " + registers.get(size - 1).regString();
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return "";
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpec registerSpec;
        RegisterSpec registerSpec2;
        if (!(dalvInsn instanceof SimpleInsn)) {
            return false;
        }
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        if (size == 2) {
            registerSpec2 = registers.get(0);
            registerSpec = registers.get(1);
        } else if (size != 3) {
            return false;
        } else {
            registerSpec2 = registers.get(1);
            registerSpec = registers.get(2);
            if (registerSpec2.getReg() != registers.get(0).getReg()) {
                return false;
            }
        }
        if (!InsnFormat.unsignedFitsInNibble(registerSpec2.getReg()) || !InsnFormat.unsignedFitsInNibble(registerSpec.getReg())) {
            return false;
        }
        return true;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, InsnFormat.makeByte(registers.get(size - 2).getReg(), registers.get(size - 1).getReg())));
    }
}
