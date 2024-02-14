package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.CstInsn;
import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstFieldRef;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.util.AnnotatedOutput;
import java.util.BitSet;

/* renamed from: com.android.dx.dex.code.form.Form31c */
public final class Form31c extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form31c();

    private Form31c() {
    }

    public int codeSize() {
        return 3;
    }

    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        BitSet bitSet = new BitSet(size);
        boolean unsignedFitsInByte = InsnFormat.unsignedFitsInByte(registers.get(0).getReg());
        if (size == 1) {
            bitSet.set(0, unsignedFitsInByte);
        } else if (registers.get(0).getReg() == registers.get(1).getReg()) {
            bitSet.set(0, unsignedFitsInByte);
            bitSet.set(1, unsignedFitsInByte);
        }
        return bitSet;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        return registers.get(0).regString() + ", " + InsnFormat.cstString(dalvInsn);
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return z ? InsnFormat.cstComment(dalvInsn) : "";
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpec registerSpec;
        if (!(dalvInsn instanceof CstInsn)) {
            return false;
        }
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        if (size == 1) {
            registerSpec = registers.get(0);
        } else if (size != 2) {
            return false;
        } else {
            registerSpec = registers.get(0);
            if (registerSpec.getReg() != registers.get(1).getReg()) {
                return false;
            }
        }
        if (!InsnFormat.unsignedFitsInByte(registerSpec.getReg())) {
            return false;
        }
        Constant constant = ((CstInsn) dalvInsn).getConstant();
        if ((constant instanceof CstType) || (constant instanceof CstFieldRef) || (constant instanceof CstString)) {
            return true;
        }
        return false;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.get(0).getReg()), ((CstInsn) dalvInsn).getIndex());
    }
}
