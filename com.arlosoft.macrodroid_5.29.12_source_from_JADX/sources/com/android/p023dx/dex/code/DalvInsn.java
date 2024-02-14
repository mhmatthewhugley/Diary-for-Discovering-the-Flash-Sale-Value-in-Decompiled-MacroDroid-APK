package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.ssa.RegisterMapper;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.TwoColumnOutput;
import java.util.BitSet;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.DalvInsn */
public abstract class DalvInsn {
    private int address = -1;
    private final Dop opcode;
    private final SourcePosition position;
    private final RegisterSpecList registers;

    public DalvInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        Objects.requireNonNull(dop, "opcode == null");
        Objects.requireNonNull(sourcePosition, "position == null");
        Objects.requireNonNull(registerSpecList, "registers == null");
        this.opcode = dop;
        this.position = sourcePosition;
        this.registers = registerSpecList;
    }

    public static SimpleInsn makeMove(SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        Dop dop;
        boolean z = true;
        if (registerSpec.getCategory() != 1) {
            z = false;
        }
        boolean isReference = registerSpec.getType().isReference();
        int reg = registerSpec.getReg();
        if ((registerSpec2.getReg() | reg) < 16) {
            dop = isReference ? Dops.MOVE_OBJECT : z ? Dops.MOVE : Dops.MOVE_WIDE;
        } else if (reg < 256) {
            dop = isReference ? Dops.MOVE_OBJECT_FROM16 : z ? Dops.MOVE_FROM16 : Dops.MOVE_WIDE_FROM16;
        } else {
            dop = isReference ? Dops.MOVE_OBJECT_16 : z ? Dops.MOVE_16 : Dops.MOVE_WIDE_16;
        }
        return new SimpleInsn(dop, sourcePosition, RegisterSpecList.make(registerSpec, registerSpec2));
    }

    /* access modifiers changed from: protected */
    public abstract String argString();

    public abstract int codeSize();

    public DalvInsn expandedPrefix(BitSet bitSet) {
        RegisterSpecList registerSpecList = this.registers;
        boolean z = bitSet.get(0);
        if (hasResult()) {
            bitSet.set(0);
        }
        RegisterSpecList subset = registerSpecList.subset(bitSet);
        if (hasResult()) {
            bitSet.set(0, z);
        }
        if (subset.size() == 0) {
            return null;
        }
        return new HighRegisterPrefix(this.position, subset);
    }

    public DalvInsn expandedSuffix(BitSet bitSet) {
        if (!hasResult() || bitSet.get(0)) {
            return null;
        }
        RegisterSpec registerSpec = this.registers.get(0);
        return makeMove(this.position, registerSpec, registerSpec.withReg(0));
    }

    public DalvInsn expandedVersion(BitSet bitSet) {
        return withRegisters(this.registers.withExpandedRegisters(0, hasResult(), bitSet));
    }

    public final int getAddress() {
        int i = this.address;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    public DalvInsn getLowRegVersion() {
        return withRegisters(this.registers.withExpandedRegisters(0, hasResult(), (BitSet) null));
    }

    public final int getMinimumRegisterRequirement(BitSet bitSet) {
        int hasResult = hasResult();
        int size = this.registers.size();
        int i = 0;
        int category = (hasResult == 0 || bitSet.get(0)) ? 0 : this.registers.get(0).getCategory();
        while (hasResult < size) {
            if (!bitSet.get(hasResult)) {
                i += this.registers.get(hasResult).getCategory();
            }
            hasResult++;
        }
        return Math.max(i, category);
    }

    public final int getNextAddress() {
        return getAddress() + codeSize();
    }

    public final Dop getOpcode() {
        return this.opcode;
    }

    public final SourcePosition getPosition() {
        return this.position;
    }

    public final RegisterSpecList getRegisters() {
        return this.registers;
    }

    public final boolean hasAddress() {
        return this.address >= 0;
    }

    public final boolean hasResult() {
        return this.opcode.hasResult();
    }

    public final String identifierString() {
        int i = this.address;
        if (i == -1) {
            return Hex.m909u4(System.identityHashCode(this));
        }
        return String.format("%04x", new Object[]{Integer.valueOf(i)});
    }

    public final String listingString(String str, int i, boolean z) {
        String listingString0 = listingString0(z);
        if (listingString0 == null) {
            return null;
        }
        String str2 = str + identifierString() + ": ";
        int length = str2.length();
        return TwoColumnOutput.toString(str2, length, "", listingString0, i == 0 ? listingString0.length() : i - length);
    }

    /* access modifiers changed from: protected */
    public abstract String listingString0(boolean z);

    public final void setAddress(int i) {
        if (i >= 0) {
            this.address = i;
            return;
        }
        throw new IllegalArgumentException("address < 0");
    }

    public final String toString() {
        boolean z;
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(identifierString());
        stringBuffer.append(' ');
        stringBuffer.append(this.position);
        stringBuffer.append(": ");
        stringBuffer.append(this.opcode.getName());
        if (this.registers.size() != 0) {
            stringBuffer.append(this.registers.toHuman(" ", ", ", (String) null));
            z = true;
        } else {
            z = false;
        }
        String argString = argString();
        if (argString != null) {
            if (z) {
                stringBuffer.append(',');
            }
            stringBuffer.append(' ');
            stringBuffer.append(argString);
        }
        return stringBuffer.toString();
    }

    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return withRegisters(registerMapper.map(getRegisters()));
    }

    public abstract DalvInsn withOpcode(Dop dop);

    public abstract DalvInsn withRegisterOffset(int i);

    public abstract DalvInsn withRegisters(RegisterSpecList registerSpecList);

    public abstract void writeTo(AnnotatedOutput annotatedOutput);
}
