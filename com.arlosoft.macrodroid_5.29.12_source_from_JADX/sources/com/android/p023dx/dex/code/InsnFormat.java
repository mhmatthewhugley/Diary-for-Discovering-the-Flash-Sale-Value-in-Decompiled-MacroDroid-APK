package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.cst.CstKnownNull;
import com.android.p023dx.rop.cst.CstLiteral64;
import com.android.p023dx.rop.cst.CstLiteralBits;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.BitSet;

/* renamed from: com.android.dx.dex.code.InsnFormat */
public abstract class InsnFormat {
    public static boolean ALLOW_EXTENDED_OPCODES = true;

    protected static int argIndex(DalvInsn dalvInsn) {
        int value = ((CstInteger) ((CstInsn) dalvInsn).getConstant()).getValue();
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException("bogus insn");
    }

    protected static String branchComment(DalvInsn dalvInsn) {
        int targetOffset = ((TargetInsn) dalvInsn).getTargetOffset();
        return targetOffset == ((short) targetOffset) ? Hex.m903s2(targetOffset) : Hex.m904s4(targetOffset);
    }

    protected static String branchString(DalvInsn dalvInsn) {
        int targetAddress = ((TargetInsn) dalvInsn).getTargetAddress();
        return targetAddress == ((char) targetAddress) ? Hex.m907u2(targetAddress) : Hex.m909u4(targetAddress);
    }

