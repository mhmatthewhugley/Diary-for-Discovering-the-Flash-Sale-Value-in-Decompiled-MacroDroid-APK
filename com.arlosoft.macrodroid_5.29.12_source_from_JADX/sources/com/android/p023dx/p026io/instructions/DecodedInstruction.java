package com.android.p023dx.p026io.instructions;

import androidx.core.view.InputDeviceCompat;
import com.android.dex.DexException;
import com.android.p023dx.p026io.IndexType;
import com.android.p023dx.p026io.OpcodeInfo;
import com.android.p023dx.p026io.Opcodes;
import com.android.p023dx.util.Hex;
import java.io.EOFException;
import java.util.Objects;

/* renamed from: com.android.dx.io.instructions.DecodedInstruction */
public abstract class DecodedInstruction {
    private final InstructionCodec format;
    private final int index;
    private final IndexType indexType;
    private final long literal;
    private final int opcode;
    private final int target;

    public DecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType2, int i3, long j) {
        Objects.requireNonNull(instructionCodec, "format == null");
        if (Opcodes.isValidShape(i)) {
            this.format = instructionCodec;
            this.opcode = i;
            this.index = i2;
            this.indexType = indexType2;
            this.target = i3;
            this.literal = j;
            return;
        }
        throw new IllegalArgumentException("invalid opcode");
    }

    public static DecodedInstruction decode(CodeInput codeInput) throws EOFException {
        int read = codeInput.read();
        return OpcodeInfo.getFormat(Opcodes.extractOpcodeFromUnit(read)).decode(read, codeInput);
    }

    public static DecodedInstruction[] decodeAll(short[] sArr) {
        DecodedInstruction[] decodedInstructionArr = new DecodedInstruction[sArr.length];
        ShortArrayCodeInput shortArrayCodeInput = new ShortArrayCodeInput(sArr);
        while (shortArrayCodeInput.hasMore()) {
            try {
                decodedInstructionArr[shortArrayCodeInput.cursor()] = decode(shortArrayCodeInput);
            } catch (EOFException e) {
                throw new DexException((Throwable) e);
            }
        }
        return decodedInstructionArr;
    }

    public final void encode(CodeOutput codeOutput) {
        this.format.encode(this, codeOutput);
    }

    public int getA() {
        return 0;
    }

    public final short getAByte() {
        int a = getA();
        if ((a & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) a;
        }
        throw new DexException("Register A out of range: " + Hex.m910u8((long) a));
    }

    public final short getANibble() {
        int a = getA();
        if ((a & -16) == 0) {
            return (short) a;
        }
        throw new DexException("Register A out of range: " + Hex.m910u8((long) a));
    }

    public final short getAUnit() {
        int a = getA();
        if ((-65536 & a) == 0) {
            return (short) a;
        }
        throw new DexException("Register A out of range: " + Hex.m910u8((long) a));
    }

    public int getB() {
        return 0;
    }

    public final short getBByte() {
        int b = getB();
        if ((b & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) b;
        }
        throw new DexException("Register B out of range: " + Hex.m910u8((long) b));
    }

    public final short getBNibble() {
        int b = getB();
        if ((b & -16) == 0) {
            return (short) b;
        }
        throw new DexException("Register B out of range: " + Hex.m910u8((long) b));
    }

    public final short getBUnit() {
        int b = getB();
        if ((-65536 & b) == 0) {
            return (short) b;
        }
        throw new DexException("Register B out of range: " + Hex.m910u8((long) b));
    }

    public int getC() {
        return 0;
    }

    public final short getCByte() {
        int c = getC();
        if ((c & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) c;
        }
        throw new DexException("Register C out of range: " + Hex.m910u8((long) c));
    }

    public final short getCNibble() {
        int c = getC();
        if ((c & -16) == 0) {
            return (short) c;
        }
        throw new DexException("Register C out of range: " + Hex.m910u8((long) c));
    }

    public final short getCUnit() {
        int c = getC();
        if ((-65536 & c) == 0) {
            return (short) c;
        }
        throw new DexException("Register C out of range: " + Hex.m910u8((long) c));
    }

    public int getD() {
        return 0;
    }

    public final short getDByte() {
        int d = getD();
        if ((d & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) d;
        }
        throw new DexException("Register D out of range: " + Hex.m910u8((long) d));
    }

    public final short getDNibble() {
        int d = getD();
        if ((d & -16) == 0) {
            return (short) d;
        }
        throw new DexException("Register D out of range: " + Hex.m910u8((long) d));
    }

    public final short getDUnit() {
        int d = getD();
        if ((-65536 & d) == 0) {
            return (short) d;
        }
        throw new DexException("Register D out of range: " + Hex.m910u8((long) d));
    }

    public int getE() {
        return 0;
    }

    public final short getENibble() {
        int e = getE();
        if ((e & -16) == 0) {
            return (short) e;
        }
        throw new DexException("Register E out of range: " + Hex.m910u8((long) e));
    }

    public final InstructionCodec getFormat() {
        return this.format;
    }

    public final int getIndex() {
        return this.index;
    }

    public final IndexType getIndexType() {
        return this.indexType;
    }

    public final short getIndexUnit() {
        return (short) this.index;
    }

    public final long getLiteral() {
        return this.literal;
    }

    public final int getLiteralByte() {
        long j = this.literal;
        if (j == ((long) ((byte) ((int) j)))) {
            return ((int) j) & 255;
        }
        throw new DexException("Literal out of range: " + Hex.m910u8(this.literal));
    }

    public final int getLiteralInt() {
        long j = this.literal;
        if (j == ((long) ((int) j))) {
            return (int) j;
        }
        throw new DexException("Literal out of range: " + Hex.m910u8(this.literal));
    }

    public final int getLiteralNibble() {
        long j = this.literal;
        if (j >= -8 && j <= 7) {
            return ((int) j) & 15;
        }
        throw new DexException("Literal out of range: " + Hex.m910u8(this.literal));
    }

    public final short getLiteralUnit() {
        long j = this.literal;
        if (j == ((long) ((short) ((int) j)))) {
            return (short) ((int) j);
        }
        throw new DexException("Literal out of range: " + Hex.m910u8(this.literal));
    }

    public final int getOpcode() {
        return this.opcode;
    }

    public final short getOpcodeUnit() {
        return (short) this.opcode;
    }

    public abstract int getRegisterCount();

    public final short getRegisterCountUnit() {
        int registerCount = getRegisterCount();
        if ((-65536 & registerCount) == 0) {
            return (short) registerCount;
        }
        throw new DexException("Register count out of range: " + Hex.m910u8((long) registerCount));
    }

    public final int getTarget() {
        return this.target;
    }

    public final int getTargetByte(int i) {
        int target2 = getTarget(i);
        if (target2 == ((byte) target2)) {
            return target2 & 255;
        }
        throw new DexException("Target out of range: " + Hex.m904s4(target2));
    }

    public final short getTargetUnit(int i) {
        int target2 = getTarget(i);
        short s = (short) target2;
        if (target2 == s) {
            return s;
        }
        throw new DexException("Target out of range: " + Hex.m904s4(target2));
    }

    public abstract DecodedInstruction withIndex(int i);

    public final int getTarget(int i) {
        return this.target - i;
    }
}
