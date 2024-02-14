package com.android.p023dx.p026io.instructions;

import androidx.core.view.InputDeviceCompat;
import com.android.dex.DexException;
import com.android.p023dx.p026io.IndexType;
import com.android.p023dx.p026io.OpcodeInfo;
import com.android.p023dx.util.Hex;
import java.io.EOFException;

/* renamed from: com.android.dx.io.instructions.InstructionCodec */
public enum InstructionCodec {
    FORMAT_00X {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, i, 0, (IndexType) null, 0, 0);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit());
        }
    },
    FORMAT_10X {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, (long) InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit());
        }
    },
    FORMAT_12X {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, 0, InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcodeUnit(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())));
        }
    },
    FORMAT_11N {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, (long) ((InstructionCodec.nibble3(i) << 28) >> 28), InstructionCodec.nibble2(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcodeUnit(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getLiteralNibble())));
        }
    },
    FORMAT_11X {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, 0, InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()));
        }
    },
    FORMAT_10T {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, (codeInput.cursor() - 1) + ((byte) InstructionCodec.byte1(i)), 0);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getTargetByte(codeOutput.cursor())));
        }
    },
    FORMAT_20T {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, (codeInput.cursor() - 1) + ((short) codeInput.read()), (long) InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit(), decodedInstruction.getTargetUnit(codeOutput.cursor()));
        }
    },
    FORMAT_20BC {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), codeInput.read(), IndexType.VARIES, 0, (long) InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getLiteralByte()), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_22X {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, 0, InstructionCodec.byte1(i), codeInput.read());
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getBUnit());
        }
    },
    FORMAT_21T {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, (codeInput.cursor() - 1) + ((short) codeInput.read()), 0, InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getTargetUnit(codeOutput.cursor()));
        }
    },
    FORMAT_21S {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, (long) ((short) codeInput.read()), InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getLiteralUnit());
        }
    },
    FORMAT_21H {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int access$100 = InstructionCodec.byte0(i);
            return new OneRegisterDecodedInstruction(this, access$100, 0, (IndexType) null, 0, ((long) ((short) codeInput.read())) << (access$100 == 21 ? 16 : '0'), InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int opcode = decodedInstruction.getOpcode();
            codeOutput.write(InstructionCodec.codeUnit(opcode, decodedInstruction.getA()), (short) ((int) (decodedInstruction.getLiteral() >> (opcode == 21 ? 16 : '0'))));
        }
    },
    FORMAT_21C {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int access$100 = InstructionCodec.byte0(i);
            return new OneRegisterDecodedInstruction(this, access$100, codeInput.read(), OpcodeInfo.getIndexType(access$100), 0, 0, InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_23X {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int access$100 = InstructionCodec.byte0(i);
            int access$200 = InstructionCodec.byte1(i);
            int read = codeInput.read();
            return new ThreeRegisterDecodedInstruction(this, access$100, 0, (IndexType) null, 0, 0, access$200, InstructionCodec.byte0(read), InstructionCodec.byte1(read));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.codeUnit(decodedInstruction.getB(), decodedInstruction.getC()));
        }
    },
    FORMAT_22B {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int access$100 = InstructionCodec.byte0(i);
            int access$200 = InstructionCodec.byte1(i);
            int read = codeInput.read();
            return new TwoRegisterDecodedInstruction(this, access$100, 0, (IndexType) null, 0, (long) ((byte) InstructionCodec.byte1(read)), access$200, InstructionCodec.byte0(read));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.codeUnit(decodedInstruction.getB(), decodedInstruction.getLiteralByte()));
        }
    },
    FORMAT_22T {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, (codeInput.cursor() - 1) + ((short) codeInput.read()), 0, InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getTargetUnit(codeOutput.cursor()));
        }
    },
    FORMAT_22S {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, (long) ((short) codeInput.read()), InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getLiteralUnit());
        }
    },
    FORMAT_22C {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int access$100 = InstructionCodec.byte0(i);
            return new TwoRegisterDecodedInstruction(this, access$100, codeInput.read(), OpcodeInfo.getIndexType(access$100), 0, 0, InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_22CS {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), codeInput.read(), IndexType.FIELD_OFFSET, 0, 0, InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_30T {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, (codeInput.cursor() - 1) + codeInput.readInt(), (long) InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int target = decodedInstruction.getTarget(codeOutput.cursor());
            codeOutput.write(decodedInstruction.getOpcodeUnit(), InstructionCodec.unit0(target), InstructionCodec.unit1(target));
        }
    },
    FORMAT_32X {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, (long) InstructionCodec.byte1(i), codeInput.read(), codeInput.read());
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit(), decodedInstruction.getAUnit(), decodedInstruction.getBUnit());
        }
    },
    FORMAT_31I {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, (long) codeInput.readInt(), InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int literalInt = decodedInstruction.getLiteralInt();
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(literalInt), InstructionCodec.unit1(literalInt));
        }
    },
    FORMAT_31T {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int cursor = codeInput.cursor() - 1;
            int access$100 = InstructionCodec.byte0(i);
            int access$200 = InstructionCodec.byte1(i);
            int readInt = cursor + codeInput.readInt();
            if (access$100 == 43 || access$100 == 44) {
                codeInput.setBaseAddress(readInt, cursor);
            }
            return new OneRegisterDecodedInstruction(this, access$100, 0, (IndexType) null, readInt, 0, access$200);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int target = decodedInstruction.getTarget(codeOutput.cursor());
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(target), InstructionCodec.unit1(target));
        }
    },
    FORMAT_31C {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int access$100 = InstructionCodec.byte0(i);
            return new OneRegisterDecodedInstruction(this, access$100, codeInput.readInt(), OpcodeInfo.getIndexType(access$100), 0, 0, InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int index = decodedInstruction.getIndex();
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(index), InstructionCodec.unit1(index));
        }
    },
    FORMAT_35C {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterList(this, i, codeInput);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterList(decodedInstruction, codeOutput);
        }
    },
    FORMAT_35MS {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterList(this, i, codeInput);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterList(decodedInstruction, codeOutput);
        }
    },
    FORMAT_35MI {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterList(this, i, codeInput);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterList(decodedInstruction, codeOutput);
        }
    },
    FORMAT_3RC {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterRange(this, i, codeInput);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterRange(decodedInstruction, codeOutput);
        }
    },
    FORMAT_3RMS {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterRange(this, i, codeInput);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterRange(decodedInstruction, codeOutput);
        }
    },
    FORMAT_3RMI {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterRange(this, i, codeInput);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterRange(decodedInstruction, codeOutput);
        }
    },
    FORMAT_51L {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, codeInput.readLong(), InstructionCodec.byte1(i));
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            long literal = decodedInstruction.getLiteral();
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(literal), InstructionCodec.unit1(literal), InstructionCodec.unit2(literal), InstructionCodec.unit3(literal));
        }
    },
    FORMAT_PACKED_SWITCH_PAYLOAD {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int baseAddressForCursor = codeInput.baseAddressForCursor() - 1;
            int read = codeInput.read();
            int readInt = codeInput.readInt();
            int[] iArr = new int[read];
            for (int i2 = 0; i2 < read; i2++) {
                iArr[i2] = codeInput.readInt() + baseAddressForCursor;
            }
            return new PackedSwitchPayloadDecodedInstruction(this, i, readInt, iArr);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            PackedSwitchPayloadDecodedInstruction packedSwitchPayloadDecodedInstruction = (PackedSwitchPayloadDecodedInstruction) decodedInstruction;
            int[] targets = packedSwitchPayloadDecodedInstruction.getTargets();
            int baseAddressForCursor = codeOutput.baseAddressForCursor();
            codeOutput.write(packedSwitchPayloadDecodedInstruction.getOpcodeUnit());
            codeOutput.write(InstructionCodec.asUnsignedUnit(targets.length));
            codeOutput.writeInt(packedSwitchPayloadDecodedInstruction.getFirstKey());
            for (int i : targets) {
                codeOutput.writeInt(i - baseAddressForCursor);
            }
        }
    },
    FORMAT_SPARSE_SWITCH_PAYLOAD {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int baseAddressForCursor = codeInput.baseAddressForCursor() - 1;
            int read = codeInput.read();
            int[] iArr = new int[read];
            int[] iArr2 = new int[read];
            for (int i2 = 0; i2 < read; i2++) {
                iArr[i2] = codeInput.readInt();
            }
            for (int i3 = 0; i3 < read; i3++) {
                iArr2[i3] = codeInput.readInt() + baseAddressForCursor;
            }
            return new SparseSwitchPayloadDecodedInstruction(this, i, iArr, iArr2);
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            SparseSwitchPayloadDecodedInstruction sparseSwitchPayloadDecodedInstruction = (SparseSwitchPayloadDecodedInstruction) decodedInstruction;
            int[] keys = sparseSwitchPayloadDecodedInstruction.getKeys();
            int[] targets = sparseSwitchPayloadDecodedInstruction.getTargets();
            int baseAddressForCursor = codeOutput.baseAddressForCursor();
            codeOutput.write(sparseSwitchPayloadDecodedInstruction.getOpcodeUnit());
            codeOutput.write(InstructionCodec.asUnsignedUnit(targets.length));
            for (int writeInt : keys) {
                codeOutput.writeInt(writeInt);
            }
            for (int i : targets) {
                codeOutput.writeInt(i - baseAddressForCursor);
            }
        }
    },
    FORMAT_FILL_ARRAY_DATA_PAYLOAD {
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int read = codeInput.read();
            int readInt = codeInput.readInt();
            int i2 = 0;
            if (read == 1) {
                byte[] bArr = new byte[readInt];
                int i3 = 0;
                boolean z = true;
                while (i2 < readInt) {
                    if (z) {
                        i3 = codeInput.read();
                    }
                    bArr[i2] = (byte) (i3 & 255);
                    i3 >>= 8;
                    i2++;
                    z = !z;
                }
                return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i, bArr);
            } else if (read == 2) {
                short[] sArr = new short[readInt];
                while (i2 < readInt) {
                    sArr[i2] = (short) codeInput.read();
                    i2++;
                }
                return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i, sArr);
            } else if (read == 4) {
                int[] iArr = new int[readInt];
                while (i2 < readInt) {
                    iArr[i2] = codeInput.readInt();
                    i2++;
                }
                return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i, iArr);
            } else if (read == 8) {
                long[] jArr = new long[readInt];
                while (i2 < readInt) {
                    jArr[i2] = codeInput.readLong();
                    i2++;
                }
                return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i, jArr);
            } else {
                throw new DexException("bogus element_width: " + Hex.m907u2(read));
            }
        }

        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            FillArrayDataPayloadDecodedInstruction fillArrayDataPayloadDecodedInstruction = (FillArrayDataPayloadDecodedInstruction) decodedInstruction;
            short elementWidthUnit = fillArrayDataPayloadDecodedInstruction.getElementWidthUnit();
            Object data = fillArrayDataPayloadDecodedInstruction.getData();
            codeOutput.write(fillArrayDataPayloadDecodedInstruction.getOpcodeUnit());
            codeOutput.write(elementWidthUnit);
            codeOutput.writeInt(fillArrayDataPayloadDecodedInstruction.getSize());
            if (elementWidthUnit == 1) {
                codeOutput.write((byte[]) data);
            } else if (elementWidthUnit == 2) {
                codeOutput.write((short[]) data);
            } else if (elementWidthUnit == 4) {
                codeOutput.write((int[]) data);
            } else if (elementWidthUnit == 8) {
                codeOutput.write((long[]) data);
            } else {
                throw new DexException("bogus element_width: " + Hex.m907u2(elementWidthUnit));
            }
        }
    };

    /* access modifiers changed from: private */
    public static short asUnsignedUnit(int i) {
        if ((-65536 & i) == 0) {
            return (short) i;
        }
        throw new IllegalArgumentException("bogus unsigned code unit");
    }

    /* access modifiers changed from: private */
    public static int byte0(int i) {
        return i & 255;
    }

    /* access modifiers changed from: private */
    public static int byte1(int i) {
        return (i >> 8) & 255;
    }

    private static int byte2(int i) {
        return (i >> 16) & 255;
    }

    private static int byte3(int i) {
        return i >>> 24;
    }

    /* access modifiers changed from: private */
    public static short codeUnit(int i, int i2) {
        if ((i & InputDeviceCompat.SOURCE_ANY) != 0) {
            throw new IllegalArgumentException("bogus lowByte");
        } else if ((i2 & InputDeviceCompat.SOURCE_ANY) == 0) {
            return (short) (i | (i2 << 8));
        } else {
            throw new IllegalArgumentException("bogus highByte");
        }
    }

    /* access modifiers changed from: private */
    public static DecodedInstruction decodeRegisterList(InstructionCodec instructionCodec, int i, CodeInput codeInput) throws EOFException {
        int byte0 = byte0(i);
        int nibble2 = nibble2(i);
        int nibble3 = nibble3(i);
        int read = codeInput.read();
        int read2 = codeInput.read();
        int nibble0 = nibble0(read2);
        int nibble1 = nibble1(read2);
        int nibble22 = nibble2(read2);
        int nibble32 = nibble3(read2);
        IndexType indexType = OpcodeInfo.getIndexType(byte0);
        if (nibble3 == 0) {
            return new ZeroRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0);
        }
        if (nibble3 == 1) {
            return new OneRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0, nibble0);
        }
        if (nibble3 == 2) {
            return new TwoRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0, nibble0, nibble1);
        }
        if (nibble3 == 3) {
            return new ThreeRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0, nibble0, nibble1, nibble22);
        }
        if (nibble3 == 4) {
            return new FourRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0, nibble0, nibble1, nibble22, nibble32);
        }
        if (nibble3 == 5) {
            return new FiveRegisterDecodedInstruction(instructionCodec, byte0, read, indexType, 0, 0, nibble0, nibble1, nibble22, nibble32, nibble2);
        }
        throw new DexException("bogus registerCount: " + Hex.uNibble(nibble3));
    }

    /* access modifiers changed from: private */
    public static DecodedInstruction decodeRegisterRange(InstructionCodec instructionCodec, int i, CodeInput codeInput) throws EOFException {
        int byte0 = byte0(i);
        int byte1 = byte1(i);
        return new RegisterRangeDecodedInstruction(instructionCodec, byte0, codeInput.read(), OpcodeInfo.getIndexType(byte0), 0, 0, codeInput.read(), byte1);
    }

    /* access modifiers changed from: private */
    public static void encodeRegisterList(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
        codeOutput.write(codeUnit(decodedInstruction.getOpcode(), makeByte(decodedInstruction.getE(), decodedInstruction.getRegisterCount())), decodedInstruction.getIndexUnit(), codeUnit(decodedInstruction.getA(), decodedInstruction.getB(), decodedInstruction.getC(), decodedInstruction.getD()));
    }

    /* access modifiers changed from: private */
    public static void encodeRegisterRange(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
        codeOutput.write(codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getRegisterCount()), decodedInstruction.getIndexUnit(), decodedInstruction.getAUnit());
    }

    /* access modifiers changed from: private */
    public static int makeByte(int i, int i2) {
        if ((i & -16) != 0) {
            throw new IllegalArgumentException("bogus lowNibble");
        } else if ((i2 & -16) == 0) {
            return i | (i2 << 4);
        } else {
            throw new IllegalArgumentException("bogus highNibble");
        }
    }

    private static int nibble0(int i) {
        return i & 15;
    }

    private static int nibble1(int i) {
        return (i >> 4) & 15;
    }

    /* access modifiers changed from: private */
    public static int nibble2(int i) {
        return (i >> 8) & 15;
    }

    /* access modifiers changed from: private */
    public static int nibble3(int i) {
        return (i >> 12) & 15;
    }

    /* access modifiers changed from: private */
    public static short unit0(int i) {
        return (short) i;
    }

    /* access modifiers changed from: private */
    public static short unit0(long j) {
        return (short) ((int) j);
    }

    /* access modifiers changed from: private */
    public static short unit1(int i) {
        return (short) (i >> 16);
    }

    /* access modifiers changed from: private */
    public static short unit1(long j) {
        return (short) ((int) (j >> 16));
    }

    /* access modifiers changed from: private */
    public static short unit2(long j) {
        return (short) ((int) (j >> 32));
    }

    /* access modifiers changed from: private */
    public static short unit3(long j) {
        return (short) ((int) (j >> 48));
    }

    public abstract DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException;

    public abstract void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput);

    private static short codeUnit(int i, int i2, int i3, int i4) {
        if ((i & -16) != 0) {
            throw new IllegalArgumentException("bogus nibble0");
        } else if ((i2 & -16) != 0) {
            throw new IllegalArgumentException("bogus nibble1");
        } else if ((i3 & -16) != 0) {
            throw new IllegalArgumentException("bogus nibble2");
        } else if ((i4 & -16) == 0) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        } else {
            throw new IllegalArgumentException("bogus nibble3");
        }
    }
}
