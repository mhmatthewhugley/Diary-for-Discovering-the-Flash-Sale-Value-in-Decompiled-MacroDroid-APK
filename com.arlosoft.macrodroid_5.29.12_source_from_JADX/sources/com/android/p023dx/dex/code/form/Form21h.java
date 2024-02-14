package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.CstInsn;
import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstLiteralBits;
import com.android.p023dx.util.AnnotatedOutput;
import java.util.BitSet;

/* renamed from: com.android.dx.dex.code.form.Form21h */
public final class Form21h extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form21h();

    private Form21h() {
    }

    public int codeSize() {
        return 2;
    }

    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, InsnFormat.unsignedFitsInByte(registers.get(0).getReg()));
        return bitSet;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return registers.get(0).regString() + ", " + InsnFormat.literalBitsString((CstLiteralBits) ((CstInsn) dalvInsn).getConstant());
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.literalBitsComment((CstLiteralBits) ((CstInsn) dalvInsn).getConstant(), dalvInsn.getRegisters().get(0).getCategory() == 1 ? 32 : 64);
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if (!(dalvInsn instanceof CstInsn) || registers.size() != 1 || !InsnFormat.unsignedFitsInByte(registers.get(0).getReg())) {
            return false;
        }
        Constant constant = ((CstInsn) dalvInsn).getConstant();
        if (!(constant instanceof CstLiteralBits)) {
            return false;
        }
        CstLiteralBits cstLiteralBits = (CstLiteralBits) constant;
        if (registers.get(0).getCategory() == 1) {
            if ((cstLiteralBits.getIntBits() & 65535) == 0) {
                return true;
            }
            return false;
        } else if ((cstLiteralBits.getLongBits() & 281474976710655L) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        int i;
        RegisterSpecList registers = dalvInsn.getRegisters();
        CstLiteralBits cstLiteralBits = (CstLiteralBits) ((CstInsn) dalvInsn).getConstant();
        if (registers.get(0).getCategory() == 1) {
            i = cstLiteralBits.getIntBits() >>> 16;
        } else {
            i = (int) (cstLiteralBits.getLongBits() >>> 48);
        }
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.get(0).getReg()), (short) i);
    }
}
