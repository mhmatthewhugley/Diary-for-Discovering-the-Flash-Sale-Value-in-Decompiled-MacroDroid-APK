package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.dex.code.SimpleInsn;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.util.AnnotatedOutput;
import java.util.BitSet;

/* renamed from: com.android.dx.dex.code.form.Form22x */
public final class Form22x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form22x();

    private Form22x() {
    }

    public int codeSize() {
        return 2;
    }

    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, InsnFormat.unsignedFitsInByte(registers.get(0).getReg()));
        bitSet.set(1, InsnFormat.unsignedFitsInShort(registers.get(1).getReg()));
        return bitSet;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return registers.get(0).regString() + ", " + registers.get(1).regString();
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return "";
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if (!(dalvInsn instanceof SimpleInsn) || registers.size() != 2 || !InsnFormat.unsignedFitsInByte(registers.get(0).getReg()) || !InsnFormat.unsignedFitsInShort(registers.get(1).getReg())) {
            return false;
        }
        return true;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.get(0).getReg()), (short) registers.get(1).getReg());
    }
}
