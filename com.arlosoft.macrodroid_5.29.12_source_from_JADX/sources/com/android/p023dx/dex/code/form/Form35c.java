package com.android.p023dx.dex.code.form;

import com.android.p023dx.dex.code.CstInsn;
import com.android.p023dx.dex.code.DalvInsn;
import com.android.p023dx.dex.code.InsnFormat;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.AnnotatedOutput;
import java.util.BitSet;

/* renamed from: com.android.dx.dex.code.form.Form35c */
public final class Form35c extends InsnFormat {
    private static final int MAX_NUM_OPS = 5;
    public static final InsnFormat THE_ONE = new Form35c();

    private Form35c() {
    }

    private static RegisterSpecList explicitize(RegisterSpecList registerSpecList) {
        int wordCount = wordCount(registerSpecList);
        int size = registerSpecList.size();
        if (wordCount == size) {
            return registerSpecList;
        }
        RegisterSpecList registerSpecList2 = new RegisterSpecList(wordCount);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RegisterSpec registerSpec = registerSpecList.get(i2);
            registerSpecList2.set(i, registerSpec);
            if (registerSpec.getCategory() == 2) {
                registerSpecList2.set(i + 1, RegisterSpec.make(registerSpec.getReg() + 1, Type.VOID));
                i += 2;
            } else {
                i++;
            }
        }
        registerSpecList2.setImmutable();
        return registerSpecList2;
    }

    private static int wordCount(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        if (size > 5) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RegisterSpec registerSpec = registerSpecList.get(i2);
            i += registerSpec.getCategory();
            if (!InsnFormat.unsignedFitsInNibble((registerSpec.getReg() + registerSpec.getCategory()) - 1)) {
                return -1;
            }
        }
        if (i <= 5) {
            return i;
        }
        return -1;
    }

    public int codeSize() {
        return 3;
    }

    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        BitSet bitSet = new BitSet(size);
        for (int i = 0; i < size; i++) {
            RegisterSpec registerSpec = registers.get(i);
            bitSet.set(i, InsnFormat.unsignedFitsInNibble((registerSpec.getReg() + registerSpec.getCategory()) - 1));
        }
        return bitSet;
    }

    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList explicitize = explicitize(dalvInsn.getRegisters());
        return InsnFormat.regListString(explicitize) + ", " + InsnFormat.cstString(dalvInsn);
    }

    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return z ? InsnFormat.cstComment(dalvInsn) : "";
    }

    public boolean isCompatible(DalvInsn dalvInsn) {
        if (!(dalvInsn instanceof CstInsn)) {
            return false;
        }
        CstInsn cstInsn = (CstInsn) dalvInsn;
        if (!InsnFormat.unsignedFitsInShort(cstInsn.getIndex())) {
            return false;
        }
        Constant constant = cstInsn.getConstant();
        if (((constant instanceof CstMethodRef) || (constant instanceof CstType)) && wordCount(cstInsn.getRegisters()) >= 0) {
            return true;
        }
        return false;
    }

    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        int index = ((CstInsn) dalvInsn).getIndex();
        RegisterSpecList explicitize = explicitize(dalvInsn.getRegisters());
        int size = explicitize.size();
        int i = 0;
        int reg = size > 0 ? explicitize.get(0).getReg() : 0;
        int reg2 = size > 1 ? explicitize.get(1).getReg() : 0;
        int reg3 = size > 2 ? explicitize.get(2).getReg() : 0;
        int reg4 = size > 3 ? explicitize.get(3).getReg() : 0;
        if (size > 4) {
            i = explicitize.get(4).getReg();
        }
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, InsnFormat.makeByte(i, size)), (short) index, InsnFormat.codeUnit(reg, reg2, reg3, reg4));
    }
}