    protected static short codeUnit(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        } else if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        } else {
            throw new IllegalArgumentException("high out of range 0..255");
        }
    }

    protected static String cstComment(DalvInsn dalvInsn) {
        CstInsn cstInsn = (CstInsn) dalvInsn;
        if (!cstInsn.hasIndex()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        int index = cstInsn.getIndex();
        sb.append(cstInsn.getConstant().typeName());
        sb.append('@');
        if (index < 65536) {
            sb.append(Hex.m907u2(index));
        } else {
            sb.append(Hex.m909u4(index));
        }
        return sb.toString();
    }

    protected static String cstString(DalvInsn dalvInsn) {
        Constant constant = ((CstInsn) dalvInsn).getConstant();
        return constant instanceof CstString ? ((CstString) constant).toQuoted() : constant.toHuman();
    }

    protected static boolean isRegListSequential(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        if (size < 2) {
            return true;
        }
        int reg = registerSpecList.get(0).getReg();
        for (int i = 0; i < size; i++) {
            RegisterSpec registerSpec = registerSpecList.get(i);
            if (registerSpec.getReg() != reg) {
                return false;
            }
            reg += registerSpec.getCategory();
        }
        return true;
    }

    protected static String literalBitsComment(CstLiteralBits cstLiteralBits, int i) {
        long j;
        StringBuffer stringBuffer = new StringBuffer(20);
        stringBuffer.append("#");
        if (cstLiteralBits instanceof CstLiteral64) {
            j = ((CstLiteral64) cstLiteralBits).getLongBits();
        } else {
            j = (long) cstLiteralBits.getIntBits();
        }
        if (i == 4) {
            stringBuffer.append(Hex.uNibble((int) j));
        } else if (i == 8) {
            stringBuffer.append(Hex.m906u1((int) j));
        } else if (i == 16) {
            stringBuffer.append(Hex.m907u2((int) j));
        } else if (i == 32) {
            stringBuffer.append(Hex.m909u4((int) j));
        } else if (i == 64) {
            stringBuffer.append(Hex.m910u8(j));
        } else {
            throw new RuntimeException("shouldn't happen");
        }
        return stringBuffer.toString();
    }

    protected static String literalBitsString(CstLiteralBits cstLiteralBits) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append('#');
        if (cstLiteralBits instanceof CstKnownNull) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(cstLiteralBits.typeName());
            stringBuffer.append(' ');
            stringBuffer.append(cstLiteralBits.toHuman());
        }
        return stringBuffer.toString();
    }

    protected static int makeByte(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        } else if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        } else {
            throw new IllegalArgumentException("high out of range 0..15");
        }
    }

    protected static short opcodeUnit(DalvInsn dalvInsn, int i) {
        if ((i & 255) == i) {
            int opcode = dalvInsn.getOpcode().getOpcode();
            if ((opcode & 255) == opcode) {
                return (short) (opcode | (i << 8));
            }
            throw new IllegalArgumentException("opcode out of range 0..255");
        }
        throw new IllegalArgumentException("arg out of range 0..255");
    }

    protected static String regListString(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        StringBuffer stringBuffer = new StringBuffer((size * 5) + 2);
        stringBuffer.append('{');
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(registerSpecList.get(i).regString());
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    protected static String regRangeString(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (size != 0) {
            if (size != 1) {
                RegisterSpec registerSpec = registerSpecList.get(size - 1);
                if (registerSpec.getCategory() == 2) {
                    registerSpec = registerSpec.withOffset(1);
                }
                sb.append(registerSpecList.get(0).regString());
                sb.append("..");
                sb.append(registerSpec.regString());
            } else {
                sb.append(registerSpecList.get(0).regString());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    protected static boolean signedFitsInByte(int i) {
        return ((byte) i) == i;
    }

    protected static boolean signedFitsInNibble(int i) {
        return i >= -8 && i <= 7;
    }

    protected static boolean signedFitsInShort(int i) {
        return ((short) i) == i;
    }

    protected static boolean unsignedFitsInByte(int i) {
        return i == (i & 255);
    }

    protected static boolean unsignedFitsInNibble(int i) {
        return i == (i & 15);
    }

    protected static boolean unsignedFitsInShort(int i) {
        return i == (65535 & i);
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s) {
        annotatedOutput.writeShort(s);
    }

    public boolean branchFits(TargetInsn targetInsn) {
        return false;
    }

    public abstract int codeSize();

    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        return new BitSet();
    }

    public abstract String insnArgString(DalvInsn dalvInsn);

    public abstract String insnCommentString(DalvInsn dalvInsn, boolean z);

    public abstract boolean isCompatible(DalvInsn dalvInsn);

    public final String listingString(DalvInsn dalvInsn, boolean z) {
        String name = dalvInsn.getOpcode().getName();
        String insnArgString = insnArgString(dalvInsn);
        String insnCommentString = insnCommentString(dalvInsn, z);
        StringBuilder sb = new StringBuilder(100);
        sb.append(name);
        if (insnArgString.length() != 0) {
            sb.append(' ');
            sb.append(insnArgString);
        }
        if (insnCommentString.length() != 0) {
            sb.append(" // ");
            sb.append(insnCommentString);
        }
        return sb.toString();
    }

    public abstract void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn);

    protected static void write(AnnotatedOutput annotatedOutput, short s, short s2) {
        annotatedOutput.writeShort(s);
        annotatedOutput.writeShort(s2);
    }

    protected static short codeUnit(int i, int i2, int i3, int i4) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        } else if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        } else if ((i3 & 15) != i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        } else if ((i4 & 15) == i4) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        } else {
            throw new IllegalArgumentException("n3 out of range 0..15");
        }
    }

    protected static short opcodeUnit(DalvInsn dalvInsn) {
        int opcode = dalvInsn.getOpcode().getOpcode();
        if (opcode >= 256 && opcode <= 65535) {
            return (short) opcode;
        }
        throw new IllegalArgumentException("opcode out of range 0..65535");
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s, short s2, short s3) {
        annotatedOutput.writeShort(s);
        annotatedOutput.writeShort(s2);
        annotatedOutput.writeShort(s3);
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s, short s2, short s3, short s4) {
        annotatedOutput.writeShort(s);
        annotatedOutput.writeShort(s2);
        annotatedOutput.writeShort(s3);
        annotatedOutput.writeShort(s4);
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s, short s2, short s3, short s4, short s5) {
        annotatedOutput.writeShort(s);
        annotatedOutput.writeShort(s2);
        annotatedOutput.writeShort(s3);
        annotatedOutput.writeShort(s4);
        annotatedOutput.writeShort(s5);
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s, int i) {
        write(annotatedOutput, s, (short) i, (short) (i >> 16));
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s, int i, short s2) {
        write(annotatedOutput, s, (short) i, (short) (i >> 16), s2);
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s, int i, short s2, short s3) {
        write(annotatedOutput, s, (short) i, (short) (i >> 16), s2, s3);
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s, long j) {
        write(annotatedOutput, s, (short) ((int) j), (short) ((int) (j >> 16)), (short) ((int) (j >> 32)), (short) ((int) (j >> 48)));
    }
}
