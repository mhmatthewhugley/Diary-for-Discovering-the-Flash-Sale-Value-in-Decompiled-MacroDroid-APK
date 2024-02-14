package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.CstInsn;
import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstLiteralBits;
import com.android.p023dx.util.AnnotatedOutput;
import java.util.BitSet;

/* renamed from: com.android.dx.dex.code.form.Form22s */
public final class Form22s extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form22s();

    private Form22s() {
    }

    public int codeSize() {
        return 2;
    }

    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, InsnFormat.unsignedFitsInNibble(registers.get(0).getReg()));
        bitSet.set(1, InsnFormat.unsignedFitsInNibble(registers.get(1).getReg()));
        return bitSet;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return registers.get(0).regString() + ", " + registers.get(1).regString() + ", " + InsnFormat.literalBitsString((CstLiteralBits) ((CstInsn) dalvInsn).getConstant());
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.literalBitsComment((CstLiteralBits) ((CstInsn) dalvInsn).getConstant(), 16);
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if (!(dalvInsn instanceof CstInsn) || registers.size() != 2 || !InsnFormat.unsignedFitsInNibble(registers.get(0).getReg()) || !InsnFormat.unsignedFitsInNibble(registers.get(1).getReg())) {
            return false;
        }
        Constant constant = ((CstInsn) dalvInsn).getConstant();
        if (!(constant instanceof CstLiteralBits)) {
            return false;
        }
        CstLiteralBits cstLiteralBits = (CstLiteralBits) constant;
        if (!cstLiteralBits.fitsInInt() || !InsnFormat.signedFitsInShort(cstLiteralBits.getIntBits())) {
            return false;
        }
        return true;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, InsnFormat.makeByte(registers.get(0).getReg(), registers.get(1).getReg())), (short) ((CstLiteralBits) ((CstInsn) dalvInsn).getConstant()).getIntBits());
    }
}
