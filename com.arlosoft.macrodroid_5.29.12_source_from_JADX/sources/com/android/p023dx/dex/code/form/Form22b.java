package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.CstInsn;
import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstLiteralBits;
import com.android.p023dx.util.AnnotatedOutput;
import java.util.BitSet;

/* renamed from: com.android.dx.dex.code.form.Form22b */
public final class Form22b extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form22b();

    private Form22b() {
    }

    public int codeSize() {
        return 2;
    }

    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, InsnFormat.unsignedFitsInByte(registers.get(0).getReg()));
        bitSet.set(1, InsnFormat.unsignedFitsInByte(registers.get(1).getReg()));
        return bitSet;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return registers.get(0).regString() + ", " + registers.get(1).regString() + ", " + InsnFormat.literalBitsString((CstLiteralBits) ((CstInsn) dalvInsn).getConstant());
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.literalBitsComment((CstLiteralBits) ((CstInsn) dalvInsn).getConstant(), 8);
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if (!(dalvInsn instanceof CstInsn) || registers.size() != 2 || !InsnFormat.unsignedFitsInByte(registers.get(0).getReg()) || !InsnFormat.unsignedFitsInByte(registers.get(1).getReg())) {
            return false;
        }
        Constant constant = ((CstInsn) dalvInsn).getConstant();
        if (!(constant instanceof CstLiteralBits)) {
            return false;
        }
        CstLiteralBits cstLiteralBits = (CstLiteralBits) constant;
        if (!cstLiteralBits.fitsInInt() || !InsnFormat.signedFitsInByte(cstLiteralBits.getIntBits())) {
            return false;
        }
        return true;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.get(0).getReg()), InsnFormat.codeUnit(registers.get(1).getReg(), ((CstLiteralBits) ((CstInsn) dalvInsn).getConstant()).getIntBits() & 255));
    }
}
